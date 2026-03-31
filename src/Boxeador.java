public class Boxeador extends Atleta implements EvaluableConLosMetodos{

private int golpesAcertados;
private int peleasGanadas;

    public Boxeador(String nombre, int edad, double horasEntrenamiento, int golpesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.golpesAcertados = golpesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    public int getGolpesAcertados() {
        return golpesAcertados;
    }

    public void setGolpesAcertados(int golpesAcertados) {
        this.golpesAcertados = golpesAcertados;
    }

    public int getPeleasGanadas() {
        return peleasGanadas;
    }

    public void setPeleasGanadas(int peleasGanadas) {
        this.peleasGanadas = peleasGanadas;
    }

    @Override
    public  String toString(){
        return "Boxeador {" +
                "golpes acertados= " + golpesAcertados +
                ", peleas ganadas= " +peleasGanadas +
                '}';

    }

    @Override
    public double calcularRendimiento() {
        double rendimiento = (golpesAcertados * 0.5) + (peleasGanadas * 10);
        System.out.println("Estamso calculado el rendimiento Boxeador estrella");
        return rendimiento;
    }

    @Override
    public void clasificarNivel() {
        double rendimiento = calcularRendimiento();
        if (rendimiento<30){
            System.out.println("su nivel es muy basico");
        } else if (rendimiento<=70) {
            System.out.println("su nivel es competente");
        } else {
            System.out.println("su nivel es de elite");
        }

    }

    @Override
    public void calcularBono() {
        double rendimiento = calcularRendimiento();
        int bono;

        if (rendimiento<30){
            bono = 50000;
        } else if (rendimiento<=70) {
            bono = 15000;
        } else {
            bono = 30000;
        }
        System.out.println("el bono asignado es: " + bono);

    }
}
