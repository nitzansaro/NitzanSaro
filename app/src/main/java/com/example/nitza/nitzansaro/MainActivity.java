package com.example.nitza.nitzansaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView w1;
    Button b1;
    EditText n1, n2, n3;
    String URL, a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w1 = (WebView) findViewById(R.id.w1);
        b1 = (Button) findViewById(R.id.b1);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        w1.getSettings().setJavaScriptEnabled(true);
    }

    public void pressed(View view) {
        URL = "https://www.google.co.il/search?q=";
        a = n1.getText().toString();
        b = n2.getText().toString();
        c = n3.getText().toString();
        if ((a.isEmpty()) || (b.isEmpty()) || (c.isEmpty())) {
            Toast.makeText(this, "there are missing numbers", Toast.LENGTH_SHORT).show();
        } else if (Double.parseDouble(a) == 0) {
            Toast.makeText(this, "change the first number", Toast.LENGTH_SHORT).show();
        } else {
            URL = URL + a + "x%5E2%2B" + b + "x%2b" + c;
            w1.loadUrl(URL);
        }
    }
}