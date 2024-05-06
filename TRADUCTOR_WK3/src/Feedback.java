import javax.swing.*;

public class Feedback {
    private String comentario;
    private Traductor traductor;

    public Feedback(String comentario, Traductor traductor) {
        this.comentario = comentario;
        this.traductor = traductor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String traerTextoEntrada(){
        return traductor.getTextoEntrada();

    }
    public String traerIdiomaEntrada(){
        return traductor.getLenguajeEntrada().getNombreIdioma();

    }
    public String traerIdiomaSalida(){
        return traductor.getLenguajeSalida().getNombreIdioma();
    }


}
