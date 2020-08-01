package tictactoe;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
        board.print();

	}

}



/* Description
Tic-tac-toe is a game played by two players on a 3x3 field.

One of the players plays as 'X', and the other player is 'O'. 'X' plays first, then the 'O' side plays, and so on.

The players write 'X' and 'O' on a 3x3 field.

The first player that writes 3 'X' or 3 'O' in a straight line (including diagonals) wins.

Your first task in this project is to print any state of the field in the console output.

Example
The example below shows how your output might look.

X O X
O X O
X X O */