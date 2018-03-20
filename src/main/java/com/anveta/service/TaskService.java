package com.anveta.service;

import com.anveta.domain.Task;


public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
