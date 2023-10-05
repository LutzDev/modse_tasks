import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pertiNetz2.Marke;
import pertiNetz2.PertiNetz2Factory;
import pertiNetz2.PertiNetz2Package;
import pertiNetz2.Petrinetz;
import pertiNetz2.Stelle;
import pertiNetz2.Transition;

public class Interpreter {
	private PertiNetz2Package pk= PertiNetz2Package.eINSTANCE;
	private PertiNetz2Factory factory= PertiNetz2Factory.eINSTANCE;
	Petrinetz petrinetz;
	EList<Stelle> stellen;
	EList<Transition> transitionen;
	
	public Interpreter(String filename) {
		pk= PertiNetz2Package.eINSTANCE;
		factory= PertiNetz2Factory.eINSTANCE;
		
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = resSet.getResource(URI.createURI(filename), true);
	    
	    petrinetz = (Petrinetz) resource.getContents().get(0);
	    stellen= petrinetz.getStellen();
	    transitionen= petrinetz.getTransition();
	}
	
	public void printPetriNetz() {
		EList<Stelle> stellen= petrinetz.getStellen();
		EList<Transition> transitionen= petrinetz.getTransition();
		
		System.out.println("Petrinetz:");
		System.out.println("______________________________");
		
		for(Stelle stelle : stellen){
			EList<Marke> marken = stelle.getMarken();
			System.out.println("Stelle " + stelle.getName()+ ", Anzahl Marken: "+ marken.size() );
		}
		ArrayList<Transition> verfuegbar= getVerfuegbareTransitionen();	
		
		System.out.println("______________________________");
		System.out.println("Verfügbare Transitionen: ");
		
		for (Transition value : verfuegbar) {
			System.out.println("Transition "+ value.getName());
		}
	}
	
	public ArrayList<Transition> getVerfuegbareTransitionen (){
		ArrayList<Transition> verfuegbar= new ArrayList<Transition>();
		
		for (Transition transition : transitionen){
			EList<Stelle> input= transition.getInput();
			
			int stelleMitMarkeCount= 0;
			for (Stelle value : input){
				if(!value.getMarken().isEmpty()) {
					stelleMitMarkeCount++;
				}
			}
			
			if(stelleMitMarkeCount == input.size()) {
				verfuegbar.add(transition);
			} 
		}
		
		return verfuegbar;
	}
	
	public boolean interpretPetriNetz(String transitionsName) {
		Transition transition= null;
		
		boolean transitionMoeglich= false;
		
		for (Transition value : transitionen) {
			if(value.getName().equals(transitionsName)) {
				transition= value;
			}
		}
		
		if (transition!=null) {
			EList<Stelle> input= transition.getInput();
			EList<Stelle> output= transition.getOutput();
			
			int stelleMitMarkeCount= 0;
			for(Stelle value : input) {
				EList<Marke> marken= value.getMarken();
				
				if(!marken.isEmpty()) {
					stelleMitMarkeCount++;
				}
				
			}
			
			if(stelleMitMarkeCount == input.size()) {
				transitionMoeglich= true;
				for(Stelle value : input) {
					EList<Marke> marken= value.getMarken();
					
					marken.remove(0);	
				}
				
				for(Stelle value : output){
					EList<Marke> marken= value.getMarken();
					
					marken.add(factory.createMarke());
				}
			}
			
		} 
		
		return transitionMoeglich;
	}
}
