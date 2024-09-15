package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RolDao;
import com.example.demo.entity.Rol;
import com.example.demo.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDao{

	@Autowired
	private RolRepository repository;
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return  repository.findAll();
	}

}
