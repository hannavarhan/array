package com.epam.array.service.impl;

import com.epam.array.entity.MyIntArray;
import com.epam.array.service.SearchService;

public class SearchServiceImpl implements SearchService {
    public int findMin(MyIntArray myIntArray) {
        int min = myIntArray.get(0);
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) < min) {
                min = myIntArray.get(i);
            }
        }
        return min;
    }

    public int findMax(MyIntArray myIntArray) {
        int max = myIntArray.get(0);
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) > max) {
                max = myIntArray.get(i);
            }
        }
        return max;
    }

    public double findAverage(MyIntArray myIntArray) {
        return (double)findSum(myIntArray) / myIntArray.size();
    }

    public int findSum(MyIntArray myIntArray) {
        int sum = 0;
        for (int i = 0; i < myIntArray.size(); i++) {
            sum += myIntArray.get(i);
        }
        return sum;
    }

    public int findPositiveElementsNumber(MyIntArray myIntArray) {
        int posNumber = 0;
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) > 0) {
                posNumber++;
            }
        }
        return posNumber;
    }

    public int findNegativeElementsNumber(MyIntArray myIntArray) {
        int negNumber = 0;
        for (int i = 0; i < myIntArray.size(); i++) {
            if (myIntArray.get(i) < 0) {
                negNumber++;
            }
        }
        return negNumber;
    }
}
