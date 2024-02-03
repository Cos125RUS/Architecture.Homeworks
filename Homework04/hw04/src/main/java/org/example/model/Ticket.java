package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Ticket {
    private int rootNumber;
    private int price;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private int place;
    private boolean isValid;
}
