import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
public class rearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int a[] = {1,2,3,4,5,6};
        int b[] = new int[a.length];
        
        for(int i=a.length;i>0;i--)
        {
            b[a.length-i] = a[i-1];
        }
        
        if(a.length%2==0)
        {
            for(int i=0;i<a.length/2;i++)
            {
                System.out.print(b[i]+" ");
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            for(int i=0;i<a.length/2;i++)
            {
                System.out.print(b[i]+" ");
                System.out.print(a[i]+" ");
            }
            System.out.print(a[(a.length/2)]);
        }

    }
}