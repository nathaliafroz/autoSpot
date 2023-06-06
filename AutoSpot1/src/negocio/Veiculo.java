
package negocio;

import java.time.LocalTime;

public class Veiculo {
    
    private String placa;
    private String tipo;
    private String vaga;
    private LocalTime entrada;
    private LocalTime saida;
    private long horasEstacionado;

    public Veiculo() {
    }

    public Veiculo(String placa, String tipo, String vaga, LocalTime entrada, LocalTime saida) {
        this.placa = placa;
        this.tipo = tipo;
        this.vaga = vaga;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Veiculo(String placa, String tipo, String vaga, LocalTime entrada, LocalTime saida, long horasEstacionado) {
        this.placa = placa;
        this.tipo = tipo;
        this.vaga = vaga;
        this.entrada = entrada;
        this.saida = saida;
        this.horasEstacionado = horasEstacionado;
    }

    public long getHorasEstacionado() {
        return horasEstacionado;
    }

    public void setHorasEstacionado(long horasEstacionado) {
        this.horasEstacionado = horasEstacionado;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }
    
    // Método para calcular horas estacionadas
    public long calcularHorasEstacionado() {
        
        if (entrada != null && saida != null) {
            long diffInSeconds = saida.toSecondOfDay() - entrada.toSecondOfDay();
            return diffInSeconds / 3600; // Converter para horas
        }
        return 0;
    }

    

}