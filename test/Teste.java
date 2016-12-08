
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Teste {

    private int valor1=0;
    private int resultado;
    
    
    public Teste(int valor1){
        this.valor1=valor1;
    }
    
    public int Teste1(int valor1){
        int fator=1;
        int result;
        for(int i=2;i<=valor1;i++){
            fator*=i;
        }
        result = fator;
        assertEquals(40320,result);
        return result;
    }
    
    
    public int Teste2(int valor1){
        int fator=1;
        int result;
        for(int i=2;i<=valor1;i++){
            fator*=i;
        }
        result = fator;
        assertNotEquals("Fatorial incorreto", 1000.0,0,0);
        return result;
    }
       
}

    
    

