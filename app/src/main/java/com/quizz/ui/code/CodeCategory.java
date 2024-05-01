package com.quizz.ui.code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.quizz.R;

public class CodeCategory extends AppCompatActivity {

    ListView programs;
    String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_category3);

        loadCategory();

        programs = findViewById(R.id.programs);
        CustomAdapter adapter = new CustomAdapter();
        programs.setAdapter(adapter);
        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CodeCategory.this,CodeActivity.class);
                startActivity(intent);
            }
        });


    }

    private void loadCategory() {
        final String chap1[]={"1. Write a program to add two number with user input in Java"};
        final String chap2[]={"2. Write a program to add two number with user input in Java"};
        final String chap3[]={"3. Write a program to add two number with user input in Java"};
        final String chap4[]={"4. Write a program to add two number with user input in Java"};
        final String chap5[]={"5. Write a program to add two number with user input in Java"};
        final String chap6[]={"6. Write a program to add two number with user input in Java"};
        final String chap7[]={"7. Write a program to add two number with user input in Java"};
        final String chap8[]={"8. Write a program to add two number with user input in Java"};

        String category = getIntent().getStringExtra("codeCategory");
        switch (category){
            case "chapter1":
                list = chap1;
                break;
            case "chapter2":
                list = chap2;
                break;
            case "chapter3":
                list = chap3;
                break;
            case "chapter4":
                list = chap4;
                break;
            case "chapter5":
                list = chap5;
                break;
            case "chapter6":
                list = chap6;
                break;
            case "chapter7":
                list = chap7;
                break;
            case "chapter8":
                list = chap8;
                break;
        }

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.code_category_item_layout, null);

            TextView textView= view.findViewById(R.id.code_title);
            textView.setText(list[i]);

            return view;
        }
    }
}