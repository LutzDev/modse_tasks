import java.util.Scanner;

public class InterpreterTest {

    public static void main(String[] args){
        
    	String filename1= "./model/Petrinetz.xmi";
    	String filename2= "./model/anbcn.xmi";
    	
    	Interpreter interpreter= new Interpreter(filename2);
    	interpreter.printPetriNetz();
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	while(true){
    		System.out.println("______________________________");
        	System.out.println("W�hle eine der m�glichen Transitionen aus");
        	String transition_name= scanner.nextLine();
        	
        	if(transition_name.equals("exit")) {
        		break;
        	}
        	
        	boolean transitionMoeglich= interpreter.interpretPetriNetz(transition_name);
        	
        	if(transitionMoeglich) {
            	interpreter.printPetriNetz();
        	} else {
        		System.out.println("Transition nicht m�glich");
        	}
    	}
    	
    	scanner.close();
    	System.out.println("Interpreter beendet");
    }
}
