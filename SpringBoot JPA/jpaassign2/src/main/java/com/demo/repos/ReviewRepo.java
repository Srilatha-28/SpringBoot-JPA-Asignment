package com.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Course;
import com.demo.entities.Product;
import com.demo.entities.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer>{

}
