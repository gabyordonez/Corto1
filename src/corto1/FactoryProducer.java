/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1;

/**
 *
 * @author gabyordonez
 */

import corto1.converter.FactoryConverter;
import corto1.operaciones.FactoryAritmetica;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Aritmetica: ":
                return  new FactoryAritmetica();
            case "Converter: ":
                return new FactoryConverter();
        }
        return null;
    }
}
