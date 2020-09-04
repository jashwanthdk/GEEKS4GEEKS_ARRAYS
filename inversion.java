import java.util.*;
public class inversion {
    public static void main(String[] args) {
        int a[] = {9,6,8,4};
        int temp;
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]>a[j])&&(i<j))
                {
                    count++;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.print(count);
    }
}
