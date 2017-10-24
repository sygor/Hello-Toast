package com.sygor.hellotoast;

/**
 * Created by mightysam on 10/14/17.
 */

class MainPresenterImpl implements MainPresenter {

    private int initialCount;
    private MainView view;

    public MainPresenterImpl(MainView view) {
        initialCount = 0;
        this.view = view;
    }

    @Override
    public void showToastClicked() {
        view.showToast(initialCount);
    }

    @Override
    public void countUpClicked() {
        initialCount++;
        view.updateCount(initialCount);
    }

    @Override
    public void init() {
        view.updateCount(initialCount);
    }

    @Override
    public void init(int initCount) {
        this.initialCount = initCount;
        init();
    }

    @Override
    public int getCount() {
        return initialCount;
    }
}
