package edu.wmich.cs1120.la5;

public class HighArea extends Area {

	/**
	 * Constructor for High Area class that calls Area constructor
	 * @param energy
	 * @param elevate
	 * @param radiate
	 * @param threshold
	 */
	public HighArea(double energy,double elevate, double radiate, double threshold){
		super(energy,elevate,radiate,threshold);
	}
	
	/**
	 * Calculates the energy consumed for a high energy area
	 * @return double
	 */
	@Override
	public double calcConsumedEnergy(){
		return super.getBasicEnergyCost() * 4;
	}
}
