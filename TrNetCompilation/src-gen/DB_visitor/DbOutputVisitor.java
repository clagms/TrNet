package DB_visitor;

import DB.*;
import generic.*;

import DB.NamedElement;
import DB.Database;
import DB.DatabaseElement;
import DB.Table;
import DB.Column;
import DB.Type;
import DB.ForeignKey;

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class DbOutputVisitor
implements ModelPatternListener
{
	
	HashSet<ModelNode> NamedElementSet;
	HashMap<ModelNode, NamedElement> modelNode2NamedElement;
	HashSet<ModelNode> DatabaseSet;
	HashMap<ModelNode, Database> modelNode2Database;
	HashSet<ModelNode> DatabaseElementSet;
	HashMap<ModelNode, DatabaseElement> modelNode2DatabaseElement;
	HashSet<ModelNode> TableSet;
	HashMap<ModelNode, Table> modelNode2Table;
	HashSet<ModelNode> ColumnSet;
	HashMap<ModelNode, Column> modelNode2Column;
	HashSet<ModelNode> TypeSet;
	HashMap<ModelNode, Type> modelNode2Type;
	HashSet<ModelNode> ForeignKeySet;
	HashMap<ModelNode, ForeignKey> modelNode2ForeignKey;
	HashMap<ModelNode, LinkedList<ModelPattern>> DatabaseContentsDatabaseElementMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> TableColumnsColumnMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> TablePrimaryKeysColumnMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ColumnTypeTypeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ForeignKeySourceColumnMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ForeignKeyTargetColumnMap;
	
	public DbOutputVisitor() {
	NamedElementSet = new HashSet<ModelNode>(10);
	modelNode2NamedElement = new HashMap<ModelNode, NamedElement>(10);
	DatabaseSet = new HashSet<ModelNode>(10);
	modelNode2Database = new HashMap<ModelNode, Database>(10);
	DatabaseElementSet = new HashSet<ModelNode>(10);
	modelNode2DatabaseElement = new HashMap<ModelNode, DatabaseElement>(10);
	TableSet = new HashSet<ModelNode>(10);
	modelNode2Table = new HashMap<ModelNode, Table>(10);
	ColumnSet = new HashSet<ModelNode>(10);
	modelNode2Column = new HashMap<ModelNode, Column>(10);
	TypeSet = new HashSet<ModelNode>(10);
	modelNode2Type = new HashMap<ModelNode, Type>(10);
	ForeignKeySet = new HashSet<ModelNode>(10);
	modelNode2ForeignKey = new HashMap<ModelNode, ForeignKey>(10);
	DatabaseContentsDatabaseElementMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	TableColumnsColumnMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	TablePrimaryKeysColumnMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ColumnTypeTypeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ForeignKeySourceColumnMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ForeignKeyTargetColumnMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	}
	
	public void store(Database element, String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(path));

		resource.getContents().add(element);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public void notify(ModelPattern element){
		if (element.nodes.size() == 1 && element.edges.size() == 0) {
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("NamedElement") ||
		node.types.contains("DatabaseElement") ||
		node.types.contains("Table") ||
		node.types.contains("Column") ||
		node.types.contains("Type") ||
		node.types.contains("ForeignKey") ||
		false ) {
				node.types.add("NamedElement");
	NamedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Database") ||
		false ) {
				node.types.add("Database");
	DatabaseSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("DatabaseElement") ||
		node.types.contains("Table") ||
		node.types.contains("Type") ||
		node.types.contains("ForeignKey") ||
		false ) {
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("DatabaseElement");
	DatabaseElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Table") ||
		false ) {
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("DatabaseElement");
	DatabaseElementSet.add(node);
				node.types.add("Table");
	TableSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Column") ||
		false ) {
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("Column");
	ColumnSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Type") ||
		false ) {
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("DatabaseElement");
	DatabaseElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ForeignKey") ||
		false ) {
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("ForeignKey");
	ForeignKeySet.add(node);
				node.types.add("DatabaseElement");
	DatabaseElementSet.add(node);
		}
	}
		} else if (element.nodes.size() == 2 && element.edges.size()==1) {
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Database") ||
 false)
			&& edge.name.equals("contents") &&
			( false 			|| edge.target.types.contains("DatabaseElement")
			|| edge.target.types.contains("Table")
			|| edge.target.types.contains("Type")
			|| edge.target.types.contains("ForeignKey")
)
		    ) {
	if (!DatabaseContentsDatabaseElementMap.containsKey(edge.source)) {
		DatabaseContentsDatabaseElementMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	DatabaseContentsDatabaseElementMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Table") ||
 false)
			&& edge.name.equals("columns") &&
			( false 			|| edge.target.types.contains("Column")
)
		    ) {
	if (!TableColumnsColumnMap.containsKey(edge.source)) {
		TableColumnsColumnMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	TableColumnsColumnMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Table") ||
 false)
			&& edge.name.equals("primaryKeys") &&
			( false 			|| edge.target.types.contains("Column")
)
		    ) {
	if (!TablePrimaryKeysColumnMap.containsKey(edge.source)) {
		TablePrimaryKeysColumnMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	TablePrimaryKeysColumnMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Column") ||
 false)
			&& edge.name.equals("type") &&
			( false 			|| edge.target.types.contains("Type")
)
		    ) {
	if (!ColumnTypeTypeMap.containsKey(edge.source)) {
		ColumnTypeTypeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ColumnTypeTypeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ForeignKey") ||
 false)
			&& edge.name.equals("source") &&
			( false 			|| edge.target.types.contains("Column")
)
		    ) {
	if (!ForeignKeySourceColumnMap.containsKey(edge.source)) {
		ForeignKeySourceColumnMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ForeignKeySourceColumnMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ForeignKey") ||
 false)
			&& edge.name.equals("target") &&
			( false 			|| edge.target.types.contains("Column")
)
		    ) {
	if (!ForeignKeyTargetColumnMap.containsKey(edge.source)) {
		ForeignKeyTargetColumnMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ForeignKeyTargetColumnMap.get(edge.source).add(element);
		}
	}
		} else {
			throw new RuntimeException("Unexpected pattern found.");
		}
	}
	
	public Database buildModel() {
		return buildDatabase();
	}
	
	Database buildDatabase() {
		for (ModelNode node : DatabaseSet) {
			Database result =  modelNode2Database.get(node);
			
			if (result == null) {
				result = DBFactory.eINSTANCE.createDatabase();
				modelNode2Database.put(node, result); // coloca ja o elemento no mapa por causa das futuras referencias com target neste elemento.
					createAssocDatabaseContents(result, node);
			}
			
			
			return result;
		}
		
		return null;
	}
	
	void createAssocDatabaseContents(Database modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = DatabaseContentsDatabaseElementMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("DatabaseElement")) {
	
	if (targetNode.types.contains("Table")) {
	if (TableSet.contains(targetNode)) { 
		
		Table targetElement = modelNode2Table.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createTable();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Table.put(targetNode, targetElement);
		}
	createNonContainmentAssocTablePrimaryKeys(targetElement, targetNode);
			createAssocTableColumns(targetElement, targetNode);
		
		modelElement.getContents().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("Type")) {
	if (TypeSet.contains(targetNode)) { 
		
		Type targetElement = modelNode2Type.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createType();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Type.put(targetNode, targetElement);
		}
		
		modelElement.getContents().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ForeignKey")) {
	if (ForeignKeySet.contains(targetNode)) { 
		
		ForeignKey targetElement = modelNode2ForeignKey.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createForeignKey();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2ForeignKey.put(targetNode, targetElement);
		}
	createNonContainmentAssocForeignKeyTarget(targetElement, targetNode);
	createNonContainmentAssocForeignKeySource(targetElement, targetNode);
		
		modelElement.getContents().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createAssocTableColumns(Table modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = TableColumnsColumnMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("Column")) {
	if (ColumnSet.contains(targetNode)) { 
		
		Column targetElement = modelNode2Column.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createColumn();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Column.put(targetNode, targetElement);
		}
	createNonContainmentAssocColumnType(targetElement, targetNode);
		
		modelElement.getColumns().add(targetElement);
	}
	}
		}
	}
	
	void createNonContainmentAssocTablePrimaryKeys(Table modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = TablePrimaryKeysColumnMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("Column")) {
	if (ColumnSet.contains(targetNode)) { 
		
		Column targetElement = modelNode2Column.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createColumn();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Column.put(targetNode, targetElement);
		}
		
		modelElement.getPrimaryKeys().add(targetElement);
	}
	}
		}
	}
	void createNonContainmentAssocColumnType(Column modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ColumnTypeTypeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("Type")) {
	if (TypeSet.contains(targetNode)) { 
		
		Type targetElement = modelNode2Type.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createType();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Type.put(targetNode, targetElement);
		}
		
		modelElement.setType(targetElement);
		break;
	}
	}
		}
	}
	void createNonContainmentAssocForeignKeySource(ForeignKey modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ForeignKeySourceColumnMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("Column")) {
	if (ColumnSet.contains(targetNode)) { 
		
		Column targetElement = modelNode2Column.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createColumn();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Column.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
		}
	}
	void createNonContainmentAssocForeignKeyTarget(ForeignKey modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ForeignKeyTargetColumnMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("Column")) {
	if (ColumnSet.contains(targetNode)) { 
		
		Column targetElement = modelNode2Column.get(targetNode);
		
		if (targetElement == null) {
			targetElement = DBFactory.eINSTANCE.createColumn();
			targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Column.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
		}
	}
	
}

