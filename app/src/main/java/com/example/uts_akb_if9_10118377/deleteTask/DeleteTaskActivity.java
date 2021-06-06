/*

5 Juni 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

 */

package com.example.uts_akb_if9_10118377.deleteTask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.uts_akb_if9_10118377.R;
import com.example.uts_akb_if9_10118377.database.SQLite;
import com.example.uts_akb_if9_10118377.editTask.EditTaskActivity;
import com.example.uts_akb_if9_10118377.main.MainActivity;

public class DeleteTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_task);

        getSupportActionBar().hide();

        Button yesButton = findViewById(R.id.deleteYes);
        Button noButton = findViewById(R.id.deleteNo);

        SQLite helper = new SQLite(this);

        Bundle bundle = getIntent().getExtras();
        String id = bundle.getString("Id");

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer isSuccess = helper.deteleData(id);

                if (isSuccess > 0) {
                    Toast.makeText(DeleteTaskActivity.this, "Data has been remove", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(DeleteTaskActivity.this, MainActivity.class));
                    finish();
                } else {
                    Toast.makeText(DeleteTaskActivity.this, "Data failed to remove", Toast.LENGTH_SHORT).show();
                }
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeleteTaskActivity.this, MainActivity.class));
            }
        });
    }
}