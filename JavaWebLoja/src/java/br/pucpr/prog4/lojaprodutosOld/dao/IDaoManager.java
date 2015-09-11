package br.pucpr.prog4.lojaprodutosOld.dao;

public interface IDaoManager 
{
    void iniciar() throws DaoException;
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    //IClienteDao getClienteDao();
}
