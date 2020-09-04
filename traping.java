import java.util.*;
public class traping {
    public static void main(String[] args) {
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        left[0] = 0;
        right[a.length-1] = 0;
        int sum = 0;
        for(int i=1;i<a.length;i++)
        {
           left[i] = Math.max(left[i-1],a[i-1]);
        }
        for(int i=a.length-2;i>0;i--)
        {
            right[i] = Math.max(a[i+1],right[i+1]);
        }

        for(int i=0;i<a.length;i++)
        {
            if((left[i]>a[i]) && (right[i]>a[i]))
            {
                if((Math.min(left[i],right[i]) - a[i])>0)
                {
                    sum = sum + Math.min(left[i],right[i]) - a[i];
                }
                
            }
        }

        System.out.print(sum);
    }
}