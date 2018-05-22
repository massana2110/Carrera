/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author uca
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int tipo){
        switch(tipo){
            case 1:
                return new FactAritmetico();
            case 2:
                return new FactConversor();
        }
        return null;
        }
    }

