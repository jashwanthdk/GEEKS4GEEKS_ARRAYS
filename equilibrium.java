import java.util.*;
public class equilibrium {
    public static void main(String[] args) {
        int a[] = {1,2,6,4,0,-1};
        int sum1;
        int sum2;
        int sum[] = new int[a.length];
        sum[0] = a[0];
        int total;
        
        
        if(a.length==2)
        {
            System.out.print("Equilibrium point doesnt exist");
        }
        else
        {
            for(int i=1;i<a.length;i++)
            {
                sum[i] = a[i]+sum[i-1];
            }
    
            total = sum[a.length-1];
    
            for(int i=0;i<a.length;i++)
            {
                sum1 = sum[i] - a[i];
                sum2 = total - sum[i];
                if(sum1==sum2)
                {
                    System.out.print("Equilibrium element :" + a[i]);
                    break;
                }
            }
    
        }
    }
}