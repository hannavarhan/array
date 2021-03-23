package com.epam.array.entity;

import java.util.Arrays;

public class MyIntArray {
    private int[] array;

    public MyIntArray() {
    }

    public MyIntArray(int size) {
        this.array = new int[size];
    }

    public MyIntArray(int[] array) {
        this.array = array;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int position, int value) {
        array[position] = value;
    }

    public int size() {
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyIntArray that = (MyIntArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyIntArray");
        sb.append(Arrays.toString(array));
        return sb.toString();
    }
}
