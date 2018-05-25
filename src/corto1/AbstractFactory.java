/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1;

import corto1.converter.Converter;
import corto1.operaciones.Aritmetica;

/**
 *
 * @author gabyordonez
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Converter getConverter(String type);
}
