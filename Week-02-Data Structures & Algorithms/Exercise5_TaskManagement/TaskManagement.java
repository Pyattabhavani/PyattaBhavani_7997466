class Task {

    int taskId;
    String taskName;
    String status;

    Task(int id, String name, String s) {

        taskId = id;
        taskName = name;
        status = s;
    }

    void show() {

        System.out.println(taskId+" "+taskName+" "+status);
    }
}


class Node {

    Task task;
    Node next;

    Node(Task t) {

        task = t;
        next = null;
    }
}



public class TaskManagement {


    Node head;


    // add task
    void add(Task t) {

        Node newNode = new Node(t);


        if(head == null) {

            head = newNode;
        }

        else {

            Node temp = head;


            while(temp.next != null) {

                temp = temp.next;
            }


            temp.next = newNode;
        }


        System.out.println("Task Added");
    }




    // search task
    void search(int id) {

        Node temp = head;


        while(temp != null) {


            if(temp.task.taskId == id) {

                System.out.println("Task Found:");
                temp.task.show();
                return;
            }


            temp = temp.next;
        }


        System.out.println("Task Not Found");
    }





    // display tasks
    void display() {

        Node temp = head;


        while(temp != null) {

            temp.task.show();

            temp = temp.next;
        }
    }





    // delete task
    void delete(int id) {


        if(head == null) {

            System.out.println("No Tasks");
            return;
        }



        if(head.task.taskId == id) {

            head = head.next;

            System.out.println("Task Deleted");

            return;
        }



        Node temp = head;


        while(temp.next != null) {


            if(temp.next.task.taskId == id) {


                temp.next = temp.next.next;

                System.out.println("Task Deleted");

                return;
            }


            temp = temp.next;
        }


        System.out.println("Task Not Found");

    }





    public static void main(String args[]) {


        TaskManagement tm = new TaskManagement();



        tm.add(new Task(1,"Complete Java","Pending"));

        tm.add(new Task(2,"Upload Project","Completed"));



        System.out.println("\nTasks:");

        tm.display();



        tm.search(1);



        tm.delete(2);



        System.out.println("\nAfter Delete:");

        tm.display();


    }

}