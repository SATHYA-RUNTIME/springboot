package com.afterlearn.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afterlearn.demo.model.Cricket;

@Repository
public interface CricketRepository extends JpaRepository<Cricket,Integer>  {
    
}
