public class MetodoGaussSeidel {
    public static void main(String[] args){
        Validaciones data = new Validaciones();
        double x0,x1,x2,tol,e;
        int i,j;
        double a[][]=new double [3][4];
        System.out.println("\t\t\t\"METODO DE GAUSS-SEIDEL 3 ECUACIONES\"");
        System.out.println("Ingrese tolerancia");
        tol=data.lee();
        System.out.println("Ingrese coeficientes");
        for(i=0;i<3;i++)
        {
            System.out.println("Renglon "+(i+1));
            for(j=0;j<=3;j++)
            {
                System.out.println(" Ingrese a "+(i+1)+" "+(j+1));
                a[i][j]=data.lee();
            }
        }
        x1=0.0;
        x2=0.0;
        do{
            e=x1;
            x0=(a[0][3]-x1*a[0][1]-x2*a[0][2])/a[0][0];
            x1=(a[1][3]-x0*a[1][0]-x2*a[1][2])/a[1][1];
            x2=(a[2][3]-x0*a[2][0]-x1*a[2][1])/a[2][2];
        }while(Math.abs(e-x1)>tol);
        System.out.println("x0= "+x0+" \nx1= " +x1+" \nx2= " +x2);
    }
}
