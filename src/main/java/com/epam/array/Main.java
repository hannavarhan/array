package com.epam.array;

import com.epam.array.entity.MyIntArray;
import com.epam.array.service.ReplaceService;
import com.epam.array.service.SearchService;
import com.epam.array.service.impl.ReplaceServiceImpl;
import com.epam.array.service.impl.SearchServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyIntArray myIntArray = new MyIntArray(new int[]{1, 2, 5, 2, -7});
        System.out.println(myIntArray.get(0));
        System.out.println(myIntArray.size());
        myIntArray.set(1, 8);
        System.out.println(myIntArray);
        SearchServiceImpl searchService = new SearchServiceImpl();
        System.out.println(searchService.findAverage(myIntArray));
        System.out.println(searchService.findSum(myIntArray));
        System.out.println(searchService.findMax(myIntArray));
        System.out.println(searchService.findMin(myIntArray));
        System.out.println(searchService.findNegativeElementsNumber(myIntArray));
        System.out.println(searchService.findPositiveElementsNumber(myIntArray));

        ReplaceService replaceService = new ReplaceServiceImpl();
        System.out.println(replaceService.replaceNegative(myIntArray));
        myIntArray = replaceService.replacePositive(myIntArray);
        System.out.println(myIntArray);
        System.out.println(searchService.findPositiveElementsNumber(myIntArray));

    }
}
