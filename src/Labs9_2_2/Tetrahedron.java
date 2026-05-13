package Labs9_2_2;

public class Tetrahedron extends RegularPolyhedron {
    public Tetrahedron(Integer[] edges) {
        super(4, 4, edges);
        if (!isTetrahedron(4, 4, edges.length)) throw new IllegalArgumentException("Это не тетраэдр");
    }
    public static Boolean isTetrahedron(Integer v, Integer f, Integer e) {
        return v == 4 && f == 4 && e == 6;
    }
}


