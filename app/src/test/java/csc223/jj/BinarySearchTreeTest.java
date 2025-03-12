package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test public void insert1() {
        BSTNode bst = new BSTNode(5);  
        assertEquals(5, bst.x);
    }


    @Test public void insert2() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(5);
    bst.insert(18);
    bst.insert(2);
    bst.insert(6);
    bst.insert(12);
    bst.insert(24);

    assertEquals("25610121824", bst.inorder()); 
}

@Test public void insert3() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(10); 
    bst.insert(5);
    bst.insert(15);
    bst.insert(5); 
    

    assertEquals("51015", bst.inorder());
}

@Test public void findmin1(){
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(2);
    bst.insert(6);

    assertEquals(2, bst.findmin());
}

@Test public void findmin2(){
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(15);
    bst.insert(13);
    bst.insert(25);
    bst.insert(6);
    bst.insert(54);

    assertEquals(6, bst.findmin());

}


@Test public void delete1() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(2); ////my leafnode
    bst.insert(7);

    bst.delete(2);
    assertEquals("571015", bst.inorder());  
}


@Test public void delete2() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);   /////this has 1 chid
    bst.insert(3);   ////this has 2

    bst.delete(4);
    assertEquals("351015", bst.inorder());  
}

@Test public void delete3() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15); ////this has 2 
    bst.insert(12);  
    bst.insert(17);

    bst.delete(15); 
    assertEquals("5101217", bst.inorder()); 
}


@Test public void delete4() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(12);
    bst.insert(3);
    bst.insert(18);

    bst.delete(20); ////not there
    assertEquals("31218", bst.inorder()); 
}

@Test public void search1() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(7); 

    assertTrue(bst.search(7)); 
    assertFalse(bst.search(34));
    assertTrue(bst.search(15));
    assertFalse(bst.search(2));
}


@Test public void update1() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(12);
    bst.insert(5);
    bst.insert(24);

    bst.update(5, 7); 
    assertEquals("71224", bst.inorder());  
}

@Test public void update2() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(12);
    bst.insert(5);
    bst.insert(24);

    bst.update(20, 30); 
    assertEquals("51224", bst.inorder()); 
}

@Test public void update3() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(20);
    bst.insert(10);
    bst.insert(30);

    bst.update(10, 25);  
    assertEquals("202530", bst.inorder()); 
}

//////no need for test cases for inorder because I used it in asserting others above and below also

    @Test public void sortedtobst1() {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {-10, -3, 0, 5, 9};

        bst.sortedArrayToBST(nums);

        assertTrue(bst.inorder().equals("-10-3059")|| 
        bst.inorder().equals("-10-395"));
     }


    @Test public void sortedtobst2() {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {1, 3};
    
        bst.sortedArrayToBST(nums);
    
        assertTrue( bst.inorder().equals("13") ||  /////[1, null, 3]
        bst.inorder().equals("13") );    /////[3, 1]

     }


@Test public void lca1() {
    BinarySearchTree bst = new BinarySearchTree();
    
    bst.insert(6);
    bst.insert(2);
    bst.insert(8);
    bst.insert(0);
    bst.insert(4);
    bst.insert(7);
    bst.insert(9);
    bst.insert(3);
    bst.insert(5);

    assertEquals(6, bst.lowestCommonAncestor(2, 8));
    assertEquals(2, bst.lowestCommonAncestor(2, 4));
    assertEquals(4, bst.lowestCommonAncestor(3, 5));
}
        
}



