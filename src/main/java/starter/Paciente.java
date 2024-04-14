package starter;

public class Paciente extends User{
    private String enfermedad;

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    Paciente(String name, String email, String address, String phonenumber, String enfermedad) {
        super(name, email, address, phonenumber);
        this.enfermedad = enfermedad;

    }
}
