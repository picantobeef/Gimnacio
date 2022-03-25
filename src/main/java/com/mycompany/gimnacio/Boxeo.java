package com.mycompany.gimnacio;

public class Boxeo extends CentroDeportivo {

    private int round;

    public Boxeo() {
    }

    public Boxeo(int round, String disciplina, String deportista,
            String fechaNacimiento, String genero, double estatura, double peso,
            int totalSeguidores) {
        super(disciplina, deportista, fechaNacimiento, genero, peso, estatura,
                totalSeguidores);
        this.round = round;
    }

    @Override
    public String imprime() {
        return super.imprime() + "\nMAXIMO NUMERO DE ROUNDS: " + round;
    }

    //METODO PROPIO DE SUBCLASE
    public boolean haSidoNoqueado(int cantidad) {
        boolean nockOut = false;
        if (cantidad > 1) {
            System.out.println("Si ha sido noqueado/a");
            nockOut = true;
        } else {
            System.out.println("No ha sido noqueado/a");
        }
        return nockOut;
    }

    public String tiempoCalentamiento() {
        return "Calentar por 30 minutos";
    }

    public String tiempoEntrenamiento() {
        return "Entrenar solo 45 minutos.";
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

}
