package com.example.hamiltonlima.listsomedata;

import android.view.View;
import android.widget.BaseAdapter;

/**
 * Created by hamiltonlima on 2017-07-09.
 */

public class ColorButtonListener implements View.OnClickListener {

    private final String color;
    private final Task task;
    private final BaseAdapter adapter;

    public ColorButtonListener(Task task, String color, BaseAdapter adapter) {
        this.task = task;
        this.color = color;
        this.adapter = adapter;
    }

    @Override
    public void onClick(View view) {
        this.task.setColor(this.color);
        adapter.notifyDataSetChanged();
    }
}
