
package br.pucpr.prog4.lojaprodutosOld.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class ProdutoManager implements iProdutoManager{

    private List<Produto> produtos;
    
    
    public ProdutoManager()
    {
            produtos = new ArrayList<>();
            Produto p1 = new Produto();
            p1.setId(1);
            p1.setNome("Processador");
            p1.setPreço(new BigDecimal(500.0f));
            
            produtos.add(p1);
            
            Produto p2 = new Produto();
            p1.setId(2);
            p1.setNome("Celular");
            p1.setPreço(new BigDecimal(900.0f));

            Produto p3 = new Produto();
            p1.setId(3);
            p1.setNome("Cartucho");
            p1.setPreço(new BigDecimal(900.0f));
    }
    @Override
    public List<Produto> obterProdutos() {
        return produtos;
        
    }
    


    
    
    
}
