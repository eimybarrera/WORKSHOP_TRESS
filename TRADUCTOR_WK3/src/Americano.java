public class Americano extends Dialecto{
    private String influenciaBritanica;

    public Americano(String nombreIdioma, String gramatica, String vocabulario, String nombre, String acento, String jerga, String expresionesIidomaticas, String referenciasCulturales, String region, String influenciaBritanica) {
        super(nombreIdioma, gramatica, vocabulario, nombre, acento, jerga, expresionesIidomaticas, referenciasCulturales, region);
        this.influenciaBritanica = influenciaBritanica;
    }


}
