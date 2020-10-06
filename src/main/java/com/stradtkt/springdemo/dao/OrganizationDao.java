package com.stradtkt.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.stradtkt.springdemo.domain.Organization;

public interface OrganizationDao {
	public void setDataSource(DataSource ds);
	public boolean create(Organization org);
	public Organization getOrganization(Integer id);
	public List<Organization> getAllOrganizations();
	public boolean delete(Organization org);
	public boolean update(Organization org);
	public void cleanup();
}
