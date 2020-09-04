import java.util.*;
public class triplets {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int temp = 0;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                temp = a[i] + a[j];
                for(int k=0;k<n;k++)
                {
                    if(temp==a[k])
                    {
                        count++;
                    }
                }
            }  
        }
        System.out.print(count);
    }
}