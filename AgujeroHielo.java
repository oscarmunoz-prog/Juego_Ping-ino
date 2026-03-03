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
    
