/*
 * generated by Xtext
 */
package org.softlang.megal.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.softlang.megal.model.Declaration
import org.softlang.megal.model.PointerDeclarationRef
import com.google.inject.Inject
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class MegaLScopeProvider extends AbstractDeclarativeScopeProvider {
	@Inject
	var QualifiedNameProvider qualifiedNameProvider

	def <T> Iterable<T> all(Declaration d, (Declaration)=>Iterable<T> g) {

		// Sadly we have to do this by hand, as IncQuery does
		// not like lazy linking resource very much
		g.apply(d) + d.imports.filter(PointerDeclarationRef).map[all(refered, g)].flatten
	}

	def scope_EntityType(Declaration d, EReference r) {
		Scopes.scopeFor(d.all[entityTypes], qualifiedNameProvider, null)
	}

	def scope_Entity(Declaration d, EReference r) {
		Scopes.scopeFor(d.all[entities], qualifiedNameProvider, null)
	}

	def scope_RelationType(Declaration d, EReference r) {
		Scopes.scopeFor(d.all[relationTypes], qualifiedNameProvider, null)
	}

	def scope_Relation(Declaration d, EReference r) {
		Scopes.scopeFor(d.all[relations], qualifiedNameProvider, null)
	}
}
