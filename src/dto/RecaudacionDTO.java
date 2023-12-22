
package dto;

public class RecaudacionDTO {
    
    private int idRecaudacion;
    private PacienteDTO paciente;
    private InfraestructuraDTO infracestructura;
    private int runPaciente;
    private String isapre;
    private String fonasa;
    private String horaIngreso;
    private String especialidad;
    private String tipoGravedad;
    private String unidadHospitalaria;

    public int getIdRecaudacion() {
        return idRecaudacion;
    }

    public void setIdRecaudacion(int idRecaudacion) {
        this.idRecaudacion = idRecaudacion;
    }

    public PacienteDTO getPaciente() {
        return paciente;
    }
    
    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }

    public InfraestructuraDTO getInfracestructura() {
        return infracestructura;
    }

    public void setInfracestructura(InfraestructuraDTO infracestructura) {
        this.infracestructura = infracestructura;
    }

    public int getRunPaciente() {
        return runPaciente;
    }

    public void setRunPaciente(int runPaciente) {
        this.runPaciente = runPaciente;
    }

    public String getIsapre() {
        return isapre;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    public String getFonasa() {
        return fonasa;
    }

    public void setFonasa(String fonasa) {
        this.fonasa = fonasa;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipoGravedad() {
        return tipoGravedad;
    }

    public void setTipoGravedad(String tipoGravedad) {
        this.tipoGravedad = tipoGravedad;
    }

    public String getUnidadHospitalaria() {
        return unidadHospitalaria;
    }

    public void setUnidadHospitalaria(String unidadHospitalaria) {
        this.unidadHospitalaria = unidadHospitalaria;
    }

    @Override
    public String toString() {
        return "RecaudacionDTO{" + "idRecaudacion=" + idRecaudacion + ", paciente=" + paciente + ", infracestructura=" + infracestructura + ", runPaciente=" + runPaciente + ", isapre=" + isapre + ", fonasa=" + fonasa + ", horaIngreso=" + horaIngreso + ", especialidad=" + especialidad + ", tipoGravedad=" + tipoGravedad + ", unidadHospitalaria=" + unidadHospitalaria + '}';
    }   
}
