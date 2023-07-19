import java.util.Scanner;

public class Main {
    public static int countOfFactors(int num)
    {
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i==num/i)
                { count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        System.out.println("Enter values");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();

        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((countOfFactors(A[i])>countOfFactors(A[j]))|| A[i]>A[j])
                {
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(A[i]);

        }
    }
}