package es.uah.alCine.API.dto.shared;

public class ResponseDto {
    private Object data;
    private String mensaje;
    private boolean error;
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
