package NotacionED2;

public class Pila {
int tama�o;
char[] items;
int i;

Pila(int tama�o){
this.tama�o=tama�o;
this.items=new char[tama�o];
this.i=0;
}
public boolean push(char item){
if (i<tama�o){
items[i++]=item;
return true;
}

return false;

}
public char pop(){
if(i<=0)
return 0;
return items[--i];

}

public char nextPop(){
if(i<=0)
return 0;
return items[i-1];
}
}