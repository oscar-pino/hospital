
package dto;

public class RecaudacionDTO {
    
    private int idRecaudacion;
    private PacienteDTO paciente;
    private InfraestructuraDTO infraestructura;
    private int runPaciente;    
    private String horaIngreso;
    private String especialidad;
    private String tipoGravedad;
    private String unidadHospitalaria;
    private PrevisionDTO prevision;

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

    public InfraestructuraDTO getInfraestructura() {
        return infraestructura;
    }

    public void setInfraestructura(InfraestructuraDTO infraestructura) {
        this.infraestructura = infraestructura;
    }

    public int getRunPaciente() {
        return runPaciente;
    }

    public void setRunPaciente(int runPaciente) {
        this.runPaciente = runPaciente;
    }

    public PrevisionDTO getPrevision() {
        return prevision;
    }

    public void setPrevision(PrevisionDTO prevision) {
        this.prevision = prevision;
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
        return "RecaudacionDTO{" + "idRecaudacion=" + idRecaudacion + ", paciente=" + paciente + ", infraestructura=" + infraestructura + ", runPaciente=" + runPaciente + ", prevision [idPrevision= " + prevision.getIdPrevision() + ", tipo= " + prevision.getTipo() + " ], horaIngreso=" + horaIngreso + ", especialidad=" + especialidad + ", tipoGravedad=" + tipoGravedad + ", unidadHospitalaria=" + unidadHospitalaria + '}';
    }   
}
