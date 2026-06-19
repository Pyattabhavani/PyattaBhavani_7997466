import java.util.HashMap;


class Product {


    int pId;
    String pName;
    int qty;
    double price;



    Product(int id, String name, int q, double pr){


        pId = id;
        pName = name;
        qty = q;
        price = pr;

    }



    void show(){


        System.out.println(
                pId+" "+pName+" "+qty+" "+price
        );

    }

}




public class InventoryManagement {



    HashMap<Integer,Product> list = new HashMap<>();




    // add product
    void add(Product p){


        list.put(p.pId,p);

        System.out.println("Product Added");

    }





    // update product
    void update(int id,int q){


        Product p = list.get(id);



        if(p != null){


            p.qty = q;

            System.out.println("Product Updated");

        }

        else{


            System.out.println("Product Not Found");

        }


    }






    // delete product
    void delete(int id){



        if(list.remove(id) != null){


            System.out.println("Product Deleted");

        }

        else{


            System.out.println("Product Not Found");

        }


    }






    // display all products
    void display(){



        for(Product p : list.values()){


            p.show();

        }


    }







    public static void main(String args[]){



        InventoryManagement inv = new InventoryManagement();




        Product p1 = 
        new Product(101,"Laptop",5,50000);



        Product p2 =
        new Product(102,"Mobile",10,20000);





        inv.add(p1);

        inv.add(p2);




        System.out.println("\nInventory:");

        inv.display();





        inv.update(101,8);




        inv.delete(102);




        System.out.println("\nFinal Inventory:");

        inv.display();



    }

}