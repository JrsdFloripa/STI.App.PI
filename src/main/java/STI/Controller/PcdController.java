package STI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import STI.Dao.IPcd;

@RequestMapping
@RestController
public abstract class PcdController implements IPcd {

	@GetMapping("/usuarios/Pcd")
	public String texto() {
		return "Buscar usuario";
	}
	@PostMapping("/usuarios/Pcd")
	public String String (){
		return "Usuario cadastrado com sucesso";
	}
	@PutMapping("/usuarios/Pcd")
	public String msgm(){
		return "Atulização realizada com sucesso";
		
	}
}