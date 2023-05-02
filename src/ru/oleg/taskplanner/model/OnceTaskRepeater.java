package ru.oleg.taskplanner.model;

import java.time.LocalDateTime;

public class OnceTaskRepeater implements Repeatable {
    @Override
    public LocalDateTime getNextDateTime(LocalDateTime currentDateTime) {
        // Задача с типом "однократная" не повторяется,
        // поэтому возвращаем null или бросаем исключение, если требуется обработка ошибки.
        return null;
    }

    @Override
    public String getStringRepresentation() {
        return "Однократная";
    }
}
