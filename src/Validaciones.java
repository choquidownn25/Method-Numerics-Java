import java.lang.Math;
import java.io.*;
public class Validaciones {
    //para leer desde teclado
    public double lee(){
        double num;
        try{
            InputStreamReader isr = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader(isr);
            String sdato;
            sdato = br.readLine();
            num = Double.parseDouble(sdato);
        }
        catch(IOException ioe){
            num=0.0;
        }
        return num;
    }

    //para  leer un entero
    public int leeint(){
        int num;
        try{
            InputStreamReader isr = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader(isr);
            String sdato;
            sdato = br.readLine();
            num = Integer.parseInt(sdato);
        }
        catch(IOException ioe){
            num=0;
        }
        return num;
    }


    //para salir del programa
    public int Fuera(){
        int sal;
        System.out.println("\n\n\nSI DESEAS OTRO METODO PRESIONA [1]");
        sal=leeint();
        return sal;
    }

}
