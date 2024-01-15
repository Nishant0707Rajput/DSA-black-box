class NumberofFactorsUptoN {

    public static void factors(int n) {
        int[] div = new int[n + 1]; 
        for(int i = 1; i <= n; i++){
            for(int j = i ; j <= n; j+=i){
                div[j]++;  // i is a divisor of  j
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.println(div[i]);
        }
    }
}


// time complexity - 
// [n/1] + [n/2] + [n/3] + [n/4] + .....[n/n] = less than O(nlogn);

// proof

// if we replace n/3 with n/2 which is slightly higher value and next n/5 to n/7 by n/4 similarly going on..., these small chunks would have sum = n and it will be log(n) times so time complexity will be nlog(n) times.