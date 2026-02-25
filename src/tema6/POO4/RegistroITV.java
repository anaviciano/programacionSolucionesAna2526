package tema6.POO4;

import tema6.Vehiculo;

import java.time.LocalDateTime;

class RegistroITV {
    private LocalDateTime momentoEntrada;
    private Transporte transporte;

    public RegistroITV(LocalDateTime momentoEntrada, Transporte transporte) {
        this.momentoEntrada = momentoEntrada;
        this.transporte = transporte;
    }

    @Override
    public String toString() {
        return "Momento de entrada: " + momentoEntrada + ", Transporte: " + transporte;
    }
}
