public class MetodoNewtonRaphson {
    public static void main(String[] args){
        Validaciones data = new Validaciones();
        double a;
        double tol;
        double b;
        double c;
        System.out.println("\t\t\t\"METODO DE NEWTON-RAPHSON\"");
        System.out.println("Primera Aproximacion: ");
        a=data.lee();
        System.out.println("Tolerancia: ");
        tol=data.lee();
        do{
            b=a-(a*a-a-2)/(2*a-1);
            c=Math.abs(a-b);
            a=b;
        }while(c>tol);
        System.out.println("La raiz es: "+b);
    }

}
