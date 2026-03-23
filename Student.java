class Student {
    String name;
    int rollNo;

    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    
    public static void main(String[] args) {
       
        Student[] students = new Student[3];

        
        students[0] = new Student("Alice", 101);
        students[1] = new Student("Bob", 102);
        students[2] = new Student("Charlie", 103);

        
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
