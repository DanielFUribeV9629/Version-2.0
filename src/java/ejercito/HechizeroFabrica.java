package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraHechizero;
import Armas.ArmaHechizero;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoHechizero;
import Escudo.EscudoAbs;
import Escudo.EscudoHechizero;

public class HechizeroFabrica extends Ejercito{

    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoHechizero();
    }

    @Override
    public ArmasAbs darArma() {
        return new ArmaHechizero();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoHechizero();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraHechizero();
    }

    //Singleton
    
    private static HechizeroFabrica single;
    private String miNombre;

    public HechizeroFabrica(/*String miNombre*/) {
        /*this.miNombre = miNombre;*/
    }
    
    public static HechizeroFabrica getSingle (String miNombre) {
        if (single == null) {
            single = new HechizeroFabrica(/*miNombre*/);
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
        Ejercito hechizero = new HechizeroFabrica();
        hechizero.darArma();
        hechizero.darArmadura();
        hechizero.darCuerpo();
        hechizero.darEscudo();
        return hechizero;
    }
}
