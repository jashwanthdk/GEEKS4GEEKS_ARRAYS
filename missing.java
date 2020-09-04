import java.util.*;
public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        
        for(int i=0;i<n-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n-2;i++)
        {
            int diff = a[i+1] - a[i];
            if(diff>1)
            {
                int missing = a[i]+1;
                System.out.print(missing);
            }
        }
    }  
}