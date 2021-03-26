package com.epam.array.service.impl;

import com.epam.array.entity.ArrayEntity;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.SearchService;
import com.epam.array.service.SortService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSortService {

    ArrayEntity myIntArray;
    SortService sortService;

    @BeforeClass
    public void setMyIntArray() {
        myIntArray = new ArrayEntity(new int[]{1, -2, 5, 2, -7});
        sortService = new SortServiceImpl();
    }

    @Test
    public void testQuickSort() throws ArrayException {
        ArrayEntity actual = new ArrayEntity(new int[]{-7, -2, 1, 2, 5});
        ArrayEntity expected = sortService.quickSort(myIntArray);
        Assert.assertEquals(actual, expected);
    }

    /*@Test
    public void testCountingSort() throws ArrayException {
        ArrayEntity actual = new ArrayEntity(new int[]{-7, -2, 1, 2, 5});
        ArrayEntity expected = sortService.countingSort(myIntArray);
        Assert.assertEquals(actual, expected);
    }*/

    @Test
    public void testMergeSort() throws ArrayException {
        ArrayEntity actual = new ArrayEntity(new int[]{-7, -2, 1, 2, 5});
        ArrayEntity expected = sortService.mergeSort(myIntArray);
        Assert.assertEquals(actual, expected);
    }


}
