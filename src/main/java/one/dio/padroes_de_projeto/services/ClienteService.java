package one.dio.padroes_de_projeto.services;

import one.dio.padroes_de_projeto.model.Cliente;


public interface ClienteService {


    Iterable<Cliente> buscarTodos();
    Cliente buscaPorId(Long id);

    void inserir   (Cliente cliente);
    void atualizar (Long id, Cliente cliente);
    void deletar   (Long id);

}
