package es.uah.alCine.API.dao.Artistas;

import org.springframework.data.jpa.repository.JpaRepository;
import es.uah.alCine.API.model.Artista;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IArtistasRepository extends JpaRepository<Artista, Integer> {
    List<Artista> findByTipoArtista_Id(Integer id);
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM PeliculaArtista WHERE pelicula.id = :idPelicula")
    void deletePeliculaArtistasByPeliculaId(int idPelicula);
    @Query("SELECT P.idArtista FROM VPeliculaArtista P WHERE P.idArtista = :idArtista")
    Integer findArtistaPelicula(@Param("idArtista") Integer idArtista);
}