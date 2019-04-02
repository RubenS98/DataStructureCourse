/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolas;

/**
 *
 * @author thepo
 */
public interface iPila {

    boolean push(Object elemento);

    boolean pop();

    Object top();

    boolean vaciar();

    boolean esVacia();
}
