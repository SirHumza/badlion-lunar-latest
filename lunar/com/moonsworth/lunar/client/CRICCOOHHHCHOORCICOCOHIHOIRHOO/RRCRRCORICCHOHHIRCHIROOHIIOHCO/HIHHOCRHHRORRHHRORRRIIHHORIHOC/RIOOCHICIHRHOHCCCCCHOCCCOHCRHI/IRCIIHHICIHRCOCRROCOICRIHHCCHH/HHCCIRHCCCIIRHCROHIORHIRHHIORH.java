package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.IdentityHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL44;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final int COCCCHRRHOICOOHOHCIOIHRCOHHHRI = 4;
   private static final int HOIRIRRRHRRIHIICHCCORRCCIRICRO = 5;
   private int[] IRCOOHCIRCCRHOORHHRICCCIOHHIHC = new int[0];
   private Object[] RCRCCCCCHCICRCIHIIRRHHCOIHOIRO = new Object[0];
   private int width = -1;
   private int height = -1;
   private int RHHRHIRCRHIHRROIHHIRICHIRIHCCI = 0;
   private ByteBuffer[] ICRCOROICHCHIOIIOIRCROHIOCHCHO = new ByteBuffer[0];
   private final boolean[] HHHROHCHIRRRRRRCOCIOCIRHIIROHO = new boolean[5];
   private final boolean[] ORRICRCOCRCIROOCHRORIRRCIOORHC = new boolean[5];
   private final int[] HRCOOCCHCRRHIRRICHCIHRCRHRICIR = new int[5];
   private int RHCROIICCOOIICIRIHIOICHIRHOIOI = 0;
   private int RHHCHROCOCHCRRRIIOOIHCIRRIROOI = 0;
   private final ArrayBlockingQueue<ByteBuffer> HHIIHOHROCCHOHCRIOCIICIIRIHRRI = new ArrayBlockingQueue<>(5);
   private final IdentityHashMap<ByteBuffer, Integer> CIHHRHHHCCHCCCCCIRRORHICROCHHR = new IdentityHashMap<>();
   private final boolean RRORHCRRHORHOIHOHCIIIRRRRCCIII = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
         .HORRRHCCICIOCOOOCIHCCRCRIOCCHR()
      || com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH().IRICRCROHROOORCOOHHCOCOCCHHOCI();

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      while (this.HHIIHOHROCCHOHCRIOCIICIIRIHRRI.remainingCapacity() > 0) {
         this.HHIIHOHROCCHOHCRIOCIICIIRIHRRI.add(BufferUtils.createByteBuffer(0));
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteBuffer var1) {
      Integer var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      if (var2 != null) {
         this.HHHROHCHIRRRRRRCOCIOCIRHIIROHO[var2] = false;
      } else {
         this.HHIIHOHROCCHOHCRIOCIICIIRIHRRI.put(var1);
      }
   }

   @Override
   public boolean isFull() {
      return this.HHIIHOHROCCHOHCRIOCIICIIRIHRRI.remainingCapacity() == 0;
   }

   @Override
   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI()
         .HIHCRRIHRIROROCRICHHORIOCRCOCO();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = var2.HHRRRORIICOCHCOOOORHHOOHHIOHHI()
         .HOIHRCIOCIHORHIRHCOHRHHCCHOOOR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRIHCRIRIRICRCRCROHORIROOOIO();
      this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var1.getWidth(), var1.getHeight());
      int var5 = this.OCIICRIOOHHCCOCIHRRHCCOICCRIIH();
      if (var5 < 0) {
         return false;
      }

      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3330, 0);
      GL11.glPixelStorei(3331, 0);
      GL11.glPixelStorei(3332, 0);
      GL15.glBindBuffer(35051, this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var5]);
      int var6 = GL11.glGetInteger(32873);
      GL11.glBindTexture(3553, var3.bridge$getFramebufferTexture());
      GL11.glGetTexImage(3553, 0, 32993, 33639, 0L);
      if (this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var5] != null) {
         var4.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var5]);
      }

      this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var5] = var4.IIRHCHHOICHRICOOCRORCCIOOIHOIR(37143, 0);
      GL15.glBindBuffer(35051, 0);
      GL11.glBindTexture(3553, var6);
      this.ORRICRCOCRCIROOCHRORIRRCIOORHC[var5] = true;
      this.enqueue(var5);
      return true;
   }

   @Override
   public ByteBuffer ROROHRHRICIHRIIOOIHCIRIICRRORH() {
      if (this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI == 0) {
         return null;
      }

      int var1 = this.peek();
      Object var2 = this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var1];
      long var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRIHCRIRIRICRCRCROHORIROOOIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 0, 0L);
      if (var3 != 37147L && var3 != 37149L) {
         ByteBuffer var6 = this.ICRCOROICHCHIOIIOIRCROHIOCHCHO != null && this.ICRCOROICHCHIOIIOIRCROHIOCHCHO[var1] != null
            ? this.ICRCOROICHCHIOIIOIRCROHIOCHCHO[var1]
            : null;
         ByteBuffer var5;
         if (var6 != null) {
            ByteBuffer var7 = var6.duplicate();
            var7.clear().limit(this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI);
            var7 = var7.slice();
            this.CRRRICCRROCOHHOHIICIHORCOORRRH(var7, var1);
            this.HHHROHCHIRRRRRRCOCIOCIRHIIROHO[var1] = true;
            var5 = var7;
         } else {
            GL15.glBindBuffer(35051, this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var1]);

            try {
               ByteBuffer var15 = this.HHIIHOHROCCHOHCRIOCIICIIRIHRRI.take();
               if (var15.capacity() < this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI) {
                  var15 = BufferUtils.createByteBuffer(this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI);
               }

               var15.clear();
               GL15.glGetBufferSubData(35051, 0L, var15);
               var15.limit(this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI);
               var5 = var15;
            } catch (InterruptedException var12) {
               Thread.currentThread().interrupt();
               return null;
            } finally {
               GL15.glBindBuffer(35051, 0);
            }
         }

         this.HHHOICOHHRORRORHCCCORIHOHRHRIC();
         this.ORRICRCOCRCIROOCHRORIRRCIOORHC[var1] = false;
         return var5;
      } else {
         return null;
      }
   }

   private void RCIROOOOICRHCCRRCIORHHIRCOIIIC(int var1, int var2) {
      int var3 = var1 * var2 * 4;
      if (var1 != this.width || var2 != this.height || this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC.length != 5) {
         if (this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC.length > 0) {
            for (Object var7 : this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO) {
               if (var7 != null) {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRIHCRIRIRICRCRCROHORIROOOIO()
                     .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7);
               }
            }

            IntBuffer var9 = BufferUtils.createIntBuffer(this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC.length);

            for (int var8 : this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC) {
               var9.put(var8);
            }

            var9.flip();
            GL15.glDeleteBuffers(var9);
         }

         this.width = var1;
         this.height = var2;
         this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI = var3;
         this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC = new int[5];
         this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO = new Object[5];
         this.ICRCOROICHCHIOIIOIRCROHIOCHCHO = new ByteBuffer[5];

         for (int var10 = 0; var10 < 5; var10++) {
            this.HHHROHCHIRRRRRRCOCIOCIRHIIROHO[var10] = false;
            this.ORRICRCOCRCIROOCHRORIRRCIOORHC[var10] = false;
         }

         this.RHCROIICCOOIICIRIHIOICHIRHOIOI = 0;
         this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI = 0;

         for (int var11 = 0; var11 < 5; var11++) {
            this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var11] = GL15.glGenBuffers();
            GL15.glBindBuffer(35051, this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var11]);
            if (this.RRORHCRRHORHOIHOHCIIIRRRRCCIII) {
               byte var13 = 65;
               GL44.glBufferStorage(35051, this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI, var13);
               this.ICRCOROICHCHIOIIOIRCROHIOCHCHO[var11] = GL30.glMapBufferRange(35051, 0L, this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI, var13, null);
               if (this.ICRCOROICHCHIOIIOIRCROHIOCHCHO[var11] == null) {
                  GL15.glBufferData(35051, this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI, 35041);
               }
            } else {
               GL15.glBufferData(35051, this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI, 35041);
            }
         }

         GL15.glBindBuffer(35051, 0);
         GL11.glPixelStorei(3333, 1);
         GL11.glPixelStorei(3317, 1);
      }
   }

   @Override
   public void close() {
      for (int var1 = 0; var1 < 5; var1++) {
         if (this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO.length > var1 && this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var1] != null) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRIHCRIRIRICRCRCROHORIROOOIO()
               .CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var1]);
            this.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO[var1] = null;
         }

         if (this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC.length > var1 && this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var1] != 0) {
            GL15.glDeleteBuffers(this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var1]);
            this.IRCOOHCIRCCRHOORHHRICCCIOHHIHC[var1] = 0;
         }

         this.HHHROHCHIRRRRRRCOCIOCIRHIIROHO[var1] = false;
         this.ORRICRCOCRCIROOCHRORIRRCIOORHC[var1] = false;
      }

      this.width = -1;
      this.height = -1;
      this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI = 0;
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(ByteBuffer var1, int var2) {
      synchronized (this.CIHHRHHHCCHCCCCCIRRORHICROCHHR) {
         this.CIHHRHHHCCHCCCCCIRRORHICROCHHR.put(var1, var2);
      }
   }

   private Integer IRCIIHHICIHRCOCRROCOICRIHHCCHH(ByteBuffer var1) {
      synchronized (this.CIHHRHHHCCHCCCCCIRRORHICROCHHR) {
         return this.CIHHRHHHCCHCCCCCIRRORHICROCHHR.remove(var1);
      }
   }

   private int OCIICRIOOHHCCOCIHRRHCCOICCRIIH() {
      for (int var1 = 0; var1 < 5; var1++) {
         if (!this.HHHROHCHIRRRRRRCOCIOCIRHIIROHO[var1] && !this.ORRICRCOCRCIROOCHRORIRRCIOORHC[var1]) {
            return var1;
         }
      }

      return -1;
   }

   private void enqueue(int var1) {
      int var2 = (this.RHCROIICCOOIICIRIHIOICHIRHOIOI + this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI) % 5;
      this.HRCOOCCHCRRHIRRICHCIHRCRHRICIR[var2] = var1;
      if (this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI < 5) {
         this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI++;
      } else {
         this.RHCROIICCOOIICIRIHIOICHIRHOIOI = (this.RHCROIICCOOIICIRIHIOICHIRHOIOI + 1) % 5;
      }
   }

   private int peek() {
      return this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI == 0 ? 0 : this.HRCOOCCHCRRHIRRICHCIHRCRHRICIR[this.RHCROIICCOOIICIRIHIOICHIRHOIOI];
   }

   private void HHHOICOHHRORRORHCCCORIHOHRHRIC() {
      if (this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI > 0) {
         this.RHCROIICCOOIICIRIHIOICHIRHOIOI = (this.RHCROIICCOOIICIRIHIOICHIRHOIOI + 1) % 5;
         this.RHHCHROCOCHCRRRIIOOIHCIRRIROOI--;
      }
   }
}
