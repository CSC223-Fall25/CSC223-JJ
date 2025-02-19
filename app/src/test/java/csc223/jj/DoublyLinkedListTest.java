package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {


    //insert
    @Test public void insert_test1() {
        DoublyLinkedList array = new DoublyLinkedList();
        array.insert('A');
        array.insert('B');
        array.insert('C');

        assertEquals('A', array.getFirst());
        assertEquals('C', array.getLast());

        assertEquals('A', array.head.next.previous.data);
        assertEquals('B', array.head.next.next.previous.data);}



        @Test public void insert_test2() {
            DoublyLinkedList array = new DoublyLinkedList();
            array.insert('A');
            array.insert('B');
            array.insert('C');
            array.insert('D');
        
            assertEquals('A', array.getFirst());
            assertEquals('D', array.getLast()); 
        
            assertEquals('A', array.head.next.previous.data);
            assertEquals('B', array.head.next.next.previous.data);
            assertEquals('C', array.head.next.next.next.previous.data);
        }
        


        //remove

        @Test public void remove_test1() {
            DoublyLinkedList array = new DoublyLinkedList();
            array.insert('A');
            array.insert('B');
            array.insert('C');
             array.remove('B');
        
            assertEquals('A', array.getFirst());
            assertEquals('C', array.getLast());
        
            assertEquals('A', array.head.next.previous.data); }
        
        @Test public void remove_test2() {
            DoublyLinkedList array = new DoublyLinkedList();
            array.insert('A');
            array.insert('B');
            array.insert('C');
            array.insert('D');
        
            array.remove('C');
        
            assertEquals('A', array.getFirst());
            assertEquals('D', array.getLast());
        
            assertEquals('A', array.head.next.previous.data);
            assertEquals('B', array.head.next.next.previous.data);}
        



        //reverse

        @Test public void reverse_test1() {
            DoublyLinkedList array = new DoublyLinkedList();
            array.insert('A');
            array.insert('B');
            array.insert('C');
             array.reverse();
        
            assertEquals('C', array.getFirst());
            assertEquals('A', array.getLast());
        
            assertEquals('C', array.head.next.previous.data);
            assertEquals('B', array.head.next.next.previous.data);
        }
        
        @Test public void reverse_test2() {
            DoublyLinkedList array = new DoublyLinkedList();
            array.insert('A');
            array.insert('B');
            array.insert('C');
            array.insert('D');
             array.reverse();
        
            assertEquals('D', array.getFirst());
            assertEquals('A', array.getLast());
        
            assertEquals('D', array.head.next.previous.data);
            assertEquals('C', array.head.next.next.previous.data);
            assertEquals('B', array.head.next.next.next.previous.data);}}
        