package edu.sjsu.cmpe.library.domain;

public class Book2 extends Book {
	private boolean isLost = false;
	public Book2() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the isLost
	 */
	public boolean isLost() {
		return isLost;
	}
	/**
	 * @param status the isLost to set
	 */
	public void setLost(Status status) {
		if (status.equals(Status.lost))
			this.isLost = true;
		else
			this.isLost = false;
	}

}
