package com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH> HORRCRROORCRHHCIRHCHCRCICCOIOR;
   private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCOROROHHRCCOOHIHHIIHHRICRRHHO;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO HRCHRIIRHICRHIHIIHCCICRRHHCIRI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      this.HCOROROHHRCCOOHIHHIIHHRICRRHHO = var2;
      this.HRCHRIIRHICRHIHIIHCCICRRHHCIRI = var1;
      this.HORRCRROORCRHHCIRHCHCRCICCOIOR = new ConcurrentHashMap<>();
   }

   @Override
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH provide(String var1) {
      if (var1 == null) {
         return null;
      }

      if (var1.equals("java/lang/Object")) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIRHHCIRRRICHCHHCOIOIHICOCIO;
      }

      IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.HORRCRROORCRHHCIRHCHCRCICCOIOR.get(var1);
      if (var2 != null) {
         return var2;
      }

      if (var1.startsWith("java.") || var1.startsWith("java/")) {
         try {
            Class var26 = Class.forName(var1.replace("/", "."), false, this.getClass().getClassLoader());
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var28 = var26.getSuperclass() == null ? null : this.provide(var26.getSuperclass().getName().replace(".", "/"));
            List var29 = Arrays.stream(var26.getInterfaces()).map(var1x -> this.provide(var1x.getName().replace(".", "/"))).toList();
            var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.replace(".", "/"), var28, var29);
            this.HORRCRROORCRHHCIRHCHCRCICCOIOR.put(var1.replace(".", "/"), var2);
            return var2;
         } catch (ClassNotFoundException var23) {
            var23.printStackTrace();
         }
      }

      CORCOCICIRIOHROHROIIOOHICCHCRR var3 = this.HCOROROHHRCCOOHIHHIIHHRICRRHHO.OCOIIRHCCOOHRHHCOCHIHIICRORRHR();
      String var4 = var1.replace('.', '/') + ".class";
      Set var5 = this.HRCHRIIRHICRHIHIIHCCICRRHHCIRI.CRRRICCRROCOHHOHIICIHORCOORRRH(var3, var1);
      String var6 = this.HRCHRIIRHICRHIHIIHCCICRRHHCIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var1);

      try {
         for (String var8 : var5) {
            var4 = var8.replace('.', '/') + ".class";
            InputStream var9 = this.HCOROROHHRCCOOHIHHIIHHRICRRHHO.getResourceAsStream(var4);
            if (var9 != null) {
               try {
                  ClassReader var10 = new ClassReader(var9);
                  ClassNode var11 = new ClassNode();
                  var10.accept(var11, 7);
                  var9.close();
                  String var12 = var11.superName;
                  String var13 = null;
                  if (var12 != null) {
                     var13 = this.HRCHRIIRHICRHIHIIHCCICRRHHCIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var12);
                  }

                  IRCIIHHICIHRCOCRROCOICRIHHCCHH var14 = this.provide(var13);
                  List var15 = var11.interfaces
                     .stream()
                     .map(var2x -> this.HRCHRIIRHICRHIHIIHCCICRRHHCIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var2x))
                     .map(this::provide)
                     .filter(Objects::nonNull)
                     .toList();
                  var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var14, var15);
                  this.HORRCRROORCRHHCIRHCHCRCICCOIOR.put(var6, var2);
                  return var2;
               } finally {
                  var9.close();
               }
            }
         }
      } catch (Exception var22) {
      }

      return null;
   }
}
