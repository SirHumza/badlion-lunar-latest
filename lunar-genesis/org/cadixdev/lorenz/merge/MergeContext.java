package org.cadixdev.lorenz.merge;

import java.util.Objects;
import org.cadixdev.lorenz.MappingSet;

public class MergeContext {
   private final MappingSet left;
   private final MappingSet right;
   private MappingSet leftReversed;
   private MappingSet rightReversed;

   public MergeContext(MappingSet var1, MappingSet var2) {
      this.left = Objects.requireNonNull(var1, "Left MappingSet may not be null");
      this.right = Objects.requireNonNull(var2, "Right MappingSet may not be null");
   }

   public MappingSet getLeft() {
      return this.left;
   }

   public MappingSet getRight() {
      return this.right;
   }

   public MappingSet getLeftReversed() {
      MappingSet var1 = this.leftReversed;
      if (var1 != null) {
         return var1;
      }

      synchronized (this.left) {
         var1 = this.leftReversed;
         if (var1 != null) {
            return var1;
         }

         this.leftReversed = this.left.reverse();
         return this.leftReversed;
      }
   }

   public MappingSet getRightReversed() {
      MappingSet var1 = this.rightReversed;
      if (var1 != null) {
         return var1;
      }

      synchronized (this.right) {
         var1 = this.rightReversed;
         if (var1 != null) {
            return var1;
         }

         this.rightReversed = this.right.reverse();
         return this.rightReversed;
      }
   }
}
