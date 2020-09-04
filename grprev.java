public class grprev {
   public static void main(String[] args) {
       int a[] = {2 , 3 , 4, 5, 6, 7, 8 , 9};
       int k = 4; int temp;

       for(int i=0;i<a.length;i=i+k)
       {
           int start = i;
           int end = Math.min(a.length-1,i+k-1);
            while(start<end)
            {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
            }
       }

       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
   } 
}