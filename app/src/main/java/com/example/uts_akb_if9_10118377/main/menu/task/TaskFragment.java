package com.example.uts_akb_if9_10118377.main.menu.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.uts_akb_if9_10118377.R;
import com.example.uts_akb_if9_10118377.createTask.CreateTaskActivity;
import com.example.uts_akb_if9_10118377.database.SQLite;
import com.example.uts_akb_if9_10118377.model.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TaskFragment extends Fragment {
    private FloatingActionButton addButton;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private ArrayList<Task> listTask = new ArrayList<>();
    private SQLite helper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_task, container, false);

        addButton = root.findViewById(R.id.addButton);
        listView = root.findViewById(R.id.listView);

        helper = new SQLite(this.getActivity());

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CreateTaskActivity.class));
            }
        });

        showData();

        return root;
    }

    public void showData() {
        listTask.clear();

        Cursor res = helper.getAllData();
        while (res.moveToNext()) {
            String id = res.getString(0);
            String judul = res.getString(1);
            String date = res.getString(2);
            String kategori = res.getString(3);
            String isi = res.getString(4);

            listTask.add(new Task(id, judul, kategori, date, isi));
        }

        listViewAdapter = new ListViewAdapter(listTask, getActivity());
        listView.setAdapter(listViewAdapter);
    }
}
