package csc223.jj;
public class TreeNodeQueue {
    TreeNode[] data;
    int start;
    int end;
    int capacity;

    public TreeNodeQueue(){
        this.capacity =10;
        this.data = new TreeNode[this.capacity];
        this.start = 0;
        this.end = 0;}

    public boolean isEmpty() {
        return end == 0;}

    public void enqueue(TreeNode item) {
            if (end < capacity) {
                data[end] = item;
                end++;  } 
            
            else {this.capacity += 10;
                TreeNode[] new_data = new TreeNode[this.capacity];
            
            for (int i = 0; i < end; i++) {
                    new_data[i] = data[i];}
            
                data = new_data;
                data[end] = item;
                end++;}}


     //dequeue
     public TreeNode dequeue() {
        if (isEmpty()) {
            System.out.println("EMPTY!!");
            return null;} 
            
        else {TreeNode item = data[start];

         for (int i = 0; i < end - 1; i++) {
         data[i] = data[i + 1];}
            end--;
            return item;  } }


 public static void main(String[] args) {
    TreeNodeQueue queue2 = new TreeNodeQueue();
    queue2.enqueue(new TreeNode('J'));
    queue2.enqueue(new TreeNode('O'));
    queue2.enqueue(new TreeNode('V'));
    queue2.enqueue(new TreeNode('I'));
    queue2.enqueue(new TreeNode('D'));


    System.out.println(queue2.dequeue().data); 
    System.out.println(queue2.isEmpty());
 }
}
