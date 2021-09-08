package challenges;

import java.util.Scanner;

/**
 *
 * brunolima on May 4, 2021
 * 
 */

public class TicTacToe2Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TicTacToe2 ttt = new TicTacToe2();
		Scanner sc = new Scanner(System.in);
		boolean isWinner = false;

		ttt.printBoard();

		System.out.println("\n\nPlayer X start playing...");

		System.out.println("\nPlease choose the position, e.g: 0 or 1...");
		int positionActual = sc.nextInt();

		ttt.markCoordinates(positionActual);
		ttt.printBoard();

		while (!isWinner) {
			System.out.println("\nPlease choose the position, e.g: 0 or 1...");
			positionActual = sc.nextInt();

			if (ttt.markCoordinates(positionActual)) {
				isWinner = ttt.isWinner();
			} else {
				isWinner = false;
			}

			ttt.printBoard();
		}

		System.out.println();
		sc.close();
		System.exit(0);
	}

}

class TicTacToe2 {
	private String[] arrayTTT = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };
	private String boardExample[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8" };
	private final static String NOUGHTS = "X";
	private final static String CROSSES = "0";
	private String simbolActual = "X";

	public void printBoard() {
		System.out.println("Board Example...");
		for (int row = 0; row < this.boardExample.length; row++) {
			if (row % 3 == 0) {
				System.out.printf("\n| " + this.boardExample[row] + " | ");
			} else {
				System.out.printf(this.boardExample[row] + " | ");
			}
		}

		System.out.println("\n\nCurrent Board...");
		for (int row = 0; row < this.arrayTTT.length; row++) {
			if (row % 3 == 0) {
				System.out.printf("\n| " + this.arrayTTT[row] + " | ");
			} else {
				System.out.printf(this.arrayTTT[row] + " | ");
			}
		}
	}

	public boolean markCoordinates(int positionActual) {
		if ((positionActual >= 0 && positionActual <= 8)) {
			if (this.arrayTTT[positionActual] == "-") {
				this.arrayTTT[positionActual] = simbolActual;
				this.simbolActual = simbolActual.equalsIgnoreCase(NOUGHTS) ? CROSSES : NOUGHTS;
				return true;
			} else {
				System.err.println("Please choose another position...");
				return false;
			}
		} 
		
		System.err.println("Position out of range :(");
		return false;
	}

	public boolean isWinner() {
		boolean rows = false, cols = false, diag = false;

		boolean row1OK = checkRow1IsMarked();
		boolean row2OK = checkRow2IsMarked();
		boolean row3OK = checkRow3IsMarked();

		boolean col1OK = checkCol1IsMarked();
		boolean col2OK = checkCol2IsMarked();
		boolean col3OK = checkCol3IsMarked();

		boolean diag1OK = checkDiag1IsMarked();
		boolean diag2OK = checkDiag2IsMarked();

		rows = validRows(rows, row1OK, row2OK, row3OK);
		cols = validCols(cols, col1OK, col2OK, col3OK); 
		diag = validDiagonal(diag, diag1OK, diag2OK);

		return rows || cols || diag;
	}

	private boolean checkDiag2IsMarked() {
		return !this.arrayTTT[6].equals("-") && !this.arrayTTT[4].equals("-")
				&& !this.arrayTTT[2].equals("-");
	}

	private boolean checkDiag1IsMarked() {
		return !this.arrayTTT[0].equals("-") && !this.arrayTTT[4].equals("-")
				&& !this.arrayTTT[8].equals("-");
	}

	private boolean checkCol3IsMarked() {
		return !this.arrayTTT[2].equals("-") && !this.arrayTTT[5].equals("-")
				&& !this.arrayTTT[8].equals("-");
	}

	private boolean checkCol2IsMarked() {
		return !this.arrayTTT[1].equals("-") && !this.arrayTTT[4].equals("-")
				&& !this.arrayTTT[7].equals("-");
	}

	private boolean checkCol1IsMarked() {
		return !this.arrayTTT[0].equals("-") && !this.arrayTTT[3].equals("-")
				&& !this.arrayTTT[6].equals("-");
	}

	private boolean checkRow3IsMarked() {
		return !this.arrayTTT[6].equals("-") && !this.arrayTTT[7].equals("-")
				&& !this.arrayTTT[8].equals("-");
	}

	private boolean checkRow2IsMarked() {
		return !this.arrayTTT[3].equals("-") && !this.arrayTTT[4].equals("-")
				&& !this.arrayTTT[5].equals("-");
	}

	private boolean checkRow1IsMarked() {
		return !this.arrayTTT[0].equals("-") && !this.arrayTTT[1].equals("-")
				&& !this.arrayTTT[2].equals("-");
	}

	private boolean validDiagonal(boolean diag, boolean diag1OK, boolean diag2OK) {
		if (diag1OK && (this.arrayTTT[0].equals(arrayTTT[4])) && (this.arrayTTT[4].equals(arrayTTT[8]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			diag = true;
		} else if (diag2OK && (this.arrayTTT[6].equals(arrayTTT[4])) && (this.arrayTTT[4].equals(arrayTTT[2]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			diag = true;
		}
		return diag;
	}

	private boolean validCols(boolean cols, boolean col1OK, boolean col2OK, boolean col3OK) {
		if (col1OK && (this.arrayTTT[0].equals(arrayTTT[3])) && (this.arrayTTT[3].equals(arrayTTT[6]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			cols = true;
		} else if (col2OK && (this.arrayTTT[1].equals(arrayTTT[4])) && (this.arrayTTT[4].equals(arrayTTT[7]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			cols = true;
		} else if (col3OK && (this.arrayTTT[2].equals(arrayTTT[5])) && (this.arrayTTT[5].equals(arrayTTT[8]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			cols = true;
		}
		return cols;
	}

	private boolean validRows(boolean rows, boolean row1OK, boolean row2OK, boolean row3OK) {
		if (row1OK && (this.arrayTTT[0].equals(arrayTTT[1])) && (this.arrayTTT[1].equals(arrayTTT[2]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			rows = true;
		} else if (row2OK && (this.arrayTTT[3].equals(arrayTTT[4])) && (this.arrayTTT[4].equals(arrayTTT[5]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			rows = true;
		} else if (row3OK && (this.arrayTTT[6].equals(arrayTTT[7])) && (this.arrayTTT[7].equals(arrayTTT[8]))) {
			System.out.println("\nPlayer: " + this.simbolActual + " WINS!!! ;)");
			rows = true;
		}
		return rows;
	}

}
