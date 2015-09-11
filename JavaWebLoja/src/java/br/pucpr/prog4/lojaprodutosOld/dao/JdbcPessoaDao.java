
package br.pucpr.prog4.lojaprodutosOld.dao;

import br.pucpr.prog4.lojaprodutosOld.models.Pessoa;
import java.sql.PreparedStatement;


public class JdbcPessoaDao implements PessoaDao{

    
    
    
    public Pessoa Inserir(Pessoa pessoa){
        
        String sql;
        sql = "INSERT INTO Pessoa("
                + "nome,"
                + "dataNascimento,"
                + "tipo,"
                + "sexo,"
                + "VALUES (?, ?, ?, ?)";
        
        PreparedStatement ps;
        try
        {
            ps = conexão.preparedStatement (sql);
            ps.setString(1, pessoa.getNome());
            ps.setDate(2, new java.sql.Date(pessoa.getDataNascimento().getTime()));
            ps.setString(3, pessoa.getTipoPessoa());
            ps.setString(4, pessoa.getSexo());
            
            
            ps.executeUpdate();
            
            
            return pessoa;
            
        }catch (Exception ex){
            trow new DaoException("Ocorreu um erro.")
        }
                
    }
    
    
    
    
    
}
