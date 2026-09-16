package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.io.InputStream;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.BinaryMappingsReader;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends BinaryMappingsReader {
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(InputStream var1) {
      super(var1);
   }

   @Override
   public MappingSet read(MappingSet var1) {
      int var2 = this.stream.readInt();
      if (var2 != 99151942) {
         throw new IllegalStateException("Invalid magic marker! '" + HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHOHIIIRHCRCOOHRHCHOCIORCHCIOO(var2) + "'");
      }

      byte var3 = this.stream.readByte();
      if (var3 != 1) {
         throw new IllegalStateException("Invalid kin version! '" + var3 + "'");
      }

      int var4 = this.stream.readInt();

      for (int var5 = 0; var5 < var4; var5++) {
         String var6 = this.stream.readUTF();
         String var7 = this.stream.readUTF();
      }

      int var8 = this.stream.readInt();

      for (int var9 = 0; var9 < var8; var9++) {
         this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1.getOrCreateTopLevelClassMapping(this.stream.readUTF()));
      }

      return var1;
   }

   private void RRCRRCORICCHOHHIRCHIROOHIIOHCO(ClassMapping var1) {
      var1.setDeobfuscatedName(this.stream.readUTF());
      int var2 = this.stream.readInt();

      for (int var3 = 0; var3 < var2; var3++) {
         this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1.getOrCreateInnerClassMapping(this.stream.readUTF()));
      }

      int var7 = this.stream.readInt();

      for (int var4 = 0; var4 < var7; var4++) {
         String var5 = this.stream.readUTF();
         FieldMapping var6 = var1.getOrCreateFieldMapping(var5, this.stream.readUTF());
         var6.setDeobfuscatedName(this.stream.readUTF());
      }

      int var8 = this.stream.readInt();

      for (int var9 = 0; var9 < var8; var9++) {
         var1.getOrCreateMethodMapping(this.stream.readUTF(), this.stream.readUTF()).setDeobfuscatedName(this.stream.readUTF());
      }
   }
}
