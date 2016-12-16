package com.kuyun.test.jobs;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import java.util.List;

import static org.quartz.JobKey.jobKey;

/**
 * Created by xuwuqiang on 2016/12/15.
 */
public class FindJob {
    public static void main(String[] args) throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        Finding Triggers of a Job


        List<? extends Trigger> jobTriggers = scheduler.getTriggersOfJob(jobKey("jobName", "jobGroup"));
    }
}
