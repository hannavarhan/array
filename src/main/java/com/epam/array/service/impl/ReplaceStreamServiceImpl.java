package com.epam.array.service.impl;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.ReplaceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ReplaceStreamServiceImpl implements ReplaceService {

    private final static Logger logger = LogManager.getLogger(ReplaceStreamServiceImpl.class);

    @Override
    public ArrayEntity replacePositive(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in replacePositive stream method");
            throw new ArrayException("Array is null");
        }
        ArrayEntity result = new ArrayEntity(
                Arrays.stream(arrayEntity.getArray())
                        .map(element -> element > 0 ? -element : element)
                        .toArray());
        logger.info("replacePositive:" + result);
        return result;
    }

    @Override
    public ArrayEntity replaceNegative(ArrayEntity arrayEntity) throws ArrayException {
        if (arrayEntity == null) {
            logger.error("Array is null in replaceNegative stream method");
            throw new ArrayException("Array is null");
        }
        ArrayEntity result = new ArrayEntity(
                Arrays.stream(arrayEntity.getArray())
                        .map(element -> element < 0 ? -element : element)
                        .toArray());
        logger.info("replaceNegative:" + result);
        return result;
    }
}
