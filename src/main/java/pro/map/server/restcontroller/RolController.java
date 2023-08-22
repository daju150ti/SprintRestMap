package pro.map.server.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
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
	


	
}
