package com.quizz.chaptertopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.quizz.R;
import com.quizz.chapter.four.javascript;
import com.quizz.chapter.one.Android;
import com.quizz.chapter.one.java;
import com.quizz.chapter.two.php;

public class TopicActivity extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String chapterName;
    TopicAdapter adapter;
    String arr[] = null;
    ImageView chapterImage;

    String chapter1[]={"Java","Android","Sub Heading 1","Sub Heading 1"};
    String chapter2[]={"PHP","Sub Heading 2","Sub Heading 2","Sub Heading 2","Sub Heading 2","Sub Heading 2","Sub Heading 2","Sub Heading 2"};
    String chapter3[]={"Sub Heading 3","Sub Heading 3","Sub Heading 3","Sub Heading 3","Sub Heading 3","Sub Heading 3","Sub Heading 3","Sub Heading 3"};
    String chapter4[]={"Javascript","Sub Heading 4","Sub Heading 4","Sub Heading 4","Sub Heading 4","Sub Heading 4","Sub Heading 4","Sub Heading 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        toolbar = findViewById(R.id.toolbar);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);

        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chapterName = getIntent().getStringExtra("chapterName");

        chapterImage=findViewById(R.id.chapter_image);
        compareAandOpen();
    }

    private void compareAandOpen() {

        if (chapterName.equals("heading1")){
            arr = chapter1;
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading 1");
        }
        else if (chapterName.equals("heading2")) {
            arr = chapter2;
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading 2");
        }
        else if (chapterName.equals("heading3")) {
            arr = chapter3;
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading 3");
        }
        else if (chapterName.equals("heading4")) {
            arr = chapter4;
            Glide.with(TopicActivity.this)
                    .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                    .into(chapterImage);
            getSupportActionBar().setTitle("heading 4");
        }
        else
            arr = null;

        adapter= new TopicAdapter(arr, TopicActivity.this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                openActivity(arr[i]);
            }

            private void openActivity(String s) {
                switch (s){
                    case "Java":
                        startActivity(new Intent(TopicActivity.this, java.class));
                        break;
                    case "Android":
                        startActivity(new Intent(TopicActivity.this, Android.class));
                        break;
                    case "PHP":
                        startActivity(new Intent(TopicActivity.this, php.class));
                        break;
                    case "Javascript":
                        startActivity(new Intent(TopicActivity.this, javascript.class));
                        break;


                }
            }
        });

    }
}