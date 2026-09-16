package com.moonsworth.lunar.ichor.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassWriter;

public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HCRHICRORCCICCCIOHIICCHRIOIHOO;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(ClassWriter var1) {
      try {
         Field var2 = ClassWriter.class.getDeclaredField("symbolTable");
         var2.setAccessible(true);
         Object var3 = var2.get(var1);
         Field var4 = var3.getClass().getDeclaredField("entries");
         var4.setAccessible(true);
         Object[] var5 = (Object[])var4.get(var3);
         this.HCRHICRORCCICCCIOHIICCHRIOIHOO = new ArrayList<>(var5.length);

         for (Object var9 : var5) {
            if (var9 != null) {
               this.HCRHICRORCCICCCIOHIICCHRIOIHOO.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9));
            }
         }
      } catch (ReflectiveOperationException var10) {
         throw new RuntimeException(var10);
      }
   }

   public List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IORHOHICORROHCRHHOIIRRORHHOOOC() {
      return this.HCRHICRORCCICCCIOHIICCHRIOIHOO;
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Object OHORRIOCRCORHIIICCCOCICHCIRIHC;
      private int index;
      private int tag;
      private String owner;
      private String name;
      private String value;
      private long IHIHROHHCHCHIRROHRICCICCOIICOR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1) {
         this.OHORRIOCRCORHIIICCCOCICHCIRIHC = var1;

         try {
            Class var2 = var1.getClass().getSuperclass();

            for (Field var6 : RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getDeclaredFields()) {
               if (!var6.getName().equals("asmEntry")) {
                  Field var7 = var2.getDeclaredField(var6.getName());
                  var7.setAccessible(true);
                  var6.setAccessible(true);
                  var6.set(this, var7.get(var1));
               }
            }
         } catch (ReflectiveOperationException var8) {
            throw new RuntimeException(var8);
         }
      }

      public int getIndex() {
         return this.index;
      }

      public int getTag() {
         return this.tag;
      }

      public String getOwner() {
         return this.owner;
      }

      public String getName() {
         return this.name;
      }

      public String getValue() {
         return this.value;
      }

      public long HIOHROICIHRRRRIHIRHHIIRRCCHRHO() {
         return this.IHIHROHHCHCHIRROHRICCICCOIICOR;
      }

      @Override
      public String toString() {
         return "EntryWrapper{index="
            + this.index
            + ", tag="
            + this.tag
            + ", owner='"
            + this.owner
            + "', name='"
            + this.name
            + "', value='"
            + this.value
            + "', data="
            + this.IHIHROHHCHCHIRROHRICCICCOIICOR
            + "}";
      }
   }
}
