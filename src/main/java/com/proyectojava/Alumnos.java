
package com.proyectojava;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Idaira
 */
@Entity
@Table(name="alumnos")
public class Alumnos {
    
    @Id
    @Column(name="id_alumno")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idAlumno;
    private String apellidos;
    private String dni;
    private String estudios;
    private String nombre;

    public Alumnos() {
    }

    public Alumnos(String apellidos, String dni, String estudios, String nombre) {
        this.apellidos = apellidos;
        this.dni = dni;
        this.estudios = estudios;
        this.nombre = nombre;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getEstudios() {
        return estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "idAlumno=" + idAlumno + ", apellidos=" + apellidos + ", dni=" + dni + ", estudios=" + estudios + ", nombre=" + nombre + '}';
    }
    
    
}
