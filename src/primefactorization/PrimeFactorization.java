/*
 * To change this license header, choose License Headers in Project Properties.
 * When do prime factorization, find a smallest prime number that can divide number N,
if it can divide N, use the result to repeat; if can't, use prime number +1 to repeat
 * 
 */
package primefactorization;

/**
 *
 * @author Shaojie
 */
import java.util.*;
public class PrimeFactorization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to be factorized: ");
        ArrayList<Integer> d = new ArrayList<Integer>();
        
        PrimeFactorization p = new PrimeFactorization();
        int n = sc.nextInt();
        System.out.print(n +" = ");
        while(n!=1){
        n = p.factorization(n,d);} //here I created a class variable to 
                                   //call method. If directly call method, you must make it static!!
        
       for(int i=0;i<d.size();i++){
       if(i==(d.size()-1)){
        System.out.print(d.get(i));
        break;
       }
        System.out.print(d.get(i)+" * ");
       
               }
       
    }
    private int factorization(int n, ArrayList d){
      
       
        for(int i=2;i<=n;i++){
           if(n%i==0){
           n = n/i;
           d.add(i);
           if(n!=i) 
          
           break;
           } 
    }
      return n;  
    }
    
}
