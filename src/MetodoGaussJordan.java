public class MetodoGaussJordan {
    public static void main(String[] args) {
        Validaciones data = new Validaciones();
        int i,j,k,n;
        double a[][] = new double [5][6];
        double cte;
        double x[] = new double [5];
        System.out.println("\t\t\t\"METODO DE GAUSS-JORDAN\"");
        System.out.println("No. de incognitas (maximo 5):   ");
        n=data.leeint();
        System.out.println("Dame los coeficientes: ");
        for(i=0;i<n;i++)
        {
            System.out.println("Renglon "+(i+1));
            for(j=0;j<=n;j++)
            {
                System.out.println(" Ingrese a "+(i+1)+" "+(j+1));
                a[i][j]=data.lee();
            }
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<=n;j++){
                cte=(-a[j][i])/(a[i][i]);
                for(k=i;k<n+1;k++){
                    a[j][k]=((a[i][k])*cte)+a[j][k];
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Renglon "+(i+1));
            for(j=0;j<=n;j++)
            {
                System.out.println(" a "+(i+1)+" "+(j+1)+" =" +a[i][j]);
            }
        }
    }
}
