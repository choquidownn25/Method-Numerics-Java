public class MetodoGauss {
    public static void main(String[] args){
        Validaciones data = new Validaciones();
        int i,j,k,n;
        double a[][] = new double [5][6];
        double cte,x1,x2,x3;
        double x[] = new double [5];
        System.out.println("\t\t\t\"METODO DE GAUSS\"");
        System.out.println("Dame el numero de incognitas (de hasta 5) ");
        n=data.leeint();
        System.out.println("Ingrese coeficientes");
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
        x3=a[n-1][n]/a[n-1][n-1];
        x2=(a[n-2][n]-x3*a[n-2][n-1])/a[n-2][n-2];
        x1=(a[n-3][n]-x2*a[n-3][n-2]-x3*a[n-3][n-1])/a[n-3][n-3];
        System.out.println("x0= "+x1+" \nx1= " +x2+" \nx2= " +x3);
    }
}
