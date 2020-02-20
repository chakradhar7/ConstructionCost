package com.epam.clean_code.SimpleIntereset_CompoundInterest.HouseConstruction;

public class ConstructionCost {
    private int material;
    private double areaOfHouse;
    private boolean isAutomated;
    private double estimatedCost;
    public ConstructionCost(int material,double areaOfHouse,boolean isAutomated)
    {
        this.material = material;
        this.areaOfHouse = areaOfHouse;
        this.isAutomated = isAutomated;
        switch(this.material)
        {
            case 0: this.estimatedCost = 1200;
                    break;
            case 1: this.estimatedCost = 1500;
                    break;
            case 2: this.estimatedCost = 1800;
                    break;
        }
        if(this.isAutomated)
        {
            this.estimatedCost += 700;
        }
    }
    public double Estimate()
    {
        return this.estimatedCost * this.areaOfHouse;
    }
}
