package com.example.Sem3.Homework;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping("/body") // запрос на добавление пользователя (a)
    public String addUser(@RequestBody User user) {
        users.add(user);
        return "Пользователь успешно добавлен: " + user.getName();
    }

    @GetMapping("") // запрос на получение списка пользователей (b)
    public List<User> getUsers() {
        return users;
    }
}

@RestController
@RequestMapping("/tasks")
class TaskController {

    @GetMapping("/sort") // запрос на проверку сортировки (c)
    public String sortTasks() {
        // реализация проверки сортировки
        return "Sorting tasks";
    }

    @GetMapping("/filter/{age}") // запрос на проверку фильтрации (d)
    public String filterTasks(@PathVariable int age) {
        // реализация проверки фильтрации по возрасту
        return "Filtering tasks by age: " + age;
    }

    @GetMapping("/calc") // запрос на проверку среднего арифметического (e)
    public String calculateAverage() {
        // реализация вычисления среднего арифметического
        return "Calculating average";
    }
}
