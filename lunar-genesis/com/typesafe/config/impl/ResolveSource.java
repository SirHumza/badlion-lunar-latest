package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;

final class ResolveSource {
   final AbstractConfigObject root;
   final ResolveSource.Node<Container> pathFromRoot;

   ResolveSource(AbstractConfigObject var1, ResolveSource.Node<Container> var2) {
      this.root = var1;
      this.pathFromRoot = var2;
   }

   ResolveSource(AbstractConfigObject var1) {
      this.root = var1;
      this.pathFromRoot = null;
   }

   private AbstractConfigObject rootMustBeObj(Container var1) {
      return var1 instanceof AbstractConfigObject ? (AbstractConfigObject)var1 : SimpleConfigObject.empty();
   }

   private static ResolveSource.ResultWithPath findInObject(AbstractConfigObject var0, ResolveContext var1, Path var2) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace("*** finding '" + var2 + "' in " + var0);
      }

      Path var3 = var1.restrictToChild();
      ResolveResult var4 = var1.restrict(var2).resolve(var0, new ResolveSource(var0));
      ResolveContext var5 = var4.context.restrict(var3);
      if (var4.value instanceof AbstractConfigObject) {
         ResolveSource.ValueWithPath var6 = findInObject((AbstractConfigObject)var4.value, var2);
         return new ResolveSource.ResultWithPath(ResolveResult.make(var5, var6.value), var6.pathFromRoot);
      } else {
         throw new ConfigException.BugOrBroken("resolved object to non-object " + var0 + " to " + var4);
      }
   }

   private static ResolveSource.ValueWithPath findInObject(AbstractConfigObject var0, Path var1) {
      try {
         return findInObject(var0, var1, null);
      } catch (ConfigException.NotResolved var3) {
         throw ConfigImpl.improveNotResolved(var1, var3);
      }
   }

   private static ResolveSource.ValueWithPath findInObject(AbstractConfigObject var0, Path var1, ResolveSource.Node<Container> var2) {
      String var3 = var1.first();
      Path var4 = var1.remainder();
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace("*** looking up '" + var3 + "' in " + var0);
      }

      AbstractConfigValue var5 = var0.attemptPeekWithPartialResolve(var3);
      ResolveSource.Node var6 = var2 == null ? new ResolveSource.Node<>(var0) : var2.prepend(var0);
      if (var4 == null) {
         return new ResolveSource.ValueWithPath(var5, var6);
      } else {
         return var5 instanceof AbstractConfigObject ? findInObject((AbstractConfigObject)var5, var4, var6) : new ResolveSource.ValueWithPath(null, var6);
      }
   }

   ResolveSource.ResultWithPath lookupSubst(ResolveContext var1, SubstitutionExpression var2, int var3) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(var1.depth(), "searching for " + var2);
      }

      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(var1.depth(), var2 + " - looking up relative to file it occurred in");
      }

      ResolveSource.ResultWithPath var4 = findInObject(this.root, var1, var2.path());
      if (var4.result.value == null) {
         Path var5 = var2.path().subPath(var3);
         if (var3 > 0) {
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var4.result.context.depth(), var5 + " - looking up relative to parent file");
            }

            var4 = findInObject(this.root, var4.result.context, var5);
         }

         if (var4.result.value == null && var4.result.context.options().getUseSystemEnvironment()) {
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var4.result.context.depth(), var5 + " - looking up in system environment");
            }

            var4 = findInObject(ConfigImpl.envVariablesAsConfigObject(), var1, var5);
         }
      }

      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(var4.result.context.depth(), "resolved to " + var4);
      }

      return var4;
   }

   ResolveSource pushParent(Container var1) {
      if (var1 == null) {
         throw new ConfigException.BugOrBroken("can't push null parent");
      }

      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace("pushing parent " + var1 + " ==root " + (var1 == this.root) + " onto " + this);
      }

      if (this.pathFromRoot == null) {
         if (var1 == this.root) {
            return new ResolveSource(this.root, new ResolveSource.Node<>(var1));
         }

         if (ConfigImpl.traceSubstitutionsEnabled() && this.root.hasDescendant((AbstractConfigValue)var1)) {
            ConfigImpl.trace("***** BUG ***** tried to push parent " + var1 + " without having a path to it in " + this);
         }

         return this;
      } else {
         Container var2 = this.pathFromRoot.head();
         if (ConfigImpl.traceSubstitutionsEnabled() && var2 != null && !var2.hasDescendant((AbstractConfigValue)var1)) {
            ConfigImpl.trace("***** BUG ***** trying to push non-child of " + var2 + ", non-child was " + var1);
         }

         return new ResolveSource(this.root, this.pathFromRoot.prepend(var1));
      }
   }

   ResolveSource resetParents() {
      return this.pathFromRoot == null ? this : new ResolveSource(this.root);
   }

   private static ResolveSource.Node<Container> replace(ResolveSource.Node<Container> var0, Container var1, AbstractConfigValue var2) {
      Container var3 = (Container)var0.head();
      if (var3 != var1) {
         throw new ConfigException.BugOrBroken(
            "Can only replace() the top node we're resolving; had " + var3 + " on top and tried to replace " + var1 + " overall list was " + var0
         );
      }

      Container var4 = var0.tail() == null ? null : (Container)var0.tail().head();
      if (var2 != null && var2 instanceof Container) {
         if (var4 == null) {
            return new ResolveSource.Node<>((Container)var2);
         }

         AbstractConfigValue var7 = var4.replaceChild((AbstractConfigValue)var1, var2);
         ResolveSource.Node var6 = replace(var0.tail(), var4, var7);
         return var6 != null ? var6.prepend((Container)var2) : new ResolveSource.Node<>((Container)var2);
      } else {
         if (var4 == null) {
            return null;
         }

         AbstractConfigValue var5 = var4.replaceChild((AbstractConfigValue)var1, null);
         return replace(var0.tail(), var4, var5);
      }
   }

   ResolveSource replaceCurrentParent(Container var1, Container var2) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(
            "replaceCurrentParent old "
               + var1
               + "@"
               + System.identityHashCode(var1)
               + " replacement "
               + var2
               + "@"
               + System.identityHashCode(var1)
               + " in "
               + this
         );
      }

      if (var1 == var2) {
         return this;
      }

      if (this.pathFromRoot != null) {
         ResolveSource.Node var3 = replace(this.pathFromRoot, var1, (AbstractConfigValue)var2);
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace("replaced " + var1 + " with " + var2 + " in " + this);
            ConfigImpl.trace("path was: " + this.pathFromRoot + " is now " + var3);
         }

         return var3 != null ? new ResolveSource((AbstractConfigObject)var3.last(), var3) : new ResolveSource(SimpleConfigObject.empty());
      } else if (var1 == this.root) {
         return new ResolveSource(this.rootMustBeObj(var2));
      } else {
         throw new ConfigException.BugOrBroken("attempt to replace root " + this.root + " with " + var2);
      }
   }

   ResolveSource replaceWithinCurrentParent(AbstractConfigValue var1, AbstractConfigValue var2) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(
            "replaceWithinCurrentParent old "
               + var1
               + "@"
               + System.identityHashCode(var1)
               + " replacement "
               + var2
               + "@"
               + System.identityHashCode(var1)
               + " in "
               + this
         );
      }

      if (var1 == var2) {
         return this;
      } else if (this.pathFromRoot != null) {
         Container var3 = this.pathFromRoot.head();
         AbstractConfigValue var4 = var3.replaceChild(var1, var2);
         return this.replaceCurrentParent(var3, var4 instanceof Container ? (Container)var4 : null);
      } else if (var1 == this.root && var2 instanceof Container) {
         return new ResolveSource(this.rootMustBeObj((Container)var2));
      } else {
         throw new ConfigException.BugOrBroken("replace in parent not possible " + var1 + " with " + var2 + " in " + this);
      }
   }

   @Override
   public String toString() {
      return "ResolveSource(root=" + this.root + ", pathFromRoot=" + this.pathFromRoot + ")";
   }

   static final class Node<T> {
      final T value;
      final ResolveSource.Node<T> next;

      Node(T var1, ResolveSource.Node<T> var2) {
         this.value = (T)var1;
         this.next = var2;
      }

      Node(T var1) {
         this((T)var1, null);
      }

      ResolveSource.Node<T> prepend(T var1) {
         return new ResolveSource.Node<>((T)var1, this);
      }

      T head() {
         return this.value;
      }

      ResolveSource.Node<T> tail() {
         return this.next;
      }

      T last() {
         ResolveSource.Node var1 = this;

         while (var1.next != null) {
            var1 = var1.next;
         }

         return var1.value;
      }

      ResolveSource.Node<T> reverse() {
         if (this.next == null) {
            return this;
         }

         ResolveSource.Node var1 = new ResolveSource.Node(this.value);

         for (ResolveSource.Node var2 = this.next; var2 != null; var2 = var2.next) {
            var1 = var1.prepend(var2.value);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuffer var1 = new StringBuffer();
         var1.append("[");

         for (ResolveSource.Node var2 = this.reverse(); var2 != null; var2 = var2.next) {
            var1.append(var2.value.toString());
            if (var2.next != null) {
               var1.append(" <= ");
            }
         }

         var1.append("]");
         return var1.toString();
      }
   }

   static final class ResultWithPath {
      final ResolveResult<? extends AbstractConfigValue> result;
      final ResolveSource.Node<Container> pathFromRoot;

      ResultWithPath(ResolveResult<? extends AbstractConfigValue> var1, ResolveSource.Node<Container> var2) {
         this.result = var1;
         this.pathFromRoot = var2;
      }

      @Override
      public String toString() {
         return "ResultWithPath(result=" + this.result + ", pathFromRoot=" + this.pathFromRoot + ")";
      }
   }

   static final class ValueWithPath {
      final AbstractConfigValue value;
      final ResolveSource.Node<Container> pathFromRoot;

      ValueWithPath(AbstractConfigValue var1, ResolveSource.Node<Container> var2) {
         this.value = var1;
         this.pathFromRoot = var2;
      }

      @Override
      public String toString() {
         return "ValueWithPath(value=" + this.value + ", pathFromRoot=" + this.pathFromRoot + ")";
      }
   }
}
