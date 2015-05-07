package unit8;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public abstract class Persona 
{
    protected String nombre;
    protected String dni;
    protected ArrayList<Asignatura> asignatura;
    public Persona(String nombre,String dni)
    {
    }
    public static void anyadirAsignatura(Asignatura a)
    {
    }
    public boolean esProfesor()
    {
        return true;
    }
    public void mostrarListadoAsignaturasNota()
    {
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Asignatura> getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(ArrayList<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }
    public void ordenarPorAsignaturas()
    {
    }
    public void ordenarPorNota()
    {
    }
    
}
