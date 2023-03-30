public class MetodoLu {
    public static void main(String[] args) {
        Validaciones data = new Validaciones();
        int i,j;
        double Y1,Y2,Y3,X1,X2,X3;
        double A[][] = new double [3][3];
        double L[][] = new double [3][3];
        double U[][] = new double [3][3];
        double B[] = new double [3];
        System.out.println("\t\t\t\"METODO DE LU    3 ECUACIONES\"");
        System.out.println("Ingrese coeficientes d");
        for(i=0;i<3;i++)
        {
            System.out.println("Renglon "+(i+1));
            for(j=0;j<3;j++)
            {
                System.out.println(" Ingrese a "+(i+1)+" "+(j+1));
                A[i][j]=data.lee();
            }
        }
        System.out.println("Ingrese los terminos independientes");
        for(i=0;i<3;i++){
            System.out.println("Termino  "+(i+1));
            B[i]=data.lee();
        }
        for(i=0;i<3;i++){
            L[i][0]=A[i][0];
            U[i][i]=1;
        }
        U[0][1]=A[0][1]/L[0][0];
        L[1][1]=A[1][1]-L[1][0]*U[0][1];
        L[2][1]=A[2][1]-L[2][0]*U[0][1];
        U[0][2]=A[0][2]/L[0][0];
        U[1][2]=(A[1][2]-L[1][0]*U[0][2])/L[1][1];
        L[2][2]=A[2][2]-L[2][0]*U[0][2]-L[2][1]*U[1][2];
        Y1=B[0]/L[0][0];
        Y2=(B[1]-L[1][0]*Y1)/L[1][1];
        Y3=(B[2]-L[2][0]*Y1-L[2][1]*Y2)/L[2][2];
        X3=Y3;
        X2=Y2-U[1][2]*X3;
        X1=Y1-U[0][1]*X2-U[0][2]*X3;
        System.out.println("El resultado es:\nx0= "+X1+" \nx1= " +X2+" \nx2= " +X3);
    }
}
