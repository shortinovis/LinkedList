public class LinkedList<T> {
    private Nodo<T> head;
    private int grandezza;

    public LinkedList(){
        this.head=null;
        this.grandezza=0;
    }

    public Nodo<T> getHead() {
        return head;}
    public void setHead(Nodo<T> head) {
        this.head = head;}
    public int getGrandezza() {
        return grandezza;}
    public void setGrandezza(int grandezza) {
        this.grandezza = grandezza;}


    public boolean isEmpty(){ return grandezza==0;
    }

    public boolean add(T valore){
        if(isEmpty()) {
            head = new Nodo<T>(valore, null);
        }else{
            Nodo<T> app=head;
            head=new Nodo<T>(valore, app);
            }
            grandezza++;
            return true;
        }

    public boolean addCoda(T valore){
        if(isEmpty())
            head = new Nodo<T>(valore, null);
        else{
            Nodo<T> app=head;
            while (app.getPuntatore()!=null){
                app=app.getPuntatore();
                app.setPuntatore(head=new Nodo<T>(valore, app));
            }
            grandezza++;
            return true;
        }
    }
    public boolean addPos(T valore, int pos){
        if(isEmpty() && pos<0 && pos>grandezza)
            return false;
        else{
            Nodo<T> app=head;
            int cont=0;
            while (app.getPuntatore()!=null) {
                if (cont == pos) {
                    Nodo<T>app2=app.getPuntatore();
                    app.setPuntatore(head = new Nodo<T>(valore, app2));
                    grandezza++;
                }else{
                    cont++;
                    app=app.getPuntatore();
                }
            }
        }
        return true;
    }
    public boolean addPrimaEle(T valore, int pos){
        if(isEmpty() && pos<0 && pos>grandezza)
            return false;
        else{
            Nodo<T> app=head;
            int cont=0;
            while (app.getPuntatore()!=null) {
                if (cont == pos) {
                    Nodo<T>app2=app.getPuntatore();
                    app.setPuntatore(head = new Nodo<T>(valore, app2));
                    grandezza++;
                }else{
                    cont++;
                    app=app.getPuntatore();
                }
            }
        }
        return true;
    }

}
