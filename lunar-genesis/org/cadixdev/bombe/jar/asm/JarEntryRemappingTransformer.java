package org.cadixdev.bombe.jar.asm;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import org.cadixdev.bombe.jar.JarClassEntry;
import org.cadixdev.bombe.jar.JarEntryTransformer;
import org.cadixdev.bombe.jar.JarManifestEntry;
import org.cadixdev.bombe.jar.JarResourceEntry;
import org.cadixdev.bombe.jar.JarServiceProviderConfigurationEntry;
import org.cadixdev.bombe.jar.ServiceProviderConfiguration;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;

public class JarEntryRemappingTransformer implements JarEntryTransformer {
   private static final Name SHA_256_DIGEST = new Name("SHA-256-Digest");
   private final Remapper remapper;
   private final BiFunction<ClassVisitor, Remapper, ClassRemapper> clsRemapper;

   public JarEntryRemappingTransformer(Remapper var1, BiFunction<ClassVisitor, Remapper, ClassRemapper> var2) {
      this.remapper = var1;
      this.clsRemapper = var2;
   }

   public JarEntryRemappingTransformer(Remapper var1) {
      this(var1, ClassRemapper::new);
   }

   @Override
   public JarClassEntry transform(JarClassEntry var1) {
      ClassReader var2 = new ClassReader(var1.getContents());
      ClassWriter var3 = new ClassWriter(var2, 0);
      var2.accept(this.clsRemapper.apply(var3, this.remapper), 0);
      String var4 = var1.getUnversionedName().substring(0, var1.getUnversionedName().length() - ".class".length());
      String var5 = this.remapper.map(var4) + ".class";
      return new JarClassEntry(var1.getVersion(), var5, var1.getTime(), var3.toByteArray());
   }

   @Override
   public JarManifestEntry transform(JarManifestEntry var1) {
      if (var1.getManifest().getMainAttributes().containsKey(Name.MAIN_CLASS)) {
         String var2 = var1.getManifest().getMainAttributes().getValue(Name.MAIN_CLASS).replace('.', '/');
         String var3 = this.remapper.map(var2).replace('/', '.');
         var1.getManifest().getMainAttributes().put(Name.MAIN_CLASS, var3);
      }

      Iterator var4 = var1.getManifest().getEntries().entrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         if (((Attributes)var5.getValue()).remove(SHA_256_DIGEST) != null && ((Attributes)var5.getValue()).isEmpty()) {
            var4.remove();
         }
      }

      return var1;
   }

   @Override
   public JarServiceProviderConfigurationEntry transform(JarServiceProviderConfigurationEntry var1) {
      String var2 = var1.getConfig().getService().replace('.', '/');
      String var3 = this.remapper.map(var2).replace('/', '.');
      List var4 = var1.getConfig()
         .getProviders()
         .stream()
         .map(var0 -> var0.replace('.', '/'))
         .map(this.remapper::map)
         .map(var0 -> var0.replace('/', '.'))
         .collect(Collectors.toList());
      ServiceProviderConfiguration var5 = new ServiceProviderConfiguration(var3, var4);
      return new JarServiceProviderConfigurationEntry(var1.getTime(), var5);
   }

   @Override
   public JarResourceEntry transform(JarResourceEntry var1) {
      return !var1.getName().startsWith("META-INF") || !var1.getExtension().equals("RSA") && !var1.getExtension().equals("SF") ? var1 : null;
   }
}
