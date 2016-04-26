package test.junit;

import junit.framework.Assert;
import minuml1.RootActivityGraph;
import minuml1_visitor.Minuml1InputVisitor;

import org.junit.Test;

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityNode;
import uml.RootPackage;
import uml_visitor.UmlOutputVisitor;
import activitymigrationgeneratedfromdsltransopt.ActivityMigrationGeneratedFromDSLTransOptTransformation;
import activitymigrationgeneratedfromdsltransoriginal.ActivityMigrationGeneratedFromDSLTransOriginalTransformation;

public class TestActivityMigrationFromDSLTransOpt {

	@Test
	public void test1() {
		
		uml.RootPackage outMod1 = runOriginalTransformation();
		uml.RootPackage outMod2 = runGeneratedTransformation();
		
		roughtlySamePackages(outMod1, outMod2);
	}

	private void roughtlySamePackages(RootPackage p1, RootPackage p2) {
		Assert.assertEquals(p1.getPackagedElement().size(), p2.getPackagedElement().size());
		
		Assert.assertEquals(p1.getPackagedElement().size(), 1);
		Assert.assertEquals(p2.getPackagedElement().size(), 1);
		
		Activity ag1 = (Activity) p1.getPackagedElement().get(0);
		Activity ag2 = (Activity) p2.getPackagedElement().get(0);

		roughlySameActivity(ag1, ag2);
	}

	private void roughlySameActivity(Activity ag1, Activity ag2) {
		Assert.assertEquals(ag1.getNode().size(), ag2.getNode().size());
		Assert.assertEquals(ag1.getEdge().size(), ag2.getEdge().size());
		
		for (ActivityNode n1 : ag1.getNode()) {
			boolean found = false;
			for (ActivityNode n2 : ag2.getNode()) {
				if (n1.getClass().toString().equals(n2.getClass().toString())) {
					if (n1.getName().equals(n2.getName())) {
						found = !found;
						roughlySameNode(n1,n2);
					}
				}
			}
			Assert.assertTrue(found);
		}
		
		for (ActivityEdge e1 : ag1.getEdge()) {
			if ( e1.getSource() != null && e1.getTarget() != null) {
				boolean found = false;
				for (ActivityEdge e2 : ag2.getEdge()) {
					if ( e2.getSource() != null && e2.getTarget() != null) {
						if (e1.getClass().toString().equals(e2.getClass().toString())
								&& e1.getSource().getName().equals(e2.getSource().getName())
								&& e1.getTarget().getName().equals(e2.getTarget().getName())
								) {
							found = true;
						}					
					}
				}
				Assert.assertTrue(found);				
			}
		}
		
		Assert.assertEquals(guardCount(ag1), guardCount(ag2));
	}
	
	private int guardCount(Activity a) {
		int c = 0;
		
		for (ActivityEdge e : a.getEdge()) {
			if (e.getGuard()!=null) {
				c++;
			}
		}
		
		return c;
	}

	private void roughlySameNode(ActivityNode n1, ActivityNode n2) {
		Assert.assertEquals(n1.getName(), n2.getName());
		Assert.assertEquals(n1.getIncoming().size(), n2.getIncoming().size());
		Assert.assertEquals(n1.getOutgoing().size(), n2.getOutgoing().size());
	}

	private uml.RootPackage runGeneratedTransformation() {
		
		Minuml1InputVisitor inputv = new Minuml1InputVisitor();

		UmlOutputVisitor outputv = new UmlOutputVisitor();

		ActivityMigrationGeneratedFromDSLTransOptTransformation transformation = new ActivityMigrationGeneratedFromDSLTransOptTransformation();

		transformation.registerInputModelPublisher(inputv);

		transformation.registerOutputLayer1migrated_modelListener(outputv);

		RootActivityGraph s = inputv.load("testing/TestActivityMigrationFromDSLTransOpt/random_model_100.xmi");

		inputv.visitRootActivityGraph(s);

		transformation.run();

		uml.RootPackage d = outputv.buildModel();

		outputv.store(d, "testing/TestActivityMigrationFromDSLTransOpt/Generated.xmi");
		
		return d;
		
	}

	private uml.RootPackage runOriginalTransformation() {
		
		Minuml1InputVisitor inputv = new Minuml1InputVisitor();

		UmlOutputVisitor outputv = new UmlOutputVisitor();

		ActivityMigrationGeneratedFromDSLTransOriginalTransformation transformation = new ActivityMigrationGeneratedFromDSLTransOriginalTransformation();

		transformation.registerInputModelPublisher(inputv);

		transformation.registerOutputLayer1migrated_modelListener(outputv);

		RootActivityGraph s = inputv.load("testing/TestActivityMigrationFromDSLTransOpt/random_model_100.xmi");

		inputv.visitRootActivityGraph(s);

		transformation.run();

		uml.RootPackage d = outputv.buildModel();

		outputv.store(d, "testing/TestActivityMigrationFromDSLTransOpt/Original.xmi");
		
		return d;
	}

}
