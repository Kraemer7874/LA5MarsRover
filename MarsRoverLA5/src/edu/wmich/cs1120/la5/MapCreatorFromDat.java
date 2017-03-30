package edu.wmich.cs1120.la5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator{

	private TerrainScanner scanner;
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		FileInputStream fstream = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(fstream);
		
		Area[][] terrain = new Area[10][10];
		double basicEnergyCost;
		double elevation;
		double radiation;
		for(int row = 0; row < 10; row++){
			for(int col = 0; col < 10; col++){
				basicEnergyCost = input.nextDouble();
				elevation = input.nextDouble();
				radiation = input.nextDouble();
				input.nextLine();
				terrain[row][col] = new Area(basicEnergyCost, elevation, radiation, threshold);
			}
		}
		scanner = new TerrainScanner();
		scanner.setTerrain(terrain);
		
	}

	@Override
	public TerrainScanner getScanner() {
		return scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
