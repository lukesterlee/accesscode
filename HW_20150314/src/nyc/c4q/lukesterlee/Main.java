package nyc.c4q.lukesterlee;

/*
 * Access Code 2.1
 * Created by Luke Lee on 03/13/15.
 * Credit to Charlyn Buchanan for generating choice-driven results.
 * Credit to Sufei Zhao for using random numbers to generate probability events.
 * Credit to John Gomez for awesome 3D ASCII fonts.
 *
 * Game Description
 * This game is simulating Access Code 2.1 program.
 * Since I haven't played any kind of games in my life,
 * (I just usually watch TV shows)
 * I wanted to make an educational game.
 * The goal of the game is graduating Access Code 2.1
 * In order to graduate, you must fulfilled the requirements.
 */

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static Scanner inputType = new Scanner(System.in);
    public static Random random = new Random();
    public static int answer;
    public static int num;
    public static int tweet = 0;
    public static String enter;
    public static String tweetMessage = "";
    public static int remainingMinutes = 90;
    public static boolean[] isfulfilled = new boolean[8];
    public static String[] requirements = new String[]{
            "Participate the orientation",
            "Go to the lecture",
            "Go to the office hour",
            "Do the homework",
            "Do the pair programming",
            "Tweet",
            "Write a post on Medium",
            "Do the group project"
    };
    public static String[] staffs = new String[]{"Greg", "Ben", "Alex Qin", "Nathan", "Alex Samuel", "Davis"};
    public static String[] friends = new String[]{"Sufei", "Anthony F", "Alvin",
            "John", "Anthony", "Vanice", "Hoshiko", "Joshelyn",
            "Ray", "George", "Jorge", "Pooja", "Madelyn", "Jose",
            "Hans", "Dison", "Jae", "Abass", "Kadeem", "Allison",
            "Charlyn", "Tasha", "Janneisy", "Boves", "Marbella",
            "Reinard", "Sarah", "Rosemary", "Yuliya", "Ramona", "Na", "Luke"};
    public static boolean knowStaff = false;
    public static int staffNumber;

    public static boolean metFriend = false;
    public static int friendNumber;

    public static boolean isShowered = false;
    public static boolean didEat = false;

    // The test score in Homework section. (0~100)
    public static int homework = 0;

    /* Learning points (0~100)
     * taking lecture = 20 points
     * going to the office hour = 20 points
     * do the pair programming = 20 points
     * do the group project = 20 points
     * come to the lecture 10 minutes before = 10 points
     * talking to TA before the lecture = 10 points
     */
    public static int learningPoint = 0;


    // to print output easier.
    public static void print(String message) {
        System.out.println(message);
    }

    public static void intro() {
        print(" ________  ________  ________  _______   ________   ________           \n" +
                "|\\   __  \\|\\   ____\\|\\   ____\\|\\  ___ \\ |\\   ____\\ |\\   ____\\          \n" +
                "\\ \\  \\|\\  \\ \\  \\___|\\ \\  \\___|\\ \\   __/|\\ \\  \\___|_\\ \\  \\___|_         \n" +
                " \\ \\   __  \\ \\  \\    \\ \\  \\    \\ \\  \\_|/_\\ \\_____  \\\\ \\_____  \\        \n" +
                "  \\ \\  \\ \\  \\ \\  \\____\\ \\  \\____\\ \\  \\_|\\ \\|____|\\  \\\\|____|\\  \\       \n" +
                "   \\ \\__\\ \\__\\ \\_______\\ \\_______\\ \\_______\\____\\_\\  \\ ____\\_\\  \\      \n" +
                "    \\|__|\\|__|\\|_______|\\|_______|\\|_______|\\_________|\\_________\\     \n" +
                "                                           \\|_________\\|_________|     \n" +
                "                                                                       \n" +
                "                                                                       \n" +
                " ________  ________  ________  _______            _______    _____     \n" +
                "|\\   ____\\|\\   __  \\|\\   ___ \\|\\  ___ \\          /  ___  \\  / __  \\    \n" +
                "\\ \\  \\___|\\ \\  \\|\\  \\ \\  \\_|\\ \\ \\   __/|        /__/|_/  /||\\/_|\\  \\   \n" +
                " \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\ \\\\ \\ \\  \\_|/__      |__|//  / /\\|/ \\ \\  \\  \n" +
                "  \\ \\  \\____\\ \\  \\\\\\  \\ \\  \\_\\\\ \\ \\  \\_|\\ \\         /  /_/__  __\\ \\  \\ \n" +
                "   \\ \\_______\\ \\_______\\ \\_______\\ \\_______\\       |\\________|\\__\\ \\__\\\n" +
                "    \\|_______|\\|_______|\\|_______|\\|_______|        \\|_______\\|__|\\|__|");
        print("Hello! Welcome to Coalition for Queens.");
        print("We aim to create an inclusive tech community that is reflective of Queens and New York City.");
        print("Would you like to join Access Code 2.1?");

        outer:
        while (true) {
            print("1. Yes");
            print("2. No");
            answer = input.nextInt();

            switch (answer) {
                case 1:
                    print("\nCongratulations! You just got accepted into Access Code 2.1 program.");
                    print("In order to graduate, you must fulfil the graduation requirements.");
                    print("Don't forget to participate the orientation!");
                    break outer;
                case 2:
                    quit();
                default:
                    print("Wrong input! Try again.");
                    continue;
            }
        }
    }

    public static void quit() {
        print("Good Bye!");
        System.exit(0);
    }

    public static void menu() {

        while (true) {
            print("\n");
            print("====================================================================");
            print("What would you like to do?\n" +
                    "1. Participate the orientation\n" +
                    "2. Go to the lecture\n" +
                    "3. Go to the office hour\n" +
                    "4. Do the homework\n" +
                    "5. Do the Pair Programming\n" +
                    "6. Tweet\n" +
                    "7. Write a post on Medium\n" +
                    "8. Do the group project\n" +
                    "9. Check your graduation status\n" +
                    "0. Exit");
            answer = input.nextInt();
            if (answer == 0) {
                quit();
            }
            else if (answer >= 1 && answer <= 9) {
                level(answer);
                break;
            }
            else {
                print("Wrong input! Try again.");
            }
        }

    }

    public static void level(int number) {

        switch (number) {
            case 1 :
                orientation();
                break;
            case 2 :
                lecture();
                break;
            case 3 :
                officehour();
                break;
            case 4 :
                homework();
                break;
            case 5 :
                pairprogramming();
                break;
            case 6 :
                tweet();
                break;
            case 7 :
                medium();
                break;
            case 8 :
                project();
                break;
            case 9 :
                graduation();
                break;
        }

    }

    public static void checkorientation() {

        if (!isfulfilled[0]) {
            print("\nYou must take orientation first!");
            menu();
            quit();
        }

    }

    public static void orientation() {

        if (isfulfilled[0]) {
            print("You already took the orientation. Let's do other things.");
            menu();
            return;
        }

        print("\nWelcome to the orientation!");
        print("Hello, everyone! I'm Alex Qin.");
        print("Today, we will go over about the graduation requirements,");
        print("and learn about Access Code Values!");
        print("Press ENTER to continue");

        enter = inputType.nextLine();

        print("\nCool! First, let's talk about the graduation requirements.");;
        print("During Access Code, you’ll be continuously learning\n" +
                "and gaining valuable skills that you will use\n" +
                "throughout your career in tech. To ensure that\n" +
                "everyone is prepared, we’ve set up some basic requirements\n" +
                "for graduation. All Access Coders must: ");
        print("Press ENTER to continue");

        enter = inputType.nextLine();
        print("\n1.\t Attend and actively participate in every class\n" +
                "and event, barring personal commitments and\n" +
                "medical emergencies.\n" +
                "a. In the event that you need to miss a class\n" +
                "sesssion, you must contact Alex Qin\n" +
                "(aq@c4q.nyc) at least one week in advance\n" +
                "for approval.\n" +
                "b. You will be required to complete all missed\n" +
                "work and attend office hour sessions to\n" +
                "make up any missed class hours. ");
        enter = inputType.nextLine();
        print("\n2.\t Be on time to every class session.");
        enter = inputType.nextLine();
        print("\n3.\t Complete all homework assignments given in\n" +
                "class, including developing and publishing apps\n" +
                "on Google Play and performing demonstrations\n" +
                "at C4Q Demo Day and other events. ");
        enter = inputType.nextLine();
        print("\n4.\t Master the crucial technical and non-technical\n" +
                "skills taught by C4Q.");
        enter = inputType.nextLine();
        print("\n5.\t Participate in all assessments distributed by\n" +
                "C4Q.");
        enter = inputType.nextLine();

        print("\nOf course, feel free to go above and beyond to\n" +
                "make the most of your Access Code experience!");

        enter = inputType.nextLine();
        print("\nNow let's learn about Access Code Values!");
        print("\nSafe Space\n" +
                "I don’t know is how you grow\n" +
                "Teamwork makes the dream work\n" +
                "Share your knowledge\n" +
                "Work Hard\n" +
                "Honesty is the best policy\n" +
                "Leave it better than you found it\n" +
                "Embrace the struggle\n" +
                "Always be learning\n" +
                "Lead the way\n" +
                "Be Nice\n" +
                "Make with love");
        print("\nThese are our values. Please keep in mind and thanks for taking orientation!");
        print("Press ENTER to continue");
        enter = inputType.nextLine();
        print("Congratulations! You finished orientation successfully!");
        isfulfilled[0] = true;
        menu();
        quit();
    }

    public static void onTime() {
        print("You made it!");
        print("You successfully took the lecture.");
        isfulfilled[1] = true;
        learningPoint += 20;
        print("You learned something. Your current learning points is " + learningPoint);
        menu();
    }
    public static void tenMinutesEarly() {
        print("You made it! And you have time to prepare for class.");
        print("You successfully took the lecture.");
        isfulfilled[1] = true;
        learningPoint += 30;
        print("You learned a lot. Your current learning points is " + learningPoint);
        menu();
    }
    public static void twentyMinutesEarly() {
        num = random.nextInt(32);
        print("You made it! You have 20 minutes so you have time to prepare for class");
        if (isShowered && didEat) {
            print("You met a friend! " + friends[num] + " is very nice and friendly!");
            metFriend = true;
            friendNumber = num;
        }
        if (!isShowered) {
            print("Oops, you didn't take a shower so you smell bad.");
            print("Nobody is talking to you :(");
        }
        if (!didEat) {
            print("Oops, you didn't eat breakfast. Now you are hangry.");
            print("People are afraid to talk to you :(");
        }
        print("You successfully took the lecture!");
        isfulfilled[1] = true;
        learningPoint += 30;
        print("You learned a lot. Your current learning points is " + learningPoint);
        menu();
    }
    public static void thirtyMinutesEarly() {
        num = random.nextInt(6);
        int num2 = random.nextInt(32);
        print("You made it! You have 30 minutes so you have time to prepare for class");
        if (isShowered && didEat) {
            print("You met a friend! " + friends[num2] + " is very nice and friendly!");
            print("You met " + staffs[num] + " who is one of TAs. " + staffs[num] + " is amazing!");
            staffNumber = num;
            friendNumber = num2;
            metFriend = true;
            knowStaff = true;
        }
        print("You successfully took the lecture!");
        isfulfilled[1] = true;
        learningPoint += 30;
        print("You learned a lot. Your current learning points is " + learningPoint);
        menu();

    }


    public static void lecture() {
        int chanceOfDelay = 0;
        checkorientation();

        if (isfulfilled[1]) {
            print("You already took the lecture. Let's do other things.");
            menu();
            return;
        }

        print("\nToday is the first day of Access Code 2.1");
        print("The class starts at 10:00AM and now it is 8:30AM");
        print("You live in Brooklyn so you take G and 7 train.");
        print("Total travel time is usually 30 minutes");
        outer:
        while (true) {
            print("\nWhat would you do?\n" +
                    "1. I want to be there by 10:00AM sharp so I can sleep more.\n" +
                    "2. I want to be there by  9:50AM so I can prepare for the first day\n" +
                    "3. I want to be there by  9:40AM so I can talk to classmates\n" +
                    "4. I want to be there by  9:30AM so I can talk to classmates and TAs");
            answer = input.nextInt();
            switch (answer) {
                case 1 :
                    print("You slept another 30 minutes.");
                    remainingMinutes -= 30;
                    chanceOfDelay += 80;
                    break outer;
                case 2 :
                    print("You slept another 20 minutes.");
                    chanceOfDelay += 50;
                    remainingMinutes -= 20;
                    break outer;
                case 3 :
                    print("You slept another 10 minutes.");
                    chanceOfDelay += 5;
                    remainingMinutes -= 10;
                    break outer;
                case 4 :
                    chanceOfDelay += 5;
                    break outer;
                default:
                    print("Wrong input! Try again");
            }

        }

        print("\nCool! Now you have " + remainingMinutes + " minutes left.");

        outer2:
        while (true) {
            print("What would you do?\n" +
                    "1. Sleep 10 minutes more.\n" +
                    "2. Take a shower\n" +
                    "3. Eat breakfast\n" +
                    "4. Leave");
            answer = input.nextInt();
            switch (answer) {
                case 1 :
                    num = random.nextInt(2)+1;
                    if (num == 1) {
                        remainingMinutes -= 20;
                        print("Oops! You overslept! You slept 20 minutes!");
                        print("Now you have " + remainingMinutes + " minutes left.");
                    } else {
                        print("You slept 10 minutes.");
                        remainingMinutes -= 10;
                        print("Now you have " + remainingMinutes + " minutes left.");
                    }
                    break;
                case 2 :
                    if (isShowered == true) {
                        print("You already took a shower.");
                    }
                    else {
                        print("\nYou took a shower. Now you are clean and smell good.");
                        remainingMinutes -= 10;
                        isShowered = true;
                        print("Now you have " + remainingMinutes + " minutes left.");
                    }
                    break;
                case 3 :
                    if (didEat == true) {
                        print("You already ate.");
                    }
                    else {
                        print("\nYou just ate. Now you are energetic and ready to work!");
                        remainingMinutes -= 10;
                        didEat = true;
                        print("Now you have " + remainingMinutes + " minutes left.");
                    }
                    break;
                case 4 :
                    break outer2;
                default:
                    print("Wrong input! Try again");
            }

        }

        print("Okay! Let's take G train first. It usually takes 20 minutes. Press ENTER to continue.");
        enter = inputType.nextLine();
        num = random.nextInt(100)+1;
        if (num <= chanceOfDelay) {
            print("Oops! G train delay! 10 minutes delay.");
            remainingMinutes -= 10;
        }
        print("You took G train");
        remainingMinutes -= 20;
        print("Now you have " + remainingMinutes + " minutes left.");

        print("Okay! Let's take 7 train then. It usually takes 10 minutes. Press ENTER to continue");
        enter = inputType.nextLine();
        num = random.nextInt(100)+1;
        if (num <= chanceOfDelay) {
            print("Damn 7 train! There is 10 minutes delay.");
            remainingMinutes -= 10;
        }
        remainingMinutes -= 10;
        print("You got off 7 train. Now you arrived at Access Code 2.1");

        if (remainingMinutes >= 30) {
            thirtyMinutesEarly();
        } else if (remainingMinutes >= 20) {
            twentyMinutesEarly();
        } else if (remainingMinutes >= 10) {
            tenMinutesEarly();
        } else if (remainingMinutes >= 0) {
            onTime();
        } else {
            print(" __     __                            _            _______ ______ _ \n" +
                    " \\ \\   / /                           | |        /\\|__   __|  ____| |\n" +
                    "  \\ \\_/ ___  _   _    __ _ _ __ ___  | |       /  \\  | |  | |__  | |\n" +
                    "   \\   / _ \\| | | |  / _` | '__/ _ \\ | |      / /\\ \\ | |  |  __| | |\n" +
                    "    | | (_) | |_| | | (_| | | |  __/ | |____ / ____ \\| |  | |____|_|\n" +
                    "    |_|\\___/ \\__,_|  \\__,_|_|  \\___| |______/_/    \\_|_|  |______(_)\n" +
                    "                                                                    \n" +
                    "                                                                    ");
            print("You are " + Math.abs(remainingMinutes) + " minutes late!");
            print("As you know, Access Code 2.1 requires strict attendance. You failed.");
            quit();
        }

    }

    public static void officehour() {
        checkorientation();

        if(!isfulfilled[1]) {
            print("\nMake sure you take the lecture first before you come to the office hour!");
            menu();
            return;
        }

        if (isfulfilled[2]) {
            print("You already visited office hour.");
            print("Currently all the TAs are unavailable.");
            print("Please do other things! Thank you.");
            menu();
            return;
        }

        print("\nWelcome to the office hour of Access Code 2.1!");
        print("Our office hour is 7 to 10 PM on Monday and Wednesday!");
        print("Please come to office hour often and don't forget to fill out the exit ticket!");
        print("Press ENTER to continue");

        enter = inputType.nextLine();

        if (knowStaff) {
            print("\n" + staffs[staffNumber] + " : \"Hello! I'm " + staffs[staffNumber] + "! Do you remember me?" +
                    " We met on the first day of the class. Nice to see you again!\"");
            print("\nNow you have connection with " + staffs[staffNumber] + ". Your earned extra 10 learning points!");
            learningPoint += 10;
        }

        print("You learned a lot from the office hour.");
        learningPoint += 20;
        print("Your current learning points is " + learningPoint);
        isfulfilled[2] = true;
        menu();

    }

    public static void homework() {
        int total;
        checkorientation();
        print("\n\n\nWelcome to the homework session!");

        if (learningPoint < 60) {
            print("In order to take this session, you must have more than 60 of learning points.");
            print("Your current learning points is " + learningPoint);
            print("You can earn learning points from lecture, office hour, pair programming, and group project.");
            print("Please finish other things first and come back. See you later!");
            menu();
            quit();
        }

        print("In order to pass this session, your final score must be equal to greater than 80.");
        print("Final score is the average of the test score and learning points.");

        print("\nOkay! Let's get started!");
        print("\nQ1. Which type is not primitive type?\n" +
                "1. char\n" +
                "2. int\n" +
                "3. String\n" +
                "4. double\n" +
                "5. boolean");
        answer = input.nextInt();
        if (answer == 3) {
            print("Awesome! You are right!");
            homework += 50;
        } else {
            print("Wrong! The answer is : 3");
        }

        print("\nQ2. Declare an integer variable named 'myAge' and assign the value 18");

        enter = inputType.nextLine();

        if (enter.equals("int myAge = 18;")) {
            print("Awesome! You are right!");
            homework += 50;
        } else {
            print("Wrong! The answer is : int myAge = 18;");
        }

        total = (homework + learningPoint)/2;
        print("\nYou completed the test!");
        print("Your test score is " + homework);
        print("Your learning point is " + learningPoint);
        print("So your final score is : " + total);

        if (total >= 80) {
            print("\nCongratualtions! You passed the homework session!");
            isfulfilled[3] = true;
            menu();
        }
        else {
            print("I'm sorry. You couldn't pass this session. Try again!");
            isfulfilled[3] = false;
            menu();
        }

    }

    public static void pairprogramming() {
        int number = random.nextInt(32);
        checkorientation();
        print("\nWelcome to the pair programming session!");

        if(metFriend) {
            print("Your partner is " + friends[friendNumber] + ".");
            print(friends[friendNumber] + " : Hello! Wow! Nice to see you again! I'm glad to be your partner.");
            learningPoint += 20;
            print("\nSince you guys are friends, you did a great job!");
        }
        else {
            print("Your partner is " + friends[number] + ".");
            print(friends[number] + " : Hello! Nice to meet you. My name is " + friends[number] +
                    ". Let's get started. Press ENTER to continue.");
            enter = inputType.nextLine();

            print("\n" + friends[number] + " is driving and you are watching it.");
            print(friends[number] + " wrote this following code : ");
            print("\nString flower = \"rose\";\n" +
                    "if (flower == \"rose\" {\n" +
                    "     System.out.println(\"I love rose!\");\n" +
                    "} else {\n" +
                    "     System.out.println(\"This is not the flower I want!\");\n" +
                    "}");
            print("\nThe output is : This is not the flower I want!");
            print(friends[number] + " is confused and ask you why it prints that output");
            print("What would you tell your partner?\n" +
                    "1. Because actually you don't love rose.\n" +
                    "2. Because operator == compares the address of String flower.\n" +
                    "3. Because you should use '' instead of \"\".\n" +
                    "4. Because sometimes life gives a lemon instead of rose.\n" +
                    "5. Because String is not a boolean value.");
            answer = input.nextInt();
            if (answer == 2) {
                print("\nAwesome! You are right!");
                learningPoint += 10;
            }
            else {
                print("\nWrong! The answer is : 2");
                print("I will take 10 learning points off from you :)");
                learningPoint -= 10;
            }

            print("\nOkay, " + friends[number] + " wrote this following code : ");
            print("\nint k;\n" +
                    "while (k > 10) {\n" +
                    "     System.out.println(\"Hello!\");\n" +
                    "}");
            print("\nHowever, you got the compile error. Why is that?\n" +
                    "1. Because k is not initialized.\n" +
                    "2. Because k is less than 10.\n" +
                    "3. Because you can not put integer value in the while loop\n" +
                    "4. Because the output is nothing to do with k");

            answer = input.nextInt();
            if (answer == 1) {
                print("\nAwesome! You are right!");
                learningPoint += 10;
            }
            else {
                print("\nWrong! The answer is : 1");
                print("I will take 10 learning points off from you :)");
                learningPoint -= 10;
            }


        }


        print("Thanks for taking pair programming");
        print("You learned a lot! Your current learning points is : " + learningPoint);
        isfulfilled[4] = true;
        menu();

    }

    public static void tweet() {
        checkorientation();
        Scanner inputTweet = new Scanner(System.in);
        print("\nWelcome to Twitter!");
        print("You must tweet at least once a week in order to graduate!");

        outer:
        while (true) {
            print("Would you like to tweet now?\n" +
                    "1. Yes\n" +
                    "2. No, not now. Go back to Menu\n" +
                    "0. Quit");

            answer = input.nextInt();

            switch (answer) {
                case 1 :
                    print("Write something you want to tweet and press ENTER");
                    tweetMessage = inputTweet.nextLine();
                    print("You successfully tweeted!");
                    isfulfilled[5] = true;
                    menu();
                    break outer;
                case 2 :
                    menu();
                    break outer;
                case 0 :
                    quit();
                    break;
                default:
                    print("Wrong input! Try again");
            }

        }


    }

    public static void medium() {
        checkorientation();
        print("Thanks for posting on Medium");
        isfulfilled[6] = true;
        menu();

    }

    public static void project() {
        checkorientation();

        print("\nWelcome to the group project session!");
        print("We are going to make Roman-calculator!");
        print("In order to perform a group project successfully, " +
                "you must need to know how to work with other people in GitHub");

        print("\nFirst, your group leader already forked Roman-calculator from the instructor.");
        print("All you need to do is just cloning that repository.");
        print("You need to copy something. What would you copy?\n" +
                "1. SSH\n" +
                "2. HTTPS\n" +
                "3. Subversion");
        answer = input.nextInt();
        if (answer != 1) {
            print("Wrong! You must copy SSH. You failed to clone the repository so you can't work with group");
            print("Try again! Bye~");
            menu();
            return;
        }

        print("Cool! Make sure you copy SSH but not others!");
        print("The address you copied is : git@github.com:blahblah.git");
        print("Please type the command to clone it.");
        enter = inputType.nextLine();

        if (!enter.equals("git clone git@github.com:blahblah.git")) {
            print("Wrong! You failed to clone the repository.");
            print("The answer is : git clone git@github.com:blahblah.git");
            print("Practice and study more about GitHub and come back later. Bye!");
            menu();
            return;
        }

        print("Cool! You cloned the repository into your local computer successfully!");
        print("You did some work and now it is time to add and commit.");
        print("Please type the command to add your work.");

        enter = inputType.nextLine();

        if (!enter.equals("git add .") && !enter.equals("git add -A .")) {
            print("Wrong! You failed to add your work in git.");
            print("The answer is : git add . or git add -A .");
            print("Practice and study more about GitHub and come back later. Bye!");
            menu();
            return;
        }

        print("Cool! You added your work in git successfully!");
        print("Now it is time to commit it, right?");
        print("Please type the command to commit your work");
        print("In the message, just type 'message'");

        enter = inputType.nextLine();

        if (!enter.equals("git commit -m \"message\"")) {
            print("Wrong! You failed to commit your work in git.");
            print("The answer is : git commit -m \"message\"");
            print("Practice and study more about GitHub and come back later. Bye!");
            menu();
            return;
        }

        print("Cool! You committed your work in git successfully!");
        print("Now it is the last stage. Push your work!");
        print("However, remember! Since this is the group repository, you can't just push to the master");
        print("You must create your own branch first, then push to your branch");
        print("Then you can make a pull request in GitHub");
        print("Please type the command to create your own branch");
        print("Your branch name is c4qisawesome");

        enter = inputType.nextLine();

        if (!enter.equals("git branch c4qisawesome")) {
            print("Wrong! You failed to create your own branch.");
            print("The answer is : git branch c4qisawesome");
            print("Practice and study more about GitHub and come back later. Bye!");
            menu();
            return;
        }

        print("Cool! You created your own branch successfully!");
        print("Now let's move to your own branch");
        print("Please type the command to move to your own branch.");
        print("Don't forget that the name of the branch is c4qisawesome");

        enter = inputType.nextLine();

        if (!enter.equals("git checkout c4qisawesome")) {
            print("Wrong! You failed to move to your own branch.");
            print("The answer is : git checkout c4qisawesome");
            print("Practice and study more about GitHub and come back later. Bye!");
            menu();
            return;
        }

        print("Cool! You moved to your own branch successfully!");
        print("This is the last stage! Push to your own branch!");
        print("Please type the command to push to your own branch");
        print("Don't forget that the name of the branch is c4qisawesome");

        enter = inputType.nextLine();

        if (!enter.equals("git push origin c4qisawesome")) {
            print("Wrong! You failed to push to your own branch.");
            print("The answer is : git push origin c4qisawesome");
            print("Practice and study more about GitHub and come back later. Bye!");
            menu();
            return;
        }

        print("You pushed your work to your own branch successfully!");

        learningPoint += 20;
        isfulfilled[7] = true;
        print("\nAwesome! Since you know how to work with group with GitHub,");
        print("you successfully finished your group project. Congratulations!");
        print("You learned a lot! Your current learning points is : " + learningPoint);
        print("Press ENTER to continue other works.");
        enter = inputType.nextLine();
        menu();

    }

    public static void graduation() {
        checkorientation();
        boolean canGraduate = true;
        for (int i=0; i<isfulfilled.length; i++) {
            if (isfulfilled[i] == true) {
                continue;
            }
            else {
                print("***** : " + requirements[i]);
                canGraduate = false;
            }
        }

        if (canGraduate) {
            print("Congratulations! You successfully graduated Access Code 2.1!");
            quit();
        }
        else {
            print("These are the requirements you need to fulfill. Let's keep working!");
            menu();
        }

    }

    public static void main(String[] args) {

        intro();

        for (int i=0; i<isfulfilled.length; i++) {
            isfulfilled[i] = false;
        }

        menu();

    }

}