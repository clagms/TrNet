package class2relationaloriginal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;

import generic.*;

public class Class2RelationalOriginalTransformation
implements 			TrNetPat42InstanceListener
			,TrNetPat47InstanceListener
			,TrNetPat43InstanceListener
			,TrNetPat46InstanceListener
			,TrNetPat48InstanceListener
			,TrNetPat6InstanceListener
			,TrNetPat1InstanceListener
			,TrNetPat16InstancePublisher
			,TrNetPat4InstancePublisher
			,TrNetPat10InstancePublisher
			,TrNetPat9InstancePublisher
			,TrNetPat3InstancePublisher
			,TrNetPat15InstancePublisher
			,TrNetPat11InstancePublisher
			,TrNetPat2InstancePublisher
			,TrNetPat12InstancePublisher
			,TrNetPat17InstancePublisher
			,AddTableToDatabaseInstancePublisher
			,TrNetPat45InstancePublisher
			,TrNetPat5InstancePublisher
{
	InputClassesExternalInput inputInputClasses;
	OutputRelationalExternalOutput outputOutputRelational;
	ArrayList<TrNetPat1Instance> trNetPat1Array;
	int newCounterTrNetPat1TrNetOp1;
	HashSet<TrNetPat1Instance> trNetPat1Set; 
		HashMap<ModelNode, LinkedList<TrNetPat1Instance>> cModel0InTrNetPat1Hash;
	ArrayList<TrNetPat2Instance> trNetPat2Array;
	int newCounterTrNetPat2OutputRelational;
	int newCounterTrNetPat2TrNetOp2;
	int newCounterTrNetPat2TrNetOp3;
	int newCounterTrNetPat2TrNetOp4;
	HashSet<TrNetPat2Instance> trNetPat2Set; 
		HashMap<ModelNode, LinkedList<TrNetPat2Instance>> database0InTrNetPat2Hash;
	ArrayList<TrNetPat6Instance> trNetPat6Array;
	int newCounterTrNetPat6TrNetOp5;
	HashSet<TrNetPat6Instance> trNetPat6Set; 
		HashMap<ModelNode, LinkedList<TrNetPat6Instance>> cClass0InTrNetPat6Hash;
	ArrayList<TrNetPat7Instance> trNetPat7Array;
	int newCounterTrNetPat7TrNetOp6;
	int newCounterTrNetPat7TrNetOp24;
	int newCounterTrNetPat7TrNetOp27;
	int newCounterTrNetPat7TrNetOp38;
	int newCounterTrNetPat7TrNetOp26;
	HashSet<TrNetPat7Instance> trNetPat7Set; 
		HashMap<ModelNode, LinkedList<TrNetPat7Instance>> table0InTrNetPat7Hash;
		HashMap<ModelNode, LinkedList<TrNetPat7Instance>> cClass0InTrNetPat7Hash;
	ArrayList<AddTableToDatabaseWithIDInstance> addTableToDatabaseWithIDArray;
	int newCounterAddTableToDatabaseWithIDTrNetOp7;
	int newCounterAddTableToDatabaseWithIDTrNetOp23;
	HashSet<AddTableToDatabaseWithIDInstance> addTableToDatabaseWithIDSet; 
		HashMap<ModelNode, LinkedList<AddTableToDatabaseWithIDInstance>> table0InAddTableToDatabaseWithIDHash;
	ArrayList<TrNetPat3Instance> trNetPat3Array;
	int newCounterTrNetPat3OutputRelational;
	HashSet<TrNetPat3Instance> trNetPat3Set; 
		HashMap<ModelNode, LinkedList<TrNetPat3Instance>> database0InTrNetPat3Hash;
		HashMap<ModelNode, LinkedList<TrNetPat3Instance>> table0InTrNetPat3Hash;
	ArrayList<TrNetPat42Instance> trNetPat42Array;
	int newCounterTrNetPat42TrNetOp24;
	HashSet<TrNetPat42Instance> trNetPat42Set; 
		HashMap<ModelNode, LinkedList<TrNetPat42Instance>> cClass0InTrNetPat42Hash;
		HashMap<ModelNode, LinkedList<TrNetPat42Instance>> cClass1InTrNetPat42Hash;
	ArrayList<TrNetPat22Instance> trNetPat22Array;
	int newCounterTrNetPat22TrNetOp25;
	int newCounterTrNetPat22TrNetOp26;
	HashSet<TrNetPat22Instance> trNetPat22Set; 
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> table0InTrNetPat22Hash;
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> cClass0InTrNetPat22Hash;
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> cClass1InTrNetPat22Hash;
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> column0InTrNetPat22Hash;
	ArrayList<TrNetPat8Instance> trNetPat8Array;
	int newCounterTrNetPat8TrNetOp8;
	HashSet<TrNetPat8Instance> trNetPat8Set; 
		HashMap<ModelNode, LinkedList<TrNetPat8Instance>> table0InTrNetPat8Hash;
		HashMap<ModelNode, LinkedList<TrNetPat8Instance>> column0InTrNetPat8Hash;
	ArrayList<AddIDColumnToDatabaseInstance> addIDColumnToDatabaseArray;
	int newCounterAddIDColumnToDatabaseTrNetOp9;
	int newCounterAddIDColumnToDatabaseTrNetOp12;
	int newCounterAddIDColumnToDatabaseTrNetOp15;
	int newCounterAddIDColumnToDatabaseTrNetOp17;
	int newCounterAddIDColumnToDatabaseTrNetOp19;
	int newCounterAddIDColumnToDatabaseTrNetOp21;
	HashSet<AddIDColumnToDatabaseInstance> addIDColumnToDatabaseSet; 
		HashMap<ModelNode, LinkedList<AddIDColumnToDatabaseInstance>> table0InAddIDColumnToDatabaseHash;
		HashMap<ModelNode, LinkedList<AddIDColumnToDatabaseInstance>> column0InAddIDColumnToDatabaseHash;
	ArrayList<TrNetPat9Instance> trNetPat9Array;
	int newCounterTrNetPat9OutputRelational;
	HashSet<TrNetPat9Instance> trNetPat9Set; 
		HashMap<ModelNode, LinkedList<TrNetPat9Instance>> column0InTrNetPat9Hash;
	ArrayList<TrNetPat10Instance> trNetPat10Array;
	int newCounterTrNetPat10OutputRelational;
	HashSet<TrNetPat10Instance> trNetPat10Set; 
		HashMap<ModelNode, LinkedList<TrNetPat10Instance>> table0InTrNetPat10Hash;
		HashMap<ModelNode, LinkedList<TrNetPat10Instance>> column0InTrNetPat10Hash;
	ArrayList<TrNetPat12Instance> trNetPat12Array;
	int newCounterTrNetPat12OutputRelational;
	HashSet<TrNetPat12Instance> trNetPat12Set; 
		HashMap<ModelNode, LinkedList<TrNetPat12Instance>> table0InTrNetPat12Hash;
		HashMap<ModelNode, LinkedList<TrNetPat12Instance>> column0InTrNetPat12Hash;
	ArrayList<TrNetPat43Instance> trNetPat43Array;
	int newCounterTrNetPat43TrNetOp45;
	HashSet<TrNetPat43Instance> trNetPat43Set; 
		HashMap<ModelNode, LinkedList<TrNetPat43Instance>> datatype0InTrNetPat43Hash;
	ArrayList<TrNetPat44Instance> trNetPat44Array;
	int newCounterTrNetPat44TrNetOp46;
	int newCounterTrNetPat44TrNetOp47;
	int newCounterTrNetPat44TrNetOp29;
	int newCounterTrNetPat44TrNetOp32;
	HashSet<TrNetPat44Instance> trNetPat44Set; 
		HashMap<ModelNode, LinkedList<TrNetPat44Instance>> datatype0InTrNetPat44Hash;
		HashMap<ModelNode, LinkedList<TrNetPat44Instance>> type0InTrNetPat44Hash;
	ArrayList<TrNetPat11Instance> trNetPat11Array;
	int newCounterTrNetPat11OutputRelational;
	HashSet<TrNetPat11Instance> trNetPat11Set; 
		HashMap<ModelNode, LinkedList<TrNetPat11Instance>> column0InTrNetPat11Hash;
		HashMap<ModelNode, LinkedList<TrNetPat11Instance>> type0InTrNetPat11Hash;
	ArrayList<TrNetPat45Instance> trNetPat45Array;
	int newCounterTrNetPat45OutputRelational;
	int newCounterTrNetPat45TrNetOp3;
	HashSet<TrNetPat45Instance> trNetPat45Set; 
		HashMap<ModelNode, LinkedList<TrNetPat45Instance>> type0InTrNetPat45Hash;
	ArrayList<IntegerTypeInstance> integerTypeArray;
	int newCounterIntegerTypeTrNetOp11;
	HashSet<IntegerTypeInstance> integerTypeSet; 
		HashMap<ModelNode, LinkedList<IntegerTypeInstance>> type0InIntegerTypeHash;
	ArrayList<TrNetPat4Instance> trNetPat4Array;
	int newCounterTrNetPat4OutputRelational;
	HashSet<TrNetPat4Instance> trNetPat4Set; 
		HashMap<ModelNode, LinkedList<TrNetPat4Instance>> database0InTrNetPat4Hash;
		HashMap<ModelNode, LinkedList<TrNetPat4Instance>> type0InTrNetPat4Hash;
	ArrayList<TrNetPat46Instance> trNetPat46Array;
	int newCounterTrNetPat46TrNetOp28;
	HashSet<TrNetPat46Instance> trNetPat46Set; 
		HashMap<ModelNode, LinkedList<TrNetPat46Instance>> attribute0InTrNetPat46Hash;
		HashMap<ModelNode, LinkedList<TrNetPat46Instance>> datatype0InTrNetPat46Hash;
	ArrayList<TrNetPat47Instance> trNetPat47Array;
	int newCounterTrNetPat47TrNetOp27;
	HashSet<TrNetPat47Instance> trNetPat47Set; 
		HashMap<ModelNode, LinkedList<TrNetPat47Instance>> cClass0InTrNetPat47Hash;
		HashMap<ModelNode, LinkedList<TrNetPat47Instance>> attribute0InTrNetPat47Hash;
	ArrayList<TrNetPat24Instance> trNetPat24Array;
	int newCounterTrNetPat24TrNetOp28;
	int newCounterTrNetPat24TrNetOp37;
	HashSet<TrNetPat24Instance> trNetPat24Set; 
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> cClass0InTrNetPat24Hash;
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> attribute0InTrNetPat24Hash;
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> table0InTrNetPat24Hash;
	ArrayList<TrNetPat25Instance> trNetPat25Array;
	int newCounterTrNetPat25TrNetOp29;
	int newCounterTrNetPat25TrNetOp32;
	HashSet<TrNetPat25Instance> trNetPat25Set; 
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> cClass0InTrNetPat25Hash;
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> attribute0InTrNetPat25Hash;
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> table0InTrNetPat25Hash;
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> datatype0InTrNetPat25Hash;
	ArrayList<TrNetPat26Instance> trNetPat26Array;
	int newCounterTrNetPat26TrNetOp30;
	HashSet<TrNetPat26Instance> trNetPat26Set; 
		HashMap<ModelNode, LinkedList<TrNetPat26Instance>> table0InTrNetPat26Hash;
		HashMap<ModelNode, LinkedList<TrNetPat26Instance>> type0InTrNetPat26Hash;
		HashMap<ModelNode, LinkedList<TrNetPat26Instance>> column0InTrNetPat26Hash;
	ArrayList<TrNetPat28Instance> trNetPat28Array;
	int newCounterTrNetPat28TrNetOp33;
	int newCounterTrNetPat28TrNetOp35;
	HashSet<TrNetPat28Instance> trNetPat28Set; 
		HashMap<ModelNode, LinkedList<TrNetPat28Instance>> table0InTrNetPat28Hash;
		HashMap<ModelNode, LinkedList<TrNetPat28Instance>> type0InTrNetPat28Hash;
		HashMap<ModelNode, LinkedList<TrNetPat28Instance>> column0InTrNetPat28Hash;
	ArrayList<TrNetPat27Instance> trNetPat27Array;
	int newCounterTrNetPat27TrNetOp31;
	HashSet<TrNetPat27Instance> trNetPat27Set; 
		HashMap<ModelNode, LinkedList<TrNetPat27Instance>> table0InTrNetPat27Hash;
		HashMap<ModelNode, LinkedList<TrNetPat27Instance>> type0InTrNetPat27Hash;
		HashMap<ModelNode, LinkedList<TrNetPat27Instance>> column0InTrNetPat27Hash;
	ArrayList<TrNetPat31Instance> trNetPat31Array;
	int newCounterTrNetPat31TrNetOp35;
	HashSet<TrNetPat31Instance> trNetPat31Set; 
		HashMap<ModelNode, LinkedList<TrNetPat31Instance>> column0InTrNetPat31Hash;
	ArrayList<TrNetPat30Instance> trNetPat30Array;
	int newCounterTrNetPat30TrNetOp36;
	int newCounterTrNetPat30TrNetOp16;
	HashSet<TrNetPat30Instance> trNetPat30Set; 
		HashMap<ModelNode, LinkedList<TrNetPat30Instance>> column0InTrNetPat30Hash;
		HashMap<ModelNode, LinkedList<TrNetPat30Instance>> table0InTrNetPat30Hash;
	ArrayList<TrNetPat48Instance> trNetPat48Array;
	int newCounterTrNetPat48TrNetOp37;
	HashSet<TrNetPat48Instance> trNetPat48Set; 
		HashMap<ModelNode, LinkedList<TrNetPat48Instance>> attribute0InTrNetPat48Hash;
		HashMap<ModelNode, LinkedList<TrNetPat48Instance>> cClass0InTrNetPat48Hash;
	ArrayList<TrNetPat33Instance> trNetPat33Array;
	int newCounterTrNetPat33TrNetOp38;
	HashSet<TrNetPat33Instance> trNetPat33Set; 
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> cClass0InTrNetPat33Hash;
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> attribute0InTrNetPat33Hash;
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> table0InTrNetPat33Hash;
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> cClass1InTrNetPat33Hash;
	ArrayList<TrNetPat34Instance> trNetPat34Array;
	int newCounterTrNetPat34TrNetOp39;
	int newCounterTrNetPat34TrNetOp41;
	HashSet<TrNetPat34Instance> trNetPat34Set; 
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> cClass0InTrNetPat34Hash;
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> attribute0InTrNetPat34Hash;
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> table0InTrNetPat34Hash;
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> cClass1InTrNetPat34Hash;
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> table1InTrNetPat34Hash;
	ArrayList<TrNetPat35Instance> trNetPat35Array;
	int newCounterTrNetPat35TrNetOp40;
	int newCounterTrNetPat35TrNetOp18;
	HashSet<TrNetPat35Instance> trNetPat35Set; 
		HashMap<ModelNode, LinkedList<TrNetPat35Instance>> table0InTrNetPat35Hash;
		HashMap<ModelNode, LinkedList<TrNetPat35Instance>> column0InTrNetPat35Hash;
	ArrayList<AddIntegerColumnToDatabaseInstance> addIntegerColumnToDatabaseArray;
	int newCounterAddIntegerColumnToDatabaseTrNetOp10;
	int newCounterAddIntegerColumnToDatabaseTrNetOp11;
	HashSet<AddIntegerColumnToDatabaseInstance> addIntegerColumnToDatabaseSet; 
		HashMap<ModelNode, LinkedList<AddIntegerColumnToDatabaseInstance>> table0InAddIntegerColumnToDatabaseHash;
		HashMap<ModelNode, LinkedList<AddIntegerColumnToDatabaseInstance>> column0InAddIntegerColumnToDatabaseHash;
	ArrayList<TrNetPat37Instance> trNetPat37Array;
	int newCounterTrNetPat37TrNetOp42;
	HashSet<TrNetPat37Instance> trNetPat37Set; 
		HashMap<ModelNode, LinkedList<TrNetPat37Instance>> table0InTrNetPat37Hash;
		HashMap<ModelNode, LinkedList<TrNetPat37Instance>> column0InTrNetPat37Hash;
		HashMap<ModelNode, LinkedList<TrNetPat37Instance>> column1InTrNetPat37Hash;
	ArrayList<TrNetPat38Instance> trNetPat38Array;
	int newCounterTrNetPat38TrNetOp43;
	int newCounterTrNetPat38TrNetOp20;
	HashSet<TrNetPat38Instance> trNetPat38Set; 
		HashMap<ModelNode, LinkedList<TrNetPat38Instance>> table0InTrNetPat38Hash;
		HashMap<ModelNode, LinkedList<TrNetPat38Instance>> column0InTrNetPat38Hash;
	ArrayList<TrNetPat39Instance> trNetPat39Array;
	int newCounterTrNetPat39TrNetOp44;
	int newCounterTrNetPat39TrNetOp22;
	HashSet<TrNetPat39Instance> trNetPat39Set; 
		HashMap<ModelNode, LinkedList<TrNetPat39Instance>> table0InTrNetPat39Hash;
		HashMap<ModelNode, LinkedList<TrNetPat39Instance>> column0InTrNetPat39Hash;
	ArrayList<AddTableToDatabaseInstance> addTableToDatabaseArray;
	int newCounterAddTableToDatabaseOutputRelational;
	int newCounterAddTableToDatabaseTrNetOp2;
	HashSet<AddTableToDatabaseInstance> addTableToDatabaseSet; 
		HashMap<ModelNode, LinkedList<AddTableToDatabaseInstance>> table0InAddTableToDatabaseHash;
	ArrayList<TrNetPat29Instance> trNetPat29Array;
	int newCounterTrNetPat29TrNetOp34;
	HashSet<TrNetPat29Instance> trNetPat29Set; 
		HashMap<ModelNode, LinkedList<TrNetPat29Instance>> table0InTrNetPat29Hash;
		HashMap<ModelNode, LinkedList<TrNetPat29Instance>> column0InTrNetPat29Hash;
	ArrayList<TrNetPat14Instance> trNetPat14Array;
	int newCounterTrNetPat14TrNetOp14;
	HashSet<TrNetPat14Instance> trNetPat14Set; 
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> column0InTrNetPat14Hash;
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> column1InTrNetPat14Hash;
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> foreignKey0InTrNetPat14Hash;
	ArrayList<TrNetPat18Instance> trNetPat18Array;
	int newCounterTrNetPat18TrNetOp16;
	HashSet<TrNetPat18Instance> trNetPat18Set; 
		HashMap<ModelNode, LinkedList<TrNetPat18Instance>> column0InTrNetPat18Hash;
		HashMap<ModelNode, LinkedList<TrNetPat18Instance>> table0InTrNetPat18Hash;
	ArrayList<TrNetPat32Instance> trNetPat32Array;
	int newCounterTrNetPat32TrNetOp15;
	HashSet<TrNetPat32Instance> trNetPat32Set; 
		HashMap<ModelNode, LinkedList<TrNetPat32Instance>> table0InTrNetPat32Hash;
	ArrayList<TrNetPat16Instance> trNetPat16Array;
	int newCounterTrNetPat16OutputRelational;
	HashSet<TrNetPat16Instance> trNetPat16Set; 
		HashMap<ModelNode, LinkedList<TrNetPat16Instance>> column0InTrNetPat16Hash;
		HashMap<ModelNode, LinkedList<TrNetPat16Instance>> foreignKey0InTrNetPat16Hash;
	ArrayList<TrNetPat15Instance> trNetPat15Array;
	int newCounterTrNetPat15OutputRelational;
	HashSet<TrNetPat15Instance> trNetPat15Set; 
		HashMap<ModelNode, LinkedList<TrNetPat15Instance>> column0InTrNetPat15Hash;
		HashMap<ModelNode, LinkedList<TrNetPat15Instance>> foreignKey0InTrNetPat15Hash;
	ArrayList<TrNetPat5Instance> trNetPat5Array;
	int newCounterTrNetPat5OutputRelational;
	HashSet<TrNetPat5Instance> trNetPat5Set; 
		HashMap<ModelNode, LinkedList<TrNetPat5Instance>> foreignKey0InTrNetPat5Hash;
		HashMap<ModelNode, LinkedList<TrNetPat5Instance>> database0InTrNetPat5Hash;
	ArrayList<TrNetPat17Instance> trNetPat17Array;
	int newCounterTrNetPat17TrNetOp4;
	int newCounterTrNetPat17OutputRelational;
	HashSet<TrNetPat17Instance> trNetPat17Set; 
		HashMap<ModelNode, LinkedList<TrNetPat17Instance>> foreignKey0InTrNetPat17Hash;
	ArrayList<TrNetPat23Instance> trNetPat23Array;
	int newCounterTrNetPat23TrNetOp12;
	HashSet<TrNetPat23Instance> trNetPat23Set; 
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> table0InTrNetPat23Hash;
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> cClass0InTrNetPat23Hash;
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> cClass1InTrNetPat23Hash;
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> column0InTrNetPat23Hash;
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> table1InTrNetPat23Hash;
	ArrayList<TrNetPat13Instance> trNetPat13Array;
	int newCounterTrNetPat13TrNetOp13;
	HashSet<TrNetPat13Instance> trNetPat13Set; 
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> table0InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> cClass0InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> cClass1InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> column0InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> table1InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> column1InTrNetPat13Hash;
	ArrayList<TrNetPat36Instance> trNetPat36Array;
	int newCounterTrNetPat36TrNetOp17;
	HashSet<TrNetPat36Instance> trNetPat36Set; 
		HashMap<ModelNode, LinkedList<TrNetPat36Instance>> table0InTrNetPat36Hash;
	ArrayList<TrNetPat19Instance> trNetPat19Array;
	int newCounterTrNetPat19TrNetOp18;
	HashSet<TrNetPat19Instance> trNetPat19Set; 
		HashMap<ModelNode, LinkedList<TrNetPat19Instance>> table0InTrNetPat19Hash;
		HashMap<ModelNode, LinkedList<TrNetPat19Instance>> column0InTrNetPat19Hash;
	ArrayList<TrNetPat40Instance> trNetPat40Array;
	int newCounterTrNetPat40TrNetOp21;
	HashSet<TrNetPat40Instance> trNetPat40Set; 
		HashMap<ModelNode, LinkedList<TrNetPat40Instance>> table0InTrNetPat40Hash;
	ArrayList<TrNetPat41Instance> trNetPat41Array;
	int newCounterTrNetPat41TrNetOp19;
	HashSet<TrNetPat41Instance> trNetPat41Set; 
		HashMap<ModelNode, LinkedList<TrNetPat41Instance>> table0InTrNetPat41Hash;
	ArrayList<TrNetPat20Instance> trNetPat20Array;
	int newCounterTrNetPat20TrNetOp20;
	HashSet<TrNetPat20Instance> trNetPat20Set; 
		HashMap<ModelNode, LinkedList<TrNetPat20Instance>> table0InTrNetPat20Hash;
		HashMap<ModelNode, LinkedList<TrNetPat20Instance>> column0InTrNetPat20Hash;
	ArrayList<TrNetPat21Instance> trNetPat21Array;
	int newCounterTrNetPat21TrNetOp22;
	HashSet<TrNetPat21Instance> trNetPat21Set; 
		HashMap<ModelNode, LinkedList<TrNetPat21Instance>> table0InTrNetPat21Hash;
		HashMap<ModelNode, LinkedList<TrNetPat21Instance>> column0InTrNetPat21Hash;
	
	public Class2RelationalOriginalTransformation(){
		
	trNetPat1Array = new ArrayList<TrNetPat1Instance>(1); 
	newCounterTrNetPat1TrNetOp1 = 0;
	trNetPat1Set = new HashSet<TrNetPat1Instance>(1); 
		cModel0InTrNetPat1Hash = new HashMap<ModelNode, LinkedList<TrNetPat1Instance>>(1);
	trNetPat2Array = new ArrayList<TrNetPat2Instance>(1); 
	newCounterTrNetPat2OutputRelational = 0;
	newCounterTrNetPat2TrNetOp2 = 0;
	newCounterTrNetPat2TrNetOp3 = 0;
	newCounterTrNetPat2TrNetOp4 = 0;
	trNetPat2Set = new HashSet<TrNetPat2Instance>(1); 
		database0InTrNetPat2Hash = new HashMap<ModelNode, LinkedList<TrNetPat2Instance>>(1);
	trNetPat6Array = new ArrayList<TrNetPat6Instance>(52); 
	newCounterTrNetPat6TrNetOp5 = 0;
	trNetPat6Set = new HashSet<TrNetPat6Instance>(52); 
		cClass0InTrNetPat6Hash = new HashMap<ModelNode, LinkedList<TrNetPat6Instance>>(52);
	trNetPat7Array = new ArrayList<TrNetPat7Instance>(52); 
	newCounterTrNetPat7TrNetOp6 = 0;
	newCounterTrNetPat7TrNetOp24 = 0;
	newCounterTrNetPat7TrNetOp27 = 0;
	newCounterTrNetPat7TrNetOp38 = 0;
	newCounterTrNetPat7TrNetOp26 = 0;
	trNetPat7Set = new HashSet<TrNetPat7Instance>(52); 
		table0InTrNetPat7Hash = new HashMap<ModelNode, LinkedList<TrNetPat7Instance>>(52);
		cClass0InTrNetPat7Hash = new HashMap<ModelNode, LinkedList<TrNetPat7Instance>>(52);
	addTableToDatabaseWithIDArray = new ArrayList<AddTableToDatabaseWithIDInstance>(52); 
	newCounterAddTableToDatabaseWithIDTrNetOp7 = 0;
	newCounterAddTableToDatabaseWithIDTrNetOp23 = 0;
	addTableToDatabaseWithIDSet = new HashSet<AddTableToDatabaseWithIDInstance>(52); 
		table0InAddTableToDatabaseWithIDHash = new HashMap<ModelNode, LinkedList<AddTableToDatabaseWithIDInstance>>(52);
	trNetPat3Array = new ArrayList<TrNetPat3Instance>(52); 
	newCounterTrNetPat3OutputRelational = 0;
	trNetPat3Set = new HashSet<TrNetPat3Instance>(52); 
		database0InTrNetPat3Hash = new HashMap<ModelNode, LinkedList<TrNetPat3Instance>>(52);
		table0InTrNetPat3Hash = new HashMap<ModelNode, LinkedList<TrNetPat3Instance>>(52);
	trNetPat42Array = new ArrayList<TrNetPat42Instance>(29); 
	newCounterTrNetPat42TrNetOp24 = 0;
	trNetPat42Set = new HashSet<TrNetPat42Instance>(29); 
		cClass0InTrNetPat42Hash = new HashMap<ModelNode, LinkedList<TrNetPat42Instance>>(29);
		cClass1InTrNetPat42Hash = new HashMap<ModelNode, LinkedList<TrNetPat42Instance>>(29);
	trNetPat22Array = new ArrayList<TrNetPat22Instance>(29); 
	newCounterTrNetPat22TrNetOp25 = 0;
	newCounterTrNetPat22TrNetOp26 = 0;
	trNetPat22Set = new HashSet<TrNetPat22Instance>(29); 
		table0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(29);
		cClass0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(29);
		cClass1InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(29);
		column0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(29);
	trNetPat8Array = new ArrayList<TrNetPat8Instance>(52); 
	newCounterTrNetPat8TrNetOp8 = 0;
	trNetPat8Set = new HashSet<TrNetPat8Instance>(52); 
		table0InTrNetPat8Hash = new HashMap<ModelNode, LinkedList<TrNetPat8Instance>>(52);
		column0InTrNetPat8Hash = new HashMap<ModelNode, LinkedList<TrNetPat8Instance>>(52);
	addIDColumnToDatabaseArray = new ArrayList<AddIDColumnToDatabaseInstance>(52); 
	newCounterAddIDColumnToDatabaseTrNetOp9 = 0;
	newCounterAddIDColumnToDatabaseTrNetOp12 = 0;
	newCounterAddIDColumnToDatabaseTrNetOp15 = 0;
	newCounterAddIDColumnToDatabaseTrNetOp17 = 0;
	newCounterAddIDColumnToDatabaseTrNetOp19 = 0;
	newCounterAddIDColumnToDatabaseTrNetOp21 = 0;
	addIDColumnToDatabaseSet = new HashSet<AddIDColumnToDatabaseInstance>(52); 
		table0InAddIDColumnToDatabaseHash = new HashMap<ModelNode, LinkedList<AddIDColumnToDatabaseInstance>>(52);
		column0InAddIDColumnToDatabaseHash = new HashMap<ModelNode, LinkedList<AddIDColumnToDatabaseInstance>>(52);
	trNetPat9Array = new ArrayList<TrNetPat9Instance>(52); 
	newCounterTrNetPat9OutputRelational = 0;
	trNetPat9Set = new HashSet<TrNetPat9Instance>(52); 
		column0InTrNetPat9Hash = new HashMap<ModelNode, LinkedList<TrNetPat9Instance>>(52);
	trNetPat10Array = new ArrayList<TrNetPat10Instance>(576); 
	newCounterTrNetPat10OutputRelational = 0;
	trNetPat10Set = new HashSet<TrNetPat10Instance>(576); 
		table0InTrNetPat10Hash = new HashMap<ModelNode, LinkedList<TrNetPat10Instance>>(576);
		column0InTrNetPat10Hash = new HashMap<ModelNode, LinkedList<TrNetPat10Instance>>(576);
	trNetPat12Array = new ArrayList<TrNetPat12Instance>(52); 
	newCounterTrNetPat12OutputRelational = 0;
	trNetPat12Set = new HashSet<TrNetPat12Instance>(52); 
		table0InTrNetPat12Hash = new HashMap<ModelNode, LinkedList<TrNetPat12Instance>>(52);
		column0InTrNetPat12Hash = new HashMap<ModelNode, LinkedList<TrNetPat12Instance>>(52);
	trNetPat43Array = new ArrayList<TrNetPat43Instance>(48); 
	newCounterTrNetPat43TrNetOp45 = 0;
	trNetPat43Set = new HashSet<TrNetPat43Instance>(48); 
		datatype0InTrNetPat43Hash = new HashMap<ModelNode, LinkedList<TrNetPat43Instance>>(48);
	trNetPat44Array = new ArrayList<TrNetPat44Instance>(48); 
	newCounterTrNetPat44TrNetOp46 = 0;
	newCounterTrNetPat44TrNetOp47 = 0;
	newCounterTrNetPat44TrNetOp29 = 0;
	newCounterTrNetPat44TrNetOp32 = 0;
	trNetPat44Set = new HashSet<TrNetPat44Instance>(48); 
		datatype0InTrNetPat44Hash = new HashMap<ModelNode, LinkedList<TrNetPat44Instance>>(48);
		type0InTrNetPat44Hash = new HashMap<ModelNode, LinkedList<TrNetPat44Instance>>(48);
	trNetPat11Array = new ArrayList<TrNetPat11Instance>(52); 
	newCounterTrNetPat11OutputRelational = 0;
	trNetPat11Set = new HashSet<TrNetPat11Instance>(52); 
		column0InTrNetPat11Hash = new HashMap<ModelNode, LinkedList<TrNetPat11Instance>>(52);
		type0InTrNetPat11Hash = new HashMap<ModelNode, LinkedList<TrNetPat11Instance>>(52);
	trNetPat45Array = new ArrayList<TrNetPat45Instance>(48); 
	newCounterTrNetPat45OutputRelational = 0;
	newCounterTrNetPat45TrNetOp3 = 0;
	trNetPat45Set = new HashSet<TrNetPat45Instance>(48); 
		type0InTrNetPat45Hash = new HashMap<ModelNode, LinkedList<TrNetPat45Instance>>(48);
	integerTypeArray = new ArrayList<IntegerTypeInstance>(1); 
	newCounterIntegerTypeTrNetOp11 = 0;
	integerTypeSet = new HashSet<IntegerTypeInstance>(1); 
		type0InIntegerTypeHash = new HashMap<ModelNode, LinkedList<IntegerTypeInstance>>(1);
	trNetPat4Array = new ArrayList<TrNetPat4Instance>(48); 
	newCounterTrNetPat4OutputRelational = 0;
	trNetPat4Set = new HashSet<TrNetPat4Instance>(48); 
		database0InTrNetPat4Hash = new HashMap<ModelNode, LinkedList<TrNetPat4Instance>>(48);
		type0InTrNetPat4Hash = new HashMap<ModelNode, LinkedList<TrNetPat4Instance>>(48);
	trNetPat46Array = new ArrayList<TrNetPat46Instance>(48); 
	newCounterTrNetPat46TrNetOp28 = 0;
	trNetPat46Set = new HashSet<TrNetPat46Instance>(48); 
		attribute0InTrNetPat46Hash = new HashMap<ModelNode, LinkedList<TrNetPat46Instance>>(48);
		datatype0InTrNetPat46Hash = new HashMap<ModelNode, LinkedList<TrNetPat46Instance>>(48);
	trNetPat47Array = new ArrayList<TrNetPat47Instance>(100); 
	newCounterTrNetPat47TrNetOp27 = 0;
	trNetPat47Set = new HashSet<TrNetPat47Instance>(100); 
		cClass0InTrNetPat47Hash = new HashMap<ModelNode, LinkedList<TrNetPat47Instance>>(100);
		attribute0InTrNetPat47Hash = new HashMap<ModelNode, LinkedList<TrNetPat47Instance>>(100);
	trNetPat24Array = new ArrayList<TrNetPat24Instance>(100); 
	newCounterTrNetPat24TrNetOp28 = 0;
	newCounterTrNetPat24TrNetOp37 = 0;
	trNetPat24Set = new HashSet<TrNetPat24Instance>(100); 
		cClass0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(100);
		attribute0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(100);
		table0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(100);
	trNetPat25Array = new ArrayList<TrNetPat25Instance>(48); 
	newCounterTrNetPat25TrNetOp29 = 0;
	newCounterTrNetPat25TrNetOp32 = 0;
	trNetPat25Set = new HashSet<TrNetPat25Instance>(48); 
		cClass0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(48);
		attribute0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(48);
		table0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(48);
		datatype0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(48);
	trNetPat26Array = new ArrayList<TrNetPat26Instance>(24); 
	newCounterTrNetPat26TrNetOp30 = 0;
	trNetPat26Set = new HashSet<TrNetPat26Instance>(24); 
		table0InTrNetPat26Hash = new HashMap<ModelNode, LinkedList<TrNetPat26Instance>>(24);
		type0InTrNetPat26Hash = new HashMap<ModelNode, LinkedList<TrNetPat26Instance>>(24);
		column0InTrNetPat26Hash = new HashMap<ModelNode, LinkedList<TrNetPat26Instance>>(24);
	trNetPat28Array = new ArrayList<TrNetPat28Instance>(24); 
	newCounterTrNetPat28TrNetOp33 = 0;
	newCounterTrNetPat28TrNetOp35 = 0;
	trNetPat28Set = new HashSet<TrNetPat28Instance>(24); 
		table0InTrNetPat28Hash = new HashMap<ModelNode, LinkedList<TrNetPat28Instance>>(24);
		type0InTrNetPat28Hash = new HashMap<ModelNode, LinkedList<TrNetPat28Instance>>(24);
		column0InTrNetPat28Hash = new HashMap<ModelNode, LinkedList<TrNetPat28Instance>>(24);
	trNetPat27Array = new ArrayList<TrNetPat27Instance>(24); 
	newCounterTrNetPat27TrNetOp31 = 0;
	trNetPat27Set = new HashSet<TrNetPat27Instance>(24); 
		table0InTrNetPat27Hash = new HashMap<ModelNode, LinkedList<TrNetPat27Instance>>(24);
		type0InTrNetPat27Hash = new HashMap<ModelNode, LinkedList<TrNetPat27Instance>>(24);
		column0InTrNetPat27Hash = new HashMap<ModelNode, LinkedList<TrNetPat27Instance>>(24);
	trNetPat31Array = new ArrayList<TrNetPat31Instance>(24); 
	newCounterTrNetPat31TrNetOp35 = 0;
	trNetPat31Set = new HashSet<TrNetPat31Instance>(24); 
		column0InTrNetPat31Hash = new HashMap<ModelNode, LinkedList<TrNetPat31Instance>>(24);
	trNetPat30Array = new ArrayList<TrNetPat30Instance>(576); 
	newCounterTrNetPat30TrNetOp36 = 0;
	newCounterTrNetPat30TrNetOp16 = 0;
	trNetPat30Set = new HashSet<TrNetPat30Instance>(576); 
		column0InTrNetPat30Hash = new HashMap<ModelNode, LinkedList<TrNetPat30Instance>>(576);
		table0InTrNetPat30Hash = new HashMap<ModelNode, LinkedList<TrNetPat30Instance>>(576);
	trNetPat48Array = new ArrayList<TrNetPat48Instance>(52); 
	newCounterTrNetPat48TrNetOp37 = 0;
	trNetPat48Set = new HashSet<TrNetPat48Instance>(52); 
		attribute0InTrNetPat48Hash = new HashMap<ModelNode, LinkedList<TrNetPat48Instance>>(52);
		cClass0InTrNetPat48Hash = new HashMap<ModelNode, LinkedList<TrNetPat48Instance>>(52);
	trNetPat33Array = new ArrayList<TrNetPat33Instance>(52); 
	newCounterTrNetPat33TrNetOp38 = 0;
	trNetPat33Set = new HashSet<TrNetPat33Instance>(52); 
		cClass0InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(52);
		attribute0InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(52);
		table0InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(52);
		cClass1InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(52);
	trNetPat34Array = new ArrayList<TrNetPat34Instance>(52); 
	newCounterTrNetPat34TrNetOp39 = 0;
	newCounterTrNetPat34TrNetOp41 = 0;
	trNetPat34Set = new HashSet<TrNetPat34Instance>(52); 
		cClass0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(52);
		attribute0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(52);
		table0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(52);
		cClass1InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(52);
		table1InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(52);
	trNetPat35Array = new ArrayList<TrNetPat35Instance>(26); 
	newCounterTrNetPat35TrNetOp40 = 0;
	newCounterTrNetPat35TrNetOp18 = 0;
	trNetPat35Set = new HashSet<TrNetPat35Instance>(26); 
		table0InTrNetPat35Hash = new HashMap<ModelNode, LinkedList<TrNetPat35Instance>>(26);
		column0InTrNetPat35Hash = new HashMap<ModelNode, LinkedList<TrNetPat35Instance>>(26);
	addIntegerColumnToDatabaseArray = new ArrayList<AddIntegerColumnToDatabaseInstance>(576); 
	newCounterAddIntegerColumnToDatabaseTrNetOp10 = 0;
	newCounterAddIntegerColumnToDatabaseTrNetOp11 = 0;
	addIntegerColumnToDatabaseSet = new HashSet<AddIntegerColumnToDatabaseInstance>(576); 
		table0InAddIntegerColumnToDatabaseHash = new HashMap<ModelNode, LinkedList<AddIntegerColumnToDatabaseInstance>>(576);
		column0InAddIntegerColumnToDatabaseHash = new HashMap<ModelNode, LinkedList<AddIntegerColumnToDatabaseInstance>>(576);
	trNetPat37Array = new ArrayList<TrNetPat37Instance>(26); 
	newCounterTrNetPat37TrNetOp42 = 0;
	trNetPat37Set = new HashSet<TrNetPat37Instance>(26); 
		table0InTrNetPat37Hash = new HashMap<ModelNode, LinkedList<TrNetPat37Instance>>(26);
		column0InTrNetPat37Hash = new HashMap<ModelNode, LinkedList<TrNetPat37Instance>>(26);
		column1InTrNetPat37Hash = new HashMap<ModelNode, LinkedList<TrNetPat37Instance>>(26);
	trNetPat38Array = new ArrayList<TrNetPat38Instance>(26); 
	newCounterTrNetPat38TrNetOp43 = 0;
	newCounterTrNetPat38TrNetOp20 = 0;
	trNetPat38Set = new HashSet<TrNetPat38Instance>(26); 
		table0InTrNetPat38Hash = new HashMap<ModelNode, LinkedList<TrNetPat38Instance>>(26);
		column0InTrNetPat38Hash = new HashMap<ModelNode, LinkedList<TrNetPat38Instance>>(26);
	trNetPat39Array = new ArrayList<TrNetPat39Instance>(26); 
	newCounterTrNetPat39TrNetOp44 = 0;
	newCounterTrNetPat39TrNetOp22 = 0;
	trNetPat39Set = new HashSet<TrNetPat39Instance>(26); 
		table0InTrNetPat39Hash = new HashMap<ModelNode, LinkedList<TrNetPat39Instance>>(26);
		column0InTrNetPat39Hash = new HashMap<ModelNode, LinkedList<TrNetPat39Instance>>(26);
	addTableToDatabaseArray = new ArrayList<AddTableToDatabaseInstance>(52); 
	newCounterAddTableToDatabaseOutputRelational = 0;
	newCounterAddTableToDatabaseTrNetOp2 = 0;
	addTableToDatabaseSet = new HashSet<AddTableToDatabaseInstance>(52); 
		table0InAddTableToDatabaseHash = new HashMap<ModelNode, LinkedList<AddTableToDatabaseInstance>>(52);
	trNetPat29Array = new ArrayList<TrNetPat29Instance>(24); 
	newCounterTrNetPat29TrNetOp34 = 0;
	trNetPat29Set = new HashSet<TrNetPat29Instance>(24); 
		table0InTrNetPat29Hash = new HashMap<ModelNode, LinkedList<TrNetPat29Instance>>(24);
		column0InTrNetPat29Hash = new HashMap<ModelNode, LinkedList<TrNetPat29Instance>>(24);
	trNetPat14Array = new ArrayList<TrNetPat14Instance>(13824); 
	newCounterTrNetPat14TrNetOp14 = 0;
	trNetPat14Set = new HashSet<TrNetPat14Instance>(13824); 
		column0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(13824);
		column1InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(13824);
		foreignKey0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(13824);
	trNetPat18Array = new ArrayList<TrNetPat18Instance>(24); 
	newCounterTrNetPat18TrNetOp16 = 0;
	trNetPat18Set = new HashSet<TrNetPat18Instance>(24); 
		column0InTrNetPat18Hash = new HashMap<ModelNode, LinkedList<TrNetPat18Instance>>(24);
		table0InTrNetPat18Hash = new HashMap<ModelNode, LinkedList<TrNetPat18Instance>>(24);
	trNetPat32Array = new ArrayList<TrNetPat32Instance>(24); 
	newCounterTrNetPat32TrNetOp15 = 0;
	trNetPat32Set = new HashSet<TrNetPat32Instance>(24); 
		table0InTrNetPat32Hash = new HashMap<ModelNode, LinkedList<TrNetPat32Instance>>(24);
	trNetPat16Array = new ArrayList<TrNetPat16Instance>(13824); 
	newCounterTrNetPat16OutputRelational = 0;
	trNetPat16Set = new HashSet<TrNetPat16Instance>(13824); 
		column0InTrNetPat16Hash = new HashMap<ModelNode, LinkedList<TrNetPat16Instance>>(13824);
		foreignKey0InTrNetPat16Hash = new HashMap<ModelNode, LinkedList<TrNetPat16Instance>>(13824);
	trNetPat15Array = new ArrayList<TrNetPat15Instance>(13824); 
	newCounterTrNetPat15OutputRelational = 0;
	trNetPat15Set = new HashSet<TrNetPat15Instance>(13824); 
		column0InTrNetPat15Hash = new HashMap<ModelNode, LinkedList<TrNetPat15Instance>>(13824);
		foreignKey0InTrNetPat15Hash = new HashMap<ModelNode, LinkedList<TrNetPat15Instance>>(13824);
	trNetPat5Array = new ArrayList<TrNetPat5Instance>(13824); 
	newCounterTrNetPat5OutputRelational = 0;
	trNetPat5Set = new HashSet<TrNetPat5Instance>(13824); 
		foreignKey0InTrNetPat5Hash = new HashMap<ModelNode, LinkedList<TrNetPat5Instance>>(13824);
		database0InTrNetPat5Hash = new HashMap<ModelNode, LinkedList<TrNetPat5Instance>>(13824);
	trNetPat17Array = new ArrayList<TrNetPat17Instance>(13824); 
	newCounterTrNetPat17TrNetOp4 = 0;
	newCounterTrNetPat17OutputRelational = 0;
	trNetPat17Set = new HashSet<TrNetPat17Instance>(13824); 
		foreignKey0InTrNetPat17Hash = new HashMap<ModelNode, LinkedList<TrNetPat17Instance>>(13824);
	trNetPat23Array = new ArrayList<TrNetPat23Instance>(29); 
	newCounterTrNetPat23TrNetOp12 = 0;
	trNetPat23Set = new HashSet<TrNetPat23Instance>(29); 
		table0InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(29);
		cClass0InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(29);
		cClass1InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(29);
		column0InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(29);
		table1InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(29);
	trNetPat13Array = new ArrayList<TrNetPat13Instance>(29); 
	newCounterTrNetPat13TrNetOp13 = 0;
	trNetPat13Set = new HashSet<TrNetPat13Instance>(29); 
		table0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(29);
		cClass0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(29);
		cClass1InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(29);
		column0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(29);
		table1InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(29);
		column1InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(29);
	trNetPat36Array = new ArrayList<TrNetPat36Instance>(26); 
	newCounterTrNetPat36TrNetOp17 = 0;
	trNetPat36Set = new HashSet<TrNetPat36Instance>(26); 
		table0InTrNetPat36Hash = new HashMap<ModelNode, LinkedList<TrNetPat36Instance>>(26);
	trNetPat19Array = new ArrayList<TrNetPat19Instance>(26); 
	newCounterTrNetPat19TrNetOp18 = 0;
	trNetPat19Set = new HashSet<TrNetPat19Instance>(26); 
		table0InTrNetPat19Hash = new HashMap<ModelNode, LinkedList<TrNetPat19Instance>>(26);
		column0InTrNetPat19Hash = new HashMap<ModelNode, LinkedList<TrNetPat19Instance>>(26);
	trNetPat40Array = new ArrayList<TrNetPat40Instance>(26); 
	newCounterTrNetPat40TrNetOp21 = 0;
	trNetPat40Set = new HashSet<TrNetPat40Instance>(26); 
		table0InTrNetPat40Hash = new HashMap<ModelNode, LinkedList<TrNetPat40Instance>>(26);
	trNetPat41Array = new ArrayList<TrNetPat41Instance>(26); 
	newCounterTrNetPat41TrNetOp19 = 0;
	trNetPat41Set = new HashSet<TrNetPat41Instance>(26); 
		table0InTrNetPat41Hash = new HashMap<ModelNode, LinkedList<TrNetPat41Instance>>(26);
	trNetPat20Array = new ArrayList<TrNetPat20Instance>(26); 
	newCounterTrNetPat20TrNetOp20 = 0;
	trNetPat20Set = new HashSet<TrNetPat20Instance>(26); 
		table0InTrNetPat20Hash = new HashMap<ModelNode, LinkedList<TrNetPat20Instance>>(26);
		column0InTrNetPat20Hash = new HashMap<ModelNode, LinkedList<TrNetPat20Instance>>(26);
	trNetPat21Array = new ArrayList<TrNetPat21Instance>(26); 
	newCounterTrNetPat21TrNetOp22 = 0;
	trNetPat21Set = new HashSet<TrNetPat21Instance>(26); 
		table0InTrNetPat21Hash = new HashMap<ModelNode, LinkedList<TrNetPat21Instance>>(26);
		column0InTrNetPat21Hash = new HashMap<ModelNode, LinkedList<TrNetPat21Instance>>(26);
		
	listenersTrNetPat16Instance = new LinkedList<TrNetPat16InstanceListener>();
	listenersTrNetPat4Instance = new LinkedList<TrNetPat4InstanceListener>();
	listenersTrNetPat10Instance = new LinkedList<TrNetPat10InstanceListener>();
	listenersTrNetPat9Instance = new LinkedList<TrNetPat9InstanceListener>();
	listenersTrNetPat3Instance = new LinkedList<TrNetPat3InstanceListener>();
	listenersTrNetPat15Instance = new LinkedList<TrNetPat15InstanceListener>();
	listenersTrNetPat11Instance = new LinkedList<TrNetPat11InstanceListener>();
	listenersTrNetPat2Instance = new LinkedList<TrNetPat2InstanceListener>();
	listenersTrNetPat12Instance = new LinkedList<TrNetPat12InstanceListener>();
	listenersTrNetPat17Instance = new LinkedList<TrNetPat17InstanceListener>();
	listenersAddTableToDatabaseInstance = new LinkedList<AddTableToDatabaseInstanceListener>();
	listenersTrNetPat45Instance = new LinkedList<TrNetPat45InstanceListener>();
	listenersTrNetPat5Instance = new LinkedList<TrNetPat5InstanceListener>();
		
		
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
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp45();
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp3();
	executeOperatorTrNetOp5();
	executeOperatorTrNetOp24();
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp6();
	executeOperatorTrNetOp23();
	executeOperatorTrNetOp7();
	executeOperatorTrNetOp8();
	executeOperatorTrNetOp26();
	executeOperatorTrNetOp27();
	executeOperatorTrNetOp28();
	executeOperatorTrNetOp29();
	executeOperatorTrNetOp37();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp39();
	executeOperatorTrNetOp41();
	executeOperatorTrNetOp42();
	executeOperatorTrNetOp44();
	executeOperatorTrNetOp40();
	executeOperatorTrNetOp43();
	executeOperatorTrNetOp30();
	executeOperatorTrNetOp32();
	executeOperatorTrNetOp33();
	executeOperatorTrNetOp31();
	executeOperatorTrNetOp35();
	executeOperatorTrNetOp36();
	executeOperatorTrNetOp34();
	executeOperatorTrNetOp12();
	executeOperatorTrNetOp21();
	executeOperatorTrNetOp22();
	executeOperatorTrNetOp13();
	executeOperatorTrNetOp15();
	executeOperatorTrNetOp17();
	executeOperatorTrNetOp18();
	executeOperatorTrNetOp19();
	executeOperatorTrNetOp2();
	executeOperatorTrNetOp20();
	executeOperatorTrNetOp16();
	executeOperatorTrNetOp14();
	executeOperatorTrNetOp4();
	executeOperatorTrNetOp9();
	executeOperatorTrNetOp10();
	executeOperatorTrNetOp47();
	executeOperatorTrNetOp11();
	executeOperatorOutputRelational();
		
	}
	
	public HashMap<String, generic.PatternStats> retrieveExpectedAndRealSizesPatterns() {
		HashMap<String, generic.PatternStats> result = new HashMap<String, generic.PatternStats>();
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat1Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat1", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat2Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat2", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat6Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat6", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat7Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat7", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = addTableToDatabaseWithIDSet.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("AddTableToDatabaseWithID", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat3Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat3", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 29.0;
				patternStats.realSize = trNetPat42Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat42", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 29.0;
				patternStats.realSize = trNetPat22Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat22", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat8Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat8", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = addIDColumnToDatabaseSet.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("addIDColumnToDatabase", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat9Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat9", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 576.0;
				patternStats.realSize = trNetPat10Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat10", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat12Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat12", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat43Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat43", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat44Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat44", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat11Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat11", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat45Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat45", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = integerTypeSet.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("integerType", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat4Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat4", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat46Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat46", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat47Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat47", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat24Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat24", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat25Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat25", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat26Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat26", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat28Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat28", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat27Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat27", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat31Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat31", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 576.0;
				patternStats.realSize = trNetPat30Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat30", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat48Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat48", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat33Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat33", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = trNetPat34Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat34", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat35Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat35", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 576.0;
				patternStats.realSize = addIntegerColumnToDatabaseSet.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("addIntegerColumnToDatabase", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat37Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat37", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat38Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat38", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat39Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat39", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 52.0;
				patternStats.realSize = addTableToDatabaseSet.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("AddTableToDatabase", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat29Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat29", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13824.0;
				patternStats.realSize = trNetPat14Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat14", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat18Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat18", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 24.0;
				patternStats.realSize = trNetPat32Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat32", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13824.0;
				patternStats.realSize = trNetPat16Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat16", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13824.0;
				patternStats.realSize = trNetPat15Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat15", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13824.0;
				patternStats.realSize = trNetPat5Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat5", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13824.0;
				patternStats.realSize = trNetPat17Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat17", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 29.0;
				patternStats.realSize = trNetPat23Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat23", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 29.0;
				patternStats.realSize = trNetPat13Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat13", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat36Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat36", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat19Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat19", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat40Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat40", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat41Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat41", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat20Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat20", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 26.0;
				patternStats.realSize = trNetPat21Set.size();
				
				// TODO: Other statistics are filled here.
				
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
	
	public void notify(TrNetPat42Instance element){
		if (trNetPat42Set.add(element)) {
			trNetPat42Array.add(element);
	{
		if (!cClass0InTrNetPat42Hash.containsKey(element.cClass0)) {
			cClass0InTrNetPat42Hash.put(element.cClass0, new LinkedList<TrNetPat42Instance>());
		}
		cClass0InTrNetPat42Hash.get(element.cClass0).add(element);
	}
	{
		if (!cClass1InTrNetPat42Hash.containsKey(element.cClass1)) {
			cClass1InTrNetPat42Hash.put(element.cClass1, new LinkedList<TrNetPat42Instance>());
		}
		cClass1InTrNetPat42Hash.get(element.cClass1).add(element);
	}
			/*
	executeOperatorTrNetOp24();
			*/
		}
	}
	public void notify(TrNetPat47Instance element){
		if (trNetPat47Set.add(element)) {
			trNetPat47Array.add(element);
	{
		if (!cClass0InTrNetPat47Hash.containsKey(element.cClass0)) {
			cClass0InTrNetPat47Hash.put(element.cClass0, new LinkedList<TrNetPat47Instance>());
		}
		cClass0InTrNetPat47Hash.get(element.cClass0).add(element);
	}
	{
		if (!attribute0InTrNetPat47Hash.containsKey(element.attribute0)) {
			attribute0InTrNetPat47Hash.put(element.attribute0, new LinkedList<TrNetPat47Instance>());
		}
		attribute0InTrNetPat47Hash.get(element.attribute0).add(element);
	}
			/*
	executeOperatorTrNetOp27();
			*/
		}
	}
	public void notify(TrNetPat43Instance element){
		if (trNetPat43Set.add(element)) {
			trNetPat43Array.add(element);
	{
		if (!datatype0InTrNetPat43Hash.containsKey(element.datatype0)) {
			datatype0InTrNetPat43Hash.put(element.datatype0, new LinkedList<TrNetPat43Instance>());
		}
		datatype0InTrNetPat43Hash.get(element.datatype0).add(element);
	}
			/*
	executeOperatorTrNetOp45();
			*/
		}
	}
	public void notify(TrNetPat46Instance element){
		if (trNetPat46Set.add(element)) {
			trNetPat46Array.add(element);
	{
		if (!attribute0InTrNetPat46Hash.containsKey(element.attribute0)) {
			attribute0InTrNetPat46Hash.put(element.attribute0, new LinkedList<TrNetPat46Instance>());
		}
		attribute0InTrNetPat46Hash.get(element.attribute0).add(element);
	}
	{
		if (!datatype0InTrNetPat46Hash.containsKey(element.datatype0)) {
			datatype0InTrNetPat46Hash.put(element.datatype0, new LinkedList<TrNetPat46Instance>());
		}
		datatype0InTrNetPat46Hash.get(element.datatype0).add(element);
	}
			/*
	executeOperatorTrNetOp28();
			*/
		}
	}
	public void notify(TrNetPat48Instance element){
		if (trNetPat48Set.add(element)) {
			trNetPat48Array.add(element);
	{
		if (!attribute0InTrNetPat48Hash.containsKey(element.attribute0)) {
			attribute0InTrNetPat48Hash.put(element.attribute0, new LinkedList<TrNetPat48Instance>());
		}
		attribute0InTrNetPat48Hash.get(element.attribute0).add(element);
	}
	{
		if (!cClass0InTrNetPat48Hash.containsKey(element.cClass0)) {
			cClass0InTrNetPat48Hash.put(element.cClass0, new LinkedList<TrNetPat48Instance>());
		}
		cClass0InTrNetPat48Hash.get(element.cClass0).add(element);
	}
			/*
	executeOperatorTrNetOp37();
			*/
		}
	}
	public void notify(TrNetPat6Instance element){
		if (trNetPat6Set.add(element)) {
			trNetPat6Array.add(element);
	{
		if (!cClass0InTrNetPat6Hash.containsKey(element.cClass0)) {
			cClass0InTrNetPat6Hash.put(element.cClass0, new LinkedList<TrNetPat6Instance>());
		}
		cClass0InTrNetPat6Hash.get(element.cClass0).add(element);
	}
			/*
	executeOperatorTrNetOp5();
			*/
		}
	}
	public void notify(TrNetPat1Instance element){
		if (trNetPat1Set.add(element)) {
			trNetPat1Array.add(element);
	{
		if (!cModel0InTrNetPat1Hash.containsKey(element.cModel0)) {
			cModel0InTrNetPat1Hash.put(element.cModel0, new LinkedList<TrNetPat1Instance>());
		}
		cModel0InTrNetPat1Hash.get(element.cModel0).add(element);
	}
			/*
	executeOperatorTrNetOp1();
			*/
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

LinkedList<TrNetPat4InstanceListener> listenersTrNetPat4Instance;

public void registerListener(TrNetPat4InstanceListener listener){
	listenersTrNetPat4Instance.add(listener);
}
	
public void notifyListeners(TrNetPat4Instance element){
	for (TrNetPat4InstanceListener listener : listenersTrNetPat4Instance){
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

LinkedList<TrNetPat9InstanceListener> listenersTrNetPat9Instance;

public void registerListener(TrNetPat9InstanceListener listener){
	listenersTrNetPat9Instance.add(listener);
}
	
public void notifyListeners(TrNetPat9Instance element){
	for (TrNetPat9InstanceListener listener : listenersTrNetPat9Instance){
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

LinkedList<TrNetPat2InstanceListener> listenersTrNetPat2Instance;

public void registerListener(TrNetPat2InstanceListener listener){
	listenersTrNetPat2Instance.add(listener);
}
	
public void notifyListeners(TrNetPat2Instance element){
	for (TrNetPat2InstanceListener listener : listenersTrNetPat2Instance){
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

LinkedList<TrNetPat17InstanceListener> listenersTrNetPat17Instance;

public void registerListener(TrNetPat17InstanceListener listener){
	listenersTrNetPat17Instance.add(listener);
}
	
public void notifyListeners(TrNetPat17Instance element){
	for (TrNetPat17InstanceListener listener : listenersTrNetPat17Instance){
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

LinkedList<TrNetPat45InstanceListener> listenersTrNetPat45Instance;

public void registerListener(TrNetPat45InstanceListener listener){
	listenersTrNetPat45Instance.add(listener);
}
	
public void notifyListeners(TrNetPat45Instance element){
	for (TrNetPat45InstanceListener listener : listenersTrNetPat45Instance){
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

	
	
boolean executeOperatorOutputRelational() {
	boolean operatorHasExecuted = false;
	
	{
		int sourcePatternSize = trNetPat2Array.size();
		for (int i = newCounterTrNetPat2OutputRelational; i<sourcePatternSize; i++){
			TrNetPat2Instance sourcePatternInstance = trNetPat2Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat2OutputRelational = trNetPat2Array.size();
	}
	{
		int sourcePatternSize = addTableToDatabaseArray.size();
		for (int i = newCounterAddTableToDatabaseOutputRelational; i<sourcePatternSize; i++){
			AddTableToDatabaseInstance sourcePatternInstance = addTableToDatabaseArray.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterAddTableToDatabaseOutputRelational = addTableToDatabaseArray.size();
	}
	{
		int sourcePatternSize = trNetPat3Array.size();
		for (int i = newCounterTrNetPat3OutputRelational; i<sourcePatternSize; i++){
			TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat3OutputRelational = trNetPat3Array.size();
	}
	{
		int sourcePatternSize = trNetPat9Array.size();
		for (int i = newCounterTrNetPat9OutputRelational; i<sourcePatternSize; i++){
			TrNetPat9Instance sourcePatternInstance = trNetPat9Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat9OutputRelational = trNetPat9Array.size();
	}
	{
		int sourcePatternSize = trNetPat10Array.size();
		for (int i = newCounterTrNetPat10OutputRelational; i<sourcePatternSize; i++){
			TrNetPat10Instance sourcePatternInstance = trNetPat10Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat10OutputRelational = trNetPat10Array.size();
	}
	{
		int sourcePatternSize = trNetPat12Array.size();
		for (int i = newCounterTrNetPat12OutputRelational; i<sourcePatternSize; i++){
			TrNetPat12Instance sourcePatternInstance = trNetPat12Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat12OutputRelational = trNetPat12Array.size();
	}
	{
		int sourcePatternSize = trNetPat45Array.size();
		for (int i = newCounterTrNetPat45OutputRelational; i<sourcePatternSize; i++){
			TrNetPat45Instance sourcePatternInstance = trNetPat45Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat45OutputRelational = trNetPat45Array.size();
	}
	{
		int sourcePatternSize = trNetPat11Array.size();
		for (int i = newCounterTrNetPat11OutputRelational; i<sourcePatternSize; i++){
			TrNetPat11Instance sourcePatternInstance = trNetPat11Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat11OutputRelational = trNetPat11Array.size();
	}
	{
		int sourcePatternSize = trNetPat4Array.size();
		for (int i = newCounterTrNetPat4OutputRelational; i<sourcePatternSize; i++){
			TrNetPat4Instance sourcePatternInstance = trNetPat4Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat4OutputRelational = trNetPat4Array.size();
	}
	{
		int sourcePatternSize = trNetPat17Array.size();
		for (int i = newCounterTrNetPat17OutputRelational; i<sourcePatternSize; i++){
			TrNetPat17Instance sourcePatternInstance = trNetPat17Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat17OutputRelational = trNetPat17Array.size();
	}
	{
		int sourcePatternSize = trNetPat16Array.size();
		for (int i = newCounterTrNetPat16OutputRelational; i<sourcePatternSize; i++){
			TrNetPat16Instance sourcePatternInstance = trNetPat16Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat16OutputRelational = trNetPat16Array.size();
	}
	{
		int sourcePatternSize = trNetPat15Array.size();
		for (int i = newCounterTrNetPat15OutputRelational; i<sourcePatternSize; i++){
			TrNetPat15Instance sourcePatternInstance = trNetPat15Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat15OutputRelational = trNetPat15Array.size();
	}
	{
		int sourcePatternSize = trNetPat5Array.size();
		for (int i = newCounterTrNetPat5OutputRelational; i<sourcePatternSize; i++){
			TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat5OutputRelational = trNetPat5Array.size();
	}
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp1() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat1Array.size();
	for (int i = newCounterTrNetPat1TrNetOp1; i<sourcePatternSize; i++){
		TrNetPat1Instance sourcePatternInstance = trNetPat1Array.get(i);
		
		
	{
		TrNetPat2Instance targetInstance = new TrNetPat2Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.types.add("Database");
				
				targetInstance.database0 = node;
				
				}
		if (trNetPat2Set.add(targetInstance)) {
			trNetPat2Array.add(targetInstance);
	{
		if (!database0InTrNetPat2Hash.containsKey(targetInstance.database0)) {
			database0InTrNetPat2Hash.put(targetInstance.database0, new LinkedList<TrNetPat2Instance>());
		}
		database0InTrNetPat2Hash.get(targetInstance.database0).add(targetInstance);
	}
	//patternTrNetPat2HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat1TrNetOp1 = trNetPat1Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp5() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat6Array.size();
	for (int i = newCounterTrNetPat6TrNetOp5; i<sourcePatternSize; i++){
		TrNetPat6Instance sourcePatternInstance = trNetPat6Array.get(i);
		
		
	{
		TrNetPat7Instance targetInstance = new TrNetPat7Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat7Array.add(targetInstance);
	{
		if (!table0InTrNetPat7Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat7Hash.put(targetInstance.table0, new LinkedList<TrNetPat7Instance>());
		}
		table0InTrNetPat7Hash.get(targetInstance.table0).add(targetInstance);
	}
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
	
	newCounterTrNetPat6TrNetOp5 = trNetPat6Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp6() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat7Array.size();
	for (int i = newCounterTrNetPat7TrNetOp6; i<sourcePatternSize; i++){
		TrNetPat7Instance sourcePatternInstance = trNetPat7Array.get(i);
		
		
	{
		AddTableToDatabaseWithIDInstance targetInstance = new AddTableToDatabaseWithIDInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseWithIDSet.add(targetInstance)) {
			addTableToDatabaseWithIDArray.add(targetInstance);
	{
		if (!table0InAddTableToDatabaseWithIDHash.containsKey(targetInstance.table0)) {
			table0InAddTableToDatabaseWithIDHash.put(targetInstance.table0, new LinkedList<AddTableToDatabaseWithIDInstance>());
		}
		table0InAddTableToDatabaseWithIDHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddTableToDatabaseWithIDHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat7TrNetOp6 = trNetPat7Array.size();
	
	
	
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
			trNetPat3Array.add(targetInstance);
	{
		if (!database0InTrNetPat3Hash.containsKey(targetInstance.database0)) {
			database0InTrNetPat3Hash.put(targetInstance.database0, new LinkedList<TrNetPat3Instance>());
		}
		database0InTrNetPat3Hash.get(targetInstance.database0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat3Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat3Hash.put(targetInstance.table0, new LinkedList<TrNetPat3Instance>());
		}
		table0InTrNetPat3Hash.get(targetInstance.table0).add(targetInstance);
	}
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
		TrNetPat22Instance targetInstance = new TrNetPat22Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat22Array.add(targetInstance);
	{
		if (!table0InTrNetPat22Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat22Hash.put(targetInstance.table0, new LinkedList<TrNetPat22Instance>());
		}
		table0InTrNetPat22Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!cClass0InTrNetPat22Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat22Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat22Instance>());
		}
		cClass0InTrNetPat22Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!cClass1InTrNetPat22Hash.containsKey(targetInstance.cClass1)) {
			cClass1InTrNetPat22Hash.put(targetInstance.cClass1, new LinkedList<TrNetPat22Instance>());
		}
		cClass1InTrNetPat22Hash.get(targetInstance.cClass1).add(targetInstance);
	}
	{
		if (!column0InTrNetPat22Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat22Hash.put(targetInstance.column0, new LinkedList<TrNetPat22Instance>());
		}
		column0InTrNetPat22Hash.get(targetInstance.column0).add(targetInstance);
	}
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
	for (int i = newCounterAddTableToDatabaseWithIDTrNetOp7; i<sourcePatternSize; i++){
		AddTableToDatabaseWithIDInstance sourcePatternInstance = addTableToDatabaseWithIDArray.get(i);
		
		
	{
		TrNetPat8Instance targetInstance = new TrNetPat8Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat8Array.add(targetInstance);
	{
		if (!table0InTrNetPat8Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat8Hash.put(targetInstance.table0, new LinkedList<TrNetPat8Instance>());
		}
		table0InTrNetPat8Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat8Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat8Hash.put(targetInstance.column0, new LinkedList<TrNetPat8Instance>());
		}
		column0InTrNetPat8Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat8HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterAddTableToDatabaseWithIDTrNetOp7 = addTableToDatabaseWithIDArray.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp8() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat8Array.size();
	for (int i = newCounterTrNetPat8TrNetOp8; i<sourcePatternSize; i++){
		TrNetPat8Instance sourcePatternInstance = trNetPat8Array.get(i);
		
		
	{
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
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIDColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIDColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		column0InAddIDColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat8TrNetOp8 = trNetPat8Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp9() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addIDColumnToDatabaseArray.size();
	for (int i = newCounterAddIDColumnToDatabaseTrNetOp9; i<sourcePatternSize; i++){
		AddIDColumnToDatabaseInstance sourcePatternInstance = addIDColumnToDatabaseArray.get(i);
		
		
	{
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
			addIntegerColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIntegerColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		table0InAddIntegerColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIntegerColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		column0InAddIntegerColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat12Array.add(targetInstance);
	{
		if (!table0InTrNetPat12Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat12Hash.put(targetInstance.table0, new LinkedList<TrNetPat12Instance>());
		}
		table0InTrNetPat12Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat12Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat12Hash.put(targetInstance.column0, new LinkedList<TrNetPat12Instance>());
		}
		column0InTrNetPat12Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat12HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterAddIDColumnToDatabaseTrNetOp9 = addIDColumnToDatabaseArray.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp25() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat22Array.size();
	for (int i = newCounterTrNetPat22TrNetOp25; i<sourcePatternSize; i++){
		TrNetPat22Instance sourcePatternInstance = trNetPat22Array.get(i);
		
		
	{
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
			addIntegerColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIntegerColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		table0InAddIntegerColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIntegerColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		column0InAddIntegerColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat22TrNetOp25 = trNetPat22Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp45() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat43Array.size();
	for (int i = newCounterTrNetPat43TrNetOp45; i<sourcePatternSize; i++){
		TrNetPat43Instance sourcePatternInstance = trNetPat43Array.get(i);
		
		
	{
		TrNetPat44Instance targetInstance = new TrNetPat44Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat44Array.add(targetInstance);
	{
		if (!datatype0InTrNetPat44Hash.containsKey(targetInstance.datatype0)) {
			datatype0InTrNetPat44Hash.put(targetInstance.datatype0, new LinkedList<TrNetPat44Instance>());
		}
		datatype0InTrNetPat44Hash.get(targetInstance.datatype0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat44Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat44Hash.put(targetInstance.type0, new LinkedList<TrNetPat44Instance>());
		}
		type0InTrNetPat44Hash.get(targetInstance.type0).add(targetInstance);
	}
	//patternTrNetPat44HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat43TrNetOp45 = trNetPat43Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp46() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat44Array.size();
	for (int i = newCounterTrNetPat44TrNetOp46; i<sourcePatternSize; i++){
		TrNetPat44Instance sourcePatternInstance = trNetPat44Array.get(i);
		
		
	{
		TrNetPat45Instance targetInstance = new TrNetPat45Instance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (trNetPat45Set.add(targetInstance)) {
			trNetPat45Array.add(targetInstance);
	{
		if (!type0InTrNetPat45Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat45Hash.put(targetInstance.type0, new LinkedList<TrNetPat45Instance>());
		}
		type0InTrNetPat45Hash.get(targetInstance.type0).add(targetInstance);
	}
	//patternTrNetPat45HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat44TrNetOp46 = trNetPat44Array.size();
	
	
	
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
			trNetPat11Array.add(targetInstance);
	{
		if (!column0InTrNetPat11Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat11Hash.put(targetInstance.column0, new LinkedList<TrNetPat11Instance>());
		}
		column0InTrNetPat11Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat11Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat11Hash.put(targetInstance.type0, new LinkedList<TrNetPat11Instance>());
		}
		type0InTrNetPat11Hash.get(targetInstance.type0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat44TrNetOp47; i<sourcePatternSize; i++){
		TrNetPat44Instance sourcePatternInstance = trNetPat44Array.get(i);
		
	if (sourcePatternInstance.type0.attributes.get("name")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isInteger(sourcePatternInstance.type0.attributes.get("name"))) {
		continue;
	}
		
	{
		IntegerTypeInstance targetInstance = new IntegerTypeInstance();
			{
			targetInstance.type0 = sourcePatternInstance.type0;
			targetInstance.type0.types.add("Type");
			}
		if (integerTypeSet.add(targetInstance)) {
			integerTypeArray.add(targetInstance);
	{
		if (!type0InIntegerTypeHash.containsKey(targetInstance.type0)) {
			type0InIntegerTypeHash.put(targetInstance.type0, new LinkedList<IntegerTypeInstance>());
		}
		type0InIntegerTypeHash.get(targetInstance.type0).add(targetInstance);
	}
	//patternIntegerTypeHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat44TrNetOp47 = trNetPat44Array.size();
	
	
	
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
			trNetPat4Array.add(targetInstance);
	{
		if (!database0InTrNetPat4Hash.containsKey(targetInstance.database0)) {
			database0InTrNetPat4Hash.put(targetInstance.database0, new LinkedList<TrNetPat4Instance>());
		}
		database0InTrNetPat4Hash.get(targetInstance.database0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat4Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat4Hash.put(targetInstance.type0, new LinkedList<TrNetPat4Instance>());
		}
		type0InTrNetPat4Hash.get(targetInstance.type0).add(targetInstance);
	}
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
	
	
	int sourcePatternSize1 = trNetPat7Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat7Instance sourcePatternInstance1 = trNetPat7Array.get(i);
		
			LinkedList<TrNetPat47Instance> sourcePatternInstances2 = cClass0InTrNetPat47Hash.get(sourcePatternInstance1.cClass0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat47Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
		TrNetPat24Instance targetInstance = new TrNetPat24Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
			{
			targetInstance.cClass0 = sourcePatternInstance2.cClass0;
			targetInstance.cClass0.types.add("CClass");
			}
			{
			targetInstance.attribute0 = sourcePatternInstance2.attribute0;
			targetInstance.attribute0.types.add("Attribute");
			}
		if (trNetPat24Set.add(targetInstance)) {
			trNetPat24Array.add(targetInstance);
	{
		if (!cClass0InTrNetPat24Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat24Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat24Instance>());
		}
		cClass0InTrNetPat24Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!attribute0InTrNetPat24Hash.containsKey(targetInstance.attribute0)) {
			attribute0InTrNetPat24Hash.put(targetInstance.attribute0, new LinkedList<TrNetPat24Instance>());
		}
		attribute0InTrNetPat24Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat24Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat24Hash.put(targetInstance.table0, new LinkedList<TrNetPat24Instance>());
		}
		table0InTrNetPat24Hash.get(targetInstance.table0).add(targetInstance);
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
			trNetPat25Array.add(targetInstance);
	{
		if (!cClass0InTrNetPat25Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat25Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat25Instance>());
		}
		cClass0InTrNetPat25Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!attribute0InTrNetPat25Hash.containsKey(targetInstance.attribute0)) {
			attribute0InTrNetPat25Hash.put(targetInstance.attribute0, new LinkedList<TrNetPat25Instance>());
		}
		attribute0InTrNetPat25Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat25Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat25Hash.put(targetInstance.table0, new LinkedList<TrNetPat25Instance>());
		}
		table0InTrNetPat25Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!datatype0InTrNetPat25Hash.containsKey(targetInstance.datatype0)) {
			datatype0InTrNetPat25Hash.put(targetInstance.datatype0, new LinkedList<TrNetPat25Instance>());
		}
		datatype0InTrNetPat25Hash.get(targetInstance.datatype0).add(targetInstance);
	}
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
		TrNetPat26Instance targetInstance = new TrNetPat26Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat26Array.add(targetInstance);
	{
		if (!table0InTrNetPat26Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat26Hash.put(targetInstance.table0, new LinkedList<TrNetPat26Instance>());
		}
		table0InTrNetPat26Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat26Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat26Hash.put(targetInstance.type0, new LinkedList<TrNetPat26Instance>());
		}
		type0InTrNetPat26Hash.get(targetInstance.type0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat26Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat26Hash.put(targetInstance.column0, new LinkedList<TrNetPat26Instance>());
		}
		column0InTrNetPat26Hash.get(targetInstance.column0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat27TrNetOp31; i<sourcePatternSize; i++){
		TrNetPat27Instance sourcePatternInstance = trNetPat27Array.get(i);
		
		
	{
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
			trNetPat10Array.add(targetInstance);
	{
		if (!table0InTrNetPat10Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat10Hash.put(targetInstance.table0, new LinkedList<TrNetPat10Instance>());
		}
		table0InTrNetPat10Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat10Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat10Hash.put(targetInstance.column0, new LinkedList<TrNetPat10Instance>());
		}
		column0InTrNetPat10Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat10HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat11Array.add(targetInstance);
	{
		if (!column0InTrNetPat11Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat11Hash.put(targetInstance.column0, new LinkedList<TrNetPat11Instance>());
		}
		column0InTrNetPat11Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat11Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat11Hash.put(targetInstance.type0, new LinkedList<TrNetPat11Instance>());
		}
		type0InTrNetPat11Hash.get(targetInstance.type0).add(targetInstance);
	}
	//patternTrNetPat11HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat9Instance targetInstance = new TrNetPat9Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat9Set.add(targetInstance)) {
			trNetPat9Array.add(targetInstance);
	{
		if (!column0InTrNetPat9Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat9Hash.put(targetInstance.column0, new LinkedList<TrNetPat9Instance>());
		}
		column0InTrNetPat9Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat9HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat27TrNetOp31 = trNetPat27Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp32() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat25Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat25Instance sourcePatternInstance1 = trNetPat25Array.get(i);
		
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
		TrNetPat28Instance targetInstance = new TrNetPat28Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat28Array.add(targetInstance);
	{
		if (!table0InTrNetPat28Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat28Hash.put(targetInstance.table0, new LinkedList<TrNetPat28Instance>());
		}
		table0InTrNetPat28Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat28Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat28Hash.put(targetInstance.type0, new LinkedList<TrNetPat28Instance>());
		}
		type0InTrNetPat28Hash.get(targetInstance.type0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat28Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat28Hash.put(targetInstance.column0, new LinkedList<TrNetPat28Instance>());
		}
		column0InTrNetPat28Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat28HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat31Instance targetInstance = new TrNetPat31Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance1.table0.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column0 = node;
				}
		if (trNetPat31Set.add(targetInstance)) {
			trNetPat31Array.add(targetInstance);
	{
		if (!column0InTrNetPat31Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat31Hash.put(targetInstance.column0, new LinkedList<TrNetPat31Instance>());
		}
		column0InTrNetPat31Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat31HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat32Instance targetInstance = new TrNetPat32Instance();
			{
			targetInstance.table0 = sourcePatternInstance1.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat32Set.add(targetInstance)) {
			trNetPat32Array.add(targetInstance);
	{
		if (!table0InTrNetPat32Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat32Hash.put(targetInstance.table0, new LinkedList<TrNetPat32Instance>());
		}
		table0InTrNetPat32Hash.get(targetInstance.table0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat28TrNetOp33; i<sourcePatternSize; i++){
		TrNetPat28Instance sourcePatternInstance = trNetPat28Array.get(i);
		
		
	{
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
			trNetPat27Array.add(targetInstance);
	{
		if (!table0InTrNetPat27Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat27Hash.put(targetInstance.table0, new LinkedList<TrNetPat27Instance>());
		}
		table0InTrNetPat27Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat27Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat27Hash.put(targetInstance.type0, new LinkedList<TrNetPat27Instance>());
		}
		type0InTrNetPat27Hash.get(targetInstance.type0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat27Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat27Hash.put(targetInstance.column0, new LinkedList<TrNetPat27Instance>());
		}
		column0InTrNetPat27Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat27HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat29Instance targetInstance = new TrNetPat29Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat29Array.add(targetInstance);
	{
		if (!table0InTrNetPat29Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat29Hash.put(targetInstance.table0, new LinkedList<TrNetPat29Instance>());
		}
		table0InTrNetPat29Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat29Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat29Hash.put(targetInstance.column0, new LinkedList<TrNetPat29Instance>());
		}
		column0InTrNetPat29Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat29HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat28TrNetOp33 = trNetPat28Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp30() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat26Array.size();
	for (int i = newCounterTrNetPat26TrNetOp30; i<sourcePatternSize; i++){
		TrNetPat26Instance sourcePatternInstance = trNetPat26Array.get(i);
		
		
	{
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
			trNetPat27Array.add(targetInstance);
	{
		if (!table0InTrNetPat27Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat27Hash.put(targetInstance.table0, new LinkedList<TrNetPat27Instance>());
		}
		table0InTrNetPat27Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!type0InTrNetPat27Hash.containsKey(targetInstance.type0)) {
			type0InTrNetPat27Hash.put(targetInstance.type0, new LinkedList<TrNetPat27Instance>());
		}
		type0InTrNetPat27Hash.get(targetInstance.type0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat27Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat27Hash.put(targetInstance.column0, new LinkedList<TrNetPat27Instance>());
		}
		column0InTrNetPat27Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat27HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat26TrNetOp30 = trNetPat26Array.size();
	
	
	
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
			trNetPat30Array.add(targetInstance);
	{
		if (!column0InTrNetPat30Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat30Hash.put(targetInstance.column0, new LinkedList<TrNetPat30Instance>());
		}
		column0InTrNetPat30Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat30Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat30Hash.put(targetInstance.table0, new LinkedList<TrNetPat30Instance>());
		}
		table0InTrNetPat30Hash.get(targetInstance.table0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat30TrNetOp36; i<sourcePatternSize; i++){
		TrNetPat30Instance sourcePatternInstance = trNetPat30Array.get(i);
		
		
	{
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
			addIntegerColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIntegerColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		table0InAddIntegerColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIntegerColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		column0InAddIntegerColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat30TrNetOp36 = trNetPat30Array.size();
	
	
	
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
			trNetPat33Array.add(targetInstance);
	{
		if (!cClass0InTrNetPat33Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat33Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat33Instance>());
		}
		cClass0InTrNetPat33Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!attribute0InTrNetPat33Hash.containsKey(targetInstance.attribute0)) {
			attribute0InTrNetPat33Hash.put(targetInstance.attribute0, new LinkedList<TrNetPat33Instance>());
		}
		attribute0InTrNetPat33Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat33Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat33Hash.put(targetInstance.table0, new LinkedList<TrNetPat33Instance>());
		}
		table0InTrNetPat33Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!cClass1InTrNetPat33Hash.containsKey(targetInstance.cClass1)) {
			cClass1InTrNetPat33Hash.put(targetInstance.cClass1, new LinkedList<TrNetPat33Instance>());
		}
		cClass1InTrNetPat33Hash.get(targetInstance.cClass1).add(targetInstance);
	}
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
			trNetPat34Array.add(targetInstance);
	{
		if (!cClass0InTrNetPat34Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat34Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat34Instance>());
		}
		cClass0InTrNetPat34Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!attribute0InTrNetPat34Hash.containsKey(targetInstance.attribute0)) {
			attribute0InTrNetPat34Hash.put(targetInstance.attribute0, new LinkedList<TrNetPat34Instance>());
		}
		attribute0InTrNetPat34Hash.get(targetInstance.attribute0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat34Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat34Hash.put(targetInstance.table0, new LinkedList<TrNetPat34Instance>());
		}
		table0InTrNetPat34Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!cClass1InTrNetPat34Hash.containsKey(targetInstance.cClass1)) {
			cClass1InTrNetPat34Hash.put(targetInstance.cClass1, new LinkedList<TrNetPat34Instance>());
		}
		cClass1InTrNetPat34Hash.get(targetInstance.cClass1).add(targetInstance);
	}
	{
		if (!table1InTrNetPat34Hash.containsKey(targetInstance.table1)) {
			table1InTrNetPat34Hash.put(targetInstance.table1, new LinkedList<TrNetPat34Instance>());
		}
		table1InTrNetPat34Hash.get(targetInstance.table1).add(targetInstance);
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
boolean executeOperatorTrNetOp39() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat34Array.size();
	for (int i = newCounterTrNetPat34TrNetOp39; i<sourcePatternSize; i++){
		TrNetPat34Instance sourcePatternInstance = trNetPat34Array.get(i);
		
	if (sourcePatternInstance.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfalse(sourcePatternInstance.attribute0.attributes.get("isMany"))) {
		continue;
	}
		
	{
		TrNetPat35Instance targetInstance = new TrNetPat35Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat35Array.add(targetInstance);
	{
		if (!table0InTrNetPat35Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat35Hash.put(targetInstance.table0, new LinkedList<TrNetPat35Instance>());
		}
		table0InTrNetPat35Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat35Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat35Hash.put(targetInstance.column0, new LinkedList<TrNetPat35Instance>());
		}
		column0InTrNetPat35Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat35HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat36Instance targetInstance = new TrNetPat36Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table1;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat36Set.add(targetInstance)) {
			trNetPat36Array.add(targetInstance);
	{
		if (!table0InTrNetPat36Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat36Hash.put(targetInstance.table0, new LinkedList<TrNetPat36Instance>());
		}
		table0InTrNetPat36Hash.get(targetInstance.table0).add(targetInstance);
	}
	//patternTrNetPat36HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat34TrNetOp39 = trNetPat34Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp10() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addIntegerColumnToDatabaseArray.size();
	for (int i = newCounterAddIntegerColumnToDatabaseTrNetOp10; i<sourcePatternSize; i++){
		AddIntegerColumnToDatabaseInstance sourcePatternInstance = addIntegerColumnToDatabaseArray.get(i);
		
		
	{
		TrNetPat9Instance targetInstance = new TrNetPat9Instance();
			{
			targetInstance.column0 = sourcePatternInstance.column0;
			targetInstance.column0.types.add("Column");
			}
		if (trNetPat9Set.add(targetInstance)) {
			trNetPat9Array.add(targetInstance);
	{
		if (!column0InTrNetPat9Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat9Hash.put(targetInstance.column0, new LinkedList<TrNetPat9Instance>());
		}
		column0InTrNetPat9Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat9HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat10Array.add(targetInstance);
	{
		if (!table0InTrNetPat10Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat10Hash.put(targetInstance.table0, new LinkedList<TrNetPat10Instance>());
		}
		table0InTrNetPat10Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat10Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat10Hash.put(targetInstance.column0, new LinkedList<TrNetPat10Instance>());
		}
		column0InTrNetPat10Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat10HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterAddIntegerColumnToDatabaseTrNetOp10 = addIntegerColumnToDatabaseArray.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp40() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat35Array.size();
	for (int i = newCounterTrNetPat35TrNetOp40; i<sourcePatternSize; i++){
		TrNetPat35Instance sourcePatternInstance = trNetPat35Array.get(i);
		
		
	{
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
			addIntegerColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIntegerColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		table0InAddIntegerColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIntegerColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIntegerColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIntegerColumnToDatabaseInstance>());
		}
		column0InAddIntegerColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIntegerColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat35TrNetOp40 = trNetPat35Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp41() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat34Array.size();
	for (int i = newCounterTrNetPat34TrNetOp41; i<sourcePatternSize; i++){
		TrNetPat34Instance sourcePatternInstance = trNetPat34Array.get(i);
		
	if (sourcePatternInstance.attribute0.attributes.get("isMany")==null) {
		continue;
	}
	if (! generic.utils.Conditions.istrue(sourcePatternInstance.attribute0.attributes.get("isMany"))) {
		continue;
	}
		
	{
		TrNetPat37Instance targetInstance = new TrNetPat37Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
		- Caso esteja, gera o código que chama essa função usando o qualified name.
		- Nessa fncao, coloca os parametros respectivos.
	*/
	node.attributes.put("name", generic.utils.Concat.concat(sourcePatternInstance.table1.attributes.get("name"),	generic.utils.Constants.getID()
));
	node.types.add("Column");
				
				targetInstance.column1 = node;
				
				}
		if (trNetPat37Set.add(targetInstance)) {
			trNetPat37Array.add(targetInstance);
	{
		if (!table0InTrNetPat37Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat37Hash.put(targetInstance.table0, new LinkedList<TrNetPat37Instance>());
		}
		table0InTrNetPat37Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat37Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat37Hash.put(targetInstance.column0, new LinkedList<TrNetPat37Instance>());
		}
		column0InTrNetPat37Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!column1InTrNetPat37Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat37Hash.put(targetInstance.column1, new LinkedList<TrNetPat37Instance>());
		}
		column1InTrNetPat37Hash.get(targetInstance.column1).add(targetInstance);
	}
	//patternTrNetPat37HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat40Instance targetInstance = new TrNetPat40Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table1;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat40Set.add(targetInstance)) {
			trNetPat40Array.add(targetInstance);
	{
		if (!table0InTrNetPat40Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat40Hash.put(targetInstance.table0, new LinkedList<TrNetPat40Instance>());
		}
		table0InTrNetPat40Hash.get(targetInstance.table0).add(targetInstance);
	}
	//patternTrNetPat40HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat41Instance targetInstance = new TrNetPat41Instance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (trNetPat41Set.add(targetInstance)) {
			trNetPat41Array.add(targetInstance);
	{
		if (!table0InTrNetPat41Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat41Hash.put(targetInstance.table0, new LinkedList<TrNetPat41Instance>());
		}
		table0InTrNetPat41Hash.get(targetInstance.table0).add(targetInstance);
	}
	//patternTrNetPat41HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat34TrNetOp41 = trNetPat34Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp42() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat37Array.size();
	for (int i = newCounterTrNetPat37TrNetOp42; i<sourcePatternSize; i++){
		TrNetPat37Instance sourcePatternInstance = trNetPat37Array.get(i);
		
		
	{
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
			trNetPat38Array.add(targetInstance);
	{
		if (!table0InTrNetPat38Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat38Hash.put(targetInstance.table0, new LinkedList<TrNetPat38Instance>());
		}
		table0InTrNetPat38Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat38Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat38Hash.put(targetInstance.column0, new LinkedList<TrNetPat38Instance>());
		}
		column0InTrNetPat38Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat38HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat39Array.add(targetInstance);
	{
		if (!table0InTrNetPat39Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat39Hash.put(targetInstance.table0, new LinkedList<TrNetPat39Instance>());
		}
		table0InTrNetPat39Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat39Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat39Hash.put(targetInstance.column0, new LinkedList<TrNetPat39Instance>());
		}
		column0InTrNetPat39Hash.get(targetInstance.column0).add(targetInstance);
	}
	//patternTrNetPat39HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		AddTableToDatabaseInstance targetInstance = new AddTableToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseSet.add(targetInstance)) {
			addTableToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddTableToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddTableToDatabaseHash.put(targetInstance.table0, new LinkedList<AddTableToDatabaseInstance>());
		}
		table0InAddTableToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddTableToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat37TrNetOp42 = trNetPat37Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp43() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat38Array.size();
	for (int i = newCounterTrNetPat38TrNetOp43; i<sourcePatternSize; i++){
		TrNetPat38Instance sourcePatternInstance = trNetPat38Array.get(i);
		
		
	{
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
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIDColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIDColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		column0InAddIDColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat38TrNetOp43 = trNetPat38Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp44() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat39Array.size();
	for (int i = newCounterTrNetPat39TrNetOp44; i<sourcePatternSize; i++){
		TrNetPat39Instance sourcePatternInstance = trNetPat39Array.get(i);
		
		
	{
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
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIDColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIDColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		column0InAddIDColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat39TrNetOp44 = trNetPat39Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp23() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = addTableToDatabaseWithIDArray.size();
	for (int i = newCounterAddTableToDatabaseWithIDTrNetOp23; i<sourcePatternSize; i++){
		AddTableToDatabaseWithIDInstance sourcePatternInstance = addTableToDatabaseWithIDArray.get(i);
		
		
	{
		AddTableToDatabaseInstance targetInstance = new AddTableToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseSet.add(targetInstance)) {
			addTableToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddTableToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddTableToDatabaseHash.put(targetInstance.table0, new LinkedList<AddTableToDatabaseInstance>());
		}
		table0InAddTableToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddTableToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterAddTableToDatabaseWithIDTrNetOp23 = addTableToDatabaseWithIDArray.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp34() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat29Array.size();
	for (int i = newCounterTrNetPat29TrNetOp34; i<sourcePatternSize; i++){
		TrNetPat29Instance sourcePatternInstance = trNetPat29Array.get(i);
		
		
	{
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
			addIDColumnToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddIDColumnToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddIDColumnToDatabaseHash.put(targetInstance.table0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		table0InAddIDColumnToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InAddIDColumnToDatabaseHash.containsKey(targetInstance.column0)) {
			column0InAddIDColumnToDatabaseHash.put(targetInstance.column0, new LinkedList<AddIDColumnToDatabaseInstance>());
		}
		column0InAddIDColumnToDatabaseHash.get(targetInstance.column0).add(targetInstance);
	}
	//patternAddIDColumnToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		AddTableToDatabaseInstance targetInstance = new AddTableToDatabaseInstance();
			{
			targetInstance.table0 = sourcePatternInstance.table0;
			targetInstance.table0.types.add("Table");
			}
		if (addTableToDatabaseSet.add(targetInstance)) {
			addTableToDatabaseArray.add(targetInstance);
	{
		if (!table0InAddTableToDatabaseHash.containsKey(targetInstance.table0)) {
			table0InAddTableToDatabaseHash.put(targetInstance.table0, new LinkedList<AddTableToDatabaseInstance>());
		}
		table0InAddTableToDatabaseHash.get(targetInstance.table0).add(targetInstance);
	}
	//patternAddTableToDatabaseHasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat29TrNetOp34 = trNetPat29Array.size();
	
	
	
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
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat14Array.add(targetInstance);
	{
		if (!column0InTrNetPat14Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat14Hash.put(targetInstance.column0, new LinkedList<TrNetPat14Instance>());
		}
		column0InTrNetPat14Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!column1InTrNetPat14Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat14Hash.put(targetInstance.column1, new LinkedList<TrNetPat14Instance>());
		}
		column1InTrNetPat14Hash.get(targetInstance.column1).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat14Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat14Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat14Instance>());
		}
		foreignKey0InTrNetPat14Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
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
			trNetPat18Array.add(targetInstance);
	{
		if (!column0InTrNetPat18Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat18Hash.put(targetInstance.column0, new LinkedList<TrNetPat18Instance>());
		}
		column0InTrNetPat18Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!table0InTrNetPat18Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat18Hash.put(targetInstance.table0, new LinkedList<TrNetPat18Instance>());
		}
		table0InTrNetPat18Hash.get(targetInstance.table0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat14TrNetOp14; i<sourcePatternSize; i++){
		TrNetPat14Instance sourcePatternInstance = trNetPat14Array.get(i);
		
		
	{
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
			trNetPat15Array.add(targetInstance);
	{
		if (!column0InTrNetPat15Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat15Hash.put(targetInstance.column0, new LinkedList<TrNetPat15Instance>());
		}
		column0InTrNetPat15Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat15Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat15Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat15Instance>());
		}
		foreignKey0InTrNetPat15Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
	//patternTrNetPat15HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat16Array.add(targetInstance);
	{
		if (!column0InTrNetPat16Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat16Hash.put(targetInstance.column0, new LinkedList<TrNetPat16Instance>());
		}
		column0InTrNetPat16Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat16Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat16Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat16Instance>());
		}
		foreignKey0InTrNetPat16Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
	//patternTrNetPat16HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
		TrNetPat17Instance targetInstance = new TrNetPat17Instance();
			{
			targetInstance.foreignKey0 = sourcePatternInstance.foreignKey0;
			targetInstance.foreignKey0.types.add("ForeignKey");
			}
		if (trNetPat17Set.add(targetInstance)) {
			trNetPat17Array.add(targetInstance);
	{
		if (!foreignKey0InTrNetPat17Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat17Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat17Instance>());
		}
		foreignKey0InTrNetPat17Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
	//patternTrNetPat17HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat14TrNetOp14 = trNetPat14Array.size();
	
	
	
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
			trNetPat5Array.add(targetInstance);
	{
		if (!foreignKey0InTrNetPat5Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat5Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat5Instance>());
		}
		foreignKey0InTrNetPat5Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
	{
		if (!database0InTrNetPat5Hash.containsKey(targetInstance.database0)) {
			database0InTrNetPat5Hash.put(targetInstance.database0, new LinkedList<TrNetPat5Instance>());
		}
		database0InTrNetPat5Hash.get(targetInstance.database0).add(targetInstance);
	}
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
			trNetPat23Array.add(targetInstance);
	{
		if (!table0InTrNetPat23Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat23Hash.put(targetInstance.table0, new LinkedList<TrNetPat23Instance>());
		}
		table0InTrNetPat23Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!cClass0InTrNetPat23Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat23Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat23Instance>());
		}
		cClass0InTrNetPat23Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!cClass1InTrNetPat23Hash.containsKey(targetInstance.cClass1)) {
			cClass1InTrNetPat23Hash.put(targetInstance.cClass1, new LinkedList<TrNetPat23Instance>());
		}
		cClass1InTrNetPat23Hash.get(targetInstance.cClass1).add(targetInstance);
	}
	{
		if (!column0InTrNetPat23Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat23Hash.put(targetInstance.column0, new LinkedList<TrNetPat23Instance>());
		}
		column0InTrNetPat23Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!table1InTrNetPat23Hash.containsKey(targetInstance.table1)) {
			table1InTrNetPat23Hash.put(targetInstance.table1, new LinkedList<TrNetPat23Instance>());
		}
		table1InTrNetPat23Hash.get(targetInstance.table1).add(targetInstance);
	}
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
			trNetPat13Array.add(targetInstance);
	{
		if (!table0InTrNetPat13Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat13Hash.put(targetInstance.table0, new LinkedList<TrNetPat13Instance>());
		}
		table0InTrNetPat13Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!cClass0InTrNetPat13Hash.containsKey(targetInstance.cClass0)) {
			cClass0InTrNetPat13Hash.put(targetInstance.cClass0, new LinkedList<TrNetPat13Instance>());
		}
		cClass0InTrNetPat13Hash.get(targetInstance.cClass0).add(targetInstance);
	}
	{
		if (!cClass1InTrNetPat13Hash.containsKey(targetInstance.cClass1)) {
			cClass1InTrNetPat13Hash.put(targetInstance.cClass1, new LinkedList<TrNetPat13Instance>());
		}
		cClass1InTrNetPat13Hash.get(targetInstance.cClass1).add(targetInstance);
	}
	{
		if (!column0InTrNetPat13Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat13Hash.put(targetInstance.column0, new LinkedList<TrNetPat13Instance>());
		}
		column0InTrNetPat13Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!table1InTrNetPat13Hash.containsKey(targetInstance.table1)) {
			table1InTrNetPat13Hash.put(targetInstance.table1, new LinkedList<TrNetPat13Instance>());
		}
		table1InTrNetPat13Hash.get(targetInstance.table1).add(targetInstance);
	}
	{
		if (!column1InTrNetPat13Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat13Hash.put(targetInstance.column1, new LinkedList<TrNetPat13Instance>());
		}
		column1InTrNetPat13Hash.get(targetInstance.column1).add(targetInstance);
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
	
	
	
	int sourcePatternSize = trNetPat13Array.size();
	for (int i = newCounterTrNetPat13TrNetOp13; i<sourcePatternSize; i++){
		TrNetPat13Instance sourcePatternInstance = trNetPat13Array.get(i);
		
		
	{
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat14Array.add(targetInstance);
	{
		if (!column0InTrNetPat14Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat14Hash.put(targetInstance.column0, new LinkedList<TrNetPat14Instance>());
		}
		column0InTrNetPat14Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!column1InTrNetPat14Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat14Hash.put(targetInstance.column1, new LinkedList<TrNetPat14Instance>());
		}
		column1InTrNetPat14Hash.get(targetInstance.column1).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat14Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat14Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat14Instance>());
		}
		foreignKey0InTrNetPat14Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
	//patternTrNetPat14HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat13TrNetOp13 = trNetPat13Array.size();
	
	
	
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
			trNetPat19Array.add(targetInstance);
	{
		if (!table0InTrNetPat19Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat19Hash.put(targetInstance.table0, new LinkedList<TrNetPat19Instance>());
		}
		table0InTrNetPat19Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat19Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat19Hash.put(targetInstance.column0, new LinkedList<TrNetPat19Instance>());
		}
		column0InTrNetPat19Hash.get(targetInstance.column0).add(targetInstance);
	}
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
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat14Array.add(targetInstance);
	{
		if (!column0InTrNetPat14Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat14Hash.put(targetInstance.column0, new LinkedList<TrNetPat14Instance>());
		}
		column0InTrNetPat14Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!column1InTrNetPat14Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat14Hash.put(targetInstance.column1, new LinkedList<TrNetPat14Instance>());
		}
		column1InTrNetPat14Hash.get(targetInstance.column1).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat14Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat14Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat14Instance>());
		}
		foreignKey0InTrNetPat14Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
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
			trNetPat20Array.add(targetInstance);
	{
		if (!table0InTrNetPat20Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat20Hash.put(targetInstance.table0, new LinkedList<TrNetPat20Instance>());
		}
		table0InTrNetPat20Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat20Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat20Hash.put(targetInstance.column0, new LinkedList<TrNetPat20Instance>());
		}
		column0InTrNetPat20Hash.get(targetInstance.column0).add(targetInstance);
	}
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
			trNetPat21Array.add(targetInstance);
	{
		if (!table0InTrNetPat21Hash.containsKey(targetInstance.table0)) {
			table0InTrNetPat21Hash.put(targetInstance.table0, new LinkedList<TrNetPat21Instance>());
		}
		table0InTrNetPat21Hash.get(targetInstance.table0).add(targetInstance);
	}
	{
		if (!column0InTrNetPat21Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat21Hash.put(targetInstance.column0, new LinkedList<TrNetPat21Instance>());
		}
		column0InTrNetPat21Hash.get(targetInstance.column0).add(targetInstance);
	}
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
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat14Array.add(targetInstance);
	{
		if (!column0InTrNetPat14Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat14Hash.put(targetInstance.column0, new LinkedList<TrNetPat14Instance>());
		}
		column0InTrNetPat14Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!column1InTrNetPat14Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat14Hash.put(targetInstance.column1, new LinkedList<TrNetPat14Instance>());
		}
		column1InTrNetPat14Hash.get(targetInstance.column1).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat14Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat14Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat14Instance>());
		}
		foreignKey0InTrNetPat14Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
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
		TrNetPat14Instance targetInstance = new TrNetPat14Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o código que chama essa função usando o qualified name.
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
			trNetPat14Array.add(targetInstance);
	{
		if (!column0InTrNetPat14Hash.containsKey(targetInstance.column0)) {
			column0InTrNetPat14Hash.put(targetInstance.column0, new LinkedList<TrNetPat14Instance>());
		}
		column0InTrNetPat14Hash.get(targetInstance.column0).add(targetInstance);
	}
	{
		if (!column1InTrNetPat14Hash.containsKey(targetInstance.column1)) {
			column1InTrNetPat14Hash.put(targetInstance.column1, new LinkedList<TrNetPat14Instance>());
		}
		column1InTrNetPat14Hash.get(targetInstance.column1).add(targetInstance);
	}
	{
		if (!foreignKey0InTrNetPat14Hash.containsKey(targetInstance.foreignKey0)) {
			foreignKey0InTrNetPat14Hash.put(targetInstance.foreignKey0, new LinkedList<TrNetPat14Instance>());
		}
		foreignKey0InTrNetPat14Hash.get(targetInstance.foreignKey0).add(targetInstance);
	}
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






