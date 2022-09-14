package com.example.stdmgmtsysback.repository;

import com.example.stdmgmtsysback.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
