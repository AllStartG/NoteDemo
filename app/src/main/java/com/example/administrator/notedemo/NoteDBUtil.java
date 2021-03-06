package com.example.administrator.notedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/11 0011.
 */

public class NoteDBUtil {

    public static boolean addNote(Context context, String title, String content, Date createtime) {
        ContentValues values = new ContentValues();
        values.put(TableNote.COL_ID, 1);
        values.put(TableNote.COL_TITLE, title);
        values.put(TableNote.COL_CONTENT, content);
        values.put(TableNote.COL_CREATE_DATE, String.valueOf(createtime));
        context.getContentResolver().insert(NoteContentProvider.NOTE_URI, values);
        return  true;
    }

    public static ArrayList<Note> getNoteList(Context context) {
        String[] projection = {TableNote.COL_ID, TableNote.COL_TITLE, TableNote.COL_CONTENT, TableNote.COL_CREATE_DATE, TableNote.COL_MODIFY_DATE, TableNote.COL_IS_DEL};
        Cursor c = context.getContentResolver().query(NoteContentProvider.NOTE_URI, projection, null,null, null);

        ArrayList<Note> noteList = new ArrayList<>();
        for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
            Note note = new Note();
            note.setId(c.getInt(0));
            note.setTitle(c.getString(1));
            note.setContent(c.getString(2));
            note.setCreatetime(c.getString(3));

            noteList.add(note);
        }
        c.close();
        return  noteList;
    }

}
