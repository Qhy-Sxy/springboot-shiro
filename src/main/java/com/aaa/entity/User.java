package com.aaa.entity;

import java.util.Date;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 17:28
 */
public class User {
    private Integer id;

    private String userpwd;


    private String pic;
    private String username;

    private Date birthday;

    private String sex;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userpwd='" + userpwd + '\'' +
                ", pic='" + pic + '\'' +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String userpwd, String pic, String username, Date birthday, String sex, String address) {
        this.id = id;
        this.userpwd = userpwd;
        this.pic = pic;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }
}