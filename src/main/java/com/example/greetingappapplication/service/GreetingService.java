package com.example.greetingappapplication.service;

import com.example.greetingappapplication.model.Greeting;
import com.example.greetingappapplication.repository.GreetingAppRepository;
import com.example.greetingappapplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private static String template = "Hello %s";
    @Autowired
    GreetingAppRepository repository;

    public String getMessage() {
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        return "Hello " + firstName + "" + lastName;
    }

    public String postMessage(User user) {
        return "Hello " + user.getfirstName() + "" + user.getlastName();
    }

    public Greeting saveMessage(Greeting greeting) {
        Greeting newGreeting = new Greeting(String.format(template, greeting.getContent()));
        repository.save(newGreeting);
        return newGreeting;
    }

    public String getData(Integer id) {
        Greeting newGreeting = repository.getById(id);
        return newGreeting.getContent();
    }

    public List<Greeting> getAllData() {
        return repository.findAll();
    }
}