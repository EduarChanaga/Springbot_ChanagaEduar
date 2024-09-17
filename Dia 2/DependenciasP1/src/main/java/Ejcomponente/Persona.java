package Ejcomponente;

import EJBean.SerVivo;

public class Persona  implements SerVivo {
    private String nombre;
    public Persona(String nombre) {
        this,nombre = nombre;
    }

    @Override
    public String caminar(){
        return "la persona esta caminando"
    }

    @Override
    public String toString(){
        
    }
}
