package com.example.sliders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;

public class MainActivity extends AppCompatActivity {

    AppCompatSeekBar appCompatSeekBar;
    TextView appCompatSeekBarValue;
    TextView RangeBar1Value;
    TextView RangeBar2LeftValue;
    TextView RangeBar2RightValue;
    RangeBar RangeBar1;
    RangeBar RangeBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatSeekBar=(AppCompatSeekBar)findViewById(R.id.appcompatseekbar_id);
        appCompatSeekBarValue=(TextView) findViewById(R.id.AppCompatSeekBar_value);
        RangeBar1=(RangeBar)findViewById(R.id.RangeBar1_id);
        RangeBar1Value=(TextView)findViewById(R.id.RangeBar1_value);
        RangeBar2=(RangeBar)findViewById(R.id.RangeBar2_id);
        RangeBar2LeftValue=(TextView)findViewById(R.id.RangeBar2_LeftValue);
        RangeBar2RightValue=(TextView)findViewById(R.id.RangeBar2_RightValue);

        appCompatSeekBar.setProgress(0);
        appCompatSeekBar.setKeyProgressIncrement(1);
        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

             String value=String.valueOf(i);
             appCompatSeekBarValue.setText(value);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

        RangeBar1.setSeekPinByIndex(0);
        RangeBar1.setPinTextColor(getResources().getColor(R.color.colorAccent));
        RangeBar1.setSelectorColor(getResources().getColor(R.color.colorAccent));
        RangeBar1.setTickColors(getResources().getColor(R.color.colorAccent));
        RangeBar1.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
        RangeBar1.setBarColor(getResources().getColor(R.color.colorAccent));
        RangeBar1.setPinColor(getResources().getColor(R.color.colorAccent));




        RangeBar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {


                RangeBar1Value.setText(rightPinValue);
            }

            @Override
            public void onTouchStarted(RangeBar rangeBar) {

            }

            @Override
            public void onTouchEnded(RangeBar rangeBar) {

            }
        });


        RangeBar2.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {

                RangeBar2LeftValue.setText(leftPinValue);
                RangeBar2RightValue.setText(rightPinValue);
            }

            @Override
            public void onTouchStarted(RangeBar rangeBar) {

            }

            @Override
            public void onTouchEnded(RangeBar rangeBar) {

            }
        });


    }
}
