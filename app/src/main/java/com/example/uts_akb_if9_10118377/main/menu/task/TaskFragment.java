package com.example.uts_akb_if9_10118377.main.menu.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.uts_akb_if9_10118377.R;
import com.example.uts_akb_if9_10118377.createTask.CreateTaskActivity;
import com.example.uts_akb_if9_10118377.model.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TaskFragment extends Fragment {
    private FloatingActionButton addButton;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private ArrayList<Task> listTask = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_task, container, false);

        addButton = root.findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CreateTaskActivity.class));
            }
        });


        return root;
    }
}
