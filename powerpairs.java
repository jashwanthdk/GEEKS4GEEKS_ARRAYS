public class powerpairs 
{
    public static void main(String[] args) 
    {
        int x[] = {2,1,6};
        int y[] = {1,5};

        int count = 0;

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<y.length;j++)
            {
                if(Math.pow(x[i],y[j]) > Math.pow(y[j],x[i]) )
                {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}