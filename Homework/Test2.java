package com.gaoyu;

/**
 * Created by HJUser on 2016/10/16.
 */
 class Human{
     private String name;
    private int age;
    private  String sex="Big帅哥";
    //private String sex2=""
public  Human(){

    }
    protected Human(String name ,int age){
        this.setAge(age);
        this.setName(name);


    }


    //setter方法
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void Introduce(){
        System.out.println("姓名："+this.getName()+" ， "+this.getSex()+" 一个， "+this.getAge()+"岁了");
    }


}
public class Test2 {
    public static void main(String[] args){
        Human per1=new Human("凌霄",18);
        Human per2=new Human("王灵骁",18);
        Human per3=new Human("曾名杨",18);
        Human per4=new Human("郑昱旋",18);
        Human per5=new Human("徐书展",18);

        per1.Introduce();
        per2.Introduce();
        per3.Introduce();
        per4.Introduce();
        per5.Introduce();


    }
}
