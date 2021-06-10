package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.entities.Admin;
import com.cg.fms.exception.AdminNotFoundException;
@Service
public interface IAdminService {

	public Admin getAdmin(String adminName) throws AdminNotFoundException;

	public boolean addAdmin(Admin admin);
	
	public boolean updateAdmin(Admin admin);

	public Long deleteAdmin(String name) throws AdminNotFoundException;

	public List<Admin> getAllAdmins();

	
	
}