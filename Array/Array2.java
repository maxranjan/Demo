public class Array2 {
    public static void main(String[] args) {
        int[][] a={{10,20,30,60},{40,50},{70,80,90}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
