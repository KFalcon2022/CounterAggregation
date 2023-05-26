package com.walking.counterAggregation;

public class Main {
    public static void main(String[] args) {
        Counter gasCounter = new Counter("Gas", "cubic meter");
        Counter coldWaterCounter = new Counter("Cold water", "cubic meter");
        Counter hotWaterCounter = new Counter("Hot water", "cubic meter");
        Counter electricityCounter = new Counter("Electricity", "kilowatt");

        CounterService counterService = new CounterService();
        counterService.addCounter(gasCounter, coldWaterCounter, hotWaterCounter, electricityCounter);


        counterService.printAllCounters();

        counterService.increase(gasCounter, 5);
        counterService.increase(coldWaterCounter, 100);
        counterService.increase(hotWaterCounter, 40);
        counterService.increment(electricityCounter);

        printCounter(gasCounter);
        printCounter(coldWaterCounter);
        printCounter(hotWaterCounter);
        printCounter(electricityCounter);

    }

    private static void printCounter(Counter counter) {
        System.out.println(counter.getName() + ": " + counter.getCounter() + " " + counter.getMeasure());
    }
}
