package utils;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.selectors.BaseExtendSelector;

public class ImplicitAlreadyDecomposedSelector extends BaseExtendSelector {

	@Override
	public boolean isSelected(File basedir, String filename, File file)
			throws BuildException {
		
		if (! file.isDirectory()){
			File dir = file.getParentFile();
			for (File child : dir.listFiles()) {
				if (child.isDirectory()){
					return false;
				}
			}
		}
		
		return true;
	}

}
