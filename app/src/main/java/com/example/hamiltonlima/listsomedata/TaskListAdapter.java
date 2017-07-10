package com.example.hamiltonlima.listsomedata;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hamiltonlima on 2017-07-09.
 */
public class TaskListAdapter extends BaseAdapter {

    private List<Task> data;

    TaskListAdapter(List<Task> data) {
        this.data = data;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_item, parent, false);
        }

        Task task = this.data.get(position);

        TextView text = view.findViewById(R.id.textView);
        text.setText(task.getName());
        text.setTextColor(Color.parseColor(task.getColor()));

        Button buttonBlue = view.findViewById(R.id.buttonBlue);
        Button buttonRed = view.findViewById(R.id.buttonRed);

        buttonBlue.setOnClickListener(new ColorButtonListener(task, "#0000FF", this));
        buttonRed.setOnClickListener(new ColorButtonListener(task, "#FF0000", this));

        return view;
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public Object getItem(int i) {
        return this.data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.data.get(i).getId();
    }

}
