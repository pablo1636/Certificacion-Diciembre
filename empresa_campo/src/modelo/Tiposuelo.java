package modelo;
// Generated 12/12/2018 16:48:23 by Hibernate Tools 4.3.1



/**
 * Tiposuelo generated by hbm2java
 */
public class Tiposuelo  implements java.io.Serializable {


     private Integer idTiposuelo;
     private String nombreTiposuelo;
     private String caracteristicasTiposuelo;
     private String observacionTiposuelo;

    public Tiposuelo() {
    }

	
    public Tiposuelo(String observacionTiposuelo) {
        this.observacionTiposuelo = observacionTiposuelo;
    }
    public Tiposuelo(String nombreTiposuelo, String caracteristicasTiposuelo, String observacionTiposuelo) {
       this.nombreTiposuelo = nombreTiposuelo;
       this.caracteristicasTiposuelo = caracteristicasTiposuelo;
       this.observacionTiposuelo = observacionTiposuelo;
    }
   
    public Integer getIdTiposuelo() {
        return this.idTiposuelo;
    }
    
    public void setIdTiposuelo(Integer idTiposuelo) {
        this.idTiposuelo = idTiposuelo;
    }
    public String getNombreTiposuelo() {
        return this.nombreTiposuelo;
    }
    
    public void setNombreTiposuelo(String nombreTiposuelo) {
        this.nombreTiposuelo = nombreTiposuelo;
    }
    public String getCaracteristicasTiposuelo() {
        return this.caracteristicasTiposuelo;
    }
    
    public void setCaracteristicasTiposuelo(String caracteristicasTiposuelo) {
        this.caracteristicasTiposuelo = caracteristicasTiposuelo;
    }
    public String getObservacionTiposuelo() {
        return this.observacionTiposuelo;
    }
    
    public void setObservacionTiposuelo(String observacionTiposuelo) {
        this.observacionTiposuelo = observacionTiposuelo;
    }




}

