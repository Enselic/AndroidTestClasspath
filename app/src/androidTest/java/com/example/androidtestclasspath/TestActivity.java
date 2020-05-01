package com.example.androidtestclasspath;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView content = new AppCompatTextView(this);
        content.setText("AppCompatTextView works");
        setContentView(content);
    }
}
