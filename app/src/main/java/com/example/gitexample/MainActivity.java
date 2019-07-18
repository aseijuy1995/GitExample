package com.example.gitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //chg not staged for commit
        //chg to be committed
        //git diff
        //git diff --staged (only show is add file)
        //git commit
        //git commit -a
        //git mv (renamed)
        //git log
        //git log -p -1
    }
}
