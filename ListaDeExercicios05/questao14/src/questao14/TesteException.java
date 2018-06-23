/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao14;

/**
 *
 * @author Thiago
 */
public class TesteException {
    public TesteException() throws SomeException {
        throw new SomeException("O erro personalizado foi lançado"); 
    }
}
