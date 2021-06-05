package com.example.uts_akb_if9_10118377.model;

public class Task {
    private String id;
    private String judul;
    private String date;
    private String isi;

    public Task(String id, String judul, String date, String isi) {
        this.id = id;
        this.judul = judul;
        this.date = date;
        this.isi = isi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
