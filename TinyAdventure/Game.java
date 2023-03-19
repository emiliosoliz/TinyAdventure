package main;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Scanner enterscanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int playerChoice;
    int monsterHP;
    int silverRing;
    int oldKey = 0;

    public static void main(String[] args) {
        Game adventure;
        adventure = new Game();
        adventure.playerSetUp();
        adventure.beginningArea();

    }

    public void playerSetUp() {

        playerHP = 12;
        monsterHP = 15;

        playerWeapon = "Rusty Sword";

        System.out.println("Your HP is " + playerHP);
        System.out.println("You have " + playerWeapon + " as a weapon");


        System.out.println("Enter your Hero name");
        playerName = scanner.nextLine();

        System.out.println("Hello " + playerName + " Let's go on an Adventure!");
        System.out.println("\n");
        System.out.println("------------Tiny Adventure------------------");
        System.out.println("\n");

    }

    public void beginningArea() {
        System.out.println("You find yourself in a dense forest.");
        System.out.println("An old man is sitting by a fire.");
        System.out.println("What do you do?");
        System.out.println("");
        System.out.println("1: Talk to old man");
        System.out.println("2: Attack old man");
        System.out.println("3: Leave");


        playerChoice = scanner.nextInt();

        if (playerChoice == 1) {
            System.out.println("Hello Stranger if you are hurt warm yourself by the fire.");
            System.out.println("You sit by the fire it fills you with warmth");
            System.out.println("");
            enterscanner.nextLine();
            if (playerHP < 12) {
                playerHP = playerHP + 2;
                System.out.println("Your HP is: " + playerHP);
                beginningArea();
            }
        }
        if (playerChoice == 2) {
            System.out.println("Your attack passed through the old man \n The old man chuckled a blinding light flashed \n (You lost 2 HP) \n ");
            playerHP = playerHP - 2;
            System.out.println("Your HP is: " + playerHP);
            enterscanner.nextLine();
            System.out.println(" ");
            beginningArea();
        }
        if (playerChoice == 3) {
            theWoods();

        } else {
            beginningArea();
        }
    }

    public void theWoods() {
        enterscanner.nextLine();
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("You look around and see 4 direction");
        System.out.println("Which way do you go?");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("1: North, towards the Dark Tower");
        System.out.println("2: East, towards the Pond");
        System.out.println("3: South, deeper into the forest");
        System.out.println("4: Back to the old man and his fire");

        playerChoice = scanner.nextInt();

        if (playerChoice == 1) {
            northPath();
        }
        if (playerChoice == 2) {
            eastPath();
        }
        if (playerChoice == 3) {
            southPath();
        }
        if (playerChoice == 4) {
            beginningArea();
        } else {
            theWoods();
        }
    }
    public void theWoodsOldMan() {
        System.out.println("You wonder back into the woods, the old man is sitting on a stump");
        System.out.println("What do you do?");
        System.out.println("");
        System.out.println("1: Talk to Old Man");
        System.out.println("2: Head North to the Dark Tower");
        System.out.println("3: South, deeper into the forest");

        playerChoice = scanner.nextInt();

        if (playerChoice == 1) {
            System.out.println("Hello again Stranger seem you been through a lot");
            System.out.println("While on your travels have you by chance found a ring?");
            System.out.println("1: Yes, here you go");
            System.out.println("2: No, I haven't");
            playerChoice = scanner.nextInt();
            if (playerChoice == 1) {
                System.out.println("Oh many thanks Stranger as thanks take this old Key I found");
                System.out.println("You Got Old Key!");
                System.out.println("\n");
                enterscanner.nextLine();
                oldKey = 1;
                theDarkTower();
            }
            if (playerChoice == 2) {
                System.out.println("Well if you see it be sure to bring it to me, please.");
                theWoodsOldMan();
            }
            else{
                theWoodsOldMan();
            }

        }
        if (playerChoice == 2){
            theDarkTower();
        }
        if (playerChoice == 3){
            southPath();
        }
        else {
            theWoodsOldMan();
        }
    }


    public void northPath() {
        System.out.println("You went north towards the Dark Tower");
        System.out.println("While traveling you are attacked by a Wolf");
        System.out.println("------------------------------------------");
        System.out.println("1: Fight");
        System.out.println("2: Run Away");
        playerChoice = scanner.nextInt();
        if (playerChoice == 1) {
            System.out.println("Time to Fight!");
            fight();
        }
        if (playerChoice == 2) {
            System.out.println("You Ran away back to the Woods");
            theWoods();
        }
        if (oldKey == 1 || silverRing == 1) {
            theDarkTower();
        }
    }

    public void eastPath() {
        System.out.println("You head towards the Pond");
        System.out.println("You reach the Pond a voice enter your mind");
        System.out.println("Great Hero give me your weapon and I shall strengthen it.");
        System.out.println("");
        System.out.println("Do you Toss your weapon into the Pond?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        scanner.nextLine();
        playerChoice = scanner.nextInt();
        if (playerChoice == 1) {
            System.out.println("You throw your weapon into the Pond");
            System.out.println("A Shining Sword emerges from the Pond");
            System.out.println("You Gain the Shining Sword");
            playerWeapon = "Shining Sword";
            theWoods();
        } else {
            theWoods();
        }
    }

    public void southPath() {
        System.out.println("You head deeper into the Woods");
        System.out.println("The dark seem to creep over you....");
        System.out.println("You are Lost...");
        System.out.println("-----------Game Over-------------");
        enterscanner.nextLine();
        System.out.println("\n");
        System.out.println("\n");
        System.exit(0);
    }

    public void fight() {
        System.out.println("-----------------------------");
        System.out.println("Your HP is: " + playerHP);
        System.out.println("Monster HP is: " + monsterHP);
        System.out.println("1: Attack");
        System.out.println("2: Run");
        System.out.println("-----------------------------");

        playerChoice = scanner.nextInt();
        if (playerChoice == 1) {
            attack();
        }
        if (playerChoice == 2) {
            theWoods();
        } else {
            theWoods();
        }
    }

    public void attack() {
        int playerDam = 0;

        if (playerWeapon.equals("Rusty Sword")) {
            playerDam = new java.util.Random().nextInt(3);
        }
        if (playerWeapon.equals("Shining Sword")) {
            playerDam = new java.util.Random().nextInt(9);
        }
        System.out.println("You attack and gave " + playerDam + " Damage!");

        monsterHP = monsterHP - playerDam;

        System.out.println("Monster HP: " + monsterHP);

        if (monsterHP < 1) {
            win();
        }
        if (monsterHP > 0) {
            int monsterDam = 0;

            monsterDam = new java.util.Random().nextInt(5);


            System.out.println("The Monster attack you and gave " + monsterDam + " Damage!");
            playerHP = playerHP - monsterDam;

            System.out.println("Player HP: " + playerHP);

            if (playerHP < 1) {
                gameOver();
            }
            if (playerHP > 0) {
                fight();
            }
        }

    }

    public void gameOver() {
        System.out.println("===============================================");
        System.out.println("You Died");
        System.out.println("===============================================");
        System.exit(0);
    }

    public void win() {
        System.out.println("===============================================");
        System.out.println("You Defeated the Monster");
        System.out.println("The Monster dropped a Ring");
        System.out.println("You gain a Silver Ring!");
        System.out.println("===============================================");
        System.out.println("\n");

        silverRing = 1;
        theDarkTower();
    }

    public void theDarkTower() {
        System.out.println("The Dark Tower looms ominously");
        if (oldKey == 0) {
            System.out.println("You try to open the door but its locked");
            System.out.println("Maybe someone has the key");
            System.out.println("You head back to the Woods");
            System.out.println("\n");
            enterscanner.nextLine();
            theWoodsOldMan();
        }
        if (oldKey == 1) {
            System.out.println("You use the key on the door");
            System.out.println("You push it open and walk inside");
            System.out.println("\n");
            thankYou();

        }
    }
    public void thankYou(){
        System.out.println("=============================================================");
        System.out.println("Thank you for playing my tiny adventure");
        System.out.println("Know this my very first game made entirely in Java");
        System.out.println("Got any suggestions for another game or tips on how to make it better send me a message");
        System.out.println("=============================================================");
        System.exit(0);
    }
}
