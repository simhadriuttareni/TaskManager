package com.simhadri.taskmanager.util;

import com.simhadri.taskmanager.dto.TaskRequestDto;
import com.simhadri.taskmanager.dto.TaskResponseDto;
import com.simhadri.taskmanager.model.Task;

public class TaskMapper {

    public static Task toEntity(TaskRequestDto dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus());
        return task;
    }

    public static TaskResponseDto toDto(Task task) {
        TaskResponseDto dto = new TaskResponseDto();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        dto.setCreatedAt(task.getCreatedAt());
        return dto;
    }
}
