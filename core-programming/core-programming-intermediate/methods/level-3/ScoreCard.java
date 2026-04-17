import java.util.*;

class Scorecard {

    public static int[][] marks(int n){
        int[][] m=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                m[i][j]=(int)(Math.random()*90)+10;
        return m;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] m=marks(n);

        for(int i=0;i<n;i++){
            int total=m[i][0]+m[i][1]+m[i][2];
            double avg=total/3.0;
            double per=avg;

            System.out.println(total+"\t"+avg+"\t"+per);
        }
    }
}