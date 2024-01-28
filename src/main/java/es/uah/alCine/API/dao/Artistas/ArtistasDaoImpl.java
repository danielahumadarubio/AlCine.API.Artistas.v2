package es.uah.alCine.API.dao.Artistas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import es.uah.alCine.API.model.Artista;

@Repository
public class ArtistasDaoImpl implements IArtistasDAO {
    @Autowired
    private IArtistasRepository _artistasRepository;
    @Override
    public List<Artista> getArtistas() {
        return _artistasRepository.findAll();
    }
    @Override
    public Artista getArtistaPorId(Integer idArtista) {
        Optional<Artista> optional = _artistasRepository.findById(idArtista);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
    @Override
    public boolean insertArtista(Artista artista) {
         _artistasRepository.save(artista);
        return true;
    }
    @Override
    public boolean updateArtista(Artista artista) {
        _artistasRepository.save(artista);
        return true;
    }
    @Override
    public boolean deleteArtista(int idArtista) {
        _artistasRepository.deletePeliculaArtistasByPeliculaId(idArtista);
        _artistasRepository.deleteById(idArtista);
        return true;
    }
    @Override
    public List<Artista> getActores() {
        return _artistasRepository.findByTipoArtista_Id(1);
    }
    @Override
    public List<Artista> getDirectores() {
        return _artistasRepository.findByTipoArtista_Id(3);
    }
    @Override
    public Integer getArtistaPelicula(Integer idArtista) {
        return _artistasRepository.findArtistaPelicula(idArtista);
    }
}
