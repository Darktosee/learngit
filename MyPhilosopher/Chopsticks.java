package com.Darktosee.MyPhilosopher;

/**
 * Created by HJUser on 2016/11/18.
 */
public class Chopsticks {

    /**
     * 此筷子是否可以拿起
     */
    private boolean enable;

    /**
     * 此筷子的名称
     */
    public String name;

    public Chopsticks(boolean enable, String name) {
        super();
        this.enable = enable;
        this.name = name;
    }

    public Chopsticks(String name) {

        this(true,name);
    }

    public void setEnable(boolean enbl){
        this.enable = enbl;
    }

    public boolean getEnable(){
        return this.enable;
    }

    /**
     * 拿起筷子
     */
    public synchronized void pickup(){
        try{
            while(this.enable == false){

                wait(2000);

            }
            this.enable = false;
        }catch(Exception e){

            e.printStackTrace();

        }
    }

    /**
     * 放下手中的筷子
     */
    public synchronized void pickdown(){
        this.enable = true;

        this.notifyAll();
    }

  }