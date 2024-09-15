package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccesoDao;
import com.example.demo.entity.Acceso;
import com.example.demo.service.AccesoService;


@Service
public class AccesoServiceImpl implements AccesoService{
	
	@Autowired
	private AccesoDao dao1;

	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return dao1.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return dao1.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao1.delete(id);
		
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao1.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return dao1.readAll();
	}

	@Override
	public Acceso createAccesoRol(Long accesoId, Long rolId) {
		// TODO Auto-generated method stub
		return dao1.registrarAccesoRol(accesoId, rolId);
	}
	

}
