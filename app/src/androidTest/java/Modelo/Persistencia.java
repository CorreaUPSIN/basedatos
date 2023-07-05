package Modelo;

import com.example.basedatos.AlumnoItem;

public interface Persistencia {
    public void openDataBase();
    public void closeDataBase();
    public long insertAlumno(AlumnoItem alumno);
    public long updateAlumno(AlumnoItem alumno);
    public long deleteAlumno(int id);
}
