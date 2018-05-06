package com.simucsd.simucsd.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.simucsd.simucsd.R;

public class MainActivity extends Activity    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        character character_1 = new character("Alex",true,100,100,100,100 );



        Log.d("gfdfde",String.valueOf(character_1.GPA));
    }
}
