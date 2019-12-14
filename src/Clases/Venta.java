package Clases;

public class Venta {
    private int codigo;
    private String fecha,cod_car,cod_vend,cod_cli;

    public Venta() {
    }

    public Venta(int codigo, String fecha, String cod_car, String cod_vend, String cod_cli) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cod_car = cod_car;
        this.cod_vend = cod_vend;
        this.cod_cli = cod_cli;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCod_car() {
        return cod_car;
    }

    public void setCod_car(String cod_car) {
        this.cod_car = cod_car;
    }

    public String getCod_vend() {
        return cod_vend;
    }

    public void setCod_vend(String cod_vend) {
        this.cod_vend = cod_vend;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }
    
}
