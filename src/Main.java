//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        Ciclista C1 = new Ciclista("Mendez",18, 5,80,6);
        Boxeador B1 = new Boxeador("Brayan",19, 4,15, 15 );
        Voleibolista V1 = new Voleibolista("Camilo",18,7, 40,90);


        double mejorRendimiento = 0;
        Atleta mejorAtleta = null;


        System.out.println(C1.toString());
        double r1 = C1.calcularRendimiento();
        System.out.println("Rendimiento: " + r1);
        C1.clasificarNivel();
        C1.calcularBono();

        if (r1 > mejorRendimiento) {
            mejorRendimiento = r1;
            mejorAtleta = C1;
        }

        System.out.println("---------------------");


        System.out.println(B1.toString());
        double r2 = B1.calcularRendimiento();
        System.out.println("Rendimiento: " + r2);
        B1.clasificarNivel();
        B1.calcularBono();

        if (r2 > mejorRendimiento) {
            mejorRendimiento = r2;
            mejorAtleta = B1;
        }

        System.out.println("---------------------");


        System.out.println(V1.toString());
        double r3 = V1.calcularRendimiento();
        System.out.println("Rendimiento: " + r3);
        V1.clasificarNivel();
        V1.calcularBono();

        if (r3 > mejorRendimiento) {
            mejorRendimiento = r3;
            mejorAtleta = V1;
        }

        System.out.println("======================");
        System.out.println("MEJOR ATLETA:");
        System.out.println(mejorAtleta.toString());
        System.out.println("Rendimiento: " + mejorRendimiento);

    }
}