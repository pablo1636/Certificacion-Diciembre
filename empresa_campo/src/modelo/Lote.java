package modelo;
// Generated 12/12/2018 16:48:23 by Hibernate Tools 4.3.1



/**
 * Lote generated by hbm2java
 */
public class Lote  implements java.io.Serializable {


     private Integer idLote;
     private String numeroLote;
     private int superficieLote;
     private int idTiposuelo;
     private int idCampo;
     private String observaciones;

    public Lote() {
    }

	
    public Lote(int superficieLote, int idTiposuelo, int idCampo, String observaciones) {
        this.superficieLote = superficieLote;
        this.idTiposuelo = idTiposuelo;
        this.idCampo = idCampo;
        this.observaciones = observaciones;
    }
    public Lote(String numeroLote, int superficieLote, int idTiposuelo, int idCampo, String observaciones) {
       this.numeroLote = numeroLote;
       this.superficieLote = superficieLote;
       this.idTiposuelo = idTiposuelo;
       this.idCampo = idCampo;
       this.observaciones = observaciones;
    }
   
    public Integer getIdLote() {
        return this.idLote;
    }
    
    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }
    public String getNumeroLote() {
        return this.numeroLote;
    }
    
    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
    public int getSuperficieLote() {
        return this.superficieLote;
    }
    
    public void setSuperficieLote(int superficieLote) {
        this.superficieLote = superficieLote;
    }
    public int getIdTiposuelo() {
        return this.idTiposuelo;
    }
    
    public void setIdTiposuelo(int idTiposuelo) {
        this.idTiposuelo = idTiposuelo;
    }
    public int getIdCampo() {
        return this.idCampo;
    }
    
    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


