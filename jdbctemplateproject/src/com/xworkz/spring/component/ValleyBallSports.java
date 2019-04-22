package com.xworkz.spring.component;

public class ValleyBallSports {
	
	private String teamName;
	private int noOfPlayers;
	private String country;
	private String coach;
	
	public ValleyBallSports() {
		System.out.println("Created\t "+this.getClass().getSimpleName());
	}
	public ValleyBallSports(String teamName, int noOfPlayers, String country, String coach) {
		super();
		this.teamName = teamName;
		this.noOfPlayers = noOfPlayers;
		this.country = country;
		this.coach = coach;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	@Override
	public String toString() {
		return "ValleyBallSports [teamName=" + teamName + ", noOfPlayers=" + noOfPlayers + ", country=" + country
				+ ", coach=" + coach + "]";
	}
	
	
	

}
