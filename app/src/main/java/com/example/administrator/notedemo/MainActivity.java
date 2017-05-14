package com.example.administrator.notedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Note> List = new ArrayList<>();
    private NoteAdapter adapter;
    private ImageButton imgadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        initNote();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        adapter  = new NoteAdapter(List);
        mRecyclerView.setAdapter(adapter);

    }

    private void initNote() {
        Note note = new Note();
        note.setTitle("第一次记事");
        note.setContent("haha");
        note.setType(Type.Life);
        note.setCreatetime(String.valueOf(new Date()));
        List.add(note);



    }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        imgadd = (ImageButton) findViewById(R.id.img_add);

        imgadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });
    }
}
