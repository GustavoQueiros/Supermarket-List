package implementation;

public interface Supermarket {


    void add(String item);

    void print();

    void delete(int index);

    public interface SupermarketList {

        void add(final String item);

        void print();

        void delete(final int index);

    }

}
