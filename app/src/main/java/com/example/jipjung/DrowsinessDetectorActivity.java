package com.example.jipjung;

import android.os.Bundle;

import com.example.jipjung.helpers.FaceDetectorProcessor;

public class DrowsinessDetectorActivity extends VideoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setProcessor() {
        cameraSource.setMachineLearningFrameProcessor(new FaceDetectorProcessor(this));
    }
}