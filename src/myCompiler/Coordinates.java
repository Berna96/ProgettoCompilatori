package myCompiler;

public class Coordinates implements Comparable<Coordinates> {
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

	@Override
	public int compareTo(Coordinates c) {
		if (this.getRow().compareTo(c.getRow()) == 0)
			return this.getColumn().compareTo(c.getColumn());
		else 
			return this.getRow().compareTo(c.getRow());
	}
}
