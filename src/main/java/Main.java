public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Bolgo", "xdddd@xddddd.xddd");
        Patient patient1 = new Patient("Bardo", "Algo@gamil.com", "A-",
                "Calle x", "1234", "Mayo 1", 45.4, 1.70);


      /*  patient.showName();
        patient.showEmail();
        patient.showBlood(); */


        System.out.println(patient1.getName());
        System.out.println( patient1.getEmail());
        System.out.println(patient1.getWeight());

        patient1.setName("Paco");
        System.out.println(patient1.getName());
    }
}

