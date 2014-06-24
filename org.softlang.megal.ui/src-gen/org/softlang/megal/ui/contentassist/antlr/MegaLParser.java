/*
* generated by Xtext
*/
package org.softlang.megal.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.softlang.megal.services.MegaLGrammarAccess;

public class MegaLParser extends AbstractContentAssistParser {
	
	@Inject
	private MegaLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.softlang.megal.ui.contentassist.antlr.internal.InternalMegaLParser createParser() {
		org.softlang.megal.ui.contentassist.antlr.internal.InternalMegaLParser result = new org.softlang.megal.ui.contentassist.antlr.internal.InternalMegaLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
					put(grammarAccess.getMegaLDefinitionAccess().getAlternatives_3(), "rule__MegaLDefinition__Alternatives_3");
					put(grammarAccess.getUseETDAccess().getAlternatives(), "rule__UseETD__Alternatives");
					put(grammarAccess.getMegaLDefinitionAccess().getGroup(), "rule__MegaLDefinition__Group__0");
					put(grammarAccess.getMegaLDefinitionAccess().getGroup_2(), "rule__MegaLDefinition__Group_2__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getETDAccess().getGroup(), "rule__ETD__Group__0");
					put(grammarAccess.getRTDAccess().getGroup(), "rule__RTD__Group__0");
					put(grammarAccess.getRDAccess().getGroup(), "rule__RD__Group__0");
					put(grammarAccess.getEDAccess().getGroup(), "rule__ED__Group__0");
					put(grammarAccess.getUseEntityAccess().getGroup(), "rule__UseEntity__Group__0");
					put(grammarAccess.getMegaLLinkingAccess().getGroup(), "rule__MegaLLinking__Group__0");
					put(grammarAccess.getMegaLLinkingAccess().getGroup_2(), "rule__MegaLLinking__Group_2__0");
					put(grammarAccess.getLDAccess().getGroup(), "rule__LD__Group__0");
					put(grammarAccess.getQualifiedIDAccess().getGroup(), "rule__QualifiedID__Group__0");
					put(grammarAccess.getQualifiedIDAccess().getGroup_1(), "rule__QualifiedID__Group_1__0");
					put(grammarAccess.getMegaLDefinitionAccess().getNameAssignment_1(), "rule__MegaLDefinition__NameAssignment_1");
					put(grammarAccess.getMegaLDefinitionAccess().getLinkerAssignment_2_2(), "rule__MegaLDefinition__LinkerAssignment_2_2");
					put(grammarAccess.getMegaLDefinitionAccess().getImportsAssignment_3_0(), "rule__MegaLDefinition__ImportsAssignment_3_0");
					put(grammarAccess.getMegaLDefinitionAccess().getEtdsAssignment_3_1(), "rule__MegaLDefinition__EtdsAssignment_3_1");
					put(grammarAccess.getMegaLDefinitionAccess().getRtdsAssignment_3_2(), "rule__MegaLDefinition__RtdsAssignment_3_2");
					put(grammarAccess.getMegaLDefinitionAccess().getEdsAssignment_3_3(), "rule__MegaLDefinition__EdsAssignment_3_3");
					put(grammarAccess.getMegaLDefinitionAccess().getRdsAssignment_3_4(), "rule__MegaLDefinition__RdsAssignment_3_4");
					put(grammarAccess.getImportAccess().getRefAssignment_1(), "rule__Import__RefAssignment_1");
					put(grammarAccess.getETDAccess().getNameAssignment_0(), "rule__ETD__NameAssignment_0");
					put(grammarAccess.getETDAccess().getSupertypeAssignment_2(), "rule__ETD__SupertypeAssignment_2");
					put(grammarAccess.getRTDAccess().getNameAssignment_0(), "rule__RTD__NameAssignment_0");
					put(grammarAccess.getRTDAccess().getDomainAssignment_2(), "rule__RTD__DomainAssignment_2");
					put(grammarAccess.getRTDAccess().getCoDomainAssignment_4(), "rule__RTD__CoDomainAssignment_4");
					put(grammarAccess.getRDAccess().getSourceAssignment_0(), "rule__RD__SourceAssignment_0");
					put(grammarAccess.getRDAccess().getRelAssignment_1(), "rule__RD__RelAssignment_1");
					put(grammarAccess.getRDAccess().getTargetAssignment_2(), "rule__RD__TargetAssignment_2");
					put(grammarAccess.getEDAccess().getNameAssignment_0(), "rule__ED__NameAssignment_0");
					put(grammarAccess.getEDAccess().getTypeAssignment_2(), "rule__ED__TypeAssignment_2");
					put(grammarAccess.getUseETDRefAccess().getRefAssignment(), "rule__UseETDRef__RefAssignment");
					put(grammarAccess.getMegaLLinkingAccess().getNameAssignment_1(), "rule__MegaLLinking__NameAssignment_1");
					put(grammarAccess.getMegaLLinkingAccess().getTargetAssignment_2_1(), "rule__MegaLLinking__TargetAssignment_2_1");
					put(grammarAccess.getMegaLLinkingAccess().getLdsAssignment_3(), "rule__MegaLLinking__LdsAssignment_3");
					put(grammarAccess.getLDAccess().getTargetAssignment_0(), "rule__LD__TargetAssignment_0");
					put(grammarAccess.getLDAccess().getValueAssignment_2(), "rule__LD__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.softlang.megal.ui.contentassist.antlr.internal.InternalMegaLParser typedParser = (org.softlang.megal.ui.contentassist.antlr.internal.InternalMegaLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS" };
	}
	
	public MegaLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MegaLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
