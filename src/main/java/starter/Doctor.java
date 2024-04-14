package starter;

public class Doctor extends User {

    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    Doctor(String name, String email, String address, String phonenumber, String especialidad) {
        super(name, email, address, phonenumber);
        this.especialidad = especialidad;

    }
}
