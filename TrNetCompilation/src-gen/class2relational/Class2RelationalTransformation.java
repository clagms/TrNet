package class2relational;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;

import generic.*;

public class Class2RelationalTransformation
implements 			TrNetPat6InstanceListener
			,TrNetPat43InstanceListener
			,TrNetPat47InstanceListener
			,TrNetPat42InstanceListener
			,TrNetPat46InstanceListener
			,TrNetPat48InstanceListener
			,TrNetPat1InstanceListener
			,TrNetPat9InstancePublisher
			,TrNetPat5InstancePublisher
			,TrNetPat4InstancePublisher
			,TrNetPat12InstancePublisher
			,TrNetPat2InstancePublisher
			,AddTableToDatabaseInstancePublisher
			,TrNetPat11InstancePublisher
			,TrNetPat17InstancePublisher
			,TrNetPat10InstancePublisher
			,TrNetPat45InstancePublisher
			,TrNetPat15InstancePublisher
			,TrNetPat3InstancePublisher
			,TrNetPat16InstancePublisher
{
	public long totalElementPlacementCounter = 0;
	public long totalCombinationsCounter = 0;
	public int totalNumberOfOperatorsInTheNetwork = 47;
	public int totalNumberOfPatternsInTheNetwork = 53;
	InputClassesExternalInput inputInputClasses;
	OutputRelationalExternalOutput outputOutputRelational;
	ArrayList<TrNetPat1Instance> trNetPat1Array;
	HashSet<TrNetPat1Instance> trNetPat1Set; 
	ArrayList<TrNetPat2Instance> trNetPat2Array;
	HashSet<TrNetPat2Instance> trNetPat2Set; 
	ArrayList<TrNetPat6Instance> trNetPat6Array;
	HashSet<TrNetPat6Instance> trNetPat6Set; 
	ArrayList<TrNetPat7Instance> trNetPat7Array;
	HashSet<TrNetPat7Instance> trNetPat7Set; 
		HashMap<ModelNode, LinkedList<TrNetPat7Instance>> cClass0InTrNetPat7Hash;
	ArrayList<AddTableToDatabaseWithIDInstance> addTableToDatabaseWithIDArray;
	HashSet<AddTableToDatabaseWithIDInstance> addTableToDatabaseWithIDSet; 
	ArrayList<TrNetPat3Instance> trNetPat3Array;
	HashSet<TrNetPat3Instance> trNetPat3Set; 
	ArrayList<TrNetPat42Instance> trNetPat42Array;
	HashSet<TrNetPat42Instance> trNetPat42Set; 
	ArrayList<TrNetPat22Instance> trNetPat22Array;
	HashSet<TrNetPat22Instance> trNetPat22Set; 
	ArrayList<TrNetPat8Instance> trNetPat8Array;
	HashSet<TrNetPat8Instance> trNetPat8Set; 
	ArrayList<AddIDColumnToDatabaseInstance> addIDColumnToDatabaseArray;
	HashSet<AddIDColumnToDatabaseInstance> addIDColumnToDatabaseSet; 
		HashMap<ModelNode, LinkedList<AddIDColumnToDatabaseInstance>> table0InAddIDColumnToDatabaseHash;
	ArrayList<TrNetPat9Instance> trNetPat9Array;
	HashSet<TrNetPat9Instance> trNetPat9Set; 
	ArrayList<TrNetPat10Instance> trNetPat10Array;
	HashSet<TrNetPat10Instance> trNetPat10Set; 
	ArrayList<TrNetPat12Instance> trNetPat12Array;
	HashSet<TrNetPat12Instance> trNetPat12Set; 
	ArrayList<TrNetPat43Instance> trNetPat43Array;
	HashSet<TrNetPat43Instance> trNetPat43Set; 
	ArrayList<TrNetPat44Instance> trNetPat44Array;
	HashSet<TrNetPat44Instance> trNetPat44Set; 
		HashMap<ModelNode, LinkedList<TrNetPat44Instance>> datatype0InTrNetPat44Hash;
	ArrayList<TrNetPat11Instance> trNetPat11Array;
	HashSet<TrNetPat11Instance> trNetPat11Set; 
	ArrayList<TrNetPat45Instance> trNetPat45Array;
	HashSet<TrNetPat45Instance> trNetPat45Set; 
	ArrayList<IntegerTypeInstance> integerTypeArray;
	HashSet<IntegerTypeInstance> integerTypeSet; 
	ArrayList<TrNetPat4Instance> trNetPat4Array;
	HashSet<TrNetPat4Instance> trNetPat4Set; 
	ArrayList<TrNetPat46Instance> trNetPat46Array;
	HashSet<TrNetPat46Instance> trNetPat46Set; 
	ArrayList<TrNetPat47Instance> trNetPat47Array;
	HashSet<TrNetPat47Instance> trNetPat47Set; 
	ArrayList<TrNetPat24Instance> trNetPat24Array;
	HashSet<TrNetPat24Instance> trNetPat24Set; 
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> attribute0InTrNetPat24Hash;
	ArrayList<TrNetPat25Instance> trNetPat25Array;
	HashSet<TrNetPat25Instance> trNetPat25Set; 
	ArrayList<TrNetPat26Instance> trNetPat26Array;
	HashSet<TrNetPat26Instance> trNetPat26Set; 
	ArrayList<TrNetPat28Instance> trNetPat28Array;
	HashSet<TrNetPat28Instance> trNetPat28Set; 
	ArrayList<TrNetPat27Instance> trNetPat27Array;
	HashSet<TrNetPat27Instance> trNetPat27Set; 
	ArrayList<TrNetPat31Instance> trNetPat31Array;
	HashSet<TrNetPat31Instance> trNetPat31Set; 
	ArrayList<TrNetPat30Instance> trNetPat30Array;
	HashSet<TrNetPat30Instance> trNetPat30Set; 
	ArrayList<TrNetPat48Instance> trNetPat48Array;
	HashSet<TrNetPat48Instance> trNetPat48Set; 
	ArrayList<TrNetPat33Instance> trNetPat33Array;
	HashSet<TrNetPat33Instance> trNetPat33Set; 
	ArrayList<TrNetPat34Instance> trNetPat34Array;
	HashSet<TrNetPat34Instance> trNetPat34Set; 
	ArrayList<TrNetPat35Instance> trNetPat35Array;
	HashSet<TrNetPat35Instance> trNetPat35Set; 
	ArrayList<AddIntegerColumnToDatabaseInstance> addIntegerColumnToDatabaseArray;
	HashSet<AddIntegerColumnToDatabaseInstance> addIntegerColumnToDatabaseSet; 
	ArrayList<TrNetPat37Instance> trNetPat37Array;
	HashSet<TrNetPat37Instance> trNetPat37Set; 
	ArrayList<TrNetPat38Instance> trNetPat38Array;
	HashSet<TrNetPat38Instance> trNetPat38Set; 
	ArrayList<TrNetPat39Instance> trNetPat39Array;
	HashSet<TrNetPat39Instance> trNetPat39Set; 
	ArrayList<AddTableToDatabaseInstance> addTableToDatabaseArray;
	HashSet<AddTableToDatabaseInstance> addTableToDatabaseSet; 
	ArrayList<TrNetPat29Instance> trNetPat29Array;
	HashSet<TrNetPat29Instance> trNetPat29Set; 
	ArrayList<TrNetPat14Instance> trNetPat14Array;
	HashSet<TrNetPat14Instance> trNetPat14Set; 
	ArrayList<TrNetPat18Instance> trNetPat18Array;
	HashSet<TrNetPat18Instance> trNetPat18Set; 
	ArrayList<TrNetPat32Instance> trNetPat32Array;
	HashSet<TrNetPat32Instance> trNetPat32Set; 
	ArrayList<TrNetPat16Instance> trNetPat16Array;
	HashSet<TrNetPat16Instance> trNetPat16Set; 
	ArrayList<TrNetPat15Instance> trNetPat15Array;
	HashSet<TrNetPat15Instance> trNetPat15Set; 
	ArrayList<TrNetPat5Instance> trNetPat5Array;
	HashSet<TrNetPat5Instance> trNetPat5Set; 
	ArrayList<TrNetPat17Instance> trNetPat17Array;
	HashSet<TrNetPat17Instance> trNetPat17Set; 
	ArrayList<TrNetPat23Instance> trNetPat23Array;
	HashSet<TrNetPat23Instance> trNetPat23Set; 
	ArrayList<TrNetPat13Instance> trNetPat13Array;
	HashSet<TrNetPat13Instance> trNetPat13Set; 
	ArrayList<TrNetPat36Instance> trNetPat36Array;
	HashSet<TrNetPat36Instance> trNetPat36Set; 
	ArrayList<TrNetPat19Instance> trNetPat19Array;
	HashSet<TrNetPat19Instance> trNetPat19Set; 
	ArrayList<TrNetPat40Instance> trNetPat40Array;
	HashSet<TrNetPat40Instance> trNetPat40Set; 
	ArrayList<TrNetPat41Instance> trNetPat41Array;
	HashSet<TrNetPat41Instance> trNetPat41Set; 
	ArrayList<TrNetPat20Instance> trNetPat20Array;
	HashSet<TrNetPat20Instance> trNetPat20Set; 
	ArrayList<TrNetPat21Instance> trNetPat21Array;
	HashSet<TrNetPat21Instance> trNetPat21Set; 
	
	public Class2RelationalTransformation(){
		
	trNetPat1Array = new ArrayList<TrNetPat1Instance>(1); 
	trNetPat1Set = new HashSet<TrNetPat1Instance>(1); 
	trNetPat2Array = new ArrayList<TrNetPat2Instance>(1); 
	trNetPat2Set = new HashSet<TrNetPat2Instance>(1); 
	trNetPat6Array = new ArrayList<TrNetPat6Instance>(10000); 
	trNetPat6Set = new HashSet<TrNetPat6Instance>(10000); 
	trNetPat7Array = new ArrayList<TrNetPat7Instance>(10000); 
	trNetPat7Set = new HashSet<TrNetPat7Instance>(10000); 
		cClass0InTrNetPat7Hash = new HashMap<ModelNode, LinkedList<TrNetPat7Instance>>(10000);
	addTableToDatabaseWithIDArray = new ArrayList<AddTableToDatabaseWithIDInstance>(10000); 
	addTableToDatabaseWithIDSet = new HashSet<AddTableToDatabaseWithIDInstance>(10000); 
	trNetPat3Array = new ArrayList<TrNetPat3Instance>(10000); 
	trNetPat3Set = new HashSet<TrNetPat3Instance>(10000); 
	trNetPat42Array = new ArrayList<TrNetPat42Instance>(4963); 
	trNetPat42Set = new HashSet<TrNetPat42Instance>(4963); 
	trNetPat22Array = new ArrayList<TrNetPat22Instance>(4963); 
	trNetPat22Set = new HashSet<TrNetPat22Instance>(4963); 
	trNetPat8Array = new ArrayList<TrNetPat8Instance>(10000); 
	trNetPat8Set = new HashSet<TrNetPat8Instance>(10000); 
	addIDColumnToDatabaseArray = new ArrayList<AddIDColumnToDatabaseInstance>(10000); 
	addIDColumnToDatabaseSet = new HashSet<AddIDColumnToDatabaseInstance>(10000); 
		table0InAddIDColumnToDatabaseHash = new HashMap<ModelNode, LinkedList<AddIDColumnToDatabaseInstance>>(10000);
	trNetPat9Array = new ArrayList<TrNetPat9Instance>(10000); 
	trNetPat9Set = new HashSet<TrNetPat9Instance>(10000); 
	trNetPat10Array = new ArrayList<TrNetPat10Instance>(10000); 
	trNetPat10Set = new HashSet<TrNetPat10Instance>(10000); 
	trNetPat12Array = new ArrayList<TrNetPat12Instance>(10000); 
	trNetPat12Set = new HashSet<TrNetPat12Instance>(10000); 
	trNetPat43Array = new ArrayList<TrNetPat43Instance>(2); 
	trNetPat43Set = new HashSet<TrNetPat43Instance>(2); 
	trNetPat44Array = new ArrayList<TrNetPat44Instance>(2); 
	trNetPat44Set = new HashSet<TrNetPat44Instance>(2); 
		datatype0InTrNetPat44Hash = new HashMap<ModelNode, LinkedList<TrNetPat44Instance>>(2);
	trNetPat11Array = new ArrayList<TrNetPat11Instance>(10000); 
	trNetPat11Set = new HashSet<TrNetPat11Instance>(10000); 
	trNetPat45Array = new ArrayList<TrNetPat45Instance>(2); 
	trNetPat45Set = new HashSet<TrNetPat45Instance>(2); 
	integerTypeArray = new ArrayList<IntegerTypeInstance>(1); 
	integerTypeSet = new HashSet<IntegerTypeInstance>(1); 
	trNetPat4Array = new ArrayList<TrNetPat4Instance>(2); 
	trNetPat4Set = new HashSet<TrNetPat4Instance>(2); 
	trNetPat46Array = new ArrayList<TrNetPat46Instance>(2); 
	trNetPat46Set = new HashSet<TrNetPat46Instance>(2); 
	trNetPat47Array = new ArrayList<TrNetPat47Instance>(10000); 
	trNetPat47Set = new HashSet<TrNetPat47Instance>(10000); 
	trNetPat24Array = new ArrayList<TrNetPat24Instance>(10000); 
	trNetPat24Set = new HashSet<TrNetPat24Instance>(10000); 
		attribute0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(10000);
	trNetPat25Array = new ArrayList<TrNetPat25Instance>(2); 
	trNetPat25Set = new HashSet<TrNetPat25Instance>(2); 
	trNetPat26Array = new ArrayList<TrNetPat26Instance>(1); 
	trNetPat26Set = new HashSet<TrNetPat26Instance>(1); 
	trNetPat28Array = new ArrayList<TrNetPat28Instance>(1); 
	trNetPat28Set = new HashSet<TrNetPat28Instance>(1); 
	trNetPat27Array = new ArrayList<TrNetPat27Instance>(1); 
	trNetPat27Set = new HashSet<TrNetPat27Instance>(1); 
	trNetPat31Array = new ArrayList<TrNetPat31Instance>(1); 
	trNetPat31Set = new HashSet<TrNetPat31Instance>(1); 
	trNetPat30Array = new ArrayList<TrNetPat30Instance>(1); 
	trNetPat30Set = new HashSet<TrNetPat30Instance>(1); 
	trNetPat48Array = new ArrayList<TrNetPat48Instance>(9998); 
	trNetPat48Set = new HashSet<TrNetPat48Instance>(9998); 
	trNetPat33Array = new ArrayList<TrNetPat33Instance>(9998); 
	trNetPat33Set = new HashSet<TrNetPat33Instance>(9998); 
	trNetPat34Array = new ArrayList<TrNetPat34Instance>(9998); 
	trNetPat34Set = new HashSet<TrNetPat34Instance>(9998); 
	trNetPat35Array = new ArrayList<TrNetPat35Instance>(4999); 
	trNetPat35Set = new HashSet<TrNetPat35Instance>(4999); 
	addIntegerColumnToDatabaseArray = new ArrayList<AddIntegerColumnToDatabaseInstance>(10000); 
	addIntegerColumnToDatabaseSet = new HashSet<AddIntegerColumnToDatabaseInstance>(10000); 
	trNetPat37Array = new ArrayList<TrNetPat37Instance>(4999); 
	trNetPat37Set = new HashSet<TrNetPat37Instance>(4999); 
	trNetPat38Array = new ArrayList<TrNetPat38Instance>(4999); 
	trNetPat38Set = new HashSet<TrNetPat38Instance>(4999); 
	trNetPat39Array = new ArrayList<TrNetPat39Instance>(4999); 
	trNetPat39Set = new HashSet<TrNetPat39Instance>(4999); 
	addTableToDatabaseArray = new ArrayList<AddTableToDatabaseInstance>(10000); 
	addTableToDatabaseSet = new HashSet<AddTableToDatabaseInstance>(10000); 
	trNetPat29Array = new ArrayList<TrNetPat29Instance>(1); 
	trNetPat29Set = new HashSet<TrNetPat29Instance>(1); 
	trNetPat14Array = new ArrayList<TrNetPat14Instance>(24990000); 
	trNetPat14Set = new HashSet<TrNetPat14Instance>(24990000); 
	trNetPat18Array = new ArrayList<TrNetPat18Instance>(1); 
	trNetPat18Set = new HashSet<TrNetPat18Instance>(1); 
	trNetPat32Array = new ArrayList<TrNetPat32Instance>(1); 
	trNetPat32Set = new HashSet<TrNetPat32Instance>(1); 
	trNetPat16Array = new ArrayList<TrNetPat16Instance>(24990000); 
	trNetPat16Set = new HashSet<TrNetPat16Instance>(24990000); 
	trNetPat15Array = new ArrayList<TrNetPat15Instance>(24990000); 
	trNetPat15Set = new HashSet<TrNetPat15Instance>(24990000); 
	trNetPat5Array = new ArrayList<TrNetPat5Instance>(24990000); 
	trNetPat5Set = new HashSet<TrNetPat5Instance>(24990000); 
	trNetPat17Array = new ArrayList<TrNetPat17Instance>(24990000); 
	trNetPat17Set = new HashSet<TrNetPat17Instance>(24990000); 
	trNetPat23Array = new ArrayList<TrNetPat23Instance>(4963); 
	trNetPat23Set = new HashSet<TrNetPat23Instance>(4963); 
	trNetPat13Array = new ArrayList<TrNetPat13Instance>(4963); 
	trNetPat13Set = new HashSet<TrNetPat13Instance>(4963); 
	trNetPat36Array = new ArrayList<TrNetPat36Instance>(4999); 
	trNetPat36Set = new HashSet<TrNetPat36Instance>(4999); 
	trNetPat19Array = new ArrayList<TrNetPat19Instance>(4999); 
	trNetPat19Set = new HashSet<TrNetPat19Instance>(4999); 
	trNetPat40Array = new ArrayList<TrNetPat40Instance>(4999); 
	trNetPat40Set = new HashSet<TrNetPat40Instance>(4999); 
	trNetPat41Array = new ArrayList<TrNetPat41Instance>(4999); 
	trNetPat41Set = new HashSet<TrNetPat41Instance>(4999); 
	trNetPat20Array = new ArrayList<TrNetPat20Instance>(4999); 
	trNetPat20Set = new HashSet<TrNetPat20Instance>(4999); 
	trNetPat21Array = new ArrayList<TrNetPat21Instance>(4999); 
	trNetPat21Set = new HashSet<TrNetPat21Instance>(4999); 
		
	listenersTrNetPat9Instance = new LinkedList<TrNetPat9InstanceListener>();
	listenersTrNetPat5Instance = new LinkedList<TrNetPat5InstanceListener>();
	listenersTrNetPat4Instance = new LinkedList<TrNetPat4InstanceListener>();
	listenersTrNetPat12Instance = new LinkedList<TrNetPat12InstanceListener>();
	listenersTrNetPat2Instance = new LinkedList<TrNetPat2InstanceListener>();
	listenersAddTableToDatabaseInstance = new LinkedList<AddTableToDatabaseInstanceListener>();
	listenersTrNetPat11Instance = new LinkedList<TrNetPat11InstanceListener>();
	listenersTrNetPat17Instance = new LinkedList<TrNetPat17InstanceListener>();
	listenersTrNetPat10Instance = new LinkedList<TrNetPat10InstanceListener>();
	listenersTrNetPat45Instance = new LinkedList<TrNetPat45InstanceListener>();
	listenersTrNetPat15Instance = new LinkedList<TrNetPat15InstanceListener>();
	listenersTrNetPat3Instance = new LinkedList<TrNetPat3InstanceListener>();
	listenersTrNetPat16Instance = new LinkedList<TrNetPat16InstanceListener>();
		
		
	inputInputClasses = new InputClassesExternalInput();
		inputInputClasses.registerListener( (TrNetPat1InstanceListener) this);
		inputInputClasses.registerListener( (TrNetPat6InstanceListener) this);
		inputInputClasses.registerListener( (TrNetPat42InstanceListener) this);
		inputInputClasses.registerListener( (TrNetPat43InstanceListener) this);
		inputInputClasses.registerListener( (TrNetPat46InstanceListener) this);
		inputInputClasses.registerListener( (TrNetPat47InstanceListener) this);
		inputInputClasses.registerListener( (TrNetPat48InstanceListener) this);
		
	outputOutputRelational = new OutputRelationalExternalOutput();
		this.registerListener((TrNetPat2InstanceListener) outputOutputRelational);
		this.registerListener((AddTableToDatabaseInstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat3InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat9InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat10InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat12InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat45InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat11InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat4InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat17InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat16InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat15InstanceListener) outputOutputRelational);
		this.registerListener((TrNetPat5InstanceListener) outputOutputRelational);
	}
	
	
	// aqui fica a execucao de todo o plano de execucao da transformacao, idealmente, incluindo os ciclos.
	public void run() {
		
	executeOperatorInputClasses();
	executeOperatorTrNetOp5();
	executeOperatorTrNetOp45();
	executeOperatorTrNetOp24();
	executeOperatorTrNetOp27();
	executeOperatorTrNetOp47();
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp28();
	executeOperatorTrNetOp29();
	executeOperatorTrNetOp30();
	executeOperatorTrNetOp37();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp39();
	executeOperatorTrNetOp41();
	executeOperatorTrNetOp42();
	executeOperatorTrNetOp44();
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp26();
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp3();
	executeOperatorTrNetOp6();
	executeOperatorTrNetOp7();
	executeOperatorTrNetOp23();
	executeOperatorTrNetOp8();
	executeOperatorTrNetOp40();
	executeOperatorTrNetOp43();
	executeOperatorTrNetOp32();
	executeOperatorTrNetOp35();
	executeOperatorTrNetOp36();
	executeOperatorTrNetOp33();
	executeOperatorTrNetOp31();
	executeOperatorTrNetOp34();
	executeOperatorTrNetOp21();
	executeOperatorTrNetOp19();
	executeOperatorTrNetOp12();
	executeOperatorTrNetOp13();
	executeOperatorTrNetOp20();
	executeOperatorTrNetOp9();
	executeOperatorTrNetOp10();
	executeOperatorTrNetOp2();
	executeOperatorTrNetOp15();
	executeOperatorTrNetOp16();
	executeOperatorTrNetOp11();
	executeOperatorTrNetOp22();
	executeOperatorTrNetOp17();
	executeOperatorTrNetOp18();
	executeOperatorTrNetOp14();
	executeOperatorTrNetOp4();
	executeOperatorOutputRelational();
		
	}
	
	public HashMap<String, generic.PatternStats> retrieveExpectedAndRealSizesPatterns() {
		HashMap<String, generic.PatternStats> result = new HashMap<String, generic.PatternStats>();
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat1Set.size();
				
				
				result.put("TrNetPat1", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat2Set.size();
				
				
				result.put("TrNetPat2", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat6Set.size();
				
				
				result.put("TrNetPat6", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat7Set.size();
				
				
				result.put("TrNetPat7", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = addTableToDatabaseWithIDSet.size();
				
				
				result.put("AddTableToDatabaseWithID", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat3Set.size();
				
				
				result.put("TrNetPat3", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4963.0;
				patternStats.realSize = trNetPat42Set.size();
				
				
				result.put("TrNetPat42", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4963.0;
				patternStats.realSize = trNetPat22Set.size();
				
				
				result.put("TrNetPat22", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat8Set.size();
				
				
				result.put("TrNetPat8", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = addIDColumnToDatabaseSet.size();
				
				
				result.put("addIDColumnToDatabase", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat9Set.size();
				
				
				result.put("TrNetPat9", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat10Set.size();
				
				
				result.put("TrNetPat10", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat12Set.size();
				
				
				result.put("TrNetPat12", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat43Set.size();
				
				
				result.put("TrNetPat43", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat44Set.size();
				
				
				result.put("TrNetPat44", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat11Set.size();
				
				
				result.put("TrNetPat11", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat45Set.size();
				
				
				result.put("TrNetPat45", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = integerTypeSet.size();
				
				
				result.put("integerType", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat4Set.size();
				
				
				result.put("TrNetPat4", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat46Set.size();
				
				
				result.put("TrNetPat46", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat47Set.size();
				
				
				result.put("TrNetPat47", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat24Set.size();
				
				
				result.put("TrNetPat24", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat25Set.size();
				
				
				result.put("TrNetPat25", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat26Set.size();
				
				
				result.put("TrNetPat26", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat28Set.size();
				
				
				result.put("TrNetPat28", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat27Set.size();
				
				
				result.put("TrNetPat27", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat31Set.size();
				
				
				result.put("TrNetPat31", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat30Set.size();
				
				
				result.put("TrNetPat30", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9998.0;
				patternStats.realSize = trNetPat48Set.size();
				
				
				result.put("TrNetPat48", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9998.0;
				patternStats.realSize = trNetPat33Set.size();
				
				
				result.put("TrNetPat33", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9998.0;
				patternStats.realSize = trNetPat34Set.size();
				
				
				result.put("TrNetPat34", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat35Set.size();
				
				
				result.put("TrNetPat35", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = addIntegerColumnToDatabaseSet.size();
				
				
				result.put("addIntegerColumnToDatabase", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat37Set.size();
				
				
				result.put("TrNetPat37", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat38Set.size();
				
				
				result.put("TrNetPat38", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat39Set.size();
				
				
				result.put("TrNetPat39", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = addTableToDatabaseSet.size();
				
				
				result.put("AddTableToDatabase", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat29Set.size();
				
				
				result.put("TrNetPat29", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.4990001E7;
				patternStats.realSize = trNetPat14Set.size();
				
				
				result.put("TrNetPat14", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat18Set.size();
				
				
				result.put("TrNetPat18", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat32Set.size();
				
				
				result.put("TrNetPat32", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.4990001E7;
				patternStats.realSize = trNetPat16Set.size();
				
				
				result.put("TrNetPat16", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.4990001E7;
				patternStats.realSize = trNetPat15Set.size();
				
				
				result.put("TrNetPat15", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.4990001E7;
				patternStats.realSize = trNetPat5Set.size();
				
				
				result.put("TrNetPat5", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.4990001E7;
				patternStats.realSize = trNetPat17Set.size();
				
				
				result.put("TrNetPat17", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4963.0;
				patternStats.realSize = trNetPat23Set.size();
				
				
				result.put("TrNetPat23", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4963.0;
				patternStats.realSize = trNetPat13Set.size();
				
				
				result.put("TrNetPat13", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat36Set.size();
				
				
				result.put("TrNetPat36", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat19Set.size();
				
				
				result.put("TrNetPat19", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat40Set.size();
				
				
				result.put("TrNetPat40", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat41Set.size();
				
				
				result.put("TrNetPat41", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat20Set.size();
				
				
				result.put("TrNetPat20", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4999.0;
				patternStats.realSize = trNetPat21Set.size();
				
				
				result.put("TrNetPat21", patternStats);
			}
		
		return result;
	} 
	public void generateOutputCSVStats(String directory_path) {
		HashMap<String, generic.PatternStats> statsMap = retrieveExpectedAndRealSizesPatterns();
		try{
		    java.io.FileWriter patternStatsFile = new java.io.FileWriter(directory_path + "/" + "patternSize.csv");
	 	
		    patternStatsFile.append("Pattern ID");
		    patternStatsFile.append(',');
		    patternStatsFile.append("Expected Size");
		    patternStatsFile.append(',');
		    patternStatsFile.append("Real Size");
		    patternStatsFile.append('\n');
			
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat1");
					
					patternStatsFile.append("TrNetPat1");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat2");
					
					patternStatsFile.append("TrNetPat2");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat6");
					
					patternStatsFile.append("TrNetPat6");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat7");
					
					patternStatsFile.append("TrNetPat7");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("AddTableToDatabaseWithID");
					
					patternStatsFile.append("AddTableToDatabaseWithID");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat3");
					
					patternStatsFile.append("TrNetPat3");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat42");
					
					patternStatsFile.append("TrNetPat42");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat22");
					
					patternStatsFile.append("TrNetPat22");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat8");
					
					patternStatsFile.append("TrNetPat8");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("addIDColumnToDatabase");
					
					patternStatsFile.append("addIDColumnToDatabase");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat9");
					
					patternStatsFile.append("TrNetPat9");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat10");
					
					patternStatsFile.append("TrNetPat10");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat12");
					
					patternStatsFile.append("TrNetPat12");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat43");
					
					patternStatsFile.append("TrNetPat43");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat44");
					
					patternStatsFile.append("TrNetPat44");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat11");
					
					patternStatsFile.append("TrNetPat11");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat45");
					
					patternStatsFile.append("TrNetPat45");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("integerType");
					
					patternStatsFile.append("integerType");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat4");
					
					patternStatsFile.append("TrNetPat4");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat46");
					
					patternStatsFile.append("TrNetPat46");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat47");
					
					patternStatsFile.append("TrNetPat47");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat24");
					
					patternStatsFile.append("TrNetPat24");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat25");
					
					patternStatsFile.append("TrNetPat25");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat26");
					
					patternStatsFile.append("TrNetPat26");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat28");
					
					patternStatsFile.append("TrNetPat28");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat27");
					
					patternStatsFile.append("TrNetPat27");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat31");
					
					patternStatsFile.append("TrNetPat31");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat30");
					
					patternStatsFile.append("TrNetPat30");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat48");
					
					patternStatsFile.append("TrNetPat48");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat33");
					
					patternStatsFile.append("TrNetPat33");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat34");
					
					patternStatsFile.append("TrNetPat34");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat35");
					
					patternStatsFile.append("TrNetPat35");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("addIntegerColumnToDatabase");
					
					patternStatsFile.append("addIntegerColumnToDatabase");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat37");
					
					patternStatsFile.append("TrNetPat37");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat38");
					
					patternStatsFile.append("TrNetPat38");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat39");
					
					patternStatsFile.append("TrNetPat39");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("AddTableToDatabase");
					
					patternStatsFile.append("AddTableToDatabase");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat29");
					
					patternStatsFile.append("TrNetPat29");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat14");
					
					patternStatsFile.append("TrNetPat14");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat18");
					
					patternStatsFile.append("TrNetPat18");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat32");
					
					patternStatsFile.append("TrNetPat32");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat16");
					
					patternStatsFile.append("TrNetPat16");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat15");
					
					patternStatsFile.append("TrNetPat15");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat5");
					
					patternStatsFile.append("TrNetPat5");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat17");
					
					patternStatsFile.append("TrNetPat17");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat23");
					
					patternStatsFile.append("TrNetPat23");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat13");
					
					patternStatsFile.append("TrNetPat13");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat36");
					
					patternStatsFile.append("TrNetPat36");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat19");
					
					patternStatsFile.append("TrNetPat19");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat40");
					
					patternStatsFile.append("TrNetPat40");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat41");
					
					patternStatsFile.append("TrNetPat41");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat20");
					
					patternStatsFile.append("TrNetPat20");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat21");
					
					patternStatsFile.append("TrNetPat21");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
			
		    patternStatsFile.flush();
		    patternStatsFile.close();
		}
		catch(java.io.IOException e){
		     e.printStackTrace();
		} 
		
	}
	
	public void notify(TrNetPat6Instance element){
		if (trNetPat6Set.add(element)) {
			trNetPat6Array.add(element);
			/*
	executeOperatorTrNetOp5();
			*/
		}
	}
	public void notify(TrNetPat43Instance element){
		if (trNetPat43Set.add(element)) {
			trNetPat43Array.add(element);
			/*
	executeOperatorTrNetOp45();
			*/
		}
	}
	public void notify(TrNetPat47Instance element){
		if (trNetPat47Set.add(element)) {
			trNetPat47Array.add(element);
			/*
	executeOperatorTrNetOp27();
			*/
		}
	}
	public void notify(TrNetPat42Instance element){
		if (trNetPat42Set.add(element)) {
			trNetPat42Array.add(element);
			/*
	executeOperatorTrNetOp24();
			*/
		}
	}
	public void notify(TrNetPat46Instance element){
		if (trNetPat46Set.add(element)) {
			trNetPat46Array.add(element);
			/*
	executeOperatorTrNetOp28();
			*/
		}
	}
	public void notify(TrNetPat48Instance element){
		if (trNetPat48Set.add(element)) {
			trNetPat48Array.add(element);
			/*
	executeOperatorTrNetOp37();
			*/
		}
	}
	public void notify(TrNetPat1Instance element){
		if (trNetPat1Set.add(element)) {
			trNetPat1Array.add(element);
			/*
	executeOperatorTrNetOp1();
			*/
		}
	}
	
	
LinkedList<TrNetPat9InstanceListener> listenersTrNetPat9Instance;

public void registerListener(TrNetPat9InstanceListener listener){
	listenersTrNetPat9Instance.add(listener);
}
	
public void notifyListeners(TrNetPat9Instance element){
	for (TrNetPat9InstanceListener listener : listenersTrNetPat9Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat5InstanceListener> listenersTrNetPat5Instance;

public void registerListener(TrNetPat5InstanceListener listener){
	listenersTrNetPat5Instance.add(listener);
}
	
public void notifyListeners(TrNetPat5Instance element){
	for (TrNetPat5InstanceListener listener : listenersTrNetPat5Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat4InstanceListener> listenersTrNetPat4Instance;

public void registerListener(TrNetPat4InstanceListener listener){
	listenersTrNetPat4Instance.add(listener);
}
	
public void notifyListeners(TrNetPat4Instance element){
	for (TrNetPat4InstanceListener listener : listenersTrNetPat4Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat12InstanceListener> listenersTrNetPat12Instance;

public void registerListener(TrNetPat12InstanceListener listener){
	listenersTrNetPat12Instance.add(listener);
}
	
public void notifyListeners(TrNetPat12Instance element){
	for (TrNetPat12InstanceListener listener : listenersTrNetPat12Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat2InstanceListener> listenersTrNetPat2Instance;

public void registerListener(TrNetPat2InstanceListener listener){
	listenersTrNetPat2Instance.add(listener);
}
	
public void notifyListeners(TrNetPat2Instance element){
	for (TrNetPat2InstanceListener listener : listenersTrNetPat2Instance){
		listener.notify(element);
	}
}

LinkedList<AddTableToDatabaseInstanceListener> listenersAddTableToDatabaseInstance;

public void registerListener(AddTableToDatabaseInstanceListener listener){
	listenersAddTableToDatabaseInstance.add(listener);
}
	
public void notifyListeners(AddTableToDatabaseInstance element){
	for (AddTableToDatabaseInstanceListener listener : listenersAddTableToDatabaseInstance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat11InstanceListener> listenersTrNetPat11Instance;

public void registerListener(TrNetPat11InstanceListener listener){
	listenersTrNetPat11Instance.add(listener);
}
	
public void notifyListeners(TrNetPat11Instance element){
	for (TrNetPat11InstanceListener listener : listenersTrNetPat11Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat17InstanceListener> listenersTrNetPat17Instance;

public void registerListener(TrNetPat17InstanceListener listener){
	listenersTrNetPat17Instance.add(listener);
}
	
public void notifyListeners(TrNetPat17Instance element){
	for (TrNetPat17InstanceListener listener : listenersTrNetPat17Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat10InstanceListener> listenersTrNetPat10Instance;

public void registerListener(TrNetPat10InstanceListener listener){
	listenersTrNetPat10Instance.add(listener);
}
	
public void notifyListeners(TrNetPat10Instance element){
	for (TrNetPat10InstanceListener listener : listenersTrNetPat10Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat45InstanceListener> listenersTrNetPat45Instance;

public void registerListener(TrNetPat45InstanceListener listener){
	listenersTrNetPat45Instance.add(listener);
}
	
public void notifyListeners(TrNetPat45Instance element){
	for (TrNetPat45InstanceListener listener : listenersTrNetPat45Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat15InstanceListener> listenersTrNetPat15Instance;

public void registerListener(TrNetPat15InstanceListener listener){
	listenersTrNetPat15Instance.add(listener);
}
	
public void notifyListeners(TrNetPat15Instance element){
	for (TrNetPat15InstanceListener listener : listenersTrNetPat15Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat3InstanceListener> listenersTrNetPat3Instance;

public void registerListener(TrNetPat3InstanceListener listener){
	listenersTrNetPat3Instance.add(listener);
}
	
public void notifyListeners(TrNetPat3Instance element){
	for (TrNetPat3InstanceListener listener : listenersTrNetPat3Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat16InstanceListener> listenersTrNetPat16Instance;

public void registerListener(TrNetPat16InstanceListener listener){
	listenersTrNetPat16Instance.add(listener);
}
	
public void notifyListeners(TrNetPat16Instance element){
	for (TrNetPat16InstanceListener listener : listenersTrNetPat16Instance){
		listener.notify(element);
	}
}

	
	
boolean executeOperatorOutputRelational() {
	boolean operatorHasExecuted = false;
	
	{
		int sourcePatternSize = trNetPat2Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat2Instance sourcePatternInstance = trNetPat2Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = addTableToDatabaseArray.size();
		for (int i = 0; i<sourcePatternSize; i++){
			AddTableToDatabaseInstance sourcePatternInstance = addTableToDatabaseArray.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat3Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat9Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat9Instance sourcePatternInstance = trNetPat9Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat10Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat10Instance sourcePatternInstance = trNetPat10Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat12Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat12Instance sourcePatternInstance = trNetPat12Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat45Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat45Instance sourcePatternInstance = trNetPat45Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat11Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat11Instance sourcePatternInstance = trNetPat11Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat4Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat4Instance sourcePatternInstance = trNetPat4Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat17Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat17Instance sourcePatternInstance = trNetPat17Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat16Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat15Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat15Instance sourcePatternInstance = trNetPat15Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat5Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp1() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat1Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat1Instance sourcePatternInstance = trNetPat1Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat2Instance targetInstance = new TrNetPat2Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("Database");
				
				targetInstance.database0 = node;
				
				}
		if (trNetPat2Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat2Array.add(targetInstance);
	//patternTrNetPat2HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp5() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat6Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat6Instance sourcePatternInstance = trNetPat6Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat7Instance targetInstance = new TrNetPat7Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.cClass0.attributes.get("name")));
	node.types.add("Table");
				
				targetInstance.table0 = node;
				
				}
			{
			targetInstance.cClass0 = sourcePatternInstance.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
		if (trNetPat7Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat7Array.add(targetInstance);
	{
		if (!cClass0InTrNetPat7Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat7Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat7Instance>());
		}
		cClass0InTrNetPat7Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	//patternTrNetPat7HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp6() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat7Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat7Instance sourcePatternInstance = trNetPat7Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddTableToDatabaseWithIDInstance targetInstance = new AddTableToDatabaseWithIDInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseWithIDSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addTableToDatabaseWithIDArray.add(targetInstance);
	//patternAddTableToDatabaseWithIDHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp2() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			int sourcePatternSize2 = addTableToDatabaseArray.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				AddTableToDatabaseInstance sourcePatternInstance2 = addTableToDatabaseArray.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat3Instance targetInstance = new TrNetPat3Instance();
			{
			targetInstance.database0 = sourcePatternInstance1.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat3Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat3Array.add(targetInstance);
	//patternTrNetPat3HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp24() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat42Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat42Instance sourcePatternInstance1 = trNetPat42Array.get(i);
		
		
			LinkedList<TrNetPat7Instance> sourcePatternInstances2 = cClass0InTrNetPat7Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat7Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat22Instance targetInstance = new TrNetPat22Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance1.cClass1.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				}
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass1 = sourcePatternInstance1.cClass1;
			targetInstance.cClass1.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat22Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat22Array.add(targetInstance);
	//patternTrNetPat22HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp7() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addTableToDatabaseWithIDArray.size();
	for (int i = 0; i<sourcePatternSize; i++){
		AddTableToDatabaseWithIDInstance sourcePatternInstance = addTableToDatabaseWithIDArray.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance.table0.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				
				}
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat8Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat8Array.add(targetInstance);
	//patternTrNetPat8HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp8() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat8Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat8Instance sourcePatternInstance = trNetPat8Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIDColumnToDatabaseInstance targetInstance = new AddIDColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIDColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp9() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addIDColumnToDatabaseArray.size();
	for (int i = 0; i<sourcePatternSize; i++){
		AddIDColumnToDatabaseInstance sourcePatternInstance = addIDColumnToDatabaseArray.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIntegerColumnToDatabaseInstance targetInstance = new AddIntegerColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIntegerColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIntegerColumnToDatabaseArray.add(targetInstance);
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat12Instance targetInstance = new TrNetPat12Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat12Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat12Array.add(targetInstance);
	//patternTrNetPat12HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp25() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat22Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat22Instance sourcePatternInstance = trNetPat22Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIntegerColumnToDatabaseInstance targetInstance = new AddIntegerColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIntegerColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIntegerColumnToDatabaseArray.add(targetInstance);
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp45() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat43Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat43Instance sourcePatternInstance = trNetPat43Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat44Instance targetInstance = new TrNetPat44Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.datatype0.attributes.get("name")));
	node.types.add("Type");
				
				targetInstance.type0 = node;
				
				}
			{
			targetInstance.datatype0 = sourcePatternInstance.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
		if (trNetPat44Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat44Array.add(targetInstance);
	{
		if (!datatype0InTrNetPat44Hash.containsKey(targetInstance.datatype0)) {
			datatype0InTrNetPat44Hash.put(targetInstance.datatype0, new LinkedList<TrNetPat44Instance>());
		}
		datatype0InTrNetPat44Hash.get(targetInstance.datatype0).add(targetInstance);
	}
	//patternTrNetPat44HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp46() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat44Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat44Instance sourcePatternInstance = trNetPat44Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat45Instance targetInstance = new TrNetPat45Instance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat45Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat45Array.add(targetInstance);
	//patternTrNetPat45HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp11() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = addIntegerColumnToDatabaseArray.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		AddIntegerColumnToDatabaseInstance sourcePatternInstance1 = addIntegerColumnToDatabaseArray.get(i);
		
		
			int sourcePatternSize2 = integerTypeArray.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				IntegerTypeInstance sourcePatternInstance2 = integerTypeArray.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat11Instance targetInstance = new TrNetPat11Instance();
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat11Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat11Array.add(targetInstance);
	//patternTrNetPat11HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp47() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat44Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat44Instance sourcePatternInstance = trNetPat44Array.get(i);
		
	if (sourcePatternInstance.type0.attributes.get("name")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isInteger(sourcePatternInstance.type0.attributes.get("name"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		IntegerTypeInstance targetInstance = new IntegerTypeInstance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (integerTypeSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			integerTypeArray.add(targetInstance);
	//patternIntegerTypeHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp3() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat45Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat45Instance sourcePatternInstance1 = trNetPat45Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat2Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat2Instance sourcePatternInstance2 = trNetPat2Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat4Instance targetInstance = new TrNetPat4Instance();
			{
			targetInstance.type0 = sourcePatternInstance1.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.database0 = sourcePatternInstance2.database0;
			targetInstance.database0.types.add("Database");
			}
		if (trNetPat4Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat4Array.add(targetInstance);
	//patternTrNetPat4HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp27() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat47Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat47Instance sourcePatternInstance1 = trNetPat47Array.get(i);
		
		
			LinkedList<TrNetPat7Instance> sourcePatternInstances2 = cClass0InTrNetPat7Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat7Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat24Instance targetInstance = new TrNetPat24Instance();
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat24Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat24Array.add(targetInstance);
	{
		if (!attribute0InTrNetPat24Hash.containsKey(targetInstance.attribute0)) {
			attribute0InTrNetPat24Hash.put(targetInstance.attribute0, new LinkedList<TrNetPat24Instance>());
		}
		attribute0InTrNetPat24Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	//patternTrNetPat24HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp28() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat46Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat46Instance sourcePatternInstance1 = trNetPat46Array.get(i);
		
		
			LinkedList<TrNetPat24Instance> sourcePatternInstances2 = attribute0InTrNetPat24Hash.get(sourcePatternInstance1.attribute0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat24Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat25Instance targetInstance = new TrNetPat25Instance();
			{
			targetInstance.datatype0 = sourcePatternInstance1.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat25Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat25Array.add(targetInstance);
	//patternTrNetPat25HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp29() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat25Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat25Instance sourcePatternInstance1 = trNetPat25Array.get(i);
		
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfalse(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
		
			LinkedList<TrNetPat44Instance> sourcePatternInstances2 = datatype0InTrNetPat44Hash.get(sourcePatternInstance1.datatype0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat44Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfalse(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
					
					
	{
			totalCombinationsCounter++;
		TrNetPat26Instance targetInstance = new TrNetPat26Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance1.attribute0.attributes.get("name")));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				}
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat26Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat26Array.add(targetInstance);
	//patternTrNetPat26HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp31() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat27Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat27Instance sourcePatternInstance = trNetPat27Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat10Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat10Array.add(targetInstance);
	//patternTrNetPat10HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat11Instance targetInstance = new TrNetPat11Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat11Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat11Array.add(targetInstance);
	//patternTrNetPat11HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat9Instance targetInstance = new TrNetPat9Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat9Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat9Array.add(targetInstance);
	//patternTrNetPat9HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp32() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat25Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat25Instance sourcePatternInstance1 = trNetPat25Array.get(i);
		
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.istrue(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
		
			LinkedList<TrNetPat44Instance> sourcePatternInstances2 = datatype0InTrNetPat44Hash.get(sourcePatternInstance1.datatype0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat44Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.istrue(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
					
					
	{
			totalCombinationsCounter++;
		TrNetPat28Instance targetInstance = new TrNetPat28Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance1.attribute0.attributes.get("name")));
	node.types.add("Table");
				
				targetInstance.table0 = node;
				}
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Constants.getvalue());
	node.types.add("Column");
				
				targetInstance.column0 = node;
				}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat28Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat28Array.add(targetInstance);
	//patternTrNetPat28HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat31Instance targetInstance = new TrNetPat31Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance1.table0.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				}
		if (trNetPat31Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat31Array.add(targetInstance);
	//patternTrNetPat31HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat32Instance targetInstance = new TrNetPat32Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat32Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat32Array.add(targetInstance);
	//patternTrNetPat32HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp33() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat28Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat28Instance sourcePatternInstance = trNetPat28Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat27Instance targetInstance = new TrNetPat27Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat27Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat27Array.add(targetInstance);
	//patternTrNetPat27HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat29Instance targetInstance = new TrNetPat29Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance.table0.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				
				}
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat29Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat29Array.add(targetInstance);
	//patternTrNetPat29HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp30() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat26Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat26Instance sourcePatternInstance = trNetPat26Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat27Instance targetInstance = new TrNetPat27Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat27Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat27Array.add(targetInstance);
	//patternTrNetPat27HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp35() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat31Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat31Instance sourcePatternInstance1 = trNetPat31Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat28Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat28Instance sourcePatternInstance2 = trNetPat28Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat30Instance targetInstance = new TrNetPat30Instance();
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat30Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat30Array.add(targetInstance);
	//patternTrNetPat30HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp36() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat30Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat30Instance sourcePatternInstance = trNetPat30Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIntegerColumnToDatabaseInstance targetInstance = new AddIntegerColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIntegerColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIntegerColumnToDatabaseArray.add(targetInstance);
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp37() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat48Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat48Instance sourcePatternInstance1 = trNetPat48Array.get(i);
		
		
			LinkedList<TrNetPat24Instance> sourcePatternInstances2 = attribute0InTrNetPat24Hash.get(sourcePatternInstance1.attribute0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat24Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat33Instance targetInstance = new TrNetPat33Instance();
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass1 = sourcePatternInstance1.cClass0;
			targetInstance.cClass1.types.add("CClass");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat33Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat33Array.add(targetInstance);
	//patternTrNetPat33HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp38() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat33Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat33Instance sourcePatternInstance1 = trNetPat33Array.get(i);
		
		
			LinkedList<TrNetPat7Instance> sourcePatternInstances2 = cClass0InTrNetPat7Hash.get(sourcePatternInstance1.cClass1);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat7Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat34Instance targetInstance = new TrNetPat34Instance();
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.cClass1 = sourcePatternInstance1.cClass1;
			targetInstance.cClass1.types.add("CClass");
			}
			{
			targetInstance.table1 = sourcePatternInstance2.table0;
			targetInstance.table1.types.add("Table");
			}
		if (trNetPat34Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat34Array.add(targetInstance);
	//patternTrNetPat34HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp39() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat34Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat34Instance sourcePatternInstance = trNetPat34Array.get(i);
		
	if (sourcePatternInstance.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfalse(sourcePatternInstance.attribute0.attributes.get("isMany"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		TrNetPat35Instance targetInstance = new TrNetPat35Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance.attribute0.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				
				}
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat35Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat35Array.add(targetInstance);
	//patternTrNetPat35HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat36Instance targetInstance = new TrNetPat36Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table1;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat36Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat36Array.add(targetInstance);
	//patternTrNetPat36HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp10() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addIntegerColumnToDatabaseArray.size();
	for (int i = 0; i<sourcePatternSize; i++){
		AddIntegerColumnToDatabaseInstance sourcePatternInstance = addIntegerColumnToDatabaseArray.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat9Instance targetInstance = new TrNetPat9Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat9Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat9Array.add(targetInstance);
	//patternTrNetPat9HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat10Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat10Array.add(targetInstance);
	//patternTrNetPat10HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp40() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat35Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat35Instance sourcePatternInstance = trNetPat35Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIntegerColumnToDatabaseInstance targetInstance = new AddIntegerColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIntegerColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIntegerColumnToDatabaseArray.add(targetInstance);
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp41() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat34Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat34Instance sourcePatternInstance = trNetPat34Array.get(i);
		
	if (sourcePatternInstance.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.istrue(sourcePatternInstance.attribute0.attributes.get("isMany"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		TrNetPat37Instance targetInstance = new TrNetPat37Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.attribute0.attributes.get("name")));
	node.types.add("Table");
				
				targetInstance.table0 = node;
				
				}
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance.table0.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				
				}
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance.table1.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column1 = node;
				
				}
		if (trNetPat37Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat37Array.add(targetInstance);
	//patternTrNetPat37HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat40Instance targetInstance = new TrNetPat40Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table1;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat40Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat40Array.add(targetInstance);
	//patternTrNetPat40HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat41Instance targetInstance = new TrNetPat41Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat41Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat41Array.add(targetInstance);
	//patternTrNetPat41HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp42() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat37Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat37Instance sourcePatternInstance = trNetPat37Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat38Instance targetInstance = new TrNetPat38Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat38Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat38Array.add(targetInstance);
	//patternTrNetPat38HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat39Instance targetInstance = new TrNetPat39Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column1;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat39Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat39Array.add(targetInstance);
	//patternTrNetPat39HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		AddTableToDatabaseInstance targetInstance = new AddTableToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addTableToDatabaseArray.add(targetInstance);
	//patternAddTableToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp43() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat38Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat38Instance sourcePatternInstance = trNetPat38Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIDColumnToDatabaseInstance targetInstance = new AddIDColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIDColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp44() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat39Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat39Instance sourcePatternInstance = trNetPat39Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIDColumnToDatabaseInstance targetInstance = new AddIDColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIDColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp23() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addTableToDatabaseWithIDArray.size();
	for (int i = 0; i<sourcePatternSize; i++){
		AddTableToDatabaseWithIDInstance sourcePatternInstance = addTableToDatabaseWithIDArray.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddTableToDatabaseInstance targetInstance = new AddTableToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addTableToDatabaseArray.add(targetInstance);
	//patternAddTableToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp34() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat29Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat29Instance sourcePatternInstance = trNetPat29Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		AddIDColumnToDatabaseInstance targetInstance = new AddIDColumnToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (addIDColumnToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		AddTableToDatabaseInstance targetInstance = new AddTableToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			addTableToDatabaseArray.add(targetInstance);
	//patternAddTableToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp16() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat18Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat18Instance sourcePatternInstance1 = trNetPat18Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat30Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat30Instance sourcePatternInstance2 = trNetPat30Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("ForeignKey");
				
				targetInstance.foreignKey0 = node;
				}
			{
			targetInstance.column1 = sourcePatternInstance1.column0;
			targetInstance.column1.types.add("Column");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat14Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat14Array.add(targetInstance);
	//patternTrNetPat14HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp15() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat32Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat32Instance sourcePatternInstance1 = trNetPat32Array.get(i);
		
		
			LinkedList<AddIDColumnToDatabaseInstance> sourcePatternInstances2 = table0InAddIDColumnToDatabaseHash.get(sourcePatternInstance1.table0);
			
			if (sourcePatternInstances2 != null) {
				for (AddIDColumnToDatabaseInstance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat18Instance targetInstance = new TrNetPat18Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat18Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat18Array.add(targetInstance);
	//patternTrNetPat18HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp14() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat14Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat14Instance sourcePatternInstance = trNetPat14Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat15Instance targetInstance = new TrNetPat15Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column1;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.foreignKey0 = sourcePatternInstance.foreignKey0;
			targetInstance.foreignKey0.types.add("ForeignKey");
			}
		if (trNetPat15Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat15Array.add(targetInstance);
	//patternTrNetPat15HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat16Instance targetInstance = new TrNetPat16Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.foreignKey0 = sourcePatternInstance.foreignKey0;
			targetInstance.foreignKey0.types.add("ForeignKey");
			}
		if (trNetPat16Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat16Array.add(targetInstance);
	//patternTrNetPat16HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat17Instance targetInstance = new TrNetPat17Instance();
			{
			targetInstance.foreignKey0 = sourcePatternInstance.foreignKey0;
			targetInstance.foreignKey0.types.add("ForeignKey");
			}
		if (trNetPat17Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat17Array.add(targetInstance);
	//patternTrNetPat17HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp4() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat17Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat17Instance sourcePatternInstance1 = trNetPat17Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat2Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat2Instance sourcePatternInstance2 = trNetPat2Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat5Instance targetInstance = new TrNetPat5Instance();
			{
			targetInstance.foreignKey0 = sourcePatternInstance1.foreignKey0;
			targetInstance.foreignKey0.types.add("ForeignKey");
			}
			{
			targetInstance.database0 = sourcePatternInstance2.database0;
			targetInstance.database0.types.add("Database");
			}
		if (trNetPat5Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat5Array.add(targetInstance);
	//patternTrNetPat5HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp26() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat22Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat22Instance sourcePatternInstance1 = trNetPat22Array.get(i);
		
		
			LinkedList<TrNetPat7Instance> sourcePatternInstances2 = cClass0InTrNetPat7Hash.get(sourcePatternInstance1.cClass1);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat7Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat23Instance targetInstance = new TrNetPat23Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass1 = sourcePatternInstance1.cClass1;
			targetInstance.cClass1.types.add("CClass");
			}
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.table1 = sourcePatternInstance2.table0;
			targetInstance.table1.types.add("Table");
			}
		if (trNetPat23Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat23Array.add(targetInstance);
	//patternTrNetPat23HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp12() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat23Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat23Instance sourcePatternInstance1 = trNetPat23Array.get(i);
		
		
			LinkedList<AddIDColumnToDatabaseInstance> sourcePatternInstances2 = table0InAddIDColumnToDatabaseHash.get(sourcePatternInstance1.table1);
			
			if (sourcePatternInstances2 != null) {
				for (AddIDColumnToDatabaseInstance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass1 = sourcePatternInstance1.cClass1;
			targetInstance.cClass1.types.add("CClass");
			}
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.table1 = sourcePatternInstance1.table1;
			targetInstance.table1.types.add("Table");
			}
			{
			targetInstance.column1 = sourcePatternInstance2.column0;
			targetInstance.column1.types.add("Column");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	//patternTrNetPat13HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp13() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat13Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat13Instance sourcePatternInstance = trNetPat13Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("ForeignKey");
				
				targetInstance.foreignKey0 = node;
				
				}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.column1 = sourcePatternInstance.column1;
			targetInstance.column1.types.add("Column");
			}
		if (trNetPat14Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat14Array.add(targetInstance);
	//patternTrNetPat14HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp17() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat36Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat36Instance sourcePatternInstance1 = trNetPat36Array.get(i);
		
		
			LinkedList<AddIDColumnToDatabaseInstance> sourcePatternInstances2 = table0InAddIDColumnToDatabaseHash.get(sourcePatternInstance1.table0);
			
			if (sourcePatternInstances2 != null) {
				for (AddIDColumnToDatabaseInstance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat19Instance targetInstance = new TrNetPat19Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat19Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat19Array.add(targetInstance);
	//patternTrNetPat19HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp18() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat35Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat35Instance sourcePatternInstance1 = trNetPat35Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat19Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat19Instance sourcePatternInstance2 = trNetPat19Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("ForeignKey");
				
				targetInstance.foreignKey0 = node;
				}
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.column1 = sourcePatternInstance2.column0;
			targetInstance.column1.types.add("Column");
			}
		if (trNetPat14Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat14Array.add(targetInstance);
	//patternTrNetPat14HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp19() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat41Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat41Instance sourcePatternInstance1 = trNetPat41Array.get(i);
		
		
			LinkedList<AddIDColumnToDatabaseInstance> sourcePatternInstances2 = table0InAddIDColumnToDatabaseHash.get(sourcePatternInstance1.table0);
			
			if (sourcePatternInstances2 != null) {
				for (AddIDColumnToDatabaseInstance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat20Instance targetInstance = new TrNetPat20Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat20Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat20Array.add(targetInstance);
	//patternTrNetPat20HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp21() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat40Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat40Instance sourcePatternInstance1 = trNetPat40Array.get(i);
		
		
			LinkedList<AddIDColumnToDatabaseInstance> sourcePatternInstances2 = table0InAddIDColumnToDatabaseHash.get(sourcePatternInstance1.table0);
			
			if (sourcePatternInstances2 != null) {
				for (AddIDColumnToDatabaseInstance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat21Instance targetInstance = new TrNetPat21Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat21Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat21Array.add(targetInstance);
	//patternTrNetPat21HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp20() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat20Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat20Instance sourcePatternInstance1 = trNetPat20Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat38Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat38Instance sourcePatternInstance2 = trNetPat38Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("ForeignKey");
				
				targetInstance.foreignKey0 = node;
				}
			{
			targetInstance.column1 = sourcePatternInstance1.column0;
			targetInstance.column1.types.add("Column");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat14Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat14Array.add(targetInstance);
	//patternTrNetPat14HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp22() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat21Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat21Instance sourcePatternInstance1 = trNetPat21Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat39Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat39Instance sourcePatternInstance2 = trNetPat39Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("ForeignKey");
				
				targetInstance.foreignKey0 = node;
				}
			{
			targetInstance.column1 = sourcePatternInstance1.column0;
			targetInstance.column1.types.add("Column");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat14Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat14Array.add(targetInstance);
	//patternTrNetPat14HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
	
	boolean executeOperatorInputClasses() {
		return true;
	}
	
	public void registerInputClassesPublisher(ModelPatternPublisher publisher) {
		publisher.registerListener(inputInputClasses);
	}
	
	public void registerOutputRelationalListener(ModelPatternListener listener) {
		outputOutputRelational.registerListener(listener);
	}
}






