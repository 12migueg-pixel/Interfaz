public class Voleibolista extends Atleta implements EvaluableConLosMetodos{

    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public int getSaquesEfectivos() {
        return saquesEfectivos;
    }

    public void setSaquesEfectivos(int saquesEfectivos) {
        this.saquesEfectivos = saquesEfectivos;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public String toString(){
        return "voleibolista {" +
                "saques efecrivos= " + saquesEfectivos +
                ", bloqueos= " + bloqueos +
                '}';
    }


    @Override
    public double calcularRendimiento() {
        int rendimiento = (saquesEfectivos * 2) + (bloqueos * 3);
        System.out.println("Estamso calculado el rendimiento Voleibolista estrella");
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
