/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojavirtual.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanoelle.stival
 */
public class ProdutoManager implements IProdutoManager{
    
    private static List<Produto> produtos;
    
    static{
        produtos = new ArrayList<>();
        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("TV - 32 polegadas");
        p1.setPreco(new Double(899.00));
        
        produtos = new ArrayList<>();
        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("Notbook");
        p2.setPreco(new Double(1199.00));
        
        produtos = new ArrayList<>();
        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("Celular - Asus ZenPhone");
        p3.setPreco(new Double(599.00));
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        
        
        
    }
    public List<Produto> obterTodos() {
        return produtos;
    }

    @Override
    public Produto obterPorId(int id) {
        for(Produto produto : produtos){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }
    
 
}
