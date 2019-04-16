package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// Logica de movimento da peça acima
		p.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Logica de movimento da peça a esquerda
		p.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Logica de movimento da peça a direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Logica de movimento da peça Abaixo
		p.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}

		if (getBoard().positionExists(p) && isTherOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

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
