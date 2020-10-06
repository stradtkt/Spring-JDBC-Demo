package com.stradtkt.springdemo.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.stradtkt.springdemo.dao.OrganizationDao;
import com.stradtkt.springdemo.domain.Organization;

public class OrganizationImpl implements OrganizationDao {
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public boolean create(Organization org) {
		return false;
	}

	public Organization getOrganization(Integer id) {
		return null;
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		return orgList;
	}

	public boolean delete(Organization org) {
		return false;
	}

	public boolean update(Organization org) {
		return false;
	}

	public void cleanup() {

	}

}
