package com.joharteaga.photominder;

import android.hardware.Camera;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class CreateMinder extends AppCompatActivity implements View.OnClickListener {
    private Camera camera;
    private CameraPreview preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_minder);

        ImageButton snapShot = (ImageButton) findViewById(R.id.snapShotBtn);

        snapShot.setOnClickListener(this);

        camera = getCameraInstance();

        preview = new CameraPreview(CreateMinder.this, camera);

        FrameLayout preview = (FrameLayout) findViewById(R.id.cameraFrame);
        preview.addView(preview);

    }

    //get camera instance safely; from Google Tutorial
    public Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.snapShotBtn:
                break;
            default:
                break;
        }
    }
}
