package benchmark;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Random;

import minuml1.BooleanExpression;
import minuml1.CompositeState;
import minuml1.Guard;
import minuml1.Minuml1Factory;
import minuml1.Partition;
import minuml1.Pseudostate;
import minuml1.PseudostateKind;
import minuml1.RootActivityGraph;
import minuml1.State;
import minuml1.StateVertex;
import minuml1.Transition;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class BuildRandomActivityDiagramModel {
	
	static int N = 500000;
	
	public static void main(String[] args) {
		
		RootActivityGraph activityGraph = Minuml1Factory.eINSTANCE.createRootActivityGraph();
		activityGraph.setName("graph");
		
		activityGraph.setTop(createCompositeState());
		
		int transitionsToCreate = N;
		
		Random randomState = new Random();
		Random randomBool = new Random();
		
		while(transitionsToCreate > 0){
			Transition transition = Minuml1Factory.eINSTANCE.createTransition();
			
			int sourceStateIdx = randomState.nextInt(N-1); // exclude the top state
			int targetStateIdx = randomState.nextInt(N-1); // exclude the top state
			while (targetStateIdx == sourceStateIdx){
				targetStateIdx = randomState.nextInt(N-1); 
			}
			
			StateVertex sourceState = ((CompositeState)activityGraph.getTop()).getSubvertex().get(sourceStateIdx);
			StateVertex targetState = ((CompositeState)activityGraph.getTop()).getSubvertex().get(targetStateIdx);
			
			transition.setSource(sourceState);
			transition.setTarget(targetState);
			
			transition.setName(sourceState.getName() + "__" + targetState.getName());
			
			if (randomBool.nextBoolean()){
				transition.setGuard(createGuard(transitionsToCreate));
			}
			
			activityGraph.getTransitions().add(transition);
			
			transitionsToCreate--;
		}
		
		
		int partitionsToCreate = N/10;
		
		while (partitionsToCreate > 0) {
			
			createPartition(partitionsToCreate, activityGraph, randomState);
			
			partitionsToCreate--;
		}
		
		
		store(activityGraph, "dsltrans_benchmark_"+N+".xmi");
	}
	
	private static void createPartition(int n,
			RootActivityGraph activityGraph, Random randomState) {
		Partition partition = Minuml1Factory.eINSTANCE.createPartition();
		partition.setName("Partition"+n);
		
		for (int i = 0; i < 5; i++) {
			int sourceStateIdx = randomState.nextInt(N-1); // exclude the top state
			StateVertex state = ((CompositeState)activityGraph.getTop()).getSubvertex().get(sourceStateIdx);
			partition.getContents().add(state);
		}
		
		activityGraph.getPartition().add(partition);
	}

	private static Guard createGuard(int n) {
		Guard guard = Minuml1Factory.eINSTANCE.createGuard();
		BooleanExpression exp = Minuml1Factory.eINSTANCE.createBooleanExpression();
		exp.setBody("Bool"+n);
		guard.setExpression(exp);
		return guard;
	}

	public static void store(RootActivityGraph element, String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(path));

		resource.getContents().add(element);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static State createCompositeState() {
		CompositeState compositeState = Minuml1Factory.eINSTANCE.createCompositeState();
		compositeState.setName("CompositeState" + N);
		int numberOfStatesToCreate = N - 1 ;
		
		Random randomStateVertexSubtype = new Random();
		
		while(numberOfStatesToCreate > 0){
			StateVertex randomState = createRandomState(numberOfStatesToCreate, randomStateVertexSubtype);
			compositeState.getSubvertex().add(randomState);
			numberOfStatesToCreate--;
		}
		
		return compositeState;
	}

	private static StateVertex createRandomState(int n,
			Random randomStateVertexSubtype) {
		StateVertex result = null;
		int choice = randomStateVertexSubtype.nextInt(7);
		switch (choice) {
		case 0:
			result = Minuml1Factory.eINSTANCE.createObjectFlowState();
			result.setName("ObjectFlowState" + n);
			
			break;
		case 1:
			result = Minuml1Factory.eINSTANCE.createActionState();
			result.setName("ActionState" + n);
			
			break;
		case 2:
			result = Minuml1Factory.eINSTANCE.createFinalState();
			result.setName("FinalState" + n);
			
			break;
		case 3:
			result = Minuml1Factory.eINSTANCE.createPseudostate();
			((Pseudostate)result).setKind(PseudostateKind.INITIAL);
			result.setName("PseudostateInitial" + n);
			
			break;
		case 4:
			result = Minuml1Factory.eINSTANCE.createPseudostate();
			((Pseudostate)result).setKind(PseudostateKind.JUNCTION);
			result.setName("PseudostateJunction" + n);
			
			break;
		case 5:
			result = Minuml1Factory.eINSTANCE.createPseudostate();
			((Pseudostate)result).setKind(PseudostateKind.FORK);
			result.setName("PseudostateFork" + n);
			
			break;
		case 6:
			result = Minuml1Factory.eINSTANCE.createPseudostate();
			((Pseudostate)result).setKind(PseudostateKind.JOIN);
			result.setName("PseudostateJoin" + n);
			
			break;
		default:
			break;
		}
		
		return result;
	}

}
