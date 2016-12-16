package com.kuyun.test;

/**
 *
 * SimpleTrigger:
 * repeatInterval 重复间隔
 * repeatCount 重复次数。实际执行次数是 repeatCount+1。因为在startTime的时候一定会执行一次。** 下面有关repeatCount 属性的都是同理
 *
 * CalendarIntervalTrigger:
 * interval 执行间隔
 * intervalUnit 执行间隔的单位（秒，分钟，小时，天，月，年，星期）
 * 相较于SimpleTrigger有两个优势：1、更方便，比如每隔1小时执行，你不用自己去计算1小时等于多少毫秒。 2、支持不是固定长度的间隔，比如间隔为月和年。但劣势是精度只能到秒。
 *
 *
 * DailyTimeIntervalTrigger:指定每天的某个时间段内，以一定的时间间隔执行任务。并且它可以支持指定星期。
 * startTimeOfDay 每天开始时间
 * endTimeOfDay 每天结束时间
 * daysOfWeek 需要执行的星期
 * interval 执行间隔
 * intervalUnit 执行间隔的单位（秒，分钟，小时，天，月，年，星期）
 * repeatCount 重复次数
 *
 *
 *
 * CronTrigger:cron expression
 *
 *
 *
 *
 *
 *
 *
 *
 * SchdulerFactory，顾名思义就是来用创建Schduler了，有两个实现：DirectSchedulerFactory和 StdSchdulerFactory。前者可以用来在代码里定制你自己的Schduler参数。后者是直接读取classpath下的quartz.properties（不存在就都使用默认值）配置来实例化Schduler。通常来讲，我们使用StdSchdulerFactory也就足够了。
 *
 *
 * http://www.quartz-scheduler.org/documentation/quartz-2.2.x/cookbook/
 */
public class ReadMe {
}
