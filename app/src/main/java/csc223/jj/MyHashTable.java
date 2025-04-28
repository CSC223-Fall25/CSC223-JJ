package csc223.jj;

import java.util.ArrayList;

public class MyHashTable {

    public class HashType {
        public String key;
        public int value;

        public HashType(String key, int value) {
            this.key = key;
            this.value = value; }
    }

    int capacity;
    ArrayList<HashType>[] hashtable;

    //hHAshtable
    public MyHashTable() {
        capacity = 10;
        hashtable = new ArrayList[capacity];

        for (int i = 0; i < capacity; i++) {
            hashtable[i] = new ArrayList<>();
        }
    }


    //get index
    private int getIndex(String key) {
       int index = Math.abs(key.hashCode()) % capacity;
       return index;
    }

    public void put(String key, Integer value) {
        int i= getIndex(key);
        ArrayList<HashType> bucket = hashtable[i];

        for (HashType a : bucket){
            if(a.key.equals(key)){
               a.value = value;
                return;}
        }
        HashType tup = new HashType(key, value);
         bucket.add(tup);
    }


    ///get 
    public Integer get(String key) {
        int i= getIndex(key);
        ArrayList<HashType> bucket = hashtable[i];

        for (HashType a : bucket) {
            if (a.key.equals(key)) {
             return a.value;
            }}
          return null;
    }

    ///Remove
    public void remove(String key) {
        int i1 = getIndex(key);
        ArrayList<HashType> bucket = hashtable[i1];

        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).key.equals(key)) {
             bucket.remove(i);
              return; 
            }}
    }


    ////containkey
    public boolean containsKey(String key) {
        return get(key)!= null;
    }

    
    //get size
    public int size() {
        int total = 0;
        for (int i = 0; i < hashtable.length; i++) {
            total += hashtable[i].size();
        } 
        return total; }
}
