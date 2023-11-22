package STI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import STI.Dao.IIdoso;

@RequestMapping
@RestController
public abstract class IdosoController implements IIdoso{

	@GetMapping("/usuarios/idoso")
	public String texto() {
		return "Buscar usuario";
	}
	@PostMapping("/usuarios/idoso")
	public String String (){
		return "Usuario cadastrado com sucesso";
	}
	@PutMapping("/usuarios/idoso")
	public String msgm(){
		return "Atulização realizada com sucesso";
		
	}
}