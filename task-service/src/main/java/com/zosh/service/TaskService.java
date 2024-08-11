package com.zosh.service;

import com.zosh.model.Task;
import com.zosh.model.TaskStatus;

import java.util.List;

public interface TaskService {

    Task createTask(Task task,String requesterRole) throws Exception;

    Task getTaskById(Long id) throws Exception;

    List<Task> getAllTask(TaskStatus status);

    Task updateTask(Long id,Task updatedTask,Long userId) throws Exception;

    void deleteTask(Long id) throws Exception;

    Task assignedToUser(Long userId,Long taskId) throws Exception;

    List<Task>assignedUsersTask(Long userId,TaskStatus status);

    Task completeTask(Long taskId) throws Exception;
}
