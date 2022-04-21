package com.formacion.nttdata.pokedex.dto;

public class PokemonDto {
private String nombre;
private String statClave;
private String imagen;

 public PokemonDto() {
super();
}

 public String getNombre() {
return nombre;
}

 public void setNombre(String nombre) {
this.nombre = nombre;
}

 public String getStatClave() {
return statClave;
}

 public void setStatClave(String statClave) {
this.statClave = statClave;
}

 public String getImagen() {
return imagen;
}

 public void setImagen(String imagen) {
this.imagen = imagen;
}
}