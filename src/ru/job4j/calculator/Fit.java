package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double manIdealWeight = Fit.manWeight(height);
        System.out.println("Man 187 is " + manIdealWeight);
        double womanIdealWeight = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + womanIdealWeight);
    }
}
