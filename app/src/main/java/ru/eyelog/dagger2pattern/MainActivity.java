package ru.eyelog.dagger2pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        Button button01 = findViewById(R.id.button01);

        DParser dateParser = DaggerDParser.builder().build();

        button.setOnClickListener(v -> textView.setText(dateParser.getDateParser().parseThis(editText.getText().toString())));

        ZParser zParser = DaggerZParser.builder().build();

        button01.setOnClickListener(v -> textView.setText(zParser.getZaiParser().parseThis(editText.getText().toString())));
    }
}
