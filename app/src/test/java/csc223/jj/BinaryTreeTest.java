package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void insert_testing() {
        BinaryTree tree = new BinaryTree();
        
        tree.insert('A');
        assertFalse(tree.isEmpty());
        assertEquals(1, tree.size());
    
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        tree.insert('F');
        tree.insert('G');
        tree.insert('H');
        tree.insert('I');
        tree.insert('J');
        tree.insert('K');  
    
        assertEquals(11, tree.size());
    
        assertEquals("ABCDEFGHIJK", tree.levelorder());}


    @Test
public void levelorder_testing() {
    BinaryTree tree = new BinaryTree();
    tree.insert('M');
    tree.insert('A');
    tree.insert('X');
    tree.insert('B');
    tree.insert('Y');
    tree.insert('Z');
    tree.insert('C');

    assertEquals("MAXBYZC", tree.levelorder());
}


@Test
public void preorder_testing() {
    BinaryTree tree = new BinaryTree();
    tree.insert('A');
    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    tree.insert('E');

    assertEquals("ABDEC", tree.preorder());
}


@Test
public void inorder_testing() {
    BinaryTree tree = new BinaryTree();
    tree.insert('A');
    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    tree.insert('E');

    assertEquals("DBEAC", tree.inorder());
}


@Test
public void postorder_testing() {
    BinaryTree tree = new BinaryTree();
    tree.insert('A');
    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    tree.insert('E');

    assertEquals("DEBCA", tree.postorder());
}


@Test
public void search_testing() {
    BinaryTree tree = new BinaryTree();
    tree.insert('A');
    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    tree.insert('E');

    assertTrue(tree.search('A')); 
    assertTrue(tree.search('C')); 
    assertFalse(tree.search('Z')); }

@Test
public void size_testing() {
    BinaryTree tree = new BinaryTree();
    assertEquals(0, tree.size()); 

    tree.insert('A');
    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    assertEquals(4, tree.size()); }



@Test
public void empty_testing() {
    BinaryTree tree = new BinaryTree();
    assertTrue(tree.isEmpty());

    tree.insert('A');
    assertFalse(tree.isEmpty());
}


@Test
public void height_testing() {
    BinaryTree tree = new BinaryTree();
    assertEquals(-1, tree.height()); 

    tree.insert('A');
    assertEquals(0, tree.height()); 

    tree.insert('B');
    tree.insert('C');
    tree.insert('D');
    tree.insert('E');

    assertEquals(2, tree.height());}





}    