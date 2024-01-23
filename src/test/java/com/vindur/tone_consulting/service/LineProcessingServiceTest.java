package com.vindur.tone_consulting.service;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map.Entry;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineProcessingServiceTest {
    private final LineProcessingService lineProcessingService = new LineProcessingService();
    private static final String BASE_LINE = "ccbbbbaaa";
    private static final String BLANK_LINE = "   ";
    private static final String EMPTY_LINE = "";

    @Test
    public void baseCaseTest() {
        List<Entry<Character, Integer>> expectedMap = List.of(
                new SimpleEntry<>('b', 4),
                new SimpleEntry<>('a', 3),
                new SimpleEntry<>('c', 2)
        );

        List<Entry<Character, Integer>> actualMap = lineProcessingService.computeSymbolMap(BASE_LINE);

        assertEquals(expectedMap, actualMap);
    }

    @Test
    public void blankLineTest() {
        List<Entry<Character, Integer>> expectedMap = List.of(
                new SimpleEntry<>(' ', 3)
        );

        List<Entry<Character, Integer>> actualMap = lineProcessingService.computeSymbolMap(BLANK_LINE);

        assertEquals(expectedMap, actualMap);
    }

    @Test
    public void emptyLineTest() {
        List<Entry<Character, Integer>> expectedMap = List.of();

        List<Entry<Character, Integer>> actualMap = lineProcessingService.computeSymbolMap(EMPTY_LINE);

        assertEquals(expectedMap, actualMap);
    }
}
