package com.MyBag;

/**
 * Created by HJUser on 2016/11/02.
 */
public class Test {
    public static void main(String[] args) {
        //实例化一个容量大小为16的Bag类对象

        Bag b = new Bag(16);

        // 添加元素
        b.addElement("a");
        b.addElement(4);
        b.addElement("a");
        b.addElement("b");
        b.addElement(8);
        b.addElement("abc");
        b.addElement("好");
        System.out.print("Bag集合中的元素：");
        b.print();

        //通过位置查找元素
        System.out.println();
        System.out.print("通过位置查找的元素是：");
        System.out.println( b.ReserchwithIndex(2));

        //返回指定元素的下标
        System.out.println();
        System.out.print("查找的元素位置是：");
        System.out.print(b.ReserchwithElement(8));

       // 在指定位置插入元素
        System.out.println();
        System.out.print("插入元素后：");
        b.InsertElement("m",2);
        b.print();

        //删除指定元素
        System.out.println();
        System.out.print("通过指定元素删除后:");
        b.Deletewithelement("8");
        b.print();

        //删除指定位置元素
        System.out.println();
        System.out.print("通过指定位置删除后:");
        b.DeletewithIndex(1);
        b.print();

        //判断是否为空
        System.out.println();
        System.out.print("Bag集合为空吗？");
       System.out.println(b.isempty());



    }

}