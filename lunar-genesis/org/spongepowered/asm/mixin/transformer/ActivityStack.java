package org.spongepowered.asm.mixin.transformer;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;

public class ActivityStack implements IActivityContext {
   public static final String GLUE_STRING = " -> ";
   private final ActivityStack.Activity head;
   private ActivityStack.Activity tail;
   private String glue;

   public ActivityStack() {
      this(null, " -> ");
   }

   public ActivityStack(String var1) {
      this(var1, " -> ");
   }

   public ActivityStack(String var1, String var2) {
      this.head = this.tail = new ActivityStack.Activity(null, var1);
      this.glue = var2;
   }

   @Override
   public void clear() {
      this.tail = this.head;
      this.head.next = null;
   }

   @Override
   public IActivityContext.IActivity begin(String var1) {
      return this.tail = new ActivityStack.Activity(this.tail, var1 != null ? var1 : "null");
   }

   @Override
   public IActivityContext.IActivity begin(String var1, Object... var2) {
      if (var1 == null) {
         var1 = "null";
      }

      return this.tail = new ActivityStack.Activity(this.tail, String.format(var1, var2));
   }

   void end(ActivityStack.Activity var1) {
      this.tail = var1.last;
      this.tail.next = null;
   }

   @Override
   public String toString() {
      return this.toString(this.glue);
   }

   @Override
   public String toString(String var1) {
      if (this.head.description == null && this.head.next == null) {
         return "Unknown";
      }

      StringBuilder var2 = new StringBuilder();

      for (ActivityStack.Activity var3 = this.head; var3 != null; var3 = var3.next) {
         if (var3.description != null) {
            var2.append(var3.description);
            if (var3.next != null) {
               var2.append(var1);
            }
         }
      }

      return var2.toString();
   }

   public class Activity implements IActivityContext.IActivity {
      public String description;
      ActivityStack.Activity last;
      ActivityStack.Activity next;

      Activity(ActivityStack.Activity var2, String var3) {
         if (var2 != null) {
            var2.next = this;
         }

         this.last = var2;
         this.description = var3;
      }

      @Override
      public void append(String var1) {
         this.description = this.description != null ? this.description + var1 : var1;
      }

      @Override
      public void append(String var1, Object... var2) {
         this.append(String.format(var1, var2));
      }

      @Override
      public void end() {
         if (this.last != null) {
            ActivityStack.this.end(this);
            this.last = null;
         }
      }

      @Override
      public void next(String var1) {
         if (this.next != null) {
            this.next.end();
         }

         this.description = var1;
      }

      @Override
      public void next(String var1, Object... var2) {
         if (var1 == null) {
            var1 = "null";
         }

         this.next(String.format(var1, var2));
      }
   }
}
