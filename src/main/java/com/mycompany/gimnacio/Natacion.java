package com.mycompany.gimnacio;

public class Natacion extends CentroDeportivo {

    private double puntos;
    private boolean usaBarreraNariz;
    private int lap;
    private String especialidadEstilo;

    public Natacion() {
    }

    public Natacion(double puntos, boolean usaBarreraNariz, int lap, String especialidadEstilo,
            String disciplina, String deportista, String fechaNacimiento,
            String genero,  double estatura, double peso, int totalSeguidores) {
        super(disciplina, deportista, fechaNacimiento, genero, peso,
                estatura, totalSeguidores);
        this.puntos = puntos;
        this.usaBarreraNariz = usaBarreraNariz;
        this.lap = lap;
        this.especialidadEstilo = especialidadEstilo;
    }

    public String tiempoCalentamiento() {
        return "Calentar por 30 minutos";
    }

    public String tiempoEntrenamiento() {
        return "Entrenar solo 1 hora.";
    }

    //METODO PROPIO DE SUBCLASE
    public void vaALasOlimpiadas(int totalSeguidores) {
        if (totalSeguidores < 1000) {
            System.out.println( "Todavia no puede competir en las olimpiadas");
        } else {
            System.out.println("Ya puede competir en las olimpiadas");
        }
//        return totalSeguidores;
    }

    @Override
    public String imprime() {
        return super.imprime() + "\nPuntos: " + puntos + "\nUsa Barrera para la nariz: "
                + usaBarreraNariz + "\nLap consecutivas #: " + lap
                + "\nEstilo de preferencia: " + especialidadEstilo;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public boolean isUsaBarreraNariz() {
        return usaBarreraNariz;
    }

    public void setUsaBarreraNariz(boolean usaBarreraNariz) {
        this.usaBarreraNariz = usaBarreraNariz;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public String getEspecialidadEstilo() {
        return especialidadEstilo;
    }

    public void setEspecialidadEstilo(String especialidadEstilo) {
        this.especialidadEstilo = especialidadEstilo;
    }
    
    

}
