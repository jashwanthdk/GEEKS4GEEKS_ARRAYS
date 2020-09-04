import java.util.*;
public class spiral {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }

        int i;
        int k = 0;
        int l = 0;

        while (k < m && l < n) { 
            // Print the first row from the remaining rows 
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            // Print the last row from the remaining rows */ 
            if (k < m) 
            { 
                for (i = n - 1; i >= l; --i) 
                { 
                    System.out.print(a[m-1][i] + " "); 
                } 
                m--; 
            } 
  
            // Print the first column from the remaining columns */ 
            if (l < n) 
            { 
                for (i = m - 1; i >= k; --i) 
                { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 


    
    }
}