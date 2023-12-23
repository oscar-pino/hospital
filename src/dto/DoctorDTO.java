
package dto;

public class DoctorDTO {
    
    private int idDoctor;
    private RecaudacionDTO recaudacion;
    private FarmaciaDTO farmacia;
    private String nombre;
    private String apellido;
    private String cargo;
    private String direccion;
    private float horastrabajadas;
    private float horasExtras;
    private float sueldoBase;
    private PrevisionDTO prevision; 

    public int getIdDoctor() {
        return idDoctor;
    }

   
    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }
    
    public RecaudacionDTO getRecaudacion() {
        return recaudacion;
    }
    
    public void setRecaudacion(RecaudacionDTO recaudacion) {
        this.recaudacion = recaudacion;
    }
    
    public FarmaciaDTO getFarmacia() {
        return farmacia;
    }
    
    public void setFarmacia(FarmaciaDTO farmacia) {
        this.farmacia = farmacia;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getHorastrabajadas() {
        return horastrabajadas;
    }
    
    public void setHorastrabajadas(float horastrabajadas) {
        
        if(horastrabajadas < 0)
            this.horastrabajadas = 0;
        else
            this.horastrabajadas = horastrabajadas;
    }
    
    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        
        if(horasExtras < 0)
            this.horasExtras = 0;
        else
            this.horasExtras = horasExtras;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }    

    public PrevisionDTO getPrevision() {
        return prevision;
    }

    public void setPrevision(PrevisionDTO prevision) {
        this.prevision = prevision;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" + "idDoctor=" + idDoctor + ", recaudacion=" + recaudacion + ", farmacia=" + farmacia + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", direccion=" + direccion + ", horastrabajadas=" + horastrabajadas + ", horasExtras=" + horasExtras + ", sueldoBase=" + sueldoBase + ", prevision => [ idPrevision=" + prevision.getIdPrevision() + ", tipo=" + prevision.getTipo() + "]}";
    }    
}
