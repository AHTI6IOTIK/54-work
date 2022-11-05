package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> transformedList = main.transformAndSplitList(
            List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        );
        System.out.println("transformedList = " + transformedList);
    }

    private List<Integer> transformAndSplitList(List<Integer> source) {
        return source.stream()
            .map(el -> el % 2 == 0 ? ++el : el)
            .skip(2)
            .limit(5)
            .collect(Collectors.toList());
    }
}