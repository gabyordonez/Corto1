/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1.operaciones;

/**
 *
 * @author gabyordonez
 */
public class Resta implements Aritmetica{

    @Override
    public double operar(double a, double b) {
        return a - b;
    }

    @Override
    public String Operar(double a1, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
