package com.test.springlecture.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yangfan
 * @date 2019/04/17
 */
public class MyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
         Class<MyTest2> clazz = MyTest2.class;
        Method method =clazz.getDeclaredMethod("main", String[].class);
        method.invoke(null, new Object[]{null});
        method.invoke(new MyTest2(), new Object[]{null});
    }
}
