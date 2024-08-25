package mypackage;

import mymathematics.MyIntegerMath;

public class MyDemo {

    public static void main(String[] args) {
        MyIntegerMath math = new MyIntegerMath();

        int number = 153; // Example number
        boolean isArmstrong = math.isArmstrong(number);
        System.out.println(number + " is " + (isArmstrong ? "" : "not ") + "an Armstrong number.");

        int digits = math.countDigits(number);
        System.out.println(number + " has " + digits + " digits.");

        boolean isStrong = math.isStrong(number);
        System.out.println(number + " is " + (isStrong ? "" : "not ") + "a Strong number.");
    }
}
