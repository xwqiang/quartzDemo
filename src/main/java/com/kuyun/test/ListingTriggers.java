package com.kuyun.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;

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
public class ListingTriggers {
    public static void main(String[] args) throws Exception {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        // enumerate each trigger group
        for(String group: scheduler.getTriggerGroupNames()) {
            // enumerate each trigger in group
            for(TriggerKey triggerKey : scheduler.getTriggerKeys(GroupMatcher.<TriggerKey>groupEquals(group))) {
                System.out.println("Found trigger identified by: " + triggerKey);
            }
        }
    }
}
