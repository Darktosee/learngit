package com.gaoyu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by HJUser on 2016/10/16.
 */
class Factorial{
    public Factorial(){

    }
    /*
    计算input！
     */
    public static String Result(int input){

        BigInteger sum=new BigInteger("1");
        for(int i=input;i>0;i--){
            sum=sum.multiply(new BigInteger(String.valueOf(i)));

        }

        return sum.toString();
    }
    /*
    截取start到end的位置的数
     */
    public static String subResult(int input ,int start,int end){
        Factorial f=new Factorial();
       return f.Result(input).substring(start,end).toString();
    }
}
public class Test3 {
    public static void main(String[] args){
        Factorial H=new Factorial();
        System.out.println("请输入要计算阶乘的数：");
        Scanner in=new Scanner(System.in);
        int input=in.nextInt();
        System.out.println("!计算结果：");
     System.out.println(input+"!="+H.Result(input));
        System.out.println("截取的数位：\n");
        System.out.print("起始位置：");
        int start=in.nextInt();
        System.out.print("结束位置：");
        int end=in.nextInt();
        System.out.print("截取结果：");
      System.out.println(H.subResult(input,start,end));


    }
}
