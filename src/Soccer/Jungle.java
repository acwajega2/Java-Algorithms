package Soccer;


import static Soccer.Movie.Type.NEW_RELEASE;

class Movie{


    enum Type{
        REGULAR {
            public int computePrice(int days){
                return days + 1;
            }

        },NEW_RELEASE {
            public int computePrice(int days){
                return days * 2;
            }
        },CHILDREN {
            public int computePrice(int days) {
                return 5;
            }
        };

        abstract public int computePrice(int days);
    }


    private final Type type;

    Movie(Type type) {
        this.type = type;
    }

    public int computePrice(int days){
        return type.computePrice(days);
    }

}
public class Jungle {
    public static void main(String[] args) {
        System.out.println(new Movie(NEW_RELEASE).computePrice(5));
    }
}



