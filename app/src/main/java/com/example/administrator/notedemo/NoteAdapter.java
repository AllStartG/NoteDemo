package com.example.administrator.notedemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/3 0003.
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private List<Note> mNoteList;

    public NoteAdapter(ArrayList<Note> list) {
        mNoteList = list;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView notetitle,notetype,notetime,notecontent;


        public ViewHolder(View view) {
            super(view);
            notetitle = (TextView) view.findViewById(R.id.tv_title);
            notecontent = (TextView) view.findViewById(R.id.tv_content);
            notetype = (TextView) view.findViewById(R.id.type);
            notetime = (TextView) view.findViewById(R.id.time);
        }
    }

    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(NoteAdapter.ViewHolder holder, int position) {
        Note note = mNoteList.get(position);
        holder.notetitle.setText(note.getTitle());
        holder.notecontent.setText(note.getContent());
        holder.notetype.setText(note.getType());
        holder.notetime.setText(String.valueOf(note.getCreatetime()));

    }

    @Override
    public int getItemCount() {
        return mNoteList.size();
    }
}
