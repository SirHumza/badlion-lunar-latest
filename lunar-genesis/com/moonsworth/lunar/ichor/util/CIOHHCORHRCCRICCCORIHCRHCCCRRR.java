package com.moonsworth.lunar.ichor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class CIOHHCORHRCCRICCCORIHCRHCCCRRR {
   private static boolean HIORHRRIRORROCCHCCHOIOIRCCRIRI = false;
   private CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] HROCOHCRRHCHROROCCIHRHIRRCOROR;
   private ArrayList<CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROCRCOCRCCRCRIRIICROICCHRRIOIR;
   private final Object CCCHHOHHRIIHIIRHCIROHCCCCHRCOC = new Object();
   private Set<String> OCCRCIHORRRCHOCHIHRRIROHOHROHH;
   private Set<String> HHOICHRHHHCICCHIRHOIHOHICICRIC;

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR(com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      this.ROCRCOCRCCRCRIRIICROICCHRRIOIR = new ArrayList<>(var1.IOICIHIIHIOIROHCHROROHRIRHIHIH().size());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR var2,
      CRRRICCRROCOHHOHIICIHORCOORRRH var3
   ) {
      if (HIORHRRIRORROCCHCCHOIOIRCCRIRI && var3.IHCIIRORHIHHCIROOHHROCCHRIOHCR()) {
         ClassNode var4 = var3.getClassNode();
         int var5 = var1.IOICIHIIHIOIROHCHROROHRIRHIHIH().indexOf(var2);
         if (var5 == 0) {
            String[] var6 = null;
            if (!var4.fields.isEmpty()) {
               this.OCCRCIHORRRCHOCHIHRRIROHOHROHH = Collections.newSetFromMap(new ConcurrentHashMap<>());
               var6 = new String[var4.fields.size()];

               for (int var7 = 0; var7 < var6.length; var7++) {
                  String var8 = (var4.fields.get(var7).name + ":" + var4.fields.get(var7).desc).intern();
                  var6[var7] = var8;
                  this.OCCRCIHORRRCHOCHIHRRIROHOHROHH.add(var8);
               }
            }

            String[] var18 = null;
            if (!var4.methods.isEmpty()) {
               this.HHOICHRHHHCICCHIRHOIHOHICICRIC = Collections.newSetFromMap(new ConcurrentHashMap<>());
               var18 = new String[var4.methods.size()];

               for (int var20 = 0; var20 < var18.length; var20++) {
                  MethodNode var9 = var4.methods.get(var20);
                  String var10 = (var9.name + var9.desc).intern();
                  var18[var20] = var10;
                  this.HHOICHRHHHCICCHIRHOIHOHICICRIC.add(var10);
               }
            }

            if (var6 != null || var18 != null) {
               synchronized (this.CCCHHOHHRIIHIIRHCIROHCCCCHRCOC) {
                  this.ROCRCOCRCCRCRIRIICROICCHRRIOIR.add(new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var6, var18));
               }
            }
         } else {
            if (this.ROCRCOCRCCRCRIRIICROICCHRRIOIR == null) {
               return;
            }

            ArrayList var17 = new ArrayList();
            ArrayList var19 = new ArrayList();

            for (FieldNode var25 : var4.fields) {
               String var28 = (var25.name + ":" + var25.desc).intern();
               if (this.OCCRCIHORRRCHOCHIHRRIROHOHROHH != null && this.OCCRCIHORRRCHOCHIHRRIROHOHROHH.add(var28)) {
                  var17.add(var28);
               }
            }

            for (MethodNode var26 : var4.methods) {
               String var29 = (var26.name + var26.desc).intern();
               if (this.HHOICHRHHHCICCHIRHOIHOHICICRIC != null && this.HHOICHRHHHCICCHIRHOIHOHICICRIC.add(var29)) {
                  var19.add(var29);
               }
            }

            boolean var24 = false;
            String[] var27 = null;
            if (!var17.isEmpty()) {
               var27 = var17.toArray(new String[0]);
               var24 = true;
            }

            String[] var30 = null;
            if (!var19.isEmpty()) {
               var30 = var19.toArray(new String[0]);
               var24 = true;
            }

            if (var24) {
               synchronized (this.CCCHHOHHRIIHIIRHCIROHCCCCHRCOC) {
                  if (this.ROCRCOCRCCRCRIRIICROICCHRRIOIR != null) {
                     this.ROCRCOCRCCRCRIRIICROICCHRRIOIR.add(new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var27, var30));
                  }
               }
            }

            if (var5 == var1.IOICIHIIHIOIROHCHROROHRIRHIHIH().size() - 1) {
               this.HHOICHRHHHCICCHIRHOIHOHICICRIC = null;
               this.OCCRCIHORRRCHOCHIHRRIROHOHROHH = null;
               synchronized (this.CCCHHOHHRIIHIIRHCIROHCCCCHRCOC) {
                  if (this.ROCRCOCRCCRCRIRIICROICCHRRIOIR != null) {
                     this.HROCOHCRRHCHROROCCIHRHIRRCOROR = this.ROCRCOCRCCRCRIRIICROICCHRRIOIR
                        .toArray(new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[0]);
                     this.ROCRCOCRCCRCRIRIICROICCHRRIOIR = null;
                  }
               }
            }
         }
      }
   }

   @Nullable
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCRCORCICHOIHRHRCICOCCIRHIHICR(String var1) {
      if (this.HROCOHCRRHCHROROCCIHRHIRRCOROR != null) {
         for (int var2 = this.HROCOHCRRHCHROROCCIHRHIRRCOROR.length - 1; var2 > 0; var2--) {
            CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.HROCOHCRRHCHROROCCIHRHIRRCOROR[var2];
            if (var3.OCIHHOHICHCICCHORHROOIRHOCCIRO != null) {
               for (int var4 = var3.OCIHHOHICHCICCHORHROOIRHOCCIRO.length - 1; var4 >= 0; var4--) {
                  if (var3.OCIHHOHICHCICCHORHROOIRHOCCIRO[var4].startsWith(var1)) {
                     return var3;
                  }
               }
            }
         }
      }

      return null;
   }

   @Nullable
   public CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIRORIOCCCICOHIHRICOHOCIICIOIH(String var1) {
      if (this.HROCOHCRRHCHROROCCIHRHIRRCOROR != null) {
         for (int var2 = this.HROCOHCRRHCHROROCCIHRHIRRCOROR.length - 1; var2 > 0; var2--) {
            CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.HROCOHCRRHCHROROCCIHRHIRRCOROR[var2];
            if (var3.HIIHRHROIHOOHCCRIOHROOICCRHORR != null) {
               for (int var4 = var3.HIIHRHROIHOOHCCRIOHROOICCRHORR.length - 1; var4 >= 0; var4--) {
                  if (var3.HIIHRHROIHOOHCCRIOHROOICCRHORR[var4].startsWith(var1)) {
                     return var3;
                  }
               }
            }
         }
      }

      return null;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR HOHOORCIOHOCOHHIOICROCOHROCRCR;
      @Nullable
      private final String[] OCIHHOHICHCICCHORHROOIRHOCCIRO;
      @Nullable
      private final String[] HIIHRHROIHOOHCCRIOHROOICCRHORR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR var1, @Nullable String[] var2, @Nullable String[] var3) {
         this.HOHOORCIOHOCOHHIOICROCOHROCRCR = var1;
         this.OCIHHOHICHCICCHORHROOIRHOCCIRO = var2;
         this.HIIHRHROIHOOHCCRIOHROOICCRHORR = var3;
      }

      public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR RCRIHIICHHIHHRIIROHORHHICCOOOO() {
         return this.HOHOORCIOHOCOHHIOICROCOHROCRCR;
      }

      @Nullable
      public String[] fields() {
         return this.OCIHHOHICHCICCHORHROOIRHOCCIRO;
      }

      @Nullable
      public String[] methods() {
         return this.HIIHRHROIHOOHCCRIOHROOICCRHORR;
      }
   }
}
