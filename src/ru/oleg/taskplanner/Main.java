package ru.oleg.taskplanner;

import ru.oleg.taskplanner.engine.Engine;
import ru.oleg.taskplanner.model.DailyRepeatable;
import ru.oleg.taskplanner.model.OnceTaskRepeater;
import ru.oleg.taskplanner.model.WeeklyRepeatable;
import ru.oleg.taskplanner.model.enums.TaskType;
import ru.oleg.taskplanner.repository.TaskRepository;
import ru.oleg.taskplanner.service.TaskService;

import java.time.LocalDateTime;

public class Main {
    private static final TaskRepository taskRepository = new TaskRepository();
    private static final TaskService taskService = new TaskService(taskRepository);

    public static void main(String[] args) {
        populateTestData();

        new Engine(taskService).start();
    }

    private static void populateTestData() {
        taskService.addTask("n1", "s1", TaskType.PERSONAL,
                LocalDateTime.of(2022, 5, 10, 15, 30),
                new WeeklyRepeatable());
        taskService.addTask("n2", "s2", TaskType.PERSONAL,
                LocalDateTime.of(2022, 5, 14, 12, 30),
                new DailyRepeatable());
        taskService.addTask("n3", "s3", TaskType.PERSONAL,
                LocalDateTime.of(2022, 5, 17, 13, 30),
                new OnceTaskRepeater());
        taskService.addTask("n3", "s3", TaskType.PERSONAL,
                LocalDateTime.of(2022, 5, 16, 13, 30),
                new OnceTaskRepeater());
    }


}