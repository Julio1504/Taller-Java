public class Estudiante extends Persona implements Trabajador {
    private Integer grado;

    public Estudiante(String nombre, Integer edad, String fechaN, Integer grado) {

        super(nombre, edad, fechaN);

        this.grado = grado;
    }


    @Override
    public void mensaje(){
        super.mensaje();
        System.out.println(" ,mi grado es: " + this.grado);
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }
    public void realizarTarea(){
        System.out.println("Realizando tarea escolar");
    }
}
