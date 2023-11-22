package STI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import STI.Dao.IEstudante;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public abstract class EstudanteController implements IEstudante{

	@GetMapping("/usuarios/estudante")
	public String texto() {
		return "Buscar usuario";
	}
	@PostMapping("/usuarios/estudante")
	public String String (){
		return "Usuario cadastrado com sucesso";
	}
	@PutMapping("/usuarios/estudante")
	public String msgm(){
		return "Atulização realizada com sucesso";
		
	}
	
		
}
		
	
	 
