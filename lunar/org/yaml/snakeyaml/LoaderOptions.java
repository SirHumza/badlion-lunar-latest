package org.yaml.snakeyaml;

import org.yaml.snakeyaml.inspector.TagInspector;
import org.yaml.snakeyaml.inspector.UnTrustedTagInspector;

public class LoaderOptions {
   private boolean allowDuplicateKeys = true;
   private boolean wrappedToRootException = false;
   private int maxAliasesForCollections = 50;
   private boolean allowRecursiveKeys = false;
   private boolean processComments = false;
   private boolean enumCaseSensitive = true;
   private int nestingDepthLimit = 50;
   private int codePointLimit = 3145728;
   private TagInspector tagInspector = new UnTrustedTagInspector();

   public final boolean isAllowDuplicateKeys() {
      return this.allowDuplicateKeys;
   }

   public void setAllowDuplicateKeys(boolean var1) {
      this.allowDuplicateKeys = var1;
   }

   public final boolean isWrappedToRootException() {
      return this.wrappedToRootException;
   }

   public void setWrappedToRootException(boolean var1) {
      this.wrappedToRootException = var1;
   }

   public final int getMaxAliasesForCollections() {
      return this.maxAliasesForCollections;
   }

   public void setMaxAliasesForCollections(int var1) {
      this.maxAliasesForCollections = var1;
   }

   public final boolean getAllowRecursiveKeys() {
      return this.allowRecursiveKeys;
   }

   public void setAllowRecursiveKeys(boolean var1) {
      this.allowRecursiveKeys = var1;
   }

   public final boolean isProcessComments() {
      return this.processComments;
   }

   public LoaderOptions setProcessComments(boolean var1) {
      this.processComments = var1;
      return this;
   }

   public final boolean isEnumCaseSensitive() {
      return this.enumCaseSensitive;
   }

   public void setEnumCaseSensitive(boolean var1) {
      this.enumCaseSensitive = var1;
   }

   public final int getNestingDepthLimit() {
      return this.nestingDepthLimit;
   }

   public void setNestingDepthLimit(int var1) {
      this.nestingDepthLimit = var1;
   }

   public final int getCodePointLimit() {
      return this.codePointLimit;
   }

   public void setCodePointLimit(int var1) {
      this.codePointLimit = var1;
   }

   public TagInspector getTagInspector() {
      return this.tagInspector;
   }

   public void setTagInspector(TagInspector var1) {
      this.tagInspector = var1;
   }
}
