package activitymigrationoriginal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;

import generic.*;

public class ActivityMigrationOriginalTransformation
implements 			TrNetPat56InstanceListener
			,TrNetPat65InstanceListener
			,TrNetPat69InstanceListener
			,TrNetPat71InstanceListener
			,TrNetPat1InstanceListener
			,TrNetPat27InstanceListener
			,TrNetPat52InstanceListener
			,TrNetPat70InstanceListener
			,TrNetPat68InstanceListener
			,TrNetPat47InstanceListener
			,TrNetPat48InstanceListener
			,TrNetPat17InstanceListener
			,TrNetPat29InstanceListener
			,TrNetPat28InstanceListener
			,TrNetPat53InstanceListener
			,TrNetPat4InstancePublisher
			,TrNetPat3InstancePublisher
			,TrNetPat67InstancePublisher
			,TrNetPat46InstancePublisher
			,TrNetPat36InstancePublisher
			,TrNetPat64InstancePublisher
			,TrNetPat5InstancePublisher
			,TrNetPat15InstancePublisher
			,TrNetPat58InstancePublisher
			,TrNetPat43InstancePublisher
			,TrNetPat55InstancePublisher
			,TrNetPat10InstancePublisher
			,TrNetPat26InstancePublisher
			,TrNetPat23InstancePublisher
			,TrNetPat20InstancePublisher
			,TrNetPat40InstancePublisher
			,TrNetPat60InstancePublisher
			,TrNetPat50InstancePublisher
			,TrNetPat32InstancePublisher
			,TrNetPat62InstancePublisher
			,TrNetPat7InstancePublisher
			,TrNetPat37InstancePublisher
			,TrNetPat12InstancePublisher
{
	OriginalInputExternalInput inputOriginalInput;
	EvolvedOutputExternalOutput outputEvolvedOutput;
	ArrayList<TrNetPat1Instance> trNetPat1Array;
	int newCounterTrNetPat1TrNetOp1;
	int newCounterTrNetPat1TrNetOp15;
	HashSet<TrNetPat1Instance> trNetPat1Set; 
		HashMap<ModelNode, LinkedList<TrNetPat1Instance>> activityGraph0InTrNetPat1Hash;
		HashMap<ModelNode, LinkedList<TrNetPat1Instance>> compositeState0InTrNetPat1Hash;
	ArrayList<TrNetPat2Instance> trNetPat2Array;
	int newCounterTrNetPat2TrNetOp2;
	int newCounterTrNetPat2TrNetOp5;
	int newCounterTrNetPat2TrNetOp7;
	int newCounterTrNetPat2TrNetOp12;
	HashSet<TrNetPat2Instance> trNetPat2Set; 
		HashMap<ModelNode, LinkedList<TrNetPat2Instance>> activity0InTrNetPat2Hash;
		HashMap<ModelNode, LinkedList<TrNetPat2Instance>> package0InTrNetPat2Hash;
		HashMap<ModelNode, LinkedList<TrNetPat2Instance>> activityGraph0InTrNetPat2Hash;
	ArrayList<TrNetPat5Instance> trNetPat5Array;
	int newCounterTrNetPat5EvolvedOutput;
	HashSet<TrNetPat5Instance> trNetPat5Set; 
		HashMap<ModelNode, LinkedList<TrNetPat5Instance>> package0InTrNetPat5Hash;
	ArrayList<TrNetPat4Instance> trNetPat4Array;
	int newCounterTrNetPat4EvolvedOutput;
	HashSet<TrNetPat4Instance> trNetPat4Set; 
		HashMap<ModelNode, LinkedList<TrNetPat4Instance>> activity0InTrNetPat4Hash;
	ArrayList<TrNetPat3Instance> trNetPat3Array;
	int newCounterTrNetPat3TrNetOp3;
	int newCounterTrNetPat3TrNetOp4;
	int newCounterTrNetPat3EvolvedOutput;
	HashSet<TrNetPat3Instance> trNetPat3Set; 
		HashMap<ModelNode, LinkedList<TrNetPat3Instance>> activity0InTrNetPat3Hash;
		HashMap<ModelNode, LinkedList<TrNetPat3Instance>> package0InTrNetPat3Hash;
	ArrayList<TrNetPat17Instance> trNetPat17Array;
	int newCounterTrNetPat17TrNetOp16;
	HashSet<TrNetPat17Instance> trNetPat17Set; 
		HashMap<ModelNode, LinkedList<TrNetPat17Instance>> partition0InTrNetPat17Hash;
	ArrayList<TrNetPat18Instance> trNetPat18Array;
	int newCounterTrNetPat18TrNetOp17;
	int newCounterTrNetPat18TrNetOp18;
	int newCounterTrNetPat18TrNetOp19;
	int newCounterTrNetPat18TrNetOp22;
	HashSet<TrNetPat18Instance> trNetPat18Set; 
		HashMap<ModelNode, LinkedList<TrNetPat18Instance>> activityPartition0InTrNetPat18Hash;
		HashMap<ModelNode, LinkedList<TrNetPat18Instance>> partition0InTrNetPat18Hash;
	ArrayList<TrNetPat27Instance> trNetPat27Array;
	int newCounterTrNetPat27TrNetOp17;
	HashSet<TrNetPat27Instance> trNetPat27Set; 
		HashMap<ModelNode, LinkedList<TrNetPat27Instance>> activityGraph0InTrNetPat27Hash;
		HashMap<ModelNode, LinkedList<TrNetPat27Instance>> partition0InTrNetPat27Hash;
	ArrayList<TrNetPat19Instance> trNetPat19Array;
	int newCounterTrNetPat19TrNetOp5;
	HashSet<TrNetPat19Instance> trNetPat19Set; 
		HashMap<ModelNode, LinkedList<TrNetPat19Instance>> activityPartition0InTrNetPat19Hash;
		HashMap<ModelNode, LinkedList<TrNetPat19Instance>> partition0InTrNetPat19Hash;
		HashMap<ModelNode, LinkedList<TrNetPat19Instance>> activityGraph0InTrNetPat19Hash;
	ArrayList<TrNetPat6Instance> trNetPat6Array;
	int newCounterTrNetPat6TrNetOp6;
	HashSet<TrNetPat6Instance> trNetPat6Set; 
		HashMap<ModelNode, LinkedList<TrNetPat6Instance>> activityPartition0InTrNetPat6Hash;
		HashMap<ModelNode, LinkedList<TrNetPat6Instance>> partition0InTrNetPat6Hash;
		HashMap<ModelNode, LinkedList<TrNetPat6Instance>> activityGraph0InTrNetPat6Hash;
		HashMap<ModelNode, LinkedList<TrNetPat6Instance>> activity0InTrNetPat6Hash;
	ArrayList<TrNetPat7Instance> trNetPat7Array;
	int newCounterTrNetPat7EvolvedOutput;
	HashSet<TrNetPat7Instance> trNetPat7Set; 
		HashMap<ModelNode, LinkedList<TrNetPat7Instance>> activityPartition0InTrNetPat7Hash;
		HashMap<ModelNode, LinkedList<TrNetPat7Instance>> activity0InTrNetPat7Hash;
	ArrayList<TrNetPat20Instance> trNetPat20Array;
	int newCounterTrNetPat20EvolvedOutput;
	HashSet<TrNetPat20Instance> trNetPat20Set; 
		HashMap<ModelNode, LinkedList<TrNetPat20Instance>> activityPartition0InTrNetPat20Hash;
	ArrayList<TrNetPat44Instance> trNetPat44Array;
	int newCounterTrNetPat44TrNetOp39;
	HashSet<TrNetPat44Instance> trNetPat44Set; 
		HashMap<ModelNode, LinkedList<TrNetPat44Instance>> transition0InTrNetPat44Hash;
		HashMap<ModelNode, LinkedList<TrNetPat44Instance>> stateVertex0InTrNetPat44Hash;
		HashMap<ModelNode, LinkedList<TrNetPat44Instance>> stateVertex1InTrNetPat44Hash;
	ArrayList<TrNetPat45Instance> trNetPat45Array;
	int newCounterTrNetPat45TrNetOp40;
	int newCounterTrNetPat45TrNetOp8;
	HashSet<TrNetPat45Instance> trNetPat45Set; 
		HashMap<ModelNode, LinkedList<TrNetPat45Instance>> objectFlow0InTrNetPat45Hash;
		HashMap<ModelNode, LinkedList<TrNetPat45Instance>> transition0InTrNetPat45Hash;
	ArrayList<TrNetPat46Instance> trNetPat46Array;
	int newCounterTrNetPat46EvolvedOutput;
	HashSet<TrNetPat46Instance> trNetPat46Set; 
		HashMap<ModelNode, LinkedList<TrNetPat46Instance>> objectFlow0InTrNetPat46Hash;
	ArrayList<TrNetPat28Instance> trNetPat28Array;
	int newCounterTrNetPat28TrNetOp7;
	HashSet<TrNetPat28Instance> trNetPat28Set; 
		HashMap<ModelNode, LinkedList<TrNetPat28Instance>> activityGraph0InTrNetPat28Hash;
		HashMap<ModelNode, LinkedList<TrNetPat28Instance>> transition0InTrNetPat28Hash;
	ArrayList<TrNetPat8Instance> trNetPat8Array;
	int newCounterTrNetPat8TrNetOp8;
	int newCounterTrNetPat8TrNetOp10;
	HashSet<TrNetPat8Instance> trNetPat8Set; 
		HashMap<ModelNode, LinkedList<TrNetPat8Instance>> activityGraph0InTrNetPat8Hash;
		HashMap<ModelNode, LinkedList<TrNetPat8Instance>> transition0InTrNetPat8Hash;
		HashMap<ModelNode, LinkedList<TrNetPat8Instance>> activity0InTrNetPat8Hash;
	ArrayList<TrNetPat9Instance> trNetPat9Array;
	int newCounterTrNetPat9TrNetOp9;
	HashSet<TrNetPat9Instance> trNetPat9Set; 
		HashMap<ModelNode, LinkedList<TrNetPat9Instance>> activityGraph0InTrNetPat9Hash;
		HashMap<ModelNode, LinkedList<TrNetPat9Instance>> transition0InTrNetPat9Hash;
		HashMap<ModelNode, LinkedList<TrNetPat9Instance>> activity0InTrNetPat9Hash;
		HashMap<ModelNode, LinkedList<TrNetPat9Instance>> objectFlow0InTrNetPat9Hash;
	ArrayList<TrNetPat10Instance> trNetPat10Array;
	int newCounterTrNetPat10EvolvedOutput;
	HashSet<TrNetPat10Instance> trNetPat10Set; 
		HashMap<ModelNode, LinkedList<TrNetPat10Instance>> activity0InTrNetPat10Hash;
		HashMap<ModelNode, LinkedList<TrNetPat10Instance>> objectFlow0InTrNetPat10Hash;
	ArrayList<TrNetPat29Instance> trNetPat29Array;
	int newCounterTrNetPat29TrNetOp25;
	int newCounterTrNetPat29TrNetOp38;
	int newCounterTrNetPat29TrNetOp35;
	HashSet<TrNetPat29Instance> trNetPat29Set; 
		HashMap<ModelNode, LinkedList<TrNetPat29Instance>> transition0InTrNetPat29Hash;
		HashMap<ModelNode, LinkedList<TrNetPat29Instance>> stateVertex0InTrNetPat29Hash;
	ArrayList<TrNetPat47Instance> trNetPat47Array;
	int newCounterTrNetPat47TrNetOp25;
	int newCounterTrNetPat47TrNetOp38;
	int newCounterTrNetPat47TrNetOp32;
	HashSet<TrNetPat47Instance> trNetPat47Set; 
		HashMap<ModelNode, LinkedList<TrNetPat47Instance>> transition0InTrNetPat47Hash;
		HashMap<ModelNode, LinkedList<TrNetPat47Instance>> stateVertex0InTrNetPat47Hash;
	ArrayList<TrNetPat30Instance> trNetPat30Array;
	int newCounterTrNetPat30TrNetOp26;
	HashSet<TrNetPat30Instance> trNetPat30Set; 
		HashMap<ModelNode, LinkedList<TrNetPat30Instance>> transition0InTrNetPat30Hash;
		HashMap<ModelNode, LinkedList<TrNetPat30Instance>> stateVertex0InTrNetPat30Hash;
		HashMap<ModelNode, LinkedList<TrNetPat30Instance>> stateVertex1InTrNetPat30Hash;
	ArrayList<TrNetPat31Instance> trNetPat31Array;
	int newCounterTrNetPat31TrNetOp27;
	int newCounterTrNetPat31TrNetOp10;
	HashSet<TrNetPat31Instance> trNetPat31Set; 
		HashMap<ModelNode, LinkedList<TrNetPat31Instance>> controlFlow0InTrNetPat31Hash;
		HashMap<ModelNode, LinkedList<TrNetPat31Instance>> transition0InTrNetPat31Hash;
	ArrayList<TrNetPat32Instance> trNetPat32Array;
	int newCounterTrNetPat32EvolvedOutput;
	HashSet<TrNetPat32Instance> trNetPat32Set; 
		HashMap<ModelNode, LinkedList<TrNetPat32Instance>> controlFlow0InTrNetPat32Hash;
	ArrayList<TrNetPat11Instance> trNetPat11Array;
	int newCounterTrNetPat11TrNetOp11;
	HashSet<TrNetPat11Instance> trNetPat11Set; 
		HashMap<ModelNode, LinkedList<TrNetPat11Instance>> activityGraph0InTrNetPat11Hash;
		HashMap<ModelNode, LinkedList<TrNetPat11Instance>> transition0InTrNetPat11Hash;
		HashMap<ModelNode, LinkedList<TrNetPat11Instance>> activity0InTrNetPat11Hash;
		HashMap<ModelNode, LinkedList<TrNetPat11Instance>> controlFlow0InTrNetPat11Hash;
	ArrayList<TrNetPat12Instance> trNetPat12Array;
	int newCounterTrNetPat12EvolvedOutput;
	HashSet<TrNetPat12Instance> trNetPat12Set; 
		HashMap<ModelNode, LinkedList<TrNetPat12Instance>> activity0InTrNetPat12Hash;
		HashMap<ModelNode, LinkedList<TrNetPat12Instance>> controlFlow0InTrNetPat12Hash;
	ArrayList<TrNetPat48Instance> trNetPat48Array;
	int newCounterTrNetPat48TrNetOp41;
	HashSet<TrNetPat48Instance> trNetPat48Set; 
		HashMap<ModelNode, LinkedList<TrNetPat48Instance>> actionState0InTrNetPat48Hash;
	ArrayList<TrNetPat49Instance> trNetPat49Array;
	int newCounterTrNetPat49TrNetOp42;
	int newCounterTrNetPat49TrNetOp43;
	HashSet<TrNetPat49Instance> trNetPat49Set; 
		HashMap<ModelNode, LinkedList<TrNetPat49Instance>> actionState0InTrNetPat49Hash;
		HashMap<ModelNode, LinkedList<TrNetPat49Instance>> opaqueAction0InTrNetPat49Hash;
	ArrayList<TrNetPat50Instance> trNetPat50Array;
	int newCounterTrNetPat50EvolvedOutput;
	HashSet<TrNetPat50Instance> trNetPat50Set; 
		HashMap<ModelNode, LinkedList<TrNetPat50Instance>> opaqueAction0InTrNetPat50Hash;
	ArrayList<TrNetPat52Instance> trNetPat52Array;
	int newCounterTrNetPat52TrNetOp15;
	HashSet<TrNetPat52Instance> trNetPat52Set; 
		HashMap<ModelNode, LinkedList<TrNetPat52Instance>> compositeState0InTrNetPat52Hash;
		HashMap<ModelNode, LinkedList<TrNetPat52Instance>> stateVertex0InTrNetPat52Hash;
	ArrayList<TrNetPat16Instance> trNetPat16Array;
	int newCounterTrNetPat16TrNetOp12;
	HashSet<TrNetPat16Instance> trNetPat16Set; 
		HashMap<ModelNode, LinkedList<TrNetPat16Instance>> compositeState0InTrNetPat16Hash;
		HashMap<ModelNode, LinkedList<TrNetPat16Instance>> stateVertex0InTrNetPat16Hash;
		HashMap<ModelNode, LinkedList<TrNetPat16Instance>> activityGraph0InTrNetPat16Hash;
	ArrayList<TrNetPat13Instance> trNetPat13Array;
	int newCounterTrNetPat13TrNetOp13;
	HashSet<TrNetPat13Instance> trNetPat13Set; 
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> compositeState0InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> stateVertex0InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> activityGraph0InTrNetPat13Hash;
		HashMap<ModelNode, LinkedList<TrNetPat13Instance>> activity0InTrNetPat13Hash;
	ArrayList<TrNetPat14Instance> trNetPat14Array;
	int newCounterTrNetPat14TrNetOp14;
	HashSet<TrNetPat14Instance> trNetPat14Set; 
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> compositeState0InTrNetPat14Hash;
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> stateVertex0InTrNetPat14Hash;
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> activityGraph0InTrNetPat14Hash;
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> activity0InTrNetPat14Hash;
		HashMap<ModelNode, LinkedList<TrNetPat14Instance>> activityNode0InTrNetPat14Hash;
	ArrayList<TrNetPat15Instance> trNetPat15Array;
	int newCounterTrNetPat15EvolvedOutput;
	HashSet<TrNetPat15Instance> trNetPat15Set; 
		HashMap<ModelNode, LinkedList<TrNetPat15Instance>> activityNode0InTrNetPat15Hash;
		HashMap<ModelNode, LinkedList<TrNetPat15Instance>> activity0InTrNetPat15Hash;
	ArrayList<TrNetPat53Instance> trNetPat53Array;
	int newCounterTrNetPat53TrNetOp44;
	HashSet<TrNetPat53Instance> trNetPat53Set; 
		HashMap<ModelNode, LinkedList<TrNetPat53Instance>> finalState0InTrNetPat53Hash;
	ArrayList<TrNetPat54Instance> trNetPat54Array;
	int newCounterTrNetPat54TrNetOp45;
	HashSet<TrNetPat54Instance> trNetPat54Set; 
		HashMap<ModelNode, LinkedList<TrNetPat54Instance>> finalState0InTrNetPat54Hash;
		HashMap<ModelNode, LinkedList<TrNetPat54Instance>> activityFinalNode0InTrNetPat54Hash;
	ArrayList<TrNetPat55Instance> trNetPat55Array;
	int newCounterTrNetPat55EvolvedOutput;
	HashSet<TrNetPat55Instance> trNetPat55Set; 
		HashMap<ModelNode, LinkedList<TrNetPat55Instance>> activityFinalNode0InTrNetPat55Hash;
	ArrayList<TrNetPat56Instance> trNetPat56Array;
	int newCounterTrNetPat56TrNetOp46;
	int newCounterTrNetPat56TrNetOp48;
	int newCounterTrNetPat56TrNetOp50;
	int newCounterTrNetPat56TrNetOp52;
	HashSet<TrNetPat56Instance> trNetPat56Set; 
		HashMap<ModelNode, LinkedList<TrNetPat56Instance>> pseudostate0InTrNetPat56Hash;
	ArrayList<TrNetPat57Instance> trNetPat57Array;
	int newCounterTrNetPat57TrNetOp47;
	HashSet<TrNetPat57Instance> trNetPat57Set; 
		HashMap<ModelNode, LinkedList<TrNetPat57Instance>> pseudostate0InTrNetPat57Hash;
		HashMap<ModelNode, LinkedList<TrNetPat57Instance>> initialNode0InTrNetPat57Hash;
	ArrayList<TrNetPat58Instance> trNetPat58Array;
	int newCounterTrNetPat58EvolvedOutput;
	HashSet<TrNetPat58Instance> trNetPat58Set; 
		HashMap<ModelNode, LinkedList<TrNetPat58Instance>> initialNode0InTrNetPat58Hash;
	ArrayList<TrNetPat51Instance> trNetPat51Array;
	int newCounterTrNetPat51TrNetOp13;
	int newCounterTrNetPat51TrNetOp33;
	int newCounterTrNetPat51TrNetOp36;
	int newCounterTrNetPat51TrNetOp23;
	HashSet<TrNetPat51Instance> trNetPat51Set; 
		HashMap<ModelNode, LinkedList<TrNetPat51Instance>> stateVertex0InTrNetPat51Hash;
		HashMap<ModelNode, LinkedList<TrNetPat51Instance>> activityNode0InTrNetPat51Hash;
	ArrayList<TrNetPat59Instance> trNetPat59Array;
	int newCounterTrNetPat59TrNetOp49;
	HashSet<TrNetPat59Instance> trNetPat59Set; 
		HashMap<ModelNode, LinkedList<TrNetPat59Instance>> pseudostate0InTrNetPat59Hash;
		HashMap<ModelNode, LinkedList<TrNetPat59Instance>> joinNode0InTrNetPat59Hash;
	ArrayList<TrNetPat60Instance> trNetPat60Array;
	int newCounterTrNetPat60EvolvedOutput;
	HashSet<TrNetPat60Instance> trNetPat60Set; 
		HashMap<ModelNode, LinkedList<TrNetPat60Instance>> joinNode0InTrNetPat60Hash;
	ArrayList<TrNetPat61Instance> trNetPat61Array;
	int newCounterTrNetPat61TrNetOp51;
	HashSet<TrNetPat61Instance> trNetPat61Set; 
		HashMap<ModelNode, LinkedList<TrNetPat61Instance>> pseudostate0InTrNetPat61Hash;
		HashMap<ModelNode, LinkedList<TrNetPat61Instance>> forkNode0InTrNetPat61Hash;
	ArrayList<TrNetPat62Instance> trNetPat62Array;
	int newCounterTrNetPat62EvolvedOutput;
	HashSet<TrNetPat62Instance> trNetPat62Set; 
		HashMap<ModelNode, LinkedList<TrNetPat62Instance>> forkNode0InTrNetPat62Hash;
	ArrayList<TrNetPat63Instance> trNetPat63Array;
	int newCounterTrNetPat63TrNetOp53;
	HashSet<TrNetPat63Instance> trNetPat63Set; 
		HashMap<ModelNode, LinkedList<TrNetPat63Instance>> pseudostate0InTrNetPat63Hash;
		HashMap<ModelNode, LinkedList<TrNetPat63Instance>> decisionNode0InTrNetPat63Hash;
	ArrayList<TrNetPat64Instance> trNetPat64Array;
	int newCounterTrNetPat64EvolvedOutput;
	HashSet<TrNetPat64Instance> trNetPat64Set; 
		HashMap<ModelNode, LinkedList<TrNetPat64Instance>> decisionNode0InTrNetPat64Hash;
	ArrayList<TrNetPat65Instance> trNetPat65Array;
	int newCounterTrNetPat65TrNetOp54;
	HashSet<TrNetPat65Instance> trNetPat65Set; 
		HashMap<ModelNode, LinkedList<TrNetPat65Instance>> objectFlowState0InTrNetPat65Hash;
	ArrayList<TrNetPat66Instance> trNetPat66Array;
	int newCounterTrNetPat66TrNetOp55;
	HashSet<TrNetPat66Instance> trNetPat66Set; 
		HashMap<ModelNode, LinkedList<TrNetPat66Instance>> objectFlowState0InTrNetPat66Hash;
		HashMap<ModelNode, LinkedList<TrNetPat66Instance>> activityParameterNode0InTrNetPat66Hash;
	ArrayList<TrNetPat67Instance> trNetPat67Array;
	int newCounterTrNetPat67EvolvedOutput;
	HashSet<TrNetPat67Instance> trNetPat67Set; 
		HashMap<ModelNode, LinkedList<TrNetPat67Instance>> activityParameterNode0InTrNetPat67Hash;
	ArrayList<TrNetPat68Instance> trNetPat68Array;
	int newCounterTrNetPat68TrNetOp28;
	HashSet<TrNetPat68Instance> trNetPat68Set; 
		HashMap<ModelNode, LinkedList<TrNetPat68Instance>> guard0InTrNetPat68Hash;
		HashMap<ModelNode, LinkedList<TrNetPat68Instance>> transition0InTrNetPat68Hash;
	ArrayList<TrNetPat33Instance> trNetPat33Array;
	int newCounterTrNetPat33TrNetOp28;
	int newCounterTrNetPat33TrNetOp32;
	int newCounterTrNetPat33TrNetOp35;
	int newCounterTrNetPat33TrNetOp20;
	HashSet<TrNetPat33Instance> trNetPat33Set; 
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> activityEdge0InTrNetPat33Hash;
		HashMap<ModelNode, LinkedList<TrNetPat33Instance>> transition0InTrNetPat33Hash;
	ArrayList<TrNetPat34Instance> trNetPat34Array;
	int newCounterTrNetPat34TrNetOp29;
	HashSet<TrNetPat34Instance> trNetPat34Set; 
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> guard0InTrNetPat34Hash;
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> transition0InTrNetPat34Hash;
		HashMap<ModelNode, LinkedList<TrNetPat34Instance>> activityEdge0InTrNetPat34Hash;
	ArrayList<TrNetPat36Instance> trNetPat36Array;
	int newCounterTrNetPat36EvolvedOutput;
	int newCounterTrNetPat36TrNetOp31;
	HashSet<TrNetPat36Instance> trNetPat36Set; 
		HashMap<ModelNode, LinkedList<TrNetPat36Instance>> opaqueExpression0InTrNetPat36Hash;
		HashMap<ModelNode, LinkedList<TrNetPat36Instance>> activityEdge0InTrNetPat36Hash;
	ArrayList<TrNetPat37Instance> trNetPat37Array;
	int newCounterTrNetPat37EvolvedOutput;
	HashSet<TrNetPat37Instance> trNetPat37Set; 
		HashMap<ModelNode, LinkedList<TrNetPat37Instance>> opaqueExpression0InTrNetPat37Hash;
	ArrayList<TrNetPat69Instance> trNetPat69Array;
	int newCounterTrNetPat69TrNetOp29;
	HashSet<TrNetPat69Instance> trNetPat69Set; 
		HashMap<ModelNode, LinkedList<TrNetPat69Instance>> booleanExpression0InTrNetPat69Hash;
		HashMap<ModelNode, LinkedList<TrNetPat69Instance>> guard0InTrNetPat69Hash;
	ArrayList<TrNetPat35Instance> trNetPat35Array;
	int newCounterTrNetPat35TrNetOp30;
	HashSet<TrNetPat35Instance> trNetPat35Set; 
		HashMap<ModelNode, LinkedList<TrNetPat35Instance>> guard0InTrNetPat35Hash;
		HashMap<ModelNode, LinkedList<TrNetPat35Instance>> transition0InTrNetPat35Hash;
		HashMap<ModelNode, LinkedList<TrNetPat35Instance>> activityEdge0InTrNetPat35Hash;
		HashMap<ModelNode, LinkedList<TrNetPat35Instance>> booleanExpression0InTrNetPat35Hash;
	ArrayList<TrNetPat38Instance> trNetPat38Array;
	int newCounterTrNetPat38TrNetOp33;
	HashSet<TrNetPat38Instance> trNetPat38Set; 
		HashMap<ModelNode, LinkedList<TrNetPat38Instance>> activityEdge0InTrNetPat38Hash;
		HashMap<ModelNode, LinkedList<TrNetPat38Instance>> transition0InTrNetPat38Hash;
		HashMap<ModelNode, LinkedList<TrNetPat38Instance>> stateVertex0InTrNetPat38Hash;
	ArrayList<TrNetPat39Instance> trNetPat39Array;
	int newCounterTrNetPat39TrNetOp34;
	HashSet<TrNetPat39Instance> trNetPat39Set; 
		HashMap<ModelNode, LinkedList<TrNetPat39Instance>> activityEdge0InTrNetPat39Hash;
		HashMap<ModelNode, LinkedList<TrNetPat39Instance>> transition0InTrNetPat39Hash;
		HashMap<ModelNode, LinkedList<TrNetPat39Instance>> stateVertex0InTrNetPat39Hash;
		HashMap<ModelNode, LinkedList<TrNetPat39Instance>> activityNode0InTrNetPat39Hash;
	ArrayList<TrNetPat40Instance> trNetPat40Array;
	int newCounterTrNetPat40EvolvedOutput;
	HashSet<TrNetPat40Instance> trNetPat40Set; 
		HashMap<ModelNode, LinkedList<TrNetPat40Instance>> activityEdge0InTrNetPat40Hash;
		HashMap<ModelNode, LinkedList<TrNetPat40Instance>> activityNode0InTrNetPat40Hash;
	ArrayList<TrNetPat41Instance> trNetPat41Array;
	int newCounterTrNetPat41TrNetOp36;
	HashSet<TrNetPat41Instance> trNetPat41Set; 
		HashMap<ModelNode, LinkedList<TrNetPat41Instance>> activityEdge0InTrNetPat41Hash;
		HashMap<ModelNode, LinkedList<TrNetPat41Instance>> transition0InTrNetPat41Hash;
		HashMap<ModelNode, LinkedList<TrNetPat41Instance>> stateVertex0InTrNetPat41Hash;
	ArrayList<TrNetPat42Instance> trNetPat42Array;
	int newCounterTrNetPat42TrNetOp37;
	HashSet<TrNetPat42Instance> trNetPat42Set; 
		HashMap<ModelNode, LinkedList<TrNetPat42Instance>> activityEdge0InTrNetPat42Hash;
		HashMap<ModelNode, LinkedList<TrNetPat42Instance>> transition0InTrNetPat42Hash;
		HashMap<ModelNode, LinkedList<TrNetPat42Instance>> stateVertex0InTrNetPat42Hash;
		HashMap<ModelNode, LinkedList<TrNetPat42Instance>> activityNode0InTrNetPat42Hash;
	ArrayList<TrNetPat43Instance> trNetPat43Array;
	int newCounterTrNetPat43EvolvedOutput;
	HashSet<TrNetPat43Instance> trNetPat43Set; 
		HashMap<ModelNode, LinkedList<TrNetPat43Instance>> activityEdge0InTrNetPat43Hash;
		HashMap<ModelNode, LinkedList<TrNetPat43Instance>> activityNode0InTrNetPat43Hash;
	ArrayList<TrNetPat70Instance> trNetPat70Array;
	int newCounterTrNetPat70TrNetOp19;
	HashSet<TrNetPat70Instance> trNetPat70Set; 
		HashMap<ModelNode, LinkedList<TrNetPat70Instance>> partition0InTrNetPat70Hash;
		HashMap<ModelNode, LinkedList<TrNetPat70Instance>> transition0InTrNetPat70Hash;
	ArrayList<TrNetPat21Instance> trNetPat21Array;
	int newCounterTrNetPat21TrNetOp20;
	HashSet<TrNetPat21Instance> trNetPat21Set; 
		HashMap<ModelNode, LinkedList<TrNetPat21Instance>> partition0InTrNetPat21Hash;
		HashMap<ModelNode, LinkedList<TrNetPat21Instance>> transition0InTrNetPat21Hash;
		HashMap<ModelNode, LinkedList<TrNetPat21Instance>> activityPartition0InTrNetPat21Hash;
	ArrayList<TrNetPat22Instance> trNetPat22Array;
	int newCounterTrNetPat22TrNetOp21;
	HashSet<TrNetPat22Instance> trNetPat22Set; 
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> partition0InTrNetPat22Hash;
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> transition0InTrNetPat22Hash;
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> activityPartition0InTrNetPat22Hash;
		HashMap<ModelNode, LinkedList<TrNetPat22Instance>> activityEdge0InTrNetPat22Hash;
	ArrayList<TrNetPat23Instance> trNetPat23Array;
	int newCounterTrNetPat23EvolvedOutput;
	HashSet<TrNetPat23Instance> trNetPat23Set; 
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> activityPartition0InTrNetPat23Hash;
		HashMap<ModelNode, LinkedList<TrNetPat23Instance>> activityEdge0InTrNetPat23Hash;
	ArrayList<TrNetPat71Instance> trNetPat71Array;
	int newCounterTrNetPat71TrNetOp22;
	HashSet<TrNetPat71Instance> trNetPat71Set; 
		HashMap<ModelNode, LinkedList<TrNetPat71Instance>> partition0InTrNetPat71Hash;
		HashMap<ModelNode, LinkedList<TrNetPat71Instance>> stateVertex0InTrNetPat71Hash;
	ArrayList<TrNetPat24Instance> trNetPat24Array;
	int newCounterTrNetPat24TrNetOp23;
	HashSet<TrNetPat24Instance> trNetPat24Set; 
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> partition0InTrNetPat24Hash;
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> stateVertex0InTrNetPat24Hash;
		HashMap<ModelNode, LinkedList<TrNetPat24Instance>> activityPartition0InTrNetPat24Hash;
	ArrayList<TrNetPat25Instance> trNetPat25Array;
	int newCounterTrNetPat25TrNetOp24;
	HashSet<TrNetPat25Instance> trNetPat25Set; 
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> partition0InTrNetPat25Hash;
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> stateVertex0InTrNetPat25Hash;
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> activityPartition0InTrNetPat25Hash;
		HashMap<ModelNode, LinkedList<TrNetPat25Instance>> activityNode0InTrNetPat25Hash;
	ArrayList<TrNetPat26Instance> trNetPat26Array;
	int newCounterTrNetPat26EvolvedOutput;
	HashSet<TrNetPat26Instance> trNetPat26Set; 
		HashMap<ModelNode, LinkedList<TrNetPat26Instance>> activityPartition0InTrNetPat26Hash;
		HashMap<ModelNode, LinkedList<TrNetPat26Instance>> activityNode0InTrNetPat26Hash;
	
	public ActivityMigrationOriginalTransformation(){
		
	trNetPat1Array = new ArrayList<TrNetPat1Instance>(1); 
	newCounterTrNetPat1TrNetOp1 = 0;
	newCounterTrNetPat1TrNetOp15 = 0;
	trNetPat1Set = new HashSet<TrNetPat1Instance>(1); 
		activityGraph0InTrNetPat1Hash = new HashMap<ModelNode, LinkedList<TrNetPat1Instance>>(1);
		compositeState0InTrNetPat1Hash = new HashMap<ModelNode, LinkedList<TrNetPat1Instance>>(1);
	trNetPat2Array = new ArrayList<TrNetPat2Instance>(1); 
	newCounterTrNetPat2TrNetOp2 = 0;
	newCounterTrNetPat2TrNetOp5 = 0;
	newCounterTrNetPat2TrNetOp7 = 0;
	newCounterTrNetPat2TrNetOp12 = 0;
	trNetPat2Set = new HashSet<TrNetPat2Instance>(1); 
		activity0InTrNetPat2Hash = new HashMap<ModelNode, LinkedList<TrNetPat2Instance>>(1);
		package0InTrNetPat2Hash = new HashMap<ModelNode, LinkedList<TrNetPat2Instance>>(1);
		activityGraph0InTrNetPat2Hash = new HashMap<ModelNode, LinkedList<TrNetPat2Instance>>(1);
	trNetPat5Array = new ArrayList<TrNetPat5Instance>(1); 
	newCounterTrNetPat5EvolvedOutput = 0;
	trNetPat5Set = new HashSet<TrNetPat5Instance>(1); 
		package0InTrNetPat5Hash = new HashMap<ModelNode, LinkedList<TrNetPat5Instance>>(1);
	trNetPat4Array = new ArrayList<TrNetPat4Instance>(1); 
	newCounterTrNetPat4EvolvedOutput = 0;
	trNetPat4Set = new HashSet<TrNetPat4Instance>(1); 
		activity0InTrNetPat4Hash = new HashMap<ModelNode, LinkedList<TrNetPat4Instance>>(1);
	trNetPat3Array = new ArrayList<TrNetPat3Instance>(1); 
	newCounterTrNetPat3TrNetOp3 = 0;
	newCounterTrNetPat3TrNetOp4 = 0;
	newCounterTrNetPat3EvolvedOutput = 0;
	trNetPat3Set = new HashSet<TrNetPat3Instance>(1); 
		activity0InTrNetPat3Hash = new HashMap<ModelNode, LinkedList<TrNetPat3Instance>>(1);
		package0InTrNetPat3Hash = new HashMap<ModelNode, LinkedList<TrNetPat3Instance>>(1);
	trNetPat17Array = new ArrayList<TrNetPat17Instance>(10); 
	newCounterTrNetPat17TrNetOp16 = 0;
	trNetPat17Set = new HashSet<TrNetPat17Instance>(10); 
		partition0InTrNetPat17Hash = new HashMap<ModelNode, LinkedList<TrNetPat17Instance>>(10);
	trNetPat18Array = new ArrayList<TrNetPat18Instance>(10); 
	newCounterTrNetPat18TrNetOp17 = 0;
	newCounterTrNetPat18TrNetOp18 = 0;
	newCounterTrNetPat18TrNetOp19 = 0;
	newCounterTrNetPat18TrNetOp22 = 0;
	trNetPat18Set = new HashSet<TrNetPat18Instance>(10); 
		activityPartition0InTrNetPat18Hash = new HashMap<ModelNode, LinkedList<TrNetPat18Instance>>(10);
		partition0InTrNetPat18Hash = new HashMap<ModelNode, LinkedList<TrNetPat18Instance>>(10);
	trNetPat27Array = new ArrayList<TrNetPat27Instance>(10); 
	newCounterTrNetPat27TrNetOp17 = 0;
	trNetPat27Set = new HashSet<TrNetPat27Instance>(10); 
		activityGraph0InTrNetPat27Hash = new HashMap<ModelNode, LinkedList<TrNetPat27Instance>>(10);
		partition0InTrNetPat27Hash = new HashMap<ModelNode, LinkedList<TrNetPat27Instance>>(10);
	trNetPat19Array = new ArrayList<TrNetPat19Instance>(100); 
	newCounterTrNetPat19TrNetOp5 = 0;
	trNetPat19Set = new HashSet<TrNetPat19Instance>(100); 
		activityPartition0InTrNetPat19Hash = new HashMap<ModelNode, LinkedList<TrNetPat19Instance>>(100);
		partition0InTrNetPat19Hash = new HashMap<ModelNode, LinkedList<TrNetPat19Instance>>(100);
		activityGraph0InTrNetPat19Hash = new HashMap<ModelNode, LinkedList<TrNetPat19Instance>>(100);
	trNetPat6Array = new ArrayList<TrNetPat6Instance>(100); 
	newCounterTrNetPat6TrNetOp6 = 0;
	trNetPat6Set = new HashSet<TrNetPat6Instance>(100); 
		activityPartition0InTrNetPat6Hash = new HashMap<ModelNode, LinkedList<TrNetPat6Instance>>(100);
		partition0InTrNetPat6Hash = new HashMap<ModelNode, LinkedList<TrNetPat6Instance>>(100);
		activityGraph0InTrNetPat6Hash = new HashMap<ModelNode, LinkedList<TrNetPat6Instance>>(100);
		activity0InTrNetPat6Hash = new HashMap<ModelNode, LinkedList<TrNetPat6Instance>>(100);
	trNetPat7Array = new ArrayList<TrNetPat7Instance>(10); 
	newCounterTrNetPat7EvolvedOutput = 0;
	trNetPat7Set = new HashSet<TrNetPat7Instance>(10); 
		activityPartition0InTrNetPat7Hash = new HashMap<ModelNode, LinkedList<TrNetPat7Instance>>(10);
		activity0InTrNetPat7Hash = new HashMap<ModelNode, LinkedList<TrNetPat7Instance>>(10);
	trNetPat20Array = new ArrayList<TrNetPat20Instance>(10); 
	newCounterTrNetPat20EvolvedOutput = 0;
	trNetPat20Set = new HashSet<TrNetPat20Instance>(10); 
		activityPartition0InTrNetPat20Hash = new HashMap<ModelNode, LinkedList<TrNetPat20Instance>>(10);
	trNetPat44Array = new ArrayList<TrNetPat44Instance>(100); 
	newCounterTrNetPat44TrNetOp39 = 0;
	trNetPat44Set = new HashSet<TrNetPat44Instance>(100); 
		transition0InTrNetPat44Hash = new HashMap<ModelNode, LinkedList<TrNetPat44Instance>>(100);
		stateVertex0InTrNetPat44Hash = new HashMap<ModelNode, LinkedList<TrNetPat44Instance>>(100);
		stateVertex1InTrNetPat44Hash = new HashMap<ModelNode, LinkedList<TrNetPat44Instance>>(100);
	trNetPat45Array = new ArrayList<TrNetPat45Instance>(100); 
	newCounterTrNetPat45TrNetOp40 = 0;
	newCounterTrNetPat45TrNetOp8 = 0;
	trNetPat45Set = new HashSet<TrNetPat45Instance>(100); 
		objectFlow0InTrNetPat45Hash = new HashMap<ModelNode, LinkedList<TrNetPat45Instance>>(100);
		transition0InTrNetPat45Hash = new HashMap<ModelNode, LinkedList<TrNetPat45Instance>>(100);
	trNetPat46Array = new ArrayList<TrNetPat46Instance>(100); 
	newCounterTrNetPat46EvolvedOutput = 0;
	trNetPat46Set = new HashSet<TrNetPat46Instance>(100); 
		objectFlow0InTrNetPat46Hash = new HashMap<ModelNode, LinkedList<TrNetPat46Instance>>(100);
	trNetPat28Array = new ArrayList<TrNetPat28Instance>(100); 
	newCounterTrNetPat28TrNetOp7 = 0;
	trNetPat28Set = new HashSet<TrNetPat28Instance>(100); 
		activityGraph0InTrNetPat28Hash = new HashMap<ModelNode, LinkedList<TrNetPat28Instance>>(100);
		transition0InTrNetPat28Hash = new HashMap<ModelNode, LinkedList<TrNetPat28Instance>>(100);
	trNetPat8Array = new ArrayList<TrNetPat8Instance>(100); 
	newCounterTrNetPat8TrNetOp8 = 0;
	newCounterTrNetPat8TrNetOp10 = 0;
	trNetPat8Set = new HashSet<TrNetPat8Instance>(100); 
		activityGraph0InTrNetPat8Hash = new HashMap<ModelNode, LinkedList<TrNetPat8Instance>>(100);
		transition0InTrNetPat8Hash = new HashMap<ModelNode, LinkedList<TrNetPat8Instance>>(100);
		activity0InTrNetPat8Hash = new HashMap<ModelNode, LinkedList<TrNetPat8Instance>>(100);
	trNetPat9Array = new ArrayList<TrNetPat9Instance>(100); 
	newCounterTrNetPat9TrNetOp9 = 0;
	trNetPat9Set = new HashSet<TrNetPat9Instance>(100); 
		activityGraph0InTrNetPat9Hash = new HashMap<ModelNode, LinkedList<TrNetPat9Instance>>(100);
		transition0InTrNetPat9Hash = new HashMap<ModelNode, LinkedList<TrNetPat9Instance>>(100);
		activity0InTrNetPat9Hash = new HashMap<ModelNode, LinkedList<TrNetPat9Instance>>(100);
		objectFlow0InTrNetPat9Hash = new HashMap<ModelNode, LinkedList<TrNetPat9Instance>>(100);
	trNetPat10Array = new ArrayList<TrNetPat10Instance>(100); 
	newCounterTrNetPat10EvolvedOutput = 0;
	trNetPat10Set = new HashSet<TrNetPat10Instance>(100); 
		activity0InTrNetPat10Hash = new HashMap<ModelNode, LinkedList<TrNetPat10Instance>>(100);
		objectFlow0InTrNetPat10Hash = new HashMap<ModelNode, LinkedList<TrNetPat10Instance>>(100);
	trNetPat29Array = new ArrayList<TrNetPat29Instance>(100); 
	newCounterTrNetPat29TrNetOp25 = 0;
	newCounterTrNetPat29TrNetOp38 = 0;
	newCounterTrNetPat29TrNetOp35 = 0;
	trNetPat29Set = new HashSet<TrNetPat29Instance>(100); 
		transition0InTrNetPat29Hash = new HashMap<ModelNode, LinkedList<TrNetPat29Instance>>(100);
		stateVertex0InTrNetPat29Hash = new HashMap<ModelNode, LinkedList<TrNetPat29Instance>>(100);
	trNetPat47Array = new ArrayList<TrNetPat47Instance>(100); 
	newCounterTrNetPat47TrNetOp25 = 0;
	newCounterTrNetPat47TrNetOp38 = 0;
	newCounterTrNetPat47TrNetOp32 = 0;
	trNetPat47Set = new HashSet<TrNetPat47Instance>(100); 
		transition0InTrNetPat47Hash = new HashMap<ModelNode, LinkedList<TrNetPat47Instance>>(100);
		stateVertex0InTrNetPat47Hash = new HashMap<ModelNode, LinkedList<TrNetPat47Instance>>(100);
	trNetPat30Array = new ArrayList<TrNetPat30Instance>(100); 
	newCounterTrNetPat30TrNetOp26 = 0;
	trNetPat30Set = new HashSet<TrNetPat30Instance>(100); 
		transition0InTrNetPat30Hash = new HashMap<ModelNode, LinkedList<TrNetPat30Instance>>(100);
		stateVertex0InTrNetPat30Hash = new HashMap<ModelNode, LinkedList<TrNetPat30Instance>>(100);
		stateVertex1InTrNetPat30Hash = new HashMap<ModelNode, LinkedList<TrNetPat30Instance>>(100);
	trNetPat31Array = new ArrayList<TrNetPat31Instance>(100); 
	newCounterTrNetPat31TrNetOp27 = 0;
	newCounterTrNetPat31TrNetOp10 = 0;
	trNetPat31Set = new HashSet<TrNetPat31Instance>(100); 
		controlFlow0InTrNetPat31Hash = new HashMap<ModelNode, LinkedList<TrNetPat31Instance>>(100);
		transition0InTrNetPat31Hash = new HashMap<ModelNode, LinkedList<TrNetPat31Instance>>(100);
	trNetPat32Array = new ArrayList<TrNetPat32Instance>(100); 
	newCounterTrNetPat32EvolvedOutput = 0;
	trNetPat32Set = new HashSet<TrNetPat32Instance>(100); 
		controlFlow0InTrNetPat32Hash = new HashMap<ModelNode, LinkedList<TrNetPat32Instance>>(100);
	trNetPat11Array = new ArrayList<TrNetPat11Instance>(100); 
	newCounterTrNetPat11TrNetOp11 = 0;
	trNetPat11Set = new HashSet<TrNetPat11Instance>(100); 
		activityGraph0InTrNetPat11Hash = new HashMap<ModelNode, LinkedList<TrNetPat11Instance>>(100);
		transition0InTrNetPat11Hash = new HashMap<ModelNode, LinkedList<TrNetPat11Instance>>(100);
		activity0InTrNetPat11Hash = new HashMap<ModelNode, LinkedList<TrNetPat11Instance>>(100);
		controlFlow0InTrNetPat11Hash = new HashMap<ModelNode, LinkedList<TrNetPat11Instance>>(100);
	trNetPat12Array = new ArrayList<TrNetPat12Instance>(100); 
	newCounterTrNetPat12EvolvedOutput = 0;
	trNetPat12Set = new HashSet<TrNetPat12Instance>(100); 
		activity0InTrNetPat12Hash = new HashMap<ModelNode, LinkedList<TrNetPat12Instance>>(100);
		controlFlow0InTrNetPat12Hash = new HashMap<ModelNode, LinkedList<TrNetPat12Instance>>(100);
	trNetPat48Array = new ArrayList<TrNetPat48Instance>(14); 
	newCounterTrNetPat48TrNetOp41 = 0;
	trNetPat48Set = new HashSet<TrNetPat48Instance>(14); 
		actionState0InTrNetPat48Hash = new HashMap<ModelNode, LinkedList<TrNetPat48Instance>>(14);
	trNetPat49Array = new ArrayList<TrNetPat49Instance>(14); 
	newCounterTrNetPat49TrNetOp42 = 0;
	newCounterTrNetPat49TrNetOp43 = 0;
	trNetPat49Set = new HashSet<TrNetPat49Instance>(14); 
		actionState0InTrNetPat49Hash = new HashMap<ModelNode, LinkedList<TrNetPat49Instance>>(14);
		opaqueAction0InTrNetPat49Hash = new HashMap<ModelNode, LinkedList<TrNetPat49Instance>>(14);
	trNetPat50Array = new ArrayList<TrNetPat50Instance>(14); 
	newCounterTrNetPat50EvolvedOutput = 0;
	trNetPat50Set = new HashSet<TrNetPat50Instance>(14); 
		opaqueAction0InTrNetPat50Hash = new HashMap<ModelNode, LinkedList<TrNetPat50Instance>>(14);
	trNetPat52Array = new ArrayList<TrNetPat52Instance>(99); 
	newCounterTrNetPat52TrNetOp15 = 0;
	trNetPat52Set = new HashSet<TrNetPat52Instance>(99); 
		compositeState0InTrNetPat52Hash = new HashMap<ModelNode, LinkedList<TrNetPat52Instance>>(99);
		stateVertex0InTrNetPat52Hash = new HashMap<ModelNode, LinkedList<TrNetPat52Instance>>(99);
	trNetPat16Array = new ArrayList<TrNetPat16Instance>(99); 
	newCounterTrNetPat16TrNetOp12 = 0;
	trNetPat16Set = new HashSet<TrNetPat16Instance>(99); 
		compositeState0InTrNetPat16Hash = new HashMap<ModelNode, LinkedList<TrNetPat16Instance>>(99);
		stateVertex0InTrNetPat16Hash = new HashMap<ModelNode, LinkedList<TrNetPat16Instance>>(99);
		activityGraph0InTrNetPat16Hash = new HashMap<ModelNode, LinkedList<TrNetPat16Instance>>(99);
	trNetPat13Array = new ArrayList<TrNetPat13Instance>(99); 
	newCounterTrNetPat13TrNetOp13 = 0;
	trNetPat13Set = new HashSet<TrNetPat13Instance>(99); 
		compositeState0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(99);
		stateVertex0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(99);
		activityGraph0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(99);
		activity0InTrNetPat13Hash = new HashMap<ModelNode, LinkedList<TrNetPat13Instance>>(99);
	trNetPat14Array = new ArrayList<TrNetPat14Instance>(20); 
	newCounterTrNetPat14TrNetOp14 = 0;
	trNetPat14Set = new HashSet<TrNetPat14Instance>(20); 
		compositeState0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(20);
		stateVertex0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(20);
		activityGraph0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(20);
		activity0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(20);
		activityNode0InTrNetPat14Hash = new HashMap<ModelNode, LinkedList<TrNetPat14Instance>>(20);
	trNetPat15Array = new ArrayList<TrNetPat15Instance>(20); 
	newCounterTrNetPat15EvolvedOutput = 0;
	trNetPat15Set = new HashSet<TrNetPat15Instance>(20); 
		activityNode0InTrNetPat15Hash = new HashMap<ModelNode, LinkedList<TrNetPat15Instance>>(20);
		activity0InTrNetPat15Hash = new HashMap<ModelNode, LinkedList<TrNetPat15Instance>>(20);
	trNetPat53Array = new ArrayList<TrNetPat53Instance>(20); 
	newCounterTrNetPat53TrNetOp44 = 0;
	trNetPat53Set = new HashSet<TrNetPat53Instance>(20); 
		finalState0InTrNetPat53Hash = new HashMap<ModelNode, LinkedList<TrNetPat53Instance>>(20);
	trNetPat54Array = new ArrayList<TrNetPat54Instance>(20); 
	newCounterTrNetPat54TrNetOp45 = 0;
	trNetPat54Set = new HashSet<TrNetPat54Instance>(20); 
		finalState0InTrNetPat54Hash = new HashMap<ModelNode, LinkedList<TrNetPat54Instance>>(20);
		activityFinalNode0InTrNetPat54Hash = new HashMap<ModelNode, LinkedList<TrNetPat54Instance>>(20);
	trNetPat55Array = new ArrayList<TrNetPat55Instance>(20); 
	newCounterTrNetPat55EvolvedOutput = 0;
	trNetPat55Set = new HashSet<TrNetPat55Instance>(20); 
		activityFinalNode0InTrNetPat55Hash = new HashMap<ModelNode, LinkedList<TrNetPat55Instance>>(20);
	trNetPat56Array = new ArrayList<TrNetPat56Instance>(53); 
	newCounterTrNetPat56TrNetOp46 = 0;
	newCounterTrNetPat56TrNetOp48 = 0;
	newCounterTrNetPat56TrNetOp50 = 0;
	newCounterTrNetPat56TrNetOp52 = 0;
	trNetPat56Set = new HashSet<TrNetPat56Instance>(53); 
		pseudostate0InTrNetPat56Hash = new HashMap<ModelNode, LinkedList<TrNetPat56Instance>>(53);
	trNetPat57Array = new ArrayList<TrNetPat57Instance>(13); 
	newCounterTrNetPat57TrNetOp47 = 0;
	trNetPat57Set = new HashSet<TrNetPat57Instance>(13); 
		pseudostate0InTrNetPat57Hash = new HashMap<ModelNode, LinkedList<TrNetPat57Instance>>(13);
		initialNode0InTrNetPat57Hash = new HashMap<ModelNode, LinkedList<TrNetPat57Instance>>(13);
	trNetPat58Array = new ArrayList<TrNetPat58Instance>(13); 
	newCounterTrNetPat58EvolvedOutput = 0;
	trNetPat58Set = new HashSet<TrNetPat58Instance>(13); 
		initialNode0InTrNetPat58Hash = new HashMap<ModelNode, LinkedList<TrNetPat58Instance>>(13);
	trNetPat51Array = new ArrayList<TrNetPat51Instance>(20); 
	newCounterTrNetPat51TrNetOp13 = 0;
	newCounterTrNetPat51TrNetOp33 = 0;
	newCounterTrNetPat51TrNetOp36 = 0;
	newCounterTrNetPat51TrNetOp23 = 0;
	trNetPat51Set = new HashSet<TrNetPat51Instance>(20); 
		stateVertex0InTrNetPat51Hash = new HashMap<ModelNode, LinkedList<TrNetPat51Instance>>(20);
		activityNode0InTrNetPat51Hash = new HashMap<ModelNode, LinkedList<TrNetPat51Instance>>(20);
	trNetPat59Array = new ArrayList<TrNetPat59Instance>(13); 
	newCounterTrNetPat59TrNetOp49 = 0;
	trNetPat59Set = new HashSet<TrNetPat59Instance>(13); 
		pseudostate0InTrNetPat59Hash = new HashMap<ModelNode, LinkedList<TrNetPat59Instance>>(13);
		joinNode0InTrNetPat59Hash = new HashMap<ModelNode, LinkedList<TrNetPat59Instance>>(13);
	trNetPat60Array = new ArrayList<TrNetPat60Instance>(13); 
	newCounterTrNetPat60EvolvedOutput = 0;
	trNetPat60Set = new HashSet<TrNetPat60Instance>(13); 
		joinNode0InTrNetPat60Hash = new HashMap<ModelNode, LinkedList<TrNetPat60Instance>>(13);
	trNetPat61Array = new ArrayList<TrNetPat61Instance>(13); 
	newCounterTrNetPat61TrNetOp51 = 0;
	trNetPat61Set = new HashSet<TrNetPat61Instance>(13); 
		pseudostate0InTrNetPat61Hash = new HashMap<ModelNode, LinkedList<TrNetPat61Instance>>(13);
		forkNode0InTrNetPat61Hash = new HashMap<ModelNode, LinkedList<TrNetPat61Instance>>(13);
	trNetPat62Array = new ArrayList<TrNetPat62Instance>(13); 
	newCounterTrNetPat62EvolvedOutput = 0;
	trNetPat62Set = new HashSet<TrNetPat62Instance>(13); 
		forkNode0InTrNetPat62Hash = new HashMap<ModelNode, LinkedList<TrNetPat62Instance>>(13);
	trNetPat63Array = new ArrayList<TrNetPat63Instance>(13); 
	newCounterTrNetPat63TrNetOp53 = 0;
	trNetPat63Set = new HashSet<TrNetPat63Instance>(13); 
		pseudostate0InTrNetPat63Hash = new HashMap<ModelNode, LinkedList<TrNetPat63Instance>>(13);
		decisionNode0InTrNetPat63Hash = new HashMap<ModelNode, LinkedList<TrNetPat63Instance>>(13);
	trNetPat64Array = new ArrayList<TrNetPat64Instance>(13); 
	newCounterTrNetPat64EvolvedOutput = 0;
	trNetPat64Set = new HashSet<TrNetPat64Instance>(13); 
		decisionNode0InTrNetPat64Hash = new HashMap<ModelNode, LinkedList<TrNetPat64Instance>>(13);
	trNetPat65Array = new ArrayList<TrNetPat65Instance>(12); 
	newCounterTrNetPat65TrNetOp54 = 0;
	trNetPat65Set = new HashSet<TrNetPat65Instance>(12); 
		objectFlowState0InTrNetPat65Hash = new HashMap<ModelNode, LinkedList<TrNetPat65Instance>>(12);
	trNetPat66Array = new ArrayList<TrNetPat66Instance>(12); 
	newCounterTrNetPat66TrNetOp55 = 0;
	trNetPat66Set = new HashSet<TrNetPat66Instance>(12); 
		objectFlowState0InTrNetPat66Hash = new HashMap<ModelNode, LinkedList<TrNetPat66Instance>>(12);
		activityParameterNode0InTrNetPat66Hash = new HashMap<ModelNode, LinkedList<TrNetPat66Instance>>(12);
	trNetPat67Array = new ArrayList<TrNetPat67Instance>(12); 
	newCounterTrNetPat67EvolvedOutput = 0;
	trNetPat67Set = new HashSet<TrNetPat67Instance>(12); 
		activityParameterNode0InTrNetPat67Hash = new HashMap<ModelNode, LinkedList<TrNetPat67Instance>>(12);
	trNetPat68Array = new ArrayList<TrNetPat68Instance>(44); 
	newCounterTrNetPat68TrNetOp28 = 0;
	trNetPat68Set = new HashSet<TrNetPat68Instance>(44); 
		guard0InTrNetPat68Hash = new HashMap<ModelNode, LinkedList<TrNetPat68Instance>>(44);
		transition0InTrNetPat68Hash = new HashMap<ModelNode, LinkedList<TrNetPat68Instance>>(44);
	trNetPat33Array = new ArrayList<TrNetPat33Instance>(100); 
	newCounterTrNetPat33TrNetOp28 = 0;
	newCounterTrNetPat33TrNetOp32 = 0;
	newCounterTrNetPat33TrNetOp35 = 0;
	newCounterTrNetPat33TrNetOp20 = 0;
	trNetPat33Set = new HashSet<TrNetPat33Instance>(100); 
		activityEdge0InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(100);
		transition0InTrNetPat33Hash = new HashMap<ModelNode, LinkedList<TrNetPat33Instance>>(100);
	trNetPat34Array = new ArrayList<TrNetPat34Instance>(44); 
	newCounterTrNetPat34TrNetOp29 = 0;
	trNetPat34Set = new HashSet<TrNetPat34Instance>(44); 
		guard0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(44);
		transition0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(44);
		activityEdge0InTrNetPat34Hash = new HashMap<ModelNode, LinkedList<TrNetPat34Instance>>(44);
	trNetPat36Array = new ArrayList<TrNetPat36Instance>(44); 
	newCounterTrNetPat36EvolvedOutput = 0;
	newCounterTrNetPat36TrNetOp31 = 0;
	trNetPat36Set = new HashSet<TrNetPat36Instance>(44); 
		opaqueExpression0InTrNetPat36Hash = new HashMap<ModelNode, LinkedList<TrNetPat36Instance>>(44);
		activityEdge0InTrNetPat36Hash = new HashMap<ModelNode, LinkedList<TrNetPat36Instance>>(44);
	trNetPat37Array = new ArrayList<TrNetPat37Instance>(44); 
	newCounterTrNetPat37EvolvedOutput = 0;
	trNetPat37Set = new HashSet<TrNetPat37Instance>(44); 
		opaqueExpression0InTrNetPat37Hash = new HashMap<ModelNode, LinkedList<TrNetPat37Instance>>(44);
	trNetPat69Array = new ArrayList<TrNetPat69Instance>(44); 
	newCounterTrNetPat69TrNetOp29 = 0;
	trNetPat69Set = new HashSet<TrNetPat69Instance>(44); 
		booleanExpression0InTrNetPat69Hash = new HashMap<ModelNode, LinkedList<TrNetPat69Instance>>(44);
		guard0InTrNetPat69Hash = new HashMap<ModelNode, LinkedList<TrNetPat69Instance>>(44);
	trNetPat35Array = new ArrayList<TrNetPat35Instance>(44); 
	newCounterTrNetPat35TrNetOp30 = 0;
	trNetPat35Set = new HashSet<TrNetPat35Instance>(44); 
		guard0InTrNetPat35Hash = new HashMap<ModelNode, LinkedList<TrNetPat35Instance>>(44);
		transition0InTrNetPat35Hash = new HashMap<ModelNode, LinkedList<TrNetPat35Instance>>(44);
		activityEdge0InTrNetPat35Hash = new HashMap<ModelNode, LinkedList<TrNetPat35Instance>>(44);
		booleanExpression0InTrNetPat35Hash = new HashMap<ModelNode, LinkedList<TrNetPat35Instance>>(44);
	trNetPat38Array = new ArrayList<TrNetPat38Instance>(100); 
	newCounterTrNetPat38TrNetOp33 = 0;
	trNetPat38Set = new HashSet<TrNetPat38Instance>(100); 
		activityEdge0InTrNetPat38Hash = new HashMap<ModelNode, LinkedList<TrNetPat38Instance>>(100);
		transition0InTrNetPat38Hash = new HashMap<ModelNode, LinkedList<TrNetPat38Instance>>(100);
		stateVertex0InTrNetPat38Hash = new HashMap<ModelNode, LinkedList<TrNetPat38Instance>>(100);
	trNetPat39Array = new ArrayList<TrNetPat39Instance>(32); 
	newCounterTrNetPat39TrNetOp34 = 0;
	trNetPat39Set = new HashSet<TrNetPat39Instance>(32); 
		activityEdge0InTrNetPat39Hash = new HashMap<ModelNode, LinkedList<TrNetPat39Instance>>(32);
		transition0InTrNetPat39Hash = new HashMap<ModelNode, LinkedList<TrNetPat39Instance>>(32);
		stateVertex0InTrNetPat39Hash = new HashMap<ModelNode, LinkedList<TrNetPat39Instance>>(32);
		activityNode0InTrNetPat39Hash = new HashMap<ModelNode, LinkedList<TrNetPat39Instance>>(32);
	trNetPat40Array = new ArrayList<TrNetPat40Instance>(32); 
	newCounterTrNetPat40EvolvedOutput = 0;
	trNetPat40Set = new HashSet<TrNetPat40Instance>(32); 
		activityEdge0InTrNetPat40Hash = new HashMap<ModelNode, LinkedList<TrNetPat40Instance>>(32);
		activityNode0InTrNetPat40Hash = new HashMap<ModelNode, LinkedList<TrNetPat40Instance>>(32);
	trNetPat41Array = new ArrayList<TrNetPat41Instance>(100); 
	newCounterTrNetPat41TrNetOp36 = 0;
	trNetPat41Set = new HashSet<TrNetPat41Instance>(100); 
		activityEdge0InTrNetPat41Hash = new HashMap<ModelNode, LinkedList<TrNetPat41Instance>>(100);
		transition0InTrNetPat41Hash = new HashMap<ModelNode, LinkedList<TrNetPat41Instance>>(100);
		stateVertex0InTrNetPat41Hash = new HashMap<ModelNode, LinkedList<TrNetPat41Instance>>(100);
	trNetPat42Array = new ArrayList<TrNetPat42Instance>(31); 
	newCounterTrNetPat42TrNetOp37 = 0;
	trNetPat42Set = new HashSet<TrNetPat42Instance>(31); 
		activityEdge0InTrNetPat42Hash = new HashMap<ModelNode, LinkedList<TrNetPat42Instance>>(31);
		transition0InTrNetPat42Hash = new HashMap<ModelNode, LinkedList<TrNetPat42Instance>>(31);
		stateVertex0InTrNetPat42Hash = new HashMap<ModelNode, LinkedList<TrNetPat42Instance>>(31);
		activityNode0InTrNetPat42Hash = new HashMap<ModelNode, LinkedList<TrNetPat42Instance>>(31);
	trNetPat43Array = new ArrayList<TrNetPat43Instance>(31); 
	newCounterTrNetPat43EvolvedOutput = 0;
	trNetPat43Set = new HashSet<TrNetPat43Instance>(31); 
		activityEdge0InTrNetPat43Hash = new HashMap<ModelNode, LinkedList<TrNetPat43Instance>>(31);
		activityNode0InTrNetPat43Hash = new HashMap<ModelNode, LinkedList<TrNetPat43Instance>>(31);
	trNetPat70Array = new ArrayList<TrNetPat70Instance>(1); 
	newCounterTrNetPat70TrNetOp19 = 0;
	trNetPat70Set = new HashSet<TrNetPat70Instance>(1); 
		partition0InTrNetPat70Hash = new HashMap<ModelNode, LinkedList<TrNetPat70Instance>>(1);
		transition0InTrNetPat70Hash = new HashMap<ModelNode, LinkedList<TrNetPat70Instance>>(1);
	trNetPat21Array = new ArrayList<TrNetPat21Instance>(1); 
	newCounterTrNetPat21TrNetOp20 = 0;
	trNetPat21Set = new HashSet<TrNetPat21Instance>(1); 
		partition0InTrNetPat21Hash = new HashMap<ModelNode, LinkedList<TrNetPat21Instance>>(1);
		transition0InTrNetPat21Hash = new HashMap<ModelNode, LinkedList<TrNetPat21Instance>>(1);
		activityPartition0InTrNetPat21Hash = new HashMap<ModelNode, LinkedList<TrNetPat21Instance>>(1);
	trNetPat22Array = new ArrayList<TrNetPat22Instance>(1); 
	newCounterTrNetPat22TrNetOp21 = 0;
	trNetPat22Set = new HashSet<TrNetPat22Instance>(1); 
		partition0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(1);
		transition0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(1);
		activityPartition0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(1);
		activityEdge0InTrNetPat22Hash = new HashMap<ModelNode, LinkedList<TrNetPat22Instance>>(1);
	trNetPat23Array = new ArrayList<TrNetPat23Instance>(1); 
	newCounterTrNetPat23EvolvedOutput = 0;
	trNetPat23Set = new HashSet<TrNetPat23Instance>(1); 
		activityPartition0InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(1);
		activityEdge0InTrNetPat23Hash = new HashMap<ModelNode, LinkedList<TrNetPat23Instance>>(1);
	trNetPat71Array = new ArrayList<TrNetPat71Instance>(48); 
	newCounterTrNetPat71TrNetOp22 = 0;
	trNetPat71Set = new HashSet<TrNetPat71Instance>(48); 
		partition0InTrNetPat71Hash = new HashMap<ModelNode, LinkedList<TrNetPat71Instance>>(48);
		stateVertex0InTrNetPat71Hash = new HashMap<ModelNode, LinkedList<TrNetPat71Instance>>(48);
	trNetPat24Array = new ArrayList<TrNetPat24Instance>(48); 
	newCounterTrNetPat24TrNetOp23 = 0;
	trNetPat24Set = new HashSet<TrNetPat24Instance>(48); 
		partition0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(48);
		stateVertex0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(48);
		activityPartition0InTrNetPat24Hash = new HashMap<ModelNode, LinkedList<TrNetPat24Instance>>(48);
	trNetPat25Array = new ArrayList<TrNetPat25Instance>(23); 
	newCounterTrNetPat25TrNetOp24 = 0;
	trNetPat25Set = new HashSet<TrNetPat25Instance>(23); 
		partition0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(23);
		stateVertex0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(23);
		activityPartition0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(23);
		activityNode0InTrNetPat25Hash = new HashMap<ModelNode, LinkedList<TrNetPat25Instance>>(23);
	trNetPat26Array = new ArrayList<TrNetPat26Instance>(23); 
	newCounterTrNetPat26EvolvedOutput = 0;
	trNetPat26Set = new HashSet<TrNetPat26Instance>(23); 
		activityPartition0InTrNetPat26Hash = new HashMap<ModelNode, LinkedList<TrNetPat26Instance>>(23);
		activityNode0InTrNetPat26Hash = new HashMap<ModelNode, LinkedList<TrNetPat26Instance>>(23);
		
	listenersTrNetPat4Instance = new LinkedList<TrNetPat4InstanceListener>();
	listenersTrNetPat3Instance = new LinkedList<TrNetPat3InstanceListener>();
	listenersTrNetPat67Instance = new LinkedList<TrNetPat67InstanceListener>();
	listenersTrNetPat46Instance = new LinkedList<TrNetPat46InstanceListener>();
	listenersTrNetPat36Instance = new LinkedList<TrNetPat36InstanceListener>();
	listenersTrNetPat64Instance = new LinkedList<TrNetPat64InstanceListener>();
	listenersTrNetPat5Instance = new LinkedList<TrNetPat5InstanceListener>();
	listenersTrNetPat15Instance = new LinkedList<TrNetPat15InstanceListener>();
	listenersTrNetPat58Instance = new LinkedList<TrNetPat58InstanceListener>();
	listenersTrNetPat43Instance = new LinkedList<TrNetPat43InstanceListener>();
	listenersTrNetPat55Instance = new LinkedList<TrNetPat55InstanceListener>();
	listenersTrNetPat10Instance = new LinkedList<TrNetPat10InstanceListener>();
	listenersTrNetPat26Instance = new LinkedList<TrNetPat26InstanceListener>();
	listenersTrNetPat23Instance = new LinkedList<TrNetPat23InstanceListener>();
	listenersTrNetPat20Instance = new LinkedList<TrNetPat20InstanceListener>();
	listenersTrNetPat40Instance = new LinkedList<TrNetPat40InstanceListener>();
	listenersTrNetPat60Instance = new LinkedList<TrNetPat60InstanceListener>();
	listenersTrNetPat50Instance = new LinkedList<TrNetPat50InstanceListener>();
	listenersTrNetPat32Instance = new LinkedList<TrNetPat32InstanceListener>();
	listenersTrNetPat62Instance = new LinkedList<TrNetPat62InstanceListener>();
	listenersTrNetPat7Instance = new LinkedList<TrNetPat7InstanceListener>();
	listenersTrNetPat37Instance = new LinkedList<TrNetPat37InstanceListener>();
	listenersTrNetPat12Instance = new LinkedList<TrNetPat12InstanceListener>();
		
		
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
	executeOperatorTrNetOp16();
	executeOperatorTrNetOp17();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp50();
	executeOperatorTrNetOp51();
	executeOperatorTrNetOp19();
	executeOperatorTrNetOp41();
	executeOperatorTrNetOp43();
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp54();
	executeOperatorTrNetOp55();
	executeOperatorTrNetOp44();
	executeOperatorTrNetOp45();
	executeOperatorTrNetOp48();
	executeOperatorTrNetOp49();
	executeOperatorTrNetOp26();
	executeOperatorTrNetOp22();
	executeOperatorTrNetOp15();
	executeOperatorTrNetOp52();
	executeOperatorTrNetOp53();
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp2();
	executeOperatorTrNetOp7();
	executeOperatorTrNetOp12();
	executeOperatorTrNetOp10();
	executeOperatorTrNetOp11();
	executeOperatorTrNetOp4();
	executeOperatorTrNetOp5();
	executeOperatorTrNetOp6();
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp27();
	executeOperatorTrNetOp3();
	executeOperatorTrNetOp42();
	executeOperatorTrNetOp18();
	executeOperatorTrNetOp47();
	executeOperatorTrNetOp23();
	executeOperatorTrNetOp13();
	executeOperatorTrNetOp14();
	executeOperatorTrNetOp24();
	executeOperatorTrNetOp39();
	executeOperatorTrNetOp40();
	executeOperatorTrNetOp28();
	executeOperatorTrNetOp29();
	executeOperatorTrNetOp30();
	executeOperatorTrNetOp20();
	executeOperatorTrNetOp21();
	executeOperatorTrNetOp35();
	executeOperatorTrNetOp36();
	executeOperatorTrNetOp32();
	executeOperatorTrNetOp33();
	executeOperatorTrNetOp34();
	executeOperatorTrNetOp37();
	executeOperatorTrNetOp31();
	executeOperatorTrNetOp8();
	executeOperatorTrNetOp9();
	executeOperatorEvolvedOutput();
		
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
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat5Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat5", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat4Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat4", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat3Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat3", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat17Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat17", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat18Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat18", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat27Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat27", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat19Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat19", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat6Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat6", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat7Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat7", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 10.0;
				patternStats.realSize = trNetPat20Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat20", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat44Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat44", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat45Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat45", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat46Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat46", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat28Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat28", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat8Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat8", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat9Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat9", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat10Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat10", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat29Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat29", patternStats);
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
				patternStats.realSize = trNetPat30Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat30", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat31Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat31", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat32Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat32", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat11Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat11", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat12Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat12", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 14.0;
				patternStats.realSize = trNetPat48Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat48", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 14.0;
				patternStats.realSize = trNetPat49Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat49", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 14.0;
				patternStats.realSize = trNetPat50Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat50", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 99.0;
				patternStats.realSize = trNetPat52Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat52", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 99.0;
				patternStats.realSize = trNetPat16Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat16", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 99.0;
				patternStats.realSize = trNetPat13Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat13", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20.0;
				patternStats.realSize = trNetPat14Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat14", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20.0;
				patternStats.realSize = trNetPat15Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat15", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20.0;
				patternStats.realSize = trNetPat53Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat53", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20.0;
				patternStats.realSize = trNetPat54Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat54", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20.0;
				patternStats.realSize = trNetPat55Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat55", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 53.0;
				patternStats.realSize = trNetPat56Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat56", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat57Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat57", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat58Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat58", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 20.0;
				patternStats.realSize = trNetPat51Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat51", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat59Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat59", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat60Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat60", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat61Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat61", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat62Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat62", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat63Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat63", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 13.25;
				patternStats.realSize = trNetPat64Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat64", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 12.0;
				patternStats.realSize = trNetPat65Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat65", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 12.0;
				patternStats.realSize = trNetPat66Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat66", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 12.0;
				patternStats.realSize = trNetPat67Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat67", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 44.0;
				patternStats.realSize = trNetPat68Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat68", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat33Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat33", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 44.0;
				patternStats.realSize = trNetPat34Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat34", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 44.0;
				patternStats.realSize = trNetPat36Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat36", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 44.0;
				patternStats.realSize = trNetPat37Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat37", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 44.0;
				patternStats.realSize = trNetPat69Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat69", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 44.0;
				patternStats.realSize = trNetPat35Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat35", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat38Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat38", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 31.746031746031747;
				patternStats.realSize = trNetPat39Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat39", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 31.746031746031747;
				patternStats.realSize = trNetPat40Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat40", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 100.0;
				patternStats.realSize = trNetPat41Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat41", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 30.76923076923077;
				patternStats.realSize = trNetPat42Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat42", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 30.76923076923077;
				patternStats.realSize = trNetPat43Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat43", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat70Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat70", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat21Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat21", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat22Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat22", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 1.0;
				patternStats.realSize = trNetPat23Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat23", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat71Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat71", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 48.0;
				patternStats.realSize = trNetPat24Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat24", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 23.414634146341463;
				patternStats.realSize = trNetPat25Set.size();
				
				// TODO: Other statistics are filled here.
				
				result.put("TrNetPat25", patternStats);
			}
			{
				generic.PatternStats patternStats = new generic.PatternStats();
				
				patternStats.expectedSize = 23.414634146341463;
				patternStats.realSize = trNetPat26Set.size();
				
				// TODO: Other statistics are filled here.
				
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
	
	public void notify(TrNetPat56Instance element){
		if (trNetPat56Set.add(element)) {
			trNetPat56Array.add(element);
	{
		if (!pseudostate0InTrNetPat56Hash.containsKey(element.pseudostate0)) {
			pseudostate0InTrNetPat56Hash.put(element.pseudostate0, new LinkedList<TrNetPat56Instance>());
		}
		pseudostate0InTrNetPat56Hash.get(element.pseudostate0).add(element);
	}
			/*
	executeOperatorTrNetOp46();
	executeOperatorTrNetOp48();
	executeOperatorTrNetOp50();
	executeOperatorTrNetOp52();
			*/
		}
	}
	public void notify(TrNetPat65Instance element){
		if (trNetPat65Set.add(element)) {
			trNetPat65Array.add(element);
	{
		if (!objectFlowState0InTrNetPat65Hash.containsKey(element.objectFlowState0)) {
			objectFlowState0InTrNetPat65Hash.put(element.objectFlowState0, new LinkedList<TrNetPat65Instance>());
		}
		objectFlowState0InTrNetPat65Hash.get(element.objectFlowState0).add(element);
	}
			/*
	executeOperatorTrNetOp54();
			*/
		}
	}
	public void notify(TrNetPat69Instance element){
		if (trNetPat69Set.add(element)) {
			trNetPat69Array.add(element);
	{
		if (!booleanExpression0InTrNetPat69Hash.containsKey(element.booleanExpression0)) {
			booleanExpression0InTrNetPat69Hash.put(element.booleanExpression0, new LinkedList<TrNetPat69Instance>());
		}
		booleanExpression0InTrNetPat69Hash.get(element.booleanExpression0).add(element);
	}
	{
		if (!guard0InTrNetPat69Hash.containsKey(element.guard0)) {
			guard0InTrNetPat69Hash.put(element.guard0, new LinkedList<TrNetPat69Instance>());
		}
		guard0InTrNetPat69Hash.get(element.guard0).add(element);
	}
			/*
	executeOperatorTrNetOp29();
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
	{
		if (!stateVertex0InTrNetPat71Hash.containsKey(element.stateVertex0)) {
			stateVertex0InTrNetPat71Hash.put(element.stateVertex0, new LinkedList<TrNetPat71Instance>());
		}
		stateVertex0InTrNetPat71Hash.get(element.stateVertex0).add(element);
	}
			/*
	executeOperatorTrNetOp22();
			*/
		}
	}
	public void notify(TrNetPat1Instance element){
		if (trNetPat1Set.add(element)) {
			trNetPat1Array.add(element);
	{
		if (!activityGraph0InTrNetPat1Hash.containsKey(element.activityGraph0)) {
			activityGraph0InTrNetPat1Hash.put(element.activityGraph0, new LinkedList<TrNetPat1Instance>());
		}
		activityGraph0InTrNetPat1Hash.get(element.activityGraph0).add(element);
	}
	{
		if (!compositeState0InTrNetPat1Hash.containsKey(element.compositeState0)) {
			compositeState0InTrNetPat1Hash.put(element.compositeState0, new LinkedList<TrNetPat1Instance>());
		}
		compositeState0InTrNetPat1Hash.get(element.compositeState0).add(element);
	}
			/*
	executeOperatorTrNetOp1();
	executeOperatorTrNetOp15();
			*/
		}
	}
	public void notify(TrNetPat27Instance element){
		if (trNetPat27Set.add(element)) {
			trNetPat27Array.add(element);
	{
		if (!activityGraph0InTrNetPat27Hash.containsKey(element.activityGraph0)) {
			activityGraph0InTrNetPat27Hash.put(element.activityGraph0, new LinkedList<TrNetPat27Instance>());
		}
		activityGraph0InTrNetPat27Hash.get(element.activityGraph0).add(element);
	}
	{
		if (!partition0InTrNetPat27Hash.containsKey(element.partition0)) {
			partition0InTrNetPat27Hash.put(element.partition0, new LinkedList<TrNetPat27Instance>());
		}
		partition0InTrNetPat27Hash.get(element.partition0).add(element);
	}
			/*
	executeOperatorTrNetOp17();
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
	{
		if (!stateVertex0InTrNetPat52Hash.containsKey(element.stateVertex0)) {
			stateVertex0InTrNetPat52Hash.put(element.stateVertex0, new LinkedList<TrNetPat52Instance>());
		}
		stateVertex0InTrNetPat52Hash.get(element.stateVertex0).add(element);
	}
			/*
	executeOperatorTrNetOp15();
			*/
		}
	}
	public void notify(TrNetPat70Instance element){
		if (trNetPat70Set.add(element)) {
			trNetPat70Array.add(element);
	{
		if (!partition0InTrNetPat70Hash.containsKey(element.partition0)) {
			partition0InTrNetPat70Hash.put(element.partition0, new LinkedList<TrNetPat70Instance>());
		}
		partition0InTrNetPat70Hash.get(element.partition0).add(element);
	}
	{
		if (!transition0InTrNetPat70Hash.containsKey(element.transition0)) {
			transition0InTrNetPat70Hash.put(element.transition0, new LinkedList<TrNetPat70Instance>());
		}
		transition0InTrNetPat70Hash.get(element.transition0).add(element);
	}
			/*
	executeOperatorTrNetOp19();
			*/
		}
	}
	public void notify(TrNetPat68Instance element){
		if (trNetPat68Set.add(element)) {
			trNetPat68Array.add(element);
	{
		if (!guard0InTrNetPat68Hash.containsKey(element.guard0)) {
			guard0InTrNetPat68Hash.put(element.guard0, new LinkedList<TrNetPat68Instance>());
		}
		guard0InTrNetPat68Hash.get(element.guard0).add(element);
	}
	{
		if (!transition0InTrNetPat68Hash.containsKey(element.transition0)) {
			transition0InTrNetPat68Hash.put(element.transition0, new LinkedList<TrNetPat68Instance>());
		}
		transition0InTrNetPat68Hash.get(element.transition0).add(element);
	}
			/*
	executeOperatorTrNetOp28();
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
	{
		if (!stateVertex0InTrNetPat47Hash.containsKey(element.stateVertex0)) {
			stateVertex0InTrNetPat47Hash.put(element.stateVertex0, new LinkedList<TrNetPat47Instance>());
		}
		stateVertex0InTrNetPat47Hash.get(element.stateVertex0).add(element);
	}
			/*
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp32();
			*/
		}
	}
	public void notify(TrNetPat48Instance element){
		if (trNetPat48Set.add(element)) {
			trNetPat48Array.add(element);
	{
		if (!actionState0InTrNetPat48Hash.containsKey(element.actionState0)) {
			actionState0InTrNetPat48Hash.put(element.actionState0, new LinkedList<TrNetPat48Instance>());
		}
		actionState0InTrNetPat48Hash.get(element.actionState0).add(element);
	}
			/*
	executeOperatorTrNetOp41();
			*/
		}
	}
	public void notify(TrNetPat17Instance element){
		if (trNetPat17Set.add(element)) {
			trNetPat17Array.add(element);
	{
		if (!partition0InTrNetPat17Hash.containsKey(element.partition0)) {
			partition0InTrNetPat17Hash.put(element.partition0, new LinkedList<TrNetPat17Instance>());
		}
		partition0InTrNetPat17Hash.get(element.partition0).add(element);
	}
			/*
	executeOperatorTrNetOp16();
			*/
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
	{
		if (!stateVertex0InTrNetPat29Hash.containsKey(element.stateVertex0)) {
			stateVertex0InTrNetPat29Hash.put(element.stateVertex0, new LinkedList<TrNetPat29Instance>());
		}
		stateVertex0InTrNetPat29Hash.get(element.stateVertex0).add(element);
	}
			/*
	executeOperatorTrNetOp25();
	executeOperatorTrNetOp38();
	executeOperatorTrNetOp35();
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
	{
		if (!transition0InTrNetPat28Hash.containsKey(element.transition0)) {
			transition0InTrNetPat28Hash.put(element.transition0, new LinkedList<TrNetPat28Instance>());
		}
		transition0InTrNetPat28Hash.get(element.transition0).add(element);
	}
			/*
	executeOperatorTrNetOp7();
			*/
		}
	}
	public void notify(TrNetPat53Instance element){
		if (trNetPat53Set.add(element)) {
			trNetPat53Array.add(element);
	{
		if (!finalState0InTrNetPat53Hash.containsKey(element.finalState0)) {
			finalState0InTrNetPat53Hash.put(element.finalState0, new LinkedList<TrNetPat53Instance>());
		}
		finalState0InTrNetPat53Hash.get(element.finalState0).add(element);
	}
			/*
	executeOperatorTrNetOp44();
			*/
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

LinkedList<TrNetPat3InstanceListener> listenersTrNetPat3Instance;

public void registerListener(TrNetPat3InstanceListener listener){
	listenersTrNetPat3Instance.add(listener);
}
	
public void notifyListeners(TrNetPat3Instance element){
	for (TrNetPat3InstanceListener listener : listenersTrNetPat3Instance){
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

LinkedList<TrNetPat46InstanceListener> listenersTrNetPat46Instance;

public void registerListener(TrNetPat46InstanceListener listener){
	listenersTrNetPat46Instance.add(listener);
}
	
public void notifyListeners(TrNetPat46Instance element){
	for (TrNetPat46InstanceListener listener : listenersTrNetPat46Instance){
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

LinkedList<TrNetPat64InstanceListener> listenersTrNetPat64Instance;

public void registerListener(TrNetPat64InstanceListener listener){
	listenersTrNetPat64Instance.add(listener);
}
	
public void notifyListeners(TrNetPat64Instance element){
	for (TrNetPat64InstanceListener listener : listenersTrNetPat64Instance){
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

LinkedList<TrNetPat58InstanceListener> listenersTrNetPat58Instance;

public void registerListener(TrNetPat58InstanceListener listener){
	listenersTrNetPat58Instance.add(listener);
}
	
public void notifyListeners(TrNetPat58Instance element){
	for (TrNetPat58InstanceListener listener : listenersTrNetPat58Instance){
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

LinkedList<TrNetPat55InstanceListener> listenersTrNetPat55Instance;

public void registerListener(TrNetPat55InstanceListener listener){
	listenersTrNetPat55Instance.add(listener);
}
	
public void notifyListeners(TrNetPat55Instance element){
	for (TrNetPat55InstanceListener listener : listenersTrNetPat55Instance){
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

LinkedList<TrNetPat26InstanceListener> listenersTrNetPat26Instance;

public void registerListener(TrNetPat26InstanceListener listener){
	listenersTrNetPat26Instance.add(listener);
}
	
public void notifyListeners(TrNetPat26Instance element){
	for (TrNetPat26InstanceListener listener : listenersTrNetPat26Instance){
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

LinkedList<TrNetPat20InstanceListener> listenersTrNetPat20Instance;

public void registerListener(TrNetPat20InstanceListener listener){
	listenersTrNetPat20Instance.add(listener);
}
	
public void notifyListeners(TrNetPat20Instance element){
	for (TrNetPat20InstanceListener listener : listenersTrNetPat20Instance){
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

LinkedList<TrNetPat60InstanceListener> listenersTrNetPat60Instance;

public void registerListener(TrNetPat60InstanceListener listener){
	listenersTrNetPat60Instance.add(listener);
}
	
public void notifyListeners(TrNetPat60Instance element){
	for (TrNetPat60InstanceListener listener : listenersTrNetPat60Instance){
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

LinkedList<TrNetPat32InstanceListener> listenersTrNetPat32Instance;

public void registerListener(TrNetPat32InstanceListener listener){
	listenersTrNetPat32Instance.add(listener);
}
	
public void notifyListeners(TrNetPat32Instance element){
	for (TrNetPat32InstanceListener listener : listenersTrNetPat32Instance){
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

LinkedList<TrNetPat12InstanceListener> listenersTrNetPat12Instance;

public void registerListener(TrNetPat12InstanceListener listener){
	listenersTrNetPat12Instance.add(listener);
}
	
public void notifyListeners(TrNetPat12Instance element){
	for (TrNetPat12InstanceListener listener : listenersTrNetPat12Instance){
		listener.notify(element);
	}
}

	
	
boolean executeOperatorEvolvedOutput() {
	boolean operatorHasExecuted = false;
	
	{
		int sourcePatternSize = trNetPat3Array.size();
		for (int i = newCounterTrNetPat3EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat3EvolvedOutput = trNetPat3Array.size();
	}
	{
		int sourcePatternSize = trNetPat5Array.size();
		for (int i = newCounterTrNetPat5EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat5Instance sourcePatternInstance = trNetPat5Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat5EvolvedOutput = trNetPat5Array.size();
	}
	{
		int sourcePatternSize = trNetPat4Array.size();
		for (int i = newCounterTrNetPat4EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat4Instance sourcePatternInstance = trNetPat4Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat4EvolvedOutput = trNetPat4Array.size();
	}
	{
		int sourcePatternSize = trNetPat7Array.size();
		for (int i = newCounterTrNetPat7EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat7Instance sourcePatternInstance = trNetPat7Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat7EvolvedOutput = trNetPat7Array.size();
	}
	{
		int sourcePatternSize = trNetPat20Array.size();
		for (int i = newCounterTrNetPat20EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat20Instance sourcePatternInstance = trNetPat20Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat20EvolvedOutput = trNetPat20Array.size();
	}
	{
		int sourcePatternSize = trNetPat46Array.size();
		for (int i = newCounterTrNetPat46EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat46Instance sourcePatternInstance = trNetPat46Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat46EvolvedOutput = trNetPat46Array.size();
	}
	{
		int sourcePatternSize = trNetPat10Array.size();
		for (int i = newCounterTrNetPat10EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat10Instance sourcePatternInstance = trNetPat10Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat10EvolvedOutput = trNetPat10Array.size();
	}
	{
		int sourcePatternSize = trNetPat32Array.size();
		for (int i = newCounterTrNetPat32EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat32Instance sourcePatternInstance = trNetPat32Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat32EvolvedOutput = trNetPat32Array.size();
	}
	{
		int sourcePatternSize = trNetPat12Array.size();
		for (int i = newCounterTrNetPat12EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat12Instance sourcePatternInstance = trNetPat12Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat12EvolvedOutput = trNetPat12Array.size();
	}
	{
		int sourcePatternSize = trNetPat50Array.size();
		for (int i = newCounterTrNetPat50EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat50Instance sourcePatternInstance = trNetPat50Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat50EvolvedOutput = trNetPat50Array.size();
	}
	{
		int sourcePatternSize = trNetPat15Array.size();
		for (int i = newCounterTrNetPat15EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat15Instance sourcePatternInstance = trNetPat15Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat15EvolvedOutput = trNetPat15Array.size();
	}
	{
		int sourcePatternSize = trNetPat55Array.size();
		for (int i = newCounterTrNetPat55EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat55Instance sourcePatternInstance = trNetPat55Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat55EvolvedOutput = trNetPat55Array.size();
	}
	{
		int sourcePatternSize = trNetPat58Array.size();
		for (int i = newCounterTrNetPat58EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat58Instance sourcePatternInstance = trNetPat58Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat58EvolvedOutput = trNetPat58Array.size();
	}
	{
		int sourcePatternSize = trNetPat60Array.size();
		for (int i = newCounterTrNetPat60EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat60Instance sourcePatternInstance = trNetPat60Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat60EvolvedOutput = trNetPat60Array.size();
	}
	{
		int sourcePatternSize = trNetPat62Array.size();
		for (int i = newCounterTrNetPat62EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat62Instance sourcePatternInstance = trNetPat62Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat62EvolvedOutput = trNetPat62Array.size();
	}
	{
		int sourcePatternSize = trNetPat64Array.size();
		for (int i = newCounterTrNetPat64EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat64Instance sourcePatternInstance = trNetPat64Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat64EvolvedOutput = trNetPat64Array.size();
	}
	{
		int sourcePatternSize = trNetPat67Array.size();
		for (int i = newCounterTrNetPat67EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat67Instance sourcePatternInstance = trNetPat67Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat67EvolvedOutput = trNetPat67Array.size();
	}
	{
		int sourcePatternSize = trNetPat36Array.size();
		for (int i = newCounterTrNetPat36EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat36Instance sourcePatternInstance = trNetPat36Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat36EvolvedOutput = trNetPat36Array.size();
	}
	{
		int sourcePatternSize = trNetPat37Array.size();
		for (int i = newCounterTrNetPat37EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat37Instance sourcePatternInstance = trNetPat37Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat37EvolvedOutput = trNetPat37Array.size();
	}
	{
		int sourcePatternSize = trNetPat40Array.size();
		for (int i = newCounterTrNetPat40EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat40Instance sourcePatternInstance = trNetPat40Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat40EvolvedOutput = trNetPat40Array.size();
	}
	{
		int sourcePatternSize = trNetPat43Array.size();
		for (int i = newCounterTrNetPat43EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat43Instance sourcePatternInstance = trNetPat43Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat43EvolvedOutput = trNetPat43Array.size();
	}
	{
		int sourcePatternSize = trNetPat23Array.size();
		for (int i = newCounterTrNetPat23EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat23Instance sourcePatternInstance = trNetPat23Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat23EvolvedOutput = trNetPat23Array.size();
	}
	{
		int sourcePatternSize = trNetPat26Array.size();
		for (int i = newCounterTrNetPat26EvolvedOutput; i<sourcePatternSize; i++){
			TrNetPat26Instance sourcePatternInstance = trNetPat26Array.get(i);
	notifyListeners(sourcePatternInstance);
		}
	newCounterTrNetPat26EvolvedOutput = trNetPat26Array.size();
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
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat2Array.add(targetInstance);
	{
		if (!activity0InTrNetPat2Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat2Hash.put(targetInstance.activity0, new LinkedList<TrNetPat2Instance>());
		}
		activity0InTrNetPat2Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!package0InTrNetPat2Hash.containsKey(targetInstance.package0)) {
			package0InTrNetPat2Hash.put(targetInstance.package0, new LinkedList<TrNetPat2Instance>());
		}
		package0InTrNetPat2Hash.get(targetInstance.package0).add(targetInstance);
	}
	{
		if (!activityGraph0InTrNetPat2Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat2Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat2Instance>());
		}
		activityGraph0InTrNetPat2Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	//patternTrNetPat2HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat1TrNetOp1 = trNetPat1Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp4() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat3Array.size();
	for (int i = newCounterTrNetPat3TrNetOp4; i<sourcePatternSize; i++){
		TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
		
		
	{
		TrNetPat5Instance targetInstance = new TrNetPat5Instance();
			{
			targetInstance.package0 = sourcePatternInstance.package0;
			targetInstance.package0.types.add("Package");
			}
		if (trNetPat5Set.add(targetInstance)) {
			trNetPat5Array.add(targetInstance);
	{
		if (!package0InTrNetPat5Hash.containsKey(targetInstance.package0)) {
			package0InTrNetPat5Hash.put(targetInstance.package0, new LinkedList<TrNetPat5Instance>());
		}
		package0InTrNetPat5Hash.get(targetInstance.package0).add(targetInstance);
	}
	//patternTrNetPat5HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat3TrNetOp4 = trNetPat3Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp3() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat3Array.size();
	for (int i = newCounterTrNetPat3TrNetOp3; i<sourcePatternSize; i++){
		TrNetPat3Instance sourcePatternInstance = trNetPat3Array.get(i);
		
		
	{
		TrNetPat4Instance targetInstance = new TrNetPat4Instance();
			{
			targetInstance.activity0 = sourcePatternInstance.activity0;
			targetInstance.activity0.types.add("Activity");
			}
		if (trNetPat4Set.add(targetInstance)) {
			trNetPat4Array.add(targetInstance);
	{
		if (!activity0InTrNetPat4Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat4Hash.put(targetInstance.activity0, new LinkedList<TrNetPat4Instance>());
		}
		activity0InTrNetPat4Hash.get(targetInstance.activity0).add(targetInstance);
	}
	//patternTrNetPat4HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat3TrNetOp3 = trNetPat3Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp2() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat2Array.size();
	for (int i = newCounterTrNetPat2TrNetOp2; i<sourcePatternSize; i++){
		TrNetPat2Instance sourcePatternInstance = trNetPat2Array.get(i);
		
		
	{
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
			trNetPat3Array.add(targetInstance);
	{
		if (!activity0InTrNetPat3Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat3Hash.put(targetInstance.activity0, new LinkedList<TrNetPat3Instance>());
		}
		activity0InTrNetPat3Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!package0InTrNetPat3Hash.containsKey(targetInstance.package0)) {
			package0InTrNetPat3Hash.put(targetInstance.package0, new LinkedList<TrNetPat3Instance>());
		}
		package0InTrNetPat3Hash.get(targetInstance.package0).add(targetInstance);
	}
	//patternTrNetPat3HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat2TrNetOp2 = trNetPat2Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp16() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat17Array.size();
	for (int i = newCounterTrNetPat17TrNetOp16; i<sourcePatternSize; i++){
		TrNetPat17Instance sourcePatternInstance = trNetPat17Array.get(i);
		
		
	{
		TrNetPat18Instance targetInstance = new TrNetPat18Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat18Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat18Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat18Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat18Instance>());
		}
		activityPartition0InTrNetPat18Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
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
	
	newCounterTrNetPat17TrNetOp16 = trNetPat17Array.size();
	
	
	
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
			trNetPat19Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat19Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat19Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat19Instance>());
		}
		activityPartition0InTrNetPat19Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!partition0InTrNetPat19Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat19Hash.put(targetInstance.partition0, new LinkedList<TrNetPat19Instance>());
		}
		partition0InTrNetPat19Hash.get(targetInstance.partition0).add(targetInstance);
	}
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
			trNetPat6Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat6Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat6Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat6Instance>());
		}
		activityPartition0InTrNetPat6Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!partition0InTrNetPat6Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat6Hash.put(targetInstance.partition0, new LinkedList<TrNetPat6Instance>());
		}
		partition0InTrNetPat6Hash.get(targetInstance.partition0).add(targetInstance);
	}
	{
		if (!activityGraph0InTrNetPat6Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat6Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat6Instance>());
		}
		activityGraph0InTrNetPat6Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat6Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat6Hash.put(targetInstance.activity0, new LinkedList<TrNetPat6Instance>());
		}
		activity0InTrNetPat6Hash.get(targetInstance.activity0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat6TrNetOp6; i<sourcePatternSize; i++){
		TrNetPat6Instance sourcePatternInstance = trNetPat6Array.get(i);
		
		
	{
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
			trNetPat7Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat7Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat7Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat7Instance>());
		}
		activityPartition0InTrNetPat7Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat7Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat7Hash.put(targetInstance.activity0, new LinkedList<TrNetPat7Instance>());
		}
		activity0InTrNetPat7Hash.get(targetInstance.activity0).add(targetInstance);
	}
	//patternTrNetPat7HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat6TrNetOp6 = trNetPat6Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp18() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat18Array.size();
	for (int i = newCounterTrNetPat18TrNetOp18; i<sourcePatternSize; i++){
		TrNetPat18Instance sourcePatternInstance = trNetPat18Array.get(i);
		
		
	{
		TrNetPat20Instance targetInstance = new TrNetPat20Instance();
			{
			targetInstance.activityPartition0 = sourcePatternInstance.activityPartition0;
			targetInstance.activityPartition0.types.add("ActivityPartition");
			}
		if (trNetPat20Set.add(targetInstance)) {
			trNetPat20Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat20Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat20Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat20Instance>());
		}
		activityPartition0InTrNetPat20Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	//patternTrNetPat20HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat18TrNetOp18 = trNetPat18Array.size();
	
	
	
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
			trNetPat44Array.add(targetInstance);
	{
		if (!transition0InTrNetPat44Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat44Hash.put(targetInstance.transition0, new LinkedList<TrNetPat44Instance>());
		}
		transition0InTrNetPat44Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat44Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat44Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat44Instance>());
		}
		stateVertex0InTrNetPat44Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!stateVertex1InTrNetPat44Hash.containsKey(targetInstance.stateVertex1)) {
			stateVertex1InTrNetPat44Hash.put(targetInstance.stateVertex1, new LinkedList<TrNetPat44Instance>());
		}
		stateVertex1InTrNetPat44Hash.get(targetInstance.stateVertex1).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat44TrNetOp39; i<sourcePatternSize; i++){
		TrNetPat44Instance sourcePatternInstance = trNetPat44Array.get(i);
		
		
	{
		TrNetPat45Instance targetInstance = new TrNetPat45Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat45Array.add(targetInstance);
	{
		if (!objectFlow0InTrNetPat45Hash.containsKey(targetInstance.objectFlow0)) {
			objectFlow0InTrNetPat45Hash.put(targetInstance.objectFlow0, new LinkedList<TrNetPat45Instance>());
		}
		objectFlow0InTrNetPat45Hash.get(targetInstance.objectFlow0).add(targetInstance);
	}
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
	
	newCounterTrNetPat44TrNetOp39 = trNetPat44Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp40() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat45Array.size();
	for (int i = newCounterTrNetPat45TrNetOp40; i<sourcePatternSize; i++){
		TrNetPat45Instance sourcePatternInstance = trNetPat45Array.get(i);
		
		
	{
		TrNetPat46Instance targetInstance = new TrNetPat46Instance();
			{
			targetInstance.objectFlow0 = sourcePatternInstance.objectFlow0;
			targetInstance.objectFlow0.types.add("ObjectFlow");
			}
		if (trNetPat46Set.add(targetInstance)) {
			trNetPat46Array.add(targetInstance);
	{
		if (!objectFlow0InTrNetPat46Hash.containsKey(targetInstance.objectFlow0)) {
			objectFlow0InTrNetPat46Hash.put(targetInstance.objectFlow0, new LinkedList<TrNetPat46Instance>());
		}
		objectFlow0InTrNetPat46Hash.get(targetInstance.objectFlow0).add(targetInstance);
	}
	//patternTrNetPat46HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat33Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat33Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat33Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat33Instance>());
		}
		activityEdge0InTrNetPat33Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
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
	
	newCounterTrNetPat45TrNetOp40 = trNetPat45Array.size();
	
	
	
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
			trNetPat8Array.add(targetInstance);
	{
		if (!activityGraph0InTrNetPat8Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat8Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat8Instance>());
		}
		activityGraph0InTrNetPat8Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat8Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat8Hash.put(targetInstance.transition0, new LinkedList<TrNetPat8Instance>());
		}
		transition0InTrNetPat8Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat8Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat8Hash.put(targetInstance.activity0, new LinkedList<TrNetPat8Instance>());
		}
		activity0InTrNetPat8Hash.get(targetInstance.activity0).add(targetInstance);
	}
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
			trNetPat9Array.add(targetInstance);
	{
		if (!activityGraph0InTrNetPat9Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat9Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat9Instance>());
		}
		activityGraph0InTrNetPat9Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat9Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat9Hash.put(targetInstance.transition0, new LinkedList<TrNetPat9Instance>());
		}
		transition0InTrNetPat9Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat9Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat9Hash.put(targetInstance.activity0, new LinkedList<TrNetPat9Instance>());
		}
		activity0InTrNetPat9Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!objectFlow0InTrNetPat9Hash.containsKey(targetInstance.objectFlow0)) {
			objectFlow0InTrNetPat9Hash.put(targetInstance.objectFlow0, new LinkedList<TrNetPat9Instance>());
		}
		objectFlow0InTrNetPat9Hash.get(targetInstance.objectFlow0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat9TrNetOp9; i<sourcePatternSize; i++){
		TrNetPat9Instance sourcePatternInstance = trNetPat9Array.get(i);
		
		
	{
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
			trNetPat10Array.add(targetInstance);
	{
		if (!activity0InTrNetPat10Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat10Hash.put(targetInstance.activity0, new LinkedList<TrNetPat10Instance>());
		}
		activity0InTrNetPat10Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!objectFlow0InTrNetPat10Hash.containsKey(targetInstance.objectFlow0)) {
			objectFlow0InTrNetPat10Hash.put(targetInstance.objectFlow0, new LinkedList<TrNetPat10Instance>());
		}
		objectFlow0InTrNetPat10Hash.get(targetInstance.objectFlow0).add(targetInstance);
	}
	//patternTrNetPat10HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat9TrNetOp9 = trNetPat9Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp25() {
	boolean operatorHasExecuted = false;
	
	
	int sourcePatternSize1 = trNetPat47Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat47Instance sourcePatternInstance1 = trNetPat47Array.get(i);
		
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
			trNetPat30Array.add(targetInstance);
	{
		if (!transition0InTrNetPat30Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat30Hash.put(targetInstance.transition0, new LinkedList<TrNetPat30Instance>());
		}
		transition0InTrNetPat30Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat30Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat30Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat30Instance>());
		}
		stateVertex0InTrNetPat30Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!stateVertex1InTrNetPat30Hash.containsKey(targetInstance.stateVertex1)) {
			stateVertex1InTrNetPat30Hash.put(targetInstance.stateVertex1, new LinkedList<TrNetPat30Instance>());
		}
		stateVertex1InTrNetPat30Hash.get(targetInstance.stateVertex1).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat30TrNetOp26; i<sourcePatternSize; i++){
		TrNetPat30Instance sourcePatternInstance = trNetPat30Array.get(i);
		
		
	{
		TrNetPat31Instance targetInstance = new TrNetPat31Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat31Array.add(targetInstance);
	{
		if (!controlFlow0InTrNetPat31Hash.containsKey(targetInstance.controlFlow0)) {
			controlFlow0InTrNetPat31Hash.put(targetInstance.controlFlow0, new LinkedList<TrNetPat31Instance>());
		}
		controlFlow0InTrNetPat31Hash.get(targetInstance.controlFlow0).add(targetInstance);
	}
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
	
	newCounterTrNetPat30TrNetOp26 = trNetPat30Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp27() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat31Array.size();
	for (int i = newCounterTrNetPat31TrNetOp27; i<sourcePatternSize; i++){
		TrNetPat31Instance sourcePatternInstance = trNetPat31Array.get(i);
		
		
	{
		TrNetPat32Instance targetInstance = new TrNetPat32Instance();
			{
			targetInstance.controlFlow0 = sourcePatternInstance.controlFlow0;
			targetInstance.controlFlow0.types.add("ControlFlow");
			}
		if (trNetPat32Set.add(targetInstance)) {
			trNetPat32Array.add(targetInstance);
	{
		if (!controlFlow0InTrNetPat32Hash.containsKey(targetInstance.controlFlow0)) {
			controlFlow0InTrNetPat32Hash.put(targetInstance.controlFlow0, new LinkedList<TrNetPat32Instance>());
		}
		controlFlow0InTrNetPat32Hash.get(targetInstance.controlFlow0).add(targetInstance);
	}
	//patternTrNetPat32HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat33Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat33Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat33Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat33Instance>());
		}
		activityEdge0InTrNetPat33Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
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
	
	newCounterTrNetPat31TrNetOp27 = trNetPat31Array.size();
	
	
	
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
			trNetPat11Array.add(targetInstance);
	{
		if (!activityGraph0InTrNetPat11Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat11Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat11Instance>());
		}
		activityGraph0InTrNetPat11Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat11Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat11Hash.put(targetInstance.transition0, new LinkedList<TrNetPat11Instance>());
		}
		transition0InTrNetPat11Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat11Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat11Hash.put(targetInstance.activity0, new LinkedList<TrNetPat11Instance>());
		}
		activity0InTrNetPat11Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!controlFlow0InTrNetPat11Hash.containsKey(targetInstance.controlFlow0)) {
			controlFlow0InTrNetPat11Hash.put(targetInstance.controlFlow0, new LinkedList<TrNetPat11Instance>());
		}
		controlFlow0InTrNetPat11Hash.get(targetInstance.controlFlow0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat11TrNetOp11; i<sourcePatternSize; i++){
		TrNetPat11Instance sourcePatternInstance = trNetPat11Array.get(i);
		
		
	{
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
			trNetPat12Array.add(targetInstance);
	{
		if (!activity0InTrNetPat12Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat12Hash.put(targetInstance.activity0, new LinkedList<TrNetPat12Instance>());
		}
		activity0InTrNetPat12Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!controlFlow0InTrNetPat12Hash.containsKey(targetInstance.controlFlow0)) {
			controlFlow0InTrNetPat12Hash.put(targetInstance.controlFlow0, new LinkedList<TrNetPat12Instance>());
		}
		controlFlow0InTrNetPat12Hash.get(targetInstance.controlFlow0).add(targetInstance);
	}
	//patternTrNetPat12HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat11TrNetOp11 = trNetPat11Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp41() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat48Array.size();
	for (int i = newCounterTrNetPat48TrNetOp41; i<sourcePatternSize; i++){
		TrNetPat48Instance sourcePatternInstance = trNetPat48Array.get(i);
		
		
	{
		TrNetPat49Instance targetInstance = new TrNetPat49Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat49Array.add(targetInstance);
	{
		if (!actionState0InTrNetPat49Hash.containsKey(targetInstance.actionState0)) {
			actionState0InTrNetPat49Hash.put(targetInstance.actionState0, new LinkedList<TrNetPat49Instance>());
		}
		actionState0InTrNetPat49Hash.get(targetInstance.actionState0).add(targetInstance);
	}
	{
		if (!opaqueAction0InTrNetPat49Hash.containsKey(targetInstance.opaqueAction0)) {
			opaqueAction0InTrNetPat49Hash.put(targetInstance.opaqueAction0, new LinkedList<TrNetPat49Instance>());
		}
		opaqueAction0InTrNetPat49Hash.get(targetInstance.opaqueAction0).add(targetInstance);
	}
	//patternTrNetPat49HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat48TrNetOp41 = trNetPat48Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp42() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat49Array.size();
	for (int i = newCounterTrNetPat49TrNetOp42; i<sourcePatternSize; i++){
		TrNetPat49Instance sourcePatternInstance = trNetPat49Array.get(i);
		
		
	{
		TrNetPat50Instance targetInstance = new TrNetPat50Instance();
			{
			targetInstance.opaqueAction0 = sourcePatternInstance.opaqueAction0;
			targetInstance.opaqueAction0.types.add("OpaqueAction");
			}
		if (trNetPat50Set.add(targetInstance)) {
			trNetPat50Array.add(targetInstance);
	{
		if (!opaqueAction0InTrNetPat50Hash.containsKey(targetInstance.opaqueAction0)) {
			opaqueAction0InTrNetPat50Hash.put(targetInstance.opaqueAction0, new LinkedList<TrNetPat50Instance>());
		}
		opaqueAction0InTrNetPat50Hash.get(targetInstance.opaqueAction0).add(targetInstance);
	}
	//patternTrNetPat50HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat49TrNetOp42 = trNetPat49Array.size();
	
	
	
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
			trNetPat16Array.add(targetInstance);
	{
		if (!compositeState0InTrNetPat16Hash.containsKey(targetInstance.compositeState0)) {
			compositeState0InTrNetPat16Hash.put(targetInstance.compositeState0, new LinkedList<TrNetPat16Instance>());
		}
		compositeState0InTrNetPat16Hash.get(targetInstance.compositeState0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat16Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat16Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat16Instance>());
		}
		stateVertex0InTrNetPat16Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
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
			trNetPat13Array.add(targetInstance);
	{
		if (!compositeState0InTrNetPat13Hash.containsKey(targetInstance.compositeState0)) {
			compositeState0InTrNetPat13Hash.put(targetInstance.compositeState0, new LinkedList<TrNetPat13Instance>());
		}
		compositeState0InTrNetPat13Hash.get(targetInstance.compositeState0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat13Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat13Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat13Instance>());
		}
		stateVertex0InTrNetPat13Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityGraph0InTrNetPat13Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat13Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat13Instance>());
		}
		activityGraph0InTrNetPat13Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat13Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat13Hash.put(targetInstance.activity0, new LinkedList<TrNetPat13Instance>());
		}
		activity0InTrNetPat13Hash.get(targetInstance.activity0).add(targetInstance);
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
			trNetPat14Array.add(targetInstance);
	{
		if (!compositeState0InTrNetPat14Hash.containsKey(targetInstance.compositeState0)) {
			compositeState0InTrNetPat14Hash.put(targetInstance.compositeState0, new LinkedList<TrNetPat14Instance>());
		}
		compositeState0InTrNetPat14Hash.get(targetInstance.compositeState0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat14Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat14Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat14Instance>());
		}
		stateVertex0InTrNetPat14Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityGraph0InTrNetPat14Hash.containsKey(targetInstance.activityGraph0)) {
			activityGraph0InTrNetPat14Hash.put(targetInstance.activityGraph0, new LinkedList<TrNetPat14Instance>());
		}
		activityGraph0InTrNetPat14Hash.get(targetInstance.activityGraph0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat14Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat14Hash.put(targetInstance.activity0, new LinkedList<TrNetPat14Instance>());
		}
		activity0InTrNetPat14Hash.get(targetInstance.activity0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat14Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat14Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat14Instance>());
		}
		activityNode0InTrNetPat14Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat14TrNetOp14; i<sourcePatternSize; i++){
		TrNetPat14Instance sourcePatternInstance = trNetPat14Array.get(i);
		
		
	{
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
			trNetPat15Array.add(targetInstance);
	{
		if (!activityNode0InTrNetPat15Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat15Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat15Instance>());
		}
		activityNode0InTrNetPat15Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	{
		if (!activity0InTrNetPat15Hash.containsKey(targetInstance.activity0)) {
			activity0InTrNetPat15Hash.put(targetInstance.activity0, new LinkedList<TrNetPat15Instance>());
		}
		activity0InTrNetPat15Hash.get(targetInstance.activity0).add(targetInstance);
	}
	//patternTrNetPat15HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat14TrNetOp14 = trNetPat14Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp44() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat53Array.size();
	for (int i = newCounterTrNetPat53TrNetOp44; i<sourcePatternSize; i++){
		TrNetPat53Instance sourcePatternInstance = trNetPat53Array.get(i);
		
		
	{
		TrNetPat54Instance targetInstance = new TrNetPat54Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat54Array.add(targetInstance);
	{
		if (!finalState0InTrNetPat54Hash.containsKey(targetInstance.finalState0)) {
			finalState0InTrNetPat54Hash.put(targetInstance.finalState0, new LinkedList<TrNetPat54Instance>());
		}
		finalState0InTrNetPat54Hash.get(targetInstance.finalState0).add(targetInstance);
	}
	{
		if (!activityFinalNode0InTrNetPat54Hash.containsKey(targetInstance.activityFinalNode0)) {
			activityFinalNode0InTrNetPat54Hash.put(targetInstance.activityFinalNode0, new LinkedList<TrNetPat54Instance>());
		}
		activityFinalNode0InTrNetPat54Hash.get(targetInstance.activityFinalNode0).add(targetInstance);
	}
	//patternTrNetPat54HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat53TrNetOp44 = trNetPat53Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp45() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat54Array.size();
	for (int i = newCounterTrNetPat54TrNetOp45; i<sourcePatternSize; i++){
		TrNetPat54Instance sourcePatternInstance = trNetPat54Array.get(i);
		
		
	{
		TrNetPat55Instance targetInstance = new TrNetPat55Instance();
			{
			targetInstance.activityFinalNode0 = sourcePatternInstance.activityFinalNode0;
			targetInstance.activityFinalNode0.types.add("ActivityFinalNode");
			}
		if (trNetPat55Set.add(targetInstance)) {
			trNetPat55Array.add(targetInstance);
	{
		if (!activityFinalNode0InTrNetPat55Hash.containsKey(targetInstance.activityFinalNode0)) {
			activityFinalNode0InTrNetPat55Hash.put(targetInstance.activityFinalNode0, new LinkedList<TrNetPat55Instance>());
		}
		activityFinalNode0InTrNetPat55Hash.get(targetInstance.activityFinalNode0).add(targetInstance);
	}
	//patternTrNetPat55HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat54TrNetOp45 = trNetPat54Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp46() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = newCounterTrNetPat56TrNetOp46; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isinitial(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
		TrNetPat57Instance targetInstance = new TrNetPat57Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat57Array.add(targetInstance);
	{
		if (!pseudostate0InTrNetPat57Hash.containsKey(targetInstance.pseudostate0)) {
			pseudostate0InTrNetPat57Hash.put(targetInstance.pseudostate0, new LinkedList<TrNetPat57Instance>());
		}
		pseudostate0InTrNetPat57Hash.get(targetInstance.pseudostate0).add(targetInstance);
	}
	{
		if (!initialNode0InTrNetPat57Hash.containsKey(targetInstance.initialNode0)) {
			initialNode0InTrNetPat57Hash.put(targetInstance.initialNode0, new LinkedList<TrNetPat57Instance>());
		}
		initialNode0InTrNetPat57Hash.get(targetInstance.initialNode0).add(targetInstance);
	}
	//patternTrNetPat57HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat56TrNetOp46 = trNetPat56Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp47() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat57Array.size();
	for (int i = newCounterTrNetPat57TrNetOp47; i<sourcePatternSize; i++){
		TrNetPat57Instance sourcePatternInstance = trNetPat57Array.get(i);
		
		
	{
		TrNetPat58Instance targetInstance = new TrNetPat58Instance();
			{
			targetInstance.initialNode0 = sourcePatternInstance.initialNode0;
			targetInstance.initialNode0.types.add("InitialNode");
			}
		if (trNetPat58Set.add(targetInstance)) {
			trNetPat58Array.add(targetInstance);
	{
		if (!initialNode0InTrNetPat58Hash.containsKey(targetInstance.initialNode0)) {
			initialNode0InTrNetPat58Hash.put(targetInstance.initialNode0, new LinkedList<TrNetPat58Instance>());
		}
		initialNode0InTrNetPat58Hash.get(targetInstance.initialNode0).add(targetInstance);
	}
	//patternTrNetPat58HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat57TrNetOp47 = trNetPat57Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp43() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat49Array.size();
	for (int i = newCounterTrNetPat49TrNetOp43; i<sourcePatternSize; i++){
		TrNetPat49Instance sourcePatternInstance = trNetPat49Array.get(i);
		
		
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat49TrNetOp43 = trNetPat49Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp48() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = newCounterTrNetPat56TrNetOp48; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isjoin(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
		TrNetPat59Instance targetInstance = new TrNetPat59Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat59Array.add(targetInstance);
	{
		if (!pseudostate0InTrNetPat59Hash.containsKey(targetInstance.pseudostate0)) {
			pseudostate0InTrNetPat59Hash.put(targetInstance.pseudostate0, new LinkedList<TrNetPat59Instance>());
		}
		pseudostate0InTrNetPat59Hash.get(targetInstance.pseudostate0).add(targetInstance);
	}
	{
		if (!joinNode0InTrNetPat59Hash.containsKey(targetInstance.joinNode0)) {
			joinNode0InTrNetPat59Hash.put(targetInstance.joinNode0, new LinkedList<TrNetPat59Instance>());
		}
		joinNode0InTrNetPat59Hash.get(targetInstance.joinNode0).add(targetInstance);
	}
	//patternTrNetPat59HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat56TrNetOp48 = trNetPat56Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp49() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat59Array.size();
	for (int i = newCounterTrNetPat59TrNetOp49; i<sourcePatternSize; i++){
		TrNetPat59Instance sourcePatternInstance = trNetPat59Array.get(i);
		
		
	{
		TrNetPat60Instance targetInstance = new TrNetPat60Instance();
			{
			targetInstance.joinNode0 = sourcePatternInstance.joinNode0;
			targetInstance.joinNode0.types.add("JoinNode");
			}
		if (trNetPat60Set.add(targetInstance)) {
			trNetPat60Array.add(targetInstance);
	{
		if (!joinNode0InTrNetPat60Hash.containsKey(targetInstance.joinNode0)) {
			joinNode0InTrNetPat60Hash.put(targetInstance.joinNode0, new LinkedList<TrNetPat60Instance>());
		}
		joinNode0InTrNetPat60Hash.get(targetInstance.joinNode0).add(targetInstance);
	}
	//patternTrNetPat60HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat59TrNetOp49 = trNetPat59Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp50() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = newCounterTrNetPat56TrNetOp50; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isfork(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
		TrNetPat61Instance targetInstance = new TrNetPat61Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat61Array.add(targetInstance);
	{
		if (!pseudostate0InTrNetPat61Hash.containsKey(targetInstance.pseudostate0)) {
			pseudostate0InTrNetPat61Hash.put(targetInstance.pseudostate0, new LinkedList<TrNetPat61Instance>());
		}
		pseudostate0InTrNetPat61Hash.get(targetInstance.pseudostate0).add(targetInstance);
	}
	{
		if (!forkNode0InTrNetPat61Hash.containsKey(targetInstance.forkNode0)) {
			forkNode0InTrNetPat61Hash.put(targetInstance.forkNode0, new LinkedList<TrNetPat61Instance>());
		}
		forkNode0InTrNetPat61Hash.get(targetInstance.forkNode0).add(targetInstance);
	}
	//patternTrNetPat61HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat56TrNetOp50 = trNetPat56Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp51() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat61Array.size();
	for (int i = newCounterTrNetPat61TrNetOp51; i<sourcePatternSize; i++){
		TrNetPat61Instance sourcePatternInstance = trNetPat61Array.get(i);
		
		
	{
		TrNetPat62Instance targetInstance = new TrNetPat62Instance();
			{
			targetInstance.forkNode0 = sourcePatternInstance.forkNode0;
			targetInstance.forkNode0.types.add("ForkNode");
			}
		if (trNetPat62Set.add(targetInstance)) {
			trNetPat62Array.add(targetInstance);
	{
		if (!forkNode0InTrNetPat62Hash.containsKey(targetInstance.forkNode0)) {
			forkNode0InTrNetPat62Hash.put(targetInstance.forkNode0, new LinkedList<TrNetPat62Instance>());
		}
		forkNode0InTrNetPat62Hash.get(targetInstance.forkNode0).add(targetInstance);
	}
	//patternTrNetPat62HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat61TrNetOp51 = trNetPat61Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp53() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat63Array.size();
	for (int i = newCounterTrNetPat63TrNetOp53; i<sourcePatternSize; i++){
		TrNetPat63Instance sourcePatternInstance = trNetPat63Array.get(i);
		
		
	{
		TrNetPat64Instance targetInstance = new TrNetPat64Instance();
			{
			targetInstance.decisionNode0 = sourcePatternInstance.decisionNode0;
			targetInstance.decisionNode0.types.add("DecisionNode");
			}
		if (trNetPat64Set.add(targetInstance)) {
			trNetPat64Array.add(targetInstance);
	{
		if (!decisionNode0InTrNetPat64Hash.containsKey(targetInstance.decisionNode0)) {
			decisionNode0InTrNetPat64Hash.put(targetInstance.decisionNode0, new LinkedList<TrNetPat64Instance>());
		}
		decisionNode0InTrNetPat64Hash.get(targetInstance.decisionNode0).add(targetInstance);
	}
	//patternTrNetPat64HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat63TrNetOp53 = trNetPat63Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp52() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat56Array.size();
	for (int i = newCounterTrNetPat56TrNetOp52; i<sourcePatternSize; i++){
		TrNetPat56Instance sourcePatternInstance = trNetPat56Array.get(i);
		
	if (sourcePatternInstance.pseudostate0.attributes.get("kind")==null) {
		continue;
	}
	if (! generic.utils.Conditions.isjunction(sourcePatternInstance.pseudostate0.attributes.get("kind"))) {
		continue;
	}
		
	{
		TrNetPat63Instance targetInstance = new TrNetPat63Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat63Array.add(targetInstance);
	{
		if (!pseudostate0InTrNetPat63Hash.containsKey(targetInstance.pseudostate0)) {
			pseudostate0InTrNetPat63Hash.put(targetInstance.pseudostate0, new LinkedList<TrNetPat63Instance>());
		}
		pseudostate0InTrNetPat63Hash.get(targetInstance.pseudostate0).add(targetInstance);
	}
	{
		if (!decisionNode0InTrNetPat63Hash.containsKey(targetInstance.decisionNode0)) {
			decisionNode0InTrNetPat63Hash.put(targetInstance.decisionNode0, new LinkedList<TrNetPat63Instance>());
		}
		decisionNode0InTrNetPat63Hash.get(targetInstance.decisionNode0).add(targetInstance);
	}
	//patternTrNetPat63HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat56TrNetOp52 = trNetPat56Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp54() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat65Array.size();
	for (int i = newCounterTrNetPat65TrNetOp54; i<sourcePatternSize; i++){
		TrNetPat65Instance sourcePatternInstance = trNetPat65Array.get(i);
		
		
	{
		TrNetPat66Instance targetInstance = new TrNetPat66Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat66Array.add(targetInstance);
	{
		if (!objectFlowState0InTrNetPat66Hash.containsKey(targetInstance.objectFlowState0)) {
			objectFlowState0InTrNetPat66Hash.put(targetInstance.objectFlowState0, new LinkedList<TrNetPat66Instance>());
		}
		objectFlowState0InTrNetPat66Hash.get(targetInstance.objectFlowState0).add(targetInstance);
	}
	{
		if (!activityParameterNode0InTrNetPat66Hash.containsKey(targetInstance.activityParameterNode0)) {
			activityParameterNode0InTrNetPat66Hash.put(targetInstance.activityParameterNode0, new LinkedList<TrNetPat66Instance>());
		}
		activityParameterNode0InTrNetPat66Hash.get(targetInstance.activityParameterNode0).add(targetInstance);
	}
	//patternTrNetPat66HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat65TrNetOp54 = trNetPat65Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp55() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat66Array.size();
	for (int i = newCounterTrNetPat66TrNetOp55; i<sourcePatternSize; i++){
		TrNetPat66Instance sourcePatternInstance = trNetPat66Array.get(i);
		
		
	{
		TrNetPat67Instance targetInstance = new TrNetPat67Instance();
			{
			targetInstance.activityParameterNode0 = sourcePatternInstance.activityParameterNode0;
			targetInstance.activityParameterNode0.types.add("ActivityParameterNode");
			}
		if (trNetPat67Set.add(targetInstance)) {
			trNetPat67Array.add(targetInstance);
	{
		if (!activityParameterNode0InTrNetPat67Hash.containsKey(targetInstance.activityParameterNode0)) {
			activityParameterNode0InTrNetPat67Hash.put(targetInstance.activityParameterNode0, new LinkedList<TrNetPat67Instance>());
		}
		activityParameterNode0InTrNetPat67Hash.get(targetInstance.activityParameterNode0).add(targetInstance);
	}
	//patternTrNetPat67HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	{
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
			trNetPat51Array.add(targetInstance);
	{
		if (!stateVertex0InTrNetPat51Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat51Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat51Instance>());
		}
		stateVertex0InTrNetPat51Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat51Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat51Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat51Instance>());
		}
		activityNode0InTrNetPat51Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat51HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat66TrNetOp55 = trNetPat66Array.size();
	
	
	
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
			trNetPat34Array.add(targetInstance);
	{
		if (!guard0InTrNetPat34Hash.containsKey(targetInstance.guard0)) {
			guard0InTrNetPat34Hash.put(targetInstance.guard0, new LinkedList<TrNetPat34Instance>());
		}
		guard0InTrNetPat34Hash.get(targetInstance.guard0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat34Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat34Hash.put(targetInstance.transition0, new LinkedList<TrNetPat34Instance>());
		}
		transition0InTrNetPat34Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activityEdge0InTrNetPat34Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat34Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat34Instance>());
		}
		activityEdge0InTrNetPat34Hash.get(targetInstance.activityEdge0).add(targetInstance);
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
	for (int i = newCounterTrNetPat35TrNetOp30; i<sourcePatternSize; i++){
		TrNetPat35Instance sourcePatternInstance = trNetPat35Array.get(i);
		
		
	{
		TrNetPat36Instance targetInstance = new TrNetPat36Instance();
				{
	ModelNode node = new ModelNode();
	/*
	Atribuicao de attributos
	- Cada cada attribute pattern do no,
		- Verificar se esse attribute pattern esta a ser gerado por alguma ExternalAttributeCalculationCall
		- Caso esteja, gera o c—digo que chama essa fun‹o usando o qualified name.
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
			trNetPat36Array.add(targetInstance);
	{
		if (!opaqueExpression0InTrNetPat36Hash.containsKey(targetInstance.opaqueExpression0)) {
			opaqueExpression0InTrNetPat36Hash.put(targetInstance.opaqueExpression0, new LinkedList<TrNetPat36Instance>());
		}
		opaqueExpression0InTrNetPat36Hash.get(targetInstance.opaqueExpression0).add(targetInstance);
	}
	{
		if (!activityEdge0InTrNetPat36Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat36Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat36Instance>());
		}
		activityEdge0InTrNetPat36Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	//patternTrNetPat36HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat35TrNetOp30 = trNetPat35Array.size();
	
	
	
	return operatorHasExecuted;
}
boolean executeOperatorTrNetOp31() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat36Array.size();
	for (int i = newCounterTrNetPat36TrNetOp31; i<sourcePatternSize; i++){
		TrNetPat36Instance sourcePatternInstance = trNetPat36Array.get(i);
		
		
	{
		TrNetPat37Instance targetInstance = new TrNetPat37Instance();
			{
			targetInstance.opaqueExpression0 = sourcePatternInstance.opaqueExpression0;
			targetInstance.opaqueExpression0.types.add("OpaqueExpression");
			}
		if (trNetPat37Set.add(targetInstance)) {
			trNetPat37Array.add(targetInstance);
	{
		if (!opaqueExpression0InTrNetPat37Hash.containsKey(targetInstance.opaqueExpression0)) {
			opaqueExpression0InTrNetPat37Hash.put(targetInstance.opaqueExpression0, new LinkedList<TrNetPat37Instance>());
		}
		opaqueExpression0InTrNetPat37Hash.get(targetInstance.opaqueExpression0).add(targetInstance);
	}
	//patternTrNetPat37HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat36TrNetOp31 = trNetPat36Array.size();
	
	
	
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
			trNetPat35Array.add(targetInstance);
	{
		if (!guard0InTrNetPat35Hash.containsKey(targetInstance.guard0)) {
			guard0InTrNetPat35Hash.put(targetInstance.guard0, new LinkedList<TrNetPat35Instance>());
		}
		guard0InTrNetPat35Hash.get(targetInstance.guard0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat35Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat35Hash.put(targetInstance.transition0, new LinkedList<TrNetPat35Instance>());
		}
		transition0InTrNetPat35Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activityEdge0InTrNetPat35Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat35Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat35Instance>());
		}
		activityEdge0InTrNetPat35Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!booleanExpression0InTrNetPat35Hash.containsKey(targetInstance.booleanExpression0)) {
			booleanExpression0InTrNetPat35Hash.put(targetInstance.booleanExpression0, new LinkedList<TrNetPat35Instance>());
		}
		booleanExpression0InTrNetPat35Hash.get(targetInstance.booleanExpression0).add(targetInstance);
	}
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
			trNetPat38Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat38Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat38Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat38Instance>());
		}
		activityEdge0InTrNetPat38Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat38Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat38Hash.put(targetInstance.transition0, new LinkedList<TrNetPat38Instance>());
		}
		transition0InTrNetPat38Hash.get(targetInstance.transition0).add(targetInstance);
	}
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
			trNetPat39Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat39Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat39Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat39Instance>());
		}
		activityEdge0InTrNetPat39Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat39Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat39Hash.put(targetInstance.transition0, new LinkedList<TrNetPat39Instance>());
		}
		transition0InTrNetPat39Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat39Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat39Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat39Instance>());
		}
		stateVertex0InTrNetPat39Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat39Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat39Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat39Instance>());
		}
		activityNode0InTrNetPat39Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat39TrNetOp34; i<sourcePatternSize; i++){
		TrNetPat39Instance sourcePatternInstance = trNetPat39Array.get(i);
		
		
	{
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
			trNetPat40Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat40Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat40Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat40Instance>());
		}
		activityEdge0InTrNetPat40Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat40Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat40Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat40Instance>());
		}
		activityNode0InTrNetPat40Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat40HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat39TrNetOp34 = trNetPat39Array.size();
	
	
	
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
			trNetPat41Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat41Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat41Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat41Instance>());
		}
		activityEdge0InTrNetPat41Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat41Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat41Hash.put(targetInstance.transition0, new LinkedList<TrNetPat41Instance>());
		}
		transition0InTrNetPat41Hash.get(targetInstance.transition0).add(targetInstance);
	}
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
			trNetPat42Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat42Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat42Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat42Instance>());
		}
		activityEdge0InTrNetPat42Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat42Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat42Hash.put(targetInstance.transition0, new LinkedList<TrNetPat42Instance>());
		}
		transition0InTrNetPat42Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat42Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat42Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat42Instance>());
		}
		stateVertex0InTrNetPat42Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat42Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat42Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat42Instance>());
		}
		activityNode0InTrNetPat42Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
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
	for (int i = newCounterTrNetPat42TrNetOp37; i<sourcePatternSize; i++){
		TrNetPat42Instance sourcePatternInstance = trNetPat42Array.get(i);
		
		
	{
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
			trNetPat43Array.add(targetInstance);
	{
		if (!activityEdge0InTrNetPat43Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat43Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat43Instance>());
		}
		activityEdge0InTrNetPat43Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat43Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat43Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat43Instance>());
		}
		activityNode0InTrNetPat43Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat43HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat42TrNetOp37 = trNetPat42Array.size();
	
	
	
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
			trNetPat21Array.add(targetInstance);
	{
		if (!partition0InTrNetPat21Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat21Hash.put(targetInstance.partition0, new LinkedList<TrNetPat21Instance>());
		}
		partition0InTrNetPat21Hash.get(targetInstance.partition0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat21Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat21Hash.put(targetInstance.transition0, new LinkedList<TrNetPat21Instance>());
		}
		transition0InTrNetPat21Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activityPartition0InTrNetPat21Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat21Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat21Instance>());
		}
		activityPartition0InTrNetPat21Hash.get(targetInstance.activityPartition0).add(targetInstance);
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
	
	
	int sourcePatternSize1 = trNetPat21Array.size();
	
	for (int i = 0; i<sourcePatternSize1; i++){
		TrNetPat21Instance sourcePatternInstance1 = trNetPat21Array.get(i);
		
			LinkedList<TrNetPat33Instance> sourcePatternInstances2 = transition0InTrNetPat33Hash.get(sourcePatternInstance1.transition0);
			
			if (sourcePatternInstances2 != null) {
				for (TrNetPat33Instance sourcePatternInstance2 : sourcePatternInstances2) {
					
					
					
	{
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
			trNetPat22Array.add(targetInstance);
	{
		if (!partition0InTrNetPat22Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat22Hash.put(targetInstance.partition0, new LinkedList<TrNetPat22Instance>());
		}
		partition0InTrNetPat22Hash.get(targetInstance.partition0).add(targetInstance);
	}
	{
		if (!transition0InTrNetPat22Hash.containsKey(targetInstance.transition0)) {
			transition0InTrNetPat22Hash.put(targetInstance.transition0, new LinkedList<TrNetPat22Instance>());
		}
		transition0InTrNetPat22Hash.get(targetInstance.transition0).add(targetInstance);
	}
	{
		if (!activityPartition0InTrNetPat22Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat22Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat22Instance>());
		}
		activityPartition0InTrNetPat22Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!activityEdge0InTrNetPat22Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat22Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat22Instance>());
		}
		activityEdge0InTrNetPat22Hash.get(targetInstance.activityEdge0).add(targetInstance);
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
boolean executeOperatorTrNetOp21() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat22Array.size();
	for (int i = newCounterTrNetPat22TrNetOp21; i<sourcePatternSize; i++){
		TrNetPat22Instance sourcePatternInstance = trNetPat22Array.get(i);
		
		
	{
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
			trNetPat23Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat23Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat23Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat23Instance>());
		}
		activityPartition0InTrNetPat23Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!activityEdge0InTrNetPat23Hash.containsKey(targetInstance.activityEdge0)) {
			activityEdge0InTrNetPat23Hash.put(targetInstance.activityEdge0, new LinkedList<TrNetPat23Instance>());
		}
		activityEdge0InTrNetPat23Hash.get(targetInstance.activityEdge0).add(targetInstance);
	}
	//patternTrNetPat23HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat22TrNetOp21 = trNetPat22Array.size();
	
	
	
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
			trNetPat24Array.add(targetInstance);
	{
		if (!partition0InTrNetPat24Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat24Hash.put(targetInstance.partition0, new LinkedList<TrNetPat24Instance>());
		}
		partition0InTrNetPat24Hash.get(targetInstance.partition0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat24Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat24Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat24Instance>());
		}
		stateVertex0InTrNetPat24Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityPartition0InTrNetPat24Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat24Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat24Instance>());
		}
		activityPartition0InTrNetPat24Hash.get(targetInstance.activityPartition0).add(targetInstance);
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
			trNetPat25Array.add(targetInstance);
	{
		if (!partition0InTrNetPat25Hash.containsKey(targetInstance.partition0)) {
			partition0InTrNetPat25Hash.put(targetInstance.partition0, new LinkedList<TrNetPat25Instance>());
		}
		partition0InTrNetPat25Hash.get(targetInstance.partition0).add(targetInstance);
	}
	{
		if (!stateVertex0InTrNetPat25Hash.containsKey(targetInstance.stateVertex0)) {
			stateVertex0InTrNetPat25Hash.put(targetInstance.stateVertex0, new LinkedList<TrNetPat25Instance>());
		}
		stateVertex0InTrNetPat25Hash.get(targetInstance.stateVertex0).add(targetInstance);
	}
	{
		if (!activityPartition0InTrNetPat25Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat25Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat25Instance>());
		}
		activityPartition0InTrNetPat25Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat25Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat25Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat25Instance>());
		}
		activityNode0InTrNetPat25Hash.get(targetInstance.activityNode0).add(targetInstance);
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
boolean executeOperatorTrNetOp24() {
	boolean operatorHasExecuted = false;
	
	
	
	int sourcePatternSize = trNetPat25Array.size();
	for (int i = newCounterTrNetPat25TrNetOp24; i<sourcePatternSize; i++){
		TrNetPat25Instance sourcePatternInstance = trNetPat25Array.get(i);
		
		
	{
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
			trNetPat26Array.add(targetInstance);
	{
		if (!activityPartition0InTrNetPat26Hash.containsKey(targetInstance.activityPartition0)) {
			activityPartition0InTrNetPat26Hash.put(targetInstance.activityPartition0, new LinkedList<TrNetPat26Instance>());
		}
		activityPartition0InTrNetPat26Hash.get(targetInstance.activityPartition0).add(targetInstance);
	}
	{
		if (!activityNode0InTrNetPat26Hash.containsKey(targetInstance.activityNode0)) {
			activityNode0InTrNetPat26Hash.put(targetInstance.activityNode0, new LinkedList<TrNetPat26Instance>());
		}
		activityNode0InTrNetPat26Hash.get(targetInstance.activityNode0).add(targetInstance);
	}
	//patternTrNetPat26HasChanged = true; // Isto agora deixa de fazer sentido ja que o controlo passa a estar no metofdo run.
	operatorHasExecuted = true;
		}
	}
	}
	
	newCounterTrNetPat25TrNetOp24 = trNetPat25Array.size();
	
	
	
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






