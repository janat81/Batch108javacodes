package day23encapsulationabstraction;

public class Student {

    public String name= "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;
    private String disease = "Heart Disease";
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getStdGpa() {
        return stdGpa;
    }
   public String getDisease(){
        return disease;
   }

     //If the data type is "boolean" get method starts with "is"
    public boolean isSuccessful() {
        return successful;
    }


    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setStdGpa(double gpa){
        this.stdGpa = gpa;
    }

    //Even the data type is boolean we use "set" at the beginning of the method
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public static void main(String[] args) {



        /*
                                  Encapsulation.
            Encapsulation is "data hiding"
            To hide a data  we make the access modifier "private"
            After "hiding data", you may need to "read" or "update" the data.
            To "read" or "update" the data we will create some methods.
            To read "encapsulated data" you should create "get()" methods, we name it "getters"
            To update "encapsulated data" you should create "set()" methods, we name it "setters"
         */



        }


    }

