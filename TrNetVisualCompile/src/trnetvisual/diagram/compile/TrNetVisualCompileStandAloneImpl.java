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
package trnetvisual.diagram.compile;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;


/**
 * This example demonstrates using the 
 * Epsilon Object Language, the core language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class TrNetVisualCompileStandAloneImpl extends TrNetVisualCompileStandAlone {
	
	private String visualModelAbsolutePath;
	private String visualMetamodelAbsolutePath;
	private String coreModelAbsolutePath;
	private String coreMetamodelAbsolutePath;
	
	
	public TrNetVisualCompileStandAloneImpl(String visualModelAbsolutePath, String visualMetamodelAbsolutePath, String coreModelAbsolutePath, String coreMetamodelAbsolutePath){
		this.visualModelAbsolutePath = visualModelAbsolutePath;
		this.visualMetamodelAbsolutePath = visualMetamodelAbsolutePath;
		this.coreModelAbsolutePath = coreModelAbsolutePath;
		this.coreMetamodelAbsolutePath = coreMetamodelAbsolutePath;
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("VisualModel", visualModelAbsolutePath, visualMetamodelAbsolutePath, true, true));
		models.add(createEmfModel("CoreModel", coreModelAbsolutePath, coreMetamodelAbsolutePath, false, true));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "TrNetVisual2TrNet.etl";
	}

	@Override
	public void postProcess() {
		
	}
	
}
