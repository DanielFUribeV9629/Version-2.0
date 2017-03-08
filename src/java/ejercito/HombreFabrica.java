package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraHombre;
import Armas.ArmaHombre;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoHombre;
import Escudo.EscudoAbs;
import Escudo.EscudoHombre;

public class HombreFabrica extends Ejercito{

    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoHombre();
    }

    @Override
    public ArmasAbs darArma() {
        return new ArmaHombre();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoHombre();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraHombre();
    }

    //Singleton
    
    private static HombreFabrica single;
    private String miNombre;

    public HombreFabrica(/*String miNombre*/) {
        /*this.miNombre = miNombre;*/
    }
    
    public static HombreFabrica getSingle (String miNombre) {
        if (single == null) {
            single = new HombreFabrica(/*miNombre*/);
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
        Ejercito hombre = new HombreFabrica();
        hombre.darArma();
        hombre.darArmadura();
        hombre.darCuerpo();
        hombre.darEscudo();
        return hombre;
    }
    
}
