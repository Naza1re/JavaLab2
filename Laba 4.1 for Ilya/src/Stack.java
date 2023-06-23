class Stack {
    private List list = new List();

    public void add(Clothing data) {
        list.addBack(data);
    }


    public void remove() {
        list.removeHead();

    }

    public Clothing peak() {
        return list.getHead().data;

    }

    public int size() {
        return list.size();
    }



    }

