package myCompiler;

public class Coordinates {
	private final Integer row;
	private final Integer column;
	
	public Coordinates(Integer row, Integer column) {
	    this.row = row;
	    this.column = column;
	}

	public Integer getRow() {
		return row;
	}
		
	public Integer getColumn() {
		return column;
	}
		
	public String toString() {
		return "(" + row + "," + column + ")";
	}
}
