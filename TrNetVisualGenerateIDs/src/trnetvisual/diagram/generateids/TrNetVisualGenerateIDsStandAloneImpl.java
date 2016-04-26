/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package trnetvisual.diagram.generateids;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;


/**
 * This example demonstrates using the 
 * Epsilon Object Language, the core language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class TrNetVisualGenerateIDsStandAloneImpl extends TrNetVisualGenerateIDsStandAlone {
	
	private String modelAbsolutePath;
	private String mmAbsolutePath;
	
	
	public TrNetVisualGenerateIDsStandAloneImpl(String modelAbsolutePath, String mmAbsolutePath){
		this.modelAbsolutePath = modelAbsolutePath;
		this.mmAbsolutePath = mmAbsolutePath;
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EolModule();
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
	public String getSource() throws Exception {
		return "GenerateIds.eol";
	}

	@Override
	public void postProcess() {
		
	}
	
}
