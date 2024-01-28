package es.uah.alCine.API.service.artistas;

import java.util.List;

import es.uah.alCine.API.dto.artistas.ArtistasDto;
import es.uah.alCine.API.dto.shared.ResponseDto;
import es.uah.alCine.API.model.Artista;

public interface IArtistasService {
    List<ArtistasDto> getArtista();
    ArtistasDto getArtistaPorId(Integer idArtista);
    ResponseDto insertArtista(ArtistasDto artista);
    ResponseDto updateArtista(ArtistasDto artista);
    ResponseDto deleteArtista(int idArtista);
    List<ArtistasDto> getActores();
    List<ArtistasDto> getDirectores();

}
