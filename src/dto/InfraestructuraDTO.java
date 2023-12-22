
package dto;

public class InfraestructuraDTO {
    
    private int idInfraestructura;
    private String pabellon;
    private String admicion;
    private String box;
    private String maternidad;
    private String uti;
    private String uci;
    private String morgue;
    private String salaEspera;
    private String salaDesecho;

    public int getIdInfraestructura() {
        return idInfraestructura;
    }

    public void setIdInfraestructura(int idInfraestructura) {
        this.idInfraestructura = idInfraestructura;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public String getAdmicion() {
        return admicion;
    }

    public void setAdmicion(String admicion) {
        this.admicion = admicion;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getMaternidad() {
        return maternidad;
    }
   
    public void setMaternidad(String maternidad) {
        this.maternidad = maternidad;
    }

    public String getUti() {
        return uti;
    }

    public void setUti(String uti) {
        this.uti = uti;
    }

    public String getUci() {
        return uci;
    }

    public void setUci(String uci) {
        this.uci = uci;
    }

    public String getMorgue() {
        return morgue;
    }

    public void setMorgue(String morgue) {
        this.morgue = morgue;
    }

    public String getSalaEspera() {
        return salaEspera;
    }

    public void setSalaEspera(String salaEspera) {
        this.salaEspera = salaEspera;
    }

    public String getSalaDesecho() {
        return salaDesecho;
    }

    public void setSalaDesecho(String salaDesecho) {
        this.salaDesecho = salaDesecho;
    }

    @Override
    public String toString() {
        return "InfraestructuraDTO{" + "idInfraestructura=" + idInfraestructura + ", pabellon=" + pabellon + ", admicion=" + admicion + ", box=" + box + ", maternidad=" + maternidad + ", uti=" + uti + ", uci=" + uci + ", morgue=" + morgue + ", salaEspera=" + salaEspera + ", salaDesecho=" + salaDesecho + '}';
    }    
}
