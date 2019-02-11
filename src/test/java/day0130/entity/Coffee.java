package day0130.entity;

public class Coffee {
    private static int count = 0;
    private final long id = count ++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                " " + id + " }" ;
    }
}


