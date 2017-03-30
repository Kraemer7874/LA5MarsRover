package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	private ArrayList<IArea> path;
	private String analysis;
	
	/**
	 * Get the path to be the given argument 
	 * @return ArrayList<IArea>
	 */
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	/**
	 *  Set the path to be the given argument 
	 * @return void
	 * @param ArrayList<IArea> path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}

	/**
	 * Analyze the path for energy 
	 */
	@Override
	public void analyzePath() {
		path=getPath();
		double total=0;
		for(int i=0;i<path.size();i++){
			total=total+path.get(i).calcConsumedEnergy();
		}
		analysis = "Total Energy: "+total;
	}

	/**
	 *  Get the result of the analysis according to the type of 
	 *  the analyzer
	 * @return String
	 */
	@Override
	public String getAnalysis() {
		return analysis;
	}

	/**
	 *  Set the result of the analysis according to the type of
	 *  the analyzer
	 * @param analysis
	 */
	@Override
	public void setAnalysis(String analysis) {
		this.analysis=analysis;
	}
}
