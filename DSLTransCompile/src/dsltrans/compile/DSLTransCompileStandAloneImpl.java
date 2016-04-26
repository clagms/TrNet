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
package dsltrans.compile;

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
public class DSLTransCompileStandAloneImpl extends DSLtransCompileStandAlone {
	
	private String dsltransModelAbsolutePath;
	private String dsltransMetamodelAbsolutePath;
	private String trnetModelAbsolutePath;
	private String trnetMetamodelAbsolutePath;
	
	
	public DSLTransCompileStandAloneImpl(String dsltransModelAbsolutePath, String dsltransMetamodelAbsolutePath, String trnetModelAbsolutePath, String trnetMetamodelAbsolutePath){
		this.dsltransModelAbsolutePath = dsltransModelAbsolutePath;
		this.dsltransMetamodelAbsolutePath = dsltransMetamodelAbsolutePath;
		this.trnetModelAbsolutePath = trnetModelAbsolutePath;
		this.trnetMetamodelAbsolutePath = trnetMetamodelAbsolutePath;
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("DSLTransModel", dsltransModelAbsolutePath, dsltransMetamodelAbsolutePath, true, false));
		models.add(createEmfModel("TrNetModel", trnetModelAbsolutePath, trnetMetamodelAbsolutePath, false, true));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "DSLTrans2TrNet.etl";
	}

	@Override
	public void postProcess() {
		
	}
	
}
