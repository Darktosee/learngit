package com.example.darktosee.recyclerviewdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private MyAdapter adapter;
    RecyclerView mRecyclerView;
    List<Student> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        initdata();

      //  LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

       // recyclerview.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流
       // recyclerview.setLayoutManager(new LinearLayoutManager(this));
       // GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3, LinearLayoutManager.VERTICAL,false);
      /*  gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(){

            @Override
           public int getSpanSize(int position){
                if(position==position%2){
                    position++;
                    return 2;

                }
                 return 1;

            }
        });*/
        //recyclerview.setLayoutManager(gridLayoutManager);
        adapter = new MyAdapter(this, list);

        recyclerview.setAdapter(adapter);




    }
    private List<Student> initdata(){

        for (int i =0 ;i<100;i++) {
            if(i%2==0) {

                list.add(new Student("小红", "大一"));
            }
            if(i%3==0){
                list.add(new Student("小明","大一"));

            }
                else{
                    list.add(new Student("小米","大二"));
                }

        }
        return list;
    }



}
