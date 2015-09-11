package br.pucpr.prog4.lojaprodutosOld.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcDaoManager implements IDaoManager 
{
    Connection conexão;

    private JdbcPessoaDao pessoaDAO;
    

    
    public JdbcDaoManager()
    {

    }
    
    
    @Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/prog4dao";
            conexão = DriverManager.getConnection(url, "root", "root");
            conexão.setAutoCommit(false);
            pessoaDAO = new 
            
        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransação() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abortarTransação() {
        try {
            conexão.rollback();
        } catch (SQLException ex){
            throw new DaoException("Ocorreu um erro ao confirmar a transação.");
        }
    }

    @Override
    public PessoaDao getPessoaDao() 
    {
        return pessoaDao;
    }
    
}
