import java.util.*;
public class leader {
    public static void main(String[] args) {
        int a[] = {16,17,5,3,5,2};
        int max=0;
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]>max)
            {
                max = a[i];
                System.out.print(max+" ");
                
            }
        }
    }
}