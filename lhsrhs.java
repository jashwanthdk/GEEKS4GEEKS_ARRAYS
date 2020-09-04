public class lhsrhs {
    public static void main(String[] args) {
        int a[] = {11 ,9 ,12};

        for(int i=1;i<a.length-1;i++)
        {
            if((a[i]>a[i-1])&&(a[i]<a[i+1]))
            {
                System.out.print(a[i]+" ");
                break;
            }
            else
            {
                System.out.print("-1");
            }
        }
    }
}