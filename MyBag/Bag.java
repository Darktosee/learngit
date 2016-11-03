package com.MyBag;



/**
 * Created by Darktosee on 2016/11/01.
 */
public class Bag<T> implements FBag<T>{
    private  T[] elements;
    private int MaxSize;

    /*
    构造一个Bag类集
     */
    public Bag(int MaxSize){


        this.MaxSize=MaxSize;
        elements = (T[]) new Object[MaxSize];

    }

    @Override
    public T[] DeletewithIndex(int index) {
        try {

            for (int i = index; i < elements.length-1; i++) {

                elements[i] = elements[i + 1];

            }
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return elements;
    }
    @Override
    public  T[] Deletewithelement(Object e){

try {


    for (int k = 0; k < elements.length - 1; k++) {

        if (elements[k]==e) {

            for (int i = k; i < elements.length - 1; i++) {

                elements[i] = elements[i + 1];

            }
        }

    }

    }catch (NullPointerException m){

        m.printStackTrace();
     }

        return elements;
    }

    @Override
    public T ReserchwithIndex(int index) {

            return elements[index];

    }

    @Override
    public void addElement(Object e) {
        for(int i=0;i<elements.length;i++){
            if(elements[i] == null) {

                elements[i] = (T) e;

                break;
            }
        }

    }

    @Override
    public boolean isempty() {

        if (elements[0]==null){

            return true;
        }
        else {

            return  false;
        }

    }

    @Override
    public T[] InsertElement(Object e, int index){

        for(int k=elements.length-1;k>index;k--){

            elements[k] = elements[k-1];
        }
        for (int i=index;i<elements.length-1;i++){

            elements[index] = (T)e;

            break;
        }

        return elements;
    }


   public Object ReserchwithElement(Object e) {
       int i;
       Object k = null;
        for (i=0;i<elements.length-1;i++) {

            if (elements[i] == e)

            {
                 k=i;
            }


       }

      return k;

   }

  public  void print(){
      for (int i=0;i<elements.length;i++){

          if(elements[i]!= null) {

              System.out.print(elements[i]);
              System.out.print(" ");
          }
      }
  }
}