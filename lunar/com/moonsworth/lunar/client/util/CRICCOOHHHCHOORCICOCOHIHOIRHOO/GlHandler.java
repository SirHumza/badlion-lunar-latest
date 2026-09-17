package com.moonsworth.lunar.client.util.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJLoader.CompiledData;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final FloatBuffer ICOCRCOIHHOICIIHICHOOIOIRCIHOI;
   private final IntBuffer indices;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOCOIRRRHIICCRHRHROIRCIROORRHC;
   private int vertexBuffer;
   private int normalBuffer;
   private int CORRRHICRRHHORCCCRCIIRHHROIHIR;
   private int indexBuffer;

   @Override
   public int ROIOOOICHHICRIIOCCCOHOOOCHOHIR() {
      return this.ICOCRCOIHHOICIIHICHOOIOIRCIHOI.capacity() + this.indices.capacity();
   }

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(CompiledData var1) {
      this.ICOCRCOIHHOICIIHICHOOIOIRCIHOI = BufferUtils.createFloatBuffer(var1.texData.length);
      this.ICOCRCOIHHOICIIHICHOOIOIRCIHOI.put(var1.texData).flip();
      this.indices = BufferUtils.createIntBuffer(var1.indexData.length);
      this.indices.put(var1.indexData).flip();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1));
      this.IOCOIRRRHIICCRHRHROIRCIROORRHC = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.posData);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 7)
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2) {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var3 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHHHRIICRCOOIOCOHICOCROCOHROOO.get(var2);
      var3.bridge$setupRenderState();
      GL15.glBindBuffer(34962, this.vertexBuffer);
      GL11.glVertexPointer(4, 5126, 0, 0L);
      GL15.glBindBuffer(34962, this.normalBuffer);
      GL11.glNormalPointer(5126, 0, 0L);
      GL15.glBindBuffer(34962, this.CORRRHICRRHHORCCCRCIIRHHROIHIR);
      GL11.glTexCoordPointer(2, 5126, 0, 0L);
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32885);
      GL11.glEnableClientState(32888);
      GL15.glBindBuffer(34963, this.indexBuffer);
      GL11.glDrawElements(4, this.indices.capacity(), 5125, 0L);
      GL15.glBindBuffer(34963, 0);
      GL15.glBindBuffer(34962, 0);
      GL11.glDisableClientState(32884);
      GL11.glDisableClientState(32885);
      GL11.glDisableClientState(32888);
      var3.bridge$clearRenderState();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6, max = 7)
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2, RHOCHHIRRCHHHOHOIRROIROHHHIHIO var3, int var4
   ) {
      var1.bridge$setupRenderState();
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH();
      int var6 = var2.RCHHCIOCRICRORCCOIOIOIHROHCRCH().get();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROIHROCROORRCCOIRRIHHORCROOORO().OCHIHOOCOHCHCHCIRHCOOCOROHOCII();
      GL11.glEnable(2912);
      var3.IHCOIHIICIIHOOIICCHHCRORHORHCI();
      var5.COOCCCHCCRCCORRICRHCRROIOCOOIH();
      var5.COCCHRIOCIHRCRRHICICHIIRCCHIHO();
      var3.HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .HRICOCOIOCCCICCIORHIIIIOROCOHC()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.CIRRHHHIRCHOHHCRCIHROHHRIOCOHO().bridge$last().bridge$pose());
      GL15.glBindBuffer(34962, this.vertexBuffer);
      GL11.glVertexPointer(4, 5126, 0, 0L);
      GL15.glBindBuffer(34962, this.normalBuffer);
      GL11.glNormalPointer(5126, 0, 0L);
      GL13.glClientActiveTexture(33984 + var5.CIHOOHCHOCIIHRIORCRCHHOOCRIRHH());
      GL15.glBindBuffer(34962, this.CORRRHICRRHHORCCCRCIIRHHROIHIR);
      GL11.glTexCoordPointer(2, 5126, 0, 0L);
      GL13.glMultiTexCoord2s(33984 + var5.ICRICIRRROOICOCHOHICCOHIRCHIOR(), (short)(var6 & 0xFF), (short)(var6 >> 16 & 0xFF));
      GL11.glEnableClientState(32884);
      GL11.glEnableClientState(32885);
      GL11.glEnableClientState(32888);
      GL15.glBindBuffer(34963, this.indexBuffer);
      com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         )
         .ifPresent(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::beforeOBJMeshRender
         );
      GL11.glDrawElements(4, this.indices.capacity(), 5125, 0L);
      GL15.glBindBuffer(34963, 0);
      GL15.glBindBuffer(34962, 0);
      GL11.glDisableClientState(32884);
      GL11.glDisableClientState(32885);
      GL11.glDisableClientState(32888);
      var3.HROOORICCCOROOORORCORRHRHORIRC();
      GL11.glDisable(2912);
      var1.bridge$clearRenderState();
   }

   @Override
   public void delete() {
      GL15.glDeleteBuffers(this.vertexBuffer);
      GL15.glDeleteBuffers(this.normalBuffer);
      GL15.glDeleteBuffers(this.CORRRHICRRHHORCCCRCIIRHHROIHIR);
      GL15.glDeleteBuffers(this.indexBuffer);
   }

   @Override
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIHICRIICHCHIROIOHRRCHICOCOCO() {
      return this.IOCOIRRRHIICCRHRHROIRCIROORRHC;
   }

   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      float[] var1
   ) {
      float var2 = Float.MAX_VALUE;
      float var3 = Float.MAX_VALUE;
      float var4 = Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;
      float var6 = -Float.MAX_VALUE;
      float var7 = -Float.MAX_VALUE;

      for (int var8 = 0; var8 < var1.length / 4; var8++) {
         float var9 = var1[var8 * 4 + 3];
         float var10 = var1[var8 * 4] / var9;
         float var11 = var1[var8 * 4 + 1] / var9;
         float var12 = var1[var8 * 4 + 2] / var9;
         if (var10 < var2) {
            var2 = var10;
         }

         if (var10 > var5) {
            var5 = var10;
         }

         if (var11 < var3) {
            var3 = var11;
         }

         if (var11 > var6) {
            var6 = var11;
         }

         if (var12 < var4) {
            var4 = var12;
         }

         if (var12 > var7) {
            var7 = var12;
         }
      }

      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4, var5, var6, var7);
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(@NotNull CompiledData var1) {
      FloatBuffer var2 = BufferUtils.createFloatBuffer(var1.posData.length);
      var2.put(var1.posData).flip();
      FloatBuffer var3 = BufferUtils.createFloatBuffer(var1.normData.length);
      var3.put(var1.normData).flip();
      this.vertexBuffer = GL15.glGenBuffers();
      GL15.glBindBuffer(34962, this.vertexBuffer);
      GL15.glBufferData(34962, var2, 35048);
      this.normalBuffer = GL15.glGenBuffers();
      GL15.glBindBuffer(34962, this.normalBuffer);
      GL15.glBufferData(34962, var3, 35044);
      this.CORRRHICRRHHORCCCRCIIRHHROIHIR = GL15.glGenBuffers();
      GL15.glBindBuffer(34962, this.CORRRHICRRHHORCCCRCIIRHHROIHIR);
      GL15.glBufferData(34962, this.ICOCRCOIHHOICIIHICHOOIOIRCIHOI, 35044);
      this.indexBuffer = GL15.glGenBuffers();
      GL15.glBindBuffer(34963, this.indexBuffer);
      GL15.glBufferData(34963, this.indices, 35044);
      GL15.glBindBuffer(34962, 0);
      GL15.glBindBuffer(34963, 0);
   }
}
