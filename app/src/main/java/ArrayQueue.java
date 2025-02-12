public class ArrayQueue implements Queue {
    int[] data;
    int start;
    int end;
    int capacity;

    //is empty
    public boolean isEmpty() {
        return end == 0;}


    public ArrayQueue() {
        this.capacity = 10;
        this.data = new int[this.capacity];
        this.start = 0;
        this.end = 0; }


    //enqueue
    public void enqueue(int item) {
        if (end < capacity) {
            data[end] = item;
            end++;   } 
        
        else {this.capacity += 10;
            int[] new_data = new int[this.capacity];

        for (int i = 0; i < end; i++) {
                new_data[i] = data[i];}

            data = new_data;
            data[end] = item;
            end++;}}



    //dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("EMPTY!!");
            return -1;} 
            
        else {int item = data[start];

         for (int i = 0; i < end - 1; i++) {
         data[i] = data[i + 1];}
            end--;
            return item;  } }



    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("EMPTY!!");
            return -1; }
        return data[start]; }


    //size
    public int size() {
        return end;}



    public static void main(String[] args) {
        ArrayQueue queue2 = new ArrayQueue();
        queue2.enqueue(0);
        queue2.enqueue(2);
        queue2.enqueue(7);
        queue2.enqueue(9);
        queue2.enqueue(10);
        queue2.enqueue(12);
        queue2.enqueue(15);
        


        System.out.println(queue2.dequeue()); 
        System.out.println(queue2.peek());   
        System.out.println(queue2.size());    
    }
}