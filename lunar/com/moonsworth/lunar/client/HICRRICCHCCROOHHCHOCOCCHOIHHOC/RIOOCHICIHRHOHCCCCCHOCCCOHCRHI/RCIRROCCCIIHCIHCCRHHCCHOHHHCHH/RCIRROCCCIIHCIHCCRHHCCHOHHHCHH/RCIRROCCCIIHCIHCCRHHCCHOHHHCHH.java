package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.primitives.Floats;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import it.unimi.dsi.fastutil.ints.IntArrays;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import lombok.Generated;
import org.apache.commons.lang3.mutable.MutableInt;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRIHOHHRRCOHHRRHHICOOIROHICICO;
   private final ByteBuffer CCCCHRIHROOIOIRCRORHCHOICIHCRO;
   private final ByteBuffer CRHCRCHCCICICHCHCCRHRRHHHRROHO;
   private final int vertices;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      ByteBuffer var2,
      ByteBuffer var3,
      int var4
   ) {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO = var1;
      this.CCCCHRIHROOIOIRCRORHCHOICIHCRO = var2.order(ByteOrder.nativeOrder());
      this.CRHCRCHCCICICHCHCCRHRRHHHRROHO = var3.order(ByteOrder.nativeOrder());
      this.vertices = var4;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR var1, Vector3f var2) {
      int[] var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this.RHIHOHIRRIRHHRCROOIOCHRICRORCO());
      int var4 = var1.bridge$getVertexFormatMode().getPrimitiveStride();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.CRIHOHHRRCOHHRRHHICOOIROHICICO
         .bridge$getIndexType();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 28) {
         this.CRHCRCHCCICICHCHCCRHRRHHHRROHO.clear();
         MutableInt var6 = new MutableInt(0);

         for (int var10 : var3) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var5, var10 * var4 + 0);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var5, var10 * var4 + 1);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var5, var10 * var4 + 2);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var5, var10 * var4 + 2);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var5, var10 * var4 + 3);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var5, var10 * var4 + 0);
         }

         this.bridge$updateIndexBuffer(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO);
      } else {
         this.CRHCRCHCCICICHCHCCRHRRHHHRROHO.clear();

         for (int var14 : var3) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO, var5, var14 * var4 + 0);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO, var5, var14 * var4 + 1);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO, var5, var14 * var4 + 2);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO, var5, var14 * var4 + 2);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO, var5, var14 * var4 + 3);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO, var5, var14 * var4 + 0);
         }

         this.CRHCRCHCCICICHCHCCRHRRHHHRROHO.flip();
         this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$updateIndexBuffer(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO);
      }
   }

   private Vector3f[] RHIHOHIRRIRHHRCROOIOCHRICRORCO() {
      int var5 = this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$getVertexFormatMode().getPrimitiveStride();
      FloatBuffer var1 = this.CCCCHRIHROOIOIRCRORHCHOICIHCRO.asFloatBuffer();
      int var2 = this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$getVertexFormat().OIHRRRRICIHIHHHICRROIORRRCOOHC();
      int var3 = var2 * var5;
      int var4 = this.vertices / var5;
      Vector3f[] var6 = new Vector3f[var4];

      for (int var7 = 0; var7 < var4; var7++) {
         float var8 = var1.get(var7 * var3);
         float var9 = var1.get(var7 * var3 + 1);
         float var10 = var1.get(var7 * var3 + 2);
         float var11 = var1.get(var7 * var3 + var2 * 2);
         float var12 = var1.get(var7 * var3 + var2 * 2 + 1);
         float var13 = var1.get(var7 * var3 + var2 * 2 + 2);
         var6[var7] = new Vector3f((var8 + var11) / 2.0F, (var9 + var12) / 2.0F, (var10 + var13) / 2.0F);
      }

      return var6;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      MutableInt var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3
   ) {
      switch (var2) {
         case BYTE:
            this.CRHCRCHCCICICHCHCCRHRRHHHRROHO.put(var1.getAndAdd(1), (byte)var3);
            break;
         case SHORT:
            this.CRHCRCHCCICICHCHCCRHRRHHHRROHO.putShort(var1.getAndAdd(2), (short)var3);
            break;
         case INT:
            this.CRHCRCHCCICICHCHCCRHRRHHHRROHO.putInt(var1.getAndAdd(4), var3);
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 29)
   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ByteBuffer var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3
   ) {
      switch (var2) {
         case BYTE:
            var1.put((byte)var3);
            break;
         case SHORT:
            var1.putShort((short)var3);
            break;
         case INT:
            var1.putInt(var3);
      }
   }

   private static int[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3f var0, Vector3f[] var1) {
      float[] var2 = new float[var1.length];
      int[] var3 = new int[var1.length];

      for (int var4 = 0; var4 < var1.length; var3[var4] = var4++) {
         var2[var4] = var0.distanceSquared(var1[var4]);
      }

      IntArrays.mergeSort(var3, (var1x, var2x) -> Floats.compare(var2[var2x], var2[var1x]));
      return var3;
   }

   @Override
   public void bridge$close() {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$close();
      MemoryUtil.memFree(this.CCCCHRIHROOIOIRCRORHCHOICIHCRO);
      MemoryUtil.memFree(this.CRHCRCHCCICICHCHCCRHRRHHHRROHO);
   }

   @Generated
   @Override
   public void bridge$draw(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var2
   ) {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$draw(var1, var2);
   }

   @Generated
   @Override
   public void bridge$drawWithoutFog(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var2
   ) {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$drawWithoutFog(var1, var2);
   }

   @Generated
   @Override
   public int RCIRHRRIOOCIOCCHHIOHCHHIROICRH() {
      return this.CRIHOHHRRCOHHRRHHICOOIROHICICO.RCIRHRRIOOCIOCCHHIOHCHHIROICRH();
   }

   @Generated
   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getVertexBuffer() {
      return this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$getVertexBuffer();
   }

   @Generated
   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getVertexFormat() {
      return this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$getVertexFormat();
   }

   @Generated
   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getVertexFormatMode() {
      return this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$getVertexFormatMode();
   }

   @Generated
   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getIndexType() {
      return this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$getIndexType();
   }

   @Generated
   @Override
   public void bridge$bind() {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$bind();
   }

   @Generated
   @Override
   public void bridge$unbind() {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$unbind();
   }

   @Generated
   @Override
   public void bridge$uploadWithBuffers(Object var1, ByteBuffer var2, ByteBuffer var3, IRRCCOICORICIHCHRHIHIHROIRHOCR var4) {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$uploadWithBuffers(var1, var2, var3, var4);
   }

   @Generated
   @Override
   public void bridge$updateIndexBuffer(ByteBuffer var1) {
      this.CRIHOHHRRCOHHRRHHICOOIROHICICO.bridge$updateIndexBuffer(var1);
   }
}
