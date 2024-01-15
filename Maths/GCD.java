public class GCD {
    
    public static void main(String args[]){
        System.out.println(gcd(59,47));
    }

    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b % a , a);
    }
}

// time-complexity - O(log(max(a,b)))

// Works on Euclidean algo to find GCD 
// i.e. gcd(a,b) = gcd( a, b-a ) 
// aka gcd( a, b ) = gcd(a, b % a );

// GCD of coprime numbers is 1