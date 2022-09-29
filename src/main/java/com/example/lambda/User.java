package com.example.lambda;

public class User {
    private  String  name; //名字
    private Integer age;   //年龄
    private String gender; //性别
    private Boolean green;  //健康宝

    public User(){}   //空参构造
    public User(String name,Integer age,String gender,Boolean green){  //全参构造
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.green=green;
    }
    public Integer getAge() {return age;
    }
    public void setAge(Integer age) {this.age = age;
    }
    public String getName(){ return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public Boolean getGreen(){
        return green;
    }
    public void setGreen(Boolean green){
        this.green=green;
    }

}
