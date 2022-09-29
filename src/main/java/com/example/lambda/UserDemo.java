package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class UserDemo {

    public static List<User> list = new ArrayList<>();  //准备一个集合，这个集合里面存放的是村子里面的人
      static {
        for (int i =0;i <150;i++){  //假设村子里面有150个人，就要给将这150个人存放进去；
            User user = new User();
            user.setAge(i);//设置年龄
            user.setName("名字："+i);//设置名字
            user.setGreen(Math.random()>0.2); //随机数大于0.2,健康码为绿色。
            user.setGender(Math.random()>0.5 ? "男":"女");  //随机数大于0.5是男，否则就是女
            list.add(user);
    }
    }
    //1、 男，17-75 ，健康宝绿色
    public static List<User> findStrongMan(){
          List<User> result = new ArrayList<>();  //将符合条件的数据放到这个集合当中；
        for (User user : list) {      //list.for 快捷生成增强for循环；
            if (user.getAge()>=17 && user.getAge()<=75 && user.getGreen() && "男".equals(user.getGender())){
            result.add(user);
            }
        }
        return  result;
    }
        //找出14-75，男，green
    public static List<User> findStrongMan2(){
          List<User> result2 = new ArrayList<>();
        for (User user : list) {
            if (user.getAge()>=17 && user.getAge()<=75 && user.getGreen() && "男".equals(user.getGender())){
               result2.add(user);
            }
        }
        return result2;
    }
    //找出14-24，女 ，green
    public static List<User> findGirl(){
          List<User> result3 = new ArrayList<>();
        for (User user : list) {
            if (user.getAge()>14 && user.getAge()<=24&&user.getGreen()&&"男".equals(user.getGender())){
                result3.add(user);
            }
        }
        return result3;
    }
}
