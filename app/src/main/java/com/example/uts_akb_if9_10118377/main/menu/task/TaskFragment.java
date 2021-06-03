package com.example.uts_akb_if9_10118377.main.menu.task;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import com.example.uts_akb_if9_10118377.R;

public class TaskFragment extends Fragment{
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container) {
        View root = inflater.inflate(R.layout.fragment_task, container, false);

        return root;
    }
}
