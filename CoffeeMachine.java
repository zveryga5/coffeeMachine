package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();

    }

    public static void start() {

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String start = writer();
            if (start.equals("remaining")) {
                remaining();
            } else if (start.equals("exit")) {
                break;
            } else if (start.equals("fill")) {
                fill();
            }else if(start.equals("buy")){
                buy();
            }else if(start.equals("take")){
                take();
            }
        }
    }
    public static String writer() {
        String write = scanner.next();
        return write;
    }

    public static void remaining() {
        System.out.println("The coffee machine has: ");
        System.out.println(ingredients.water + " of water");
        System.out.println(ingredients.milk + " of milk");
        System.out.println(ingredients.coffee + " of coffee beans");
        System.out.println(ingredients.cups + " of disposable cups");
        System.out.println(ingredients.money + " of money");
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        ingredients.water += Integer.parseInt(writer());
        System.out.println("Write how many ml of milk do you want to add: ");
        ingredients.milk += Integer.parseInt(writer());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        ingredients.coffee += Integer.parseInt(writer());
        System.out.println("Write how many disposable cups of coffee do you want to add:  ");
        ingredients.cups += Integer.parseInt(writer());

    }

    public static int take() {
        ingredients.money = 0;
        return ingredients.money;
    }


    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String s = writer();
        if (s.equals("1")) {
            if (ingredients.water - 250 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (ingredients.coffee - 16 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (ingredients.cups - 1 < 0) {
                System.out.println("Sorry, not enough cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                ingredients.water -= 250;
                ingredients.coffee -= 16;
                ingredients.money += 4;
                ingredients.cups -= 1;
            }
        } else if (s.equals("2")) {
            if (ingredients.water - 350 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (ingredients.milk - 75 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (ingredients.coffee - 20 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (ingredients.cups - 1 < 0) {
                System.out.println("Sorry, not enough cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                ingredients.water -= 350;
                ingredients.milk -= 75;
                ingredients.coffee -= 20;
                ingredients.money += 7;
                ingredients.cups -= 1;
            }
        }
        if (s.equals("3")) {
            if (ingredients.water - 200 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (ingredients.milk - 100 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (ingredients.coffee - 12 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (ingredients.cups - 1 < 0) {
                System.out.println("Sorry, not enough cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                ingredients.water -= 200;
                ingredients.milk -= 100;
                ingredients.coffee -= 12;
                ingredients.money += 6;
                ingredients.cups -= 1;
            }
        }
        if(s.equals("back")) {

        }

    }


    static class ingredients {
        public static int water = 400;
        public static int milk = 540;
        public static int coffee = 120;
        public static int cups = 9;
        public static int money = 550;
    }

   /* enum action {
        buy, fill, take, remaining, exit, back
    }*/
}


