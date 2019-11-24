package com.testcenter.mall.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program: mall
 * @Description：定时任务serivce
 * @Author: huaxin
 * @Aate: 2019/11/24
 **/

@Service
public class SchedulerTaskService {

    private int count = 1;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "*/6 * * * * ?")
    private void process() {
        System.out.println("this is scheduler task running" + (count++));
    }


    @Scheduled(fixedRate = 6000)
    private void reportCurrentTime() {
        System.out.println("现在时间是：" + dateFormat.format(new Date()));
    }
}
