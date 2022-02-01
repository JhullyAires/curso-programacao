package com.company.PrimeirosPassos.POO.Entities;

public class FinalGrade {

    public String name;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public double totalFinalGrade () {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public double missingPoints() {
        if (totalFinalGrade() < 60.0) {
            return 60.0 - totalFinalGrade();
        } else {
            return 0.0;
        }
    }
}
