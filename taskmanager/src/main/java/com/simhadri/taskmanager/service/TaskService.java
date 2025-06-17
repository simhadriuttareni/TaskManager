package com.simhadri.taskmanager.service;

import com.simhadri.taskmanager.dto.TaskRequestDto;
import com.simhadri.taskmanager.dto.TaskResponseDto;

import java.util.List;

public interface TaskService {
    TaskResponseDto createTask(TaskRequestDto taskRequestDto);
    List<TaskResponseDto> getAllTasks();
    TaskResponseDto getTaskById(Long id);
    TaskResponseDto updateTask(Long id, TaskRequestDto taskRequestDto);
    void deleteTask(Long id);
}
