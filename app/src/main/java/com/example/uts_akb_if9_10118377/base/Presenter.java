package com.example.uts_akb_if9_10118377.base;

public interface Presenter <T extends View> {
    void onAttach(T view);
    void onDetach();
}
