public class StudentReg {

  private String name;
  private String registrationNumber;

  public StudentReg(String name, String registrationNumber) {
    this.name = name;
    this.registrationNumber = registrationNumber;
  }

  public String getName() {
    return name;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  // Static nested class renamed to StaticInformationFormatter
  public static class StaticInformationFormatter {

    public static String formatStudentInfo(StudentReg student) {
      return "Name: " + student.getName() + "\nRegistration Number: " + student.getRegistrationNumber();
    }
  }

  public static void main(String[] args) {
    StudentReg student1 = new StudentReg("Alice", "ABC123");
    String formattedInfo = StudentReg.StaticInformationFormatter.formatStudentInfo(student1);
    System.out.println(formattedInfo);
  }
}
