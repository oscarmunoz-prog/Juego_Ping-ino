package src.JOCDELPINGU.Modelo;
//Definimos el paquete

public class AgujeroHielo implements Entidad {
//Creamos la clase de AgujeroHielo, teniendo de herencia a Entidad

    @Override
    //Se sobreescribe el método

    public String getNombre() { return "Agujero de Hielo"; }
    //Se devuelve el nombre que se le asigna a esta entidad, en este caso "Agujero de Hielo"
    
    @Override
    public String getSimbolo() { return "🕳️"; }
    //Aqui hemos añadido simbolos, para hacerlo más gráfico y bonito, en caso de esta entidad, saldra el simbolo del agujero
    
    @Override
    public String getDescripcion() { return " Cuidado con el agujero, te podrías resbalar"; }
    //Descripción corta de esta entidad

    @Override
    public void interactuar(Jugador jugador) {
        //Hacemos que la entidad interactue con el jugador

        int retroceso = (int)(Math.random() * 4) + 1;
        //Esta entidad hace que retrocedes, las casillas que retrocedes se generaran random entre 0 y 4.
        System.out.println(" Te has resbalado hacia el agujero");
        System.out.println("  Retrocedes " + retroceso + " casillas");
        
        int nuevaPos = Math.max(0, jugador.getPosicion() - retroceso);
        jugador.setPosicion(nuevaPos);
        //Primero se obtiene la posición actual, le resta las casillas que se retrocedes, se calcula, y se obtiene la nueva posición

    }
}