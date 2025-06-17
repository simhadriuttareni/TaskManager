package com.simhadri.taskmanager.dto;

public class TaskRequestDto {
    private String title;
    private String description;
    private String status;

    public TaskRequestDto() {}

    public TaskRequestDto(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
