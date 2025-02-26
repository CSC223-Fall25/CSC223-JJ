package csc223.jj;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortedLinkedListTest {

    @Test public void sorted_insert_test1() {
        SortedLinkedList array = new SortedLinkedList();
        array.insert('C');
        array.insert('A');
        array.insert('B');

        assertEquals('A', array.getFirst());
        assertEquals('C', array.getLast());

        assertEquals('A', array.head.next.previous.data);
        assertEquals('B', array.head.next.next.previous.data);
    }

    @Test public void sorted_insert_test2() {
        SortedLinkedList array = new SortedLinkedList();
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

    @Test public void sorted_insert_test3() {
        SortedLinkedList array = new SortedLinkedList();
        array.insert('A');
        array.insert('C');
        array.insert('B');
        array.insert('B');

        assertEquals('A', array.getFirst());
        assertEquals('C', array.getLast());

        assertEquals('A', array.head.next.previous.data);
        assertEquals('B', array.head.next.next.previous.data);
        assertEquals('B', array.head.next.next.next.previous.data);
    }

    @Test public void sorted_insert_test4() {
        SortedLinkedList array = new SortedLinkedList();
        array.insert('F');

        assertEquals('F', array.getFirst());
        assertEquals('F', array.getLast());

        assertNull(array.head.previous);
        assertNull(array.head.next);
    }}
