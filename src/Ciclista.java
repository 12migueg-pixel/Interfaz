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
    public String toString(){
        return "ciclista {" +
                "Kilometros Recorridos= " + kilometrosRecorridos +
                ", tiempo horas= " + tiempoHoras +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double rendimiento = kilometrosRecorridos / tiempoHoras;
        System.out.println("Estamso calculado el rendimiento Cilista estrella");
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
