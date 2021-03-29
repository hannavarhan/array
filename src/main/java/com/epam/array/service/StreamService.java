package com.epam.array.service;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;

public interface StreamService {

    int findMin(ArrayEntity arrayEntity) throws ArrayException;

    int findMax(ArrayEntity arrayEntity) throws ArrayException;

    double findAverage(ArrayEntity arrayEntity) throws ArrayException;

    int findSum(ArrayEntity arrayEntity) throws ArrayException;

    int findPositiveElementsNumber(ArrayEntity arrayEntity) throws ArrayException;

    int findNegativeElementsNumber(ArrayEntity arrayEntity) throws ArrayException;

    ArrayEntity replacePositive(ArrayEntity arrayEntity) throws ArrayException;

    ArrayEntity replaceNegative(ArrayEntity arrayEntity) throws ArrayException;
}
