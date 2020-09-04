import java.util.*;
public class zigzag {
     
    static int a[] = new int[]{4 ,3 ,7 ,8 ,6 ,2, 1};

    public static void main(String[] args)
    {
        int temp = 0;
        boolean flag = true;
        for (int i=0; i<=a.length-2; i++) 
        {
            if(flag)
            //"<"
            {
                if(a[i]>a[i+1])
                {
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1] = temp;
                }
            }
            
            else//">"
            {
                if (a[i] < a[i+1])  
                {  
                    temp = a[i];  
                    a[i] = a[i+1];  
                    a[i+1] = temp;  
                }  
            }
            flag = !flag;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }  
}