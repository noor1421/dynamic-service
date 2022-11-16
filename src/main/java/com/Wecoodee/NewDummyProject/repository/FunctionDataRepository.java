package com.Wecoodee.NewDummyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Wecoodee.NewDummyProject.model.FunctionData;

@Repository
public interface FunctionDataRepository extends JpaRepository<FunctionData, Integer>{

}
