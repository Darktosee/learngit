package com.example.darktosee.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HJUser on 2016/12/01.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
  //  private final LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<Student> list;
    private static final String TAG = MyAdapter.class.getSimpleName();

    public MyAdapter(Context mContext,List<Student> list) {
        this.mContext = mContext;
        this.list = list;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view =  LayoutInflater.from(mContext).inflate(R.layout.item_recycler,parent,false);
        return new  MyViewHolder(view);
    }


    public void onBindViewHolder(MyViewHolder holder, int position) {
      //  Log.d(TAG, "onBindViewHolder, i: " + position+ ", viewHolder: " + holder);

       // MyViewHolder viewholder = (MyViewHolder) holder;
            //    viewholder.getAdapterPosition();
                 Student student = list.get(position);
                 holder.mTname.setText(student.getName());
                 holder.mTgrade.setText(student.getGrade());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

       private TextView mTname;
        private TextView mTgrade;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTname = (TextView) itemView.findViewById(R.id.recycler_item_student_name);
            mTgrade =(TextView) itemView.findViewById(R.id.recycler_item_student_grade);

                }

    }
}
