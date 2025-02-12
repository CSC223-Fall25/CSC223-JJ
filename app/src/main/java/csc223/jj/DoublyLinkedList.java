package csc223.jj;

public class DoublyLinkedList extends SinglyLinkedList {

    public DoublyLinkedList() {
        super(); }

    
  //insert dor doubly
  public void insert(char item) {
      super.insert(item); 

      if (head!= null){
          Node curr = head;
          while(curr.next != null) { 
              curr = curr.next; }
  

          if (curr!= head) {
              curr.previous = head;

              Node curr2 = head;
              while(curr2.next != curr) {
                  curr2 = curr2.next;
              }curr.previous = curr2;
          }}}
  
  


    //remove for doubly
    public void remove(char item) {
        super.remove(item);
    
        if (head ==null) return;
    
        Node curr =head;
    
        while (curr != null) {
            if(curr.next != null){
                curr.next.previous = curr;}
            curr = curr.next;}}
    
    

//reverse for doubly
public void reverse(){
    super.reverse();

    if(head != null){
        Node curr = head;
        while(curr.next != null){
            curr.next.previous = curr;
            curr = curr.next;}}}
        }

