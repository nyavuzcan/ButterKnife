package com.example.butterknife;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textv)
    TextView txtv;
    @BindView(R.id.clickmebtn)
    Button clickmebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        txtv.setText("Test");


    }
        
    @OnClick(R.id.clickmebtn)
    public void onBackClicked() {

        Toast.makeText(this, "Basıldı", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.textv)
    public void onViewClicked() {
        Toast.makeText(getApplicationContext(),"PressText",Toast.LENGTH_LONG).show();
    }
}
