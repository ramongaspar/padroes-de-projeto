package one.dio.padroes_de_projeto.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.dio.padroes_de_projeto.domain.model.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
