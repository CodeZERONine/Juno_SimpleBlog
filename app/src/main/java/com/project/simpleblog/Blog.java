package com.project.simpleblog;

/**
 * Created by akshanshgusain on 3/1/17.
 */

public class Blog
{
    private String title,desc,Image;
    private String username;
    public Blog()
    {


    }

    public Blog(String title, String desc, String Image,String username) {
        this.title = title;
        this.desc = desc;
        this.Image = Image;
        this.username = username;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
