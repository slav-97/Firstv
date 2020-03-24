package by.tut.lect9;

public class Pair<K, V> {
    private K Key;
    private V Value;

    Pair(){
    }

    Pair (K Key, V Value) {
        this.Key = Key;
        this.Value = Value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K Key) {
        this.Key = Key;
    }

    public V getValue() {
        return Value;
    }

    public void setValue(V Value) {
        this.Value = Value;
    }

    @Transaction
    public static void transactionTesting() {
        System.out.println("Transaction processing, please wait");

    }
}
