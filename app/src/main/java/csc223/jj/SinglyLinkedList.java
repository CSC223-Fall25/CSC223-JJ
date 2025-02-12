package csc223.jj;

public class SinglyLinkedList implements LinkedList {
    protected Node head;
    protected int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // Insert an item at the end of the list for unsorted lists
    public void insert(char item) {
        Node node2 =new Node(item);
        if (head==null) {
            head = node2;}
        else {
            Node curr = head;
            while (curr.next !=null) {
                curr = curr.next; }
            curr.next =node2; }
        size++;

        }

        // Removes an item from the list
    public void remove(char item) {
        if (head == null) {return; }

        if (head.data == item) {
            head = head.next;
            size--;return; }

        Node curr = head;
        while (curr.next!= null && curr.next. data != item) {
            curr = curr.next;}
            
            if (curr.next !=null) {
                curr.next = curr.next.next;
                size--; }}

     // Get the first item, return '☠' if the list is empty
     public char getFirst() {
         if (head == null) {
             return '☠'; }
         else{ return head.data;}
     }


     // Get the last item, return '☠' if the list is empty
     public char getLast() {
            if (head ==null) {
                return '☠'; }
            else { Node curr = head;
                while (curr.next != null) {
                    curr= curr.next; }
                return curr.data; }}

 
     // Get an item at a specific index, return '☠' if index is out of bounds
   public char get(int index) {
    if (index<0){ return '☠';}
    if (index>=size){ return '☠';}
    Node curr = head;
    int count =0;
    while (count< index){
        curr = curr.next;
        count++;}
    return curr.data;

   }

   // Get the size of the list
    public int size() {
        return size;}

 
     // Check if the list is empty
     public boolean isEmpty() {
         return size == 0; }
 
     // Clear the list
     public void clear() {
         head = null; size = 0; }
 
     // Check if the list contains an item
     public boolean contains(char item) {
        Node curr= head;
        while (curr != null) {
            if (curr.data ==item) {return true; }
            curr = curr.next; }
            return false; }
    
 
     // Get the index of an item, if it exists else return -1
     public int indexOf(char item) {
        Node curr = head;
        int i = 0;

        while (curr != null) {
        if (curr.data ==item) { return i; }
            curr = curr.next;
            i++; }
        return -1; }

 
     // Get the last index of an item, if it exists else return -1
     public int lastIndexOf(char item) {
        int i = -1;
        int j = 0;
        Node curr = head;

        while(curr != null) {
            if (curr.data ==item) {
            i = j; }
            curr = curr.next;
            j++;} 
        return i; }
 
     // Reverse the list
            public void reverse() {
            Node prev = null;
            Node curr = head;
            Node next = null;
            while (curr != null) {next = curr.next;
             curr.next = prev; prev = curr;
                curr = next; }
                head =prev; }

 
     // Creates and returns a String representation of the list
     // e.g. `A -> B -> C -> D` should return "ABCD"
        public String toString() {
            String result = "";
            Node curr =head;
            while(curr != null) {
                result = result + curr.data;
                curr = curr.next; }
            return  result; }
  
}
 



