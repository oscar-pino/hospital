
package dto;

public class DoctorDTO {
    
    private int idDoctor;
    private RecaudacionDTO recaudacion;
    private FarmaciaDTO farmacia;
    private String nombre;
    private String apellido;
    private String cargo;
    private String direccion;
    private int horastrabajadas;
    private int horasExtras;
    private int sueldoBase;
    private String afp;
    private String isapre;    

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

    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getIsapre() {
        return isapre;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" + "idDoctor=" + idDoctor + ", recaudacion=" + recaudacion + ", farmacia=" + farmacia + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", direccion=" + direccion + ", horastrabajadas=" + horastrabajadas + ", horasExtras=" + horasExtras + ", sueldoBase=" + sueldoBase + ", afp=" + afp + ", isapre=" + isapre + '}';
    }    
}
