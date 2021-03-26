package com.epam.array.service.impl;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.SearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchServiceImpl implements SearchService {

    private final static Logger logger = LogManager.getLogger(SearchServiceImpl.class);

    public int findMin(ArrayEntity myIntArray) throws ArrayException {
        int min = myIntArray.get(0);
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) < min) {
                min = myIntArray.get(i);
            }
        }
        logger.info("min: " + min + " of: " + myIntArray);
        return min;
    }

    public int findMax(ArrayEntity myIntArray) throws ArrayException {
        int max = myIntArray.get(0);
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) > max) {
                max = myIntArray.get(i);
            }
        }
        logger.info("max: " + max + " of: " + myIntArray);
        return max;
    }

    public double findAverage(ArrayEntity myIntArray) throws ArrayException {
        logger.info("average: " + findSum(myIntArray) / myIntArray.size() + " of: " + myIntArray);
        return (double) findSum(myIntArray) / myIntArray.size();
    }

    public int findSum(ArrayEntity myIntArray) throws ArrayException {
        int sum = 0;
        for (int i = 0; i < myIntArray.size(); i++) {
            sum += myIntArray.get(i);
        }
        logger.info("sum: " + sum + " of: " + myIntArray);
        return sum;
    }

    public int findPositiveElementsNumber(ArrayEntity myIntArray) throws ArrayException {
        int posNumber = 0;
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) > 0) {
                posNumber++;
            }
        }
        logger.info("positiveElementsNumber: " + posNumber + " of: " + myIntArray);
        return posNumber;
    }

    public int findNegativeElementsNumber(ArrayEntity myIntArray) throws ArrayException {
        int negNumber = 0;
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) < 0) {
                negNumber++;
            }
        }
        logger.info("negativeElementsNumber: " + negNumber + " of: " + myIntArray);
        return negNumber;
    }
}
