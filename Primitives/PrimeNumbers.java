package Basic.Primitives;

public class PrimeNumbers {

	public static void main(String args[])
    {
        int primeNumber = 37;
        boolean isPrime = true;
        
        for (int i = 2; i <= primeNumber/2; i ++){
            
            if (primeNumber % i == 0){
            
                System.out.println("not a prime number");
                isPrime = false;
                break;
            }
            System.out.println(primeNumber + " / " + i + " : " + primeNumber%i);
        
        }
        
        if (isPrime) System.out.println(primeNumber + " is a prime number");
   
            
    }
}


class Rextester2
{  
    public static void main(String args[])
    {
        int primeNumber = 37;
        boolean isPrime = true;
        
        for (int i = 2; i <= (long)Math.sqrt(primeNumber); i ++){ //faster
            
            if (primeNumber % i == 0){
            
                System.out.println("not a prime number");
                isPrime = false;
                break;
            }
            System.out.println(primeNumber + " / " + i + " : " + primeNumber%i);
        
        }
        
        if (isPrime) System.out.println(primeNumber + " is a prime number");
   
            
    }
}
