package Labs9_2_2;

public class Hexahedron extends RegularPolyhedron {
    public Hexahedron(Integer[] edges) {
        super(8, 6, edges); // V=8, F=6
        if (!isHexahedron(8, 6, edges.length)) {
            throw new IllegalArgumentException("Параметры не соответствуют Гексаэдру");
        }
    }

    public static Boolean isHexahedron(Integer vertices, Integer faces, Integer edges) {
        return vertices == 8 && faces == 6 && edges == 12;
    }
}
