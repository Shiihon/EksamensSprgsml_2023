package Opgave_10_BuyFlowers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
    private List<String> flowersInShop;
    private int total;
    private Scanner scanner;


    public FlowerShop() {
        this.scanner = new Scanner(System.in);
        this.total = 0;
        this.flowersInShop = new ArrayList<>();

        flowersInShop.add("Rose");
        flowersInShop.add("Lily");
        flowersInShop.add("Daffodil");
        flowersInShop.add("Gerberas");
        flowersInShop.add("Dahlia");
        flowersInShop.add("Buttercup");
        flowersInShop.add("IRIS");
        flowersInShop.add("Gardenia");
        flowersInShop.add("Jasmine");
        flowersInShop.add("Daisy");
    }

    public void showFlowers() {
        for (int i = 0; i < flowersInShop.size(); i++) {
            System.out.println(i + 1 + "." + flowersInShop.get(i));
        }
    }

    public void runDialog() {
        List<String> chosenFlowers = new ArrayList<>();

        System.out.println("Welcome to the flowershop!" + "\n");
        showFlowers();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            int flowerChosen = chooseFlower(); //Den valgte blomst, fra chooseFlower().

            if (flowerChosen != -1) { // tjekker hvad input er (-1 = quit);
                chosenFlowers.add(flowersInShop.get(flowerChosen)); // input er index.
            } else {
                return;
            }

        }
        System.out.println("You have chosen : " + chosenFlowers);

        System.out.println("\nWhould you like to make the flowers into a bouquet? Y/N");
        String inputForBouquet = scanner.nextLine().trim();

        if (inputForBouquet.equalsIgnoreCase("Q")) {
            return;
        }

        if (inputForBouquet.equalsIgnoreCase("Y")) {
            total += 50;
            System.out.println("Your flowers have now been turned into a bouquet! That will be : " + total + "kr.");
        }
        if (inputForBouquet.equalsIgnoreCase("N")) {
            System.out.println("Then it will be : " + total + "kr.");
        }
    }

    public int chooseFlower() {
        System.out.println("Please pick a flower");

        try {
            String savingScanner = scanner.nextLine().trim();

            if (savingScanner.equalsIgnoreCase("Q")) {
                // hvis input er -1 så ved man at brugeren ikke har valgt noget og programmet slutter.
                return -1;
            }

            int input = Integer.parseInt(savingScanner) - 1;

            if (input >= 0 && input <= 4) {
                total += 20;
                System.out.println("You have picked " + flowersInShop.get(input));
                System.out.println("The total is : " + total + " kr.");

            } else if (input >= 5 && input <= 7) {
                total += 40;
                System.out.println("You have picked " + flowersInShop.get(input));
                System.out.println("The total is : " + total + " kr.");

            } else if (input >= 8 && input <= 10) {
                total += 80;
                System.out.println("You have picked " + flowersInShop.get(input));
                System.out.println("The total is : " + total + " kr.");
            }
            return input;

        } catch (NumberFormatException e) {
            System.out.println("Please choose a number, and not a letter");
            return chooseFlower(); // vi returnere, da den "lover", at give den valgte blomst tilbage.
        }
    }
}