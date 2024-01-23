package com.vindur.tone_consulting.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LineProcessingService {
    public List<Map.Entry<Character, Integer>> computeSymbolMap(String line) {
        Map<Character, Integer> symbolMap = new HashMap<>();

        for (char symbol : line.toCharArray()) {
            symbolMap.put(symbol, symbolMap.getOrDefault(symbol, 0) + 1);
        }

        return symbolMap.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> -entry.getValue()))
                .toList();
    }

}
