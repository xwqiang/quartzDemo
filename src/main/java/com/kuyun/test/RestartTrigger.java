package com.kuyun.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
import static org.quartz.CalendarIntervalScheduleBuilder.*;
import static org.quartz.JobKey.*;
import static org.quartz.TriggerKey.*;
import static org.quartz.DateBuilder.*;
import static org.quartz.impl.matchers.KeyMatcher.*;
import static org.quartz.impl.matchers.GroupMatcher.*;
import static org.quartz.impl.matchers.AndMatcher.*;
import static org.quartz.impl.matchers.OrMatcher.*;
import static org.quartz.impl.matchers.EverythingMatcher.*;
/**
 * Created by xuwuqiang on 2016/12/15.
 */
public class RestartTrigger {
    public static void main(String[] args) throws SchedulerException {
        replaceTrigger();

    }

    private static void replaceTrigger() throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        // Define a new Trigger
        Trigger trigger = newTrigger()
                .withIdentity("newTrigger", "group1")
                .startNow()
                .build();

        // tell the scheduler to remove the old trigger with the given key, and put the new one in its place
        scheduler.rescheduleJob(triggerKey("oldTrigger", "group1"), trigger);

        //Deleting a Job and Unscheduling All of Its Triggers
        scheduler.deleteJob(jobKey("job1", "group1"));

        // Unschedule a particular trigger from the job (a job may have more than one trigger)
        scheduler.unscheduleJob(triggerKey("trigger1", "group1"));


    }
}
