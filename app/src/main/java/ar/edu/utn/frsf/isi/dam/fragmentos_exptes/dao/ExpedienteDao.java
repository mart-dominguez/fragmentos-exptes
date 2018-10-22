package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Expediente;
import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.ExpedienteConPases;

@Dao
public interface ExpedienteDao {
    @Insert
    public void crear(Expediente... expte);
    @Update
    public void actualizar(Expediente... expte);
    @Delete
    public void borrar(Expediente... expte);

    @Query("SELECT * FROM Expediente WHERE id = :id")
    public Expediente buscarPorId(int id);

    @Query("SELECT * FROM Expediente WHERE id = :id")
    public ExpedienteConPases buscarPorIdConPases(int id);

    @Query("SELECT * FROM Expediente ")
    public List<Expediente> buscarTodos();

    @Query("SELECT * FROM Expediente ")
    public List<ExpedienteConPases> buscarTodosConPase();

}
