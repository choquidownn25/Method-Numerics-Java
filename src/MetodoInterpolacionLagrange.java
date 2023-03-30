public class MetodoInterpolacionLagrange {
    public static void main(String[] args) {
        Validaciones data = new Validaciones();
        int n,i;
        double x,y;
        double[][] a = new double [4][2];
        System.out.println("\t\t\t\"METODO DE INTERPOLACION LAGRANGE  2-4 PTOS.\"");
        do{
            System.out.println("Dame el numero de puntos");
            n=data.leeint();
        }while(n<2 || n>4);
        System.out.println("Dame los  pares de puntos");
        for(i=0;i<n;i++){
            System.out.println("Dame x "+i);
            a[i][0]=data.lee();
            System.out.println("Dame f(x) "+i);
            a[i][1]=data.lee();
        }
        System.out.println("Dame el valor a interpolar ");
        x=data.lee();
        switch (n) {
            case 2 -> {
                y = (((((x - a[1][0]) * a[0][1]) / (a[0][0] - a[1][0])) + (((x - a[0][0]) * a[1][1]) / (a[1][0] - a[0][0]))));
                System.out.println("f(x) en ese punto es: " + y);
            }
            case 3 -> {
                y = ((x - a[1][0]) * (x - a[2][0]) * a[0][1]) / ((a[0][0] - a[1][0]) * (a[0][0] - a[2][0])) + ((x - a[0][0]) * (x - a[2][0]) * a[1][1]) / ((a[1][0] - a[0][0]) * (a[1][0] - a[2][0])) + ((x - a[1][0]) * ((x - a[0][0]) * a[2][1]) / ((a[2][0] - a[0][0]) * (a[2][0] - a[1][0])));
                System.out.println("f(x) en ese punto es: " + y);
            }
            case 4 -> {
                y = ((x - a[1][0]) * (x - a[3][0]) * (x - a[2][0]) * a[0][1]) / ((a[0][0] - a[1][0]) * (a[0][0] - a[2][0]) * (a[0][0] - a[3][0])) + ((x - a[0][0]) * (x - a[2][0]) * (x - a[3][0]) * a[1][1]) / ((a[1][0] - a[0][0]) * (a[1][0] - a[2][0]) * (a[1][0] - a[3][0])) + ((x - a[0][0]) * (x - a[1][0]) * ((x - a[3][0]) * a[2][1]) / ((a[2][0] - a[0][0]) * (a[2][0] - a[1][0]) * (a[2][0] - a[3][0])) + ((x - a[0][0]) * (x - a[1][0]) * ((x - a[2][0]) * a[
                        3][1]) / ((a[3][0] - a[0][0]) * (a[3][0] - a[1][0]) * (a[3][0] - a[2][0]))));
                System.out.println("f(x) en ese punto es: " + y);
            }
            default -> System.out.println("INVALIDO");
        }
    }
}
