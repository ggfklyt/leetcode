package com.nonsuch1.easy.arraysAndHashing;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isAnagram(String s, String t) {
            String sortedS = Arrays.stream(s.split(""))
                    .sorted()
                    .collect(Collectors.joining(""));
            String sortedT = Arrays.stream(t.split(""))
                    .sorted()
                    .collect(Collectors.joining(""));
            return sortedS.equals(sortedT);
        }
    }
}
