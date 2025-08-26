package com.unla.monipass.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unla.monipass.entities.UserLog;

@Repository
public interface UserLogRepository extends CrudRepository<UserLog, Integer> {

}
