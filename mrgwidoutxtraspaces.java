import java.util.*;
import java.util.Arrays;
public class mrgwidoutxtraspaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int in1[] = new int[m];
        
        for(int i=0;i<m;i++)
        {
            in1[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        int in2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            in2[i] = sc.nextInt();
        }
        int s = m+n;
        int x[] = new int[s];

        for(int i=0;i<m;i++)
        {
            x[i] = in1[i];
        }
        for(int j=0;j<n;j++)
        {
            x[m+j] = in2[j];
        }

        Arrays.sort(x);

        for(int i=0;i<s;i++)
        {
            System.out.print(x[i]+" ");
        }

    }
}