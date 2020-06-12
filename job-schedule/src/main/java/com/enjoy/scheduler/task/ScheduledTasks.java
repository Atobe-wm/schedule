package com.enjoy.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Created by wm on 2018/5/11.
 * 定时任务操作业务
 */
@Component
public class ScheduledTasks {

    /**
     * 每天12点执行一次
     */
    @Scheduled(cron = " 0 0 12 * * ? ")
    public void manageCmdSend(){
        System.out.println("测试");
    }


}
