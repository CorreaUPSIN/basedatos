package Modelo;

import android.database.Cursor;

import com.example.basedatos.AlumnoItem;

import java.util.ArrayList;

public interface Proyeccion {
    public AlumnoItem getAlumno(String matricula);
    public ArrayList<AlumnoItem> allAlumnos();
    public AlumnoItem readAlumno(Cursor cursor);
}
