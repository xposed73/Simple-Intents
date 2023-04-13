package com.simpleintents;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.simpleintents.library.SimpleIntents;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.array_intents);

        final ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.textView, listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, position, l) -> {

            switch (position){

                case 0: SimpleIntents.from(MainActivity.this).openLink("https://google.com/");
                    break;

                case 1: SimpleIntents.from(MainActivity.this).showInMarket(getPackageName());
                    break;

                case 2:
                    String[] email = {"email@example.com" , "another@gmail.com"}; // you can add multiple emails
                    SimpleIntents.from(MainActivity.this).sendEmail(email, "", "");
                    break;

                case 3: SimpleIntents.from(MainActivity.this).showDialNumber("0123456789");
                    break;

                case 4: SimpleIntents.from(MainActivity.this).shareText("Subject", "This is your message, bla bla bla.");
                    break;

            }

        });
    }
}