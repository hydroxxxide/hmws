package org.example;

import lombok.Getter;

@Getter
public class Cafe {
    private final CafeTable[] tables;

    public Cafe(int numTables) {
        this.tables = new CafeTable[numTables];
        for (int i = 0; i < numTables; i++) {
            tables[i] = new CafeTable();
        }
    }

    public CafeTable getTable(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < tables.length) {
            return tables[tableNumber];
        } else {
            throw new IllegalArgumentException("Столика с номером " + tableNumber + " не существует.");
        }
    }
}
