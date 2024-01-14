public class Student {



        private String name;
        private String surname;
        private int studentNumber;
        private int year;






        public Student(String name, String surname, int studentNumber, int year) {
            this.name = name;
            this.surname = surname;
            this.studentNumber = studentNumber;
            this.year = year;
        }

        public void informations() {
            System.out.println("Name surname: " + name + " " + surname);
            System.out.println("Student number: " + studentNumber);
            System.out.println("Year: " + year);
        }
    }






