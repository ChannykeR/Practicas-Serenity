public class Doctor {

    static int id = 0;
    String name;
    String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public Doctor() {
        System.out.println("Constructing Doctor Object");
        id++;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}