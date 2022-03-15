import java.util.Scanner;

public class Principal {
    public static void main (String[] abc){
        Quadrado quadrado =new Quadrado();
        System.out.println("Digite um lado");
        Scanner sc= new Scanner (System.in);
        quadrado.setLado(sc.nextDouble());

        System.out.println("---------------------------");
        System.out.println(quadrado.getNomeFigura());
        System.out.println("Lado:"+quadrado.getLado());
        System.out.println("Area:"+quadrado.getArea());
        System.out.println("Perimetro"+quadrado.getPerimetro());

        System.out.println("---------------------------");

        Triangulo triangulo =new Triangulo();
        System.out.println("Digite um lado A");
        triangulo.setLadoA(sc.nextDouble());
        System.out.println("Digite um lado B");
        triangulo.setLadoB(sc.nextDouble());
        System.out.println("Digite um lado C");
        triangulo.setLadoC(sc.nextDouble());
        System.out.println("Digite a altura");
        triangulo.setAltura(sc.nextDouble());
        System.out.println("Digite a base");
        triangulo.setBase(sc.nextDouble());
        
        sc.close();
        System.out.println("---------------------------");

        System.out.println(triangulo.getNomeFigura());
        System.out.println("Lado A"+triangulo.getLadoA());
        System.out.println("Lado B"+triangulo.getLadoB());
        System.out.println("Lado C"+triangulo.getLadoC());
        System.out.println("Area"+triangulo.getArea());
        System.out.println("Altura"+triangulo.getAltura());
        System.out.println("Base"+triangulo.getBase());

    

    }
}
