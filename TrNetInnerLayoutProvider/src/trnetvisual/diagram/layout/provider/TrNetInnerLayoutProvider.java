package trnetvisual.diagram.layout.provider;

import java.util.Iterator;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.providers.LeftRightProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.Operator;
import trnetvisual.Pattern;

public class TrNetInnerLayoutProvider extends LeftRightProvider{
	public static String DEFAULT_LAYOUT = "Default";
	 
    public boolean provides(IOperation operation) {
        
    	Assert.isNotNull(operation);
    	
    	// enable this provider only on trnetvisual diagrams
        if (operation instanceof ILayoutNodeOperation) {
            Iterator nodes = ((ILayoutNodeOperation) operation)
                .getLayoutNodes().listIterator();
            if (nodes.hasNext()) {
                View node = ((ILayoutNode) nodes.next()).getNode();
                Diagram container = node.getDiagram();
                
                if (container == null
                      || !(container.getType().equals("Trnetvisual"))) //$NON-NLS-1$
                      return false;
                		
                // do not provide layout service to top level elements.
                {
	                if (node.getElement() instanceof Pattern)
	                	return false;
	                
	                if (node.getElement() instanceof Operator)
	                	return false;
	                
	                if (node.getElement() instanceof ExternalAttributeCalculationCall)
	                	return false;
                }
                
            }
        } else {
            return false;
        }
    	
        IAdaptable layoutHint = ((ILayoutNodeOperation) operation)
            .getLayoutHint();
        String layoutType = (String) layoutHint.getAdapter(String.class);
        return LayoutType.DEFAULT.equals(layoutType);
    }

}
