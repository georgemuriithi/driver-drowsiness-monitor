package com.example.jipjung;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.jipjung.helpers.FaceDetectorProcessor;

public class DrowsinessDetectorActivity extends VideoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    @Override
    protected void setProcessor() {
        cameraSource.setMachineLearningFrameProcessor(new FaceDetectorProcessor(this));
    }
}