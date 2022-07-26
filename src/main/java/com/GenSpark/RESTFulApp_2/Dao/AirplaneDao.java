package com.GenSpark.RESTFulApp_2.Dao;

import com.GenSpark.RESTFulApp_2.Entity.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneDao extends JpaRepository<Airplane, Integer> {
}
