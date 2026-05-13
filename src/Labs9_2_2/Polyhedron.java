package Labs9_2_2;

public class Polyhedron {
    protected int verticesCount;
    protected int facesCount;
    protected Integer[] edges;

    public Polyhedron(int verticesCount, int facesCount, Integer[] edges){
        if (verticesCount < 4 || edges.length < 6) {
            throw new IllegalArgumentException("Некорректное количество вершин или ребер.");
        }
        for (int length : edges) {
            if (length < 1) throw new IllegalArgumentException("Ребро не может быть меньше 1.");
        }
        this.verticesCount = verticesCount;
        this.facesCount = facesCount;
        this.edges = edges;
    }

    public Integer getEdgesCount(){
        return edges.length;
    }

    public static Boolean isCorrectEdge(Integer edge){
        return edge!=null && edge >= 1;
    }

    public String toString() {
        return "Polyhedron: V=" + verticesCount + ", F=" + facesCount + ", E=" + getEdgesCount();
    }
}
