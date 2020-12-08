/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;
import java.util.Scanner;
/**
 *
 * @author Salah
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int     palindrome,
            n1,
            n2,
            n3,
            n4,
            n5;
    
    boolean b = false;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a palindrome number: ");
    palindrome = input.nextInt();
    while ( b != true)
    {     
    n1 = palindrome / 10000;
    n2 = palindrome / 1000;
    n2 = n1*10 - n2;
    if (n2 <0)
    n2 = n2 * -1;
    
    n3 = palindrome / 100;
    n3 = n3 -(n1*100 + n2*10);
    n4 = palindrome / 10;
    n4 = n4 - (n1*1000 + n2 *100 + n3* 10) ;
    n5 = palindrome %10;
    
    System.out.printf("\n\n%d\n%d\n%d\n%d\n%d\n",n1,n2,n3,n4,n5);
    
    if (n1 == n5)
     b = true;
     else
      b = false;  
    if (n2 == n4)
     b=true;   
     else
     b=false;   
    
    if (b == true)
    System.out.println("The Entered number is palindrome");
    else
    { System.out.println("The Entered number is not palindrome, try again\n please enter a palindrome number");
    palindrome = input.nextInt();
    }
    
    }
        
        
        
        }
    
}
