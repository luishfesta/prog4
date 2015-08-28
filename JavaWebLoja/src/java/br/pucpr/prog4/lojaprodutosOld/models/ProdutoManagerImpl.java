
package br.pucpr.prog4.lojaprodutosOld.models;

import java.util.List;


public interface ProdutoManagerImpl {
    List<Produto> obterProdutos();
    Produto obterPorId(int id);
}
