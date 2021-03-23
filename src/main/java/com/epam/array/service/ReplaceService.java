package com.epam.array.service;

import com.epam.array.entity.MyIntArray;

public interface ReplaceService {

    MyIntArray replacePositive(MyIntArray myIntArray);

    MyIntArray replaceNegative(MyIntArray myIntArray);
}
