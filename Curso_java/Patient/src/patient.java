public class patient {
    static String name;
    static String email;
    static String adress;
    static int weight;
    static int height;
    patient (String name, String email, String adress, int weight, int height){
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.weight = weight;
        this.height = height;
    }

    static void sayInfo(){
        System.out.println(patient.name + patient.email + patient.adress + patient.weight + patient.height);
    }
}
