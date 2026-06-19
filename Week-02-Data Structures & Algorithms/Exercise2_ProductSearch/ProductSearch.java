import java.util.Arrays;


class Product {


    int pId;
    String pName;
    String category;



    Product(int id,String name,String cat){

        pId=id;
        pName=name;
        category=cat;

    }



    void show(){

        System.out.println(
                pId+" "+pName+" "+category
        );

    }

}





public class ProductSearch {



    // linear search
    static void linearSearch(Product arr[],String name){



        for(Product p:arr){


            if(p.pName.equalsIgnoreCase(name)){


                System.out.println("Product Found:");

                p.show();

                return;

            }

        }


        System.out.println("Product Not Found");


    }







    // binary search
    static void binarySearch(Product arr[],String name){



        int low=0;

        int high=arr.length-1;




        while(low<=high){



            int mid=(low+high)/2;



            int result =
            arr[mid].pName.compareToIgnoreCase(name);




            if(result==0){


                System.out.println("Product Found:");

                arr[mid].show();

                return;

            }



            else if(result<0){


                low=mid+1;

            }



            else{


                high=mid-1;

            }


        }



        System.out.println("Product Not Found");


    }






    public static void main(String args[]){



        Product p[] = {


            new Product(1,"Laptop","Electronics"),

            new Product(2,"Mobile","Electronics"),

            new Product(3,"Watch","Accessories"),

            new Product(4,"Tablet","Electronics")


        };




        System.out.println("Linear Search:");

        linearSearch(p,"Mobile");





        // sorted array for binary search

        Arrays.sort(p,(a,b)->
        a.pName.compareToIgnoreCase(b.pName));




        System.out.println("\nBinary Search:");

        binarySearch(p,"Tablet");


    }

}