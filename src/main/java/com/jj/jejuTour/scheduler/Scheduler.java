package com.jj.jejuTour.scheduler;

import com.jj.jejuTour.util.NormalUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@EnableScheduling
public class Scheduler {
    private final Logger logger = LoggerFactory.getLogger(Scheduler.class);

    @Resource(name = "normalUtil")
    private NormalUtil normalUtil;

    @Scheduled(cron = "0 0 6 * * *?") //매일 오전 6시
    public void tourPlaceInsertJsonScheduler () {
        logger.debug("===== Scheduler tourPlaceInsertJsonScheduler RUN=====");
        normalUtil.getVisitJejuJson();
    }
}
