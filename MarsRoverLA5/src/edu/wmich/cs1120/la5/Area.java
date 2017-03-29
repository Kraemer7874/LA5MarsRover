package edu.wmich.cs1120.la5;

public class Area implements IArea {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	private double thresh;
	
	/**
	 * Constructor for Area class
	 * @param energy
	 * @param elevate
	 * @param radiate
	 * @param threshold
	 */
	public Area(double energy, double elevate, double radiate, double threshold){
		setBasicEnergyCost(energy);
		setElevation(elevate);
		setRadiation(radiate);
		setThresh(threshold);
	}
	
	/**
	 * The getter method for the private variable basicEnergyCost
	 * @return double
	 */
	@Override
	public double getBasicEnergyCost() {	
		return basicEnergyCost;}
	/**
	 * The setter method for the private variable basicEnergyCost
	 * @return void
	 * @param cost
	 */
	@Override	
	public void setBasicEnergyCost(double cost) {
		basicEnergyCost=cost;	
	}

	/**
	 * The getter method for the private variable elevation
	 * @return double elevation
	 */
	@Override
	public double getElevation() {	
		return elevation;}
	/**
	 * The setter method for the private variable elevation
	 * @return void
	 * @param doube elevate
	 */
	@Override
	public void setElevation(double elevate) {
		elevation=elevate;
	}

	/**
	 * The getter method for the private variable radiation
	 * @return double radiation
	 */
	@Override
	public double getRadiation() {
		return radiation;}
	/**
	 * The setter method for the private variable radiation
	 * @return void
	 * @param double radiate
	 */
	@Override
	public void setRadiation(double radiate) {
		radiation=radiate;
	}

	/**
	 * The setter method for the private variable thresh
	 * @param num
	 */
	public void setThresh(double num){
		thresh=num;
	}
	
	/**
	 * This method determines if the area is high or low energy based on certain parameters
	 * then calls the appropriate method based on the text file
	 */
	public double calcConsumedEnergy() {
		if(radiation>=0.5){
			HighArea ha=new HighArea(basicEnergyCost,elevation,radiation,thresh);	
			return ha.calcConsumedEnergy();
		}
		else if(radiation<0.5 && elevation>(thresh*0.5)){
			HighArea ha=new HighArea(basicEnergyCost,elevation,radiation,thresh);	
			return ha.calcConsumedEnergy();
		}
		else{
			LowArea la=new LowArea(basicEnergyCost,elevation,radiation,thresh);	
			return la.calcConsumedEnergy();
		}
	}
}
