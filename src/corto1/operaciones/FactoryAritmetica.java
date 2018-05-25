/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1.operaciones;

import corto1.AbstractFactory;
import corto1.converter.Converter;

/**
 *
 * @author gabyordonez
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public Aritmetica getAritmetica(String type) {
        switch(type){
            case "suma":
                return new Suma();
            
            case "resta": 
                return new Resta();
                
            case "multiplicacion":
                return new Multiplicacion();
                
            case "division: ": 
                return new Division();
                  
        }
        return null;
    }

    @Override
    public Converter getConverter(String type) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
    
}
