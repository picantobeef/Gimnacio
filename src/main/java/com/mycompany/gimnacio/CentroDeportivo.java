package com.mycompany.gimnacio;

abstract class CentroDeportivo {

    private String disciplina;
    private String deportista;
    private String fechaNacimiento;
    private String genero;
    private double peso;
    private double estatura;
    private int totalSeguidores;

    public CentroDeportivo() {
    }

    public CentroDeportivo(String disciplina, String deportista,
            String fechaNacimiento, String genero, double peso,
            double estatura, int totalSeguidores) {
        this.disciplina = disciplina;
        this.deportista = deportista;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
        this.totalSeguidores = totalSeguidores;
    }

    public String imprime() {
        return "\n***Información de Interes***: " + "\nDisciplina: " + disciplina
                + "\n Deportista: " + deportista
                + "\n Fecha de Nacimiento: " + fechaNacimiento + "\n Género: "
                + genero + "\n Estatura: " + estatura
                + "\n Peso: " + peso
                + "\n Total de seguidores: " + totalSeguidores;

    }

    abstract String tiempoCalentamiento();

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDeportista() {
        return deportista;
    }

    public void setDeportista(String deportista) {
        this.deportista = deportista;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getTotalSeguidores() {
        return totalSeguidores;
    }

    public void setTotalSeguidores(int totalSeguidores) {
        this.totalSeguidores = totalSeguidores;
    }

}
