package es.uah.alCine.API.dao.Artistas;

import java.util.List;
import es.uah.alCine.API.model.Artista;
import org.springframework.data.repository.query.Param;

public interface IArtistasDAO {
    List<Artista> getArtistas();
    Artista getArtistaPorId(Integer idArtista);
    boolean insertArtista(Artista artistas);
    boolean updateArtista(Artista artistas);
    boolean deleteArtista(int idArtistas);
    List<Artista> getActores();
    List<Artista> getDirectores();
    Integer getArtistaPelicula(Integer idArtista);


}
