package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum ClothingSize {
    XXS,
    XS(32), S(34), M(36), L(38);

    int size;


}
