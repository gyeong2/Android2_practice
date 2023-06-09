package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.button1){
                    Intent intent = new Intent(MainActivity.this, Exam1Activity.class);
                    startActivity(intent);
                } else if (id == R.id.button2){
                    Intent intent = new Intent(MainActivity.this, Exam2Activity.class);
                    startActivity(intent);
                }

            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
    }
}