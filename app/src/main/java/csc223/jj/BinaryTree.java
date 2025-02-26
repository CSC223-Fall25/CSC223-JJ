package csc223.jj;
public class BinaryTree implements Tree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }


     /** Get the level order traversal of the tree
         *
         * For example, the level order traversal of the following tree:
         *
         *    A
         *   / \
         *  B   C
         *
         * is "ABC"
         */
        public String levelorder(){
            if (root == null){
                return "";}

            char[] arr= new char[85];
            int i = 0;

            TreeNodeQueue que = new TreeNodeQueue();
            que.enqueue(root);

            while(!que.isEmpty()){
                TreeNode curr = que.dequeue();
                arr[i++]= curr.data;

                if (curr.left != null){
                    que.enqueue(curr.left);}
                
                if (curr.right != null){
                    que.enqueue(curr.right);}}
                
                return new String(arr, 0, i);}


         /** Get the preorder traversal of the tree: root -> left -> right
         *
         * For example, the preorder traversal of the following tree:
         *
         *     A
         *    / \
         *  B   C
         * / \
         * D E
         *
         * is "ABDEC"

         */
        public String preorder(){
            return preorder(root);}
        
        private String preorder(TreeNode curr){
            if (curr ==null){return "";}

            String leftSub = preorder(curr.left);
    String rightSub = preorder(curr.right);

    return curr.data + leftSub + rightSub;}


     /** Get the inorder traversal of the tree: left -> root -> right
         *
         * For example, the inorder traversal of the following tree:
         *
         *        A
         *       / \
         *      B   C
         *     / \
         *    D   E
         *
         * is "DBEAC"
         */
        public String inorder(){
            return inorder(root);}

        private String inorder(TreeNode curr){
            if (curr ==null){return "";}
            return inorder(curr.left) + curr.data + inorder(curr.right);}

        
          /**
         * Get the postorder traversal of the tree:
         *  left -> right -> root
         *
         * For example, the postorder traversal of the following tree:
         *
         *      A
         *     / \
         *   B   C
         *  / \
         *  D E
         *
         * is "DEBCA"
         */
        public String postorder(){
            return postorder(root);}

        private String postorder(TreeNode curr){
            if (curr ==null){return "";}
            return postorder(curr.left) + postorder(curr.right) + curr.data;}


             /**
         * Insert an item into the tree,
         * using level order traversal to find the correct position
         * If the tree is empty, insert the item at the root node.
         */
        public void insert(char item){
            TreeNode node2 =new TreeNode(item);
            if (root == null) {
            root = node2;
                return;}
    
    
        TreeNodeQueue que = new TreeNodeQueue();
        que.enqueue(root);
    
        while  (!que.isEmpty()){
            TreeNode curr = que.dequeue();
    

            if (curr.left == null) {
                curr.left = node2;
                return;} else {
                 que.enqueue(curr.left);} 

                 
            if (curr.right == null) {
                curr.right = node2;
                return;} else {
                que.enqueue(curr.right);}
    
      }
    
 }

     // Check if the tree contains an item
    public boolean search(char item){
        if (root == null){
            return false;}

        TreeNodeQueue que = new TreeNodeQueue();
        que.enqueue(root);

        while(!que.isEmpty()){
            TreeNode curr = que.dequeue();

            if (curr.data == item){
            return true;}

            if (curr.left!= null){
            que.enqueue(curr.left);}

            if (curr.right!= null){
            que.enqueue(curr.right);}}
            return false;}


        
        // Get the number of nodes in the tree
        public int size(){
        return size(root);}

        private int size(TreeNode curr){
            if (curr == null){return 0;}
            return size(curr.left) + size(curr.right) + 1;}


        // Check if the tree is empty
        public boolean isEmpty(){
        return root == null;}


        // Get the height of the tree (number of nodes along the longest path from the root node down to the farthest leaf node)
        public int height(){
        return height(root);}


        private int height(TreeNode curr){
            if (curr ==null){
                return -1;}

            int lh = height(curr.left);
            int rh = height(curr.right);
        
        return Math.max(lh, rh) + 1;}
            

            public static void main(String[] args) {
                BinaryTree tree = new BinaryTree();
tree.insert('P');
tree.insert('Q');
tree.insert('R');
tree.insert('S');
tree.insert('T');

System.out.println("Preorder: " + tree.preorder());

            }
        }            

            










