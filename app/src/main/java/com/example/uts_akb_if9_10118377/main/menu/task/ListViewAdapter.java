package com.example.uts_akb_if9_10118377.main.menu.task;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ListViewAdapter extends BaseAdapter {
    private String[] judul;
    private String[] date;
    private String[] kategori;
    private String[] isi;

    private Context context;

    public ListViewAdapter(String[] judul, String[] date, String[] kategori, String[] isi, Context context) {
        this.judul = judul;
        this.date = date;
        this.kategori = kategori;
        this.isi = isi;
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
