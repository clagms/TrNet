package test;
import DB.Database;
import DB_visitor.DbOutputVisitor;
import class2relational.Class2RelationalTransformation;
import classes.CModel;
import classes_visitor.ClassesInputVisitor;


public class Main {
	
	public static void main(String[] args) {
		
		ClassesInputVisitor inputv = new ClassesInputVisitor();
		
		DbOutputVisitor outputv = new DbOutputVisitor();
		
		Class2RelationalTransformation transformation = new Class2RelationalTransformation();
		
		transformation.registerInputClassesPublisher(inputv);
		
		transformation.registerOutputRelationalListener(outputv);
		
		CModel s = inputv.load("model/CModel.xmi");
		
		final long check1 = System.currentTimeMillis();
		
		inputv.visitCModel(s);
		
		final long check2 = System.currentTimeMillis();
		
		transformation.run();
		
		final long check3 = System.currentTimeMillis();
		
		Database d = outputv.buildModel();
		
		final long check4 = System.currentTimeMillis();
		
		outputv.store(d, "model/DatabaseGenerated.xmi");

		System.out.println("VisitTime: " + (check2 - check1));
		System.out.println("RunTime: " + (check3 - check2));
		System.out.println("BuildTime: " + (check4 - check3));
	}

}
