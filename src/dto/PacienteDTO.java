
package dto;

public class PacienteDTO {
    
    private int idPaciente;
    private String nombre;
    private int edad;
    private String domicilio;
    private int peso;
    private int altura;
    private int numeroFono;
    private String historialClinico;
    private String sintoma;
    private String prestacion;

    public int getIdPaciente() {
        return idPaciente;
    }
    
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumeroFono() {
        return numeroFono;
    }

    public void setNumeroFono(int numeroFono) {
        this.numeroFono = numeroFono;
    }

    public String getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(String historialClinico) {
        this.historialClinico = historialClinico;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getPrestacion() {
        return prestacion;
    }

    public void setPrestacion(String prestacion) {
        this.prestacion = prestacion;
    }

    @Override
    public String toString() {
        return "PacienteDTO{" + "idPaciente=" + idPaciente + ", nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + ", peso=" + peso + ", altura=" + altura + ", numeroFono=" + numeroFono + ", historialClinico=" + historialClinico + ", sintoma=" + sintoma + ", prestacion=" + prestacion + '}';
    }    
}
