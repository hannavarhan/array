package com.epam.array.service;

import com.epam.array.entity.MyIntArray;

public interface SearchService {
    int findMin(MyIntArray myIntArray);

    int findMax(MyIntArray myIntArray);

    double findAverage(MyIntArray myIntArray);

    int findSum(MyIntArray myIntArray);

    int findPositiveElementsNumber(MyIntArray myIntArray);

    int findNegativeElementsNumber(MyIntArray myIntArray);
}
