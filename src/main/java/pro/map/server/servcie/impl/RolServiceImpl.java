package pro.map.server.servcie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.map.server.model.Rol;
import pro.map.server.repository.RolRepositorio;
import pro.map.server.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepositorio rolrepo;
	
	@Override
	public Rol guardar(Rol rol) {
		return this.rolrepo.save(rol);
	}

}
