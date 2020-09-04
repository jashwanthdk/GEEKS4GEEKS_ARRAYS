import java.util.*;
public class stockbuysell {
    public static void main(String[] args) {
        int a[] = {23 ,13 ,25 ,29 ,33 ,19 ,34 ,45, 65 ,67};
        int n = a.length;
        if(a[0]<a[1])
        {
            System.out.println("Buying point:"+a[0]);
        }
        for(int i=1;i<n-1;i++)
        {

            if((a[i]<a[i-1])&&(a[i]<a[i+1]))
            {
                System.out.println("Buying point:"+a[i]);
            }

            if((a[i]>a[i-1])&&(a[i]>a[i+1]))
            {
                System.out.println("Selling point:"+a[i]);
            }
        }

        if(a[n-2]<a[n-1])
        {
            System.out.println("Selling point:"+a[n-1]);
        }
    }
}