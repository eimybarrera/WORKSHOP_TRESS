public class Ingles  extends  Idioma{
    private String debilitamientoSubjuntivo;

    public Ingles(String nombreIdioma, String gramatica, String vocabulario, String debilitamientoSubjuntivo) {
        super(nombreIdioma, gramatica, vocabulario);
        this.debilitamientoSubjuntivo = debilitamientoSubjuntivo;
    }

    @Override
    public String getGramatica() {
        return "se implementan las reglas gramaticales desde el inglés";
    }

    @Override
    public String getVocabulario() {
        return "se implementa el vocabulario desde el inglés";
    }

    @Override
    public String plicarRestricciones() {
        return " se aplican las restricciones desde el Inglés";
    }
}
