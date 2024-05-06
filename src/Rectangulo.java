public class Rectangulo extends FiguraGeometrica{
    private Integer base;
    private Integer altura;

    public Rectangulo(String nombre, String colorFigura, Integer base, Integer altura) {
        super(nombre, colorFigura);
        this.base = base;
        this.altura = altura;
    }
}
