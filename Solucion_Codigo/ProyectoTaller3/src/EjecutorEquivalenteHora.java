
public class EjecutorEquivalenteHora {
    public static void main(String[] args) {
        int horaAleatoria = (int) (Math.random() * 100) + 1;

        EquivalenciaHora equivalencia = new EquivalenciaHora(horaAleatoria);

        equivalencia.convertir();

        System.out.println(horaAleatoria + " hora tiene:");
        System.out.println(equivalencia.toString());
    }
}

class EquivalenciaHora {
    public int hora;
    public int minuto;
    public int segundo;
    public int dia;

    public EquivalenciaHora() {}
    public EquivalenciaHora(int horas) {
        this.hora = horas;
    }

    public void convertir() {
        this.minuto = hora * 60;
        this.segundo = minuto * 60;
        this.dia = hora / 24;
    }
    
    public String toString() {
        return "Equivalencia de " + hora + " horas:\n" +
                "Minutos: " + minuto + "\n" +
                "Segundos: " + segundo + "\n" +
                "Dias: " + dia;
    }
}
