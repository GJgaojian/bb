package cn.baizhi.test;

import cn.baizhi.entity.Admin;
import lombok.extern.java.Log;

@Log
public class LombokTest {
  
    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.setId("111");
        admin.setPassword("ffff");
        System.out.println(admin);
        System.out.println(admin.toString());
        System.out.println(admin.getPassword());


        System.out.println("------------");

        Admin admin1 = new Admin("1", "2", "2", 1);
//        System.out.println(admin1);

    }
} 