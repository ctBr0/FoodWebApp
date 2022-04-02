package application;

import java.io.Serializable;

public class ID implements Serializable{
	private int id;
	private static final long serialVersionUID = 1L;

	public ID(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//return a string in the specified format
		public String toString() {
			return id + " ";
		}

}
