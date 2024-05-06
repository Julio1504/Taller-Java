public class Estudiante extends Persona{
    private Integer grado;

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.println(" ,mi grado es: " + this.grado);
    }
}
