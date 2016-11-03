package com.MyBag;

/**
 * Created by HJUser on 2016/11/01.
 */
 interface  FBag<T> {
     T[] DeletewithIndex(int index);  //通过位置删除元素

     T[]   Deletewithelement(T e);  //删除指定元素

     T  ReserchwithIndex(int index);  //通过下标查找


    void addElement(T e);     //添加元素


    boolean  isempty();  // 判断是否为空

    T ReserchwithElement(T e);  // 查找特定元素的位置

    T[]  InsertElement( T e,int index);  //在指定位置查入元素



}
