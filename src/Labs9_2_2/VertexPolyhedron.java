package Labs9_2_2;

public class VertexPolyhedron extends Polyhedron {

    public VertexPolyhedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
        if (!isVertex(verticesCount, facesCount, edges.length)) {
            throw new IllegalArgumentException("Не является выпуклым (ошибка Эйлера)");
        }
    }

    public static Boolean isVertex(Integer vertices, Integer faces, Integer edges) {
        return (vertices - edges + faces) == 2;
    }
}
