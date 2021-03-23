package com.epam.array.service;

import com.epam.array.entity.MyIntArray;
import com.epam.array.service.impl.ReplaceServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestReplaceService {

    MyIntArray myIntArray;
    ReplaceService replaceService;
    @BeforeClass
    public void setMyIntArray() {
        myIntArray = new MyIntArray(new int[]{1, -2, 5, 2, -7});
        replaceService = new ReplaceServiceImpl();
    }

    @Test
    public void replacePositive() {
        MyIntArray actual = new MyIntArray(new int[]{-1, -2, -5, -2, -7});
        MyIntArray expected = replaceService.replacePositive(myIntArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void replaceNegative() {
        MyIntArray actual = new MyIntArray(new int[]{1, 2, 5, 2, 7});
        MyIntArray expected = replaceService.replaceNegative(myIntArray);
        Assert.assertEquals(actual, expected);
    }
}
