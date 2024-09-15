package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RentaDao;
import com.example.demo.entity.Renta;
import com.example.demo.service.RentaService;

@Service
public class RentaServiceImpl implements RentaService{

	@Autowired
	private RentaDao dao;
	@Override
	public Renta create(Renta a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Renta update(Renta a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
