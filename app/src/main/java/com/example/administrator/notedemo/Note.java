package com.example.administrator.notedemo;

/**
 * Created by Administrator on 2017/5/3 0003.
 */

public class Note {

    public boolean isDel() {
        return isDel;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

//    public void setCreatetime(String createtime) {
//        try
//        {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
//            Date date = sdf.parse(createtime);
//            this.setCreatetime(date);
//        }
//        catch (ParseException e)
//        {
//
//        }
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    private String content;
    private String createtime;
    private String type;
    private boolean isDel;


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
