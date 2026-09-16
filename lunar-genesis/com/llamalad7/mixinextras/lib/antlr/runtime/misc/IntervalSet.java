package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import com.llamalad7.mixinextras.lib.antlr.runtime.Vocabulary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntervalSet implements IntSet {
   public static final IntervalSet COMPLETE_CHAR_SET = of(0, 1114111);
   public static final IntervalSet EMPTY_SET = new IntervalSet();
   protected List<Interval> intervals;
   protected boolean readonly;

   public IntervalSet(IntervalSet var1) {
      this();
      this.addAll(var1);
   }

   public IntervalSet(int... var1) {
      if (var1 == null) {
         this.intervals = new ArrayList<>(2);
      } else {
         this.intervals = new ArrayList<>(var1.length);

         for (int var5 : var1) {
            this.add(var5);
         }
      }
   }

   public static IntervalSet of(int var0) {
      IntervalSet var1 = new IntervalSet();
      var1.add(var0);
      return var1;
   }

   public static IntervalSet of(int var0, int var1) {
      IntervalSet var2 = new IntervalSet();
      var2.add(var0, var1);
      return var2;
   }

   public void add(int var1) {
      if (this.readonly) {
         throw new IllegalStateException("can't alter readonly IntervalSet");
      }

      this.add(var1, var1);
   }

   public void add(int var1, int var2) {
      this.add(Interval.of(var1, var2));
   }

   protected void add(Interval var1) {
      if (this.readonly) {
         throw new IllegalStateException("can't alter readonly IntervalSet");
      }

      if (var1.b >= var1.a) {
         ListIterator var2 = this.intervals.listIterator();

         while (var2.hasNext()) {
            Interval var3 = (Interval)var2.next();
            if (var1.equals(var3)) {
               return;
            }

            if (var1.adjacent(var3) || !var1.disjoint(var3)) {
               Interval var4 = var1.union(var3);
               var2.set(var4);

               while (var2.hasNext()) {
                  Interval var5 = (Interval)var2.next();
                  if (!var4.adjacent(var5) && var4.disjoint(var5)) {
                     break;
                  }

                  var2.remove();
                  var2.previous();
                  var2.set(var4.union(var5));
                  var2.next();
               }

               return;
            }

            if (var1.startsBeforeDisjoint(var3)) {
               var2.previous();
               var2.add(var1);
               return;
            }
         }

         this.intervals.add(var1);
      }
   }

   public IntervalSet addAll(IntSet var1) {
      if (var1 == null) {
         return this;
      }

      if (var1 instanceof IntervalSet) {
         IntervalSet var2 = (IntervalSet)var1;
         int var3 = var2.intervals.size();

         for (int var4 = 0; var4 < var3; var4++) {
            Interval var5 = var2.intervals.get(var4);
            this.add(var5.a, var5.b);
         }
      } else {
         for (int var7 : var1.toList()) {
            this.add(var7);
         }
      }

      return this;
   }

   public IntervalSet complement(IntSet var1) {
      if (var1 != null && !var1.isNil()) {
         IntervalSet var2;
         if (var1 instanceof IntervalSet) {
            var2 = (IntervalSet)var1;
         } else {
            var2 = new IntervalSet();
            var2.addAll(var1);
         }

         return var2.subtract(this);
      } else {
         return null;
      }
   }

   public IntervalSet subtract(IntSet var1) {
      if (var1 == null || var1.isNil()) {
         return new IntervalSet(this);
      }

      if (var1 instanceof IntervalSet) {
         return subtract(this, (IntervalSet)var1);
      }

      IntervalSet var2 = new IntervalSet();
      var2.addAll(var1);
      return subtract(this, var2);
   }

   public static IntervalSet subtract(IntervalSet var0, IntervalSet var1) {
      if (var0 != null && !var0.isNil()) {
         IntervalSet var2 = new IntervalSet(var0);
         if (var1 != null && !var1.isNil()) {
            int var3 = 0;
            int var4 = 0;

            while (var3 < var2.intervals.size() && var4 < var1.intervals.size()) {
               Interval var5 = var2.intervals.get(var3);
               Interval var6 = var1.intervals.get(var4);
               if (var6.b < var5.a) {
                  var4++;
               } else if (var6.a > var5.b) {
                  var3++;
               } else {
                  Interval var7 = null;
                  Interval var8 = null;
                  if (var6.a > var5.a) {
                     var7 = new Interval(var5.a, var6.a - 1);
                  }

                  if (var6.b < var5.b) {
                     var8 = new Interval(var6.b + 1, var5.b);
                  }

                  if (var7 != null) {
                     if (var8 != null) {
                        var2.intervals.set(var3, var7);
                        var2.intervals.add(var3 + 1, var8);
                        var3++;
                        var4++;
                     } else {
                        var2.intervals.set(var3, var7);
                        var3++;
                     }
                  } else if (var8 != null) {
                     var2.intervals.set(var3, var8);
                     var4++;
                  } else {
                     var2.intervals.remove(var3);
                  }
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return new IntervalSet();
      }
   }

   public IntervalSet or(IntSet var1) {
      IntervalSet var2 = new IntervalSet();
      var2.addAll(this);
      var2.addAll(var1);
      return var2;
   }

   public boolean contains(int var1) {
      int var2 = this.intervals.size();
      int var3 = 0;
      int var4 = var2 - 1;

      while (var3 <= var4) {
         int var5 = (var3 + var4) / 2;
         Interval var6 = this.intervals.get(var5);
         int var7 = var6.a;
         int var8 = var6.b;
         if (var8 < var1) {
            var3 = var5 + 1;
         } else {
            if (var7 <= var1) {
               return true;
            }

            var4 = var5 - 1;
         }
      }

      return false;
   }

   @Override
   public boolean isNil() {
      return this.intervals == null || this.intervals.isEmpty();
   }

   public int getMinElement() {
      if (this.isNil()) {
         throw new RuntimeException("set is empty");
      } else {
         return this.intervals.get(0).a;
      }
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();

      for (Interval var3 : this.intervals) {
         var1 = MurmurHash.update(var1, var3.a);
         var1 = MurmurHash.update(var1, var3.b);
      }

      return MurmurHash.finish(var1, this.intervals.size() * 2);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof IntervalSet) {
         IntervalSet var2 = (IntervalSet)var1;
         return this.intervals.equals(var2.intervals);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.toString(false);
   }

   public String toString(boolean var1) {
      StringBuilder var2 = new StringBuilder();
      if (this.intervals != null && !this.intervals.isEmpty()) {
         if (this.size() > 1) {
            var2.append("{");
         }

         Iterator var3 = this.intervals.iterator();

         while (var3.hasNext()) {
            Interval var4 = (Interval)var3.next();
            int var5 = var4.a;
            int var6 = var4.b;
            if (var5 == var6) {
               if (var5 == -1) {
                  var2.append("<EOF>");
               } else if (var1) {
                  var2.append("'").appendCodePoint(var5).append("'");
               } else {
                  var2.append(var5);
               }
            } else if (var1) {
               var2.append("'").appendCodePoint(var5).append("'..'").appendCodePoint(var6).append("'");
            } else {
               var2.append(var5).append("..").append(var6);
            }

            if (var3.hasNext()) {
               var2.append(", ");
            }
         }

         if (this.size() > 1) {
            var2.append("}");
         }

         return var2.toString();
      } else {
         return "{}";
      }
   }

   public String toString(Vocabulary var1) {
      StringBuilder var2 = new StringBuilder();
      if (this.intervals != null && !this.intervals.isEmpty()) {
         if (this.size() > 1) {
            var2.append("{");
         }

         Iterator var3 = this.intervals.iterator();

         while (var3.hasNext()) {
            Interval var4 = (Interval)var3.next();
            int var5 = var4.a;
            int var6 = var4.b;
            if (var5 == var6) {
               var2.append(this.elementName(var1, var5));
            } else {
               for (int var7 = var5; var7 <= var6; var7++) {
                  if (var7 > var5) {
                     var2.append(", ");
                  }

                  var2.append(this.elementName(var1, var7));
               }
            }

            if (var3.hasNext()) {
               var2.append(", ");
            }
         }

         if (this.size() > 1) {
            var2.append("}");
         }

         return var2.toString();
      } else {
         return "{}";
      }
   }

   protected String elementName(Vocabulary var1, int var2) {
      if (var2 == -1) {
         return "<EOF>";
      } else {
         return var2 == -2 ? "<EPSILON>" : var1.getDisplayName(var2);
      }
   }

   public int size() {
      int var1 = 0;
      int var2 = this.intervals.size();
      if (var2 == 1) {
         Interval var5 = this.intervals.get(0);
         return var5.b - var5.a + 1;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         Interval var4 = this.intervals.get(var3);
         var1 += var4.b - var4.a + 1;
      }

      return var1;
   }

   @Override
   public List<Integer> toList() {
      ArrayList var1 = new ArrayList();
      int var2 = this.intervals.size();

      for (int var3 = 0; var3 < var2; var3++) {
         Interval var4 = this.intervals.get(var3);
         int var5 = var4.a;
         int var6 = var4.b;

         for (int var7 = var5; var7 <= var6; var7++) {
            var1.add(var7);
         }
      }

      return var1;
   }

   public void remove(int var1) {
      if (this.readonly) {
         throw new IllegalStateException("can't alter readonly IntervalSet");
      }

      int var2 = this.intervals.size();

      for (int var3 = 0; var3 < var2; var3++) {
         Interval var4 = this.intervals.get(var3);
         int var5 = var4.a;
         int var6 = var4.b;
         if (var1 < var5) {
            break;
         }

         if (var1 == var5 && var1 == var6) {
            this.intervals.remove(var3);
            break;
         }

         if (var1 == var5) {
            var4.a++;
            break;
         }

         if (var1 == var6) {
            var4.b--;
            break;
         }

         if (var1 > var5 && var1 < var6) {
            int var7 = var4.b;
            var4.b = var1 - 1;
            this.add(var1 + 1, var7);
         }
      }
   }

   public void setReadonly(boolean var1) {
      if (this.readonly && !var1) {
         throw new IllegalStateException("can't alter readonly IntervalSet");
      }

      this.readonly = var1;
   }

   static {
      COMPLETE_CHAR_SET.setReadonly(true);
      EMPTY_SET.setReadonly(true);
   }
}
