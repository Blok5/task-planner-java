package ru.oleg.taskplanner.model;

import java.time.LocalDateTime;

public interface Repeatable {
    String getStringRepresentation();

    LocalDateTime getNextDateTime(LocalDateTime currentDateTime);
}
