package com.rensy.listener;

import com.rensy.studentmanage.model.Student;

import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by renshunyu on 2018/8/26.
 */
public class MyListener implements ServletContextListener {
    public void contextInitialized(){
        System.out.println("The context is initialized！");


    }
    public  void  contextDestroyed(){
        System.out.println("The context is destroyed！");

    }

}
