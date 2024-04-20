import net.thucydides.model.requirements.reports.ScenarioOutcome;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Patient {
   private String name;
   private String email;
   private String address;
   private String phoneNumber;
   private String birthday;
   private double weight;
   private double height;
   private String blood;


    Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.blood = "o+";
    };

    Patient (String name, String email, String blood, String address, String phoneNumber,
               String birthday, double weight, double height ){
        this.name = name;
        this.email = email;
        this.blood = blood;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    };

    public String getName() {

        return name.toUpperCase(Locale.ROOT);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getWeight() {
        return this.weight + "kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void showName(){
        System.out.println(name);

    };

    public void showEmail (){
        System.out.println(email);
    };

    public void showBlood (){
        System.out.println(blood);
    }
}
