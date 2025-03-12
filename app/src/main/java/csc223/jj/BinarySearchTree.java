package csc223.jj;

public class BinarySearchTree {
    BSTNode root;


    public BinarySearchTree() {
        this.root = null; }



    public void insert(int x) {
        root = insert(root, x); }

    private BSTNode insert(BSTNode root, int x) {
        if (root == null) {
            root = new BSTNode(x);
            return root; }
            
        if (x < root.x) {
            root.left = insert(root.left, x); }
        else if (x> root.x) {
            root.right = insert(root.right, x); }
        return root; }



    ///fidmin for delete with 2 children
    public int findmin(){
        return findmin(root); }

    private int findmin(BSTNode node){
        if(node.left == null){
            return node.x; }
        return findmin(node.left); }


        
    public void delete(int x){
        root = delete(root, x); }

    private BSTNode delete(BSTNode root, int x){
        if (root == null) {
            return root; }

        if (x< root.x) {
            root.left = delete(root.left, x);}
        else if (x >root.x) {
            root.right = delete(root.right, x);}

        else{
            ////case 1 (no child) and case 2 (1 child) with no chlid or just right child
            if (root.left == null){
            return root.right;}


            //////case 2 only left chlid
            else if (root.right== null){
                return root.left;}

            //////case 3 (2 children)
            root.x = findmin(root.right);
            root.right = delete(root.right, root.x); }
        return root; }


        public boolean search(int x){
            return search(root, x); }

        private boolean search(BSTNode root, int x){
            if (root == null){
                return false; }

            if (root.x == x){
                return true; }

            if (root.x < x){
                return search(root.right, x); }

            return search(root.left, x); }



        public void update(int old, int updated){
            if(search(old)){
                delete(old);
                insert(updated); }
            else{
                System.out.println( old + " is not in the tree."); }
          }
         


        public String inorder(){
            return inorder(root); }

        private String inorder(BSTNode root){
            if (root == null){
                return ""; }
            else{
                return inorder(root.left) + root.x+ inorder(root.right); }
    }


    public void sortedArrayToBST(int[] values){
        root = sortedArrayToBST(values,0,values.length-1); }

    private BSTNode sortedArrayToBST(int[] values, int left, int right){
        if(left>right){
            return null; }

        int mid = (left + right)/2;
        BSTNode root2 = new BSTNode(values[mid]);

        root2.left = sortedArrayToBST(values, left, mid-1);
        root2.right = sortedArrayToBST(values, mid+1, right);

        return root2; }

        
    

        public int lowestCommonAncestor(int p, int q) {
            BSTNode node = lowestCommonAncestor(root, p, q);
            return node.x; }
    
        private BSTNode lowestCommonAncestor(BSTNode root, int p, int q) {

            if(root == null) {
                return null; }
    
            if(root.x > p && root.x > q) {
                return lowestCommonAncestor(root.left, p, q); } 
                
                else if(root.x < p && root.x < q) {
                return lowestCommonAncestor(root.right, p, q);}

                 else { return root;
                } } 
    

    
    
    }
    