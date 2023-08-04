package com.Numitry.in.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Numitry.in.entity.User;

import lombok.Data;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	   @Query("SELECT e FROM Employee e WHERE e.hireDate BETWEEN :startDate AND :endDate")
	    List<User> findUserBetweenDates(LocalDate startDate, LocalDate endDate);

}
