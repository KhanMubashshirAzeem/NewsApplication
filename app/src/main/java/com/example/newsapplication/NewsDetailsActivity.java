package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newsapplication.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

public class NewsDetailsActivity extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView text_title, text_author, text_time, text_detail, text_content;
    ImageView image_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        text_title = findViewById(R.id.text_detail_title);
        text_author = findViewById(R.id.text_detail_author);
        text_time = findViewById(R.id.text_detail_time);
        text_detail = findViewById(R.id.text_detail_detail);
        text_content = findViewById(R.id.text_detail_content);
        image_news = findViewById(R.id.img_detail_news);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");

        if (headlines != null) {
            text_title.setText(headlines.getTitle());
            text_author.setText(headlines.getAuthor());
            text_time.setText(headlines.getPublishedAt());
            text_detail.setText(headlines.getDescription());
            text_content.setText(headlines.getContent());

            // Move this line inside the if statement
            String imageUrl = headlines.getUrlToImage();
            Picasso.get().load(imageUrl).into(image_news);
        } else {
            // Handle the case where headlines is null
            // You can show an error message or perform some other action here
            Toast.makeText(this, "Your headlines is null !!", Toast.LENGTH_SHORT).show();
        }
    }


}
