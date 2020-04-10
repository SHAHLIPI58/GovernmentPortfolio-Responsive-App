package com.example.myapp_knowyourgovernment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    private TextView apiclickeventtextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        apiclickeventtextview = (TextView)findViewById(R.id.apiclickeventtextview);
        apiclickeventtextview.setText(Html.fromHtml("<p><u>Google Civic Information API</u></p>"));
        apiclickeventtextview.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String url = "https://developers.google.com/civic-information/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        apiclickeventtextview.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
