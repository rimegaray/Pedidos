package model;
// Generated 20/06/2020 07:57:02 PM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private String nombre;
     private int precio;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int precio) {
       this.idProducto = idProducto;
       this.nombre = nombre;
       this.precio = precio;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }




}

