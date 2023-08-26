package pro.map.server.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pro.map.server.model.Rol;
import pro.map.server.servcie.impl.RolServiceImpl;


@RestController
@RequestMapping("/rol")
public class RolController {

	@Autowired
	RolServiceImpl rolserviceimpl;
	
	@PostMapping
	@ResponseBody
	public Rol PostInsertar(@RequestBody Rol rol){
		
		//PooledPBEStringEncryptor encryptpass = this.encrypt.EncryptPassword();
		//usuario.setPassword(encryptpass.encrypt(usuario.getPassword()));
		//usuario.setId(SequenceGeneratorService.generateSequence(Usuario.SEQUENCE_NAME));
		this.rolserviceimpl.guardar(rol);
	
		return rol;
	}
	
	
	@GetMapping("/listar")
	@ResponseBody
	public List<Rol> GetListar(){
		return this.rolserviceimpl.listar();
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<Object> GetById(@RequestBody Rol rol){
		if (rol.getId() == null) {
	        return ResponseEntity.badRequest().body("El id no es valido");
	    }
	    return ResponseEntity.status(HttpStatus.OK).body(this.rolserviceimpl.BuscarRolId(rol.getId()));
	}
	
}
