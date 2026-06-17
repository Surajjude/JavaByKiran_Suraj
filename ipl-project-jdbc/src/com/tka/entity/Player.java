package com.tka.entity;

public class Player {
	
	private int id;
	private String pName;
	private int jerseyNo;
	private String tName;
	private int run;
	private int wicket;
	
	public Player() {}

	public Player(int id,String pName, int jerseyNo, String tName, int run, int wicket) {
		super();
		this.id= id;
		this.pName = pName;
		this.jerseyNo = jerseyNo;
		this.tName = tName;
		this.run = run;
		this.wicket = wicket;
	}

	public int getId() {
		return id;
	}
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", pName=" + pName + ", jerseyNo=" + jerseyNo + ", tName=" + tName + ", run=" + run
				+ ", wicket=" + wicket + "]";
	}

//	@Override
//	public String toString() {
//		return "Player [pName=" + pName + ", jerseyNo=" + jerseyNo + "]";
//	}
	
}
