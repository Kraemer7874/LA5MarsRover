package edu.wmich.cs1120.la5;

import java.io.IOException;
/**
 * MapCreator Interface
 * @author Jasmine Kraemer
 *
 */
public interface IMapCreator {
/**
 * Skeleton for scanTerrain in MapCreator
 * @param fileName takes the fileName from user
 * @param threshold takes the threshold inputed by the user
 * @throws IOException catches any exceptions the file may throw
 */
	public void scanTerrain(String fileName, int threshold) throws IOException;
	/**
	 * Skeleton for getScanner in MapCreator
	 * @return the TerrainScanner object
	 */
	public TerrainScanner getScanner();
	/**
	 * Skeleton for setScanner in MapCreator
	 * @param scanner the object that the TerrainScanner is being set to
	 */
	public void setScanner(TerrainScanner scanner);

}
