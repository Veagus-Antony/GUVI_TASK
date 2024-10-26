package Task_2;

public class Question_1 {

    public static class Person {
        private String name;
        private int age;

        public Person() {
            this.age = 18;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static void main(String[] args) {
            Person person1 = new Person();
            person1.setName("Veagus");
            person1.displayInfo();

            Person person2 = new Person("Antony", 23);
            person2.displayInfo();
        }
    }
}
