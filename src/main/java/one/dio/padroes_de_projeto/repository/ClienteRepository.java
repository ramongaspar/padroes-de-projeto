package one.dio.padroes_de_projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import one.dio.padroes_de_projeto.model.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
