import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {

    private Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true; // Случайные числа можно генерировать бесконечно
    }

    @Override
    public Integer next() {
        return randoms.nextInt();
    }
}
