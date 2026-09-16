package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import javax.annotation.Nullable;
import org.objectweb.asm.Handle;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class CORCOCICIRIOHROHROIIOOHICCHCRR implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Set<String> CROORRRHROCIROIRHRRRHIHIIHOOHO = new LinkedHashSet<>();
   private final com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHRRHICOHIIOCIROOIIOHHICIIOICO;
   private final String HHHOROCHCRRIOOHIORCOIHHHICRCOC;
   private final List<String> OORHIICIICOOOHORRIOCORROIICRCH;

   public CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, @Nullable String var2, List<String> var3
   ) {
      this.IHRRHICOHIIOCIROOIIOHHICIIOICO = var1;
      this.HHHOROCHCRRIOOHIORCOIHHHICRCOC = Objects.requireNonNullElse(var2, "com/moonsworth/");
      this.OORHIICIICOOOHORRIOCORROIICRCH = var3;
      com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(
         CORCOCICIRIOHROHROIIOOHICCHCRR::IHICCHIICCCRORRIHOOCIHOHIICIHO
      );
      com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("[OmniMixin] Setting up OmniMixin checker", new Object[0]);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      String var2 = var1.className();
      if (var2.startsWith("com/moonsworth/lunar/client")) {
         return false;
      }

      for (String var4 : this.OORHIICIICOOOHORRIOCORROIICRCH) {
         if (var2.startsWith(var4)) {
            return false;
         }
      }

      return this.HHHOROCHCRRIOOHIORCOIHHHICRCOC == null || var2.startsWith(this.HHHOROCHCRRIOOHIORCOIHHHICRCOC);
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRE_META_MIXIN
      };
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ClassNode var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      AnnotationNode var3 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
      );
      if (var3 == null
         || com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3, this.IHRRHICOHIIOCIROOIIOHHICIIOICO
         )) {
         boolean var4 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1);
         LinkedList var5 = new LinkedList();
         Set var6 = Collections.newSetFromMap(new IdentityHashMap());

         for (MethodNode var8 : var1.methods) {
            if (!var8.name.startsWith("lambda$")
               && (var8.access & 4096) == 0
               && !var8.name.equals("<clinit>")
               && !com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, "Lorg/spongepowered/asm/mixin/Shadow;")
               && !com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, "Llombok/Generated;")) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, var4, var5, var6);
            }
         }

         while (!var5.isEmpty()) {
            MethodNode var9 = (MethodNode)var5.poll();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var4, var5, var6);
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, MethodNode var2, boolean var3, Queue<MethodNode> var4, Set<MethodNode> var5) {
      for (AbstractInsnNode var7 : var2.instructions) {
         if (var7 instanceof MethodInsnNode var8 && this.ICHRHOOCCHICROIRHRRIHCHOCROIRC(var8.name)) {
            boolean var21 = this.RORHCCHIOORIROORRHOCRHHOCRIHII(var8.owner);
            if (!var21 && var3 && var8.owner.equals(var1.name)) {
               for (MethodNode var25 : var1.methods) {
                  if (var25.name.equals(var8.name)
                     && var25.desc.equals(var8.desc)
                     && com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var25, "Lorg/spongepowered/asm/mixin/Shadow;"
                     )) {
                     var21 = true;
                     break;
                  }
               }
            }

            if (var21) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Method", var2.name, var2.desc, var8.owner + "." + var8.name + var8.desc);
            }
         } else if (var7 instanceof FieldInsnNode var9 && this.ICHRHOOCCHICROIRHRRIHCHOCROIRC(var9.name)) {
            boolean var20 = this.RORHCCHIOORIROORRHOCRHHOCRIHII(var9.owner);
            if (!var20 && var3 && var9.owner.equals(var1.name)) {
               for (FieldNode var24 : var1.fields) {
                  if (var24.name.equals(var9.name)
                     && var24.desc.equals(var9.desc)
                     && com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var24, "Lorg/spongepowered/asm/mixin/Shadow;"
                     )) {
                     var20 = true;
                     break;
                  }
               }
            }

            if (var20) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Field", var2.name, var2.desc, var9.owner + "." + var9.name + var9.desc);
            }
         } else if (var7 instanceof InvokeDynamicInsnNode var10) {
            for (Object var14 : var10.bsmArgs) {
               if (var14 instanceof Handle var15) {
                  if (var15.getTag() >= 1 && var15.getTag() <= 4 && this.ICHRHOOCCHICROIRHRRIHCHOCROIRC(var15.getName())) {
                     boolean var26 = this.RORHCCHIOORIROORRHOCRHHOCRIHII(var15.getOwner());
                     if (!var26 && var3 && var15.getOwner().equals(var1.name)) {
                        for (FieldNode var28 : var1.fields) {
                           if (var28.name.equals(var15.getName())
                              && var28.desc.equals(var15.getDesc())
                              && com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 var28, "Lorg/spongepowered/asm/mixin/Shadow;"
                              )) {
                              var26 = true;
                              break;
                           }
                        }
                     }

                     if (var26) {
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "FieldRef", var2.name, var2.desc, var15);
                     }
                  } else if (var15.getTag() >= 5 && var15.getTag() <= 9) {
                     boolean var16 = this.ICHRHOOCCHICROIRHRRIHCHOCROIRC(var15.getName());
                     boolean var17 = var16 && this.RORHCCHIOORIROORRHOCRHHOCRIHII(var15.getOwner());
                     if (!var17 && var15.getOwner().equals(var1.name)) {
                        for (MethodNode var19 : var1.methods) {
                           if (var19.name.equals(var15.getName()) && var19.desc.equals(var15.getDesc())) {
                              if (var3
                                 && var16
                                 && com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    var19, "Lorg/spongepowered/asm/mixin/Shadow;"
                                 )) {
                                 var17 = true;
                                 break;
                              }

                              if (var19.name.startsWith("lambda$")) {
                                 if (var5.add(var19)) {
                                    var4.add(var19);
                                 }
                                 break;
                              }
                           }
                        }
                     }

                     if (var17) {
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "MethodRef", var2.name, var2.desc, var15);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean RORHCCHIOORIROORRHOCRHHOCRIHII(String var1) {
      return !var1.contains("/") || var1.startsWith("net/minecraft/") || var1.startsWith("com/mojang/");
   }

   private boolean ICHRHOOCCHICROIRHRRIHCHOCROIRC(String var1) {
      int var2 = var1.lastIndexOf("$v");
      return var2 != -1 && var2 != var1.length() - 1
         ? Character.isDigit(var1.charAt(var2 + 2)) && !var1.startsWith("bridge$") && !var1.startsWith("lunar$") && !var1.startsWith("ichor$")
         : false;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, String var2, String var3, String var4, Handle var5) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, var5.getOwner() + "." + var5.getName() + var5.getDesc());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, String var2, String var3, String var4, String var5) {
      String var6 = " - " + var2 + ": " + var1.name + "." + var3 + var4 + " -> " + var5;
      CROORRRHROCIROIRHRRRHIHIIHOOHO.add(var6);
   }

   public static void IHICCHIICCCRORRIHOOCIHOHIICIHO() {
      if (CROORRRHROCIROIRHRRRHIHIIHOOHO.isEmpty()) {
         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("[OmniMixin] All OmniMixins are ok!", new Object[0]);
      } else {
         StringBuilder var0 = new StringBuilder();
         CROORRRHROCIROIRHRRRHIHIIHOOHO.forEach(var1 -> var0.append(var1).append("\n"));
         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI
            .fatal("[OmniMixin] %d broken OmniMixins were detected: \n%s", new Object[]{CROORRRHROCIROIRHRRRHIHIIHOOHO.size(), var0.toString()});
         System.exit(1);
      }
   }
}
