package com.epam.array.service;

import com.epam.array.entity.MyIntArray;

import com.epam.array.service.impl.SearchServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSearchService {

    MyIntArray myIntArray;
    SearchService searchService;
    @BeforeClass
    public void setMyIntArray() {
        myIntArray = new MyIntArray(new int[]{1, -2, 5, 2, -7});
        searchService = new SearchServiceImpl();
    }

    @Test
    public void findMin() {
        int actual = -7;
        int expected = searchService.findMin(myIntArray);
        Assert.assertEquals(actual, expected, 0, "Test failed as...");
    }

    @Test
    public void findMax() {
        int actual = 5;
        int expected = searchService.findMax(myIntArray);
        Assert.assertEquals(actual, expected, 0, "Test failed as...");
    }

    @Test
    public void findAverage() {
        double actual = -0.2;
        double expected = searchService.findAverage(myIntArray);
        Assert.assertEquals(actual, expected, "Test failed as...");
    }

    @Test
    public void findSum() {
        int actual = -1;
        int expected = searchService.findSum(myIntArray);
        Assert.assertEquals(actual, expected, "Test failed as...");
    }

    @Test
    public void findPositiveElementsNumber() {
        int actual = 3;
        int expected = searchService.findPositiveElementsNumber(myIntArray);
        Assert.assertEquals(actual, expected, "Test failed as...");
    }

    @Test
    public void findNegativeElementsNumber() {
        int actual = 2;
        int expected = searchService.findNegativeElementsNumber(myIntArray);
        Assert.assertEquals(actual, expected, "Test failed as...");
    }
}
