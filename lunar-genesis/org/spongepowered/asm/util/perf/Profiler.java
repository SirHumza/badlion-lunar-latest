package org.spongepowered.asm.util.perf;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public final class Profiler {
   public static final int ROOT = 1;
   public static final int FINE = 2;
   private static final Map<String, Profiler> profilers = new HashMap<>();
   private static boolean active;
   private final String id;
   private final Map<String, Profiler.Section> sections = new TreeMap<>();
   private final List<String> phases = new ArrayList<>();
   private final Deque<Profiler.Section> stack = new LinkedList<>();

   public Profiler(String var1) {
      this.id = var1;
      this.phases.add("Initial");
   }

   @Override
   public String toString() {
      return this.id;
   }

   public static void setActive(boolean var0) {
      active = var0;
   }

   public synchronized void reset() {
      for (Profiler.Section var2 : this.sections.values()) {
         var2.invalidate();
      }

      this.sections.clear();
      this.phases.clear();
      this.phases.add("Initial");
      this.stack.clear();
   }

   public synchronized Profiler.Section get(String var1) {
      Profiler.Section var2 = this.sections.get(var1);
      if (var2 == null) {
         var2 = active ? new Profiler.LiveSection(var1, this.phases.size() - 1) : new Profiler.DisabledSection(var1);
         this.sections.put(var1, var2);
      }

      return var2;
   }

   private synchronized Profiler.Section getSubSection(String var1, String var2, Profiler.Section var3) {
      Profiler.Section var4 = this.sections.get(var1);
      if (var4 == null) {
         var4 = new Profiler.SubSection(var1, this.phases.size() - 1, var2, var3);
         this.sections.put(var1, var4);
      }

      return var4;
   }

   public Profiler.Section begin(String... var1) {
      return this.begin(0, var1);
   }

   public Profiler.Section begin(int var1, String... var2) {
      return this.begin(var1, Joiner.on('.').join(var2));
   }

   public Profiler.Section begin(String var1) {
      return this.begin(0, var1);
   }

   public synchronized Profiler.Section begin(int var1, String var2) {
      boolean var3 = (var1 & 1) != 0;
      boolean var4 = (var1 & 2) != 0;
      String var5 = var2;
      Profiler.Section var6 = this.stack.peek();
      if (var6 != null) {
         var5 = var6.getName() + (var3 ? " -> " : ".") + var5;
         if (var6.isRoot() && !var3) {
            int var7 = var6.getName().lastIndexOf(" -> ");
            var2 = (var7 > -1 ? var6.getName().substring(var7 + 4) : var6.getName()) + "." + var2;
            var3 = true;
         }
      }

      Profiler.Section var8 = this.get(var3 ? var2 : var5);
      if (var3 && var6 != null && active) {
         var8 = this.getSubSection(var5, var6.getName(), var8);
      }

      var8.setFine(var4).setRoot(var3);
      this.stack.push(var8);
      return var8.start();
   }

   synchronized void end(Profiler.Section var1) {
      try {
         Profiler.Section var2 = this.stack.pop();

         for (Profiler.Section var3 = var2; var3 != var1; var3 = this.stack.pop()) {
            if (var3 == null && active) {
               if (var2 == null) {
                  throw new IllegalStateException("Attempted to pop " + var1 + " but the stack is empty");
               }

               throw new IllegalStateException("Attempted to pop " + var1 + " which was not in the stack, head was " + var2);
            }
         }
      } catch (NoSuchElementException var4) {
         if (active) {
            throw new IllegalStateException("Attempted to pop " + var1 + " but the stack is empty");
         }
      }
   }

   public synchronized void mark(String var1) {
      long var2 = 0L;

      for (Profiler.Section var5 : this.sections.values()) {
         var2 += var5.getTime();
      }

      if (var2 == 0L) {
         int var7 = this.phases.size();
         this.phases.set(var7 - 1, var1);
      } else {
         this.phases.add(var1);

         for (Profiler.Section var8 : this.sections.values()) {
            var8.mark();
         }
      }
   }

   public synchronized Collection<Profiler.Section> getSections() {
      return Collections.unmodifiableCollection(this.sections.values());
   }

   public PrettyPrinter printer(boolean var1, boolean var2) {
      return printer(var1, var2, this.phases, this.sections);
   }

   private static PrettyPrinter printer(boolean var0, boolean var1, List<String> var2, Map<String, Profiler.Section> var3) {
      PrettyPrinter var4 = new PrettyPrinter();
      int var5 = var2.size() + 4;
      int[] var6 = new int[]{0, 1, 2, var5 - 2, var5 - 1};
      Object[] var7 = new Object[var5 * 2];
      int var8 = 0;

      for (int var9 = 0; var8 < var5; var9 = ++var8 * 2) {
         var7[var9 + 1] = PrettyPrinter.Alignment.RIGHT;
         if (var8 == var6[0]) {
            var7[var9] = (var1 ? "" : "  ") + "Section";
            var7[var9 + 1] = PrettyPrinter.Alignment.LEFT;
         } else if (var8 == var6[1]) {
            var7[var9] = "    TOTAL";
         } else if (var8 == var6[3]) {
            var7[var9] = "    Count";
         } else if (var8 == var6[4]) {
            var7[var9] = "Avg. ";
         } else if (var8 - var6[2] < var2.size()) {
            var7[var9] = var2.get(var8 - var6[2]);
         } else {
            var7[var9] = "";
         }
      }

      var4.table(var7).th().hr().add();

      for (Profiler.Section var14 : var3.values()) {
         if ((!var14.isFine() || var0) && (!var1 || var14.getDelegate() == var14)) {
            printSectionRow(var4, var5, var6, var14, var1);
            if (var1) {
               for (Profiler.Section var11 : var3.values()) {
                  Profiler.Section var12 = var11.getDelegate();
                  if ((!var11.isFine() || var0) && var12 == var14 && var12 != var11) {
                     printSectionRow(var4, var5, var6, var11, var1);
                  }
               }
            }
         }
      }

      return var4.add();
   }

   private static void printSectionRow(PrettyPrinter var0, int var1, int[] var2, Profiler.Section var3, boolean var4) {
      boolean var5 = var3.getDelegate() != var3;
      Object[] var6 = new Object[var1];
      int var7 = 1;
      if (var4) {
         var6[0] = var5 ? "  > " + var3.getBaseName() : var3.getName();
      } else {
         var6[0] = (var5 ? "+ " : "  ") + var3.getName();
      }

      long[] var8 = var3.getTimes();

      for (long var12 : var8) {
         if (var7 == var2[1]) {
            var6[var7++] = var3.getTotalTime() + " ms";
         }

         if (var7 >= var2[2] && var7 < var6.length) {
            var6[var7++] = var12 + " ms";
         }
      }

      var6[var2[3]] = var3.getTotalCount();
      var6[var2[4]] = new DecimalFormat("   ###0.000 ms").format(var3.getTotalAverageTime());

      for (int var14 = 0; var14 < var6.length; var14++) {
         if (var6[var14] == null) {
            var6[var14] = "-";
         }
      }

      var0.tr(var6);
   }

   public void printSummary() {
      printSummary(this.id, this.phases, this.sections);
   }

   public static void printAuditSummary() {
      String var0;
      LinkedHashSet var1;
      TreeMap var2;
      synchronized (profilers) {
         var0 = Joiner.on(',').join(profilers.values());
         var1 = new LinkedHashSet();
         var2 = new TreeMap<String, Profiler.Section>() {
            public Profiler.Section get(Object var1) {
               Profiler.Section var2x = (Profiler.Section)super.get(var1);
               if (var2x == null) {
                  this.put(var1.toString(), var2x = new Profiler.ResultSection(var1.toString()));
               }

               return var2x;
            }
         };

         for (Profiler var5 : profilers.values()) {
            for (String var7 : var5.phases) {
               var1.add(var7);
            }

            for (Entry var11 : var5.sections.entrySet()) {
               ((Profiler.ResultSection)var2.get(var11.getKey())).add((Profiler.Section)var11.getValue());
            }
         }
      }

      printSummary(var0, new ArrayList<>(var1), var2);
   }

   private static void printSummary(String var0, List<String> var1, Map<String, Profiler.Section> var2) {
      DecimalFormat var3 = new DecimalFormat("(###0.000");
      DecimalFormat var4 = new DecimalFormat("(###0.0");
      PrettyPrinter var5 = printer(false, false, var1, var2);
      long var6 = ((Profiler.Section)var2.get("mixin.prepare")).getTotalTime();
      long var8 = ((Profiler.Section)var2.get("mixin.read")).getTotalTime();
      long var10 = ((Profiler.Section)var2.get("mixin.apply")).getTotalTime();
      long var12 = ((Profiler.Section)var2.get("mixin.write")).getTotalTime();
      long var14 = ((Profiler.Section)var2.get("mixin")).getTotalTime();
      long var16 = ((Profiler.Section)var2.get("class.load")).getTotalTime();
      long var18 = ((Profiler.Section)var2.get("class.transform")).getTotalTime();
      long var20 = ((Profiler.Section)var2.get("mixin.debug.export")).getTotalTime();
      long var22 = var14 - var16 - var18 - var20;
      double var24 = (double)var22 / var14 * 100.0;
      double var26 = (double)var16 / var14 * 100.0;
      double var28 = (double)var18 / var14 * 100.0;
      double var30 = (double)var20 / var14 * 100.0;
      long var32 = 0L;
      Profiler.Section var34 = null;

      for (Profiler.Section var36 : var2.values()) {
         long var37 = var36.getName().startsWith("class.transform.") ? var36.getTotalTime() : 0L;
         if (var37 > var32) {
            var32 = var37;
            var34 = var36;
         }
      }

      var5.hr().add("Summary for Profiler[%s]", var0).hr().add();
      String var48 = "%9d ms %12s seconds)";
      var5.kv("Total mixin time", var48, var14, var3.format(var14 * 0.001)).add();
      var5.kv("Preparing mixins", var48, var6, var3.format(var6 * 0.001));
      var5.kv("Reading input", var48, var8, var3.format(var8 * 0.001));
      var5.kv("Applying mixins", var48, var10, var3.format(var10 * 0.001));
      var5.kv("Writing output", var48, var12, var3.format(var12 * 0.001)).add();
      var5.kv("of which", "");
      var5.kv("Time spent loading from disk", var48, var16, var3.format(var16 * 0.001));
      var5.kv("Time spent transforming classes", var48, var18, var3.format(var18 * 0.001)).add();
      if (var34 != null) {
         var5.kv("Worst transformer", var34.getName());
         var5.kv("Class", var34.getInfo());
         var5.kv("Time spent", "%s seconds", var34.getTotalSeconds());
         var5.kv("called", "%d times", var34.getTotalCount()).add();
      }

      var5.kv("   Time allocation:     Processing mixins", "%9d ms %10s%% of total)", var22, var4.format(var24));
      var5.kv("Loading classes", "%9d ms %10s%% of total)", var16, var4.format(var26));
      var5.kv("Running transformers", "%9d ms %10s%% of total)", var18, var4.format(var28));
      if (var20 > 0L) {
         var5.kv("Exporting classes (debug)", "%9d ms %10s%% of total)", var20, var4.format(var30));
      }

      var5.add();

      try {
         Class var49 = MixinService.getService().getClassProvider().findAgentClass("org.spongepowered.metronome.Agent", false);
         Method var50 = var49.getDeclaredMethod("getTimes");
         Map var38 = (Map)var50.invoke(null);
         var5.hr().add("Transformer Times").hr().add();
         int var39 = 10;

         for (Entry var41 : var38.entrySet()) {
            var39 = Math.max(var39, ((String)var41.getKey()).length());
         }

         for (Entry var52 : var38.entrySet()) {
            String var42 = (String)var52.getKey();
            long var43 = 0L;

            for (Profiler.Section var46 : var2.values()) {
               if (var42.equals(var46.getInfo())) {
                  var43 = var46.getTotalTime();
                  break;
               }
            }

            if (var43 > 0L) {
               var5.add("%-" + var39 + "s %8s ms %8s ms in mixin)", var42, (Long)var52.getValue() + var43, "(" + var43);
            } else {
               var5.add("%-" + var39 + "s %8s ms", var42, var52.getValue());
            }
         }

         var5.add();
      } catch (Throwable var47) {
      }

      var5.print();
   }

   public static Profiler getProfiler(String var0) {
      synchronized (profilers) {
         Profiler var2 = profilers.get(var0);
         if (var2 == null) {
            profilers.put(var0, var2 = new Profiler(var0));
         }

         return var2;
      }
   }

   public static Collection<Profiler> getProfilers() {
      ImmutableList.Builder var0 = ImmutableList.builder();
      synchronized (profilers) {
         var0.addAll(profilers.values());
      }

      return var0.build();
   }

   class DisabledSection extends Profiler.Section {
      DisabledSection(String var2) {
         super(var2);
      }

      @Override
      public Profiler.Section end() {
         if (!this.invalidated) {
            Profiler.this.end(this);
         }

         return this;
      }

      @Override
      public Profiler.Section next(String var1) {
         this.end();
         return Profiler.this.begin(var1);
      }
   }

   class LiveSection extends Profiler.DisabledSection {
      private int cursor = 0;
      private long[] times = new long[0];
      private long start = 0L;
      private long time;
      private long markedTime;
      private int count;
      private int markedCount;

      LiveSection(String var2, int var3) {
         super(var2);
         this.cursor = var3;
      }

      @Override
      protected int getCursor() {
         return this.cursor;
      }

      @Override
      Profiler.Section start() {
         this.start = System.currentTimeMillis();
         return this;
      }

      @Override
      protected Profiler.Section stop() {
         if (this.start > 0L) {
            this.time = this.time + (System.currentTimeMillis() - this.start);
         }

         this.start = 0L;
         this.count++;
         return this;
      }

      @Override
      public Profiler.Section end() {
         this.stop();
         if (!this.invalidated) {
            Profiler.this.end(this);
         }

         return this;
      }

      @Override
      void mark() {
         if (this.cursor >= this.times.length) {
            this.times = Arrays.copyOf(this.times, this.cursor + 4);
         }

         this.times[this.cursor] = this.time;
         this.markedTime = this.markedTime + this.time;
         this.markedCount = this.markedCount + this.count;
         this.time = 0L;
         this.count = 0;
         this.cursor++;
      }

      @Override
      public long getTime() {
         return this.time;
      }

      @Override
      public long getTotalTime() {
         return this.time + this.markedTime;
      }

      @Override
      public double getSeconds() {
         return this.time * 0.001;
      }

      @Override
      public double getTotalSeconds() {
         return (this.time + this.markedTime) * 0.001;
      }

      @Override
      public long[] getTimes() {
         long[] var1 = new long[this.cursor + 1];
         System.arraycopy(this.times, 0, var1, 0, Math.min(this.times.length, this.cursor));
         var1[this.cursor] = this.time;
         return var1;
      }

      @Override
      public int getCount() {
         return this.count;
      }

      @Override
      public int getTotalCount() {
         return this.count + this.markedCount;
      }

      @Override
      public double getAverageTime() {
         return this.count > 0 ? (double)this.time / this.count : 0.0;
      }

      @Override
      public double getTotalAverageTime() {
         return this.count > 0 ? (double)(this.time + this.markedTime) / (this.count + this.markedCount) : 0.0;
      }

      @Override
      protected long getMarkedTime() {
         return this.markedTime;
      }

      @Override
      protected int getMarkedCount() {
         return this.markedCount;
      }
   }

   static class ResultSection extends Profiler.Section {
      private List<Profiler.Section> sections = new ArrayList<>();

      ResultSection(String var1) {
         super(var1);
      }

      void add(Profiler.Section var1) {
         this.sections.add(var1);
      }

      @Override
      public long getTime() {
         long var1 = 0L;

         for (Profiler.Section var4 : this.sections) {
            var1 += var4.getTime();
         }

         return var1;
      }

      @Override
      public long getTotalTime() {
         long var1 = 0L;

         for (Profiler.Section var4 : this.sections) {
            var1 += var4.getTotalTime();
         }

         return var1;
      }

      @Override
      public double getSeconds() {
         double var1 = 0.0;

         for (Profiler.Section var4 : this.sections) {
            var1 += var4.getSeconds();
         }

         return var1;
      }

      @Override
      public double getTotalSeconds() {
         double var1 = 0.0;

         for (Profiler.Section var4 : this.sections) {
            var1 += var4.getTotalSeconds();
         }

         return var1;
      }

      @Override
      public long[] getTimes() {
         int var1 = 0;

         for (Profiler.Section var3 : this.sections) {
            var1 = Math.max(var1, var3.getCursor());
         }

         long[] var7 = new long[var1 + 1];

         for (Profiler.Section var4 : this.sections) {
            long[] var5 = var4.getTimes();

            for (int var6 = 0; var6 < var5.length; var6++) {
               var7[var6] += var5[var6];
            }
         }

         return var7;
      }

      @Override
      public int getCount() {
         int var1 = 0;

         for (Profiler.Section var3 : this.sections) {
            var1 += var3.getCount();
         }

         return var1;
      }

      @Override
      public int getTotalCount() {
         int var1 = 0;

         for (Profiler.Section var3 : this.sections) {
            var1 += var3.getTotalCount();
         }

         return var1;
      }

      @Override
      protected long getMarkedTime() {
         long var1 = 0L;

         for (Profiler.Section var4 : this.sections) {
            var1 += var4.getMarkedTime();
         }

         return var1;
      }

      @Override
      protected int getMarkedCount() {
         int var1 = 0;

         for (Profiler.Section var3 : this.sections) {
            var1 += var3.getMarkedCount();
         }

         return var1;
      }

      @Override
      public double getAverageTime() {
         int var1 = this.getCount();
         return var1 > 0 ? (double)this.getTime() / var1 : 0.0;
      }

      @Override
      public double getTotalAverageTime() {
         int var1 = this.getCount();
         return var1 > 0 ? (double)(this.getTime() + this.getMarkedTime()) / (var1 + this.getMarkedCount()) : 0.0;
      }
   }

   public abstract static class Section {
      private final String name;
      private boolean root;
      private boolean fine;
      protected boolean invalidated;
      private String info;

      Section(String var1) {
         this.name = var1;
         this.info = var1;
      }

      protected int getCursor() {
         return 0;
      }

      Profiler.Section getDelegate() {
         return this;
      }

      Profiler.Section invalidate() {
         this.invalidated = true;
         return this;
      }

      Profiler.Section setRoot(boolean var1) {
         this.root = var1;
         return this;
      }

      public boolean isRoot() {
         return this.root;
      }

      Profiler.Section setFine(boolean var1) {
         this.fine = var1;
         return this;
      }

      public boolean isFine() {
         return this.fine;
      }

      public String getName() {
         return this.name;
      }

      public String getBaseName() {
         return this.name;
      }

      public void setInfo(String var1) {
         this.info = var1;
      }

      public String getInfo() {
         return this.info;
      }

      Profiler.Section start() {
         return this;
      }

      protected Profiler.Section stop() {
         return this;
      }

      public Profiler.Section end() {
         return this;
      }

      public Profiler.Section next(String var1) {
         this.end();
         return this;
      }

      void mark() {
      }

      public long getTime() {
         return 0L;
      }

      public long getTotalTime() {
         return 0L;
      }

      public double getSeconds() {
         return 0.0;
      }

      public double getTotalSeconds() {
         return 0.0;
      }

      public long[] getTimes() {
         return new long[1];
      }

      public int getCount() {
         return 0;
      }

      public int getTotalCount() {
         return 0;
      }

      public double getAverageTime() {
         return 0.0;
      }

      public double getTotalAverageTime() {
         return 0.0;
      }

      @Override
      public final String toString() {
         return this.name;
      }

      protected long getMarkedTime() {
         return 0L;
      }

      protected int getMarkedCount() {
         return 0;
      }
   }

   class SubSection extends Profiler.LiveSection {
      private final String baseName;
      private final Profiler.Section root;

      SubSection(String var2, int var3, String var4, Profiler.Section var5) {
         super(var2, var3);
         this.baseName = var4;
         this.root = var5;
      }

      @Override
      Profiler.Section invalidate() {
         this.root.invalidate();
         return super.invalidate();
      }

      @Override
      public String getBaseName() {
         return this.baseName;
      }

      @Override
      public void setInfo(String var1) {
         this.root.setInfo(var1);
         super.setInfo(var1);
      }

      @Override
      Profiler.Section getDelegate() {
         return this.root;
      }

      @Override
      Profiler.Section start() {
         this.root.start();
         return super.start();
      }

      @Override
      public Profiler.Section end() {
         this.root.stop();
         return super.end();
      }

      @Override
      public Profiler.Section next(String var1) {
         super.stop();
         return this.root.next(var1);
      }
   }
}
