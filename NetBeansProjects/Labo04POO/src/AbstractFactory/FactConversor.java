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
public class FactConversor implements AbstractFactory{
    @Override
    public int getNum1(int x){
        return x;
    };
    public int getNum2(int y){
        return y;
    };
}
