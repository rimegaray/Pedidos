package model;
// Generated 20/06/2020 07:57:02 PM by Hibernate Tools 4.3.1



/**
 * Promocion generated by hbm2java
 */
public class Promocion  implements java.io.Serializable {


     private int idPromocion;
     private String codigo;

    public Promocion() {
    }

    public Promocion(int idPromocion, String codigo) {
       this.idPromocion = idPromocion;
       this.codigo = codigo;
    }
   
    public int getIdPromocion() {
        return this.idPromocion;
    }
    
    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }




}

