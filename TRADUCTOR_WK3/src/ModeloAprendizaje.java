public class ModeloAprendizaje {
    private Feedback feedback;


    public ModeloAprendizaje(Feedback feedback  ) {
        this.feedback = feedback;
    }



    public void entrenarModelo(){
        if (feedback == null) {
            System.out.println("No hay comentarios para entrenar el modelo.");
            return;
        }
        String mensaje = feedback.getComentario();
        if (mensaje.equals("")){
            System.out.println("el modelo no está aprendiendo");
        }else {
            if(!feedback.traerTextoEntrada().equals("") && feedback.traerIdiomaEntrada().equals("Español") && feedback.traerIdiomaSalida().equals("Ingles")){
                System.out.println("el modelo está aprendiendo de español a inglés");
            }
            else {
                if(!feedback.traerTextoEntrada().equals("") && feedback.traerIdiomaEntrada().equals("Ingles") && feedback.traerIdiomaSalida().equals("Español")){
                    System.out.println("el modelo está aprendiendo de inglés a español");
                }else {
                    System.out.println("Error al intentar  entrenar el modelo");
                }
            }

        }


    }

}
