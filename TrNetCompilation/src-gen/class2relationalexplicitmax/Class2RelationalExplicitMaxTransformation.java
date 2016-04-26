package class2relationalexplicitmax;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;

import generic.*;

public class Class2RelationalExplicitMaxTransformation
implements 			TrNetPat26InstanceListener
			,TrNetPat23InstanceListener
			,TrNetPat1InstanceListener
			,TrNetPat27InstanceListener
			,TrNetPat25InstanceListener
			,TrNetPat17InstanceListener
			,PatExtendsInstanceListener
			,TrNetPat9InstancePublisher
			,TrNetPat6InstancePublisher
			,TrNetPat4InstancePublisher
			,TrNetPat13InstancePublisher
			,TrNetPat12InstancePublisher
			,TrNetPat999InstancePublisher
			,TrNetPat15InstancePublisher
			,TrNetPat11InstancePublisher
			,TrNetPat3InstancePublisher
			,TrNetPat8InstancePublisher
			,TrNetPat10InstancePublisher
			,TrNetPat21InstancePublisher
			,TrNetPat7InstancePublisher
			,PatExtendsColumnInstancePublisher
			,TrNetPat2InstancePublisher
			,PatternTypeInstancePublisher
			,TrNetPat14InstancePublisher
{
	public long totalElementPlacementCounter = 0;
	public long totalCombinationsCounter = 0;
	public int totalNumberOfOperatorsInTheNetwork = 61;
	public int totalNumberOfPatternsInTheNetwork = 40;
	TrNetOp1ExternalInput inputTrNetOp1;
	TrNetOp3ExternalOutput outputTrNetOp3;
	ArrayList<TrNetPat1Instance> trNetPat1Array;
	HashSet<TrNetPat1Instance> trNetPat1Set; 
	ArrayList<TrNetPat2Instance> trNetPat2Array;
	HashSet<TrNetPat2Instance> trNetPat2Set; 
	ArrayList<TrNetPat17Instance> trNetPat17Array;
	HashSet<TrNetPat17Instance> trNetPat17Set; 
	ArrayList<TrNetPat18Instance> trNetPat18Array;
	HashSet<TrNetPat18Instance> trNetPat18Set; 
		HashMap<ModelNode, LinkedList<TrNetPat18Instance>> cClass0InTrNetPat18Hash;
	ArrayList<TrNetPat23Instance> trNetPat23Array;
	HashSet<TrNetPat23Instance> trNetPat23Set; 
	ArrayList<TrNetPat24Instance> trNetPat24Array;
	HashSet<TrNetPat24Instance> trNetPat24Set; 
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> datatype0InTrNetPat24Hash;
	ArrayList<TrNetPat3Instance> trNetPat3Array;
	HashSet<TrNetPat3Instance> trNetPat3Set; 
	ArrayList<TrNetPat4Instance> trNetPat4Array;
	HashSet<TrNetPat4Instance> trNetPat4Set; 
	ArrayList<TrNetPat25Instance> trNetPat25Array;
	HashSet<TrNetPat25Instance> trNetPat25Set; 
	ArrayList<TrNetPat19Instance> trNetPat19Array;
	HashSet<TrNetPat19Instance> trNetPat19Set; 
	ArrayList<TrNetPat26Instance> trNetPat26Array;
	HashSet<TrNetPat26Instance> trNetPat26Set; 
	ArrayList<TrNetPat5Instance> trNetPat5Array;
	HashSet<TrNetPat5Instance> trNetPat5Set; 
	ArrayList<TrNetPat6Instance> trNetPat6Array;
	HashSet<TrNetPat6Instance> trNetPat6Set; 
	ArrayList<TrNetPat27Instance> trNetPat27Array;
	HashSet<TrNetPat27Instance> trNetPat27Set; 
	ArrayList<TrNetPat20Instance> trNetPat20Array;
	HashSet<TrNetPat20Instance> trNetPat20Set; 
	ArrayList<TrNetPat16Instance> trNetPat16Array;
	HashSet<TrNetPat16Instance> trNetPat16Set; 
	ArrayList<TrNetPat999Instance> trNetPat999Array;
	HashSet<TrNetPat999Instance> trNetPat999Set; 
	ArrayList<TrNetPat21Instance> trNetPat21Array;
	HashSet<TrNetPat21Instance> trNetPat21Set; 
	ArrayList<TrNetPat8Instance> trNetPat8Array;
	HashSet<TrNetPat8Instance> trNetPat8Set; 
	ArrayList<TrNetPat9Instance> trNetPat9Array;
	HashSet<TrNetPat9Instance> trNetPat9Set; 
	ArrayList<TrNetPat13Instance> trNetPat13Array;
	HashSet<TrNetPat13Instance> trNetPat13Set; 
	ArrayList<TrNetPat15Instance> trNetPat15Array;
	HashSet<TrNetPat15Instance> trNetPat15Set; 
	ArrayList<TrNetPat10Instance> trNetPat10Array;
	HashSet<TrNetPat10Instance> trNetPat10Set; 
	ArrayList<TrNetPat7Instance> trNetPat7Array;
	HashSet<TrNetPat7Instance> trNetPat7Set; 
	ArrayList<TrNetPat11Instance> trNetPat11Array;
	HashSet<TrNetPat11Instance> trNetPat11Set; 
	ArrayList<TrNetPat12Instance> trNetPat12Array;
	HashSet<TrNetPat12Instance> trNetPat12Set; 
	ArrayList<TrNetPat14Instance> trNetPat14Array;
	HashSet<TrNetPat14Instance> trNetPat14Set; 
	ArrayList<PatternTypeInstance> patternTypeArray;
	HashSet<PatternTypeInstance> patternTypeSet; 
	ArrayList<PatExtendsInstance> patExtendsArray;
	HashSet<PatExtendsInstance> patExtendsSet; 
	ArrayList<PatExtendsColumnInstance> patExtendsColumnArray;
	HashSet<PatExtendsColumnInstance> patExtendsColumnSet; 
	ArrayList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance> unionTrNetPat18_TrNetPat26_TrNetPat24_0Array;
	HashSet<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance> unionTrNetPat18_TrNetPat26_TrNetPat24_0Set; 
		HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>> cClass0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash;
		HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>> attribute0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash;
	ArrayList<UnionTrNetPat18_TrNetPat24_0Instance> unionTrNetPat18_TrNetPat24_0Array;
	HashSet<UnionTrNetPat18_TrNetPat24_0Instance> unionTrNetPat18_TrNetPat24_0Set; 
		HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat24_0Instance>> datatype0InUnionTrNetPat18_TrNetPat24_0Hash;
	ArrayList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance> unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Array;
	HashSet<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance> unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Set; 
		HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>> cClass0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash;
		HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>> attribute0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash;
	ArrayList<UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance> unionTrNetPat18_TrNetPat26_TrNetPat2_0Array;
	HashSet<UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance> unionTrNetPat18_TrNetPat26_TrNetPat2_0Set; 
	ArrayList<UnionTrNetPat18_TrNetPat26_0Instance> unionTrNetPat18_TrNetPat26_0Array;
	HashSet<UnionTrNetPat18_TrNetPat26_0Instance> unionTrNetPat18_TrNetPat26_0Set; 
	ArrayList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance> unionTrNetPat27_TrNetPat24_TrNetPat18_0Array;
	HashSet<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance> unionTrNetPat27_TrNetPat24_TrNetPat18_0Set; 
		HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>> attribute0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash;
		HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>> cClass0_0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash;
	ArrayList<UnionTrNetPat27_TrNetPat18_0Instance> unionTrNetPat27_TrNetPat18_0Array;
	HashSet<UnionTrNetPat27_TrNetPat18_0Instance> unionTrNetPat27_TrNetPat18_0Set; 
	ArrayList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance> unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Array;
	HashSet<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance> unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Set; 
		HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>> attribute0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash;
		HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>> cClass0_0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash;
	ArrayList<UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance> unionTrNetPat27_TrNetPat18_TrNetPat24_0Array;
	HashSet<UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance> unionTrNetPat27_TrNetPat18_TrNetPat24_0Set; 
	ArrayList<UnionTrNetPat27_TrNetPat18_1Instance> unionTrNetPat27_TrNetPat18_1Array;
	HashSet<UnionTrNetPat27_TrNetPat18_1Instance> unionTrNetPat27_TrNetPat18_1Set; 
	
	public Class2RelationalExplicitMaxTransformation(){
		
	trNetPat1Array = new ArrayList<TrNetPat1Instance>(1); 
	trNetPat1Set = new HashSet<TrNetPat1Instance>(1); 
	trNetPat2Array = new ArrayList<TrNetPat2Instance>(1); 
	trNetPat2Set = new HashSet<TrNetPat2Instance>(1); 
	trNetPat17Array = new ArrayList<TrNetPat17Instance>(10000); 
	trNetPat17Set = new HashSet<TrNetPat17Instance>(10000); 
	trNetPat18Array = new ArrayList<TrNetPat18Instance>(10000); 
	trNetPat18Set = new HashSet<TrNetPat18Instance>(10000); 
		cClass0InTrNetPat18Hash = new HashMap<ModelNode, LinkedList<TrNetPat18Instance>>(10000);
	trNetPat23Array = new ArrayList<TrNetPat23Instance>(2); 
	trNetPat23Set = new HashSet<TrNetPat23Instance>(2); 
	trNetPat24Array = new ArrayList<TrNetPat24Instance>(2); 
	trNetPat24Set = new HashSet<TrNetPat24Instance>(2); 
		datatype0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(2);
	trNetPat3Array = new ArrayList<TrNetPat3Instance>(10000); 
	trNetPat3Set = new HashSet<TrNetPat3Instance>(10000); 
	trNetPat4Array = new ArrayList<TrNetPat4Instance>(2); 
	trNetPat4Set = new HashSet<TrNetPat4Instance>(2); 
	trNetPat25Array = new ArrayList<TrNetPat25Instance>(10000); 
	trNetPat25Set = new HashSet<TrNetPat25Instance>(10000); 
	trNetPat19Array = new ArrayList<TrNetPat19Instance>(2); 
	trNetPat19Set = new HashSet<TrNetPat19Instance>(2); 
	trNetPat26Array = new ArrayList<TrNetPat26Instance>(2); 
	trNetPat26Set = new HashSet<TrNetPat26Instance>(2); 
	trNetPat5Array = new ArrayList<TrNetPat5Instance>(2); 
	trNetPat5Set = new HashSet<TrNetPat5Instance>(2); 
	trNetPat6Array = new ArrayList<TrNetPat6Instance>(5000); 
	trNetPat6Set = new HashSet<TrNetPat6Instance>(5000); 
	trNetPat27Array = new ArrayList<TrNetPat27Instance>(9998); 
	trNetPat27Set = new HashSet<TrNetPat27Instance>(9998); 
	trNetPat20Array = new ArrayList<TrNetPat20Instance>(5000); 
	trNetPat20Set = new HashSet<TrNetPat20Instance>(5000); 
	trNetPat16Array = new ArrayList<TrNetPat16Instance>(5000); 
	trNetPat16Set = new HashSet<TrNetPat16Instance>(5000); 
	trNetPat999Array = new ArrayList<TrNetPat999Instance>(5000); 
	trNetPat999Set = new HashSet<TrNetPat999Instance>(5000); 
	trNetPat21Array = new ArrayList<TrNetPat21Instance>(10000); 
	trNetPat21Set = new HashSet<TrNetPat21Instance>(10000); 
	trNetPat8Array = new ArrayList<TrNetPat8Instance>(10000); 
	trNetPat8Set = new HashSet<TrNetPat8Instance>(10000); 
	trNetPat9Array = new ArrayList<TrNetPat9Instance>(10000); 
	trNetPat9Set = new HashSet<TrNetPat9Instance>(10000); 
	trNetPat13Array = new ArrayList<TrNetPat13Instance>(10000); 
	trNetPat13Set = new HashSet<TrNetPat13Instance>(10000); 
	trNetPat15Array = new ArrayList<TrNetPat15Instance>(10000); 
	trNetPat15Set = new HashSet<TrNetPat15Instance>(10000); 
	trNetPat10Array = new ArrayList<TrNetPat10Instance>(2); 
	trNetPat10Set = new HashSet<TrNetPat10Instance>(2); 
	trNetPat7Array = new ArrayList<TrNetPat7Instance>(1); 
	trNetPat7Set = new HashSet<TrNetPat7Instance>(1); 
	trNetPat11Array = new ArrayList<TrNetPat11Instance>(5000); 
	trNetPat11Set = new HashSet<TrNetPat11Instance>(5000); 
	trNetPat12Array = new ArrayList<TrNetPat12Instance>(5000); 
	trNetPat12Set = new HashSet<TrNetPat12Instance>(5000); 
	trNetPat14Array = new ArrayList<TrNetPat14Instance>(5000); 
	trNetPat14Set = new HashSet<TrNetPat14Instance>(5000); 
	patternTypeArray = new ArrayList<PatternTypeInstance>(2); 
	patternTypeSet = new HashSet<PatternTypeInstance>(2); 
	patExtendsArray = new ArrayList<PatExtendsInstance>(4963); 
	patExtendsSet = new HashSet<PatExtendsInstance>(4963); 
	patExtendsColumnArray = new ArrayList<PatExtendsColumnInstance>(4963); 
	patExtendsColumnSet = new HashSet<PatExtendsColumnInstance>(4963); 
	unionTrNetPat18_TrNetPat26_TrNetPat24_0Array = new ArrayList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>(20000); 
	unionTrNetPat18_TrNetPat26_TrNetPat24_0Set = new HashSet<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>(20000); 
		cClass0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>>(20000);
		attribute0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>>(20000);
	unionTrNetPat18_TrNetPat24_0Array = new ArrayList<UnionTrNetPat18_TrNetPat24_0Instance>(20000); 
	unionTrNetPat18_TrNetPat24_0Set = new HashSet<UnionTrNetPat18_TrNetPat24_0Instance>(20000); 
		datatype0InUnionTrNetPat18_TrNetPat24_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat24_0Instance>>(20000);
	unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Array = new ArrayList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>(20000); 
	unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Set = new HashSet<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>(20000); 
		cClass0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>>(20000);
		attribute0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>>(20000);
	unionTrNetPat18_TrNetPat26_TrNetPat2_0Array = new ArrayList<UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance>(20000); 
	unionTrNetPat18_TrNetPat26_TrNetPat2_0Set = new HashSet<UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance>(20000); 
	unionTrNetPat18_TrNetPat26_0Array = new ArrayList<UnionTrNetPat18_TrNetPat26_0Instance>(20000); 
	unionTrNetPat18_TrNetPat26_0Set = new HashSet<UnionTrNetPat18_TrNetPat26_0Instance>(20000); 
	unionTrNetPat27_TrNetPat24_TrNetPat18_0Array = new ArrayList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>(199960000); 
	unionTrNetPat27_TrNetPat24_TrNetPat18_0Set = new HashSet<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>(199960000); 
		attribute0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>>(199960000);
		cClass0_0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>>(199960000);
	unionTrNetPat27_TrNetPat18_0Array = new ArrayList<UnionTrNetPat27_TrNetPat18_0Instance>(99980000); 
	unionTrNetPat27_TrNetPat18_0Set = new HashSet<UnionTrNetPat27_TrNetPat18_0Instance>(99980000); 
	unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Array = new ArrayList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>(199960000); 
	unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Set = new HashSet<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>(199960000); 
		attribute0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>>(199960000);
		cClass0_0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash = new HashMap<ModelNode, LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>>(199960000);
	unionTrNetPat27_TrNetPat18_TrNetPat24_0Array = new ArrayList<UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance>(199960000); 
	unionTrNetPat27_TrNetPat18_TrNetPat24_0Set = new HashSet<UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance>(199960000); 
	unionTrNetPat27_TrNetPat18_1Array = new ArrayList<UnionTrNetPat27_TrNetPat18_1Instance>(99980000); 
	unionTrNetPat27_TrNetPat18_1Set = new HashSet<UnionTrNetPat27_TrNetPat18_1Instance>(99980000); 
		
	listenersTrNetPat9Instance = new LinkedList<TrNetPat9InstanceListener>();
	listenersTrNetPat6Instance = new LinkedList<TrNetPat6InstanceListener>();
	listenersTrNetPat4Instance = new LinkedList<TrNetPat4InstanceListener>();
	listenersTrNetPat13Instance = new LinkedList<TrNetPat13InstanceListener>();
	listenersTrNetPat12Instance = new LinkedList<TrNetPat12InstanceListener>();
	listenersTrNetPat999Instance = new LinkedList<TrNetPat999InstanceListener>();
	listenersTrNetPat15Instance = new LinkedList<TrNetPat15InstanceListener>();
	listenersTrNetPat11Instance = new LinkedList<TrNetPat11InstanceListener>();
	listenersTrNetPat3Instance = new LinkedList<TrNetPat3InstanceListener>();
	listenersTrNetPat8Instance = new LinkedList<TrNetPat8InstanceListener>();
	listenersTrNetPat10Instance = new LinkedList<TrNetPat10InstanceListener>();
	listenersTrNetPat21Instance = new LinkedList<TrNetPat21InstanceListener>();
	listenersTrNetPat7Instance = new LinkedList<TrNetPat7InstanceListener>();
	listenersPatExtendsColumnInstance = new LinkedList<PatExtendsColumnInstanceListener>();
	listenersTrNetPat2Instance = new LinkedList<TrNetPat2InstanceListener>();
	listenersPatternTypeInstance = new LinkedList<PatternTypeInstanceListener>();
	listenersTrNetPat14Instance = new LinkedList<TrNetPat14InstanceListener>();
		
		
	inputTrNetOp1 = new TrNetOp1ExternalInput();
		inputTrNetOp1.registerListener( (TrNetPat1InstanceListener) this);
		inputTrNetOp1.registerListener( (TrNetPat17InstanceListener) this);
		inputTrNetOp1.registerListener( (TrNetPat23InstanceListener) this);
		inputTrNetOp1.registerListener( (TrNetPat25InstanceListener) this);
		inputTrNetOp1.registerListener( (TrNetPat26InstanceListener) this);
		inputTrNetOp1.registerListener( (TrNetPat27InstanceListener) this);
		inputTrNetOp1.registerListener( (PatExtendsInstanceListener) this);
		
	outputTrNetOp3 = new TrNetOp3ExternalOutput();
		this.registerListener((TrNetPat2InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat3InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat4InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat6InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat999InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat21InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat8InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat9InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat13InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat15InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat10InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat7InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat11InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat12InstanceListener) outputTrNetOp3);
		this.registerListener((TrNetPat14InstanceListener) outputTrNetOp3);
		this.registerListener((PatternTypeInstanceListener) outputTrNetOp3);
		this.registerListener((PatExtendsColumnInstanceListener) outputTrNetOp3);
	}
	
	
	// aqui fica a execucao de todo o plano de execucao da transformacao, idealmente, incluindo os ciclos.
	public void run() {
		
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp32();
	executeOperatorTrNetOp48();
	executeOperatorOpunionTrNetPat18_TrNetPat26_0();
	executeOperatorTrNetOp49();
	executeOperatorTrNetOp45();
	executeOperatorOpExtends();
	executeOperatorOpunionTrNetPat27_TrNetPat18_0();
	executeOperatorTrNetOp2();
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp50();
	executeOperatorOperatorType();
	executeOperatorOpunionTrNetPat27_TrNetPat24_TrNetPat18_0();
	executeOperatorTrNetOp5();
	executeOperatorTrNetOp39();
	executeOperatorTrNetOp40();
	executeOperatorTrNetOp43();
	executeOperatorProjected1();
	executeOperatorOpunionTrNetPat18_TrNetPat26_TrNetPat2_0();
	executeOperatorOpunionTrNetPat18_TrNetPat24_0();
	executeOperatorOpunionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0();
	executeOperatorTrNetOp6();
	executeOperatorTrNetOp11();
	executeOperatorTrNetOp9();
	executeOperatorTrNetOp16();
	executeOperatorTrNetOp18();
	executeOperatorTrNetOp13();
	executeOperatorTrNetOp41();
	executeOperatorOpunionTrNetPat18_TrNetPat26_TrNetPat24_0();
	executeOperatorTrNetOp33();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp35();
	executeOperatorTrNetOp36();
	executeOperatorTrNetOp15();
	executeOperatorTrNetOp44();
	executeOperatorTrNetOp42();
	executeOperatorTrNetOp8();
	executeOperatorTrNetOp7();
	executeOperatorTrNetOp10();
	executeOperatorTrNetOp37();
	executeOperatorTrNetOp12();
	executeOperatorTrNetOp34();
	executeOperatorTrNetOp14();
	executeOperatorOpunionTrNetPat27_TrNetPat18_1();
	executeOperatorOpunionTrNetPat27_TrNetPat18_TrNetPat24_0();
	executeOperatorOpunionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0();
	executeOperatorTrNetOp19();
	executeOperatorTrNetOp31();
	executeOperatorTrNetOp24();
	executeOperatorTrNetOp26();
	executeOperatorTrNetOp30();
	executeOperatorTrNetOp23();
	executeOperatorTrNetOp27();
	executeOperatorTrNetOp29();
	executeOperatorTrNetOp20();
	executeOperatorTrNetOp21();
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp28();
	executeOperatorOpProjExtends();
	executeOperatorTrNetOp4();
	executeOperatorTrNetOp17();
	executeOperatorTrNetOp22();
	executeOperatorTrNetOp3();
		
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
				patternStats.realSize = trNetPat17Set.size();
				
				
				result.put("TrNetPat17", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat18Set.size();
				
				
				result.put("TrNetPat18", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat23Set.size();
				
				
				result.put("TrNetPat23", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat24Set.size();
				
				
				result.put("TrNetPat24", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat3Set.size();
				
				
				result.put("TrNetPat3", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat4Set.size();
				
				
				result.put("TrNetPat4", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat25Set.size();
				
				
				result.put("TrNetPat25", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.57952930026852;
				patternStats.realSize = trNetPat19Set.size();
				
				
				result.put("TrNetPat19", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat26Set.size();
				
				
				result.put("TrNetPat26", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.57952930026852;
				patternStats.realSize = trNetPat5Set.size();
				
				
				result.put("TrNetPat5", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat6Set.size();
				
				
				result.put("TrNetPat6", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9998.0;
				patternStats.realSize = trNetPat27Set.size();
				
				
				result.put("TrNetPat27", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat20Set.size();
				
				
				result.put("TrNetPat20", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat16Set.size();
				
				
				result.put("TrNetPat16", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat999Set.size();
				
				
				result.put("TrNetPat999", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat21Set.size();
				
				
				result.put("TrNetPat21", patternStats);
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
				patternStats.realSize = trNetPat9Set.size();
				
				
				result.put("TrNetPat9", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat13Set.size();
				
				
				result.put("TrNetPat13", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10000.0;
				patternStats.realSize = trNetPat15Set.size();
				
				
				result.put("TrNetPat15", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat10Set.size();
				
				
				result.put("TrNetPat10", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat7Set.size();
				
				
				result.put("TrNetPat7", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat11Set.size();
				
				
				result.put("TrNetPat11", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat12Set.size();
				
				
				result.put("TrNetPat12", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5000.0;
				patternStats.realSize = trNetPat14Set.size();
				
				
				result.put("TrNetPat14", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = patternTypeSet.size();
				
				
				result.put("patternType", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4963.0;
				patternStats.realSize = patExtendsSet.size();
				
				
				result.put("patExtends", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4963.0;
				patternStats.realSize = patExtendsColumnSet.size();
				
				
				result.put("PatExtendsColumn", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20000.0;
				patternStats.realSize = unionTrNetPat18_TrNetPat26_TrNetPat24_0Set.size();
				
				
				result.put("unionTrNetPat18_TrNetPat26_TrNetPat24_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20000.0;
				patternStats.realSize = unionTrNetPat18_TrNetPat24_0Set.size();
				
				
				result.put("unionTrNetPat18_TrNetPat24_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20000.0;
				patternStats.realSize = unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Set.size();
				
				
				result.put("unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20000.0;
				patternStats.realSize = unionTrNetPat18_TrNetPat26_TrNetPat2_0Set.size();
				
				
				result.put("unionTrNetPat18_TrNetPat26_TrNetPat2_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20000.0;
				patternStats.realSize = unionTrNetPat18_TrNetPat26_0Set.size();
				
				
				result.put("unionTrNetPat18_TrNetPat26_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.9996E8;
				patternStats.realSize = unionTrNetPat27_TrNetPat24_TrNetPat18_0Set.size();
				
				
				result.put("unionTrNetPat27_TrNetPat24_TrNetPat18_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9.998E7;
				patternStats.realSize = unionTrNetPat27_TrNetPat18_0Set.size();
				
				
				result.put("unionTrNetPat27_TrNetPat18_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.9996E8;
				patternStats.realSize = unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Set.size();
				
				
				result.put("unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.9996E8;
				patternStats.realSize = unionTrNetPat27_TrNetPat18_TrNetPat24_0Set.size();
				
				
				result.put("unionTrNetPat27_TrNetPat18_TrNetPat24_0", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9.998E7;
				patternStats.realSize = unionTrNetPat27_TrNetPat18_1Set.size();
				
				
				result.put("unionTrNetPat27_TrNetPat18_1", patternStats);
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat17");
					
					patternStatsFile.append("TrNetPat17");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat23");
					
					patternStatsFile.append("TrNetPat23");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat3");
					
					patternStatsFile.append("TrNetPat3");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat25");
					
					patternStatsFile.append("TrNetPat25");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat26");
					
					patternStatsFile.append("TrNetPat26");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat6");
					
					patternStatsFile.append("TrNetPat6");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat20");
					
					patternStatsFile.append("TrNetPat20");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat999");
					
					patternStatsFile.append("TrNetPat999");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat9");
					
					patternStatsFile.append("TrNetPat9");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat15");
					
					patternStatsFile.append("TrNetPat15");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat7");
					
					patternStatsFile.append("TrNetPat7");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat12");
					
					patternStatsFile.append("TrNetPat12");
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
					generic.PatternStats patternStats = statsMap.get("patternType");
					
					patternStatsFile.append("patternType");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("patExtends");
					
					patternStatsFile.append("patExtends");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("PatExtendsColumn");
					
					patternStatsFile.append("PatExtendsColumn");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat18_TrNetPat26_TrNetPat24_0");
					
					patternStatsFile.append("unionTrNetPat18_TrNetPat26_TrNetPat24_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat18_TrNetPat24_0");
					
					patternStatsFile.append("unionTrNetPat18_TrNetPat24_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0");
					
					patternStatsFile.append("unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat18_TrNetPat26_TrNetPat2_0");
					
					patternStatsFile.append("unionTrNetPat18_TrNetPat26_TrNetPat2_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat18_TrNetPat26_0");
					
					patternStatsFile.append("unionTrNetPat18_TrNetPat26_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat27_TrNetPat24_TrNetPat18_0");
					
					patternStatsFile.append("unionTrNetPat27_TrNetPat24_TrNetPat18_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat27_TrNetPat18_0");
					
					patternStatsFile.append("unionTrNetPat27_TrNetPat18_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0");
					
					patternStatsFile.append("unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat27_TrNetPat18_TrNetPat24_0");
					
					patternStatsFile.append("unionTrNetPat27_TrNetPat18_TrNetPat24_0");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("unionTrNetPat27_TrNetPat18_1");
					
					patternStatsFile.append("unionTrNetPat27_TrNetPat18_1");
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
	
	public void notify(TrNetPat26Instance element){
		if (trNetPat26Set.add(element)) {
			trNetPat26Array.add(element);
			/*
	executeOperatorOpunionTrNetPat18_TrNetPat26_TrNetPat24_0();
	executeOperatorOpunionTrNetPat18_TrNetPat26_0();
			*/
		}
	}
	public void notify(TrNetPat23Instance element){
		if (trNetPat23Set.add(element)) {
			trNetPat23Array.add(element);
			/*
	executeOperatorTrNetOp50();
			*/
		}
	}
	public void notify(TrNetPat1Instance element){
		if (trNetPat1Set.add(element)) {
			trNetPat1Array.add(element);
			/*
	executeOperatorTrNetOp2();
			*/
		}
	}
	public void notify(TrNetPat27Instance element){
		if (trNetPat27Set.add(element)) {
			trNetPat27Array.add(element);
			/*
	executeOperatorOpunionTrNetPat27_TrNetPat18_0();
	executeOperatorOpunionTrNetPat27_TrNetPat18_1();
			*/
		}
	}
	public void notify(TrNetPat25Instance element){
		if (trNetPat25Set.add(element)) {
			trNetPat25Array.add(element);
			/*
	executeOperatorTrNetOp33();
	executeOperatorTrNetOp6();
	executeOperatorTrNetOp39();
	executeOperatorTrNetOp19();
			*/
		}
	}
	public void notify(TrNetPat17Instance element){
		if (trNetPat17Set.add(element)) {
			trNetPat17Array.add(element);
			/*
	executeOperatorTrNetOp32();
			*/
		}
	}
	public void notify(PatExtendsInstance element){
		if (patExtendsSet.add(element)) {
			patExtendsArray.add(element);
			/*
	executeOperatorOpExtends();
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

LinkedList<TrNetPat6InstanceListener> listenersTrNetPat6Instance;

public void registerListener(TrNetPat6InstanceListener listener){
	listenersTrNetPat6Instance.add(listener);
}
	
public void notifyListeners(TrNetPat6Instance element){
	for (TrNetPat6InstanceListener listener : listenersTrNetPat6Instance){
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

LinkedList<TrNetPat13InstanceListener> listenersTrNetPat13Instance;

public void registerListener(TrNetPat13InstanceListener listener){
	listenersTrNetPat13Instance.add(listener);
}
	
public void notifyListeners(TrNetPat13Instance element){
	for (TrNetPat13InstanceListener listener : listenersTrNetPat13Instance){
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

LinkedList<TrNetPat999InstanceListener> listenersTrNetPat999Instance;

public void registerListener(TrNetPat999InstanceListener listener){
	listenersTrNetPat999Instance.add(listener);
}
	
public void notifyListeners(TrNetPat999Instance element){
	for (TrNetPat999InstanceListener listener : listenersTrNetPat999Instance){
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

LinkedList<TrNetPat11InstanceListener> listenersTrNetPat11Instance;

public void registerListener(TrNetPat11InstanceListener listener){
	listenersTrNetPat11Instance.add(listener);
}
	
public void notifyListeners(TrNetPat11Instance element){
	for (TrNetPat11InstanceListener listener : listenersTrNetPat11Instance){
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

LinkedList<TrNetPat8InstanceListener> listenersTrNetPat8Instance;

public void registerListener(TrNetPat8InstanceListener listener){
	listenersTrNetPat8Instance.add(listener);
}
	
public void notifyListeners(TrNetPat8Instance element){
	for (TrNetPat8InstanceListener listener : listenersTrNetPat8Instance){
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

LinkedList<TrNetPat21InstanceListener> listenersTrNetPat21Instance;

public void registerListener(TrNetPat21InstanceListener listener){
	listenersTrNetPat21Instance.add(listener);
}
	
public void notifyListeners(TrNetPat21Instance element){
	for (TrNetPat21InstanceListener listener : listenersTrNetPat21Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat7InstanceListener> listenersTrNetPat7Instance;

public void registerListener(TrNetPat7InstanceListener listener){
	listenersTrNetPat7Instance.add(listener);
}
	
public void notifyListeners(TrNetPat7Instance element){
	for (TrNetPat7InstanceListener listener : listenersTrNetPat7Instance){
		listener.notify(element);
	}
}

LinkedList<PatExtendsColumnInstanceListener> listenersPatExtendsColumnInstance;

public void registerListener(PatExtendsColumnInstanceListener listener){
	listenersPatExtendsColumnInstance.add(listener);
}
	
public void notifyListeners(PatExtendsColumnInstance element){
	for (PatExtendsColumnInstanceListener listener : listenersPatExtendsColumnInstance){
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

LinkedList<PatternTypeInstanceListener> listenersPatternTypeInstance;

public void registerListener(PatternTypeInstanceListener listener){
	listenersPatternTypeInstance.add(listener);
}
	
public void notifyListeners(PatternTypeInstance element){
	for (PatternTypeInstanceListener listener : listenersPatternTypeInstance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat14InstanceListener> listenersTrNetPat14Instance;

public void registerListener(TrNetPat14InstanceListener listener){
	listenersTrNetPat14Instance.add(listener);
}
	
public void notifyListeners(TrNetPat14Instance element){
	for (TrNetPat14InstanceListener listener : listenersTrNetPat14Instance){
		listener.notify(element);
	}
}

	
	
boolean executeOperatorTrNetOp3() {
	boolean operatorHasExecuted = false;
	
	{
		int sourcePatternSize = trNetPat2Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat2Instance sourcePatternInstance = trNetPat2Array.get(i);
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
		int sourcePatternSize = trNetPat4Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat4Instance sourcePatternInstance = trNetPat4Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat6Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat6Instance sourcePatternInstance = trNetPat6Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat999Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat999Instance sourcePatternInstance = trNetPat999Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat21Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat21Instance sourcePatternInstance = trNetPat21Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat8Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat8Instance sourcePatternInstance = trNetPat8Array.get(i);
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
		int sourcePatternSize = trNetPat13Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat13Instance sourcePatternInstance = trNetPat13Array.get(i);
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
		int sourcePatternSize = trNetPat10Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat10Instance sourcePatternInstance = trNetPat10Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat7Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat7Instance sourcePatternInstance = trNetPat7Array.get(i);
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
		int sourcePatternSize = trNetPat12Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat12Instance sourcePatternInstance = trNetPat12Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat14Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat14Instance sourcePatternInstance = trNetPat14Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = patternTypeArray.size();
		for (int i = 0; i<sourcePatternSize; i++){
			PatternTypeInstance sourcePatternInstance = patternTypeArray.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = patExtendsColumnArray.size();
		for (int i = 0; i<sourcePatternSize; i++){
			PatExtendsColumnInstance sourcePatternInstance = patExtendsColumnArray.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp2() {
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
boolean executeOperatorTrNetOp32() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat17Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat17Instance sourcePatternInstance = trNetPat17Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat18Instance targetInstance = new TrNetPat18Instance();
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
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.AttrCalculation.colID(sourcePatternInstance.cClass0.attributes.get("name")));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				
				}
			{
			targetInstance.cClass0 = sourcePatternInstance.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
		if (trNetPat18Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat18Array.add(targetInstance);
	{
		if (!cClass0InTrNetPat18Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat18Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat18Instance>());
		}
		cClass0InTrNetPat18Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	//patternTrNetPat18HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp50() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat23Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat23Instance sourcePatternInstance = trNetPat23Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat24Instance targetInstance = new TrNetPat24Instance();
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
		if (trNetPat24Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat24Array.add(targetInstance);
	{
		if (!datatype0InTrNetPat24Hash.containsKey(targetInstance.datatype0)) {
			datatype0InTrNetPat24Hash.put(targetInstance.datatype0, new LinkedList<TrNetPat24Instance>());
		}
		datatype0InTrNetPat24Hash.get(targetInstance.datatype0).add(targetInstance);
	}
	//patternTrNetPat24HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp4() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat18Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat18Instance sourcePatternInstance2 = trNetPat18Array.get(j);
				
				
				
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
boolean executeOperatorTrNetOp5() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat24Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat24Instance sourcePatternInstance2 = trNetPat24Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat4Instance targetInstance = new TrNetPat4Instance();
			{
			targetInstance.database0 = sourcePatternInstance1.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp33() {
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
		
			LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance> sourcePatternInstances2 = cClass0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfalse(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
					
	if (! sourcePatternInstance1.attribute0.equals(sourcePatternInstance2.attribute0)) {
		continue;
	}
					
	{
			totalCombinationsCounter++;
		TrNetPat19Instance targetInstance = new TrNetPat19Instance();
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
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp6() {
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
		
			LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance> sourcePatternInstances2 = cClass0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.istrue(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
					
	if (! sourcePatternInstance1.attribute0.equals(sourcePatternInstance2.attribute0)) {
		continue;
	}
					
	{
			totalCombinationsCounter++;
		TrNetPat5Instance targetInstance = new TrNetPat5Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.AttrCalculation.junctTableName(sourcePatternInstance1.attribute0.attributes.get("name")));
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
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance1.attribute0.attributes.get("name")));
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
	node.attributes.put("name", generic.utils.AttrCalculation.foreignkeycol(sourcePatternInstance1.cClass0.attributes.get("name")));
	node.types.add("Column");
				
				targetInstance.column1 = node;
				}
			{
			targetInstance.database0 = sourcePatternInstance2.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
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
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp7() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat5Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat5Instance sourcePatternInstance1 = trNetPat5Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat24Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat24Instance sourcePatternInstance2 = trNetPat24Array.get(j);
				
	if (sourcePatternInstance2.datatype0.attributes.get("name")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isInteger(sourcePatternInstance2.datatype0.attributes.get("name"))) {
		continue;
	}
				
				
	{
			totalCombinationsCounter++;
		TrNetPat6Instance targetInstance = new TrNetPat6Instance();
			{
			targetInstance.column0 = sourcePatternInstance1.column1;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat6Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat6Array.add(targetInstance);
	//patternTrNetPat6HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp39() {
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
		
			LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance> sourcePatternInstances2 = cClass0_0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfalse(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
	if (sourcePatternInstance2.datatype0.attributes.get("name")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isInteger(sourcePatternInstance2.datatype0.attributes.get("name"))) {
		continue;
	}
					
	if (! sourcePatternInstance1.attribute0.equals(sourcePatternInstance2.attribute0)) {
		continue;
	}
					
	{
			totalCombinationsCounter++;
		TrNetPat20Instance targetInstance = new TrNetPat20Instance();
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
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp19() {
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
		
			LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance> sourcePatternInstances2 = cClass0_0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (sourcePatternInstance1.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.istrue(sourcePatternInstance1.attribute0.attributes.get("isMany"))) {
		continue;
	}
	if (sourcePatternInstance2.datatype0.attributes.get("name")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isInteger(sourcePatternInstance2.datatype0.attributes.get("name"))) {
		continue;
	}
					
	if (! sourcePatternInstance1.attribute0.equals(sourcePatternInstance2.attribute0)) {
		continue;
	}
					
	{
			totalCombinationsCounter++;
		TrNetPat16Instance targetInstance = new TrNetPat16Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.AttrCalculation.junctablecolid(sourcePatternInstance1.cClass0.attributes.get("name")));
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
	node.attributes.put("name", generic.utils.AttrCalculation.foreignkeycol(sourcePatternInstance2.cClass0.attributes.get("name")));
	node.types.add("Column");
				
				targetInstance.column1 = node;
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
	node.attributes.put("name", generic.utils.AttrCalculation.junctTableName(sourcePatternInstance1.attribute0.attributes.get("name")));
	node.types.add("Table");
				
				targetInstance.table0 = node;
				}
			{
			targetInstance.database0 = sourcePatternInstance2.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat16Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat16Array.add(targetInstance);
	//patternTrNetPat16HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorProjected1() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat20Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat6Instance targetInstance = new TrNetPat6Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat6Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat6Array.add(targetInstance);
	//patternTrNetPat6HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp20() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat3Instance targetInstance = new TrNetPat3Instance();
			{
			targetInstance.database0 = sourcePatternInstance.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.table0 = sourcePatternInstance.table0;
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
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp21() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat6Instance targetInstance = new TrNetPat6Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat6Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat6Array.add(targetInstance);
	//patternTrNetPat6HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp22() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat999Instance targetInstance = new TrNetPat999Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column1;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat999Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat999Array.add(targetInstance);
	//patternTrNetPat999HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp44() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat21Instance targetInstance = new TrNetPat21Instance();
			{
			targetInstance.cClass0 = sourcePatternInstance.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
		if (trNetPat21Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat21Array.add(targetInstance);
	//patternTrNetPat21HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp45() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
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
boolean executeOperatorTrNetOp46() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
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
boolean executeOperatorTrNetOp48() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	//patternTrNetPat13HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp49() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat15Instance targetInstance = new TrNetPat15Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat15Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat15Array.add(targetInstance);
	//patternTrNetPat15HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp34() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat19Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat19Instance sourcePatternInstance = trNetPat19Array.get(i);
		
		
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
boolean executeOperatorTrNetOp35() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat19Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat19Instance sourcePatternInstance = trNetPat19Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
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
boolean executeOperatorTrNetOp36() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat19Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat19Instance sourcePatternInstance = trNetPat19Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp37() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat19Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat19Instance sourcePatternInstance = trNetPat19Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	//patternTrNetPat13HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp8() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat7Instance targetInstance = new TrNetPat7Instance();
			{
			targetInstance.database0 = sourcePatternInstance.database0;
			targetInstance.database0.types.add("Database");
			}
		if (trNetPat7Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat7Array.add(targetInstance);
	//patternTrNetPat7HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp9() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
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
boolean executeOperatorTrNetOp10() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
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
boolean executeOperatorTrNetOp11() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp12() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat11Instance targetInstance = new TrNetPat11Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column1;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat11Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat11Array.add(targetInstance);
	//patternTrNetPat11HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp13() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat3Instance targetInstance = new TrNetPat3Instance();
			{
			targetInstance.database0 = sourcePatternInstance.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.table0 = sourcePatternInstance.table0;
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
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp14() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat12Instance targetInstance = new TrNetPat12Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column1;
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
boolean executeOperatorTrNetOp15() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	//patternTrNetPat13HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp16() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column1;
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
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp17() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat15Instance targetInstance = new TrNetPat15Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat15Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat15Array.add(targetInstance);
	//patternTrNetPat15HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp18() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat5Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat999Instance targetInstance = new TrNetPat999Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat999Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat999Array.add(targetInstance);
	//patternTrNetPat999HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp40() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat20Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
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
boolean executeOperatorTrNetOp41() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat20Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat11Instance targetInstance = new TrNetPat11Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat11Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat11Array.add(targetInstance);
	//patternTrNetPat11HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp42() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat20Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp43() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat20Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	//patternTrNetPat13HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp23() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat7Instance targetInstance = new TrNetPat7Instance();
			{
			targetInstance.database0 = sourcePatternInstance.database0;
			targetInstance.database0.types.add("Database");
			}
		if (trNetPat7Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat7Array.add(targetInstance);
	//patternTrNetPat7HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp24() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
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
boolean executeOperatorTrNetOp25() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat11Instance targetInstance = new TrNetPat11Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column1;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat11Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat11Array.add(targetInstance);
	//patternTrNetPat11HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp26() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
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
boolean executeOperatorTrNetOp27() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
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
boolean executeOperatorTrNetOp28() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat12Instance targetInstance = new TrNetPat12Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column1;
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
boolean executeOperatorTrNetOp29() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
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
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp30() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	//patternTrNetPat13HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp31() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat16Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat15Instance targetInstance = new TrNetPat15Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance.column1;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat15Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat15Array.add(targetInstance);
	//patternTrNetPat15HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp38() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat19Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat19Instance sourcePatternInstance = trNetPat19Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat999Instance targetInstance = new TrNetPat999Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat999Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat999Array.add(targetInstance);
	//patternTrNetPat999HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOperatorType() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat24Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat24Instance sourcePatternInstance = trNetPat24Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		PatternTypeInstance targetInstance = new PatternTypeInstance();
			{
			targetInstance.type = sourcePatternInstance.type0;
			targetInstance.type.types.add("Type");
			}
		if (patternTypeSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			patternTypeArray.add(targetInstance);
	//patternPatternTypeHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpExtends() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = patExtendsArray.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		PatExtendsInstance sourcePatternInstance1 = patExtendsArray.get(i);
		
		
			LinkedList<TrNetPat18Instance> sourcePatternInstances2 = cClass0InTrNetPat18Hash.get(sourcePatternInstance1.cClassSpecific);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat18Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		PatExtendsColumnInstance targetInstance = new PatExtendsColumnInstance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.AttrCalculation.foreignkeycol(sourcePatternInstance1.cClassParent.attributes.get("name")));
	node.types.add("Column");
				
				targetInstance.column = node;
				}
			{
			targetInstance.table = sourcePatternInstance2.table0;
			targetInstance.table.types.add("Table");
			}
		if (patExtendsColumnSet.add(targetInstance)) {
				totalElementPlacementCounter++;
			patExtendsColumnArray.add(targetInstance);
	//patternPatExtendsColumnHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpProjExtends() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = patExtendsColumnArray.size();
	for (int i = 0; i<sourcePatternSize; i++){
		PatExtendsColumnInstance sourcePatternInstance = patExtendsColumnArray.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat9Instance targetInstance = new TrNetPat9Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column;
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
boolean executeOperatorOpunionTrNetPat18_TrNetPat26_TrNetPat24_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat26Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat26Instance sourcePatternInstance1 = trNetPat26Array.get(i);
		
		
			LinkedList<UnionTrNetPat18_TrNetPat24_0Instance> sourcePatternInstances2 = datatype0InUnionTrNetPat18_TrNetPat24_0Hash.get(sourcePatternInstance1.datatype0);
			
			if (sourcePatternInstances2 != null) {
				for (UnionTrNetPat18_TrNetPat24_0Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance targetInstance = new UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance();
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.datatype0_0 = sourcePatternInstance2.datatype0;
			targetInstance.datatype0_0.types.add("Datatype");
			}
		if (unionTrNetPat18_TrNetPat26_TrNetPat24_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat18_TrNetPat26_TrNetPat24_0Array.add(targetInstance);
	{
		if (!cClass0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.containsKey(targetInstance.cClass0)) {
			cClass0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.put(targetInstance.cClass0, new LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>());
		}
		cClass0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!attribute0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.containsKey(targetInstance.attribute0)) {
			attribute0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.put(targetInstance.attribute0, new LinkedList<UnionTrNetPat18_TrNetPat26_TrNetPat24_0Instance>());
		}
		attribute0InUnionTrNetPat18_TrNetPat26_TrNetPat24_0Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	//patternUnionTrNetPat18_TrNetPat26_TrNetPat24_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat18_TrNetPat24_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat18Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat18Instance sourcePatternInstance1 = trNetPat18Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat24Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat24Instance sourcePatternInstance2 = trNetPat24Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat18_TrNetPat24_0Instance targetInstance = new UnionTrNetPat18_TrNetPat24_0Instance();
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance2.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
		if (unionTrNetPat18_TrNetPat24_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat18_TrNetPat24_0Array.add(targetInstance);
	{
		if (!datatype0InUnionTrNetPat18_TrNetPat24_0Hash.containsKey(targetInstance.datatype0)) {
			datatype0InUnionTrNetPat18_TrNetPat24_0Hash.put(targetInstance.datatype0, new LinkedList<UnionTrNetPat18_TrNetPat24_0Instance>());
		}
		datatype0InUnionTrNetPat18_TrNetPat24_0Hash.get(targetInstance.datatype0).add(targetInstance);
	}
	//patternUnionTrNetPat18_TrNetPat24_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = unionTrNetPat18_TrNetPat26_TrNetPat2_0Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance sourcePatternInstance1 = unionTrNetPat18_TrNetPat26_TrNetPat2_0Array.get(i);
		
		
			LinkedList<TrNetPat24Instance> sourcePatternInstances2 = datatype0InTrNetPat24Hash.get(sourcePatternInstance1.datatype0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat24Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance targetInstance = new UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance();
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance1.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.database0 = sourcePatternInstance1.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
		if (unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Array.add(targetInstance);
	{
		if (!cClass0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.containsKey(targetInstance.cClass0)) {
			cClass0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.put(targetInstance.cClass0, new LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>());
		}
		cClass0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!attribute0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.containsKey(targetInstance.attribute0)) {
			attribute0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.put(targetInstance.attribute0, new LinkedList<UnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Instance>());
		}
		attribute0InUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	//patternUnionTrNetPat18_TrNetPat24_TrNetPat26_TrNetPat2_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat18_TrNetPat26_TrNetPat2_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			int sourcePatternSize2 = unionTrNetPat18_TrNetPat26_0Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				UnionTrNetPat18_TrNetPat26_0Instance sourcePatternInstance2 = unionTrNetPat18_TrNetPat26_0Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance targetInstance = new UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance();
			{
			targetInstance.database0 = sourcePatternInstance1.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance2.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
		if (unionTrNetPat18_TrNetPat26_TrNetPat2_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat18_TrNetPat26_TrNetPat2_0Array.add(targetInstance);
	//patternUnionTrNetPat18_TrNetPat26_TrNetPat2_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat18_TrNetPat26_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat18Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat18Instance sourcePatternInstance1 = trNetPat18Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat26Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat26Instance sourcePatternInstance2 = trNetPat26Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat18_TrNetPat26_0Instance targetInstance = new UnionTrNetPat18_TrNetPat26_0Instance();
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance1.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance2.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
		if (unionTrNetPat18_TrNetPat26_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat18_TrNetPat26_0Array.add(targetInstance);
	//patternUnionTrNetPat18_TrNetPat26_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat27_TrNetPat24_TrNetPat18_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat24Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat24Instance sourcePatternInstance1 = trNetPat24Array.get(i);
		
		
			int sourcePatternSize2 = unionTrNetPat27_TrNetPat18_0Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				UnionTrNetPat27_TrNetPat18_0Instance sourcePatternInstance2 = unionTrNetPat27_TrNetPat18_0Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance targetInstance = new UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance();
			{
			targetInstance.type0 = sourcePatternInstance1.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance1.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass0_0 = sourcePatternInstance2.cClass0_0;
			targetInstance.cClass0_0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (unionTrNetPat27_TrNetPat24_TrNetPat18_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat27_TrNetPat24_TrNetPat18_0Array.add(targetInstance);
	{
		if (!attribute0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.containsKey(targetInstance.attribute0)) {
			attribute0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.put(targetInstance.attribute0, new LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>());
		}
		attribute0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	{
		if (!cClass0_0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.containsKey(targetInstance.cClass0_0)) {
			cClass0_0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.put(targetInstance.cClass0_0, new LinkedList<UnionTrNetPat27_TrNetPat24_TrNetPat18_0Instance>());
		}
		cClass0_0InUnionTrNetPat27_TrNetPat24_TrNetPat18_0Hash.get(targetInstance.cClass0_0).add(targetInstance);
	}
	//patternUnionTrNetPat27_TrNetPat24_TrNetPat18_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat27_TrNetPat18_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat27Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat27Instance sourcePatternInstance1 = trNetPat27Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat18Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat18Instance sourcePatternInstance2 = trNetPat18Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat27_TrNetPat18_0Instance targetInstance = new UnionTrNetPat27_TrNetPat18_0Instance();
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass0_0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0_0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (unionTrNetPat27_TrNetPat18_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat27_TrNetPat18_0Array.add(targetInstance);
	//patternUnionTrNetPat27_TrNetPat18_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			int sourcePatternSize2 = unionTrNetPat27_TrNetPat18_TrNetPat24_0Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance sourcePatternInstance2 = unionTrNetPat27_TrNetPat18_TrNetPat24_0Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance targetInstance = new UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance();
			{
			targetInstance.database0 = sourcePatternInstance1.database0;
			targetInstance.database0.types.add("Database");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass0_0 = sourcePatternInstance2.cClass0_0;
			targetInstance.cClass0_0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
			{
			targetInstance.type0 = sourcePatternInstance2.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance2.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
		if (unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Array.add(targetInstance);
	{
		if (!attribute0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.containsKey(targetInstance.attribute0)) {
			attribute0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.put(targetInstance.attribute0, new LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>());
		}
		attribute0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	{
		if (!cClass0_0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.containsKey(targetInstance.cClass0_0)) {
			cClass0_0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.put(targetInstance.cClass0_0, new LinkedList<UnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Instance>());
		}
		cClass0_0InUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0Hash.get(targetInstance.cClass0_0).add(targetInstance);
	}
	//patternUnionTrNetPat27_TrNetPat18_TrNetPat24_TrNetPat2_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat27_TrNetPat18_TrNetPat24_0() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat24Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat24Instance sourcePatternInstance1 = trNetPat24Array.get(i);
		
		
			int sourcePatternSize2 = unionTrNetPat27_TrNetPat18_1Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				UnionTrNetPat27_TrNetPat18_1Instance sourcePatternInstance2 = unionTrNetPat27_TrNetPat18_1Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance targetInstance = new UnionTrNetPat27_TrNetPat18_TrNetPat24_0Instance();
			{
			targetInstance.type0 = sourcePatternInstance1.type0;
			targetInstance.type0.types.add("Type");
			}
			{
			targetInstance.datatype0 = sourcePatternInstance1.datatype0;
			targetInstance.datatype0.types.add("Datatype");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass0_0 = sourcePatternInstance2.cClass0_0;
			targetInstance.cClass0_0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (unionTrNetPat27_TrNetPat18_TrNetPat24_0Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat27_TrNetPat18_TrNetPat24_0Array.add(targetInstance);
	//patternUnionTrNetPat27_TrNetPat18_TrNetPat24_0HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorOpunionTrNetPat27_TrNetPat18_1() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat27Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat27Instance sourcePatternInstance1 = trNetPat27Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat18Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat18Instance sourcePatternInstance2 = trNetPat18Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		UnionTrNetPat27_TrNetPat18_1Instance targetInstance = new UnionTrNetPat27_TrNetPat18_1Instance();
			{
			targetInstance.attribute0 = sourcePatternInstance1.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance1.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.cClass0_0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0_0.types.add("CClass");
			}
			{
			targetInstance.table0 = sourcePatternInstance2.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.column0 = sourcePatternInstance2.column0;
			targetInstance.column0.types.add("Column");
			}
		if (unionTrNetPat27_TrNetPat18_1Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			unionTrNetPat27_TrNetPat18_1Array.add(targetInstance);
	//patternUnionTrNetPat27_TrNetPat18_1HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
			}
	}
	
	
	
	return operatorHasExecuted;
}
	
	boolean executeOperatorTrNetOp1() {
		return true;
	}
	
	public void registerTrNetOp1Publisher(ModelPatternPublisher publisher) {
		publisher.registerListener(inputTrNetOp1);
	}
	
	public void registerTrNetOp3Listener(ModelPatternListener listener) {
		outputTrNetOp3.registerListener(listener);
	}
}






