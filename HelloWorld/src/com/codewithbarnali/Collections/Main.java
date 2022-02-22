package com.codewithbarnali.Collections;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("1");
        list.add("10");
        list.get(0);
        list.items[0]="q";
        //requirement for iterable
        //to get all the items in the GenericList class, we have to expose items array in Generic class which is not desired
        //iterable can be used to get all list items without knowing its internal implementation
        //It is not part of Collection framework, it is part of java.lang package
        //Iterable interface presents an object which is iterable
        //we can loop or iterate over it without knowing its implementation

    }
}
