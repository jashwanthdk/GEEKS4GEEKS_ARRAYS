import java.util.*;
public class candy {
    public static void main(String[] args) {
        int a[] = {1,2,2};
        int n = a.length;
        Arrays.sort(a);
        int sum = n;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                sum = sum + 1;
            }
        }
        System.out.print(sum);
    }
}