package org.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Cafe {

    CafeTable cafeTable = new CafeTable();
    ArrayList<Table> tables = new ArrayList<>();

    public Stream<Orderable> LimitTable(int i){
        Stream<Orderable> limit = cafeTable.OrderableItem.stream().limit(i);
        return limit;
    }























}
