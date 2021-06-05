package com.example.uts_akb_if9_10118377.main.menu.task;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.uts_akb_if9_10118377.model.Task;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private List<Task> listTask;
    private Context context;

    public ListViewAdapter(List<Task> listTask, Context context) {
        this.listTask = listTask;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
