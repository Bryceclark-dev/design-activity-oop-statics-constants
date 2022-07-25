package com.kenzie.library;

public class Wagon {
    private int capacity;
    private Traveler[] passengers;

    public Wagon() {
        this.capacity = 0;
        this.passengers = new Traveler[this.capacity];
    }

    public Wagon(int capacity){
        this.capacity = capacity;
        this.passengers = new Traveler[this.capacity];
    }
    public int getAvailableSeatCount(){
        int count = 0;
        for(int i = 0; i < this.passengers.length; i++){
            if(this.passengers[i] == null){
                count++;
            }
        }
        return count;
    }

    public void join(Traveler traveler){
        int space = getAvailableSeatCount();

        if(space != 0){
            for(int i = 0; i < this.passengers.length; i++){
                if(this.passengers[i] == null){
                    this.passengers[i] = traveler;
                    break;
                }
            }
        }
    }
    public int totalFood(){
        int food = 0;

        for(int i = 0; i < this.passengers.length; i++) {
            if (this.passengers[i] != null) {
                food += this.passengers[i].getFood();
            }
        }

        return food;
    }

    public boolean shouldQuarantine(){

        for(int i = 0; i < this.passengers.length; i++) {

            if (this.passengers[i] != null) {
                if (this.passengers[i].isHealthy == false) {
                    return true;
                }
            }else{
                break;
            }
        }
        return false;
    }

    public void loadWagon(int numTravelers, int numHunters, int numDoctors){
        for(int i = 0; i < numTravelers; i++){
            Traveler traveler = new Traveler();
            this.join(traveler);
        }
        for(int i = 0; i < numHunters; i++){
            Hunter hunter = new Hunter();
            this.join(hunter);
        }
        for(int i = 0; i < numDoctors; i++){
            Doctor doctor = new Doctor();
            this.join(doctor);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    public Traveler[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Traveler[] passengers) {
        this.passengers = passengers;
    }
}
