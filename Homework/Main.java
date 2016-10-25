package com.Darktosee;

/**
 * Created by HJUser on 2016/10/24.
 */
 class Shape {
    private float area;
    private float a;//正方形边长

    private float b;/*三角形底和高*/
    private float h;
    
    private float r;//圆半径

    public Shape() {

    }

    public void setA(float a) {
        this.a = a;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

    public float getR() {
        return r;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getSquareArea() {
        return area = a * a;
    }

    public float getTriangleArea() {
        return area = b * h / 2;
    }

    public float getCircleArea() {
        return area = (int) (3.14 * r * r);
    }
}
class Circle extends Shape {
    public Circle(float r){
        super.setR(r);
    }
    @Override
    public float getR() {
        return super.getR();
    }

    @Override
    public float getCircleArea() {
        return (float) (3.14*super.getR()*super.getR());
    }
}



 class Square extends Shape {

    public  Square(float a) {
        super.setA(a);
    }
    @Override
    public float getA() {
        return super.getA();
    }

    @Override
    public float getSquareArea() {
        return super.getA()*super.getA();
    }
}

 class Triangle extends Shape {
    public Triangle(int b,int h){
        super.setB(b);
        super.setH(h);
    }
    @Override
    public float getB() {
        return super.getB();
    }

    @Override
    public float getH() {
        return super.getH();
    }

    @Override
    public float getTriangleArea() {
        return super.getB()*super.getH()/2;
    }
}




public class Main {

    public static void main(String[] args) {
        Shape s=new Square(5);
        Shape t=new Triangle(4,8);
        Triangle t1=(Triangle)t;
        final Shape  c=new  Circle(6);


        System.out.println("SquareArea:"+s.getSquareArea());
        System.out.println("TriangleArea:"+t1.getTriangleArea());
        System.out.println("CircleArea:"+c.getCircleArea());


    }
}
