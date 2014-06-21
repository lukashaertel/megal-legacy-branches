/*
 * generated by Xtext
 */
package org.softlang.megal.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.calculation.Calculation
import org.softlang.megal.megaL.MegaLDefinition
import org.softlang.megal.megaL.MegaLLinking

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class MegaLScopeProvider extends AbstractDeclarativeScopeProvider {

	def scope_ETD(MegaLDefinition d, EReference er) {
		val is = Calculation.allDefinitions(d)

		Scopes::scopeFor(is.map[etds].flatten)
	}

	def scope_RTD(MegaLDefinition d, EReference er) {
		val is = Calculation.allDefinitions(d)

		Scopes::scopeFor(is.map[rtds].flatten)
	}

	def scope_ED(MegaLDefinition d, EReference er) {
		val is = Calculation.allDefinitions(d)

		Scopes::scopeFor(is.map[eds].flatten)
	}

	def scope_ETD(MegaLLinking l, EReference er) {
		scope_ETD(l.target, er)
	}

	def scope_RTD(MegaLLinking l, EReference er) {
		scope_RTD(l.target, er)
	}

	def scope_ED(MegaLLinking l, EReference er) {
		scope_ED(l.target, er)
	}

	def scope_LD_target(MegaLLinking l, EReference er) {
		Scopes::scopeFor(l.target.eds)
	}
}
