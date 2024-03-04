package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
abstract public class Clotches {
    private Size size;
    private double cost;
    private String color;
}
