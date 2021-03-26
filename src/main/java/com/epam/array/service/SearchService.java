package com.epam.array.service;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;

public interface SearchService {
    int findMin(ArrayEntity myIntArray) throws ArrayException;

    int findMax(ArrayEntity myIntArray) throws ArrayException;

    double findAverage(ArrayEntity myIntArray) throws ArrayException;

    int findSum(ArrayEntity myIntArray) throws ArrayException;

    int findPositiveElementsNumber(ArrayEntity myIntArray) throws ArrayException;

    int findNegativeElementsNumber(ArrayEntity myIntArray) throws ArrayException;
}
