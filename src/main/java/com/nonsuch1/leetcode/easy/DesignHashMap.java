package com.nonsuch1.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 *
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap.
 * If the key already exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped,
 * or -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 *
 */

public class DesignHashMap {

}

class MyHashMap {
    List<Integer> keys;
    List <Integer> values;


    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(int key, int value) {
        int keyIndex = keys.indexOf(key);
        if (keyIndex == - 1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keyIndex, value);
        }
    }

    public int get(int key) {
        if (!keys.contains(key)) {
            return -1;
        }
        int keyIndex = keys.indexOf(key);
        return values.get(keyIndex);
    }

    public void remove(int key) {
        int keyIndex = keys.indexOf(key);
        if (keyIndex >= 0) {
            keys.remove(Integer.valueOf(key));
            values.remove(keyIndex);
        }
    }

}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
