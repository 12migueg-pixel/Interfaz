public class Ciclista extends Atleta implements  EvaluableConLosMetodos{

    private double kilometrosRecorridos;
    private double tiempoHoras;

    public Ciclista(String nombre, int edad, double horasEntrenamiento, double kilometrosRecorridos, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.tiempoHoras = tiempoHoras;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(double tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public double calcularRendimiento() {
        return 0;
    }

    @Override
    public void clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
