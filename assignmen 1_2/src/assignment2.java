
abstract class MedicalService {//PARENT CLASS
    String id;
    double cost;

    MedicalService(String id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    abstract double calculateTotalCost();

    void displayServiceInfo() {
        System.out.println("Service ID: " + id);
    }
}

class Consultation extends MedicalService {
    double fee;

    Consultation(String id, double cost, double fee) {
        super(id, cost);
        this.fee = fee;
    }

    @Override
    double calculateTotalCost() {
        return cost + fee;
    }
}

class LaboratoryTest extends MedicalService {
    double charge;

    LaboratoryTest(String id, double cost, double charge) {
        super(id, cost);
        this.charge = charge;
    }

    @Override
    double calculateTotalCost() {
        return cost + charge;
    }
}

class Ultrasound extends MedicalService {
    double fee;

    Ultrasound(String id, double cost, double fee) {
        super(id, cost);
        this.fee = fee;
    }

    @Override
    double calculateTotalCost() {
        return cost + fee;
    }
}


public class assignment2 {

        public static void main(String[] args) {

            MedicalService s1 = new Consultation("S001", 15, 10);
            MedicalService s2 = new LaboratoryTest("S002", 10, 8);
            MedicalService s3 = new Ultrasound("S003", 30, 10);

            MedicalService[] services = {s1, s2, s3};

            double total = 0;

            System.out.println("HOSPITAL BILLING SYSTE");

            for (MedicalService s : services) {
                s.displayServiceInfo();
                System.out.println("Total Cost: $" + s.calculateTotalCost());
                total = total + s.calculateTotalCost();
                System.out.println();
            }

            System.out.println("Total Hospital Bill: $" + total);
        }
    }

