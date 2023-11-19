public class Student {
    private int ID;
    private String FIO;

    public Student(int ID, String FIO) {
        this.ID = ID;
        this.FIO = FIO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", FIO='" + FIO + '\'' +
                '}';
    }
}
