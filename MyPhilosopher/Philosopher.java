package com.Darktosee.MyPhilosopher;




import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by HJUser on 2016/11/18.
 */
 class Philosopher implements Runnable {

 private String name;

 Chopsticks leftChopstick;
 Chopsticks rightChopstick;


 public Philosopher(String name, Chopsticks leftChopstick,
                    Chopsticks rightChopstick) {
  super();
  this.name = name;
  this.leftChopstick = leftChopstick;
  this.rightChopstick = rightChopstick;
 }

 @Override
 public void run() {
  Lock lock = new ReentrantLock();
  lock.lock();



   leftChopstick.pickup();

   System.out.println(this.name + "拿起了左手的筷子" + leftChopstick.name);

   rightChopstick.pickup();

   System.out.println(this.name + "拿起了右手的筷子" + rightChopstick.name);

   System.out.println(this.name + "开始吃饭了");

   try {

    Thread.sleep(1000);

   } catch (InterruptedException e) {

    e.printStackTrace();
   }

   System.out.println(this.name + "吃饱了");

   rightChopstick.pickdown();

   System.out.println(this.name + "放下了右手的筷子" + this.rightChopstick.name);

   leftChopstick.pickdown();

   System.out.println(this.name + "放下了左手的筷子" + this.leftChopstick.name);

  lock.unlock();

  }





}
