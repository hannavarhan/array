package com.epam.array.parser;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;

public class StringParser {

    public ArrayEntity parse(String line) throws ArrayException {
        String[] lineElements = line.split(" ");
        ArrayEntity arrayEntity = new ArrayEntity(lineElements.length);
        for (int i = 0; i < lineElements.length; i++) {
            arrayEntity.set(i, Integer.parseInt(lineElements[i]));
        }
        return arrayEntity;
    }
}
