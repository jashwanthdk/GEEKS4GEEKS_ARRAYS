import java.util.*;

public class platform {
    public static void main(String[] args) {
        int a[] = {900 ,1100 ,1235};
        int b[] = {1000, 1200, 1240};
        
        int i=0;
        int j=0;
        int n = a.length;
        int count = 0;
        int result = 0;
        while(i<n && j<n)
        {
            if(a[i]<=b[j])
            {
                count++;
                i++;
            }
            else if(a[i]>b[j])
            {
                count--;
                j++;
            }
            if(count>result)
            {
                result = count;
            }
        }

        System.out.print(result);
    }    
}