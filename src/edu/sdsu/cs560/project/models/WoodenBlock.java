package edu.sdsu.cs560.project.models;

public class WoodenBlock extends Bitboard {

	final WoodenPuzzle puzzle;
	final String name;

	public WoodenBlock(WoodenPuzzle puzzle, String name) {
		this(puzzle, name, 0);
	}

	public WoodenBlock(WoodenPuzzle puzzle, String name, int bitboard) {
		super(puzzle.width, puzzle.height);
		this.puzzle = puzzle;
		this.name = name;
		set(bitboard);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int y = 0; y < puzzle.height; y++) {
			for (int x = 0; x < puzzle.width; x++) {
				builder.append(" ").append(isAt(x, y) ? name : WoodenPuzzle.EMPTY_CELL_TEXT);
			}
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
	
}