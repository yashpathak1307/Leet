import java.util.*;
class leet
{
public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter length of array");
    int l = ob.nextInt();
    int nums[] = new int[l];
    int p = -1, ind = -1;
    System.out.println("Enter Elements");
    for(int i=0; i<l; i++)
    nums[i] = ob.nextInt();
    System.out.println("Enter Target");
    int t = ob.nextInt();
    for( int i = 0;i<l; i++)
    {
        for(int j=i+1;j<l;j++)
        {
           if(nums[i]+nums[j]==t)
           {
            p = j;
            ind = i;
            break;
           }
        }
        if(p!= -1 && ind != -1)
        break;
    }
    if(p!= -1 && ind!= -1)
    {
        System.out.println("TARGET ACCQUIRED "+t);
        System.out.println(nums[p]+"+"+nums[ind]);
        for(int i=0; i<l; i++)
        System.out.println(nums[i]);
    }
    else
    {
        System.out.println("TARGET NOT ACCQUIRED");
          for(int i=0; i<l; i++)
        System.out.println(nums[i]);
    }

}
}
