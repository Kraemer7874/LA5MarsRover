package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public interface IRover {
	/**
	 * Get the path to be the given argument 
	 * @return ArrayList<IArea>
	 */
	ArrayList<IArea> getPath();
	/**
	 *  Set the path to be the given argument 
	 * @return void
	 * @param ArrayList<IArea> path
	 */
	void setPath(ArrayList<IArea> path); 
	/**
	 * Analyze the path according to the type of the analyzer 
	 */
	void analyzePath(); 
	/**
	 *  Get the result of the analysis according to the type of 
	 *  the analyzer
	 * @return String
	 */
	String getAnalysis(); 
	/**
	 *  Set the result of the analysis according to the type of
	 *  the analyzer
	 * @param analysis
	 */
	void setAnalysis(String analysis);
	/**
	 *  Return the name of the analyzer
	 * @return String
	 */
	String toString();
}
