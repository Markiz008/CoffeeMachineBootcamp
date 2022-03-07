
package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);

    static int waterStatus = 400;
    static int milkStatus = 540;
    static int coffeeBeansStatus = 120;
    static int cupsStatus = 9;
    static int moneyStatus = 550;

    static int updateWater;
    static int updateMilk;
    static int updateCoffeeBeans;
    static int updateCups;
    static int updateMoney;
    static String action;


    public static void main(String[] args) {

        menu();

    }

    public static void messageStatus() {
        System.out.println("\nThe coffee machine has:" + "\n" + waterStatus + " ml of water" +
                "\n" + milkStatus + " ml of milk" + "\n" + coffeeBeansStatus + " g of coffee beans" +
                "\n" + cupsStatus + " disposable cups" + "\n" + "$" + moneyStatus + " of money");
    }

    public static void filling() {
        System.out.println("Write how many ml of water you want to add:");
        int fillWater = scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        int fillMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        int fillCoffeeBeans = scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int fillCups = scanner.nextInt();

        waterStatus += fillWater;
        milkStatus += fillMilk;
        coffeeBeansStatus += fillCoffeeBeans;
        cupsStatus += fillCups;
    }

    public static void taking() {
        System.out.println("I give you $" + moneyStatus);
        moneyStatus = 0;
    }

    public static void buying() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String choice = scanner.next();

        updateWater = 0;
        updateMilk = 0;
        updateCoffeeBeans = 0;
        updateCups = 1;
        updateMoney = 0;

        switch (choice) {
            case "1":
                updateWater += 250;
                updateCoffeeBeans += 16;
                updateMoney += 4;

                if (waterStatus >= updateWater && coffeeBeansStatus >= updateCoffeeBeans
                        && cupsStatus >= updateCups) {
                    waterStatus -= updateWater;
                    coffeeBeansStatus -= updateCoffeeBeans;
                    cupsStatus -= updateCups;
                    moneyStatus += updateMoney;

                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else if (waterStatus < updateWater) {
                    moneyStatus -= 4;

                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (coffeeBeansStatus < updateCoffeeBeans) {
                    moneyStatus -= 4;

                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                break;

            case "2":
                updateWater += 350;
                updateMilk += 75;
                updateCoffeeBeans += 20;
                updateMoney += 7;

                if (waterStatus >= updateWater && milkStatus >= updateMilk
                        && coffeeBeansStatus >= updateCoffeeBeans && cupsStatus >= updateCups) {
                    waterStatus -= updateWater;
                    coffeeBeansStatus -= updateCoffeeBeans;
                    milkStatus -= updateMilk;
                    cupsStatus -= updateCups;
                    moneyStatus += updateMoney;

                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else if (waterStatus < updateWater) {
                    moneyStatus -= 7;

                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milkStatus < updateMilk) {
                    moneyStatus -= 7;

                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (coffeeBeansStatus < updateCoffeeBeans) {
                    moneyStatus -= 7;

                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                break;

            case "3":
                updateWater += 200;
                updateMilk += 100;
                updateCoffeeBeans += 12;
                updateMoney += 6;

                if (waterStatus >= updateWater && milkStatus >= updateMilk
                        && coffeeBeansStatus >= updateCoffeeBeans && cupsStatus >= updateCups) {
                    waterStatus -= updateWater;
                    coffeeBeansStatus -= updateCoffeeBeans;
                    milkStatus -= updateMilk;
                    cupsStatus -= updateCups;
                    moneyStatus += updateMoney;

                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                } else if (waterStatus < updateWater) {
                    moneyStatus -= 6;

                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milkStatus < updateMilk) {
                    moneyStatus -= 6;

                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (coffeeBeansStatus < updateCoffeeBeans) {
                    moneyStatus -= 6;

                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                break;

            case "back":
                break;
        }
    }

    public static void menu() {
        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            action = scanner.next();

            switch (action) {
                case "take":
                    taking();
                    break;

                case "buy":
                    buying();
                    break;

                case "fill":
                    filling();
                    break;

                case "remaining":
                    messageStatus();
                    break;

                case "back":
                    break;

                case "exit":
                    System.exit(0);
            }
        }
    }
}
