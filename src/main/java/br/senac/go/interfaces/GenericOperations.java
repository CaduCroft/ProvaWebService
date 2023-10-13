package br.senac.go.interfaces;

public interface GenericOperations<T,N> {

    /**
     * Quando a pessoa for criar um recurso, a aplicação
     * recebe uma entidade(T) e retorna a entidade (T) com o campo
     * id preenchido
     * @param entity
     * @return
     */
    T create(T entity);
    T read(T entity) throws Exception;
    T readById(N id) throws Exception;
<<<<<<< HEAD
    T update (T entity);
=======

    T update(T entity);
>>>>>>> b059dfe5e908ab84e15813cf94ea8ac791fd879c
    T updatePart(N id, T entity) throws Exception;
    T updateFull(N id, T entity);
    void delete(N id);
}
