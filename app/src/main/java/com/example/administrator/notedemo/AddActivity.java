package com.example.administrator.notedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class AddActivity extends AppCompatActivity {
    private Button btn_save;
    private EditText Addtitle,Addcontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        Addtitle = (EditText) findViewById(R.id.add_title);
        Addcontent = (EditText) findViewById(R.id.add_content);
        btn_save = (Button) findViewById(R.id.add_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String addtitle = Addtitle.getText().toString();
                String addcontent = Addcontent.getText().toString();
                Date date = new Date();
                if(addtitle == null && addcontent == null){
                    Toast.makeText(AddActivity.this,"请输入标题或内容",Toast.LENGTH_SHORT).show();
                }else{
                    NoteDBUtil.addNote(AddActivity.this, addtitle, addcontent, date);
                    Intent intent = new Intent(AddActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
