public class Dialecto extends Idioma {
    private  String nombre;
    private String acento;
    private String jerga;
    private  String expresionesIidomaticas;
    private  String referenciasCulturales;
    private  String region;

    public Dialecto(String nombreIdioma, String gramatica, String vocabulario, String nombre, String acento, String jerga, String expresionesIidomaticas, String referenciasCulturales, String region) {
        super(nombreIdioma, gramatica, vocabulario);
        this.nombre = nombre;
        this.acento = acento;
        this.jerga = jerga;
        this.expresionesIidomaticas = expresionesIidomaticas;
        this.referenciasCulturales = referenciasCulturales;
        this.region = region;
    }

    @Override
    public String getGramatica() {
        return "se implementan las reglas gramaticales ";
    }
    //

    @Override
    public String getVocabulario() {
        return "se implementa el vocabulario";
    }
    //

    @Override
    public String plicarRestricciones() {
        return "aplicando restricciones";
    }
}
