package by.tut.lect9;

public final class PairUtil {
    public static <K, V> Pair<V, K> swap (Pair <K,V> initialPair)
    {
    Pair swappedPair = new Pair(initialPair.getValue(), initialPair.getKey());
        return swappedPair;
    }
}
