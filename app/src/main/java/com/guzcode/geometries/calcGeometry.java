package com.guzcode.geometries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calcGeometry extends AppCompatActivity {

    private EditText triWidth;
    private EditText triHeight;
    private TextView triResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_geometry);
        triWidth = (EditText) findViewById(R.id.tri1data);
        triHeight = (EditText) findViewById(R.id.tri2data);
        triResult = (TextView) findViewById(R.id.triResult);
    }

    public void calcTri (View view){
        int result = (Integer.parseInt(triHeight.getText().toString())  * Integer.parseInt(triWidth.getText().toString())) / 2;
        triResult.setText("Result: " + String.valueOf(result)  );
    }

    public void back (View view){
        Intent back = new Intent(this , MainActivity.class);
        startActivity(back);
    }
}