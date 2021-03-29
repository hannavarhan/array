package com.epam.array.service;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;

public interface ReplaceService {

    ArrayEntity replacePositive(ArrayEntity arrayEntity) throws ArrayException;

    ArrayEntity replaceNegative(ArrayEntity arrayEntity) throws ArrayException;
}
