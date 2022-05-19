package com.example.greetingappapplication.repository;

import com.example.greetingappapplication.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {
}
