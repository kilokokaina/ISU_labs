class PairList<K, V> {
    private K ob1;
    private  V ob2;

    PairList(K ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    @Override
    public String toString() {
        return "{ name: " + ob1 + ", number: " + ob2 + " }\n";
    }
}