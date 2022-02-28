
package machine;

import java.util.Scanner;

public class CoffeeMachine {
            public static void main(String[] args) {
        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWrite how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        int water = 200 * cups;
        int milk = 50 * cups;
        int coffeeBeans = 15 * cups;
        System.out.println("For " + cups + " cups of coffee you will need:" + "\n" + water + " ml of water" + "\n" + milk + " ml of milk" + "\n" + coffeeBeans + " g of coffee beans");

        System.out.println("\nWrite how many ml of water the coffee machine has:");
        int waterHas = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkHas = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansHas = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();

        int waterCups = waterHas / 200;
        int milkCups = milkHas / 50;
        int coffeeCups = coffeeBeansHas / 15;

        int limit = Math.min(waterCups, Math.min(milkCups, coffeeCups));

        if (cupsNeeded > limit) {
            System.out.println("No, I can make only " + limit + " cup(s) of coffee");
        } else if (cupsNeeded == limit) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int extra = limit - cupsNeeded;
            System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
        }
                int updateWater, updateMilk, updateCoffeeBeans, updateCups, updateMoney;



                Scanner scanner = new Scanner(System.in);

                int waterStatus = 400;
                int milkStatus = 540;
                int coffeeBeansStatus = 120;
                int cupsStatus = 9;
                int moneyStatus = 550;
                System.out.println("The coffee machine has:" + "\n" + waterStatus + " ml of water" + "\n" + milkStatus + " ml of milk" + "\n" + coffeeBeansStatus + " g of coffee beans" + "\n" + cupsStatus + " disposable cups" + "\n" + "$" + moneyStatus + " of money");

                System.out.println("\nWrite action (buy, fill, take):");
                String action = scanner.nextLine();

                switch (action) {
                    case "take":
                        System.out.println("I give you $" + moneyStatus);
                        updateWater = waterStatus;
                        updateMilk = milkStatus;
                        updateCoffeeBeans = coffeeBeansStatus;
                        updateCups = cupsStatus;
                        updateMoney = 0;

                        System.out.println("\nThe coffee machine has:" + "\n" + updateWater + " ml of water" + "\n" + milkStatus + " ml of milk" +"\n" + updateCoffeeBeans + " g of coffee beans" + "\n" + updateCups + " disposable cups" + "\n" + "$" + updateMoney + " of money");
                        break;
                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                        int choice = scanner.nextInt();

                        if (choice == 1) {
                            updateWater = waterStatus - 250;
                            updateMilk = milkStatus;
                            updateCoffeeBeans = coffeeBeansStatus - 16;
                            updateCups = cupsStatus - 1;
                            updateMoney = moneyStatus + 4;

                            System.out.println("\nThe coffee machine has:" + "\n" + updateWater + " ml of water" + "\n" + milkStatus + " ml of milk" +"\n" + updateCoffeeBeans + " g of coffee beans" + "\n" + updateCups + " disposable cups" + "\n" + "$" + updateMoney + " of money");
                            break;
                        } else if (choice == 2) {
                            updateWater = waterStatus - 350;
                            updateMilk = milkStatus - 75;
                            updateCoffeeBeans = coffeeBeansStatus - 20;
                            updateCups = cupsStatus - 1;
                            updateMoney = moneyStatus + 7;

                            System.out.println("\nThe coffee machine has:" + "\n" + updateWater + " ml of water" + "\n" + updateMilk + " ml of milk" + "\n" + updateCoffeeBeans + " g of coffee beans" + "\n" + updateCups + " disposable cups" + "\n" + "$" + updateMoney + " of money");
                            break;
                        } else if (choice == 3) {
                            updateWater = waterStatus - 200;
                            updateMilk = milkStatus - 100;
                            updateCoffeeBeans = coffeeBeansStatus - 12;
                            updateMoney = moneyStatus + 6;
                            updateCups = cupsStatus - 1;

                            System.out.println("\nThe coffee machine has:" + "\n" + updateWater + " ml of water" + "\n" + updateMilk + " ml of milk" + "\n" + updateCoffeeBeans + " g of coffee beans" + "\n" + updateCups + " disposable cups" + "\n" + "$" + updateMoney + " of money");
                            break;
                        }
                        case "fill":
                        System.out.println("Write how many ml of water you want to add:");
                        int fillWater = scanner.nextInt();
                        updateWater = waterStatus + fillWater;

                        System.out.println("Write how many ml of milk you want to add:");
                        int fillMilk = scanner.nextInt();
                        updateMilk = milkStatus + fillMilk;

                        System.out.println("Write how many grams of coffee beans you want to add:");
                        int fillCoffeeBeans = scanner.nextInt();
                        updateCoffeeBeans = coffeeBeansStatus + fillCoffeeBeans;

                        System.out.println("Write how many disposable cups of coffee you want to add:");
                        int fillCups = scanner.nextInt();
                        updateCups = cupsStatus + fillCups;

                        updateMoney = moneyStatus;

                        System.out.println("\nThe coffee machine has:" + "\n" + updateWater + " ml of water" + "\n" + updateMilk + " ml of milk" + "\n" + updateCoffeeBeans + " g of coffee beans" + "\n" + updateCups + " disposable cups" + "\n" + "$" + updateMoney + " of money");
                        break;
                } */


        int updateWater;
        int updateMilk;
        int updateCoffeeBeans;
        int updateCups;
        int updateMoney;
        String action;

        Scanner scanner = new Scanner(System.in);

        int waterStatus = 400;
        int milkStatus = 540;
        int coffeeBeansStatus = 120;
        int cupsStatus = 9;
        int moneyStatus = 550;

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            action = scanner.next();

            switch (action) {
                case "take":
                    System.out.println("I give you $" + moneyStatus);
                    moneyStatus = 0;
                    break;
                case "buy":
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

                            if (waterStatus >= updateWater && coffeeBeansStatus >= updateCoffeeBeans && cupsStatus >= updateCups) {
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

                            if (waterStatus >= updateWater && milkStatus >= updateMilk && coffeeBeansStatus >= updateCoffeeBeans && cupsStatus >= updateCups) {
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

                            if (waterStatus >= updateWater && milkStatus >= updateMilk && coffeeBeansStatus >= updateCoffeeBeans && cupsStatus >= updateCups) {
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
                    break;
                case "fill":
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
                    break;
                case "remaining":
                    System.out.println("\nThe coffee machine has:" + "\n" + waterStatus + " ml of water" + "\n" + milkStatus + " ml of milk" + "\n" + coffeeBeansStatus + " g of coffee beans" + "\n" + cupsStatus + " disposable cups" + "\n" + "$" + moneyStatus + " of money");
                    break;
                case "back":
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }
}
