/*

3 Juni 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

 */

package com.example.uts_akb_if9_10118377.base;

public interface Presenter <T extends View> {
    void onAttach(T view);
    void onDetach();
}
