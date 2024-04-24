package com.example.ToDo_Application.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo_Application.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}