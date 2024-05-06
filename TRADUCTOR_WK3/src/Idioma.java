public   class Idioma implements Restringible {
    private String nombreIdioma;
    private  String gramatica;
    private String vocabulario;

    public Idioma(String nombreIdioma, String gramatica, String vocabulario) {
        this.nombreIdioma = nombreIdioma;
        this.gramatica = gramatica;
        this.vocabulario = vocabulario;
    }

    public String getNombreIdioma() {
        return nombreIdioma;
    }

    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }





    public void setGramatica(String gramatica){
        this.gramatica=gramatica;
    }





    public  void setVocabulario(String vocabulario) {
        this.vocabulario=vocabulario;
    }


    @Override
    public String plicarRestricciones() {
        return "";
    }

    @Override
    public String getVocabulario() {
        return "";
    }

    @Override
    public String getGramatica() {
        return "";
    }
}
