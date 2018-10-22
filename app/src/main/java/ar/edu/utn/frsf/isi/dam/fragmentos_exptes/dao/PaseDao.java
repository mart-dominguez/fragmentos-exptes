package ar.edu.utn.frsf.isi.dam.fragmentos_exptes.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.fragmentos_exptes.modelo.Pase;

@Dao
public interface PaseDao {
    @Insert
    public void crear(Pase... expte);
    @Update
    public void actualizar(Pase... expte);
    @Delete
    public void borrar(Pase... expte);

    @Query("SELECT * FROM Pase WHERE id = :id")
    public Pase buscarPorId(int id);

    @Query("SELECT * FROM Pase WHERE idExpediente = :pIdExpte")
    public List<Pase> buscarPorExpediente(int pIdExpte);

}
