package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.newsapplication.Adapter.CustomAdapter;
import com.example.newsapplication.Models.NewsApiResponse;
import com.example.newsapplication.Models.NewsHeadlines;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener, View.OnClickListener {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    ProgressDialog dialog;
    Button button1, button2, button3, button4, button5, button6, button7;
    private long pressedTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Fetching news articles...");
        dialog.show();


        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(this);

        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener, "technology", null);


    }


    private final onFetchDataListener<NewsApiResponse> listener = new onFetchDataListener<NewsApiResponse>() {
        @Override
        public void onFetchData(List<NewsHeadlines> list, String message) {
            showNews(list);
            dialog.dismiss();
        }

        @Override
        public void onError(String message) {
            Toast.makeText(MainActivity.this, "An Error Occurred!!!", Toast.LENGTH_SHORT).show();
        }
    };



    private void showNews(List<NewsHeadlines> list) {
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);

        // Set the adapter first
        adapter = new CustomAdapter(this, list, this);
        recyclerView.setAdapter(adapter);

        // Now you can configure the layout
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }


    // After implements SelectListener
    @Override
    public void OnNewsClicked(NewsHeadlines headlines) {
        Intent intent = new Intent(MainActivity.this, NewsDetailsActivity.class);
        intent.putExtra("data", headlines);
        Log.d("IntentData", "Data added to intent: ");
        startActivity(intent);

//        startActivity(new Intent(MainActivity.this, NewsDetailsActivity.class)
//                .putExtra("Data", headlines));

    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String category = button.getText().toString();
        dialog.setTitle("Fetching news articles " + category);
        dialog.show();
        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener, category, null);
    }


    public void closeApp(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }


}