package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraElfo;
import Armas.ArmaElfo;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoElfo;
import Escudo.EscudoAbs;
import Escudo.EscudoElfo;

public class ElfoFabrica extends Ejercito{
      
    public ArmasAbs darArma(){
        return new ArmaElfo();  
    }  
    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoElfo();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraElfo();
    }

    //Singleton
    
    private static ElfoFabrica single;
    private String miNombre;

    public ElfoFabrica(/*String miNombre*/) {
        /*this.miNombre = miNombre;*/
    }
    
    public static ElfoFabrica getSingle (String miNombre) {
        if (single == null) {
            single = new ElfoFabrica(/*miNombre*/);
        } else{
            System.out.println("Objeto imposible de crear, ya existe uno");
        }
        return single;
    }
    
    public String getMiNombre(){
        return miNombre;
    }
    
    public void setMiNombre (String ninombre) {
        this.miNombre = miNombre;
    }
    
    
    //Prototype
    @Override
    public Ejercito clonar() {
        Ejercito elfo = new ElfoFabrica();
        elfo.darArma();
        elfo.darArmadura();
        elfo.darCuerpo();
        elfo.darEscudo();
        return elfo;
    }
} //Para la clonacion simplemente en donde vayamos a clonarlo, hacemos 

/*ElfoFabrica elfo = new ElfoFabrica ();
  HombreFabrica hombre = new HombreFabrica();
  Ejercito milicia;
    
    System.out.println(elfo.darArma());
    System.out.println(elfo.darArmadura());
    System.out.println(elfo.darCuerpo());
    System.out.println(elfo.darEscudo());
    System.out.println(hombre.darArma());
    System.out.println(hombre.darArmadura());
    System.out.println(hombre.darCuerpo());
    System.out.println(hombre.darEscudo());

    System.out.println(digite 1 = hombre o 2 = elfo para copiar);
    opcion = Scanner....;
    if (opcion ==1){
        milica = hombre.clonar(); 

para mostrar lo que se clono se pone 
milicia. ¿? 
}


*/
