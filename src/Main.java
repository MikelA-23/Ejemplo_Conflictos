import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SumarNumeros obj = new SumarNumeros();
        int numA,numB,numC;
        System.out.println("Ingrese el valor del numero A:");
        numA=Integer.parseInt(br.readLine());
        System.out.println("Ingrese el valor del numero B:");
        numB=Integer.parseInt(br.readLine());
        System.out.println("Ingrese el valor del numero C:");
        numC=Integer.parseInt(br.readLine());
        obj.setNumA(numA);
        obj.setNumB(numB);
        obj.setNumC(numC);
        System.out.println("EL valor del resultado de la suma es: "+obj.obtenerSuma());
        System.out.println("      ");
    }
}
