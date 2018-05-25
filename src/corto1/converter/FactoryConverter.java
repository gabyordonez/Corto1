/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1.converter;

import corto1.AbstractFactory;
import corto1.operaciones.Aritmetica;

/**
 *
 * @author gabyordonez
 */
public class FactoryConverter implements AbstractFactory{

    @Override
    public Aritmetica getAritmetica(String type) {
      return null;   
    }

    @Override
    public Converter getConverter(String type) {
        switch(type){
            case "Binario: ":
                return (Converter) new Binario();
        }
        return null;
    }
    }
   
