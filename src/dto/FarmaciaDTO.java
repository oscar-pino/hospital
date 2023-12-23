
package dto;

public class FarmaciaDTO {
    
    private int idFarmacia;
    private String nombreProducto;
    private String descripcionProducto;
    private String proveedor;
    private int unidades;
    private float precio;
    private String farmaceutico;
    private String registroReceta;

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        
        if(unidades < 0)
            this.unidades = 0;
        else
            this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(String farmaceutico) {
        this.farmaceutico = farmaceutico;
    }
    
    public String getRegistroReceta() {
        return registroReceta;
    }

    public void setRegistroReceta(String registroReceta) {
        this.registroReceta = registroReceta;
    }

    @Override
    public String toString() {
        return "FarmaciaDTO{" + "idFarmacia=" + idFarmacia + ", nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto + ", proveedor=" + proveedor + ", unidad=" + unidades + ", precio=" + precio + ", farmaceutico=" + farmaceutico + ", registroReceta=" + registroReceta + '}';
    }    
}
