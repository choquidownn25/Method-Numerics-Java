public class Biseccion {
    public static void main(String[] args) {
        Validaciones data = new Validaciones();
        System.out.println("Hello world!");
        double a;
        double b;
        double tol;
        System.out.println("\t\t\t\"METODO DE BISECCION\"");
        System.out.println("Extremo Izquierdo: ");
        a=data.lee();
        System.out.println("Extremo Derecho: ");
        b=data.lee();
        System.out.println("Tolerancia: ");
        tol=data.lee();
        double c;
        do{
            c=(a+b)/2.0;
            if(((c*c-5)*(a*a-5))<0){
                b=c;
            }
            else{
                a=c;
            }
        }while(Math.abs(a-b)>tol);
        System.out.println("La raiz es: "+c);
    }
}