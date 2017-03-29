package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.TerrainScanner; 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MapCreatorFromTxt implements IMapCreator {

	private TerrainScanner scan;
	private Area[][] terrain=new Area[10][10];
	
	/**
	 * This method reads a file and fills the terrain array
	 * Declares the scan variable and sets Terrain
	 * @return void
	 * @param fileName-> name of the file
	 * @param threshold-> the elevation threshold for the rover
	 * @throws IOException
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {

		double energy;
		double elevate;
		double radiate;
		File newFile=new File(fileName);
		Scanner file=new Scanner(newFile);
		for(int i=0;i<terrain.length;i++)
			for(int j=0;j<terrain[i].length;j++){
				energy=file.nextDouble();
				elevate=file.nextDouble();
				radiate=file.nextDouble();
				file.nextLine();
				Area obj=new Area(energy,elevate,radiate,threshold);
				terrain[i][j]=obj;
			}
		scan=new TerrainScanner();
		scan.setTerrain(terrain);	
		file.close();
	}

	/**
	 * The getter method for the private variable scan;
	 * @return TerrainScanner scan
	 */
	@Override
	public TerrainScanner getScanner() {
		return scan;}
	/**
	 * The setter method for the private variable scan
	 * @return void
	 * @param TerrainScanner scanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		scan=scanner;
	}
}
