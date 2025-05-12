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

    public boolean addInCoda(T valDaAggiungere){
        if (isEmpty())
            head=new Nodo<T>(valDaAggiungere,null);
        else{
            Nodo<T> app1=head;
            while (app1.getPuntatore()!=null) app1=app1.getPuntatore(); //Ogni passo dopo
            app1.setPuntatore(new Nodo<T>(valDaAggiungere,null));
        }
        grandezza++;
        return true;
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
    public boolean addBeforeElement(T valRicercato,T valDaAggiungere) {
        if (isEmpty())
            return false;
        else {
            //Nodi di appoggio
            Nodo<T> att = head;
            Nodo<T> prec=null;

            while (att.getPuntatore() != null) {
                if (att.equals(valRicercato)) {
                    if (prec != null) {
                        prec.setPuntatore(new Nodo<T>(valDaAggiungere, att));
                    } else {
                        head=new Nodo<T>(valDaAggiungere, att);
                    }
                    grandezza++;
                    return true;
                } else { //Incrementi
                    prec = att;
                    att = att.getPuntatore();
                }
            }
        }
        return false;
    }

    //Cancellazioni
    public boolean cancellazione(T valRicercato) {
        if (isEmpty())
            return false;
        else {
            //Nodi di appoggio
            Nodo<T> att = head;
            Nodo<T> prec=null;

            while (att.getPuntatore() != null) {
                if (att.equals(valRicercato)) {
                    if (prec != null) {
                        prec.setPuntatore(att.getPuntatore());
                    } else {
                        head=att.getPuntatore();
                    }
                    grandezza++;
                    return true;
                } else { //Incrementi
                    prec = att;
                    att = att.getPuntatore();
                }
            }
        }
        return false;
    }

}
