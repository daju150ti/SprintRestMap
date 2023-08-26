package pro.map.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pro.map.server.model.Rol;

public interface RolRepositorio extends JpaRepository<Rol,Long>{
	
	@Query(value = "select id,nombre from rol u where u.id=?1",nativeQuery = true)
	Rol JQLPBuscarPorId(Long id);
	
}
