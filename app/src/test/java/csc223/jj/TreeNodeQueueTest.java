package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TreeNodeQueueTest {
    @Test public void enqueue_testing(){
        TreeNodeQueue queue = new TreeNodeQueue();
        queue.enqueue(new TreeNode('A'));
        queue.enqueue(new TreeNode('B'));
        queue.enqueue(new TreeNode('C'));
        queue.enqueue(new TreeNode('D'));
        queue.enqueue(new TreeNode('E'));
        assertEquals(5, queue.end);
        assertFalse(queue.isEmpty());

    }


    @Test public void dequeue_testing(){
        TreeNodeQueue queue = new TreeNodeQueue();
        queue.enqueue(new TreeNode('A'));
        queue.enqueue(new TreeNode('B'));
        assertEquals(2, queue.end);
        assertFalse(queue.isEmpty());
        assertEquals('A', queue.dequeue().data);
        assertEquals(1, queue.end);
        assertFalse(queue.isEmpty());
        assertEquals('B', queue.dequeue().data);
        assertEquals(0, queue.end);
        assertTrue(queue.isEmpty());
    }
}

