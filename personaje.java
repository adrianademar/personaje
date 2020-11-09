public class personaje {
    private String nombrePersonaje;
    private int nivelPersonaje;
    private boolean modoStreamer;
    
    public personaje(String nombrePj, int nivelDePersonaje) {
        nombrePersonaje = nombrePj;
        modoStreamer = false;
        nivelPersonaje = nivelDePersonaje;
    }
    
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }
    
    public int getNivelPersonaje() {
        return nivelPersonaje;
    }
    
    public boolean getModoStreamer() {
        return modoStreamer;
    }
    
    public  void setCambioDeNombre(String nuevoNombre) {
        nombrePersonaje = nuevoNombre;
    }
    
    public void cambioDeNivel(int variacionDeNivel) {
        nivelPersonaje += variacionDeNivel;
    }
    
    public void cambioDeModo() {
        if (modoStreamer){
            modoStreamer = false;
        }
        else {
            modoStreamer = true;
        }
    }
    
    public void imprimirEstado() {
        String estadoModo;
        if (modoStreamer) {
            estadoModo = ", el modo streamer se encuentra activado";
        }
        else {
            estadoModo = ", el modo streamer se encuentra desactivado";
        }
        System.out.println("Nombre del personaje: " + nombrePersonaje + ", Nivel del personaje: " + nivelPersonaje + estadoModo);
    }
    
    public String getEstado() {
        String estadoActual = "Nombre del personaje: " + nombrePersonaje + ", Nivel del personaje: " + nivelPersonaje + ", Modo streamer: " + modoStreamer;
        return estadoActual;
    }
}