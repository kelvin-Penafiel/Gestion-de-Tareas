package com.task.personal.repository;

import com.task.personal.Entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TareaRepository extends JpaRepository<TareaEntity, Long> {


    @Query("SELECT t FROM TareaEntity t WHERE t.usuario.idUsuario = :idUsuario")
    List<TareaEntity> findByUsuarioId(@Param("idUsuario") Long idUsuario);
}
