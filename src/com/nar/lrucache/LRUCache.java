package com.nar.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // https://medium.com/@krishankantsinghal/my-first-blog-on-medium-583159139237
    /*HashMap will hold the keys and address of the Nodes of Doubly LinkedList . And Doubly LinkedList will hold the values of keys.*/

    /*When we think about O(1) lookup , obvious data structure comes in our mind is HashMap. HashMap provide O(1)
    insertion and lookup. but HashMap does not has mechanism of tracking which entry has been queried recently and which not.*/

    /*To track this we require another data-structure which provide fast insertion ,deletion and updation ,
    in case of LRU we use Doubly Linkedlist . Reason for choosing doubly LinkList is O(1) deletion ,
    updation and insertion if we have the address of Node on which this operation has to perform.*/
    Map<Integer, Entry> hashmap;
    Entry start, end; // index of linked list

    int LRU_SIZE = 4; // Here i am setting 4 to test the LRU cache
    // implementation, it can make be dynamic
    public LRUCache() {
        hashmap = new HashMap<>();
    }

    public void putEntry(int key, int value){// Key Already Exist, just update the value and move it to top
        if(hashmap.containsKey(key)){
            Entry entry = hashmap.get(key);
            entry.value = value;
            removeEntry(entry);
            addAtTop(entry);
        } else{
            Entry newEntry = new Entry();
            newEntry.key = key;
            newEntry.value = value;
            newEntry.left = null;
            newEntry.right = null;
            if (hashmap.size() >= LRU_SIZE) {// We have reached maxium size so need to make room for new element. Remove from both hashmap and Linked list
                hashmap.remove(end.key);
                removeEntry(end); // Need to remove from both hashmap and linked list
                addAtTop(newEntry);

            } else {
                addAtTop(newEntry);
            }

            hashmap.put(key, newEntry); // Need to add both in hashmap and linked list

        }
    }

    public int getEntry(int key) {
        if (hashmap.containsKey(key)){ // Key Already Exist, just update the
            Entry entry = hashmap.get(key);
            removeEntry(entry);
            addAtTop(entry);
            return entry.value;
        }
        return -1;
    }

    public void addAtTop(Entry entry){// take care of given node and its around node left right entries and update start and end position
        entry.right = start; // start is required because when we need to add new entry at top it has to refer next to start
        entry.left = null;

        if(start != null){
            start.left = entry;
        }

        start = entry;
        if(end == null){
            end = start;
        }
    }

    public void removeEntry(Entry entry){//Break current entry left right and attach pev and next elements left rigth and update start and end positions
        if(entry.left != null){
            entry.left.right = entry.right;
        }else{
            start = entry.right;
        }

        if(entry.right != null){
            entry.right.left = entry.left;
        }else{
            end = entry.left;
        }
    }


    class Entry{
        int key;
        int value;
        Entry left;
        Entry right;
    }
}
