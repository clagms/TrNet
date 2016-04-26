package dsltranscomp;

import minuml1.RootActivityGraph;
import minuml1_visitor.Minuml1InputVisitor;
import trnettransformation.TrNetTransformationTransformation;
import uml_visitor.UmlOutputVisitor;

public class Main {

	public static void main(String[] args) {
		Minuml1InputVisitor inputv = new Minuml1InputVisitor();

		UmlOutputVisitor outputv = new UmlOutputVisitor();

		TrNetTransformationTransformation transformation = new TrNetTransformationTransformation();
		
		transformation.registerDsltrans_benchmark_50Publisher(inputv);

		transformation.registerOutputLayer1migrated_modelListener(outputv);

		final long check1 = System.currentTimeMillis();

		RootActivityGraph s = inputv.load("../TrNetCompilation/model/dsltrans_benchmark_500000.xmi");

		inputv.visitRootActivityGraph(s);

		final long check2 = System.currentTimeMillis();

		transformation.run();

		final long check3 = System.currentTimeMillis();

		uml.RootPackage d = outputv.buildModel();

		outputv.store(d, "evolve_model_generated.xmi");

		final long check4 = System.currentTimeMillis();
		
		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
		System.out.println("Total: " + (check4 - check1));
		
	}

}
