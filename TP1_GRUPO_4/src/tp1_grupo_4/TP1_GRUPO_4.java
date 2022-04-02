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
    public static void main(String[] args) {
        // categorias bandas
        CategoriaRecital catRecitalVip = new CategoriaRecital("vip");
        CategoriaRecital catRecitalNoVip = new CategoriaRecital("NO vip");
        
        // bandas de soporte
        Banda bandaSoporte1 = new Banda("banda soporte 1");
        Banda bandaSoporte2 = new Banda("banda soporte 2");
        List<Banda> bandasSoporte = new ArrayList<>();
        bandasSoporte.add(bandaSoporte1);
        bandasSoporte.add(bandaSoporte2);
        
        // banda
        Banda banda = new Banda("banda 1", bandasSoporte);
        

        Evento eventoRecitalVip = new EntradaRecital(catRecitalVip, banda, "Recital Vip Banda 1", LocalDateTime.parse("2022-05-05T22:50:00"), 5);
        Evento eventoRecitalNoVip = new EntradaRecital(catRecitalNoVip, banda, "Recital NO Vip Banda 1", LocalDateTime.parse("2022-05-06T22:50:00"), 5);

        System.out.println(eventoRecitalVip.toString());
        System.out.println(eventoRecitalNoVip.toString());

    }
    
}
