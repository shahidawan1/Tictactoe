import java.io.Serializable;


public class Player implements Serializable {
int win;
int turn;
int row;
int col;

public int getWin() {
	return win;
}

public void setWin(int win) {
	this.win = win;
}

public int getTurn() {
	return turn;
}

public void setTurn(int turn) {
	this.turn = turn;
}

public int getRow() {
	return row;
}

public void setRow(int row) {
	this.row = row;
}

public int getCol() {
	return col;
}

public void setCol(int col) {
	this.col = col;
}

Player() {
	win=100;
	turn=100;
	row=100;
	col=100;
}
}
