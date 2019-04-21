package com.nar.lrucache;

public class Main {
    public static void main(String[] args) {
        LRUCache lrucache = new LRUCache();
        lrucache.putEntry(1, 1);
        lrucache.putEntry(2, 2);
        lrucache.putEntry(3, 3);
        lrucache.putEntry(4, 4);
        lrucache.putEntry(5, 5);
        lrucache.putEntry(6, 6);
        //Till this position cache has 4 records 6,5,4,3. Records 2 and 1 are removed

        System.out.println(lrucache.getEntry(6));
        System.out.println(lrucache.getEntry(5));
        System.out.println(lrucache.getEntry(4));
        System.out.println(lrucache.getEntry(3));//Since this is retrived this will be put at top
        System.out.println(lrucache.getEntry(2));//removed
        System.out.println(lrucache.getEntry(1));//removed
    }
}
