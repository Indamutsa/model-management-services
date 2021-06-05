/*
 * generated by Xtext 2.25.0
 */
package com.arsene.workflow.ide.contentassist.antlr;

import com.arsene.workflow.ide.contentassist.antlr.internal.InternalWorkflowParser;
import com.arsene.workflow.services.WorkflowGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class WorkflowParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WorkflowGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WorkflowGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
			builder.put(grammarAccess.getMethodAccess().getAlternatives_2(), "rule__Method__Alternatives_2");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getTypeNameAlternatives_0_0(), "rule__PrimitiveType__TypeNameAlternatives_0_0");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getMethodInvocationAccess().getAlternatives_2(), "rule__MethodInvocation__Alternatives_2");
			builder.put(grammarAccess.getMethodInvocationAccess().getAlternatives_3(), "rule__MethodInvocation__Alternatives_3");
			builder.put(grammarAccess.getIfBlockAccess().getAlternatives(), "rule__IfBlock__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives_0(), "rule__Variable__Alternatives_0");
			builder.put(grammarAccess.getVariableAccess().getTypeNameAlternatives_0_0_0_0(), "rule__Variable__TypeNameAlternatives_0_0_0_0");
			builder.put(grammarAccess.getVariableAccess().getAlternatives_1_1(), "rule__Variable__Alternatives_1_1");
			builder.put(grammarAccess.getVariableTypeAccess().getAlternatives(), "rule__VariableType__Alternatives");
			builder.put(grammarAccess.getAssignmentAccess().getAlternatives_2(), "rule__Assignment__Alternatives_2");
			builder.put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0(), "rule__MulOrDiv__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0(), "rule__Atomic__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getWorkflowTypeAccess().getAlternatives(), "rule__WorkflowType__Alternatives");
			builder.put(grammarAccess.getWorkflowAccess().getGroup(), "rule__Workflow__Group__0");
			builder.put(grammarAccess.getWorkflowAccess().getGroup_2(), "rule__Workflow__Group_2__0");
			builder.put(grammarAccess.getStepAccess().getGroup(), "rule__Step__Group__0");
			builder.put(grammarAccess.getExecuteAccess().getGroup(), "rule__Execute__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_2_0(), "rule__Method__Group_2_0__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_2_0_1(), "rule__Method__Group_2_0_1__0");
			builder.put(grammarAccess.getMethodAccess().getGroup_2_0_1_1(), "rule__Method__Group_2_0_1_1__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
			builder.put(grammarAccess.getMethodInvocationAccess().getGroup(), "rule__MethodInvocation__Group__0");
			builder.put(grammarAccess.getMethodInvocationAccess().getGroup_3_0(), "rule__MethodInvocation__Group_3_0__0");
			builder.put(grammarAccess.getMethodInvocationAccess().getGroup_3_0_1(), "rule__MethodInvocation__Group_3_0_1__0");
			builder.put(grammarAccess.getMethodInvocationAccess().getGroup_3_0_1_1(), "rule__MethodInvocation__Group_3_0_1_1__0");
			builder.put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
			builder.put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
			builder.put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
			builder.put(grammarAccess.getLoopStatementAccess().getGroup(), "rule__LoopStatement__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_0_0(), "rule__Variable__Group_0_0__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_0_1(), "rule__Variable__Group_0_1__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_0_1_3(), "rule__Variable__Group_0_1_3__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1(), "rule__Variable__Group_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getDisplayAccess().getGroup(), "rule__Display__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getModAccess().getGroup(), "rule__Mod__Group__0");
			builder.put(grammarAccess.getModAccess().getGroup_1(), "rule__Mod__Group_1__0");
			builder.put(grammarAccess.getModAccess().getGroup_1_0(), "rule__Mod__Group_1_0__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1_0(), "rule__MulOrDiv__Group_1_0__0");
			builder.put(grammarAccess.getExpoAccess().getGroup(), "rule__Expo__Group__0");
			builder.put(grammarAccess.getExpoAccess().getGroup_1(), "rule__Expo__Group_1__0");
			builder.put(grammarAccess.getExpoAccess().getGroup_1_0(), "rule__Expo__Group_1_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getWorkflowProgramModelAccess().getFeaturesAssignment(), "rule__WorkflowProgramModel__FeaturesAssignment");
			builder.put(grammarAccess.getFeatureAccess().getStatementAssignment_0(), "rule__Feature__StatementAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getMethodAssignment_1(), "rule__Feature__MethodAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getWorkflowAssignment_2(), "rule__Feature__WorkflowAssignment_2");
			builder.put(grammarAccess.getWorkflowAccess().getNameAssignment_1(), "rule__Workflow__NameAssignment_1");
			builder.put(grammarAccess.getWorkflowAccess().getTypeAssignment_2_1(), "rule__Workflow__TypeAssignment_2_1");
			builder.put(grammarAccess.getWorkflowAccess().getStepsAssignment_4(), "rule__Workflow__StepsAssignment_4");
			builder.put(grammarAccess.getWorkflowAccess().getExecuteAssignment_6(), "rule__Workflow__ExecuteAssignment_6");
			builder.put(grammarAccess.getStepAccess().getNameAssignment_1(), "rule__Step__NameAssignment_1");
			builder.put(grammarAccess.getStepAccess().getBodyAssignment_2(), "rule__Step__BodyAssignment_2");
			builder.put(grammarAccess.getExecuteAccess().getWorkflowAssignment_1(), "rule__Execute__WorkflowAssignment_1");
			builder.put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
			builder.put(grammarAccess.getMethodAccess().getParamsAssignment_2_0_1_0(), "rule__Method__ParamsAssignment_2_0_1_0");
			builder.put(grammarAccess.getMethodAccess().getParamsAssignment_2_0_1_1_1(), "rule__Method__ParamsAssignment_2_0_1_1_1");
			builder.put(grammarAccess.getMethodAccess().getBodyAssignment_3(), "rule__Method__BodyAssignment_3");
			builder.put(grammarAccess.getBlockAccess().getStatementsAssignment_2(), "rule__Block__StatementsAssignment_2");
			builder.put(grammarAccess.getBlockAccess().getReturnStatementAssignment_3(), "rule__Block__ReturnStatementAssignment_3");
			builder.put(grammarAccess.getReturnAccess().getExpressionAssignment_1(), "rule__Return__ExpressionAssignment_1");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0(), "rule__PrimitiveType__TypeNameAssignment_0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_2(), "rule__PrimitiveType__NameAssignment_2");
			builder.put(grammarAccess.getStatementAccess().getVariablAssignment_0(), "rule__Statement__VariablAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getPrintAssignment_1(), "rule__Statement__PrintAssignment_1");
			builder.put(grammarAccess.getStatementAccess().getAssignmentAssignment_2(), "rule__Statement__AssignmentAssignment_2");
			builder.put(grammarAccess.getStatementAccess().getIfStatementAssignment_3(), "rule__Statement__IfStatementAssignment_3");
			builder.put(grammarAccess.getStatementAccess().getLoopAssignment_4(), "rule__Statement__LoopAssignment_4");
			builder.put(grammarAccess.getStatementAccess().getMethodInvocationAssignment_5(), "rule__Statement__MethodInvocationAssignment_5");
			builder.put(grammarAccess.getMethodInvocationAccess().getInvokedMethodAssignment_2_0(), "rule__MethodInvocation__InvokedMethodAssignment_2_0");
			builder.put(grammarAccess.getMethodInvocationAccess().getServiceAssignment_2_1(), "rule__MethodInvocation__ServiceAssignment_2_1");
			builder.put(grammarAccess.getMethodInvocationAccess().getArgsAssignment_3_0_1_0(), "rule__MethodInvocation__ArgsAssignment_3_0_1_0");
			builder.put(grammarAccess.getMethodInvocationAccess().getArgsAssignment_3_0_1_1_1(), "rule__MethodInvocation__ArgsAssignment_3_0_1_1_1");
			builder.put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
			builder.put(grammarAccess.getIfStatementAccess().getExpressionAssignment_2(), "rule__IfStatement__ExpressionAssignment_2");
			builder.put(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4(), "rule__IfStatement__ThenBlockAssignment_4");
			builder.put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1(), "rule__IfStatement__ElseBlockAssignment_5_1");
			builder.put(grammarAccess.getIfBlockAccess().getStatementsAssignment_0(), "rule__IfBlock__StatementsAssignment_0");
			builder.put(grammarAccess.getLoopStatementAccess().getExpressionAssignment_3(), "rule__LoopStatement__ExpressionAssignment_3");
			builder.put(grammarAccess.getLoopStatementAccess().getThenBlockAssignment_5(), "rule__LoopStatement__ThenBlockAssignment_5");
			builder.put(grammarAccess.getVariableAccess().getTypeNameAssignment_0_0_0(), "rule__Variable__TypeNameAssignment_0_0_0");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0_0_2(), "rule__Variable__NameAssignment_0_0_2");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0_1_2(), "rule__Variable__NameAssignment_0_1_2");
			builder.put(grammarAccess.getVariableAccess().getArrayAssignment_0_1_3_0(), "rule__Variable__ArrayAssignment_0_1_3_0");
			builder.put(grammarAccess.getVariableAccess().getLengthAssignment_0_1_3_1(), "rule__Variable__LengthAssignment_0_1_3_1");
			builder.put(grammarAccess.getVariableAccess().getExpressionAssignment_1_1_0(), "rule__Variable__ExpressionAssignment_1_1_0");
			builder.put(grammarAccess.getVariableAccess().getMethodInvocationAssignment_1_1_1(), "rule__Variable__MethodInvocationAssignment_1_1_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getDisplayAccess().getExpressionAssignment_2(), "rule__Display__ExpressionAssignment_2");
			builder.put(grammarAccess.getAssignmentAccess().getVariableAssignment_0(), "rule__Assignment__VariableAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0(), "rule__Assignment__ExpressionAssignment_2_0");
			builder.put(grammarAccess.getAssignmentAccess().getMethodInvocationAssignment_2_1(), "rule__Assignment__MethodInvocationAssignment_2_1");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getModAccess().getOpAssignment_1_0_1(), "rule__Mod__OpAssignment_1_0_1");
			builder.put(grammarAccess.getModAccess().getRightAssignment_1_1(), "rule__Mod__RightAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1(), "rule__MulOrDiv__OpAssignment_1_0_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1(), "rule__MulOrDiv__RightAssignment_1_1");
			builder.put(grammarAccess.getExpoAccess().getOpAssignment_1_0_1(), "rule__Expo__OpAssignment_1_0_1");
			builder.put(grammarAccess.getExpoAccess().getRightAssignment_1_1(), "rule__Expo__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2(), "rule__Primary__ExpressionAssignment_2_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getVariableAssignment_3_1(), "rule__Atomic__VariableAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WorkflowGrammarAccess grammarAccess;

	@Override
	protected InternalWorkflowParser createParser() {
		InternalWorkflowParser result = new InternalWorkflowParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WorkflowGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WorkflowGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}