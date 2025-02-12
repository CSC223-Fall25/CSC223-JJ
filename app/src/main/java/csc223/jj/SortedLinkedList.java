package csc223.jj;

public class SortedLinkedList extends DoublyLinkedList {

    public SortedLinkedList(){
        super();}

        //inser for sorted
        public void insert(char item) {
            if (head ==null) {
                super.insert(item);
                return;}
        
            if(head.data >=item){
                Node node2 = new Node(item);
                node2.next = head;
                head.previous = node2;
                head =node2;
                size++;
                return;}

            Node curr = head;
            while(curr.next != null && curr.next.data <item) {
                curr = curr.next;}

        
            Node node3 = new Node(item);
            node3.next = curr.next;
            node3.previous = curr;
            curr.next = node3;
            
            if(node3.next!= null){
                node3.next.previous = node3;
            }size++;
         }}        