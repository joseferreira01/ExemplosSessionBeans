/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exemploejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author jose
 */
@Stateless
public class ServiceProduto {
   private List<String> produtos;

    public ServiceProduto() {
          produtos = new ArrayList<>();
    }
   
      public void adicionarProduto(String produto) {
                     produtos.add(produto);
            }
   
            public void removerProduto(String produto) {
                     produtos.remove(produto);
            }
}
