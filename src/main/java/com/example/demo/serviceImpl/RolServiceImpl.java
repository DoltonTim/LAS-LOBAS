package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RolDao;
import com.example.demo.entity.Rol;
import com.example.demo.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	private RolDao  dao;
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	

}
