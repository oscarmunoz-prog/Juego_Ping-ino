package src.JOCDELPINGU.Controladores;
//Define el paquete en donde esta esta clase

import src.JOCDELPINGU.Modelo.*;
//Importa todas las clases Modelo

public class ControladorEventos {
//Declaramos la clase publica
    
    public void procesarCasilla(Jugador jugador, Casilla casilla) {
//Vuelve a declarar clase publica
        Entidad entidad = null;
    
    
        switch(casilla.getTipo()) {
            //Evalua las casillas mediante getTipo
           
            case PINGUINO:
                entidad = new Pinguino();
                break;
            //Si la casilla es pinguino, crear el objeto pinguino

            case OSO:
                entidad = new Oso();
                break;
            //Si la casilla es un Oso, crear esta objeto
            
            case AGUJERO:
                entidad = new AgujeroHielo();
                break;
            //Vuelve a ser lo mismo, en caso de, crear el objeto

            case TRINEO:
                entidad = new Trineo();
                break;
            //Crear el objeto trineo

            case INTERROGANTE:
                eventoAleatorio(jugador);
                return;
            //Y en caso de ser un evento aleatorio,, y llamar al eventoAleatorio.

        }
        
      

        
