package com.epam.array.service.impl;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.ReplaceService;
import com.epam.array.service.SearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReplaceServiceImpl implements ReplaceService {

    private final static Logger logger = LogManager.getLogger(ReplaceServiceImpl.class);

    public ArrayEntity replacePositive(ArrayEntity myIntArray) throws ArrayException {
        ArrayEntity newMyIntArray = new ArrayEntity(myIntArray.size());
        for (int i = 0; i < myIntArray.size(); i++) {
            newMyIntArray.set(i, myIntArray.get(i) > 0 ? -myIntArray.get(i) : myIntArray.get(i));
        }
        logger.info("positive mas: " + newMyIntArray + ", before: " + myIntArray);
        return newMyIntArray;
    }

    public ArrayEntity replaceNegative(ArrayEntity myIntArray) throws ArrayException {
        ArrayEntity newMyIntArray = new ArrayEntity(myIntArray.size());
        for (int i = 0; i < myIntArray.size(); i++) {
            newMyIntArray.set(i, myIntArray.get(i) < 0 ? -myIntArray.get(i) : myIntArray.get(i));
        }
        logger.info("negative mas: " + newMyIntArray + ", before: " + myIntArray);
        return newMyIntArray;
    }
}
