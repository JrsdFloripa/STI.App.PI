package STI.Controller;


import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import STI.Dao.IUsuario;
import STI.model.UsuarioModel;

	
	@RestController
	public class UsuarioController implements IUsuario {

		@GetMapping("/usuarios")
		public String texto() {
			return "Buscar usuario";
		}
		@PostMapping("/usuarios")
		public String String (){
			return "Usuario cadastrado com sucesso";
		}
		@PutMapping("/usuarios")
		public String msgm(){
			return "Atulização realizada com sucesso";
			
		}
	

	public UsuarioController() {
	// TODO Auto-generated constructor stub
	}
	@Override
	public <S extends UsuarioModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends UsuarioModel> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<UsuarioModel> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterable<UsuarioModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<UsuarioModel> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(UsuarioModel entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends UsuarioModel> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
