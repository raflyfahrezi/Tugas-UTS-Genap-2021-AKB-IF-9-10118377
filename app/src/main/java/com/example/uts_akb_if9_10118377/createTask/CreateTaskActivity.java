package com.example.uts_akb_if9_10118377.createTask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.uts_akb_if9_10118377.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CreateTaskActivity extends AppCompatActivity {

    private EditText judul, kategori, isi;
    private Date date;
    private SimpleDateFormat dateFormat;
    private String formattedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        date = Calendar.getInstance().getTime();
        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        judul = findViewById(R.id.judul);
        kategori = findViewById(R.id.kategori);
        isi = findViewById(R.id.isi);
        formattedDate = dateFormat.format(date);
    }
}