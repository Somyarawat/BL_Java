class MatrixOps {

    public static int[][] create(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=(int)(Math.random()*10);
        return m;
    }

    public static int[][] add(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[i][j]=a[i][j]+b[i][j];
        return res;
    }

    public static void main(String[] args){
        int[][] a=create(2,2);
        int[][] b=create(2,2);
        int[][] c=add(a,b);

        for(int[] row:c){
            for(int x:row) System.out.print(x+" ");
            System.out.println();
        }
    }
}