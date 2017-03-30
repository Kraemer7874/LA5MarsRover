package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.RandomAccessFile;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator{

	private TerrainScanner scanner;
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		RandomAccessFile inputFile = new RandomAccessFile(fileName, "r");
		
		Area[][] terrain = new Area[10][10];
		double basicEnergyCost;
		double elevation;
		double radiation;
		int point = 0;
		int row = 0;
		int col = 0;
		int left = 0;
		int right = 0;
		char op = 'a';
		
		do{
			inputFile.seek(point * (3 * Double.BYTES + 1 * Character.BYTES + 2 * Integer.BYTES));
			basicEnergyCost = inputFile.readDouble();
			elevation = inputFile.readDouble();
			radiation = inputFile.readDouble();
			op = inputFile.readChar();
			left = inputFile.readInt();
			right = inputFile.readInt();
			terrain[row][col] = new Area(basicEnergyCost, elevation, radiation, threshold);
			IExpression num = ExpressionFactory.getExpression(op, left, right);
			point = num.getValue();
			if(col == 9){
				col = 0;
				row++;
			}
			else{col++;}
		}while(point != -1);
		scanner = new TerrainScanner();
		scanner.setTerrain(terrain);
		
		inputFile.close();
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
