package com.tacos.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tacos.Ingredient;

@Repository
public class JbdcIngredientRepository implements IngredientRepository {
	
	private JdbcTemplate jbdc;

	@Autowired
	public JbdcIngredientRepository(JdbcTemplate jbdc) {
		this.jbdc = jbdc;
	}

	@Override
	public Iterable<Ingredient> findAll() {
		// TODO Auto-generated method stub
		return jbdc.query("select id,name from Ingredient where id=?", this::mapRowToIngredient);
	}
	
	@Override
	public Ingredient findOne(String id) {
		return jbdc.queryForObject("select id, name, type from Ingredient where id=?",
				this::mapRowToIngredient, id);

	}

	private Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException
	{
		return new Ingredient(
				rs.getString("id"),
				rs.getString("name"),
				Ingredient.Type.valueOf(rs.getString("type")));
	}



	@Override
	public Ingredient save(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
