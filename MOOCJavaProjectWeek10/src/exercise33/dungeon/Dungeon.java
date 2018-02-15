package exercise33.dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dungeon {

	private DungeonPawn player;
	private List<DungeonPawn> vampires;
	
	private int vampireCount;
	private int lightLevel;
	
	private char[][] map;
	private int mapLength,
				mapHeight;
	
	private Scanner reader;
	
	public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
		this.vampires = new ArrayList<>();
		player = new DungeonPawn(0,0,'@');
		vampireCount = vampires;
		lightLevel = moves;
		
		reader = new Scanner(System.in);
		this.mapLength = length;
		this.mapHeight = height;
		
		map = new char[height][length];
		initializeMap();
	}
	
	public void run() {
		while (true) {
			printUI();
			movePawns();
			lightLevel--;
			
			if (vampireCount == 0) {
				System.out.println("\nYou Win");
				break;
			} else if (lightLevel == 0) {
				System.out.println("\nYou Lose");
				break;
			}
		}
	}

	private void movePawns() {
		char[] path = reader.nextLine().toLowerCase().toCharArray();
		for(char step : path) {
			if (step == 'a' || step == 'w' || step == 's' || step == 'd') {
				int oldPlayerX = player.getX();
				int oldPlayerY = player.getY();
									
				movePlayer(step);

				checkIfVampireHit();
				moveVampires();
				checkIfVampireHit();
				map[oldPlayerY][oldPlayerX] = '.';
				map[player.getY()][player.getX()] = player.getSymbol();
			}
		}
	}

	private void movePlayer(char step) {
		if (step == 'a' && player.getX() - 1 > 0)
			player.move(-1, 0);
		else if (step == 'd' && player.getX() + 1 < mapLength)
			player.move(1, 0);
		else if (step == 'w' && player.getY() > 0)
			player.move(0, -1);
		else if (step == 's' && player.getY() < mapHeight - 1)
			player.move(0, 1);
	}
	
	private void moveVampires() {
		for (DungeonPawn vamp : vampires) {
			int direction = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			int oldVampX = vamp.getX();
			int oldVampY = vamp.getY();
			
			if (direction == 0 && vamp.getX() - 1 > 0 && map[vamp.getY()][vamp.getX() - 1] != 'v')
				vamp.move(-1, 0);
			else if (direction == 1 && vamp.getX() + 1 < mapLength && map[vamp.getY()][vamp.getX() + 1] != 'v')
				vamp.move(1, 0);
			else if (direction == 2 && vamp.getY() > 0 && map[vamp.getY() - 1][vamp.getX()] != 'v')
				vamp.move(0, -1);
			else if (direction == 3 && vamp.getY() < mapHeight - 1 && map[vamp.getY() + 1][vamp.getX()] != 'v')
				vamp.move(0, 1);
			
			map[oldVampY][oldVampX] = '.';
			map[vamp.getY()][vamp.getX()] = vamp.getSymbol();
		}
	}
	
	private void checkIfVampireHit() {
		List<DungeonPawn> deadVamps = new ArrayList<>();
		
		for (DungeonPawn vamp : vampires) {
			if (player.getX() == vamp.getX() && player.getY() == vamp.getY()) {
				map[vamp.getY()][vamp.getX()] = '.';
				deadVamps.add(vamp);
			}
		}
		
		vampires.removeAll(deadVamps);
		vampireCount -= deadVamps.size();
	}

	private void printUI() {
		System.out.println(lightLevel + "\n");
		System.out.println(player);
		
		for (DungeonPawn vamp : vampires)
			System.out.println(vamp);
		
		System.out.println();
		printMap();
	}
	
	public void printMap() {
		for (int i = 0; i < mapHeight; ++i) {
			for (int j = 0; j < mapLength; ++j)
				System.out.print(map[i][j]);
			System.out.println("");
		}
	}
	
	private void initializeMap() {
		for (int i = 0; i < mapHeight; ++i) {
			for (int j = 0; j < mapLength; ++j)
				map[i][j] = '.';
		}
		
		map[0][0] = player.getSymbol();
		placeVampires();
	}
	
	private void placeVampires() {
		for (int i = 0; i < vampireCount; ++i) {		
			vampires.add(generateVampire());
			map[vampires.get(i).getY()][vampires.get(i).getX()] = vampires.get(i).getSymbol();
		}
	}
	
	private DungeonPawn generateVampire() {
		int vampX = 0;
		int vampY = 0;
		boolean generate = true;
		
		while (generate) {
			vampX = ThreadLocalRandom.current().nextInt(0, mapHeight);
			vampY = ThreadLocalRandom.current().nextInt(0, mapLength);
			
			if (player.getX() != vampX && player.getY() != vampY) {
				if (map[vampX][vampY] != 'v')
					generate = false;
			}
		}
		
		return new DungeonPawn(vampX, vampY, 'v');
	}
}
