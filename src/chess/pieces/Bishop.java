package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// Logica de movimento da peça noroeste
		p.setValues(position.getRow() - 1, position.getColumn() -1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() -1, p.getColumn() -1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Logica de movimento da peça a nordeste
		p.setValues(position.getRow() -1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() -1, p.getColumn() +1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Logica de movimento da peça a sudeste
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() +1, p.getColumn() +1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Logica de movimento da peça sudoeste
		p.setValues(position.getRow() + 1, position.getColumn() -1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() +1, p.getColumn() -1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

}
