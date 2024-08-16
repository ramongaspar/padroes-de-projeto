package one.dio.padroes_de_projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import one.dio.padroes_de_projeto.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco,String>{

}
