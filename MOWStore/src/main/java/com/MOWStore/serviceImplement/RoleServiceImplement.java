package com.MOWStore.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MOWStore.entity.Role;
import com.MOWStore.repository.RoleRepository;
import com.MOWStore.service.RoleService;

@Service
public class RoleServiceImplement implements RoleService{
	@Autowired
	RoleRepository roleDAO;

	@Override
	public List<Role> getAll() {
	
		return roleDAO.findAll();
	}
	
	
}
