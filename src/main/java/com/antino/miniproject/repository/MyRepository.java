package com.antino.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antino.miniproject.entity.Post;



@Repository
public interface MyRepository extends JpaRepository<Post, Integer> {
	
	

}
