package trnetvisual.diagram.validate;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;


public class TrNetVisualValidateStandAloneImpl extends TrNetVisualValidateStandAlone {

	private String modelAbsolutePath;
	private String mmAbsolutePath;
	
	public TrNetVisualValidateStandAloneImpl(String modelAbsolutePath, String mmAbsolutePath){
		this.modelAbsolutePath = modelAbsolutePath;
		this.mmAbsolutePath = mmAbsolutePath;
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EvlModule();
	}


	@Override
	public String getSource() throws Exception {
		return "GenerateIds.eol";
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		String metamodelURIString = getMetamodelFromBundle();
		String modelURIString = getCurrentEditingModel();
		models.add(createEmfModel("VisualModel", modelURIString, metamodelURIString, true, true));
		return models;
	}
	
	private String getMetamodelFromBundle() {
		return this.mmAbsolutePath;
	}

	private String getCurrentEditingModel() {
		return modelAbsolutePath;
	}
	
	@Override
	public void postProcess() {
		
	}

}
