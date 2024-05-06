public class Latinoamericano extends Dialecto{
    private  String influenciaIndigena;

    public Latinoamericano(String nombreIdioma, String gramatica, String vocabulario, String nombre, String acento, String jerga, String expresionesIidomaticas, String referenciasCulturales, String region, String influenciaIndigena) {
        super(nombreIdioma, gramatica, vocabulario, nombre, acento, jerga, expresionesIidomaticas, referenciasCulturales, region);
        this.influenciaIndigena = influenciaIndigena;
    }

}
