package com.example.uts_akb_if9_10118377.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper {
    private static final String DATABASE = "catatan.db";
    private static final String TABLE = "catatan";
    private static final String COL_1 = "id";
    private static final String COL_2 = "judul";
    private static final String COL_3 = "kategori";
    private static final String COL_4 = "isi";
    private static final String COL_5 = "date";

    public SQLite(@Nullable Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE + " (" +
                COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_2 + " TEXT, " +
                COL_3 + " TEXT, " +
                COL_4 + " TEXT, " +
                COL_5 + " TEXT" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
    }

    public boolean insertData(String judul, String kategori, String isi, String date) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL_2, judul);
        values.put(COL_3, kategori);
        values.put(COL_4, isi);
        values.put(COL_5, date);

        long results = db.insert(TABLE, null, values);

        return results != -1;
    }
}
