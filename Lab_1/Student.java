package JavaLab.Lab_1;

public class Student implements Comparable<Student> {
    private int ID;
    private String StudentName;
    private int Semester;
    private String CourseName;

    public Student(){

    }

    public Student(int ID, String StudentName, int Semester, String CourseName){
        this.ID = ID;
        this.StudentName = StudentName;
        this.Semester = Semester;
        this.CourseName = CourseName;

    }

    public int getId(){
        return ID;
    }

    public String getName(){
        return StudentName;
    }

    public int getSemester(){
        return Semester;
    }

    public String getCourse(){
        return CourseName;
    }

    public void setId(int id){
        this.ID = id;
    }

    public void setName(String name){
        this.StudentName = name;
    }

    public void setSemester(int semester){
        this.Semester = semester;
    }

    public void setCourse(String course){
        this.CourseName = course;
    }

    public String toString(){
        return ID + "\t" + StudentName + "\t" + Semester + "\t" + CourseName;
    }

    @Override
    public int compareTo (Student o){
        if(this.StudentName.indexOf(0) > o.StudentName.indexOf(0)){
            return 1;
        }else if(this.StudentName.indexOf(0) < o.StudentName.indexOf(0)){
            return -1;
        }
        return 0;
    }

}

