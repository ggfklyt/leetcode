package com.nonsuch1.easy.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
                return false;
            Map<String, Long> map = Arrays.stream(s.split(""))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            if (Arrays.stream(t.split(""))
                    .filter(ch -> !map.containsKey(ch))
                    .findFirst().isPresent())
                return false;
            Arrays.stream(t.split(""))
                    .forEach(ch -> {
                        Long value = map.get(ch);
                        if (map.get(ch) != null) {
                            map.put(ch, --value);
                        }
                    });
            return !map.entrySet().stream()
                    .filter(entry -> entry.getValue() != 0)
                    .findFirst().isPresent();
        }
    }
}
