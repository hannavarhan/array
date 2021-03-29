package com.epam.array.service.impl;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.StreamService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StreamServiceImpl implements StreamService {

    private final static Logger logger = LogManager.getLogger(StreamServiceImpl.class);

    @Override
    public int findMin(ArrayEntity arrayEntity) throws ArrayException {
        return Arrays.stream(arrayEntity.getArray())
                .min()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public int findMax(ArrayEntity arrayEntity) throws ArrayException {
        return Arrays.stream(arrayEntity.getArray())
                .max()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public double findAverage(ArrayEntity arrayEntity) throws ArrayException {
        return Arrays.stream(arrayEntity.getArray())
                .average()
                .orElseThrow(ArrayException::new);
    }

    @Override
    public int findSum(ArrayEntity arrayEntity) throws ArrayException {
        return Arrays.stream(arrayEntity.getArray())
                .sum();
    }

    @Override
    public int findPositiveElementsNumber(ArrayEntity arrayEntity) throws ArrayException {
        return (int) Arrays.stream(arrayEntity.getArray())
                .filter(element -> element > 0)
                .count();
    }

    @Override
    public int findNegativeElementsNumber(ArrayEntity arrayEntity) throws ArrayException {
        return (int) Arrays.stream(arrayEntity.getArray())
                .filter(element -> element < 0)
                .count();
    }

    @Override
    public ArrayEntity replacePositive(ArrayEntity arrayEntity) throws ArrayException {
        ArrayEntity result = new ArrayEntity(
                Arrays.stream(arrayEntity.getArray())
                        .map(element -> element > 0 ? -element : element)
                        .toArray());
        logger.info("replacePositive:" + result);
        return result;
    }

    @Override
    public ArrayEntity replaceNegative(ArrayEntity arrayEntity) throws ArrayException {
        ArrayEntity result = new ArrayEntity(
                Arrays.stream(arrayEntity.getArray())
                        .map(element -> element < 0 ? -element : element)
                        .toArray());
        logger.info("replaceNegative:" + result);
        return result;
    }
}
