package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraEnano;
import Armas.ArmaEnano;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoEnano;
import Escudo.EscudoAbs;
import Escudo.EscudoEnano;

public class EnanoFabrica extends Ejercito{

    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoEnano();
    }

    @Override
    public ArmasAbs darArma() {
        return new ArmaEnano();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoEnano();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraEnano();
    }

   
    //Singleton
    
    private static EnanoFabrica single;
    private String miNombre;

    public EnanoFabrica(/*String miNombre*/) {
        /*this.miNombre = miNombre;*/
    }
    
    public static EnanoFabrica getSingle (String miNombre) {
        if (single == null) {
            single = new EnanoFabrica(/*miNombre*/);
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
        Ejercito enano = new EnanoFabrica();
        enano.darArma();
        enano.darArmadura();
        enano.darCuerpo();
        enano.darEscudo();
        return enano;
    }
}
