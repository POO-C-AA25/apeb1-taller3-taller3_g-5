import java.util.Scanner;

public class EjecutorEquipoCelular {
    public static void main(String[] args) {
        EquipoCelular celular = new EquipoCelular();
        
        celular.leerDatos();
        celular.calcularIVA();
        celular.calcularCostoFinal();
  
        System.out.println(celular.toString());
    }
}

class EquipoCelular {
    public String sistemaOperativo;
    public double tamanoPantalla;
    public double costoInicial;
    public double ivaPorcentaje;
    public double ivaCostoInicial;
    public double costoFinal;  
    public String direccionMac;
    public String imei;

    public Scanner tcl;

    public EquipoCelular() {
        this.tcl = new Scanner(System.in);
    }

    public EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costoInicial,
                         double ivaPorcentaje, String direccionMac, String imei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.imei = imei;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    // Métodos Getters
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double getCostoFinal() {
        return costoFinal;  
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public String getImei() {
        return imei;
    }

    public void leerDatos() {
        System.out.print("Ingrese el sistema operativo del celular: ");
        setSistemaOperativo(tcl.nextLine());
        
        System.out.print("Ingrese el tamaño de la pantalla (en pulgadas): ");
        setTamanoPantalla(tcl.nextDouble());
        
        System.out.print("Ingrese el costo inicial del celular: ");
        setCostoInicial(tcl.nextDouble());
        
        System.out.print("Ingrese el porcentaje de IVA: ");
        setIvaPorcentaje(tcl.nextDouble());
        
        System.out.print("Ingrese la direccion MAC del celular: ");
        setDireccionMac(tcl.nextLine());
        
        System.out.print("Ingrese el numero de IMEI del celular: ");
        setImei(tcl.nextLine());
    }

    public void calcularIVA() {
        this.ivaCostoInicial = this.costoInicial * (this.ivaPorcentaje / 100);
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }

    public String toString() {
        return "Equipo Celular:\n" +
               "Sistema Operativo: " + getSistemaOperativo() + "\n" +
               "Tamaño de Pantalla: " + getTamanoPantalla() + " pulgadas\n" +
               "Costo Inicial: $" + getCostoInicial() + "\n" +
               "IVA: $" + getIvaCostoInicial() + "\n" +
               "Costo Final: $" + getCostoFinal() + "\n" +
               "Direccion MAC: " + getDireccionMac() + "\n" +
               "IMEI: " + getImei();
    }
}
