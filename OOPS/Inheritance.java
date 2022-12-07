class Cars{
    String company;
    int year;
    int model;
   private String ownerName;
   
   void setName(String ownerName){
        this.ownerName = ownerName;
   }
   void getData(){
    System.out.println("COMPANY = "+this.company+
    "\n"+"YEAR = "+this.year+
    "\n"+"MODEL = "+this.model+
    "\n"+"OWNERNAME = "+this.ownerName+"\n");
   }
}

class BMW extends Cars {             //SINGLE LEVEL INHERITANCE
    void fullForm(){
        System.out.println("Bayerische Motoren Werke AG");
    }
}
class Series7 extends BMW{          //MULTILEVEL INHERITANCE
    void Price(){
        System.out.println("PRICE IS 1.51 CRORES");
    }
}

class Audi extends Cars{          //HIEARCHICAL INHERITANCE
    void price(){
        System.out.println("PRICE IS 2.3 CRORES");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.company = "AUDI";
        c1.year = 2024;
        c1.model = 8;
        c1.setName("ARUSH GUPTA");

        c1.getData();

        BMW c2 = new BMW();
        c2.company = "BMW";
        c2.model = 7;
        c2.year = 2023;
        c2.fullForm();
        c2.setName("ARUSH GUPTA");
        c2.getData();

        Series7 c3 = new Series7();
        c3.company = "BMW";
        c3.model = 365;
        c3.year = 2024;
        c3.setName("ARUSH GUPTA");
        c3.fullForm();
        c3.Price();
        c3.getData();

        Audi c4 = new Audi();
        c4.company = "AUDI";
        c4.model = 83;
        c4.year = 2028;
        c4.price();
        c4.setName("ARUSH GUPTA");
        c4.getData();
    }
}
