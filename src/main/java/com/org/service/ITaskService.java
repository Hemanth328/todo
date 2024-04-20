package com.org.service;

import java.util.List;

import com.org.entity.TaskEntity;
import com.org.formbinding.TaskBinding;

public interface ITaskService {
	
//	public TaskEntity saveUser(TaskEntity user);
	
	public TaskEntity createTask(TaskBinding taskbinding, Integer userId);
	
	
	public List<TaskEntity> taskList(Integer userId);
}
