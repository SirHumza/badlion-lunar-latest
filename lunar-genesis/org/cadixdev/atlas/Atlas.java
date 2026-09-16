package org.cadixdev.atlas;

import java.io.Closeable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import org.cadixdev.atlas.jar.JarFile;
import org.cadixdev.atlas.util.CompositeClassProvider;
import org.cadixdev.atlas.util.JarRepacker;
import org.cadixdev.bombe.analysis.asm.ClassProviderInheritanceProvider;
import org.cadixdev.bombe.jar.JarEntryTransformer;
import org.cadixdev.bombe.provider.ClassProvider;

public class Atlas implements Closeable {
   private final List<Function<AtlasTransformerContext, JarEntryTransformer>> transformers = new ArrayList<>();
   private final List<Path> classpath = new ArrayList<>();
   private final ExecutorService executorService;
   private final boolean manageExecutor;

   private Atlas(ExecutorService var1, boolean var2) {
      this.executorService = var1;
      this.manageExecutor = var2;
   }

   public Atlas(ExecutorService var1) {
      this(var1, false);
   }

   public Atlas(int var1) {
      this(Executors.newWorkStealingPool(var1), true);
   }

   public Atlas() {
      this(Executors.newWorkStealingPool(), true);
   }

   public List<Path> getClasspath() {
      return this.classpath;
   }

   public Atlas install(Function<AtlasTransformerContext, JarEntryTransformer> var1) {
      this.transformers.add(var1);
      return this;
   }

   public void run(Path var1, Path var2) {
      try (JarFile var3 = new JarFile(var1)) {
         this.run(var3, var2);
      }
   }

   public void run(JarFile var1, Path var2) {
      ArrayList var3 = new ArrayList();
      var3.add(var1);

      for (Path var5 : this.classpath) {
         var3.add(new JarFile(var5));
      }

      AtlasTransformerContext var8 = new AtlasTransformerContext(new ClassProviderInheritanceProvider(new CompositeClassProvider(var3)));
      JarEntryTransformer[] var9 = new JarEntryTransformer[this.transformers.size()];

      for (int var6 = 0; var6 < this.transformers.size(); var6++) {
         var9[var6] = this.transformers.get(var6).apply(var8);
      }

      var1.transform(var2, var9);
      JarRepacker.verifyJarManifest(var2);

      for (ClassProvider var7 : var3) {
         if (var7 != var1 && var7 instanceof Closeable) {
            ((Closeable)var7).close();
         }
      }
   }

   @Override
   public void close() {
      if (this.manageExecutor) {
         this.executorService.shutdown();
      }

      this.classpath.clear();
   }
}
