package activitymigration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;

import generic.*;

public class ActivityMigrationTransformation
implements 			TrNetPat29InstanceListener
			,TrNetPat71InstanceListener
			,TrNetPat1InstanceListener
			,TrNetPat47InstanceListener
			,TrNetPat70InstanceListener
			,TrNetPat48InstanceListener
			,TrNetPat68InstanceListener
			,TrNetPat53InstanceListener
			,TrNetPat65InstanceListener
			,TrNetPat56InstanceListener
			,TrNetPat17InstanceListener
			,TrNetPat28InstanceListener
			,TrNetPat52InstanceListener
			,TrNetPat27InstanceListener
			,TrNetPat69InstanceListener
			,TrNetPat7InstancePublisher
			,TrNetPat37InstancePublisher
			,TrNetPat5InstancePublisher
			,TrNetPat15InstancePublisher
			,TrNetPat36InstancePublisher
			,TrNetPat62InstancePublisher
			,TrNetPat26InstancePublisher
			,TrNetPat43InstancePublisher
			,TrNetPat20InstancePublisher
			,TrNetPat3InstancePublisher
			,TrNetPat55InstancePublisher
			,TrNetPat60InstancePublisher
			,TrNetPat46InstancePublisher
			,TrNetPat10InstancePublisher
			,TrNetPat32InstancePublisher
			,TrNetPat40InstancePublisher
			,TrNetPat64InstancePublisher
			,TrNetPat58InstancePublisher
			,TrNetPat67InstancePublisher
			,TrNetPat12InstancePublisher
			,TrNetPat50InstancePublisher
			,TrNetPat23InstancePublisher
			,TrNetPat4InstancePublisher
{
	public long totalElementPlacementCounter = 0;
	public long totalCombinationsCounter = 0;
	public int totalNumberOfOperatorsInTheNetwork = 55;
	public int totalNumberOfPatternsInTheNetwork = 71;
	OriginalInputExternalInput inputOriginalInput;
	EvolvedOutputExternalOutput outputEvolvedOutput;
	ArrayList<TrNetPat1Instance> trNetPat1Array;
	HashSet<TrNetPat1Instance> trNetPat1Set; 
	ArrayList<TrNetPat2Instance> trNetPat2Array;
	HashSet<TrNetPat2Instance> trNetPat2Set; 
	ArrayList<TrNetPat5Instance> trNetPat5Array;
	HashSet<TrNetPat5Instance> trNetPat5Set; 
	ArrayList<TrNetPat4Instance> trNetPat4Array;
	HashSet<TrNetPat4Instance> trNetPat4Set; 
	ArrayList<TrNetPat3Instance> trNetPat3Array;
	HashSet<TrNetPat3Instance> trNetPat3Set; 
	ArrayList<TrNetPat17Instance> trNetPat17Array;
	HashSet<TrNetPat17Instance> trNetPat17Set; 
	ArrayList<TrNetPat18Instance> trNetPat18Array;
	HashSet<TrNetPat18Instance> trNetPat18Set; 
		HashMap<ModelNode, LinkedList<TrNetPat18Instance>> partition0InTrNetPat18Hash;
	ArrayList<TrNetPat27Instance> trNetPat27Array;
	HashSet<TrNetPat27Instance> trNetPat27Set; 
	ArrayList<TrNetPat19Instance> trNetPat19Array;
	HashSet<TrNetPat19Instance> trNetPat19Set; 
		HashMap<ModelNode, LinkedList<TrNetPat19Instance>> activityGraph0InTrNetPat19Hash;
	ArrayList<TrNetPat6Instance> trNetPat6Array;
	HashSet<TrNetPat6Instance> trNetPat6Set; 
	ArrayList<TrNetPat7Instance> trNetPat7Array;
	HashSet<TrNetPat7Instance> trNetPat7Set; 
	ArrayList<TrNetPat20Instance> trNetPat20Array;
	HashSet<TrNetPat20Instance> trNetPat20Set; 
	ArrayList<TrNetPat44Instance> trNetPat44Array;
	HashSet<TrNetPat44Instance> trNetPat44Set; 
	ArrayList<TrNetPat45Instance> trNetPat45Array;
	HashSet<TrNetPat45Instance> trNetPat45Set; 
		HashMap<ModelNode, LinkedList<TrNetPat45Instance>> transition0InTrNetPat45Hash;
	ArrayList<TrNetPat46Instance> trNetPat46Array;
	HashSet<TrNetPat46Instance> trNetPat46Set; 
	ArrayList<TrNetPat28Instance> trNetPat28Array;
	HashSet<TrNetPat28Instance> trNetPat28Set; 
		HashMap<ModelNode, LinkedList<TrNetPat28Instance>> activityGraph0InTrNetPat28Hash;
	ArrayList<TrNetPat8Instance> trNetPat8Array;
	HashSet<TrNetPat8Instance> trNetPat8Set; 
	ArrayList<TrNetPat9Instance> trNetPat9Array;
	HashSet<TrNetPat9Instance> trNetPat9Set; 
	ArrayList<TrNetPat10Instance> trNetPat10Array;
	HashSet<TrNetPat10Instance> trNetPat10Set; 
	ArrayList<TrNetPat29Instance> trNetPat29Array;
	HashSet<TrNetPat29Instance> trNetPat29Set; 
		HashMap<ModelNode, LinkedList<TrNetPat29Instance>> transition0InTrNetPat29Hash;
	ArrayList<TrNetPat47Instance> trNetPat47Array;
	HashSet<TrNetPat47Instance> trNetPat47Set; 
		HashMap<ModelNode, LinkedList<TrNetPat47Instance>> transition0InTrNetPat47Hash;
	ArrayList<TrNetPat30Instance> trNetPat30Array;
	HashSet<TrNetPat30Instance> trNetPat30Set; 
	ArrayList<TrNetPat31Instance> trNetPat31Array;
	HashSet<TrNetPat31Instance> trNetPat31Set; 
		HashMap<ModelNode, LinkedList<TrNetPat31Instance>> transition0InTrNetPat31Hash;
	ArrayList<TrNetPat32Instance> trNetPat32Array;
	HashSet<TrNetPat32Instance> trNetPat32Set; 
	ArrayList<TrNetPat11Instance> trNetPat11Array;
	HashSet<TrNetPat11Instance> trNetPat11Set; 
	ArrayList<TrNetPat12Instance> trNetPat12Array;
	HashSet<TrNetPat12Instance> trNetPat12Set; 
	ArrayList<TrNetPat48Instance> trNetPat48Array;
	HashSet<TrNetPat48Instance> trNetPat48Set; 
	ArrayList<TrNetPat49Instance> trNetPat49Array;
	HashSet<TrNetPat49Instance> trNetPat49Set; 
	ArrayList<TrNetPat50Instance> trNetPat50Array;
	HashSet<TrNetPat50Instance> trNetPat50Set; 
	ArrayList<TrNetPat52Instance> trNetPat52Array;
	HashSet<TrNetPat52Instance> trNetPat52Set; 
		HashMap<ModelNode, LinkedList<TrNetPat52Instance>> compositeState0InTrNetPat52Hash;
	ArrayList<TrNetPat16Instance> trNetPat16Array;
	HashSet<TrNetPat16Instance> trNetPat16Set; 
		HashMap<ModelNode, LinkedList<TrNetPat16Instance>> activityGraph0InTrNetPat16Hash;
	ArrayList<TrNetPat13Instance> trNetPat13Array;
	HashSet<TrNetPat13Instance> trNetPat13Set; 
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> stateVertex0InTrNetPat13Hash;
	ArrayList<TrNetPat14Instance> trNetPat14Array;
	HashSet<TrNetPat14Instance> trNetPat14Set; 
	ArrayList<TrNetPat15Instance> trNetPat15Array;
	HashSet<TrNetPat15Instance> trNetPat15Set; 
	ArrayList<TrNetPat53Instance> trNetPat53Array;
	HashSet<TrNetPat53Instance> trNetPat53Set; 
	ArrayList<TrNetPat54Instance> trNetPat54Array;
	HashSet<TrNetPat54Instance> trNetPat54Set; 
	ArrayList<TrNetPat55Instance> trNetPat55Array;
	HashSet<TrNetPat55Instance> trNetPat55Set; 
	ArrayList<TrNetPat56Instance> trNetPat56Array;
	HashSet<TrNetPat56Instance> trNetPat56Set; 
	ArrayList<TrNetPat57Instance> trNetPat57Array;
	HashSet<TrNetPat57Instance> trNetPat57Set; 
	ArrayList<TrNetPat58Instance> trNetPat58Array;
	HashSet<TrNetPat58Instance> trNetPat58Set; 
	ArrayList<TrNetPat51Instance> trNetPat51Array;
	HashSet<TrNetPat51Instance> trNetPat51Set; 
	ArrayList<TrNetPat59Instance> trNetPat59Array;
	HashSet<TrNetPat59Instance> trNetPat59Set; 
	ArrayList<TrNetPat60Instance> trNetPat60Array;
	HashSet<TrNetPat60Instance> trNetPat60Set; 
	ArrayList<TrNetPat61Instance> trNetPat61Array;
	HashSet<TrNetPat61Instance> trNetPat61Set; 
	ArrayList<TrNetPat62Instance> trNetPat62Array;
	HashSet<TrNetPat62Instance> trNetPat62Set; 
	ArrayList<TrNetPat63Instance> trNetPat63Array;
	HashSet<TrNetPat63Instance> trNetPat63Set; 
	ArrayList<TrNetPat64Instance> trNetPat64Array;
	HashSet<TrNetPat64Instance> trNetPat64Set; 
	ArrayList<TrNetPat65Instance> trNetPat65Array;
	HashSet<TrNetPat65Instance> trNetPat65Set; 
	ArrayList<TrNetPat66Instance> trNetPat66Array;
	HashSet<TrNetPat66Instance> trNetPat66Set; 
	ArrayList<TrNetPat67Instance> trNetPat67Array;
	HashSet<TrNetPat67Instance> trNetPat67Set; 
	ArrayList<TrNetPat68Instance> trNetPat68Array;
	HashSet<TrNetPat68Instance> trNetPat68Set; 
	ArrayList<TrNetPat33Instance> trNetPat33Array;
	HashSet<TrNetPat33Instance> trNetPat33Set; 
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> transition0InTrNetPat33Hash;
	ArrayList<TrNetPat34Instance> trNetPat34Array;
	HashSet<TrNetPat34Instance> trNetPat34Set; 
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> guard0InTrNetPat34Hash;
	ArrayList<TrNetPat36Instance> trNetPat36Array;
	HashSet<TrNetPat36Instance> trNetPat36Set; 
	ArrayList<TrNetPat37Instance> trNetPat37Array;
	HashSet<TrNetPat37Instance> trNetPat37Set; 
	ArrayList<TrNetPat69Instance> trNetPat69Array;
	HashSet<TrNetPat69Instance> trNetPat69Set; 
	ArrayList<TrNetPat35Instance> trNetPat35Array;
	HashSet<TrNetPat35Instance> trNetPat35Set; 
	ArrayList<TrNetPat38Instance> trNetPat38Array;
	HashSet<TrNetPat38Instance> trNetPat38Set; 
		HashMap<ModelNode, LinkedList<TrNetPat38Instance>> stateVertex0InTrNetPat38Hash;
	ArrayList<TrNetPat39Instance> trNetPat39Array;
	HashSet<TrNetPat39Instance> trNetPat39Set; 
	ArrayList<TrNetPat40Instance> trNetPat40Array;
	HashSet<TrNetPat40Instance> trNetPat40Set; 
	ArrayList<TrNetPat41Instance> trNetPat41Array;
	HashSet<TrNetPat41Instance> trNetPat41Set; 
		HashMap<ModelNode, LinkedList<TrNetPat41Instance>> stateVertex0InTrNetPat41Hash;
	ArrayList<TrNetPat42Instance> trNetPat42Array;
	HashSet<TrNetPat42Instance> trNetPat42Set; 
	ArrayList<TrNetPat43Instance> trNetPat43Array;
	HashSet<TrNetPat43Instance> trNetPat43Set; 
	ArrayList<TrNetPat70Instance> trNetPat70Array;
	HashSet<TrNetPat70Instance> trNetPat70Set; 
	ArrayList<TrNetPat21Instance> trNetPat21Array;
	HashSet<TrNetPat21Instance> trNetPat21Set; 
	ArrayList<TrNetPat22Instance> trNetPat22Array;
	HashSet<TrNetPat22Instance> trNetPat22Set; 
	ArrayList<TrNetPat23Instance> trNetPat23Array;
	HashSet<TrNetPat23Instance> trNetPat23Set; 
	ArrayList<TrNetPat71Instance> trNetPat71Array;
	HashSet<TrNetPat71Instance> trNetPat71Set; 
		HashMap<ModelNode, LinkedList<TrNetPat71Instance>> partition0InTrNetPat71Hash;
	ArrayList<TrNetPat24Instance> trNetPat24Array;
	HashSet<TrNetPat24Instance> trNetPat24Set; 
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> stateVertex0InTrNetPat24Hash;
	ArrayList<TrNetPat25Instance> trNetPat25Array;
	HashSet<TrNetPat25Instance> trNetPat25Set; 
	ArrayList<TrNetPat26Instance> trNetPat26Array;
	HashSet<TrNetPat26Instance> trNetPat26Set; 
	
	public ActivityMigrationTransformation(){
		
	trNetPat1Array = new ArrayList<TrNetPat1Instance>(1); 
	trNetPat1Set = new HashSet<TrNetPat1Instance>(1); 
	trNetPat2Array = new ArrayList<TrNetPat2Instance>(1); 
	trNetPat2Set = new HashSet<TrNetPat2Instance>(1); 
	trNetPat5Array = new ArrayList<TrNetPat5Instance>(1); 
	trNetPat5Set = new HashSet<TrNetPat5Instance>(1); 
	trNetPat4Array = new ArrayList<TrNetPat4Instance>(1); 
	trNetPat4Set = new HashSet<TrNetPat4Instance>(1); 
	trNetPat3Array = new ArrayList<TrNetPat3Instance>(1); 
	trNetPat3Set = new HashSet<TrNetPat3Instance>(1); 
	trNetPat17Array = new ArrayList<TrNetPat17Instance>(2); 
	trNetPat17Set = new HashSet<TrNetPat17Instance>(2); 
	trNetPat18Array = new ArrayList<TrNetPat18Instance>(2); 
	trNetPat18Set = new HashSet<TrNetPat18Instance>(2); 
		partition0InTrNetPat18Hash = new HashMap<ModelNode, LinkedList<TrNetPat18Instance>>(2);
	trNetPat27Array = new ArrayList<TrNetPat27Instance>(2); 
	trNetPat27Set = new HashSet<TrNetPat27Instance>(2); 
	trNetPat19Array = new ArrayList<TrNetPat19Instance>(4); 
	trNetPat19Set = new HashSet<TrNetPat19Instance>(4); 
		activityGraph0InTrNetPat19Hash = new HashMap<ModelNode, LinkedList<TrNetPat19Instance>>(4);
	trNetPat6Array = new ArrayList<TrNetPat6Instance>(4); 
	trNetPat6Set = new HashSet<TrNetPat6Instance>(4); 
	trNetPat7Array = new ArrayList<TrNetPat7Instance>(2); 
	trNetPat7Set = new HashSet<TrNetPat7Instance>(2); 
	trNetPat20Array = new ArrayList<TrNetPat20Instance>(2); 
	trNetPat20Set = new HashSet<TrNetPat20Instance>(2); 
	trNetPat44Array = new ArrayList<TrNetPat44Instance>(10); 
	trNetPat44Set = new HashSet<TrNetPat44Instance>(10); 
	trNetPat45Array = new ArrayList<TrNetPat45Instance>(10); 
	trNetPat45Set = new HashSet<TrNetPat45Instance>(10); 
		transition0InTrNetPat45Hash = new HashMap<ModelNode, LinkedList<TrNetPat45Instance>>(10);
	trNetPat46Array = new ArrayList<TrNetPat46Instance>(10); 
	trNetPat46Set = new HashSet<TrNetPat46Instance>(10); 
	trNetPat28Array = new ArrayList<TrNetPat28Instance>(10); 
	trNetPat28Set = new HashSet<TrNetPat28Instance>(10); 
		activityGraph0InTrNetPat28Hash = new HashMap<ModelNode, LinkedList<TrNetPat28Instance>>(10);
	trNetPat8Array = new ArrayList<TrNetPat8Instance>(10); 
	trNetPat8Set = new HashSet<TrNetPat8Instance>(10); 
	trNetPat9Array = new ArrayList<TrNetPat9Instance>(10); 
	trNetPat9Set = new HashSet<TrNetPat9Instance>(10); 
	trNetPat10Array = new ArrayList<TrNetPat10Instance>(10); 
	trNetPat10Set = new HashSet<TrNetPat10Instance>(10); 
	trNetPat29Array = new ArrayList<TrNetPat29Instance>(10); 
	trNetPat29Set = new HashSet<TrNetPat29Instance>(10); 
		transition0InTrNetPat29Hash = new HashMap<ModelNode, LinkedList<TrNetPat29Instance>>(10);
	trNetPat47Array = new ArrayList<TrNetPat47Instance>(10); 
	trNetPat47Set = new HashSet<TrNetPat47Instance>(10); 
		transition0InTrNetPat47Hash = new HashMap<ModelNode, LinkedList<TrNetPat47Instance>>(10);
	trNetPat30Array = new ArrayList<TrNetPat30Instance>(10); 
	trNetPat30Set = new HashSet<TrNetPat30Instance>(10); 
	trNetPat31Array = new ArrayList<TrNetPat31Instance>(10); 
	trNetPat31Set = new HashSet<TrNetPat31Instance>(10); 
		transition0InTrNetPat31Hash = new HashMap<ModelNode, LinkedList<TrNetPat31Instance>>(10);
	trNetPat32Array = new ArrayList<TrNetPat32Instance>(10); 
	trNetPat32Set = new HashSet<TrNetPat32Instance>(10); 
	trNetPat11Array = new ArrayList<TrNetPat11Instance>(10); 
	trNetPat11Set = new HashSet<TrNetPat11Instance>(10); 
	trNetPat12Array = new ArrayList<TrNetPat12Instance>(10); 
	trNetPat12Set = new HashSet<TrNetPat12Instance>(10); 
	trNetPat48Array = new ArrayList<TrNetPat48Instance>(2); 
	trNetPat48Set = new HashSet<TrNetPat48Instance>(2); 
	trNetPat49Array = new ArrayList<TrNetPat49Instance>(2); 
	trNetPat49Set = new HashSet<TrNetPat49Instance>(2); 
	trNetPat50Array = new ArrayList<TrNetPat50Instance>(2); 
	trNetPat50Set = new HashSet<TrNetPat50Instance>(2); 
	trNetPat52Array = new ArrayList<TrNetPat52Instance>(9); 
	trNetPat52Set = new HashSet<TrNetPat52Instance>(9); 
		compositeState0InTrNetPat52Hash = new HashMap<ModelNode, LinkedList<TrNetPat52Instance>>(9);
	trNetPat16Array = new ArrayList<TrNetPat16Instance>(9); 
	trNetPat16Set = new HashSet<TrNetPat16Instance>(9); 
		activityGraph0InTrNetPat16Hash = new HashMap<ModelNode, LinkedList<TrNetPat16Instance>>(9);
	trNetPat13Array = new ArrayList<TrNetPat13Instance>(9); 
	trNetPat13Set = new HashSet<TrNetPat13Instance>(9); 
		stateVertex0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(9);
	trNetPat14Array = new ArrayList<TrNetPat14Instance>(3); 
	trNetPat14Set = new HashSet<TrNetPat14Instance>(3); 
	trNetPat15Array = new ArrayList<TrNetPat15Instance>(3); 
	trNetPat15Set = new HashSet<TrNetPat15Instance>(3); 
	trNetPat53Array = new ArrayList<TrNetPat53Instance>(1); 
	trNetPat53Set = new HashSet<TrNetPat53Instance>(1); 
	trNetPat54Array = new ArrayList<TrNetPat54Instance>(1); 
	trNetPat54Set = new HashSet<TrNetPat54Instance>(1); 
	trNetPat55Array = new ArrayList<TrNetPat55Instance>(1); 
	trNetPat55Set = new HashSet<TrNetPat55Instance>(1); 
	trNetPat56Array = new ArrayList<TrNetPat56Instance>(5); 
	trNetPat56Set = new HashSet<TrNetPat56Instance>(5); 
	trNetPat57Array = new ArrayList<TrNetPat57Instance>(3); 
	trNetPat57Set = new HashSet<TrNetPat57Instance>(3); 
	trNetPat58Array = new ArrayList<TrNetPat58Instance>(3); 
	trNetPat58Set = new HashSet<TrNetPat58Instance>(3); 
	trNetPat51Array = new ArrayList<TrNetPat51Instance>(3); 
	trNetPat51Set = new HashSet<TrNetPat51Instance>(3); 
	trNetPat59Array = new ArrayList<TrNetPat59Instance>(3); 
	trNetPat59Set = new HashSet<TrNetPat59Instance>(3); 
	trNetPat60Array = new ArrayList<TrNetPat60Instance>(3); 
	trNetPat60Set = new HashSet<TrNetPat60Instance>(3); 
	trNetPat61Array = new ArrayList<TrNetPat61Instance>(3); 
	trNetPat61Set = new HashSet<TrNetPat61Instance>(3); 
	trNetPat62Array = new ArrayList<TrNetPat62Instance>(3); 
	trNetPat62Set = new HashSet<TrNetPat62Instance>(3); 
	trNetPat63Array = new ArrayList<TrNetPat63Instance>(3); 
	trNetPat63Set = new HashSet<TrNetPat63Instance>(3); 
	trNetPat64Array = new ArrayList<TrNetPat64Instance>(3); 
	trNetPat64Set = new HashSet<TrNetPat64Instance>(3); 
	trNetPat65Array = new ArrayList<TrNetPat65Instance>(1); 
	trNetPat65Set = new HashSet<TrNetPat65Instance>(1); 
	trNetPat66Array = new ArrayList<TrNetPat66Instance>(1); 
	trNetPat66Set = new HashSet<TrNetPat66Instance>(1); 
	trNetPat67Array = new ArrayList<TrNetPat67Instance>(1); 
	trNetPat67Set = new HashSet<TrNetPat67Instance>(1); 
	trNetPat68Array = new ArrayList<TrNetPat68Instance>(3); 
	trNetPat68Set = new HashSet<TrNetPat68Instance>(3); 
	trNetPat33Array = new ArrayList<TrNetPat33Instance>(10); 
	trNetPat33Set = new HashSet<TrNetPat33Instance>(10); 
		transition0InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(10);
	trNetPat34Array = new ArrayList<TrNetPat34Instance>(3); 
	trNetPat34Set = new HashSet<TrNetPat34Instance>(3); 
		guard0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(3);
	trNetPat36Array = new ArrayList<TrNetPat36Instance>(3); 
	trNetPat36Set = new HashSet<TrNetPat36Instance>(3); 
	trNetPat37Array = new ArrayList<TrNetPat37Instance>(3); 
	trNetPat37Set = new HashSet<TrNetPat37Instance>(3); 
	trNetPat69Array = new ArrayList<TrNetPat69Instance>(3); 
	trNetPat69Set = new HashSet<TrNetPat69Instance>(3); 
	trNetPat35Array = new ArrayList<TrNetPat35Instance>(3); 
	trNetPat35Set = new HashSet<TrNetPat35Instance>(3); 
	trNetPat38Array = new ArrayList<TrNetPat38Instance>(10); 
	trNetPat38Set = new HashSet<TrNetPat38Instance>(10); 
		stateVertex0InTrNetPat38Hash = new HashMap<ModelNode, LinkedList<TrNetPat38Instance>>(10);
	trNetPat39Array = new ArrayList<TrNetPat39Instance>(5); 
	trNetPat39Set = new HashSet<TrNetPat39Instance>(5); 
	trNetPat40Array = new ArrayList<TrNetPat40Instance>(5); 
	trNetPat40Set = new HashSet<TrNetPat40Instance>(5); 
	trNetPat41Array = new ArrayList<TrNetPat41Instance>(10); 
	trNetPat41Set = new HashSet<TrNetPat41Instance>(10); 
		stateVertex0InTrNetPat41Hash = new HashMap<ModelNode, LinkedList<TrNetPat41Instance>>(10);
	trNetPat42Array = new ArrayList<TrNetPat42Instance>(6); 
	trNetPat42Set = new HashSet<TrNetPat42Instance>(6); 
	trNetPat43Array = new ArrayList<TrNetPat43Instance>(6); 
	trNetPat43Set = new HashSet<TrNetPat43Instance>(6); 
	trNetPat70Array = new ArrayList<TrNetPat70Instance>(1); 
	trNetPat70Set = new HashSet<TrNetPat70Instance>(1); 
	trNetPat21Array = new ArrayList<TrNetPat21Instance>(1); 
	trNetPat21Set = new HashSet<TrNetPat21Instance>(1); 
	trNetPat22Array = new ArrayList<TrNetPat22Instance>(1); 
	trNetPat22Set = new HashSet<TrNetPat22Instance>(1); 
	trNetPat23Array = new ArrayList<TrNetPat23Instance>(1); 
	trNetPat23Set = new HashSet<TrNetPat23Instance>(1); 
	trNetPat71Array = new ArrayList<TrNetPat71Instance>(8); 
	trNetPat71Set = new HashSet<TrNetPat71Instance>(8); 
		partition0InTrNetPat71Hash = new HashMap<ModelNode, LinkedList<TrNetPat71Instance>>(8);
	trNetPat24Array = new ArrayList<TrNetPat24Instance>(8); 
	trNetPat24Set = new HashSet<TrNetPat24Instance>(8); 
		stateVertex0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(8);
	trNetPat25Array = new ArrayList<TrNetPat25Instance>(3); 
	trNetPat25Set = new HashSet<TrNetPat25Instance>(3); 
	trNetPat26Array = new ArrayList<TrNetPat26Instance>(3); 
	trNetPat26Set = new HashSet<TrNetPat26Instance>(3); 
		
	listenersTrNetPat7Instance = new LinkedList<TrNetPat7InstanceListener>();
	listenersTrNetPat37Instance = new LinkedList<TrNetPat37InstanceListener>();
	listenersTrNetPat5Instance = new LinkedList<TrNetPat5InstanceListener>();
	listenersTrNetPat15Instance = new LinkedList<TrNetPat15InstanceListener>();
	listenersTrNetPat36Instance = new LinkedList<TrNetPat36InstanceListener>();
	listenersTrNetPat62Instance = new LinkedList<TrNetPat62InstanceListener>();
	listenersTrNetPat26Instance = new LinkedList<TrNetPat26InstanceListener>();
	listenersTrNetPat43Instance = new LinkedList<TrNetPat43InstanceListener>();
	listenersTrNetPat20Instance = new LinkedList<TrNetPat20InstanceListener>();
	listenersTrNetPat3Instance = new LinkedList<TrNetPat3InstanceListener>();
	listenersTrNetPat55Instance = new LinkedList<TrNetPat55InstanceListener>();
	listenersTrNetPat60Instance = new LinkedList<TrNetPat60InstanceListener>();
	listenersTrNetPat46Instance = new LinkedList<TrNetPat46InstanceListener>();
	listenersTrNetPat10Instance = new LinkedList<TrNetPat10InstanceListener>();
	listenersTrNetPat32Instance = new LinkedList<TrNetPat32InstanceListener>();
	listenersTrNetPat40Instance = new LinkedList<TrNetPat40InstanceListener>();
	listenersTrNetPat64Instance = new LinkedList<TrNetPat64InstanceListener>();
	listenersTrNetPat58Instance = new LinkedList<TrNetPat58InstanceListener>();
	listenersTrNetPat67Instance = new LinkedList<TrNetPat67InstanceListener>();
	listenersTrNetPat12Instance = new LinkedList<TrNetPat12InstanceListener>();
	listenersTrNetPat50Instance = new LinkedList<TrNetPat50InstanceListener>();
	listenersTrNetPat23Instance = new LinkedList<TrNetPat23InstanceListener>();
	listenersTrNetPat4Instance = new LinkedList<TrNetPat4InstanceListener>();
		
		
	inputOriginalInput = new OriginalInputExternalInput();
		inputOriginalInput.registerListener( (TrNetPat1InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat17InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat27InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat28InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat29InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat47InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat48InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat52InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat53InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat56InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat65InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat68InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat69InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat70InstanceListener) this);
		inputOriginalInput.registerListener( (TrNetPat71InstanceListener) this);
		
	outputEvolvedOutput = new EvolvedOutputExternalOutput();
		this.registerListener((TrNetPat3InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat5InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat4InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat7InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat20InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat46InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat10InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat32InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat12InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat50InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat15InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat55InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat58InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat60InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat62InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat64InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat67InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat36InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat37InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat40InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat43InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat23InstanceListener) outputEvolvedOutput);
		this.registerListener((TrNetPat26InstanceListener) outputEvolvedOutput);
	}
	
	
	// aqui fica a execucao de todo o plano de execucao da transformacao, idealmente, incluindo os ciclos.
	public void run() {
		
	executeOperatorOriginalInput();
	executeOperatorTrNetOp50();
	executeOperatorTrNetOp41();
	executeOperatorTrNetOp51();
	executeOperatorTrNetOp15();
	executeOperatorTrNetOp16();
	executeOperatorTrNetOp22();
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp7();
	executeOperatorTrNetOp43();
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp44();
	executeOperatorTrNetOp45();
	executeOperatorTrNetOp17();
	executeOperatorTrNetOp19();
	executeOperatorTrNetOp52();
	executeOperatorTrNetOp5();
	executeOperatorTrNetOp6();
	executeOperatorTrNetOp42();
	executeOperatorTrNetOp53();
	executeOperatorTrNetOp18();
	executeOperatorTrNetOp26();
	executeOperatorTrNetOp27();
	executeOperatorTrNetOp10();
	executeOperatorTrNetOp11();
	executeOperatorTrNetOp2();
	executeOperatorTrNetOp4();
	executeOperatorTrNetOp3();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp39();
	executeOperatorTrNetOp40();
	executeOperatorTrNetOp28();
	executeOperatorTrNetOp29();
	executeOperatorTrNetOp30();
	executeOperatorTrNetOp32();
	executeOperatorTrNetOp31();
	executeOperatorTrNetOp20();
	executeOperatorTrNetOp21();
	executeOperatorTrNetOp35();
	executeOperatorTrNetOp12();
	executeOperatorTrNetOp8();
	executeOperatorTrNetOp9();
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp47();
	executeOperatorTrNetOp48();
	executeOperatorTrNetOp54();
	executeOperatorTrNetOp55();
	executeOperatorTrNetOp49();
	executeOperatorTrNetOp33();
	executeOperatorTrNetOp13();
	executeOperatorTrNetOp14();
	executeOperatorTrNetOp23();
	executeOperatorTrNetOp24();
	executeOperatorTrNetOp34();
	executeOperatorTrNetOp36();
	executeOperatorTrNetOp37();
	executeOperatorEvolvedOutput();
		
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
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat5Set.size();
				
				
				result.put("TrNetPat5", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat4Set.size();
				
				
				result.put("TrNetPat4", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat3Set.size();
				
				
				result.put("TrNetPat3", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat17Set.size();
				
				
				result.put("TrNetPat17", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat18Set.size();
				
				
				result.put("TrNetPat18", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat27Set.size();
				
				
				result.put("TrNetPat27", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4.0;
				patternStats.realSize = trNetPat19Set.size();
				
				
				result.put("TrNetPat19", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 4.0;
				patternStats.realSize = trNetPat6Set.size();
				
				
				result.put("TrNetPat6", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat7Set.size();
				
				
				result.put("TrNetPat7", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat20Set.size();
				
				
				result.put("TrNetPat20", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat44Set.size();
				
				
				result.put("TrNetPat44", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat45Set.size();
				
				
				result.put("TrNetPat45", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat46Set.size();
				
				
				result.put("TrNetPat46", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat28Set.size();
				
				
				result.put("TrNetPat28", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat8Set.size();
				
				
				result.put("TrNetPat8", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat9Set.size();
				
				
				result.put("TrNetPat9", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat10Set.size();
				
				
				result.put("TrNetPat10", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat29Set.size();
				
				
				result.put("TrNetPat29", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat47Set.size();
				
				
				result.put("TrNetPat47", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat30Set.size();
				
				
				result.put("TrNetPat30", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat31Set.size();
				
				
				result.put("TrNetPat31", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat32Set.size();
				
				
				result.put("TrNetPat32", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat11Set.size();
				
				
				result.put("TrNetPat11", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat12Set.size();
				
				
				result.put("TrNetPat12", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat48Set.size();
				
				
				result.put("TrNetPat48", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat49Set.size();
				
				
				result.put("TrNetPat49", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.0;
				patternStats.realSize = trNetPat50Set.size();
				
				
				result.put("TrNetPat50", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9.0;
				patternStats.realSize = trNetPat52Set.size();
				
				
				result.put("TrNetPat52", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9.0;
				patternStats.realSize = trNetPat16Set.size();
				
				
				result.put("TrNetPat16", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 9.0;
				patternStats.realSize = trNetPat13Set.size();
				
				
				result.put("TrNetPat13", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat14Set.size();
				
				
				result.put("TrNetPat14", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat15Set.size();
				
				
				result.put("TrNetPat15", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat53Set.size();
				
				
				result.put("TrNetPat53", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat54Set.size();
				
				
				result.put("TrNetPat54", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat55Set.size();
				
				
				result.put("TrNetPat55", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5.0;
				patternStats.realSize = trNetPat56Set.size();
				
				
				result.put("TrNetPat56", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat57Set.size();
				
				
				result.put("TrNetPat57", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat58Set.size();
				
				
				result.put("TrNetPat58", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat51Set.size();
				
				
				result.put("TrNetPat51", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat59Set.size();
				
				
				result.put("TrNetPat59", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat60Set.size();
				
				
				result.put("TrNetPat60", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat61Set.size();
				
				
				result.put("TrNetPat61", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat62Set.size();
				
				
				result.put("TrNetPat62", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat63Set.size();
				
				
				result.put("TrNetPat63", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat64Set.size();
				
				
				result.put("TrNetPat64", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat65Set.size();
				
				
				result.put("TrNetPat65", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat66Set.size();
				
				
				result.put("TrNetPat66", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat67Set.size();
				
				
				result.put("TrNetPat67", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 3.0;
				patternStats.realSize = trNetPat68Set.size();
				
				
				result.put("TrNetPat68", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat33Set.size();
				
				
				result.put("TrNetPat33", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 3.0;
				patternStats.realSize = trNetPat34Set.size();
				
				
				result.put("TrNetPat34", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 3.0;
				patternStats.realSize = trNetPat36Set.size();
				
				
				result.put("TrNetPat36", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 3.0;
				patternStats.realSize = trNetPat37Set.size();
				
				
				result.put("TrNetPat37", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 3.0;
				patternStats.realSize = trNetPat69Set.size();
				
				
				result.put("TrNetPat69", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 3.0;
				patternStats.realSize = trNetPat35Set.size();
				
				
				result.put("TrNetPat35", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat38Set.size();
				
				
				result.put("TrNetPat38", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5.0;
				patternStats.realSize = trNetPat39Set.size();
				
				
				result.put("TrNetPat39", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 5.0;
				patternStats.realSize = trNetPat40Set.size();
				
				
				result.put("TrNetPat40", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat41Set.size();
				
				
				result.put("TrNetPat41", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 6.25;
				patternStats.realSize = trNetPat42Set.size();
				
				
				result.put("TrNetPat42", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 6.25;
				patternStats.realSize = trNetPat43Set.size();
				
				
				result.put("TrNetPat43", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat70Set.size();
				
				
				result.put("TrNetPat70", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat21Set.size();
				
				
				result.put("TrNetPat21", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat22Set.size();
				
				
				result.put("TrNetPat22", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat23Set.size();
				
				
				result.put("TrNetPat23", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 8.0;
				patternStats.realSize = trNetPat71Set.size();
				
				
				result.put("TrNetPat71", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 8.0;
				patternStats.realSize = trNetPat24Set.size();
				
				
				result.put("TrNetPat24", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat25Set.size();
				
				
				result.put("TrNetPat25", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 2.5;
				patternStats.realSize = trNetPat26Set.size();
				
				
				result.put("TrNetPat26", patternStats);
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat5");
					
					patternStatsFile.append("TrNetPat5");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat3");
					
					patternStatsFile.append("TrNetPat3");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat27");
					
					patternStatsFile.append("TrNetPat27");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat20");
					
					patternStatsFile.append("TrNetPat20");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat45");
					
					patternStatsFile.append("TrNetPat45");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat28");
					
					patternStatsFile.append("TrNetPat28");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat10");
					
					patternStatsFile.append("TrNetPat10");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat47");
					
					patternStatsFile.append("TrNetPat47");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat31");
					
					patternStatsFile.append("TrNetPat31");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat48");
					
					patternStatsFile.append("TrNetPat48");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat49");
					
					patternStatsFile.append("TrNetPat49");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat50");
					
					patternStatsFile.append("TrNetPat50");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat52");
					
					patternStatsFile.append("TrNetPat52");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat13");
					
					patternStatsFile.append("TrNetPat13");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat15");
					
					patternStatsFile.append("TrNetPat15");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat53");
					
					patternStatsFile.append("TrNetPat53");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat54");
					
					patternStatsFile.append("TrNetPat54");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat55");
					
					patternStatsFile.append("TrNetPat55");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat56");
					
					patternStatsFile.append("TrNetPat56");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat57");
					
					patternStatsFile.append("TrNetPat57");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat58");
					
					patternStatsFile.append("TrNetPat58");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat51");
					
					patternStatsFile.append("TrNetPat51");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat59");
					
					patternStatsFile.append("TrNetPat59");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat60");
					
					patternStatsFile.append("TrNetPat60");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat61");
					
					patternStatsFile.append("TrNetPat61");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat62");
					
					patternStatsFile.append("TrNetPat62");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat63");
					
					patternStatsFile.append("TrNetPat63");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat64");
					
					patternStatsFile.append("TrNetPat64");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat65");
					
					patternStatsFile.append("TrNetPat65");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat66");
					
					patternStatsFile.append("TrNetPat66");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat67");
					
					patternStatsFile.append("TrNetPat67");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.expectedSize + "");
				    patternStatsFile.append(',');
				    patternStatsFile.append(patternStats.realSize + "");
				    patternStatsFile.append('\n');
					
				}
				{
					generic.PatternStats patternStats = statsMap.get("TrNetPat68");
					
					patternStatsFile.append("TrNetPat68");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat36");
					
					patternStatsFile.append("TrNetPat36");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat69");
					
					patternStatsFile.append("TrNetPat69");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat42");
					
					patternStatsFile.append("TrNetPat42");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat70");
					
					patternStatsFile.append("TrNetPat70");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat22");
					
					patternStatsFile.append("TrNetPat22");
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
					generic.PatternStats patternStats = statsMap.get("TrNetPat71");
					
					patternStatsFile.append("TrNetPat71");
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
			
		    patternStatsFile.flush();
		    patternStatsFile.close();
		}
		catch(java.io.IOException e){
		     e.printStackTrace();
		} 
		
	}
	
	public void notify(TrNetPat29Instance element){
		if (trNetPat29Set.add(element)) {
			trNetPat29Array.add(element);
	{
		if (!transition0InTrNetPat29Hash.containsKey(element.transition0)) {
			transition0InTrNetPat29Hash.put(element.transition0, new LinkedList<TrNetPat29Instance>());
		}
		transition0InTrNetPat29Hash.get(element.transition0).add(element);
	}
			/*
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp35();
			*/
		}
	}
	public void notify(TrNetPat71Instance element){
		if (trNetPat71Set.add(element)) {
			trNetPat71Array.add(element);
	{
		if (!partition0InTrNetPat71Hash.containsKey(element.partition0)) {
			partition0InTrNetPat71Hash.put(element.partition0, new LinkedList<TrNetPat71Instance>());
		}
		partition0InTrNetPat71Hash.get(element.partition0).add(element);
	}
			/*
	executeOperatorTrNetOp22();
			*/
		}
	}
	public void notify(TrNetPat1Instance element){
		if (trNetPat1Set.add(element)) {
			trNetPat1Array.add(element);
			/*
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp15();
			*/
		}
	}
	public void notify(TrNetPat47Instance element){
		if (trNetPat47Set.add(element)) {
			trNetPat47Array.add(element);
	{
		if (!transition0InTrNetPat47Hash.containsKey(element.transition0)) {
			transition0InTrNetPat47Hash.put(element.transition0, new LinkedList<TrNetPat47Instance>());
		}
		transition0InTrNetPat47Hash.get(element.transition0).add(element);
	}
			/*
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp32();
			*/
		}
	}
	public void notify(TrNetPat70Instance element){
		if (trNetPat70Set.add(element)) {
			trNetPat70Array.add(element);
			/*
	executeOperatorTrNetOp19();
			*/
		}
	}
	public void notify(TrNetPat48Instance element){
		if (trNetPat48Set.add(element)) {
			trNetPat48Array.add(element);
			/*
	executeOperatorTrNetOp41();
			*/
		}
	}
	public void notify(TrNetPat68Instance element){
		if (trNetPat68Set.add(element)) {
			trNetPat68Array.add(element);
			/*
	executeOperatorTrNetOp28();
			*/
		}
	}
	public void notify(TrNetPat53Instance element){
		if (trNetPat53Set.add(element)) {
			trNetPat53Array.add(element);
			/*
	executeOperatorTrNetOp44();
			*/
		}
	}
	public void notify(TrNetPat65Instance element){
		if (trNetPat65Set.add(element)) {
			trNetPat65Array.add(element);
			/*
	executeOperatorTrNetOp54();
			*/
		}
	}
	public void notify(TrNetPat56Instance element){
		if (trNetPat56Set.add(element)) {
			trNetPat56Array.add(element);
			/*
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp48();
	executeOperatorTrNetOp50();
	executeOperatorTrNetOp52();
			*/
		}
	}
	public void notify(TrNetPat17Instance element){
		if (trNetPat17Set.add(element)) {
			trNetPat17Array.add(element);
			/*
	executeOperatorTrNetOp16();
			*/
		}
	}
	public void notify(TrNetPat28Instance element){
		if (trNetPat28Set.add(element)) {
			trNetPat28Array.add(element);
	{
		if (!activityGraph0InTrNetPat28Hash.containsKey(element.activityGraph0)) {
			activityGraph0InTrNetPat28Hash.put(element.activityGraph0, new LinkedList<TrNetPat28Instance>());
		}
		activityGraph0InTrNetPat28Hash.get(element.activityGraph0).add(element);
	}
			/*
	executeOperatorTrNetOp7();
			*/
		}
	}
	public void notify(TrNetPat52Instance element){
		if (trNetPat52Set.add(element)) {
			trNetPat52Array.add(element);
	{
		if (!compositeState0InTrNetPat52Hash.containsKey(element.compositeState0)) {
			compositeState0InTrNetPat52Hash.put(element.compositeState0, new LinkedList<TrNetPat52Instance>());
		}
		compositeState0InTrNetPat52Hash.get(element.compositeState0).add(element);
	}
			/*
	executeOperatorTrNetOp15();
			*/
		}
	}
	public void notify(TrNetPat27Instance element){
		if (trNetPat27Set.add(element)) {
			trNetPat27Array.add(element);
			/*
	executeOperatorTrNetOp17();
			*/
		}
	}
	public void notify(TrNetPat69Instance element){
		if (trNetPat69Set.add(element)) {
			trNetPat69Array.add(element);
			/*
	executeOperatorTrNetOp29();
			*/
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

LinkedList<TrNetPat37InstanceListener> listenersTrNetPat37Instance;

public void registerListener(TrNetPat37InstanceListener listener){
	listenersTrNetPat37Instance.add(listener);
}
	
public void notifyListeners(TrNetPat37Instance element){
	for (TrNetPat37InstanceListener listener : listenersTrNetPat37Instance){
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

LinkedList<TrNetPat15InstanceListener> listenersTrNetPat15Instance;

public void registerListener(TrNetPat15InstanceListener listener){
	listenersTrNetPat15Instance.add(listener);
}
	
public void notifyListeners(TrNetPat15Instance element){
	for (TrNetPat15InstanceListener listener : listenersTrNetPat15Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat36InstanceListener> listenersTrNetPat36Instance;

public void registerListener(TrNetPat36InstanceListener listener){
	listenersTrNetPat36Instance.add(listener);
}
	
public void notifyListeners(TrNetPat36Instance element){
	for (TrNetPat36InstanceListener listener : listenersTrNetPat36Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat62InstanceListener> listenersTrNetPat62Instance;

public void registerListener(TrNetPat62InstanceListener listener){
	listenersTrNetPat62Instance.add(listener);
}
	
public void notifyListeners(TrNetPat62Instance element){
	for (TrNetPat62InstanceListener listener : listenersTrNetPat62Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat26InstanceListener> listenersTrNetPat26Instance;

public void registerListener(TrNetPat26InstanceListener listener){
	listenersTrNetPat26Instance.add(listener);
}
	
public void notifyListeners(TrNetPat26Instance element){
	for (TrNetPat26InstanceListener listener : listenersTrNetPat26Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat43InstanceListener> listenersTrNetPat43Instance;

public void registerListener(TrNetPat43InstanceListener listener){
	listenersTrNetPat43Instance.add(listener);
}
	
public void notifyListeners(TrNetPat43Instance element){
	for (TrNetPat43InstanceListener listener : listenersTrNetPat43Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat20InstanceListener> listenersTrNetPat20Instance;

public void registerListener(TrNetPat20InstanceListener listener){
	listenersTrNetPat20Instance.add(listener);
}
	
public void notifyListeners(TrNetPat20Instance element){
	for (TrNetPat20InstanceListener listener : listenersTrNetPat20Instance){
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

LinkedList<TrNetPat55InstanceListener> listenersTrNetPat55Instance;

public void registerListener(TrNetPat55InstanceListener listener){
	listenersTrNetPat55Instance.add(listener);
}
	
public void notifyListeners(TrNetPat55Instance element){
	for (TrNetPat55InstanceListener listener : listenersTrNetPat55Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat60InstanceListener> listenersTrNetPat60Instance;

public void registerListener(TrNetPat60InstanceListener listener){
	listenersTrNetPat60Instance.add(listener);
}
	
public void notifyListeners(TrNetPat60Instance element){
	for (TrNetPat60InstanceListener listener : listenersTrNetPat60Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat46InstanceListener> listenersTrNetPat46Instance;

public void registerListener(TrNetPat46InstanceListener listener){
	listenersTrNetPat46Instance.add(listener);
}
	
public void notifyListeners(TrNetPat46Instance element){
	for (TrNetPat46InstanceListener listener : listenersTrNetPat46Instance){
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

LinkedList<TrNetPat32InstanceListener> listenersTrNetPat32Instance;

public void registerListener(TrNetPat32InstanceListener listener){
	listenersTrNetPat32Instance.add(listener);
}
	
public void notifyListeners(TrNetPat32Instance element){
	for (TrNetPat32InstanceListener listener : listenersTrNetPat32Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat40InstanceListener> listenersTrNetPat40Instance;

public void registerListener(TrNetPat40InstanceListener listener){
	listenersTrNetPat40Instance.add(listener);
}
	
public void notifyListeners(TrNetPat40Instance element){
	for (TrNetPat40InstanceListener listener : listenersTrNetPat40Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat64InstanceListener> listenersTrNetPat64Instance;

public void registerListener(TrNetPat64InstanceListener listener){
	listenersTrNetPat64Instance.add(listener);
}
	
public void notifyListeners(TrNetPat64Instance element){
	for (TrNetPat64InstanceListener listener : listenersTrNetPat64Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat58InstanceListener> listenersTrNetPat58Instance;

public void registerListener(TrNetPat58InstanceListener listener){
	listenersTrNetPat58Instance.add(listener);
}
	
public void notifyListeners(TrNetPat58Instance element){
	for (TrNetPat58InstanceListener listener : listenersTrNetPat58Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat67InstanceListener> listenersTrNetPat67Instance;

public void registerListener(TrNetPat67InstanceListener listener){
	listenersTrNetPat67Instance.add(listener);
}
	
public void notifyListeners(TrNetPat67Instance element){
	for (TrNetPat67InstanceListener listener : listenersTrNetPat67Instance){
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

LinkedList<TrNetPat50InstanceListener> listenersTrNetPat50Instance;

public void registerListener(TrNetPat50InstanceListener listener){
	listenersTrNetPat50Instance.add(listener);
}
	
public void notifyListeners(TrNetPat50Instance element){
	for (TrNetPat50InstanceListener listener : listenersTrNetPat50Instance){
		listener.notify(element);
	}
}

LinkedList<TrNetPat23InstanceListener> listenersTrNetPat23Instance;

public void registerListener(TrNetPat23InstanceListener listener){
	listenersTrNetPat23Instance.add(listener);
}
	
public void notifyListeners(TrNetPat23Instance element){
	for (TrNetPat23InstanceListener listener : listenersTrNetPat23Instance){
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

	
	
boolean executeOperatorEvolvedOutput() {
	boolean operatorHasExecuted = false;
	
	{
		int sourcePatternSize = trNetPat3Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
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
	{
		int sourcePatternSize = trNetPat4Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat4Instance sourcePatternInstance = trNetPat4Array.get(i);
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
		int sourcePatternSize = trNetPat20Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat46Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat46Instance sourcePatternInstance = trNetPat46Array.get(i);
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
		int sourcePatternSize = trNetPat32Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat32Instance sourcePatternInstance = trNetPat32Array.get(i);
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
		int sourcePatternSize = trNetPat50Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat50Instance sourcePatternInstance = trNetPat50Array.get(i);
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
		int sourcePatternSize = trNetPat55Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat55Instance sourcePatternInstance = trNetPat55Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat58Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat58Instance sourcePatternInstance = trNetPat58Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat60Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat60Instance sourcePatternInstance = trNetPat60Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat62Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat62Instance sourcePatternInstance = trNetPat62Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat64Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat64Instance sourcePatternInstance = trNetPat64Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat67Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat67Instance sourcePatternInstance = trNetPat67Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat36Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat36Instance sourcePatternInstance = trNetPat36Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat37Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat37Instance sourcePatternInstance = trNetPat37Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat40Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat40Instance sourcePatternInstance = trNetPat40Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat43Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat43Instance sourcePatternInstance = trNetPat43Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat23Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat23Instance sourcePatternInstance = trNetPat23Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	}
	{
		int sourcePatternSize = trNetPat26Array.size();
		for (int i = 0; i<sourcePatternSize; i++){
			TrNetPat26Instance sourcePatternInstance = trNetPat26Array.get(i);
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
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.activityGraph0.attributes.get("name")));
	node.types.add("Activity");
				
				targetInstance.activity0 = node;
				
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
	node.types.add("Package");
				
				targetInstance.package0 = node;
				
				}
			{
			targetInstance.activityGraph0 = sourcePatternInstance.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
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
boolean executeOperatorTrNetOp4() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat3Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat5Instance targetInstance = new TrNetPat5Instance();
			{
			targetInstance.package0 = sourcePatternInstance.package0;
			targetInstance.package0.types.add("Package");
			}
		if (trNetPat5Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat5Array.add(targetInstance);
	//patternTrNetPat5HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp3() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat3Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat4Instance targetInstance = new TrNetPat4Instance();
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
			}
		if (trNetPat4Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat4Array.add(targetInstance);
	//patternTrNetPat4HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp2() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat2Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat2Instance sourcePatternInstance = trNetPat2Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat3Instance targetInstance = new TrNetPat3Instance();
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.package0 = sourcePatternInstance.package0;
			targetInstance.package0.types.add("Package");
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
boolean executeOperatorTrNetOp16() {
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
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.partition0.attributes.get("name")));
	node.types.add("ActivityPartition");
				
				targetInstance.activityPartition0 = node;
				
				}
			{
			targetInstance.partition0 = sourcePatternInstance.partition0;
			targetInstance.partition0.types.add("Partition");
			}
		if (trNetPat18Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat18Array.add(targetInstance);
	{
		if (!partition0InTrNetPat18Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat18Hash.put(targetInstance.partition0, new LinkedList<TrNetPat18Instance>());
		}
		partition0InTrNetPat18Hash.get(targetInstance.partition0).add(targetInstance);
	}
	//patternTrNetPat18HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp17() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat27Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat27Instance sourcePatternInstance1 = trNetPat27Array.get(i);
		
		
			int sourcePatternSize2 = trNetPat18Array.size();
			
			for (int j = 0; j<sourcePatternSize2; j++){
				TrNetPat18Instance sourcePatternInstance2 = trNetPat18Array.get(j);
				
				
				
	{
			totalCombinationsCounter++;
		TrNetPat19Instance targetInstance = new TrNetPat19Instance();
			{
			targetInstance.partition0 = sourcePatternInstance1.partition0;
			targetInstance.partition0.types.add("Partition");
			}
			{
			targetInstance.activityGraph0 = sourcePatternInstance1.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
			{
			targetInstance.activityPartition0 = sourcePatternInstance2.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
		if (trNetPat19Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat19Array.add(targetInstance);
	{
		if (!activityGraph0InTrNetPat19Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat19Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat19Instance>());
		}
		activityGraph0InTrNetPat19Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	//patternTrNetPat19HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
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
		
		
			LinkedList<TrNetPat19Instance> sourcePatternInstances2 = activityGraph0InTrNetPat19Hash.get(sourcePatternInstance1.activityGraph0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat19Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat6Instance targetInstance = new TrNetPat6Instance();
			{
			targetInstance.activity0 = sourcePatternInstance1.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.activityPartition0 = sourcePatternInstance2.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
			{
			targetInstance.partition0 = sourcePatternInstance2.partition0;
			targetInstance.partition0.types.add("Partition");
			}
			{
			targetInstance.activityGraph0 = sourcePatternInstance2.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
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
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp6() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat6Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat6Instance sourcePatternInstance = trNetPat6Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat7Instance targetInstance = new TrNetPat7Instance();
			{
			targetInstance.activityPartition0 = sourcePatternInstance.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
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
boolean executeOperatorTrNetOp18() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat20Instance targetInstance = new TrNetPat20Instance();
			{
			targetInstance.activityPartition0 = sourcePatternInstance.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
		if (trNetPat20Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat20Array.add(targetInstance);
	//patternTrNetPat20HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp38() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat47Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat47Instance sourcePatternInstance1 = trNetPat47Array.get(i);
		
		
			LinkedList<TrNetPat29Instance> sourcePatternInstances2 = transition0InTrNetPat29Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat29Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (! conditions.Conditions.hasKindOfObjectFlowState(sourcePatternInstance2.stateVertex0,sourcePatternInstance1.stateVertex0)) {
		continue;
	}
					
					
	{
			totalCombinationsCounter++;
		TrNetPat44Instance targetInstance = new TrNetPat44Instance();
			{
			targetInstance.stateVertex1 = sourcePatternInstance1.stateVertex0;
			targetInstance.stateVertex1.types.add("StateVertex");
			}
			{
			targetInstance.transition0 = sourcePatternInstance2.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat44Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat44Array.add(targetInstance);
	//patternTrNetPat44HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
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
	
	
	
	int sourcePatternSize = trNetPat44Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat44Instance sourcePatternInstance = trNetPat44Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat45Instance targetInstance = new TrNetPat45Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("ObjectFlow");
				
				targetInstance.objectFlow0 = node;
				
				}
			{
			targetInstance.transition0 = sourcePatternInstance.transition0;
			targetInstance.transition0.types.add("Transition");
			}
		if (trNetPat45Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat45Array.add(targetInstance);
	{
		if (!transition0InTrNetPat45Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat45Hash.put(targetInstance.transition0, new LinkedList<TrNetPat45Instance>());
		}
		transition0InTrNetPat45Hash.get(targetInstance.transition0).add(targetInstance);
	}
	//patternTrNetPat45HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp40() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat45Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat45Instance sourcePatternInstance = trNetPat45Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat46Instance targetInstance = new TrNetPat46Instance();
			{
			targetInstance.objectFlow0 = sourcePatternInstance.objectFlow0;
			targetInstance.objectFlow0.types.add("ObjectFlow");
			}
		if (trNetPat46Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat46Array.add(targetInstance);
	//patternTrNetPat46HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat33Instance targetInstance = new TrNetPat33Instance();
			{
			targetInstance.activityEdge0 = sourcePatternInstance.objectFlow0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.transition0 = sourcePatternInstance.transition0;
			targetInstance.transition0.types.add("Transition");
			}
		if (trNetPat33Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat33Array.add(targetInstance);
	{
		if (!transition0InTrNetPat33Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat33Hash.put(targetInstance.transition0, new LinkedList<TrNetPat33Instance>());
		}
		transition0InTrNetPat33Hash.get(targetInstance.transition0).add(targetInstance);
	}
	//patternTrNetPat33HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp7() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			LinkedList<TrNetPat28Instance> sourcePatternInstances2 = activityGraph0InTrNetPat28Hash.get(sourcePatternInstance1.activityGraph0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat28Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
			{
			targetInstance.activity0 = sourcePatternInstance1.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.activityGraph0 = sourcePatternInstance2.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
			{
			targetInstance.transition0 = sourcePatternInstance2.transition0;
			targetInstance.transition0.types.add("Transition");
			}
		if (trNetPat8Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat8Array.add(targetInstance);
	//patternTrNetPat8HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp8() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat8Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat8Instance sourcePatternInstance1 = trNetPat8Array.get(i);
		
		
			LinkedList<TrNetPat45Instance> sourcePatternInstances2 = transition0InTrNetPat45Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat45Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat9Instance targetInstance = new TrNetPat9Instance();
			{
			targetInstance.activityGraph0 = sourcePatternInstance1.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.activity0 = sourcePatternInstance1.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.objectFlow0 = sourcePatternInstance2.objectFlow0;
			targetInstance.objectFlow0.types.add("ObjectFlow");
			}
		if (trNetPat9Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat9Array.add(targetInstance);
	//patternTrNetPat9HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp9() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat9Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat9Instance sourcePatternInstance = trNetPat9Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat10Instance targetInstance = new TrNetPat10Instance();
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.objectFlow0 = sourcePatternInstance.objectFlow0;
			targetInstance.objectFlow0.types.add("ObjectFlow");
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
boolean executeOperatorTrNetOp25() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat47Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat47Instance sourcePatternInstance1 = trNetPat47Array.get(i);
		
	if (! conditions.Conditions.isNotKindOfObjectFlowState(sourcePatternInstance1.stateVertex0)) {
		continue;
	}
		
			LinkedList<TrNetPat29Instance> sourcePatternInstances2 = transition0InTrNetPat29Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat29Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
	if (! conditions.Conditions.isNotKindOfObjectFlowState(sourcePatternInstance2.stateVertex0)) {
		continue;
	}
	if (! conditions.Conditions.isNotKindOfObjectFlowState(sourcePatternInstance1.stateVertex0)) {
		continue;
	}
					
					
	{
			totalCombinationsCounter++;
		TrNetPat30Instance targetInstance = new TrNetPat30Instance();
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance1.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.stateVertex1 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex1.types.add("StateVertex");
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
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp26() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat30Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat30Instance sourcePatternInstance = trNetPat30Array.get(i);
		
		
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
	node.types.add("ControlFlow");
				
				targetInstance.controlFlow0 = node;
				
				}
			{
			targetInstance.transition0 = sourcePatternInstance.transition0;
			targetInstance.transition0.types.add("Transition");
			}
		if (trNetPat31Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat31Array.add(targetInstance);
	{
		if (!transition0InTrNetPat31Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat31Hash.put(targetInstance.transition0, new LinkedList<TrNetPat31Instance>());
		}
		transition0InTrNetPat31Hash.get(targetInstance.transition0).add(targetInstance);
	}
	//patternTrNetPat31HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp27() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat31Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat31Instance sourcePatternInstance = trNetPat31Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat32Instance targetInstance = new TrNetPat32Instance();
			{
			targetInstance.controlFlow0 = sourcePatternInstance.controlFlow0;
			targetInstance.controlFlow0.types.add("ControlFlow");
			}
		if (trNetPat32Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat32Array.add(targetInstance);
	//patternTrNetPat32HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat33Instance targetInstance = new TrNetPat33Instance();
			{
			targetInstance.activityEdge0 = sourcePatternInstance.controlFlow0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.transition0 = sourcePatternInstance.transition0;
			targetInstance.transition0.types.add("Transition");
			}
		if (trNetPat33Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat33Array.add(targetInstance);
	{
		if (!transition0InTrNetPat33Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat33Hash.put(targetInstance.transition0, new LinkedList<TrNetPat33Instance>());
		}
		transition0InTrNetPat33Hash.get(targetInstance.transition0).add(targetInstance);
	}
	//patternTrNetPat33HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp10() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat8Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat8Instance sourcePatternInstance1 = trNetPat8Array.get(i);
		
		
			LinkedList<TrNetPat31Instance> sourcePatternInstances2 = transition0InTrNetPat31Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat31Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat11Instance targetInstance = new TrNetPat11Instance();
			{
			targetInstance.activityGraph0 = sourcePatternInstance1.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.activity0 = sourcePatternInstance1.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.controlFlow0 = sourcePatternInstance2.controlFlow0;
			targetInstance.controlFlow0.types.add("ControlFlow");
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
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp11() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat11Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat11Instance sourcePatternInstance = trNetPat11Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat12Instance targetInstance = new TrNetPat12Instance();
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.controlFlow0 = sourcePatternInstance.controlFlow0;
			targetInstance.controlFlow0.types.add("ControlFlow");
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
boolean executeOperatorTrNetOp41() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat48Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat48Instance sourcePatternInstance = trNetPat48Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat49Instance targetInstance = new TrNetPat49Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.actionState0.attributes.get("name")));
	node.types.add("OpaqueAction");
				
				targetInstance.opaqueAction0 = node;
				
				}
			{
			targetInstance.actionState0 = sourcePatternInstance.actionState0;
			targetInstance.actionState0.types.add("ActionState");
			}
		if (trNetPat49Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat49Array.add(targetInstance);
	//patternTrNetPat49HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp42() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat49Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat49Instance sourcePatternInstance = trNetPat49Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat50Instance targetInstance = new TrNetPat50Instance();
			{
			targetInstance.opaqueAction0 = sourcePatternInstance.opaqueAction0;
			targetInstance.opaqueAction0.types.add("OpaqueAction");
			}
		if (trNetPat50Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat50Array.add(targetInstance);
	//patternTrNetPat50HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp15() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat1Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat1Instance sourcePatternInstance1 = trNetPat1Array.get(i);
		
		
			LinkedList<TrNetPat52Instance> sourcePatternInstances2 = compositeState0InTrNetPat52Hash.get(sourcePatternInstance1.compositeState0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat52Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat16Instance targetInstance = new TrNetPat16Instance();
			{
			targetInstance.activityGraph0 = sourcePatternInstance1.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
			{
			targetInstance.compositeState0 = sourcePatternInstance2.compositeState0;
			targetInstance.compositeState0.types.add("CompositeState");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat16Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat16Array.add(targetInstance);
	{
		if (!activityGraph0InTrNetPat16Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat16Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat16Instance>());
		}
		activityGraph0InTrNetPat16Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	//patternTrNetPat16HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
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
	
	
	int sourcePatternSize1 = trNetPat2Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat2Instance sourcePatternInstance1 = trNetPat2Array.get(i);
		
		
			LinkedList<TrNetPat16Instance> sourcePatternInstances2 = activityGraph0InTrNetPat16Hash.get(sourcePatternInstance1.activityGraph0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat16Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat13Instance targetInstance = new TrNetPat13Instance();
			{
			targetInstance.activity0 = sourcePatternInstance1.activity0;
			targetInstance.activity0.types.add("Activity");
			}
			{
			targetInstance.compositeState0 = sourcePatternInstance2.compositeState0;
			targetInstance.compositeState0.types.add("CompositeState");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityGraph0 = sourcePatternInstance2.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
		if (trNetPat13Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat13Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat13Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat13Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat13Instance>());
		}
		stateVertex0InTrNetPat13Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
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
	
	
	int sourcePatternSize1 = trNetPat51Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat51Instance sourcePatternInstance1 = trNetPat51Array.get(i);
		
		
			LinkedList<TrNetPat13Instance> sourcePatternInstances2 = stateVertex0InTrNetPat13Hash.get(sourcePatternInstance1.stateVertex0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat13Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
			{
			targetInstance.activityNode0 = sourcePatternInstance1.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
			{
			targetInstance.compositeState0 = sourcePatternInstance2.compositeState0;
			targetInstance.compositeState0.types.add("CompositeState");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityGraph0 = sourcePatternInstance2.activityGraph0;
			targetInstance.activityGraph0.types.add("ActivityGraph");
			}
			{
			targetInstance.activity0 = sourcePatternInstance2.activity0;
			targetInstance.activity0.types.add("Activity");
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
			targetInstance.activityNode0 = sourcePatternInstance.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
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
boolean executeOperatorTrNetOp44() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat53Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat53Instance sourcePatternInstance = trNetPat53Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat54Instance targetInstance = new TrNetPat54Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.finalState0.attributes.get("name")));
	node.types.add("ActivityFinalNode");
				
				targetInstance.activityFinalNode0 = node;
				
				}
			{
			targetInstance.finalState0 = sourcePatternInstance.finalState0;
			targetInstance.finalState0.types.add("FinalState");
			}
		if (trNetPat54Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat54Array.add(targetInstance);
	//patternTrNetPat54HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp45() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat54Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat54Instance sourcePatternInstance = trNetPat54Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat55Instance targetInstance = new TrNetPat55Instance();
			{
			targetInstance.activityFinalNode0 = sourcePatternInstance.activityFinalNode0;
			targetInstance.activityFinalNode0.types.add("ActivityFinalNode");
			}
		if (trNetPat55Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat55Array.add(targetInstance);
	//patternTrNetPat55HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.finalState0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.activityFinalNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp46() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isinitial(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		TrNetPat57Instance targetInstance = new TrNetPat57Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.pseudostate0.attributes.get("name")));
	node.types.add("InitialNode");
				
				targetInstance.initialNode0 = node;
				
				}
			{
			targetInstance.pseudostate0 = sourcePatternInstance.pseudostate0;
			targetInstance.pseudostate0.types.add("Pseudostate");
			}
		if (trNetPat57Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat57Array.add(targetInstance);
	//patternTrNetPat57HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp47() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat57Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat57Instance sourcePatternInstance = trNetPat57Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat58Instance targetInstance = new TrNetPat58Instance();
			{
			targetInstance.initialNode0 = sourcePatternInstance.initialNode0;
			targetInstance.initialNode0.types.add("InitialNode");
			}
		if (trNetPat58Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat58Array.add(targetInstance);
	//patternTrNetPat58HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.pseudostate0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.initialNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp43() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat49Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat49Instance sourcePatternInstance = trNetPat49Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.actionState0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.opaqueAction0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp48() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isjoin(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		TrNetPat59Instance targetInstance = new TrNetPat59Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.pseudostate0.attributes.get("name")));
	node.types.add("JoinNode");
				
				targetInstance.joinNode0 = node;
				
				}
			{
			targetInstance.pseudostate0 = sourcePatternInstance.pseudostate0;
			targetInstance.pseudostate0.types.add("Pseudostate");
			}
		if (trNetPat59Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat59Array.add(targetInstance);
	//patternTrNetPat59HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp49() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat59Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat59Instance sourcePatternInstance = trNetPat59Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat60Instance targetInstance = new TrNetPat60Instance();
			{
			targetInstance.joinNode0 = sourcePatternInstance.joinNode0;
			targetInstance.joinNode0.types.add("JoinNode");
			}
		if (trNetPat60Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat60Array.add(targetInstance);
	//patternTrNetPat60HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.pseudostate0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.joinNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp50() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfork(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		TrNetPat61Instance targetInstance = new TrNetPat61Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.pseudostate0.attributes.get("name")));
	node.types.add("ForkNode");
				
				targetInstance.forkNode0 = node;
				
				}
			{
			targetInstance.pseudostate0 = sourcePatternInstance.pseudostate0;
			targetInstance.pseudostate0.types.add("Pseudostate");
			}
		if (trNetPat61Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat61Array.add(targetInstance);
	//patternTrNetPat61HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp51() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat61Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat61Instance sourcePatternInstance = trNetPat61Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat62Instance targetInstance = new TrNetPat62Instance();
			{
			targetInstance.forkNode0 = sourcePatternInstance.forkNode0;
			targetInstance.forkNode0.types.add("ForkNode");
			}
		if (trNetPat62Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat62Array.add(targetInstance);
	//patternTrNetPat62HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.pseudostate0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.forkNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp53() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat63Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat63Instance sourcePatternInstance = trNetPat63Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat64Instance targetInstance = new TrNetPat64Instance();
			{
			targetInstance.decisionNode0 = sourcePatternInstance.decisionNode0;
			targetInstance.decisionNode0.types.add("DecisionNode");
			}
		if (trNetPat64Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat64Array.add(targetInstance);
	//patternTrNetPat64HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.pseudostate0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.decisionNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp52() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isjunction(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
			totalCombinationsCounter++;
		TrNetPat63Instance targetInstance = new TrNetPat63Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.pseudostate0.attributes.get("name")));
	node.types.add("DecisionNode");
				
				targetInstance.decisionNode0 = node;
				
				}
			{
			targetInstance.pseudostate0 = sourcePatternInstance.pseudostate0;
			targetInstance.pseudostate0.types.add("Pseudostate");
			}
		if (trNetPat63Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat63Array.add(targetInstance);
	//patternTrNetPat63HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp54() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat65Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat65Instance sourcePatternInstance = trNetPat65Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat66Instance targetInstance = new TrNetPat66Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.objectFlowState0.attributes.get("name")));
	node.types.add("ActivityParameterNode");
				
				targetInstance.activityParameterNode0 = node;
				
				}
			{
			targetInstance.objectFlowState0 = sourcePatternInstance.objectFlowState0;
			targetInstance.objectFlowState0.types.add("ObjectFlowState");
			}
		if (trNetPat66Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat66Array.add(targetInstance);
	//patternTrNetPat66HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp55() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat66Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat66Instance sourcePatternInstance = trNetPat66Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat67Instance targetInstance = new TrNetPat67Instance();
			{
			targetInstance.activityParameterNode0 = sourcePatternInstance.activityParameterNode0;
			targetInstance.activityParameterNode0.types.add("ActivityParameterNode");
			}
		if (trNetPat67Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat67Array.add(targetInstance);
	//patternTrNetPat67HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
			totalCombinationsCounter++;
		TrNetPat51Instance targetInstance = new TrNetPat51Instance();
			{
			targetInstance.stateVertex0 = sourcePatternInstance.objectFlowState0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.activityParameterNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat51Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat51Array.add(targetInstance);
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp28() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat68Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat68Instance sourcePatternInstance1 = trNetPat68Array.get(i);
		
		
			LinkedList<TrNetPat33Instance> sourcePatternInstances2 = transition0InTrNetPat33Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat33Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat34Instance targetInstance = new TrNetPat34Instance();
			{
			targetInstance.guard0 = sourcePatternInstance1.guard0;
			targetInstance.guard0.types.add("Guard");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.activityEdge0 = sourcePatternInstance2.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
		if (trNetPat34Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat34Array.add(targetInstance);
	{
		if (!guard0InTrNetPat34Hash.containsKey(targetInstance.guard0)) {
			guard0InTrNetPat34Hash.put(targetInstance.guard0, new LinkedList<TrNetPat34Instance>());
		}
		guard0InTrNetPat34Hash.get(targetInstance.guard0).add(targetInstance);
	}
	//patternTrNetPat34HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp30() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat35Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat35Instance sourcePatternInstance = trNetPat35Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat36Instance targetInstance = new TrNetPat36Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun?‹o usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Copy.copy(sourcePatternInstance.guard0.attributes.get("name")));
	node.attributes.put("body", generic.utils.Copy.copy(sourcePatternInstance.booleanExpression0.attributes.get("body")));
	node.types.add("OpaqueExpression");
				
				targetInstance.opaqueExpression0 = node;
				
				}
			{
			targetInstance.activityEdge0 = sourcePatternInstance.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
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
boolean executeOperatorTrNetOp31() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat36Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat36Instance sourcePatternInstance = trNetPat36Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat37Instance targetInstance = new TrNetPat37Instance();
			{
			targetInstance.opaqueExpression0 = sourcePatternInstance.opaqueExpression0;
			targetInstance.opaqueExpression0.types.add("OpaqueExpression");
			}
		if (trNetPat37Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat37Array.add(targetInstance);
	//patternTrNetPat37HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp29() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat69Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat69Instance sourcePatternInstance1 = trNetPat69Array.get(i);
		
		
			LinkedList<TrNetPat34Instance> sourcePatternInstances2 = guard0InTrNetPat34Hash.get(sourcePatternInstance1.guard0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat34Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat35Instance targetInstance = new TrNetPat35Instance();
			{
			targetInstance.booleanExpression0 = sourcePatternInstance1.booleanExpression0;
			targetInstance.booleanExpression0.types.add("BooleanExpression");
			}
			{
			targetInstance.guard0 = sourcePatternInstance2.guard0;
			targetInstance.guard0.types.add("Guard");
			}
			{
			targetInstance.transition0 = sourcePatternInstance2.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.activityEdge0 = sourcePatternInstance2.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
		if (trNetPat35Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat35Array.add(targetInstance);
	//patternTrNetPat35HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp32() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat33Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat33Instance sourcePatternInstance1 = trNetPat33Array.get(i);
		
		
			LinkedList<TrNetPat47Instance> sourcePatternInstances2 = transition0InTrNetPat47Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat47Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat38Instance targetInstance = new TrNetPat38Instance();
			{
			targetInstance.activityEdge0 = sourcePatternInstance1.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat38Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat38Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat38Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat38Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat38Instance>());
		}
		stateVertex0InTrNetPat38Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	//patternTrNetPat38HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
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
	
	
	int sourcePatternSize1 = trNetPat51Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat51Instance sourcePatternInstance1 = trNetPat51Array.get(i);
		
		
			LinkedList<TrNetPat38Instance> sourcePatternInstances2 = stateVertex0InTrNetPat38Hash.get(sourcePatternInstance1.stateVertex0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat38Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat39Instance targetInstance = new TrNetPat39Instance();
			{
			targetInstance.activityNode0 = sourcePatternInstance1.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
			{
			targetInstance.activityEdge0 = sourcePatternInstance2.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.transition0 = sourcePatternInstance2.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat39Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat39Array.add(targetInstance);
	//patternTrNetPat39HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp34() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat39Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat39Instance sourcePatternInstance = trNetPat39Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat40Instance targetInstance = new TrNetPat40Instance();
			{
			targetInstance.activityEdge0 = sourcePatternInstance.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat40Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat40Array.add(targetInstance);
	//patternTrNetPat40HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp35() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat33Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat33Instance sourcePatternInstance1 = trNetPat33Array.get(i);
		
		
			LinkedList<TrNetPat29Instance> sourcePatternInstances2 = transition0InTrNetPat29Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat29Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat41Instance targetInstance = new TrNetPat41Instance();
			{
			targetInstance.activityEdge0 = sourcePatternInstance1.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat41Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat41Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat41Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat41Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat41Instance>());
		}
		stateVertex0InTrNetPat41Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	//patternTrNetPat41HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp36() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat51Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat51Instance sourcePatternInstance1 = trNetPat51Array.get(i);
		
		
			LinkedList<TrNetPat41Instance> sourcePatternInstances2 = stateVertex0InTrNetPat41Hash.get(sourcePatternInstance1.stateVertex0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat41Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat42Instance targetInstance = new TrNetPat42Instance();
			{
			targetInstance.activityNode0 = sourcePatternInstance1.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
			{
			targetInstance.activityEdge0 = sourcePatternInstance2.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.transition0 = sourcePatternInstance2.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat42Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat42Array.add(targetInstance);
	//patternTrNetPat42HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
				}
			}
	}
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp37() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat42Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat42Instance sourcePatternInstance = trNetPat42Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat43Instance targetInstance = new TrNetPat43Instance();
			{
			targetInstance.activityEdge0 = sourcePatternInstance.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat43Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat43Array.add(targetInstance);
	//patternTrNetPat43HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp19() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat70Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat70Instance sourcePatternInstance1 = trNetPat70Array.get(i);
		
		
			LinkedList<TrNetPat18Instance> sourcePatternInstances2 = partition0InTrNetPat18Hash.get(sourcePatternInstance1.partition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat18Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat21Instance targetInstance = new TrNetPat21Instance();
			{
			targetInstance.partition0 = sourcePatternInstance1.partition0;
			targetInstance.partition0.types.add("Partition");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.activityPartition0 = sourcePatternInstance2.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
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
	
	
	int sourcePatternSize1 = trNetPat21Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat21Instance sourcePatternInstance1 = trNetPat21Array.get(i);
		
		
			LinkedList<TrNetPat33Instance> sourcePatternInstances2 = transition0InTrNetPat33Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat33Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat22Instance targetInstance = new TrNetPat22Instance();
			{
			targetInstance.partition0 = sourcePatternInstance1.partition0;
			targetInstance.partition0.types.add("Partition");
			}
			{
			targetInstance.transition0 = sourcePatternInstance1.transition0;
			targetInstance.transition0.types.add("Transition");
			}
			{
			targetInstance.activityPartition0 = sourcePatternInstance1.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
			{
			targetInstance.activityEdge0 = sourcePatternInstance2.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
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
boolean executeOperatorTrNetOp21() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat22Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat22Instance sourcePatternInstance = trNetPat22Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat23Instance targetInstance = new TrNetPat23Instance();
			{
			targetInstance.activityPartition0 = sourcePatternInstance.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
			{
			targetInstance.activityEdge0 = sourcePatternInstance.activityEdge0;
			targetInstance.activityEdge0.types.add("ActivityEdge");
			}
		if (trNetPat23Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat23Array.add(targetInstance);
	//patternTrNetPat23HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp22() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat18Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat18Instance sourcePatternInstance1 = trNetPat18Array.get(i);
		
		
			LinkedList<TrNetPat71Instance> sourcePatternInstances2 = partition0InTrNetPat71Hash.get(sourcePatternInstance1.partition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat71Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat24Instance targetInstance = new TrNetPat24Instance();
			{
			targetInstance.activityPartition0 = sourcePatternInstance1.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
			{
			targetInstance.partition0 = sourcePatternInstance2.partition0;
			targetInstance.partition0.types.add("Partition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
		if (trNetPat24Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat24Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat24Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat24Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat24Instance>());
		}
		stateVertex0InTrNetPat24Hash.get(targetInstance.stateVertex0).add(targetInstance);
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
boolean executeOperatorTrNetOp23() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat51Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat51Instance sourcePatternInstance1 = trNetPat51Array.get(i);
		
		
			LinkedList<TrNetPat24Instance> sourcePatternInstances2 = stateVertex0InTrNetPat24Hash.get(sourcePatternInstance1.stateVertex0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat24Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
			totalCombinationsCounter++;
		TrNetPat25Instance targetInstance = new TrNetPat25Instance();
			{
			targetInstance.activityNode0 = sourcePatternInstance1.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
			{
			targetInstance.partition0 = sourcePatternInstance2.partition0;
			targetInstance.partition0.types.add("Partition");
			}
			{
			targetInstance.stateVertex0 = sourcePatternInstance2.stateVertex0;
			targetInstance.stateVertex0.types.add("StateVertex");
			}
			{
			targetInstance.activityPartition0 = sourcePatternInstance2.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
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
boolean executeOperatorTrNetOp24() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat25Array.size();
	for (int i = 0; i<sourcePatternSize; i++){
		TrNetPat25Instance sourcePatternInstance = trNetPat25Array.get(i);
		
		
	{
			totalCombinationsCounter++;
		TrNetPat26Instance targetInstance = new TrNetPat26Instance();
			{
			targetInstance.activityPartition0 = sourcePatternInstance.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
			{
			targetInstance.activityNode0 = sourcePatternInstance.activityNode0;
			targetInstance.activityNode0.types.add("ActivityNode");
			}
		if (trNetPat26Set.add(targetInstance)) {
				totalElementPlacementCounter++;
			trNetPat26Array.add(targetInstance);
	//patternTrNetPat26HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	
	
	
	return operatorHasExecuted;
}
	
	boolean executeOperatorOriginalInput() {
		return true;
	}
	
	public void registerOriginalInputPublisher(ModelPatternPublisher publisher) {
		publisher.registerListener(inputOriginalInput);
	}
	
	public void registerEvolvedOutputListener(ModelPatternListener listener) {
		outputEvolvedOutput.registerListener(listener);
	}
}






