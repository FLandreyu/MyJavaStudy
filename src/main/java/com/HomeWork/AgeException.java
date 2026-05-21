package com.HomeWork;

public class AgeException extends Exception {
    public AgeException(String s) {
        super(s);
    }
    public String toString(int x) {
        return "年龄为 " + x + ",应在18到22岁之间！";
    }
}


