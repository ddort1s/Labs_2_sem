package Labs9_2_2;

public class Octahedron extends RegularPolyhedron {
    public Octahedron(Integer[] edges) {
        super(6, 8, edges); // V=6, F=8
        if (!isOctahedron(6, 8, edges.length)) {
            throw new IllegalArgumentException("Параметры не соответствуют Октаэдру");
        }
    }

    public static Boolean isOctahedron(Integer vertices, Integer faces, Integer edges) {
        return vertices == 6 && faces == 8 && edges == 12;
    }
}
