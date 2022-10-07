package com.example.WebApplication.repository;

import com.example.WebApplication.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

public interface EmailRepository extends JpaRepository<Email, String>{

}
