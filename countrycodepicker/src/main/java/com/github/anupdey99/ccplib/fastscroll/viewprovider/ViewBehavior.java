package com.github.anupdey99.ccplib.fastscroll.viewprovider;


public interface ViewBehavior {
    void onHandleGrabbed();
    void onHandleReleased();
    void onScrollStarted();
    void onScrollFinished();
}
