package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SinglyLinkedListTest {


//insert
    @Test public void insert_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(1, array.size());
        assertEquals('J', array.getFirst());
    }
    
        @Test public void insert_test2() {
            SinglyLinkedList array = new SinglyLinkedList();
            array.insert('J');
            array.insert('O');
            array.insert('V');
            assertEquals('J', array.getFirst());
             assertEquals('V', array.getLast()); 
                assertEquals(3, array.size());}




         //remove
    @Test public void remove_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('V');
        array.remove('V');
        assertEquals(0, array.size());
        assertEquals('☠', array.getFirst());}



    @Test public void remove_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        array.insert('V');
        array.remove('I');
        assertEquals(3, array.size());
        assertEquals('J', array.getFirst());
        assertEquals('V', array.getLast());}





        //getfirst
    @Test public void getFirst_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals('J', array.getFirst());}

    @Test public void getFirst_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        assertEquals('☠', array.getFirst());}





        //getlast
    @Test public void getLast_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals('J', array.getLast());}


    @Test public void getLast_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        array.insert('V');
        assertEquals('V', array.getLast());}



        //size
    @Test public void size_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(1, array.size());}

        @Test public void size_test2() {
            SinglyLinkedList array = new SinglyLinkedList();
            array.insert('J');
            array.insert('O');
            array.insert('V');
            assertEquals(3, array.size());}



        //get
    @Test public void get_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        assertEquals('O', array.get(1));}

    @Test public void get_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        assertEquals('☠', array.get(2));}



        //isEmpty
    @Test public void isEmpty_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        assertEquals(true, array.isEmpty());}

    @Test public void isEmpty_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(false, array.isEmpty());}



        //clear
    @Test public void clear_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.clear();
        assertEquals(0, array.size());
        assertEquals('☠', array.getFirst());}



        //contains
    @Test public void contains_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(true, array.contains('J'));}

    @Test public void contains_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(false, array.contains('O'));}



        //indexOf
    @Test public void indexOf_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(0, array.indexOf('J'));}

    @Test public void indexOf_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(-1, array.indexOf('O'));}



        //lastIndexOf
    @Test public void lastIndexOf_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(0, array.lastIndexOf('J'));}

    @Test public void lastIndexOf_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        assertEquals(-1, array.lastIndexOf('O'));}



        //reverse

    @Test public void reverse_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        array.insert('V');
        array.reverse();
        assertEquals('V', array.get(0));
        assertEquals('O', array.get(1));
        assertEquals('J', array.get(2));}



    @Test public void reverse_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        array.insert('V');
        array.insert('I');
        array.insert('D');
        array.reverse();
        assertEquals('D', array.get(0));
        assertEquals('I', array.get(1));}



        //toString
    @Test public void toString_test1() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        array.insert('V');
        assertEquals("JOV", array.toString());}


    
    @Test public void toString_test2() {
        SinglyLinkedList array = new SinglyLinkedList();
        array.insert('J');
        array.insert('O');
        array.insert('V');
        array.insert('I');
        array.insert('D');
        assertEquals("JOVID", array.toString());}



            
            
            }
