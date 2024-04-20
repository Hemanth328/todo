package com.org.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.entity.TaskEntity;
import com.org.entity.UserEntity;

public interface TaskEntityRepo extends JpaRepository<TaskEntity, Integer> {		
	
	@Query("from TaskEntity where user = :userId")
	List<TaskEntity> findAllByUser(UserEntity userId);

}
