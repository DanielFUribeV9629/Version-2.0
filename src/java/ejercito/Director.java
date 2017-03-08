
package ejercito;


public class Director {
    
    private Ejercito ejercito;
    
    public void ConstruirPersonaje(){
        ejercito.CrearPersonaje();       
    }
//    -----------BUILDER----------------------------------
    public PersonajeConcreto getPersonaje(){
        return ejercito.getPersonaje();
    }
    public void setEjercito(Ejercito eb){
        this.ejercito = eb;
    }
//    ------------------------------------------------------
}
