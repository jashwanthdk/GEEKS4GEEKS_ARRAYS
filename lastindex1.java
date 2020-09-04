public class lastindex1 {
    public static void main(String[] args) {
        int a[] = {0,0,0,0};
        int sum = 0;
        for(int i=a.length-1;i>=0;i--)
        {
            sum = sum + a[i];
            if(a[i]==1)
            {
                System.out.print(i);
                break;
            }
        }
        if(sum==0)
        {
            System.out.print("-1");
        }   
    }
}