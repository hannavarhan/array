package com.epam.array.service;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;

public interface SortService {

    ArrayEntity quickSort(ArrayEntity arrayEntity) throws ArrayException;

    ArrayEntity countingSort(ArrayEntity arrayEntity) throws ArrayException;

    ArrayEntity mergeSort(ArrayEntity arrayEntity) throws ArrayException;
}
