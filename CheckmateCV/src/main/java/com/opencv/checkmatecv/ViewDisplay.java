package com.opencv.checkmatecv;

import android.content.Context;
import android.view.View;

public interface ViewDisplay {
    void setCurrentView(Context context, View view);
    void removeCurrentView(Context context);
}
