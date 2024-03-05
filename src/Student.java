public class Student {  
    private String studentID;  
    private String studentName;  
    private String[] extraActivities;  
  
    public Student(String studentID, String studentName, int numberOfExtraActivities) {  
        this.studentID = studentID;  
        this.studentName = studentName;  
        this.extraActivities = new String[numberOfExtraActivities];  
    }  
  
    public void addExtraActivity(int index, String activity) {  
        if (index >= 0 && index < extraActivities.length) {  
            extraActivities[index] = activity;  
        } else {  
            System.out.println("Index out of bounds!");  
        }  
    }  
  
    public String getStudentID() {  
        return studentID;  
    }  
  
    public void setStudentID(String studentID) {  
        this.studentID = studentID;  
    }  
  
    public String getStudentName() {  
        return studentName;  
    }  
  
    public void setStudentName(String studentName) {  
        this.studentName = studentName;  
    }  
  
    public String[] getExtraActivities() {  
        return extraActivities;  
    }  
  
    public void setExtraActivities(String[] extraActivities) {  
        this.extraActivities = extraActivities;  
    }  
  
    @Override  
    public String toString() {  
        return "Student ID: " + studentID + ", Name: " + studentName + ", Extra Activities: " + String.join(", ", extraActivities);  
    }  
}
