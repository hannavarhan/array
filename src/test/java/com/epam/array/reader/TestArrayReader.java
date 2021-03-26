package com.epam.array.reader;

import com.epam.array.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestArrayReader {

    ArrayReader reader;

    @BeforeClass
    public void setMyIntArray() {
        reader = new ArrayReader();
    }

    @Test
    public void testReadFromEmptyFile() throws FileNotFoundException {
        ArrayEntity actual = null;
        ArrayEntity expected = reader.readArrayFromFile("file\\array.txt");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadFromValidFile() throws FileNotFoundException {
        ArrayEntity actual = new ArrayEntity(new int[]{52, -7, 5, 6, 1, 5});
        ArrayEntity expected = reader.readArrayFromFile("file\\array2.txt");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadFromNotValidFile() throws FileNotFoundException {
        ArrayEntity actual = null;
        ArrayEntity expected = reader.readArrayFromFile("file\\array3.txt");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadFirstNotValidString() throws FileNotFoundException {
        ArrayEntity actual = new ArrayEntity(new int[]{7, 8, 3, -8, 3, 4, -5});
        ArrayEntity expected = reader.readArrayFromFile("file\\array4.txt");
        Assert.assertEquals(actual, expected);
    }
}
