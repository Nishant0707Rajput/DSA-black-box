public class ModuloArithmetic {
    
    public static void main(String args[]){
        System.out.println(aToThePowerBPercentN(3, 3, 5));
    }
    // if b=0 then a ^ b = 1
    // if b is even then (a ^ (b/2)) ^ 2
    // if b is odd a * (a ^ ((b-1)/2)) ^ 2

    // binary exponentiation
    // binpow
    // O(logn)
    public static int aToThePowerBPercentN(int a, int b, int m){
        if(b == 0){
            return a % m;
        }
        if( b % 2==0){
            int temp = aToThePowerBPercentN(a,b/2,m);
            return ((temp * temp) % m); 
        }
        int temp = aToThePowerBPercentN(a,(b - 1)/2,m);
        temp = (temp * temp) % m;   
        temp = a * temp % m;
        return temp;
    }

}
// (a + b) % m = ((a % m) + (b%m)) % m
// (a * b) % m = ((a % m) * (b%m)) % m
// (a - b) % m = ((a % m) - (b%m) + m) % m ---> that + m so that we do not make the number negative

// even + even = even
// odd + odd = even
// even + odd = even

// even * even = even
// odd * odd = odd
// even * odd = even




