import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Traductor {
    private  String textoEntrada;
    private Idioma lenguajeEntrada;
    private Idioma lenguajeSalida;
    private Dialecto dialecto;
    private String contexto;
    private Feedback feedback;
    private String textoSalida;
    private ModeloAprendizaje modeloAprendizaje;


    public Traductor(String textoEntrada, Idioma lenguajeEntrada, Dialecto dialecto, Idioma lenguajeSalida, String contexto) {
        this.textoEntrada = textoEntrada;
        this.lenguajeEntrada = lenguajeEntrada;
        this.dialecto = dialecto;
        this.lenguajeSalida = lenguajeSalida;
        this.contexto = contexto;



    }

    public String getTextoEntrada() {
        return textoEntrada;
    }

    public void setTextoEntrada(String textoEntrada) {
        this.textoEntrada = textoEntrada;
    }

    public Idioma getLenguajeEntrada() {
        return lenguajeEntrada;
    }

    public void setLenguajeEntrada(Idioma lenguajeEntrada) {
        this.lenguajeEntrada = lenguajeEntrada;
    }

    public Idioma getLenguajeSalida() {
        return lenguajeSalida;
    }

    public void setLenguajeSalida(Idioma lenguajeSalida) {
        this.lenguajeSalida = lenguajeSalida;
    }

    public Dialecto getDialecto() {
        return dialecto;
    }

    public void setDialecto(Dialecto dialecto) {
        this.dialecto = dialecto;
    }

    public String getContexto() {
        return contexto;
    }

    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public String getTextoSalida() {
        return textoSalida;
    }

    public void setTextoSalida(String textoSalida) {
        this.textoSalida = this.textoSalida;
    }
    public String traducir(String textoEntrada, Idioma lenguajeEntrada, Idioma lenguajeSalida){
        String comentarioFeedback;

        //aca implementamos la logica con el hasmap
        Map<String,String> mapaIdioma= new HashMap<>();


        mapaIdioma.put("hola", "hello");
        mapaIdioma.put("como", "how");
        mapaIdioma.put("estás", "are you");
        mapaIdioma.put("oe", "hello");
        mapaIdioma.put("el", "the");
        mapaIdioma.put("perro", "dog");
        mapaIdioma.put("es", "is");
        mapaIdioma.put("bonito", "beautiful");
        mapaIdioma.put("gato", "cat");
        mapaIdioma.put("pájaro", "bird");
        mapaIdioma.put("feo", "ugly");
        mapaIdioma.put("comiendo", "eating");
        mapaIdioma.put("caminando", "walking");
        mapaIdioma.put("con", "with");
        mapaIdioma.put("está", "is");
        mapaIdioma.put("agua", "water");
        mapaIdioma.put("sol", "sun");
        mapaIdioma.put("luna", "moon");
        mapaIdioma.put("casa", "house");
        mapaIdioma.put("carro", "car");
        mapaIdioma.put("escuela", "school");
        mapaIdioma.put("libro", "book");
        mapaIdioma.put("playa", "beach");
        mapaIdioma.put("montaña", "mountain");
        mapaIdioma.put("cielo", "sky");
        mapaIdioma.put("nube", "cloud");
        mapaIdioma.put("jardín", "garden");
        mapaIdioma.put("familia", "family");
        mapaIdioma.put("amigo", "friend");
        mapaIdioma.put("fiesta", "party");
        mapaIdioma.put("campo", "field");



        StringBuilder texto= new StringBuilder();
        String palabras[]= textoEntrada.split(" ");
        for (String palabra : palabras) {
            String palabraTraducida = mapaIdioma.getOrDefault(palabra.toLowerCase(), palabra);
            texto.append(palabraTraducida).append(" ");

        }
        JOptionPane.showMessageDialog(null,"La traduccion del texto es\n"+texto.toString().trim());
        textoSalida=texto.toString().trim();
        System.out.println("El texto de entrada es : "+ textoEntrada);
        System.out.println("La traducción es: "+texto.toString().trim());



        int opcion = JOptionPane.showConfirmDialog(null, "¿Tienes algún comentario para el feedback?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            comentarioFeedback=JOptionPane.showInputDialog("Ingresa tu feedback");

            feedback= new Feedback(comentarioFeedback,this);

           modeloAprendizaje= new ModeloAprendizaje(feedback);


            System.out.println("El comentario del feedback es:  "+feedback.getComentario());




        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("Me alegra que no tengas comentarios cahooo");
        }else {
            System.out.println("El usuario ha cancelado la operación.");
        }
        return "";
    }

}
