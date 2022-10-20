/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.franki.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.franki.entidades.Ingrediente;
import mx.itson.franki.entidades.Paso;
import mx.itson.franki.entidades.Receta;
import mx.itson.franki.entidades.Usuario;
import mx.itson.franki.enumerador.Dificultad;

/**
 *
 * @author carlo
 */
public class Main {
    public static void main(String[] args){
        
        
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setPorciones(6);
        receta.setDuracion(62);
        
        //se agregaron ingredientes
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
        //se agregaron pasos
        List<Paso> pasos = new ArrayList<>();
        
        Paso paso1 = new Paso();
        paso1.setOrden(1);
        paso1.setDescripcion("Horno precalentado 180");
        pasos.add(paso1);
        
        Paso paso2 = new Paso();
        paso2.setOrden(2);
        paso2.setDescripcion("Mezcla la harina pra brownies chocolate Fudge de Betty Crocker® con el agua, el aceite y los huevos. Vierte la mezcla en un molde cuadrado de 30 x 20 cm previamente en harinado y hornea a 180 °C durante 25 minutos. Retira del horno y enfría.");
        pasos.add(paso2);
        
        Paso paso3 = new Paso();
        paso3.setOrden(3);
        paso3.setDescripcion("Bate el queso crema con la Leche Condensada LA LECHERA®, la ralladura de limón, la mantequilla y un poco de colorante hasta integrar por completo y refrigera por 20 minutos");
        pasos.add(paso3);
        
        Paso paso4 = new Paso();
        paso4.setOrden(4);
        paso4.setDescripcion("Desmolda y corta en cuadros. Unta los brownies con un poco de betún; dibuja el cabello y la boca con el chocolate fundido, coloca los ojos de azúcar y la nariz con las lunetas. Ofrece.");
        pasos.add(paso4);
        
        receta.setPasos(pasos);
        
        receta.setDificultad(Dificultad.LEGENDARIO);
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Carlos Rebollo");
        usuario.setEmail("carlosdrt900@gmail.com");
        usuario.setPassword("brownie123");
        
        receta.setUsuario(usuario);
        
        System.out.println("***Recetas Nestlé***");
        System.out.println("Subido por " + receta.getUsuario().getNombre() + "(" + receta.getUsuario().getEmail()+")");
        System.out.println(receta.getNombre());
        System.out.println(receta.getDescripcion());
        System.out.println("Porciones" + receta.getPorciones());
        System.out.println("Tiempo de preparació" + receta.getDuracion());
        System.out.println("Ingredientes:");
        for(Ingrediente i : receta.getIngredientes()){
            System.out.println(i.getNombre());
        }
     
        System.out.println("Pasos:");
        for(Paso p : receta.getPasos()){
             System.out.println(p.getOrden() + ".-" + p.getDescripcion());
        }
    }
}
