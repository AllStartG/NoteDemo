package com.example.administrator.notedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Note> List = new ArrayList<Note>();
    private NoteAdapter adapter;

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
        for (int i=0;i<3;i++){
            Note note = new Note();
            note.setTitle("第一次记事");
            note.setType(Type.Life);
            note.setCreatetime(String.valueOf(new Date()));
            List.add(note);

            Note note1 = new Note();
            note.setTitle("第二次记事");
            note.setType(Type.love);
            note.setCreatetime(String.valueOf(new Date()));
            List.add(note1);
        }

    }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }
}
