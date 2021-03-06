package umn.ac.id.uts;

import java.util.ArrayList;

public class Unhealthy extends Human {
    private int muscle;
    private int fat;
    private int stressLevel;
    private double weight;
    private String eatStatus = "";
    private String workoutStatus = "";
    private static ArrayList<String> activities = new ArrayList<>();

    public Unhealthy() {
    }

    public Unhealthy(String name, int age) {
        super(name, age);
        this.muscle = 25;
        this.fat = 50;
        this.weight = (this.fat * 0.3) + (this.muscle * 0.6);
        this.stressLevel = 4;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getFat() {
        return this.fat;
    }

    public int getMuscle() {
        return this.muscle;
    }

    public int getStressLevel() {
        return this.stressLevel;
    }

    public void updateWeight(int f, int m) {
        this.weight += (f * 0.3) + (m * 0.6);
    }

    public void eat(Food food) {
        if (this.muscle >= food.muscle) {
            eatStatus = super.getName() + " loves it.";
            this.fat += food.fat;
            this.muscle -= food.muscle;
            updateWeight(food.fat, food.muscle);
            this.stressLevel -= 2;
            activities.add("Eating: " + food.name);
        } else if (this.muscle < food.muscle) {
            eatStatus = super.getName() + " is way too unhealthy.";
        }
    }

    public void workout(Exercise exercise) {
        if (this.stressLevel <= 10) {
            workoutStatus = super.getName() + " doesn't really like it.";
            this.fat += exercise.fat;
            this.muscle -= exercise.muscle;
            updateWeight(exercise.fat, exercise.muscle);
            this.stressLevel += 2;
            activities.add("Working out: " + exercise.name);
        } else if (this.stressLevel > 10) {
            workoutStatus = super.getName() + " is stressed out.";
        }
    }

    public String getEatStatus() {
        return this.eatStatus;
    }

    public String getWorkoutStatus() {
        return this.workoutStatus;
    }

    public void printUnhealthyActivities() {
        for (String activity : activities) {
            System.out.println(activity);
        }
    }
}