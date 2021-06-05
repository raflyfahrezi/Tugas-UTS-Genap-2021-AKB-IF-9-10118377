package com.example.uts_akb_if9_10118377.main.menu.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.uts_akb_if9_10118377.R;
import com.example.uts_akb_if9_10118377.model.Task;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private List<Task> listTask;
    private Context context;
    private TextView judul;
    private TextView date;
    private TextView kategori;
    private TextView isi;

    public ListViewAdapter(List<Task> listTask, Context context) {
        this.listTask = listTask;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listTask.size();
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
        View view = LayoutInflater.from(context).inflate(R.layout.task_card,null);

        judul = view.findViewById(R.id.cardJudul);
        date = view.findViewById(R.id.cardDate);
        kategori = view.findViewById(R.id.cardKategori);
        isi = view.findViewById(R.id.cardIsi);

        judul.setText(listTask.get(position).getJudul());
        date.setText(listTask.get(position).getDate());
        kategori.setText(listTask.get(position).getKategori());
        isi.setText(listTask.get(position).getIsi());

        return view;
    }
}
