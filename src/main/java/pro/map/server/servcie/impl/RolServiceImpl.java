package pro.map.server.servcie.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pro.map.server.model.Rol;
import pro.map.server.repository.RolRepositorio;
import pro.map.server.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	//@Autowired
    //private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RolRepositorio rolrepo;
	
	public Rol guardar(Rol rol) {
		return this.rolrepo.save(rol);
	}

	public List<Rol> listar() {
		return this.rolrepo.findAll();
	}

	@Override
	public Rol BuscarRolId(Long id) {
		return this.rolrepo.JQLPBuscarPorId(id);
	}

}
