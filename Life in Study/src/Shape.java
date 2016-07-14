import java.util.ArrayList;

public class Shape {
	private String name;
	private ArrayList<Integer> xDeviation;
	private ArrayList<Integer> yDeviation;
	private int[][] map;

	public Shape(String name, ArrayList<Integer> xDeviation,
			ArrayList<Integer> yDeviation) {
		super();
		this.name = name;
		this.xDeviation = xDeviation;
		this.yDeviation = yDeviation;
		buildBitMap();

	}

	public int[][] buildBitMap() {
		int maxX = 0;
		for (int a : xDeviation) {
			if (maxX < a)
				maxX = a;
		}
		int maxY = 0;
		for (int a : yDeviation) {
			if (maxY < a)
				maxY = a;
		}
		int[][] map = new int[maxX][maxY];

		for (int i = 0; i < xDeviation.size(); i++) {
			map[xDeviation.get(i)][yDeviation.get(i)] = 1;
		}

		this.map = map;

		return map.clone();
	}

	public int[][] addToMap(int[][] map, int x, int y) {
		for (int i = 0; i < xDeviation.size(); i++) {
			map[x + xDeviation.get(i)][y + yDeviation.get(i)] = 1;
		}

		return map;
	}

	public boolean isMatch(int[][] map, int x, int y) {
		
		
		for (int i = 0; i < this.map.length; i++){
			for(int j = 0; j < this.map[i].length; j++){
				if(this.map[i][j] != map[i][j]){
					return false;
				}
			}
		}

		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getxDeviation() {
		return xDeviation;
	}

	public void setxDeviation(ArrayList<Integer> xDeviation) {
		this.xDeviation = xDeviation;
	}

	public ArrayList<Integer> getyDeviation() {
		return yDeviation;
	}

	public void setyDeviation(ArrayList<Integer> yDeviation) {
		this.yDeviation = yDeviation;
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

}
