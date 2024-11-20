public class Recursion_part2 {

    //Ques-1: {N to 1}
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        fun(--n);
    }


    //QUES-2 : {1 to N}
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }


    //QUES-3: {FACTORIAL  OF  A  NUMBER}
    public static void main(String[] args) {
        int ans=fact(6);
        System.out.println(ans);
    }
    static  int fact(int n){
        if (n <=1){
            return 1;
        }
        return n* fact(n-1);
    }


    //QUES-4 : {SUM  OF  N  to  1}
    public static void main(String[] args) {
        int ans=sum(5);
        System.out.println(ans);
    }
    static  int sum(int n){
        if (n <=1){
            return 1;
        }
        return n + sum(n-1);
    }


    //QUES-5 : {SUM  OF  DIGITS}
    public static void main(String[] args) {
        int ans=sum(1340);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }


    //QUES-6 : {PRODUCT  OF  DIGITS}
    public static void main(String[] args) {
        int ans=product(1342);
        System.out.println(ans);
    }
    static int product(int n){
        if(n%10 ==n){
            return n;
        }
        return (n%10)* product(n/10);
    }


    //QUES-7 : {COUNT  NO.  OF  ZEROES}
    public static void main(String[] args) {
        System.out.println(count(30204));
    }
    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem= n%10;
        if (rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10 ,c);
    }

}
