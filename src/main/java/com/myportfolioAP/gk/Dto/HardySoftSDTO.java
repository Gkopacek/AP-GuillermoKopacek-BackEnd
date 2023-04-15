
package com.myportfolioAP.gk.Dto;

import javax.validation.constraints.NotBlank;


public class HardySoftSDTO {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String img;



    /*    public HardySoftSDTO(String nombre, int porcentaje, String img) {
    this.nombre = nombre;
    System.out.println("int");
    this.porcentaje = porcentaje;
    this.img = img;
    }*/
    
    /*   public HardySoftSDTO(String nombre, String porcentaje, String img) {
    this.nombre = nombre;
    System.out.println("string");
    this.porcentaje = Integer.parseInt(porcentaje);
    this.img = img;
    }*/

    /*public */
    
    /*        public HardySoftSDTO(String nombre, int porcentaje, String img) {
    this.nombre = nombre;
    System.out.println("entro al constructor de int");
    this.porcentaje = porcentaje;
    this.img = img;
    }*/
    
    public HardySoftSDTO(String nombre, String porcentaje, String img) {
            try {
                this.nombre = nombre;
                System.out.println("entro al constructor de String");
                this.porcentaje = Integer.parseInt(porcentaje);
                this.img = img;
            } catch (Exception e) {
                System.out.println("error:" + e);
                this.porcentaje = 101;
            }       
    }
    
    /*            public HardySoftSDTO(){
    System.out.println("entro al constructor por defecto");
    }
    
    public HardySoftSDTO(final HardySoftSDTO hys){
    System.out.println("entro al constructor del objeto");
    }
    */
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    } 
    
}
