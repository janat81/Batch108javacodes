package interviewquestions;

public class ExceptionAndReadingMethodAndReadLineMethod {

    /*
    If they ask us to type code to read a text...We should say do you want me to type reading code with read()
    letter by letter or readLine().They do think that you know enough knowledge about java.
    Firstly create a text file==>for reading one by one
    public static void main(String[] args) {
        try {
            FileInputStream fis=  new FileInputStream("src\\main\\java\\day29Exception02\\TextFile01");

                    int i=0; //to check ascıı value of the typed char.s
            while ((i= fis.read()) != -1){ //while typing read() gives CTE bec. java is worried if there is no file or file is deleted. so we choose more
                                           //actions and then "Add try-catch" clauses to the syntax
                System.out.println((char)i); //telling java to check the typed char.s if their ascii value is greater than -1 java will print each char.
                                            //after converting them into char data type.If there is no char at the end then java will give -1 value
                                            //which means while ((i=fis.read()) != -1))==> this is false then the remaining part of the code not executed.
            }
        } catch (IOException e) { //by choosing IOException class we are telling to java if there is a problem with the address of the file,
                                // ask for help by using "Add try-catch blocks" when read() is typed
                                //you can type multiple "catch blocks"
            e.printStackTrace();
        }
    }
}

            If they ask to type code readLine() long lines instead of reading one by one
            firstly create a long text for readLine().
             public static void main(String[] args) {
        try { //normally we just typed ==>BufferedReader br= new BufferedReader(new FileReader("src\\main\\java\\day29Exception02\\TextFile01"));
               //java gave CTE bec. it is not sure about the correctness of the path for the file or the existence of the file so we come over
            // FileReader class name and chose add try-catch clauses.

           BufferedReader br= new BufferedReader(new FileReader("src\\main\\java\\day29Exception02\\TextFile01"));

             String line= br.readLine();
             while (line != null){
                 System.out.println(line);
                 line= br.readLine(); //by this way java will repeat the action, each line will be printed in order.
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }








     */
    }

