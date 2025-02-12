package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Node_Test {
    
    @Test public void test_1() {
        Node node = new Node('A');
        assertEquals('A', node.data); }

    @Test public void test_2() {
        Node node =new Node('A');
        assertEquals(null, node.next);}

    @Test public void test_3() {
        Node node = new Node('A');
        assertEquals(null, node.previous);
    }

    @Test public void test_4() {
        Node node = new Node('A');
        node.data ='B';
        assertEquals('B', node.data);}}
