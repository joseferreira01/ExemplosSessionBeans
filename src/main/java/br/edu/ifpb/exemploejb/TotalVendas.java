/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.exemploejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author jose
 */
@Singleton
@Startup
public class TotalVendas {
     double total;
 
    @PostConstruct
    private void startup() {
        System.out.println("Singleton inited!");
    }
 
     
    public void add(double valor) {
         
        total+= valor;
 
    }
 
     
    public double getTotal() {
         
        return total;
    }
}
