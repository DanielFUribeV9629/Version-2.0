package Singleton;

import ejercito.ElfoFabrica;
import ejercito.EnanoFabrica;
import ejercito.HechizeroFabrica;
import ejercito.HombreFabrica;

public class Singleton {

    public Singleton() {
        

    }
    public void blabla() {
        HombreFabrica hombre = HombreFabrica.getSingle("Daniel");
        EnanoFabrica enano = EnanoFabrica.getSingle("Felipe");
        ElfoFabrica elfo = ElfoFabrica.getSingle("Nicolas");
        HechizeroFabrica hechizero = HechizeroFabrica.getSingle("Nicolas");

        System.out.println(hombre.getMiNombre() + " , " + enano.getMiNombre()
                + " , " + elfo.getMiNombre() + " , " + hechizero.getMiNombre());
    }
}
