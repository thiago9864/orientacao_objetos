/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultilitariocalculoprobabilidades;

/**
 *
 * @author Thiago
 */
public class Prob {
    public Prob(){}
    
    public double fatorial(int x){
        double ret = 1.0;
        
        for(int i=1; i<=x; i++){
            ret *= i;
        }
        
        return ret;
    }
    
    public double combinacao(int n, int s){
        return fatorial(n) / (fatorial(s) * fatorial(n-s));
    }
    
    public double Binomial(int n, int x, double probabilidade){
        double dx = (double)x;
        double dn = (double)n;
        double v1 = Math.pow(probabilidade, dx);
        double v2 = Math.pow(1.0 - probabilidade, dn - dx);
        double c = combinacao(n, x);
        return c * v1 * v2;
    }
    
    
}
