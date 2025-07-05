/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int a) {
        if ((a%2)==0){
           
	       	return a/2 ;
        
	}else if((a%2)!=0){
            
		return ((3*a)+1) ;
        
	}else if(a==1){
            
		return a ; 
        } 
	return 0 ; 
    } 
    

    public static void main(String[] args) {
        int n = 3;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
   }


