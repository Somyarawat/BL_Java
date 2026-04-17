class MatrixAdvanced {

    public static int[][] transpose(int[][] m){
        int r=m.length,c=m[0].length;
        int[][] t=new int[c][r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                t[j][i]=m[i][j];
        return t;
    }

    public static int det2(int[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    public static void main(String[] args){
        int[][] m={{1,2},{3,4}};
        int[][] t=transpose(m);

        for(int[] row:t){
            for(int x:row) System.out.print(x+" ");
            System.out.println();
        }

        System.out.println(det2(m));
    }
}