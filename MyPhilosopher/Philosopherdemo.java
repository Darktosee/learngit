package com.Darktosee.MyPhilosopher;

/**
 * Created by HJUser on 2016/11/18.
 */
public class Philosopherdemo {


        public static void main (String[] args){
            Chopsticks chopstick1 = new Chopsticks("筷子 1 ");
            Chopsticks chopstick2 = new Chopsticks("筷子 2 ");
            Chopsticks chopstick3 = new Chopsticks("筷子 3 ");
            Chopsticks chopstick4 = new Chopsticks("筷子 4 ");
            Chopsticks chopstick5 = new Chopsticks("筷子 5 ");

            Philosopher philosopher1 = new Philosopher("哲学家 1 ", chopstick5, chopstick1);
            Philosopher philosopher2 = new Philosopher("哲学家 2 ", chopstick1, chopstick2);
            Philosopher philosopher3 = new Philosopher("哲学家 3 ", chopstick2, chopstick3);
            Philosopher philosopher4 = new Philosopher("哲学家 4 ", chopstick3, chopstick4);
            Philosopher philosopher5 = new Philosopher("哲学家 5 ", chopstick4, chopstick5);

            Thread t1 = new Thread(philosopher1);
            Thread t2 = new Thread(philosopher2);
            Thread t3 = new Thread(philosopher3);
            Thread t4 = new Thread(philosopher4);
            Thread t5 = new Thread(philosopher5);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();


        }

}
