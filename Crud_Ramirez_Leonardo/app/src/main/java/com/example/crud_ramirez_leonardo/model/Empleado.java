package com.example.crud_ramirez_leonardo.model;

public class Empleado {
    private Long id;
    private String nombre;
    private String password;
    private String email;

    public Empleado(){

    }
    public Empleado(Long id, String nombre, String password, String email){
        this.id=id;
        this.nombre=nombre;
        this.password=password;
        this.email=email;
            }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getnombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString(){
        return "Empleados{"+
                "id="+ id +
                ", nombre=" + nombre + '\''+
                ", password=" + password + '\'' +
                ", email=" + email +'\''  +
                '}';
    }


}
