package edu.wmich.cs1120.la5;

public interface IArea {

	/**
	 * The getter method for the private variable basicEnergyCost
	 * @return double
	 */
	double getBasicEnergyCost();
	/**
	 *  The setter method for the private variable basicEnergyCost
	 * @return void
	 * @param cost
	 */
	void setBasicEnergyCost(double cost);	
	/**
	 * The getter method for the private variable elevation
	 * @return double elevation
	 */
	double getElevation();
	/*
	 * The setter method for the private variable elevation
	 * @return void
	 * @param double elevate
	 */
	void setElevation(double elevate);
	/**
	 * The getter method for the private variable radiation
	 * @return double radiation
	 */
	double getRadiation();
	/**
	 * The setter method for the private variable radiation
	 * @return void
	 * @param double radiate
	 */
	void setRadiation(double radiate);
	/**
	 * This method determines if the area is high or low energy based on certain parameters
	 * then calls the appropriate method based on the text file
	 * @return double
	 */
	double calcConsumedEnergy();
}
