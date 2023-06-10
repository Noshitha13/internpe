public class singleduplicate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,2};
        outerloop:
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("The duplicate element is " + a[i] );
                    break outerloop;
                }
            }
            
        }


    }
}
