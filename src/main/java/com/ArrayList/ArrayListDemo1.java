package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建一个ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // 输出集合中的元素
        System.out.println("ArrayList中的元素: " + list);

        // 获取集合的大小
        System.out.println("ArrayList的大小: " + list.size());

        // 访问集合中的元素
        System.out.println("第一个元素: " + list.get(0));
        System.out.println("第二个元素: " + list.get(1));

        // 修改集合中的元素
        list.set(2, "C#");
        System.out.println("修改后的ArrayList: " + list);

        // 删除集合中的元素
        list.remove(1);
        System.out.println("删除后的ArrayList: " + list);

        // 清空集合
        list.clear();
        System.out.println("清空后的ArrayList: " + list);
    }
}
