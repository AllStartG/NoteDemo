package com.example.administrator.notedemo;

/**
 * Created by Administrator on 2017/5/3 0003.
 */

public class Note {

    public Note(){

    }

    public Note(String title,String content,String createtime,String img,String video,String music,String type) {
        this.title = title;
//        this.content = content;
        this.createtime = createtime;
//        this.img = img;
//        this.video = video;
//        this.music = music;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

//    public String getVideo() {
//        return video;
//    }
//
//    public void setVideo(String video) {
//        this.video = video;
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img;
//    }
//
//    public String getMusic() {
//        return music;
//    }
//
//    public void setMusic(String music) {
//        this.music = music;
//    }

    private String title;
//    private String content;
    private String createtime;
//    private String img;
//    private String video;
//    private String music;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
}
