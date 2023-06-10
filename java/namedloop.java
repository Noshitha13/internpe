public class namedloop {
    public static void main(String[] args) {
        outerloop:
        for(int i=1;i<=3;i++)
        {
           innerloop:
            for(int j=1;j<=3;j++)
            {
              System.out.println("i= " + i + " and " + "j= " + j);
              if(i==2 && j==2)
              {
                break outerloop;
              }
            }
        }
        System.out.println("end of the program");
    }
}
