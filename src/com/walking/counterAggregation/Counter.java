package com.walking.counterAggregation;

public class Counter {
    private final String name;
    private int counter;
    private final String measure;
    private static int counterCount = 0;

    public static int getCounterCount() {
        return counterCount;
    }

    public static void setCounterCount(int counterCount) {
        Counter.counterCount = counterCount;
    }

    public Counter(String name, String measure) {
        this(name, 0, measure);
    }

    public Counter(String name, int counter, String measure) {
        this.counter = counter;
        this.name = name;
        this.measure = measure;
        counterCount++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getMeasure() {
        return measure;
    }
}
