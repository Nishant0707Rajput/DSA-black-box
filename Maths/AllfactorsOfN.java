class AllfactorsOfN{
    public int countFactors(int n){
        int count = 0;
        for(int i = 0; i * i <= n; i++){
            if( n % i==0 ){
                count++;
                if(i  != n / i){ // so that we do not count a perfect square twice
                    count++;
                }
            }
        }
        return count;
    }
}

// Time complexity is O(sqrt(N))

// Approach behind it is that
// if i is divisible by n then n / i  will also be divisible by n 
// i * n / i = n

//  So we can count n and n / i as count += 2; 

// then all prime factors will also be in range of sqrt(n)

// ex - 84
// 2 * 42;
// 3 * 28;
// 4 * 21;
// 6 * 14;
// 7 * 12;
// mid - point - after this factors are repeating; That's why we are counting it twice in above loop
// 12 * 7; 
// 28 * 3;
// 21 * 4;
// 14 * 6;
// 12 * 7;