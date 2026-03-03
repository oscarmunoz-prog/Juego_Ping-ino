package src.JOCDELPINGU.Modelo;
//Definimos el paquete de esta clase

public class Casilla {
    private int posicion;
    private TipoCasilla tipo;
//Creacion de atributos de posición y tipo

    
    public Casilla(int posicion, TipoCasilla tipo) {
        this.posicion = posicion;
        this.tipo = tipo;
    }
    //Contructores de los atributos anteriores, esto recibe la posición y el tipo de casilla en la que esta.

    public String getSimbolo() {
        //Método para devolver el simbolo gráfico

        switch(tipo) {
            //Evalua el tipo e imprime el simbolo segun el tipo.

            case PINGUINO: return "🐧";
            case OSO: return "🐻";
            case AGUJERO: return "🕳️";
            case TRINEO: return "🛷";
            case INTERROGANTE: return "❓";
            default: return "⬜";
        }

        //Hemos añadido un simbolo para cada tipo de casilla
    }
