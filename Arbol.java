
public class Arbol {
private Nodo raiz;

public Arbol(){
raiz=null;
}
//metodo a envolver
private void insertarDesde(Nodo noda,Nodo Desde ){

if(Desde.obtenerData()==noda.obtenerData()){
return;
}
if(noda.obtenerData()>Desde.obtenerData()){
//colocar a la derecha 
if(Desde.der == null){
Desde.der=noda;
return;
}else{
insertarDesde(noda,Desde.der);
return;
}
}else{
//colocar a la izquierda
if(Desde.izq == null){
Desde.izq=noda;
return;
}else{
insertarDesde(noda,Desde.izq);
return;
}
}
}

//metodo que envuelve wrapper
public void insertar(Nodo noda){
if(raiz==null){
raiz=noda;
return;//termina el metodo
}
////////////
//si llego aqui la raiz no es nula 
insertarDesde(noda,raiz);
}

public boolean buscar(Nodo noba){
return buscarDesde(noba,raiz);
}
private boolean buscarDesde(Nodo noba, Nodo Desde){
if(Desde==null){
return false;
}

//cuando el nodo es el encontrado
if(Desde.obtenerData()==noba.obtenerData()){
return true;
}
if(noba.obtenerData()>Desde.obtenerData()){
//derecha
return buscarDesde(noba,Desde.der);
}else{
//izquierda
return buscarDesde(noba,Desde.izq);
}
}

}
