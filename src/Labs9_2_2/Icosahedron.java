package Labs9_2_2;

public class Icosahedron extends RegularPolyhedron {
    public Icosahedron(Integer[] edges) {
        super(12, 20, edges); // V=12, F=20
        if (!isIcosahedron(12, 20, edges.length)) {
            throw new IllegalArgumentException("Параметры не соответствуют Икосаэдру");
        }
    }

    public static Boolean isIcosahedron(Integer vertices, Integer faces, Integer edges) {
        return vertices == 12 && faces == 20 && edges == 30;
    }
}
