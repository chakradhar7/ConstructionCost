package com.epam.clean_code.SimpleIntereset_CompoundInterest.interests;

public class Interests {
	 private double principalAmount,rateOfInterest,timePeriod,CIamount;

	    public Interests(double principalAmount, double rateOfInterest, double timePeriod)
	    {
	        this.principalAmount = principalAmount;
	        this.rateOfInterest = rateOfInterest;
	        this.timePeriod = timePeriod;
	    }

	    public double SimpleInterest()
	    {
	        return (principalAmount*rateOfInterest*timePeriod)/100;
	    }

	    public double CompoundInterest()
	    {
	        this.CIamount = principalAmount*(Math.pow(1+(rateOfInterest/100),timePeriod));
	        return this.CIamount-principalAmount;
	    }
}
