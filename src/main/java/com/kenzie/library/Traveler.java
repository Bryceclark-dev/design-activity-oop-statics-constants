package com.kenzie.library;

public class Traveler {
//TODO: Code Traveler class
    protected String name;
    protected int food;
    protected boolean isHealthy;

    public Traveler() {
        this.name = "";
        this.food = 1;
        this.isHealthy = true;
    }

    public Traveler(String name) {
        this.name = name;
        this.food = 1;
        this.isHealthy = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public void hunt(){
        this.food += 2;
    }

    public void eat(){
        if(this.food > 0){
            this.food -= 1;
        }else{
            this.isHealthy = false;
        }
    }
}

class Doctor extends Traveler {
//TODO: Code Doctor class
    public Doctor(){
        super();
    }

    public Doctor(String name){
        super(name);
    }

    public void heal(Traveler traveler){
        traveler.setIsHealthy(true);
    }
}

class Hunter extends Traveler {
//TODO: Code Hunter class
    public Hunter(){
        super();
        this.food = 2;
    }

    public void hunt(){
        this.food += 5;
    }

    public void eat(){

        if(this.food > 1){
            this.food -= 2;
        }else{
            this.food = 0;
            this.isHealthy = false;
        }
    }

    public void giveFood(Traveler traveler, int numOfFoodUnits){
        traveler.food += numOfFoodUnits;
        this.food -= numOfFoodUnits;
    }
  
  
}

