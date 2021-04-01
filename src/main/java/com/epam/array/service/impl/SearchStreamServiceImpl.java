package com.epam.array.service.impl;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.SearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SearchStreamServiceImpl implements SearchService {

    private final static Logger logger = LogManager.getLogger(SearchStreamServiceImpl.class);

    @Override
    public int findMin(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in findMin stream method");
            throw new ArrayException("Array is null");
        }
        return Arrays.stream(arrayEntity.getArray())
                .min()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public int findMax(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in findMax stream method");
            throw new ArrayException("Array is null");
        }
        return Arrays.stream(arrayEntity.getArray())
                .max()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public double findAverage(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in findAverage stream method");
            throw new ArrayException("Array is null");
        }
        return Arrays.stream(arrayEntity.getArray())
                .average()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public int findSum(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in findSum stream method");
            throw new ArrayException("Array is null");
        }
        return Arrays.stream(arrayEntity.getArray())
                .sum();
    }

    @Override
    public int findPositiveElementsNumber(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in findPositiveElementsNumber stream method");
            throw new ArrayException("Array is null");
        }
        return (int) Arrays.stream(arrayEntity.getArray())
                .filter(element -> element > 0)
                .count();
    }

    @Override
    public int findNegativeElementsNumber(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in findNegativeElementsNumber stream method");
            throw new ArrayException("Array is null");
        }
        return (int) Arrays.stream(arrayEntity.getArray())
                .filter(element -> element < 0)
                .count();
    }
}
