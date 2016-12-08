/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import org.junit.Test;

/**
 *
 * @author aluno
 */
public class fat {
    @Test
    public double fat(int valor1){
        int fator=1;
        int resultado;
        for(int i=2;i<=valor1;i++){
            fator*=i;
        }
        resultado = fator;
        return resultado;
    }
}
