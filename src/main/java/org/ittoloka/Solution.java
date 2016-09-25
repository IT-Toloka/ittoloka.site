package org.ittoloka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SeVlad on 09.09.2016.
 */
public class Solution {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
        User user;
        user = (User) context.getBean("user");
        System.out.println(user);
        Logger logger = (Logger)context.getBean("logger");
        logger.writeConsole("Hello console");
        logger.writeFile("Hello file!");
    }

}
