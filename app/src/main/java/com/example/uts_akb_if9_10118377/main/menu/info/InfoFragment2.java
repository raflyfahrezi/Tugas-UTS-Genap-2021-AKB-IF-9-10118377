/*

4 Juni 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

 */

package com.example.uts_akb_if9_10118377.main.menu.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uts_akb_if9_10118377.R;

public class InfoFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_info_pages_2, container, false);

        return root;
    }
}
