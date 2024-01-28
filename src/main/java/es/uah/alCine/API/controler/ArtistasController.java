package es.uah.alCine.API.controler;
import es.uah.alCine.API.dto.artistas.ArtistasDto;
import es.uah.alCine.API.dto.shared.ResponseDto;
import es.uah.alCine.API.model.Artista;
import es.uah.alCine.API.model.Pelicula;
import es.uah.alCine.API.service.artistas.IArtistasService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ArtistasController {
    @Autowired
    private IArtistasService _artistasService;
    @GetMapping("/api/Artistas/getActores")
    public List<ArtistasDto> getActores() {
        return _artistasService.getActores();
    }
    @GetMapping("/api/Artistas/getArtistaById/{idArtista}")
    public ArtistasDto getPeliculaById(@PathVariable("idArtista")  Integer idArtista) {
        return _artistasService.getArtistaPorId(idArtista);
    }
    @GetMapping("/api/Artistas/getDirectores")
    public List<ArtistasDto> getDirectores() {
        return _artistasService.getDirectores();
    }
    @PostMapping("/api/Artistas")
    public ResponseDto guardarArtista(@RequestBody ArtistasDto artista) {
        return _artistasService.insertArtista(artista);
    }
    @DeleteMapping("/api/Artistas/{id}")
    public ResponseDto eliminarArtista(@PathVariable("id") Integer id) {
        return _artistasService.deleteArtista(id);
    }
    @PutMapping("/api/Artistas")
    public ResponseDto actualizarCurso(@RequestBody ArtistasDto artista) {
        return _artistasService.updateArtista(artista);
    }
}
