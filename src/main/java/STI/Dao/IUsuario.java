package STI.Dao;

import org.springframework.data.repository.CrudRepository;

import STI.model.UsuarioModel;

public interface IUsuario extends CrudRepository<UsuarioModel,Integer> {

}
