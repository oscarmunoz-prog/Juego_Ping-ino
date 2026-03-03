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
    
    public String getDescripcion() {
        //Método para obtener la descripción de cada una de las casillas

        switch(tipo) {
            //Evalua segun el tipo de casilla, y obtiene la descripción correspondiente
            case PINGUINO: return "Casilla de Pingüino (salida)";
            case OSO: return "Casilla de Oso, Has vuelto al inicio";
            case AGUJERO: return "Agujero de hielo - Retrocedes unas casillas";
            case TRINEO: return "Trineo - Avanzas una buena parte del tablero";
            case INTERROGANTE: return "Evento Aleatorio";
            default: return "Casilla normal";
            //Obtiene la descripción de cada uno, y si es casilla normal, sin ningun evento, ni nada del estilo, devolver "Casilla Normal"
        }
    }
    
    public TipoCasilla getTipo() { return tipo; }
}
//Método "getter" para devolver el tipo de casilla correspondiente.