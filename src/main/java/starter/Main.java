package starter;

public class Main {
    public static void main (String[] args) {

        Doctor mydoctor = new Doctor("Mauricio", "mauricio@gmail.com", "funza", "12345678", "odontologo");
        Paciente paciente2 = new Paciente("Lucia", "lucia@gmail.com", "Bogota", "9876543", "Rinitis");
        System.out.println(mydoctor.getName()+ " "+mydoctor.getPhonenumber());
        System.out.println(paciente2.getName()+ " "+paciente2.getAddress());

        mydoctor.setPhonenumber("235678");
        paciente2.setAddress("Suba");

        System.out.println(mydoctor.getName()+ " "+mydoctor.getPhonenumber());
        System.out.println(paciente2.getName()+ " "+paciente2.getAddress());
    }
}
