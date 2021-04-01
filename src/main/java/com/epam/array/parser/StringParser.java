package com.epam.array.parser;

import com.epam.array.exception.ArrayException;

public class StringParser {

    final String SPACE_REGEX = "\\s+";

    public int[] parse(String numberString) throws ArrayException { //return просто массив
        String[] lineElements = numberString.split(SPACE_REGEX);
        int[] array = new int[lineElements.length];
        for (int i = 0; i < lineElements.length; i++) {
            array[i] = Integer.parseInt(lineElements[i]);
        }
        return array;
    }
}
