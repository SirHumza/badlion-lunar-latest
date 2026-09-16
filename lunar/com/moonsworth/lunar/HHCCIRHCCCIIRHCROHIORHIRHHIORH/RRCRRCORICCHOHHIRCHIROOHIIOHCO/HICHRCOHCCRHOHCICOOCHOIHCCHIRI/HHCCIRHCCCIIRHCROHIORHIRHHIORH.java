package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   static HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var0, int var1, boolean var2) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
   }

   static HHCCIRHCCCIIRHCROHIORHIRHHIORH HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, int var1, boolean var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHORRHCCCIROIRCIRIRCIORHRRRHRR()
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0, var1)
         .RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var2)
         .OHHHOIRORRRHROOROCHCIIICIRCROH();
   }

   static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, int var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2, boolean var3) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHORRHCCCIROIRCIRIRCIORHRRRHRR()
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0, var1)
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2)
         .RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var3)
         .OHHHOIRORRRHROOROCHCIIICIRCROH();
   }

   static HHCCIRHCCCIIRHCROHIORHIRHHIORH IHHCHHHCRIHOOCOIOOCRIIICIOROIR(int var0, int var1) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1);
   }

   int bridge$framebufferWidth();

   int bridge$framebufferHeight();

   int bridge$framebufferTextureWidth();

   int bridge$framebufferTextureHeight();

   int bridge$getFramebufferTexture();

   void bridge$unbindFrameBuffer();

   void bridge$frameBufferRender(int var1, int var2);

   default void bridge$frameBufferRender(int var1, int var2, boolean var3) {
      this.bridge$frameBufferRender(var1, var2);
   }

   void bridge$createBindFramebuffer(int var1, int var2);

   void bridge$framebufferClear();

   default void bridge$framebufferClear(boolean var1) {
      this.bridge$framebufferClear();
   }

   void bridge$delete();

   void bridge$setClearColor(float var1, float var2, float var3, float var4);

   void bridge$blitToScreen(int var1, int var2, int var3, int var4, boolean var5);

   void bridge$blitToRenderTarget(
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10
   );

   default void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, boolean var2) {
      this.bridge$blitToRenderTarget(
         var1,
         0,
         0,
         this.bridge$framebufferWidth(),
         this.bridge$framebufferHeight(),
         0,
         0,
         var1.bridge$framebufferWidth(),
         var1.bridge$framebufferHeight(),
         var2
      );
   }

   CIOHHCORHRCCRICCCORIHCRHCCCRRR bridge$getColorTexture(boolean var1);

   IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getDepthTexture();

   void bridge$present();

   default boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this.bridge$framebufferWidth() == var1.bridge$framebufferWidth() && this.bridge$framebufferHeight() == var1.bridge$framebufferHeight();
   }
}
