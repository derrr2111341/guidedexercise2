package com.example.guidedexercise2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etNameGE2);
        click = findViewById(R.id.btnClickGE2);
        showResult();
    }

    public void showResult(){
        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                StyleableToast.makeText(MainActivity.this, "Hello " + name.getText().toString() + "! \n Welcome to Android Development!",
                        R.style.exampleToast).show();
            }
        });
    }
}