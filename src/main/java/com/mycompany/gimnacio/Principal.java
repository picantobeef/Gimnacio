package com.mycompany.gimnacio;

/**
 * Parcial 1
 *
 * @author scont
 */
public class Principal {

    public static void main(String[] args) {

        int totalSeguidores = 0;

        CentroDeportivo miDeportista[] = new CentroDeportivo[4];

        Natacion nadador1 = new Natacion();
        Natacion nadador2 = new Natacion();
        Boxeo boxeador1 = new Boxeo(); 
        Boxeo boxeador2 = new Boxeo();

        nadador1.setDisciplina("Natacion");
        nadador1.setDeportista("Carlos Jimenez");
        nadador1.setEstatura(177.00);
        nadador1.setFechaNacimiento("19/Mar/1997");
        nadador1.setGenero("Masculino");
        nadador1.setPeso(87.5);
        nadador1.setPuntos(77);
        nadador1.setTotalSeguidores(1320);
        nadador1.setEspecialidadEstilo("Pecho");
        nadador1.setUsaBarreraNariz(true);
        nadador1.setLap(6);

        miDeportista[0] = new Natacion(nadador1.getPuntos(),
                nadador1.isUsaBarreraNariz(),
                nadador1.getLap(), nadador1.getEspecialidadEstilo(),
                nadador1.getDisciplina(), nadador1.getDeportista(),
                nadador1.getFechaNacimiento(), nadador1.getGenero(),
                nadador1.getEstatura(), nadador1.getPeso(),
                nadador1.getTotalSeguidores());

        nadador2.setDisciplina("Natacion");
        nadador2.setDeportista("Roberta Castro");
        nadador2.setEstatura(170.00);
        nadador2.setFechaNacimiento("16/Set/2000");
        nadador2.setGenero("Femenino");
        nadador2.setPeso(55.8);
        nadador2.setPuntos(61);
        nadador2.setTotalSeguidores(572);
        nadador2.setEspecialidadEstilo("Mariposa");
        nadador2.setUsaBarreraNariz(true);
        nadador2.setLap(8);

        miDeportista[1] = new Natacion(nadador2.getPuntos(),
                nadador2.isUsaBarreraNariz(),
                nadador2.getLap(), nadador2.getEspecialidadEstilo(),
                nadador2.getDisciplina(), nadador2.getDeportista(),
                nadador2.getFechaNacimiento(), nadador2.getGenero(),
                nadador2.getEstatura(), nadador2.getPeso(),
                nadador2.getTotalSeguidores());

        boxeador1.setDisciplina("Boxeo");
        boxeador1.setDeportista("Ramses Escobar");
        boxeador1.setEstatura(163.00);
        boxeador1.setFechaNacimiento("21/Mar/2007");
        boxeador1.setGenero("Masculino");
        boxeador1.setPeso(45.1);
        boxeador1.setTotalSeguidores(986);
        boxeador1.setRound(6);

        miDeportista[2] = new Boxeo(boxeador1.getRound(), boxeador1.getDisciplina(),
                boxeador1.getDeportista(),
                boxeador1.getFechaNacimiento(), boxeador1.getGenero(),
                boxeador1.getEstatura(), boxeador1.getPeso(),
                boxeador1.getTotalSeguidores());

        boxeador2.setDisciplina("Boxeo");
        boxeador2.setDeportista("Lucia Torres");
        boxeador2.setEstatura(161.00);
        boxeador2.setFechaNacimiento("30/Abr/2001");
        boxeador2.setGenero("Femenino");
        boxeador2.setPeso(61.4);
        boxeador2.setTotalSeguidores(30001);
        boxeador2.setRound(10);

        miDeportista[3] = new Boxeo(boxeador2.getRound(), boxeador2.getDisciplina(),
                boxeador2.getDeportista(),
                boxeador2.getFechaNacimiento(), boxeador2.getGenero(),
                boxeador2.getEstatura(), boxeador2.getPeso(),
                boxeador2.getTotalSeguidores());

        for (CentroDeportivo x : miDeportista) {
            System.out.println(x.imprime());
        }

        System.out.println("\n***INFORMACION ADICIONAL***");
        System.out.println(nadador1.getDeportista() + ": "
                + nadador1.tiempoCalentamiento() + " y " + nadador1.tiempoEntrenamiento());
        System.out.println(boxeador2.getDeportista() + ": "
                + boxeador2.tiempoCalentamiento() + " y " + boxeador2.tiempoEntrenamiento());
        System.out.println(nadador2.getDeportista() + ": "
                + nadador2.tiempoCalentamiento() + " y " + nadador2.tiempoEntrenamiento());
        System.out.println(boxeador1.getDeportista() + ": "
                + boxeador1.tiempoCalentamiento() + " y " + boxeador1.tiempoEntrenamiento());

        System.out.println("");
        System.out.println(nadador1.getDeportista() + ": ");
        nadador1.vaALasOlimpiadas(nadador1.getTotalSeguidores());
        System.out.println(nadador2.getDeportista() + ": ");
        nadador2.vaALasOlimpiadas(nadador2.getTotalSeguidores());

        System.out.println("");
        System.out.println(boxeador1.getDeportista() + ": ");
        boxeador1.haSidoNoqueado(0);
        System.out.println(boxeador2.getDeportista() + ": ");
        boxeador2.haSidoNoqueado(4);

    }

}
