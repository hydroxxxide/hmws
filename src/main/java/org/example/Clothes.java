package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
abstract class  Clothes {
    private ClothingSize size;
    private double cost;
    private String color;


}
