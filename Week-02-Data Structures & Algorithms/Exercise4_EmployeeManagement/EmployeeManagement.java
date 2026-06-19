class Employee {

    int eId;
    String name;
    String position;
    double salary;

    Employee(int id, String n, String pos, double sal) {

        eId = id;
        name = n;
        position = pos;
        salary = sal;
    }

    void show() {

        System.out.println(eId + " " + name + " " + position + " " + salary);
    }
}


public class EmployeeManagement {

    Employee emp[] = new Employee[10];
    int count = 0;


    void add(Employee e) {

        emp[count] = e;
        count++;

        System.out.println("Employee Added");
    }


    void search(int id) {

        for(int i = 0; i < count; i++) {

            if(emp[i].eId == id) {

                System.out.println("Employee Found:");
                emp[i].show();
                return;
            }
        }

        System.out.println("Employee Not Found");
    }


    void display() {

        for(int i = 0; i < count; i++) {

            emp[i].show();
        }
    }


    void delete(int id) {

        for(int i = 0; i < count; i++) {

            if(emp[i].eId == id) {

                for(int j = i; j < count - 1; j++) {

                    emp[j] = emp[j + 1];
                }

                count--;

                System.out.println("Employee Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }


    public static void main(String args[]) {

        EmployeeManagement em = new EmployeeManagement();


        em.add(new Employee(101, "Bhavani", "Developer", 50000));

        em.add(new Employee(102, "Kiran", "Tester", 40000));


        System.out.println("Employees:");

        em.display();


        em.search(101);


        em.delete(102);


        System.out.println("After Delete:");

        em.display();

    }
}