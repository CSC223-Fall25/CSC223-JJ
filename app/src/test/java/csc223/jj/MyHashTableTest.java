package csc223.jj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyHashTableTest {
    
    // put
    @Test public void put_test() {
    MyHashTable t = new MyHashTable();
        
        t.put("london",10);
          assertEquals(10,t.get("london"));

        t.put("instagram",20);
        assertEquals(20, t.get("instagram"));
        
        t.put("london",30);
        assertEquals(30, t.get("london"));
        
        t.put("",40); 
         assertEquals(40,t.get(""));

        t.put("cc",50);
        assertEquals(50,t.get("cc"));

        t.put("dD",60);
        assertEquals(60,t.get("dD"));
    }

    // get
    @Test public void get_test() {
        MyHashTable t =new MyHashTable();
        t.put("grape",50);
        assertEquals(50,t.get("grape"));

        t.put("messi",70); assertEquals(70, t.get("messi"));
        
        assertNull(t.get("notInsertedKey"));
        
        t.put("",90);
            assertEquals(90,t.get(""));

        t.put("J", 100); assertEquals(100, t.get("J"));

        t.put("jovid1",200);
        t.put("jovid2",300); assertEquals(200,t.get("jovid1"));
    }
    
    // remove
    @Test public void remove_test() {
    MyHashTable t = new MyHashTable();
        
        t.put("cherry",60);
        t.put("peach",55);
        t.put("apple",65);
        
        t.remove("cherry");
       assertNull(t.get("cherry"));
        
        t.remove("peach");
          assertNull(t.get("peach"));

        t.remove("apple");assertNull(t.get("apple"));
        
        t.put("korea",70);
          t.remove("nonexistent"); 
         assertEquals(70,t.get("korea"));
        
        t.remove("Barca");
       assertNull(t.get("Barca"));

        t.put("",123);t.remove("");
        assertNull(t.get(""));
    }
    
    // containsKey
    @Test public void containsKey_test() {
    MyHashTable t= new MyHashTable();
        
        t.put("madrid",5);
          assertTrue(t.containsKey("madrid"));
        
        t.put("dirdam",10);
        assertTrue(t.containsKey("dirdam"));
        
        assertFalse(t.containsKey("grape"));

        t.remove("people"); 
        assertFalse(t.containsKey("people"));

        t.put("",1); 
         assertTrue(t.containsKey(""));
        
        t.remove("");
        assertFalse(t.containsKey(""));
    }

    // size
    @Test public void size_test() {
        MyHashTable t = new MyHashTable();
        
        assertEquals(0,t.size());

        t.put("lemon",1);
            assertEquals(1,t.size());
        
        t.put("lime",2);
        assertEquals(2,t.size());
        
        t.put("fig",3);
        t.put("date",4); 
       assertEquals(4,t.size());

        t.remove("dushanbe");
        assertEquals(4,t.size());

        t.remove("dushanbe");
        t.remove("lemon");
        t.remove("lime");
            t.remove("fig");
        t.remove("date");assertEquals(0,t.size());
    }


}



