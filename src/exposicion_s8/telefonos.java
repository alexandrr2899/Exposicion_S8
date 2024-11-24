/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_s8;

/**
 *
 * @author alexanderordonez
 */
public class telefonos {
    
    private String marca;
    private String modelo;
    private String procesador;
    private int almacenamiento;
    private int camara;
    private int ram;
 
    
    public telefonos(String marca, String modelo, String procesador, int almacenamiento, int camara, int ram) {

        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.camara = camara;
        this.ram = ram;
        
    }

    @Override
    public String toString() {
        return "\ntelefono "+marca+" "+modelo+"\n" 
                + "marca: " + marca 
                + "\nmodelo: " + modelo 
                + "\nprocesador: " + procesador 
                + "\nalmacenamiento: " + almacenamiento 
                + "\ncamara: " + camara 
                + "\nram: " + ram ;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
}


