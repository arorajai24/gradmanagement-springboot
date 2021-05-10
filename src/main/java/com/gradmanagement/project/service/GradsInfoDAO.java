package com.gradmanagement.project.service;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.gradmanagement.project.model.GradsInfo;

@Repository
public class GradsInfoDAO {
	
private JdbcTemplate jdbcobj;
	
	public GradsInfoDAO(JdbcTemplate jdbcobj) {
		super();
		this.jdbcobj = jdbcobj;
	}
	
	public List<GradsInfo> listGrad(){
		String sql = "SELECT * FROM grads";
		return jdbcobj.query(sql, BeanPropertyRowMapper.newInstance(GradsInfo.class));
	}
	
	public List<GradsInfo> deleteGrad(int id)
	{
		String sql = "DELETE FROM grads WHERE id=?";
		return jdbcobj.query(sql, BeanPropertyRowMapper.newInstance(GradsInfo.class));
	}
	
	
	
	
	
	public void saveGrad(GradsInfo grad) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcobj);
	    insertActor.withTableName("grads").usingColumns("fname", "lname", "gender",  "age", "email", "contact", "address");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(grad);
	    insertActor.execute(param);
	}
	
	public GradsInfo getGrad(int id)
	{
		String sql = "SELECT * FROM grads WHERE id=?";
		return jdbcobj.queryForObject(sql, BeanPropertyRowMapper.newInstance(GradsInfo.class), id);
	}
	
	public void editGrad(GradsInfo grad)
	{
		String sql = "UPDATE grads SET fname:=fname, lname:=lname, gender:=gender, age:=age, email:=email, contact:=contact, address:=address WHERE id=:id";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(grad);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcobj);
		template.update(sql, param);
	}
	
}
