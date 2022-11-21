package com.nonsuch1.leetcode.bitManupilation;

public class SomeBitPractice {

    public int setBit(int num, int position) {
       int mask = 1 << position;
       return mask | num;
    }


    public int clearBit(int num, int position) {
        int mask = 1 << position;
        return ~mask & num;
    }


    public int flipBit(int num, int position) {
        int mask = 1 << position;
        return mask ^ num;
    }

    public boolean isBitSet(int num, int position) {
        int shifted = num >> position;
        return (shifted & 1) == 1;
    }
}

