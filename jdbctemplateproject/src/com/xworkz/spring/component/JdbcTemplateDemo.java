package com.xworkz.spring.component;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}
	public void save(ValleyBallSports valley)
	{
		String query="insert into aravind.valley values('"+valley.getTeamName()+"','"+valley.getNoOfPlayers()+"','"+valley.getCoach()+"','"+valley.getCountry()+"')";
		jdbcTemplate.update(query);
	}
}
