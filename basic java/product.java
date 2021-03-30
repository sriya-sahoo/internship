

import java.text.*;

public class product
{
  
  public static void main(String[] args)
  {
   float n1=6.0f,n2=8.2f,p;
    p=n1*n2;
 
    DecimalFormat d= new DecimalFormat("#.##");
   System.out.println(d.format(p));
  }
}
