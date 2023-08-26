package pro.map.server.service;

import java.util.List;
import pro.map.server.model.Rol;

public interface RolService {

	public Rol guardar(Rol rol);
	public List<Rol> listar();
	public Rol BuscarRolId(Long id);
	
}
