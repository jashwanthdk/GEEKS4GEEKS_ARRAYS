import java.time.Year;
import java.util.*;
public class tripletpyth {
    public static void main(String[] args) {
        int a[] = {3,1,4,6,5};
        int x,y,z;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=j+1;k<a.length;k++)
                {
                    x = a[i]*a[i];
                    y = a[j]*a[j];
                    z = a[k]*a[k];
                    if(x==y+z)
                    {
                        System.out.println("x = "+x);
                        System.out.println("y = "+y);
                        System.out.println("z = "+z);
                    } 
                    if(y==x+z)
                    {
                        System.out.println("y = "+y);
                        System.out.println("x = "+x);
                        System.out.println("z = "+z);
                    }
                    if(z==x+y)
                    {
                        System.out.println("z = "+z);
                        System.out.println("x = "+x);
                        System.out.println("y = "+y);
                    }
                }
            }
        }
    }
}