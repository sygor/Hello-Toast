package com.sygor.hellotoast;

/**
 * Created by mightysam on 10/14/17.
 */

public interface MainPresenter {
    void showToastClicked();
    void countUpClicked();
    void init();
    void init(int initialCount);
    int getCount();
}
