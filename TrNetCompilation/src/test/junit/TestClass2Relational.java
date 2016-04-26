package test.junit;

import junit.framework.Assert;

import org.junit.Test;

import DB.Database;
import DB.DatabaseElement;
import DB.Table;
import DB_visitor.DbOutputVisitor;
import class2relational.Class2RelationalTransformation;
import class2relationaloriginal.Class2RelationalOriginalTransformation;
import classes.CModel;
import classes_visitor.ClassesInputVisitor;

public class TestClass2Relational {

	@Test
	public void test1() {
		
		Database outMod1 = runOriginalTransformation();
		Database outMod2 = runGeneratedTransformation();
		
		roughtlySameDatabases(outMod1, outMod2);
	}

	private void roughtlySameDatabases(Database d1, Database d2) {
		
		Assert.assertEquals(d1.getContents().size(), d2.getContents().size());
		
		for (DatabaseElement e1 : d1.getContents()) {
			if (e1 instanceof Table) {
				boolean found = false;
				for (DatabaseElement e2 : d2.getContents()) {
					if (e2 instanceof Table) {
						if (e1.getName().equals(e2.getName())) {
							
							found = !found;
							
							roughtlySameTables((Table)e1, (Table)e2);
							
						}						
					}
				}
				Assert.assertTrue(found);				
			}
		}
		
	}

	private void roughtlySameTables(Table e1, Table e2) {
		Assert.assertEquals(e1 + " and " + e2 , e1.getColumns().size(), e2.getColumns().size());
		Assert.assertEquals(e1.getPrimaryKeys().size(), e2.getPrimaryKeys().size());
		
	}

	private Database runGeneratedTransformation() {
		ClassesInputVisitor inputv = new ClassesInputVisitor();

		DbOutputVisitor outputv = new DbOutputVisitor();
		
		Class2RelationalTransformation transformation = new Class2RelationalTransformation();
		
		transformation.registerInputClassesPublisher(inputv);

		transformation.registerOutputRelationalListener(outputv);
		
		CModel in = inputv.load("testing/TestClass2Relational/ClassModel.xmi");
		
		inputv.visitCModel(in);
		
		transformation.run();
		
		Database out = outputv.buildModel();
		
		outputv.store(out, "testing/TestClass2Relational/DatabaseOutGenerated.xmi");
		
		return out;
		
	}

	private Database runOriginalTransformation() {
		ClassesInputVisitor inputv = new ClassesInputVisitor();

		DbOutputVisitor outputv = new DbOutputVisitor();
		
		Class2RelationalOriginalTransformation transformation = new Class2RelationalOriginalTransformation();
		
		transformation.registerInputClassesPublisher(inputv);

		transformation.registerOutputRelationalListener(outputv);
		
		CModel in = inputv.load("testing/TestClass2Relational/ClassModel.xmi");
		
		inputv.visitCModel(in);
		
		transformation.run();
		
		Database out = outputv.buildModel();
		
		outputv.store(out, "testing/TestClass2Relational/DatabaseOutOriginal.xmi");
		
		return out;
	}

}
