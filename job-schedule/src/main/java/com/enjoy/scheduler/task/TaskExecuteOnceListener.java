package com.enjoy.scheduler.task;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author weimin
 * @Desc 项目启动时只执行一次
 * @Date 2018/12/13
 */
@WebListener
public class TaskExecuteOnceListener implements ServletContextListener {

    /**
     * 项目启动执行
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("--------contextInitialized------- " + System.currentTimeMillis());
    }

    /**
     * 项目终止时执行
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("--------contextDestroyed-------- " + System.currentTimeMillis());
    }
}
