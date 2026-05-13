package Labs9_2_2;
import java.util.Arrays;

public class RegularPolyhedron extends VertexPolyhedron{
    public RegularPolyhedron(Integer verticesCount, Integer facesCount, Integer[] edges) {
        super(verticesCount, facesCount, edges);
        if (!isRegular(edges)){
            throw new IllegalArgumentException();
        }
    }

    public static Boolean isRegular(Integer[] edges) {
        if (edges == null || edges.length == 0) return false;
        return Arrays.stream(edges).allMatch(e -> e.equals(edges[0]));
    }



}
