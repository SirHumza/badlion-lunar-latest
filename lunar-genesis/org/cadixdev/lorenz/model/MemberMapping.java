package org.cadixdev.lorenz.model;

public interface MemberMapping<M extends MemberMapping, P extends Mapping> extends Mapping<M, P> {
   P getParent();
}
