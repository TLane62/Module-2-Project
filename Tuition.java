public class Tuition {

    private String studentName;
    private int creditHours;
    private double tuitionCost;

    public Tuition(String studentName, int creditHours, double tuitionCost) {
        this.studentName = studentName;
        this.creditHours = creditHours;
        this.tuitionCost = tuitionCost;
    }

    public double calculateTotal() {
        return creditHours * tuitionCost;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public String getTuitionInfo() {
        return "Student: " + studentName + 
        ", Credits: " + creditHours +
        ", Cost: " + tuitionCost +
        ", Total Tuition: " + calculateTotal();
    }

    public static void main(String[] args) {
        Tuition t = new Tuition("John Doe", 85, 1100.00);

        System.out.println(t.getTuitionInfo());
    }
    
}
