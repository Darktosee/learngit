package com.gaoyu;




/**
 * Created by HJUser on 2016/09/28.
 */
public class TimeStamp {
    private int count_day;/*定义成员变量*/
    private int year = 0;
    private int month = 0;
    private int m = 0;
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private int timeStamp;

    private TimeStamp(int timeStamp) {/*构造函数*/

        this.timeStamp = timeStamp;
    }

    /*

    获取秒
    */
    private int getSecond() {
        this.second = this.timeStamp % 60;

        return second;

    }

    /*
    获取分钟
     */
    private int getMinute() {
        minute = timeStamp / 60 % 60;

        return minute;
    }

    /*
    获取小时
     */
    private int getHour() {
        hour = timeStamp / 3600 % 24 + 8;
        if (hour > 24) {
            return hour - 24;
        } else {
            return hour;
        }
    }

    /*
    获得年份
     */
    private int getYear() {
        int t = timeStamp / 3600 / 24 / (365 * 3 + 366) * 4 + timeStamp / 3600 / 24 % (365 * 3 + 366) / 365;
        year = t + 1970;
        return year;
    }

    /*
    取得不满一年的天数
     */
    private int getCountDay() {
        count_day = timeStamp / 3600 / 24 % (365 * 3 + 366) % 365;
        return count_day;
    }

    private int getMonth() {
 /*构造一个表示闰年和平年的二维数组*/
        int[][] Month = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int i = 0;
        /*
        求闰年的月份
         */
        if (year % 4 == 0 || year % 400 == 0) {
            int num = 0;
            for (i = 0; i < 12; i++) {
                num += Month[1][i];

                if (this.getCountDay() - num < 0) {

                    return i + 1;


                }


            }
        }
        /*
        求平年的月份
         */
        if (year % 4 != 0 || year % 400 != 0) {
            int num = 0;
            for (i = 0; i < 12; i++) {

                num += Month[0][i];

                if (this.getCountDay() - num < 0) {
                    return i + 1;
                }


            }
        }
        this.month = i + 1;
        return this.month;
    }

    private int getDay() {
        int[][] Month2 = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        int t = 0;
         int m=0;

        if (year % 4 == 0) {
            for (int i = 0; i < this.getMonth() - 1; i++) {
                t += Month2[1][i];
                return t;
            }
        }
        if (year % 4 != 0) {
            for (int i = 0; i < this.getMonth() - 1; i++) {
                t += Month2[0][i];
                return t;
            }
        }
        if (timeStamp / 3600 % 24 + 8 > 24) {
            m= this.getCountDay() - t + 2;
            return m;

        } else {

            m = this.getCountDay() - t + 1;
            return m;

        }



     /*   if (year % 4 != 0 ) {
            for (int i = 0; i < this.getMonth()-1 ; i++) {
                t += Month2[0][i];

            }
            if (timeStamp / 3600 % 24 + 8 > 24) {
                this.day= this.getCountDay() - t + 2;
                return this.day;
            } else {

                this.day = this.getCountDay() - t + 1;
                return this.day;

            }

        }*/


            //return this.day;
    }





    public static  void main(String[] args){
       com.gaoyu.TimeStamp T=new TimeStamp(1385075229);
     com.gaoyu.TimeStamp t=new TimeStamp(1700514429);
        System.out.println("当前时间为："+T.getYear()+"/"+T.getMonth()+"/"+T.getDay()+" "+T.getHour()+":"+T.getMinute()+":"+T.getSecond());
      // System.out.println(T.getCountDay());
      System.out.println(t.getYear()+"-"+t.getMonth()+"-"+t.getDay()+"  "+ t.getHour()+":"+t.getMinute()+":"+t.getSecond());
    }
}
