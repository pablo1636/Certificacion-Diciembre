package modelo;
// Generated 12/12/2018 16:48:23 by Hibernate Tools 4.3.1



/**
 * Campo generated by hbm2java
 */
public class Campo  implements java.io.Serializable {


     private Integer idCampo;
     private String nombre;
     private Integer superficie;
     private Integer idEstado;

    public Campo() {
    }

    public Campo(String nombre, Integer superficie, Integer idEstado) {
       this.nombre = nombre;
       this.superficie = superficie;
       this.idEstado = idEstado;
    }
   
    public Integer getIdCampo() {
        return this.idCampo;
    }
    
    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
    public Integer getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }




}

