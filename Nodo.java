
public class Nodo {
    public Nodo izq;
    public Nodo der;
    private int Data;
    public Nodo(int Data){
    this.Data=Data;
    izq=null;
    der=null;
    }
    public int obtenerData(){
    return Data;
    }
    public void asignarData(int Data){
    this.Data=Data;
    }
    public String toString(){
    return ""+Data;
    }
}
