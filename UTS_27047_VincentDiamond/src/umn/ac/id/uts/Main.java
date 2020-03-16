package umn.ac.id.uts;

import java.util.Scanner;

public class Main {
    static Healthy healthy;
    static Unhealthy unhealthy;
    static Food[] foods = new Food[5];
    static Exercise[] exercises = new Exercise[5];

    public static void main(String[] args) {
        tampilanAwal();
        for (; ; ) {
            mainMenu();
        }
    }

    public static void seedFoodsData() {
        foods[0] = new Food("Pizza", 3, 10);
        foods[1] = new Food("Risotto", 2, 4);
        foods[2] = new Food("Burger", 4, 9);
        foods[3] = new Food("Noodle", 3, 5);
        foods[4] = new Food("Salad", 1, 1);
    }

    public static void printFoods() {
        seedFoodsData();
        int id = 1;
        System.out.println("----------------------------------");
        System.out.println("Foods");
        for (Food food : foods) {
            System.out.println("-------------");
            System.out.println("ID\t\t: " + id++);
            System.out.println("Name\t: " + food.name);
            System.out.println("Muscle\t: " + food.muscle);
            System.out.println("Fat\t\t: " + food.fat);
        }
        System.out.println("----------------------------------");
    }

    public static void printExercises() {
        seedExercisesData();
        int id = 1;
        System.out.println("----------------------------------");
        System.out.println("Exercises");
        for (Exercise exercise : exercises) {
            System.out.println("-------------");
            System.out.println("ID\t\t: " + id++);
            System.out.println("Name\t: " + exercise.name);
            System.out.println("Muscle\t: " + exercise.muscle);
            System.out.println("Fat\t\t: " + exercise.fat);
        }
        System.out.println("----------------------------------");
    }

    public static void seedExercisesData() {
        exercises[0] = new Exercise("Plank", 1, 2);
        exercises[1] = new Exercise("Crunch", 2, 3);
        exercises[2] = new Exercise("Squat", 3, 3);
        exercises[3] = new Exercise("Pull up", 2, 2);
        exercises[4] = new Exercise("Comandos", 5, 2);
    }

    public static void tampilanAwal() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("---------------------------");
        System.out.println("Living Life");
        System.out.println("---------------------------");

        System.out.println("Healthy");
        System.out.print("Name\t: ");
        name = scanner.nextLine();
        System.out.print("Age\t\t: ");
        age = scanner.nextInt();
        healthy = new Healthy(name, age);
        System.out.println("Healthy character is added");
        scanner.nextLine();


        System.out.println("Unhealthy");
        System.out.print("Name\t: ");
        name = scanner.nextLine();
        System.out.print("Age\t\t: ");
        age = scanner.nextInt();
        unhealthy = new Unhealthy(name, age);
        System.out.println("Unhealthy character is added");
        scanner.nextLine();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean hasValidInput = false;
        int input;

        System.out.println("---------------------------");
        System.out.println("Living Life");
        System.out.println("---------------------------");
        System.out.println("1. Your Detail");
        System.out.println("2. Eat");
        System.out.println("3. Workout");
        System.out.println("4. List of activities");
        System.out.println("5. Credits");
        System.out.println("0. Exit");

        while (!hasValidInput) {
            System.out.print("Input: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    showYourDetail();
                    hasValidInput = true;
                    break;
                case 2:
                    showEat();
                    hasValidInput = true;
                    break;
                case 3:
                    showWorkout();
                    hasValidInput = true;
                    break;
                case 4:
                    showActivities();
                    hasValidInput = true;
                    break;
                case 5:
                    showCredits();
                    hasValidInput = true;
                    break;
                case 0:
                    System.out.println("Terima kasih, sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    public static void showYourDetail() {
        Scanner scanner = new Scanner(System.in);
        boolean hasValidInput = false;
        int input;

        System.out.println("---------------------------");
        System.out.println("Living Life");
        System.out.println("---------------------------");
        System.out.println("1. Healthy");
        System.out.println("2. Unhealthy");

        while (!hasValidInput) {
            System.out.print("Choose your character: ");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    System.out.println("Healthy");
                    System.out.println("Name\t\t: " + healthy.getName());
                    System.out.println("Age\t\t\t: " + healthy.getAge());
                    System.out.println("Weight\t\t: " + healthy.getWeight());
                    System.out.println("Muscle\t\t: " + healthy.getMuscle());
                    System.out.println("Fat\t\t\t: " + healthy.getFat());
                    System.out.println("Stress Level: " + healthy.getStressLevel());
                    hasValidInput = true;
                    break;
                case 2:
                    System.out.println("Unhealthy");
                    System.out.println("Name\t\t: " + unhealthy.getName());
                    System.out.println("Age\t\t\t: " + unhealthy.getAge());
                    System.out.println("Weight\t\t: " + unhealthy.getWeight());
                    System.out.println("Muscle\t\t: " + unhealthy.getMuscle());
                    System.out.println("Fat\t\t\t: " + unhealthy.getFat());
                    System.out.println("Stress Level: " + unhealthy.getStressLevel());
                    hasValidInput = true;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    public static void showEat() {
        Scanner scanner = new Scanner(System.in);
        int characterInput, foodChoice;
        boolean hasValidInput = false;
        printFoods();

        while (true) {
            System.out.print("Choose your Food: ");
            foodChoice = scanner.nextInt();
            if (foodChoice > 0 && foodChoice < 6)
                break;
            else
                System.out.println("Invalid input");
        }

        scanner.nextLine();
        foodChoice -= 1;
        System.out.println();
        System.out.println("1. Healthy");
        System.out.println("2. Unhealthy");

        while (!hasValidInput) {
            System.out.print("Choose your character: ");
            characterInput = scanner.nextInt();
            switch (characterInput) {
                case 1:
                    healthy.eat(foods[foodChoice]);
                    System.out.println(healthy.getEatStatus());
                    hasValidInput = true;
                    break;
                case 2:
                    unhealthy.eat(foods[foodChoice]);
                    System.out.println(unhealthy.getEatStatus());
                    hasValidInput = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void showWorkout() {
        Scanner scanner = new Scanner(System.in);
        int characterInput, exerciseChoice;
        boolean hasValidInput = false;
        printExercises();

        while (true) {
            System.out.print("Choose your workout: ");
            exerciseChoice = scanner.nextInt();
            if (exerciseChoice > 0 && exerciseChoice < 6)
                break;
            else
                System.out.println("Invalid input");
        }

        scanner.nextLine();
        exerciseChoice -= 1;
        System.out.println();
        System.out.println("1. Healthy");
        System.out.println("2. Unhealthy");

        while (!hasValidInput) {
            System.out.print("Choose your character: ");
            characterInput = scanner.nextInt();
            switch (characterInput) {
                case 1:
                    healthy.workout(exercises[exerciseChoice]);
                    System.out.println(healthy.getWorkoutStatus());
                    hasValidInput = true;
                    break;
                case 2:
                    unhealthy.workout(exercises[exerciseChoice]);
                    System.out.println(unhealthy.getWorkoutStatus());
                    hasValidInput = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void showActivities() {
        boolean hasValidInput = false;
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("---------------------------");
        System.out.println("Living Life");
        System.out.println("---------------------------");
        System.out.println("Activities");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("1. Healthy");
        System.out.println("2. Unhealthy");

        while (!hasValidInput) {
            System.out.print("Choose your character: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Healthy");
                    healthy.printHealthyActivities();
                    hasValidInput = true;
                    break;
                case 2:
                    System.out.println("Unhealthy");
                    unhealthy.printUnhealthyActivities();
                    hasValidInput = true;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    public static void showCredits() {
        System.out.println("---------------------------");
        System.out.println("Living Life");
        System.out.println("---------------------------");
        System.out.println("Name\t: Vincent Diamond");
        System.out.println("NIM\t\t: 00000027047");
    }
}
