public class SieveOfEratosthenes {
    
    public static void main(String args[]){
        func(9000);
    }

    public static void func(int n){
        boolean[] prime = new boolean[n + 1];
        for(int i = 0; i <= n; i++){
            prime[i] = true;
        }
        for(int i = 2; i <= n; i++ ){
            if(!prime[i]) continue; // it's not prime then multiple will also not be prime

            // here it can also start from 2 * i, it would have been covered by 2i, 3i, 5i itself that's why starting it from i * i. Anything smaller than i like (i - 1) * (i) would have been marked by previous iteration as it is multiple of ( i - 1);
            if(prime[i]) System.out.println(i);
            for(int j = i * i; j <=n; j += i ){
                prime[j] = false;  // marking all numbers false from i * i to n which are multiple of j
            }
        }
        
    }
}

// Time-complexity O(nlog(logn)) --> almost linear
