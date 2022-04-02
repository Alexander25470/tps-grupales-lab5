/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_grupo_4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class TP1_GRUPO_4 {

    /**
     * @param args the command line arguments
     */
    private static void imprimirSeparador(){
        System.out.println("--------------------------------------------------------------------------");
    }
    private static void imprimirSeparador2(){
        System.out.println("**************************************************************************");
    }
    public static void main(String[] args) {
        //---------------------------------
        //Recital
        //---------------------------------
        
        // Categorias bandas
        CategoriaRecital catRecitalVip = new CategoriaRecital("vip");
        CategoriaRecital catRecitalNoVip = new CategoriaRecital("NO vip");
        
        // Bandas de soporte
        Banda bandaSoporte1 = new Banda("Banda soporte 1");
        Banda bandaSoporte2 = new Banda("Banda soporte 2");
        List<Banda> bandasSoporte = new ArrayList<>();
        bandasSoporte.add(bandaSoporte1);
        bandasSoporte.add(bandaSoporte2);
        
        //---------------------------------
        // Banda
        //---------------------------------
        Banda banda = new Banda("banda 1", bandasSoporte);
        
        // Evento Recital
        Evento eventoRecitalVip = new EntradaRecital(catRecitalVip, banda, "Recital Vip Banda 1", LocalDateTime.parse("2022-05-05T22:50:00"), 5);
        Evento eventoRecitalNoVip = new EntradaRecital(catRecitalNoVip, banda, "Recital NO Vip Banda 1", LocalDateTime.parse("2022-05-06T22:50:00"), 5);

        imprimirSeparador();
        System.out.println(eventoRecitalVip.toString());
        System.out.println(eventoRecitalNoVip.toString());
        imprimirSeparador();
        
        // Entrada Infantil
        Evento eventoInfantil = new EntradaInfantil(true,"Evento infantil 1",LocalDateTime.parse("2022-06-01T10:50:00"),5,8);
        Evento eventoInfantil2 = new EntradaInfantil(false,"Evento infantil 2",LocalDateTime.parse("2022-06-02T10:50:00"),5,9);
        
        imprimirSeparador();
        System.out.println(eventoInfantil.toString());
        System.out.println(eventoInfantil2.toString());    
        imprimirSeparador();
        
        //---------------------------------
        // Teatro
        //---------------------------------
        // Genero teatro
        GeneroTeatral generoDrama = new GeneroTeatral("drama");
        GeneroTeatral generoTeatro = new GeneroTeatral("teatro");
        GeneroTeatral generoComedia = new GeneroTeatral("comedia");
        
        // Actores
        Actor actor1 = new Actor("Actor 1");
        Actor actor2 = new Actor("Actor 2");
        Actor actor3 = new Actor("Actor 3");

        List<Actor> actoresPrincipales = new ArrayList<>();
        actoresPrincipales.add(actor1);
        actoresPrincipales.add(actor2);
        actoresPrincipales.add(actor3);
        
        // Entrada Teatro
        Evento eventoTeatroDrama = new EntradaTeatro(generoDrama,actoresPrincipales,"Evento teatro drama",LocalDateTime.parse("2022-05-05T22:50:00"), 5);
        Evento eventoTeatroTeatro = new EntradaTeatro(generoTeatro,actoresPrincipales,"Evento teatro teatro",LocalDateTime.parse("2022-05-05T22:50:00"), 5);
        Evento eventoComedia = new EntradaTeatro(generoComedia,actoresPrincipales,"Evento teatro comedia",LocalDateTime.parse("2022-05-05T22:50:00"), 5);

        imprimirSeparador();
        System.out.println(eventoTeatroDrama.toString());
        System.out.println(eventoTeatroTeatro.toString());
        System.out.println(eventoComedia.toString());
        imprimirSeparador();
        // Deportes
        
        // Clasificacion deporte
        Clasificacion clasificacionInternacional = new Clasificacion("Internacional");
        Clasificacion clasificacionNacional = new Clasificacion("Nacional");
        
        // Deportes
        Deporte futbol = new Deporte("futbol", clasificacionInternacional);
        Deporte futbolNac = new Deporte("futbol", clasificacionNacional);
        Deporte rugby = new Deporte("rugby", clasificacionInternacional);
        Deporte rugbyNac = new Deporte("rugby", clasificacionNacional);
        Deporte hockey = new Deporte("hockey", clasificacionInternacional);
        Deporte hockeyNac = new Deporte("hockey", clasificacionNacional);
        
        // Entrada Deporte
        
        // Futbol
        Evento entradaFutbol = new EntradaDeporte(futbol, "partido futbol INTERNACIONAL",LocalDateTime.parse("2022-05-05T22:50:00"), 2);
        Evento entradaFutbolNac = new EntradaDeporte(futbolNac, "partido futbol NACIONAL",LocalDateTime.parse("2022-05-05T22:50:00"), 2);
        
        imprimirSeparador2();
        System.out.println(entradaFutbol.toString());
        System.out.println(entradaFutbolNac.toString());
        imprimirSeparador2();
        // Rugby
        Evento entradaRugby = new EntradaDeporte(rugby, "partido rugby INTERNACIONAL",LocalDateTime.parse("2022-05-05T22:50:00"), 2);
        Evento entradaRugbyNac = new EntradaDeporte(rugbyNac, "partido rugby NACIONAL",LocalDateTime.parse("2022-05-05T22:50:00"), 2);
        
        imprimirSeparador2();
        System.out.println(entradaRugby.toString());
        System.out.println(entradaRugbyNac.toString());
        imprimirSeparador2();
        
        // Hockey
        Evento entradaHockey = new EntradaDeporte(hockey, "partido hockey INTERNACIONAL",LocalDateTime.parse("2022-05-05T22:50:00"), 2);
        Evento entradaHockeyNac = new EntradaDeporte(hockeyNac, "partido hockey NACIONAL",LocalDateTime.parse("2022-05-05T22:50:00"), 2);
        
        imprimirSeparador2();
        System.out.println(entradaHockey.toString());
        System.out.println(entradaHockeyNac.toString());
        imprimirSeparador2();
        
    }
    
    
}
