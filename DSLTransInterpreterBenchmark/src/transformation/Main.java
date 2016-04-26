package transformation;


import java.io.File;

import transformerProcessor.TransformerProcessor;

public class Main {

	public static void main(String[] args) {
		String projectDir = new File(".").getAbsolutePath();
		String transformation = new File("./transformation/ActivityDiagramMigration.dsltrans").getAbsolutePath();
		
		try {
			
			run(transformation, projectDir);
			
		} catch (Throwable e) {
			System.err.println("Error running transformation: " + transformation);
			e.printStackTrace();
		}
	}

	private static void run(String transformation, String projectDir) throws Throwable {
		System.out.println("-----------------------");
		System.gc();
		TransformerProcessor tP = new TransformerProcessor(projectDir);
		final long beforeLoad = System.currentTimeMillis();
		tP.LoadModel(transformation);
		final long beforeExecute= System.currentTimeMillis();
		tP.Execute();
		final long afterExecute = System.currentTimeMillis();
		System.out.println("LoadTime: " + (beforeExecute - beforeLoad));
		System.out.println("ExecuteTime: " + (afterExecute - beforeExecute));
		System.out.println("Total: " + (afterExecute - beforeLoad));
		System.out.println("-----------------------");
	}

}
