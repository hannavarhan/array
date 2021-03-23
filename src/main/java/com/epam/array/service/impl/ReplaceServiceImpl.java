package com.epam.array.service.impl;

import com.epam.array.entity.MyIntArray;
import com.epam.array.service.ReplaceService;

public class ReplaceServiceImpl implements ReplaceService {

    public MyIntArray replacePositive(MyIntArray myIntArray) {
        MyIntArray newMyIntArray = new MyIntArray(myIntArray.size());
        for(int i = 0; i < myIntArray.size(); i++) {
            newMyIntArray.set(i, myIntArray.get(i) > 0 ? -myIntArray.get(i) : myIntArray.get(i));
        }
        return newMyIntArray;
    }

    public MyIntArray replaceNegative(MyIntArray myIntArray) {
        MyIntArray newMyIntArray = new MyIntArray(myIntArray.size());
        for(int i = 0; i < myIntArray.size(); i++) {
            newMyIntArray.set(i, myIntArray.get(i) < 0 ? -myIntArray.get(i) : myIntArray.get(i));
        }
        return newMyIntArray;
    }
}
