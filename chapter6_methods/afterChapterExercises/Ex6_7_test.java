package org.example.chapter6_methods.afterChapterExercises;

public class Ex6_7_test {

    public static void main(String[] args) {

        double investmentAmount = 1000.56;
        double annualInterestRate = 0.0425;
        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfYears = 1;

        double futureInvestmentValue = investmentAmount *
                (Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        System.out.printf("%.2f", futureInvestmentValue);
    }
}
