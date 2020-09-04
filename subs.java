//Subarray with given sum (GEEKSFORGEEKS)
import java.util.*;
class subs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();// y is that sum
        int a[] = new int[x];

        for(int i=0;i<x;i++)
        {
            a[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0;i<x;i++)
        {
            for(int j=i;j<x;j++)
           { 
                sum = sum + a[j];
                if(sum==y)
                {
                    System.out.print(i+1);
                    System.out.print(" ");
                    System.out.print(j+1);
                    System.out.println(" ");
                }
                
            }
            sum = 0;
        }


    }
}
