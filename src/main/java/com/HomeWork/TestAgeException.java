package com.HomeWork;

public class TestAgeException {
    private static int age;
    public void setAge(int a) throws AgeException {
        age = a;
        if (a < 18 || a > 22)
            throw new AgeException("年龄异常");
    }
    public TestAgeException(int a) throws AgeException {
        setAge(a);
    }
    public static void main(String[] args) {
        try {
            new TestAgeException(17);
        } catch (AgeException e) {
            e.printStackTrace();
            System.out.println(e.toString(age));
        }
    }
}
