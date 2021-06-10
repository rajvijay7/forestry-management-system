package com.cg.fms.service;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.exception.SchedulerNotFoundException;
import com.cg.fms.entities.Scheduler;
import com.cg.fms.repository.SchedulerRepository;

import org.slf4j.LoggerFactory;

@Service
public class SchedulerServiceImpl implements ISchedulerService{
	
	Logger logger = LoggerFactory.getLogger(SchedulerServiceImpl.class);
	
	@Autowired
	private SchedulerRepository repository;// repository is a dependency of ProductServiceImpl

	@Override
	public Scheduler fetchById(int schedulerId) throws SchedulerNotFoundException {
		Optional<Scheduler> contract = repository.findById(schedulerId);
		if (!contract.isPresent())
			throw new SchedulerNotFoundException();
		return contract.get();
	}

	@Override
	public void updateScheduler(Scheduler scheduler) {
		repository.save(scheduler);
	
		
	}

	@Override
	public void delScheduler(int schedulerId) throws SchedulerNotFoundException {
		Optional<Scheduler> scheduler = repository.findById(schedulerId);
		if (!scheduler.isPresent())
			throw new SchedulerNotFoundException();

		repository.deleteById(schedulerId);
		
	}

	@Override
	public Scheduler addScheduler(Scheduler scheduler) {
		logger.info("inside addScheduler method of SchedulerServiceImpl");
		return repository.save(scheduler);
	}

	@Override
	public List<Scheduler> fetchAll() {
		return repository.findAll();
		
	}

	
	

}
