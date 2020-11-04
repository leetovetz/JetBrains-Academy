package tictactoe;

public class Board {

	private String[][] array;

	public Board() {
		array = new String[][] { { "X", "O", "X" }, { "O", "X", "O" }, { "X", "X", "O" } };
	}

	public void print() {
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (c < 2)
					System.out.print(array[r][c] + " ");
				else
					System.out.println(array[r][c]);
			}
		}
	}
}
