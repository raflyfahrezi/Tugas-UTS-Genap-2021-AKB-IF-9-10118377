package com.example.uts_akb_if9_10118377.editTask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.uts_akb_if9_10118377.R;
import com.example.uts_akb_if9_10118377.database.SQLite;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class EditTaskActivity extends AppCompatActivity {

    private EditText judulEditText, kategoriEditText, isiEditText;
    private Date date;
    private SimpleDateFormat dateFormat;
    private Button submitButton;
    private SQLite helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_task);

        Bundle bundle = getIntent().getExtras();

        date = Calendar.getInstance().getTime();
        dateFormat = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());

        submitButton = findViewById(R.id.submitButton);
        judulEditText = findViewById(R.id.judul);
        kategoriEditText = findViewById(R.id.kategori);
        isiEditText = findViewById(R.id.isi);

        judulEditText.setText(bundle.getString("Judul"));
        kategoriEditText.setText(bundle.getString("Kategori"));
        isiEditText.setText(bundle.getString("Isi"));
    }
}