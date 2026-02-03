package recursion;

public class SumOfN_Natural_Number {
    public static void main(String[] args) {
        int sum= 0;
        sum=sum_of_n_natural_numbers(5,sum);
        System.out.println(sum);
        System.out.println(sum_of_n_natural_numbers(10));
    }

    private static int sum_of_n_natural_numbers(int n,int sum) {
        if(n==0)
        {
            return sum;
        }
        return sum_of_n_natural_numbers(n-1,sum+n);
    }
    private static int sum_of_n_natural_numbers(int n) {
        if(n==0)
        {
            return 0;
        }
        return n+sum_of_n_natural_numbers(n-1);
    }
}
