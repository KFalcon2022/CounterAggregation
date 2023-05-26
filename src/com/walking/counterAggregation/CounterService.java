package com.walking.counterAggregation;

public class CounterService {
    private Counter[] counters = new Counter[Counter.getCounterCount()];
    private static int num = 0;

    public void addCounter(Counter ... counter) {
        for (int i = 0; i < Counter.getCounterCount(); i++) {
            counters[num] = counter[i];
            num++;
        }
    }

    public void printAllCounters() {
        System.out.println("Available counters: ");
        for(Counter element : counters) {
            System.out.println(element.getName());
        }
    }

    public void increase(Counter counter, int value) {
        counter.setCounter(counter.getCounter() + value);
    }

    public void increment(Counter counter) {
        counter.setCounter(counter.getCounter() + 1);
    }

    public void reset(Counter counter) {
        counter.setCounter(0);
    }
}
