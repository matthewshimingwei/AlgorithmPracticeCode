import java.io.*;
import java.util.*;
public class Main {
    public static String solve(int numberOfAnts,int length,int []distance)
    {
        int minT = 0;
        for(int i =0;i<numberOfAnts;i++)
        {
            minT = Math.max(minT,Math.min(distance[i],length-distance[i]));

        }

        int maxT = 0;
        for(int j =0;j<numberOfAnts;j++)
        {
            maxT = Math.max(maxT,Math.max(distance[j],length-distance[j]));
        }

        String answer = minT+" "+maxT;
        return answer;

    }
    public static void main(String []args)
    {

        int Case = 0;
        Scanner sc = new Scanner(System.in);
        Case = sc.nextInt();

        String []answer = new String[Case];

        for (int i = 0;i<Case;i++)
        {
            String input = sc.nextLine();
            String []Stringarray = input.split(" ");
            int nums[] = new int[2];
            for(int j = 0;j<2;j++)
            {
                nums[j] =Integer.parseInt(Stringarray[j]);
            }
            int numberOfAnt = nums[1];
            int LENGTH = nums[0];
            for(int k = 0;k<numberOfAnt;k++)
            {
                int []distanceFromLeft = new int[numberOfAnt];
                input = sc.nextLine();
                Stringarray = input.split("\\s+");
                int []numPosition = new int[numberOfAnt];
                for(int l = 0;l<numberOfAnt;l++)
                {
                    distanceFromLeft[l] = Integer.parseInt(Stringarray[l]);
                }
                answer[i] = solve(numberOfAnt,LENGTH,distanceFromLeft);
            }
        }


        //output
        for(int i = 0;i<Case;i++)
        {

            String []Stringarray = answer[i].split("\\s+");
            int arrLength = Stringarray.length;
            int []outPut = new int[arrLength];
            for(int j = 0;j<outPut.length;j++)
            {
                System.out.print(outPut[j]+" ");
            }
            System.out.println();

        }

    }
}
