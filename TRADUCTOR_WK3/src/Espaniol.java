public class Espaniol extends Idioma {
    private String clasificacionGenero;

    public Espaniol(String nombreIdioma, String gramatica, String vocabulario, String clasificacionGenero) {
        super(nombreIdioma, gramatica, vocabulario);
        this.clasificacionGenero = clasificacionGenero;
    }

    @Override
    public String getGramatica() {
        return "se implementan las reglas gramaticales desde el español";
    }



    @Override
    public String getVocabulario() {
        return "se implementa el vocabulario desde el español";
    }



    @Override
    public String plicarRestricciones() {
        return "se aplican las restricciones para español";
    }

}
