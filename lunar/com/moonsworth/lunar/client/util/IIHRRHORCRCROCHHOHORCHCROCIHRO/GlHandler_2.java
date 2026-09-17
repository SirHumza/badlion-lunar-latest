package com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   private static final boolean ROIOHICHCHHIIORROORICIIRICROCO = Boolean.getBoolean("lunar.resourceTracking");
   private static IHHCHHHCRIHOOCOIOOCRIIICIOROIR CICOIROCCHHIOOIHOCCIOCCIIHICHO;
   private final Map<Integer, Throwable> OICIICIOHOHIIRIRIHRORHIICOOIRO = new LinkedHashMap<>();
   private final Map<Integer, Throwable> CICICHHIOICRCRCIROHHCCIRCOCHCC = new LinkedHashMap<>();
   private final Map<Long, com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO<Throwable, Long>> HRCRRCRRCIIOCCCRIHCIIIRROOHHOO = new LinkedHashMap<>();

   public void IORIRRIOIHHRRRHCOOCORHRCRHIIII(int var1) {
      if (!this.HROOORHIHOCIRIICIOIIRORCOCICII()) {
         this.OICIICIOHOHIIRIRIHRORHIICOOIRO.put(var1, null);
      } else {
         this.OICIICIOHOHIIRIRIHRORHIICOOIRO.put(var1, new Throwable());
      }
   }

   public void RIROHHCHRHIHCCIIICROIRROIROORC(int var1) {
      this.OICIICIOHOHIIRIRIHRORHIICOOIRO.remove(var1);
   }

   public void HIRRIHCCCIRRHRRHORIHOOOIORROHO(int var1) {
      if (!this.HROOORHIHOCIRIICIOIIRORCOCICII()) {
         this.CICICHHIOICRCRCIROHHCCIRCOCHCC.put(var1, null);
      } else {
         this.CICICHHIOICRCRCIROHHCCIRCOCHCC.put(var1, new Throwable());
      }
   }

   public void HOHROHRORIOOHIOCRRCOIIRHOHRIOH(int var1) {
      this.CICICHHIOICRCRCIROHHCCIRCOCHCC.remove(var1);
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long var1, long var3) {
      if (!this.HROOORHIHOCIRIICIOIIRORCOCICII()) {
         this.HRCRRCRRCIIOCCCRIHCIIIRROOHHOO
            .put(
               var1,
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
                  null, var3
               )
            );
      } else {
         this.HRCRRCRRCIIOCCCRIHCIIIRROOHHOO
            .put(
               var1,
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
                  new Throwable(), var3
               )
            );
      }
   }

   public void OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(long var1) {
      this.HRCRRCRRCIIOCCCRIHCIIIRROOHHOO.remove(var1);
   }

   public int HIIRICRIHRHROCHRIRIOROOCICROIC() {
      return this.OICIICIOHOHIIRIRIHRORHIICOOIRO.size();
   }

   public int CROICRHOOHORRCCRCRCOORROIHIHHC() {
      return this.CICICHHIOICRCRCIROHHCCIRCOCHCC.size();
   }

   public String HCCCRRCOCIHCIICOOCIHIRIOOIHCRC() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try (PrintStream var2 = new PrintStream(var1)) {
         this.HRCRRCRRCIIOCCCRIHCIIIRROOHHOO.forEach((var1x, var2x) -> {
            var2.printf("%d ", var2x.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC);
            ((Throwable)var2x.OHICIOOICHICOIOCOROIIOCCHRRCIC).printStackTrace(var2);
            var2.print("\n");
         });
      }

      return var1.toString();
   }

   public String dump() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();

      try (PrintStream var2 = new PrintStream(var1)) {
         var2.printf("Texture count %d\n", this.OICIICIOHOHIIRIRIHRORHIICOOIRO.size());
         var2.printf("Buffer count %d\n", this.CICICHHIOICRCRCIROHHCCIRCOCHCC.size());
         var2.println("--- Textures Start ---");
         long var3 = 0L;
         int var5 = GL11.glGetInteger(32873);

         for (Entry var7 : this.OICIICIOHOHIIRIRIHRORHIICOOIRO.entrySet()) {
            int var8 = (Integer)var7.getKey();
            GL11.glBindTexture(3553, var8);
            int var9 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            int var10 = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            var3 += (long)var9 * var10;
            var2.printf("texture id: %d width: %d height: %d\n", var8, var9, var10);
            ((Throwable)var7.getValue()).printStackTrace(var2);
         }

         GL11.glBindTexture(3553, var5);
         var2.println("--- Buffers Start ---");
         long var16 = 0L;
         int var17 = GL11.glGetInteger(34964);

         for (Entry var19 : this.CICICHHIOICRCRCIROHHCCIRCOCHCC.entrySet()) {
            int var11 = (Integer)var19.getKey();
            GL15.glBindBuffer(34962, var11);
            int var12 = GL15.glGetBufferParameteri(34962, 34660);
            var16 += var12;
            var2.printf("object id: %d size: %d\n", var11, var12);
            ((Throwable)var19.getValue()).printStackTrace(var2);
         }

         GL15.glBindBuffer(34962, var17);
         var2.printf("texture total %d\n", var3);
         var2.printf("buffer total %d\n", var16);
      } catch (Throwable var15) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error("Failed to write gpu-objects", var15);
         return "Error: " + var15.getMessage();
      }

      return var1.toString();
   }

   public static IHHCHHHCRIHOOCOIOOCRIIICIOROIR HRHCIICHRCOHCIIIRIHHHHHICCCHOO() {
      if (CICOIROCCHHIOOIHOCCIOCCIIHICHO == null) {
         CICOIROCCHHIOOIHOCCIOCCIIHICHO = new IHHCHHHCRIHOOCOIOOCRIIICIOROIR();
      }

      return CICOIROCCHHIOOIHOCCIOCCIIHICHO;
   }

   public boolean HROOORHIHOCIRIICIOIIRORCOCICII() {
      return ROIOHICHCHHIIORROORICIIRICROCO
         || !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
            && com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ENABLE_RESOURCE_TRACKING
               .isEnabled();
   }
}
