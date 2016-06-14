/*
package com.zsq.androidhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

*/
/**
 * Created by china on 2016/5/26.
 *//*

public class SecondActivity extends Activity {

    @Bind(R.id.btn_2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
        Button button = (Button) findViewById(R.id.btn_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data","Hello FirstActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        //ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_2)
    public void onClick() {
    }
}
*/
