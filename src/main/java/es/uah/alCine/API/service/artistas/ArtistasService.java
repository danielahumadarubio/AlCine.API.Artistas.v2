package es.uah.alCine.API.service.artistas;

import es.uah.alCine.API.dao.Artistas.IArtistasDAO;
import es.uah.alCine.API.dto.artistas.ArtistasDto;
import es.uah.alCine.API.dto.shared.ResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import es.uah.alCine.API.model.Artista;

@Service
public class ArtistasService implements IArtistasService{
    @Autowired
    private IArtistasDAO _artistasDAO;
    private ModelMapper _modelMapper;

    public ArtistasService(ModelMapper modelMapper){
        _modelMapper = modelMapper;
    }
    @Override
    public List<ArtistasDto> getArtista() {
        List<Artista> artistas = _artistasDAO.getArtistas();
        return artistas.stream()
                .map(artista -> _modelMapper.map(artista, ArtistasDto.class))
                .collect(Collectors.toList());
    }
    @Override
    public ArtistasDto getArtistaPorId(Integer idArtista) {
       Artista artista = _artistasDAO.getArtistaPorId(idArtista);
        return (artista != null) ? _modelMapper.map(artista, ArtistasDto.class) : null;

    }
    @Override
    public ResponseDto insertArtista(ArtistasDto artista) {
        ResponseDto response = new ResponseDto();
        try{
        if (_artistasDAO.getArtistaPorId(artista.getId())==null) {
            _artistasDAO.insertArtista(_modelMapper.map(artista, Artista.class));
            response.setMensaje("Artista creado con exito");
        }
        }catch (Exception ex){
            response.setError(true);
            response.setMensaje("Ha surgido un error inesperado.");
        }
        return response;
    }
    @Override
    public ResponseDto updateArtista(ArtistasDto artista) {
        ResponseDto response = new ResponseDto();
        try{
        if (_artistasDAO.getArtistaPorId(artista.getId())!=null) {
            Artista artistaOld = _artistasDAO.getArtistaPorId(artista.getId());
            if(Objects.equals(artistaOld.getTipoArtista().getId(), artista.getTipoArtista().getId())) {
                _artistasDAO.updateArtista(_modelMapper.map(artista, Artista.class));
                response.setMensaje("Artista editado con exito");
            }else{
                if(_artistasDAO.getArtistaPelicula(artista.getId()) == null){
                    _artistasDAO.updateArtista(_modelMapper.map(artista, Artista.class));
                    response.setMensaje("Artista editado con exito");
                }else{
                    response.setMensaje("El artista tiene peliculas enlazada con el tipo de artista anterior. Modifique las peliculas");
                    response.setError(true);
                }
            }
            }
        }catch (Exception ex){
            response.setError(true);
            response.setMensaje("Ha surgido un error inesperado.");
        }
        return response;
    }
    @Override
    public ResponseDto deleteArtista(int idArtista) {
        ResponseDto response = new ResponseDto();
        try{
            if (_artistasDAO.getArtistaPorId(idArtista)!=null) {
                if(_artistasDAO.getArtistaPelicula(idArtista) == null){
                    response.setMensaje("Artista eliminado con exito");
                   _artistasDAO.deleteArtista(idArtista);
                }else{
                    response.setError(true);
                    response.setMensaje("El artista tiene aun peliculas. Elimine sus peliculas");
                }
            }
        }catch (Exception ex){
            response.setError(true);
            response.setMensaje("Ha surgido un error inesperado.");
        }

        return response;
    }
    @Override
    public List<ArtistasDto> getActores() {
        List<Artista> artistas = _artistasDAO.getActores();
        return artistas.stream()
                .map(artista -> _modelMapper.map(artista, ArtistasDto.class))
                .collect(Collectors.toList());
    }
    @Override
    public List<ArtistasDto> getDirectores() {
        List<Artista> artistas = _artistasDAO.getDirectores();
        return artistas.stream()
                .map(artista -> _modelMapper.map(artista, ArtistasDto.class))
                .collect(Collectors.toList());
    }
}
