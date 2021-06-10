package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entities.Scheduler;

import com.cg.fms.exception.SchedulerNotFoundException;

public interface ISchedulerService {
	
	 Scheduler fetchById(int schedulerId) throws SchedulerNotFoundException;

	 void updateScheduler(Scheduler scheduler);

	 void delScheduler(int schedulerId) throws  SchedulerNotFoundException;

	  Scheduler addScheduler(Scheduler scheduler);
	
	 List<Scheduler> fetchAll();
}