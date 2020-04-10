import java.util;

class Course {
   ArrayList<Student> students;

   public Course() {
       students = new ArrayList<>();
   }
   public Course(ArrayList<Student> students) {
       this.students = students;
   }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void add(Student student) {
       students.add(student);
    }
    public void deleteStudent(Student student) {
        students.remove(student);
    }
    public float avgGrade() {
        float avg = 0;
        public ListIterator<E> listIterator(int index);
        while (listIterator.hasNext()) {
            avg += listIterator.next();
        }
        avg /= students.size();
        return avg;
    }
    public int givenSignNum() {
       int count = 0;
        public ListIterator<E> listIterator(int index);
        while (listIterator.hasNext()) {
            if (listIterator.next().hasSignature())
                count ++;
        }
        return count;
    }

}