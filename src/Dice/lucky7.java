package Dice;

import java.util.Scanner;

public class lucky7 {

    public static void main(String[] args) {
        Dice d1, d2;
        Scanner s = new Scanner(System.in);
        d1 = new Dice();
        d2 = new Dice();
        int highmoney = 0;
        int highroll = 0;
        int oldmoney = 0;
        System.out.print("How many dollars do you have? ");
        int money = s.nextInt();
        int roll = 0, failedroll = 0, successroll = 0;

        while (money > 0) {
            d1.roll();
            d2.roll();
            roll++;

            System.out.println("roll number: " + roll);
            int total = (d1.getNumber() + d2.getNumber());
            System.out.println("Rolled a " + total);

            if (total == 7) {
                money += 4;
                oldmoney = money;
                successroll++;
                System.out.println("You have $" + money + " left");

            } else {

                money -= 1;
                System.out.println("You have $" + money + " left");
                failedroll++;
            }

            if (oldmoney > money) {
                highroll = (failedroll - successroll) - 1;
                highmoney = oldmoney;
                
            } else if (money >= oldmoney) {
                highroll = (failedroll - successroll) - 1;
                highmoney = money;
                
            } else {

            }

        }

        System.out.format("You should've stopped after %d rolls\n", highroll);
        System.out.format("The most amount of money you had was $%d ", highmoney);

    }

}
