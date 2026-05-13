package Labs9_2_2;

public class Dodecahedron extends RegularPolyhedron {
    public Dodecahedron(Integer[] edges) {
        super(20, 12, edges); // V=20, F=12
        if (!isDodecahedron(20, 12, edges.length)) {
            throw new IllegalArgumentException("Параметры не соответствуют Додекаэдру");
        }
    }

    public static Boolean isDodecahedron(Integer vertices, Integer faces, Integer edges) {
        return vertices == 20 && faces == 12 && edges == 30;
    }
}
