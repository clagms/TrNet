package test;

import DB.Database;
import DB_visitor.DbOutputVisitor;
import class2relationalexplicitmed.Class2RelationalExplicitMedTransformation;
import classes.CModel;
import classes_visitor.ClassesInputVisitor;

public class Main {

	public static void main(String[] args) {
		//mainModelHierarchy(args);
		//mainDescendAttributesAnalysis(args);
		//mainActivityDiagramAnalisys(args);
		//mainActivityDiagramGeneratedAnalysis(args);
		mainClass2Relational(args);
	}
	
	private static void mainClass2Relational(String[] args) {
		ClassesInputVisitor inputv = new ClassesInputVisitor();

		DbOutputVisitor outputv = new DbOutputVisitor();

		Class2RelationalExplicitMedTransformation transformation = new Class2RelationalExplicitMedTransformation();

		transformation.registerTrNetOp1Publisher(inputv);
		//transformation.registerInputClassesPublisher(inputv);

		transformation.registerTrNetOp3Listener(outputv);
		//transformation.registerOutputRelationalListener(outputv);

		CModel s = inputv.load("../RandomClassModelGeneration/Random_10000.xmi");

		final long check1 = System.currentTimeMillis();

		inputv.visitCModel(s);

		final long check2 = System.currentTimeMillis();

		transformation.run();
		
		final long check3 = System.currentTimeMillis();

		Database d = outputv.buildModel();

		final long check4 = System.currentTimeMillis();

		outputv.store(d, "model/DatabaseOut.xmi");
		
		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
		System.out.println("Total: " + (check4 - check1));
	}

	/*
	
	private static void mainClass2RelationalAnalysis(String[] args) {
		ClassesInputVisitor inputv = new ClassesInputVisitor();

		DbOutputVisitor outputv = new DbOutputVisitor();

		Class2RelationalExplicitMaxTransformation transformation = new Class2RelationalExplicitMaxTransformation();

		transformation.registerTrNetOp1Publisher(inputv);

		transformation.registerTrNetOp3Listener(outputv);

		CModel s = inputv.load("model/Random_100.xmi");

		final long check1 = System.currentTimeMillis();

		inputv.visitCModel(s);

		final long check2 = System.currentTimeMillis();

		transformation.run();
		
		final long check3 = System.currentTimeMillis();

		Database d = outputv.buildModel();

		final long check4 = System.currentTimeMillis();

		outputv.store(d, "model/DatabaseOut.xmi");
		
		transformation.generateOutputCSVStats("model");
		
		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
		System.out.println("Total: " + (check4 - check1));
		
		System.out.println("Profiling: ");
		System.out.println("Total Operators: " + transformation.totalNumberOfOperatorsInTheNetwork);
		System.out.println("Total Patterns: " + transformation.totalNumberOfPatternsInTheNetwork);
		System.out.println("Total Combinations Perfomed: " + transformation.totalCombinationsCounter);
		System.out.println("Total Placements Performed: " + transformation.totalElementPlacementCounter);
		
	}
	
	
	private static void mainActivityDiagramGeneratedAnalysis(String[] args) {
		Minuml1InputVisitor inputv = new Minuml1InputVisitor();

		UmlOutputVisitor outputv = new UmlOutputVisitor();

		ActivityMigrationGeneratedFromDSLTransOptTransformation transformation = new ActivityMigrationGeneratedFromDSLTransOptTransformation();

		transformation.registerInputModelPublisher(inputv);

		transformation.registerOutputLayer1migrated_modelListener(outputv);

		RootActivityGraph s = inputv.load("model/random_model_10000.xmi");

		final long check1 = System.currentTimeMillis();

		inputv.visitRootActivityGraph(s);

		final long check2 = System.currentTimeMillis();

		transformation.run();

		final long check3 = System.currentTimeMillis();

		uml.RootPackage d = outputv.buildModel();

		final long check4 = System.currentTimeMillis();

		outputv.store(d, "model/evolve_model_generated.xmi");
		
		//transformation.generateOutputCSVStats("model");
		
		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
		System.out.println("Total: " + (check4 - check1));
		
		
//		System.out.println("Profiling: ");
//		System.out.println("Total Operators: " + transformation.totalNumberOfOperatorsInTheNetwork);
//		System.out.println("Total Patterns: " + transformation.totalNumberOfPatternsInTheNetwork);
//		System.out.println("Total Combinations Perfomed: " + transformation.totalCombinationsCounter);
//		System.out.println("Total Placements Performed: " + transformation.totalElementPlacementCounter);
		
	}
	*/

	/*
	private static void mainActivityDiagramAnalisys(String[] args) {

		Minuml1InputVisitor inputv = new Minuml1InputVisitor();

		UmlOutputVisitor outputv = new UmlOutputVisitor();

		ActivityMigrationTransformation transformation = new ActivityMigrationTransformation();

		transformation.registerOriginalInputPublisher(inputv);

		transformation.registerEvolvedOutputListener(outputv);

		RootActivityGraph s = inputv.load("model/random_model_10000.xmi");

		final long check1 = System.currentTimeMillis();

		inputv.visitRootActivityGraph(s);

		final long check2 = System.currentTimeMillis();

		transformation.run();

		final long check3 = System.currentTimeMillis();

		uml.RootPackage d = outputv.buildModel();

		final long check4 = System.currentTimeMillis();

		outputv.store(d, "model/evolve_model.xmi");
		
		//transformation.generateOutputCSVStats("model");
		
		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
		System.out.println("Total: " + (check4 - check1));
		
		
		System.out.println("Profiling: ");
		System.out.println("Total Operators: " + transformation.totalNumberOfOperatorsInTheNetwork);
		System.out.println("Total Patterns: " + transformation.totalNumberOfPatternsInTheNetwork);
		System.out.println("Total Combinations Perfomed: " + transformation.totalCombinationsCounter);
		System.out.println("Total Placements Performed: " + transformation.totalElementPlacementCounter);
		
		
	}
	*/
	
	/*
	public static void mainActivityDiagram(String[] args) {

		Minuml1InputVisitor inputv = new Minuml1InputVisitor();

		UmlOutputVisitor outputv = new UmlOutputVisitor();

		ActivityMigrationTransformation transformation = new ActivityMigrationTransformation();

		transformation.registerOriginalInputPublisher(inputv);

		transformation.registerEvolvedOutputListener(outputv);

		ActivityGraph s = inputv.load("model/random_model_100000.xmi");

		final long check1 = System.currentTimeMillis();

		inputv.visitActivityGraph(s);

		final long check2 = System.currentTimeMillis();

		transformation.run();

		final long check3 = System.currentTimeMillis();

		uml.Package d = outputv.buildModel();

		final long check4 = System.currentTimeMillis();

		outputv.store(d, "model/evolve_model.xmi");

		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
		System.out.println("Total: " + (check4 - check1));

	}
	*/
	
	

}
