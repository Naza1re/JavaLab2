class List {
    private Node head;
    private Node tail;

    public Node getHead(){
        return head;
    }
    public int size() {
        Node p;
        int size=0;
        for(p=head;p!=null;p=p.next){
            size++;
        }
        return size;
    }
    void addBack(Clothing data) {
        Node a = new Node();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void removeHead()
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }


        head = head.next;
        return;
    }
    void printList()
    {
        Node t = this.head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public void setHead(Node newNode) {
    }
}

