/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exemploejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author jose
 */
@Stateful
  public class CarrinhoDeCompras {
   
            List<String> itens;
   
            public CarrinhoDeCompras () {
                     itens = new ArrayList<>();
            }
   
            public void adicionarItem(String item) {
                     itens.add(item);
            }
   
            public void removerItem(String item) {
                     itens.remove(item);
            }
   
            @Remove
            public void remover() {
                     itens = null;
            }
  }
