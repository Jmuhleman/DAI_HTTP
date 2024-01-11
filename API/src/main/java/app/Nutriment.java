package app;

import java.util.ArrayList;

public class Nutriment {

    public String name;
    public double energy;
    public double protein;
    public double carbohydrate;
    public double fat;
    //public ArrayList<VitaminAndMineral> vitaminAndMinerals;

    public Nutriment() {
    }
    public Nutriment(String n, double e, double p, double c, double f/*, ArrayList<VitaminAndMineral> v*/) {
        name = n;
        energy = e;
        protein = p;
        carbohydrate = c;
        fat = f;
        //vitaminAndMinerals = v;
    }

    public double getEnergy() {
        return energy;
    }

    public void setNutriment(String n, double e, double p, double c, double f/*, ArrayList<VitaminAndMineral> v*/) {
        name = n;
        energy = e;
        protein = p;
        carbohydrate = c;
        fat = f;
        //vitaminAndMinerals = v;
    }


}
