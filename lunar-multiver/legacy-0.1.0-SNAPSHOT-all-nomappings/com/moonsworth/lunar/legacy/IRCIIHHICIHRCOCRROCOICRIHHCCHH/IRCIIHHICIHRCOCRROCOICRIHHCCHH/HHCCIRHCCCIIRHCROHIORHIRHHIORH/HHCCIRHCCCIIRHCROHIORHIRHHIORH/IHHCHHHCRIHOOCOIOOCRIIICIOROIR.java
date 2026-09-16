package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.lunarclient.apollo.module.chat.ChatModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ChatLine;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(GuiNewChat.class)
public abstract class IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   @Shadow
   public int scrollPos;
   @Shadow
   public boolean isScrolled;
   @Final
   @Shadow
   public Minecraft mc;
   @Final
   @Shadow
   public List<ChatLine> chatLines$v1_8;
   @Final
   @Shadow
   public List chatLines$v1_7;
   @Final
   @Shadow
   public List<ChatLine> drawnChatLines$v1_8;
   @Final
   @Shadow
   public List field_146253_i$v1_7;
   @Unique
   private static float lunar$percentTranslated = 0.0F;
   @Unique
   private static long lunar$lastUpdate = -1L;
   @Unique
   private float lunar$easedPercent;
   @Unique
   private static int lunar$newLines;
   @Unique
   private boolean lunar$hoveredLineHasHead;
   @Unique
   private boolean lunar$hoverPendingFirstWidth;
   @Unique
   private int impl$idCounter = 1;

   @Shadow
   public abstract boolean getChatOpen();

   @Shadow
   public abstract int getLineCount();

   @Shadow
   public abstract float getChatScale();

   @Shadow
   public abstract int getChatWidth();

   @Unique
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH lunar$handleChatMessage(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      boolean var3,
      LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var4
   ) {
      if (var3) {
         return var1;
      }

      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(var1), var2
            )
         );
      if (var5 != null) {
         var4.set(var5);
         if (var5.isCancelled()) {
            return null;
         } else {
            return !var5.isChanged()
               ? var1
               : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(
                  var5.OIOORCCOCHRRIRRORRICOCOCROICII()
               );
         }
      } else {
         return var1;
      }
   }

   @Unique
   private void lunar$removeLastMessage() {
      List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.chatLines$v1_8 : this.chatLines$v1_7;
      List var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.drawnChatLines$v1_8 : this.field_146253_i$v1_7;
      if (!var1.isEmpty() && !var2.isEmpty()) {
         int var3 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var1.get(
               0
            ))
            .bridge$getLunarID();
         var1.remove(0);

         while (
            !var2.isEmpty()
               && ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var2.get(
                        0
                     ))
                     .bridge$getLunarID()
                  == var3
         ) {
            var2.remove(0);
         }
      }
   }

   @Unique
   private void lunar$handleCancellation(
      CallbackInfo var1,
      LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.get();
      if (var3 != null) {
         if (var3.isCancelled()) {
            var1.cancel();
         } else {
            lunar$percentTranslated = 0.0F;
         }

         if (var3.IHCOIIHICICRRHHRHIHOOOHIHICIOH()) {
            this.lunar$removeLastMessage();
         }
      }
   }

   @Inject(method = {"setChatLine$v1_7", "setChatLine$v1_8"}, at = @At("TAIL"))
   private void lunar$incrementIdCounter(CallbackInfo var1) {
      this.impl$idCounter++;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyArgs(method = "setChatLine$v1_7", at = @At(value = "INVOKE", target = "Ljava/util/List;add(ILjava/lang/Object;)V"))
   private void lunar$assignMessageId$v1_7(Args var1) {
      if (var1.get(1) instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC var3
         )
       {
         this.lunar$setMessageId(var3);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArgs(method = "setChatLine$v1_8", at = @At(value = "INVOKE", target = "Ljava/util/List;add(ILjava/lang/Object;)V"))
   private void lunar$assignMessageId$v1_8(Args var1) {
      if (var1.get(1) instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC var3
         )
       {
         this.lunar$setMessageId(var3);
      }
   }

   @Unique
   private void lunar$setMessageId(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC var1
   ) {
      IHIRRIIORRHORHRORIHOROIRCORCOO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGuiIngame().bridge$getChatGUI();
      int var3 = var2.bridge$getLunarId();
      if (var3 != -1) {
         var1.bridge$setAddedByApollo(var2.bridge$messageAddedByApollo());
         var1.bridge$setLunarID(var3);
      } else {
         var1.bridge$setLunarID(this.impl$idCounter);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyVariable(method = "setChatLine$v1_8", at = @At("HEAD"), ordinal = 0, argsOnly = true)
   private ITextComponent lunar$modifyText$v1_8(
      ITextComponent var1,
      ITextComponent var2,
      int var3,
      int var4,
      @Local(argsOnly = true) boolean var5,
      @Share("event") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var6
   ) {
      return (ITextComponent)this.lunar$handleChatMessage(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
         this.impl$idCounter,
         var5,
         var6
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyVariable(method = "setChatLine$v1_7", at = @At("HEAD"), ordinal = 0, argsOnly = true)
   private IChatComponent lunar$modifyText$v1_7(
      IChatComponent var1,
      IChatComponent var2,
      int var3,
      int var4,
      @Local(argsOnly = true) boolean var5,
      @Share("event") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var6
   ) {
      return (IChatComponent)this.lunar$handleChatMessage(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
         this.impl$idCounter,
         var5,
         var6
      );
   }

   @Inject(method = {"setChatLine$v1_8", "setChatLine$v1_7"}, at = @At("HEAD"), cancellable = true)
   private void lunar$cancelAdd(
      CallbackInfo var1,
      @Share("event") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2
   ) {
      this.lunar$handleCancellation(var1, var2);
   }

   @ModifyConstant(method = {"setChatLine$v1_8", "setChatLine$v1_7"}, constant = @Constant(intValue = 100))
   private int lunar$setChatLine$maxLines(int var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      return var2.isEnabled() && var2.CIIIRHHIRHRHHRORROORRCRCCIHOHI().get() ? 1000 : var1;
   }

   @Unique
   private static void lunar$updateChatTranslation(long var0) {
      if (lunar$percentTranslated < 1.0F) {
         lunar$percentTranslated = lunar$percentTranslated
            + IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
                  .HCHHHOIHIIHCOIHORRIRICCCCHHIRH()
               * (float)var0;
      }

      lunar$percentTranslated = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(lunar$percentTranslated, 0.0F, 1.0F);
   }

   @Inject(method = "drawChat", at = @At("HEAD"), cancellable = true)
   private void lunar$drawChat(int var1, CallbackInfo var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.HIRRIIORHOOCIHORRCCIOIOHCOORII().HOCROOCOCOIROCCOIRHHCOOCHHOHIC())) {
         var2.cancel();
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
         .RIRROCIRCRRHROHHIOCIROOCRIROII()) {
         var2.cancel();
      } else if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHORCRHOORCIOHHIOCORCCCCCIRCCR()
         && com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRICROCIRHOHCCOIORCCRCHIRRRHO()) {
         var2.cancel();
      } else if (lunar$lastUpdate == -1L) {
         lunar$lastUpdate = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
         var2.cancel();
      } else {
         long var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
         long var5 = var3 - lunar$lastUpdate;
         lunar$lastUpdate = var3;
         lunar$updateChatTranslation(var5);
         float var7 = lunar$percentTranslated;
         this.lunar$easedPercent = (float)(1.0 - --var7 * Math.pow(var7, 3.0));
         this.lunar$easedPercent = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(this.lunar$easedPercent, 0.0F, 1.0F);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glTranslatef(FFF)V", ordinal = 0))
   private void lunar$translateChat_v1_7(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .HHHOHCIICOIIIHOIHIHHCIIICOCCHI()
         && !this.isScrolled) {
         GL11.glTranslatef(0.0F, (9.0F - 9.0F * lunar$percentTranslated) * this.getChatScale(), 0.0F);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 0))
   private void lunar$translateChat_v1_8(float var1, float var2, float var3) {
      GlStateManager.translate(var1, var2, var3);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .HHHOHCIICOIIIHOIHIHHCIIICOCCHI()
         && !this.isScrolled) {
         GlStateManager.translate(0.0F, (9.0F - 9.0F * lunar$percentTranslated) * this.getChatScale(), 0.0F);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;III)I"))
   private int lunar$drawChat$drawStringWithShadow$v1_7(FontRenderer var1, String var2, int var3, int var4, int var5) {
      return this.lunar$drawChat$drawStringWithShadow(var1, var2, var3, var4, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;drawStringWithShadow(Ljava/lang/String;FFI)I"))
   private int lunar$drawChat$drawStringWithShadow$v1_8(FontRenderer var1, String var2, float var3, float var4, int var5) {
      return this.lunar$drawChat$drawStringWithShadow(var1, var2, var3, var4, var5);
   }

   @Unique
   private int lunar$drawChat$drawStringWithShadow(FontRenderer var1, String var2, float var3, float var4, int var5) {
      float var6 = (var4 + 8.0F) / -9.0F;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
         .IRCRHHCRHIIIHROOCORCHHHRIIROIR();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (var8.HHHOHCIICOIIIHOIHIHHCIIICOCCHI() && var6 <= lunar$newLines && !this.isScrolled) {
         int var9 = var5 >>> 24;
         var5 = 16777215 + ((int)(var9 * this.lunar$easedPercent) << 24);
      }

      boolean var16 = this.lunar$chatLifted();
      boolean var10 = !var8.isEnabled() || (Boolean)var8.HROOCCRIIRRORCRCOHHOIIRIOHHIHC().get();
      if (var8.RRIIOIIRORCHHICRIRRICRIIRCORIO()) {
         int var11 = Math.round(var6) + this.scrollPos;
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var12 = this.lunar$chatHeadSkin(var11);
         if (var12 != null) {
            if (this.lunar$chatHeadTopLine(var11)) {
               int var13 = 16777215 | var5 & 0xFF000000;
               float var14 = var4 - 1.0F - (var16 ? 12 : 0);
               if (var10) {
                  int var15 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCRICHOCHHHCRCORROOIHCROOIICOC(var5);
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var7, var12, var3 + 1.0F, var14 + 1.0F, var15
                  );
               }

               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var7, var12, var3, var14, var13
               );
            }

            var3 += 12.0F;
         }
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var17 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1;
      var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var2, var3, var4 - (var16 ? 12 : 0), var5, var10);
      return (int)var17.bridge$getStringWidth(var2);
   }

   @Unique
   private boolean lunar$chatLifted() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      return var1.isEnabled() && var1.RRIHHOCOOHICCROIRCHOIRCOICCCRR().get()
         ? true
         : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ChatModule.class)
            .map(
               var0 -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)var0)
                  .CRRHROCCRRCHROHHICCIHRCOIHIROR()
            )
            .orElse(false);
   }

   @Unique
   private List<ChatLine> lunar$drawnChatLines() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.drawnChatLines$v1_8 : this.field_146253_i$v1_7;
   }

   @Unique
   @Nullable
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC lunar$chatHeadSkin(int var1) {
      List var2 = this.lunar$drawnChatLines();
      if (var1 >= 0 && var1 < var2.size()) {
         int var3 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var2.get(
               var1
            ))
            .bridge$getLunarID();
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .OHHOIRCROHOCIOOHORCCCCIHCCHCRI()
            .IOCIIROIRCOHIRHHHROHCOOHIICIHI(var3);
      } else {
         return null;
      }
   }

   @Unique
   private boolean lunar$chatHeadTopLine(int var1) {
      List var2 = this.lunar$drawnChatLines();
      return var1 + 1 >= var2.size()
         ? true
         : ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var2.get(
                  var1 + 1
               ))
               .bridge$getLunarID()
            != ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var2.get(
                  var1
               ))
               .bridge$getLunarID();
   }

   @Unique
   private boolean lunar$chatHeadsForCurrentMessage() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (!var1.RRIIOIIRORCHHICRIRRICRIIRCORIO()) {
         return false;
      }

      int var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGuiIngame().bridge$getChatGUI().bridge$getLunarId();
      int var3 = var2 != -1 ? var2 : this.impl$idCounter;
      return var1.OHHOIRCROHOCIOOHORCCCCIHCCHCRI().IOCIIROIRCOHIRHHHROHCOOHIICIHI(var3) != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glScalef(FFF)V"))
   private void lunar$drawChat$getChatOpen_v1_7(float var1, float var2, float var3, int var4) {
      GL11.glScalef(var1, var2, var3);
      this.lunar$drawChat$getChatOpen(var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;scale(FFF)V"))
   private void lunar$drawChat$getChatOpen_v1_8(float var1, float var2, float var3, int var4) {
      GlStateManager.scale(var1, var2, var3);
      this.lunar$drawChat$getChatOpen(var4);
   }

   @Unique
   private void lunar$drawChat$getChatOpen(int var1) {
      int var2 = this.getLineCount();
      boolean var3 = this.getChatOpen();
      float var4 = this.getChatScale();
      float var5 = this.getChatWidth() / var4;
      int var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? MathHelper.ceil$v1_12(var5) : MathHelper.ceiling_float_int$v1_7(var5);
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      float var8 = var7.isEnabled() ? (Float)var7.ROICRCCOHCIHCHCRRHHOOHIRHHOIHO().get() : 1.0F;
      boolean var9 = this.lunar$chatLifted();
      if (var8 > 0.0F) {
         int var10 = 0;
         List var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.drawnChatLines$v1_8 : this.field_146253_i$v1_7;

         for (int var12 = 0; var12 + this.scrollPos < var11.size() && var12 < var2; var12++) {
            ChatLine var13 = (ChatLine)var11.get(var12 + this.scrollPos);
            if (var13 != null) {
               int var14 = var1 - var13.getUpdatedCounter();
               double var15 = var14 / 200.0;
               var15 = 1.0 - var15;
               var15 *= 10.0;
               var15 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? MathHelper.clamp$v1_12(var15, 0.0, 1.0) : MathHelper.clamp_double$v1_7(var15, 0.0, 1.0);
               var15 *= var15;
               int var17 = (int)(255.0 * var15);
               if (var17 >= 254 || var3) {
                  var10 -= this.mc.fontRenderer.FONT_HEIGHT;
               }
            }
         }

         Gui.drawRect(0, var9 ? -12 : 0, var6 + 4, var10 + (var9 ? -12 : 0), (int)(127.0F * var8) << 24);
      }
   }

   @Redirect(method = "drawChat", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V", ordinal = 0))
   private void lunar$drawChat$drawRect(int var1, int var2, int var3, int var4, int var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      boolean var7 = this.lunar$chatLifted();
      float var8 = var6.isEnabled() ? (Float)var6.ROICRCCOHCIHCHCRRHHOOHIRHHOIHO().get() : 1.0F;
      if (var8 > 0.0F) {
         int var9 = (byte)(var5 >> 24) & 255;
         if (var9 < 127) {
            Gui.drawRect(var1, var2 + (var7 ? -12 : 0), var3, var4 + (var7 ? -12 : 0), (int)(var8 * var9) << 24);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "setChatLine$v1_8", at = @At("HEAD"))
   private void lunar$setChatLine(ITextComponent var1, int var2, int var3, boolean var4, CallbackInfo var5) {
      float var6 = this.getChatWidth() / this.getChatScale();
      int var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? MathHelper.floor$v1_12(var6) : MathHelper.floor_float$v1_7(var6);
      List var8 = GuiUtilRenderComponents.splitText(var1, var7, this.mc.fontRenderer, false, false);
      lunar$newLines = var8.size() - 1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "getChatComponent$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;floor$v1_12(F)I", ordinal = 1),
      require = 1
   )
   private int lunar$getChatComponent$yPos$v1_12(float var1) {
      return MathHelper.floor$v1_12(var1) - (this.lunar$chatLifted() ? 12 : 0);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(
      method = "getChatComponent$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;floor_float$v1_7(F)I", ordinal = 1),
      require = 1
   )
   private int lunar$getChatComponent$yPos$v1_8(float var1) {
      return MathHelper.floor_float$v1_7(var1) - (this.lunar$chatLifted() ? 12 : 0);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "setChatLine$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiUtilRenderComponents;splitText(Lnet/minecraft/util/text/ITextComponent;ILnet/minecraft/client/gui/FontRenderer;ZZ)Ljava/util/List;"
      )
   )
   private List<ITextComponent> lunar$splitChatLines(ITextComponent var1, int var2, FontRenderer var3, boolean var4, boolean var5) {
      if (this.lunar$chatHeadsForCurrentMessage()) {
         var2 -= 12;
      }

      return GuiUtilRenderComponents.splitText(var1, var2, var3, var4, var5);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyExpressionValue(
      method = "setChatLine$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;floor_float$v1_7(F)I", ordinal = 0)
   )
   private int lunar$chatHeadsWrapWidth$v1_7(int var1) {
      return this.lunar$chatHeadsForCurrentMessage() ? var1 - 12 : var1;
   }

   @Redirect(method = {"getChatComponent$v1_7", "getChatComponent$v1_8"}, at = @At(value = "INVOKE", target = "Ljava/util/List;get(I)Ljava/lang/Object;"))
   private Object lunar$chatHeadsHoverLine(List<?> var1, int var2) {
      this.lunar$hoveredLineHasHead = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .RRIIOIIRORCHHICRIRRICRIIRCORIO()
         && this.lunar$chatHeadSkin(var2) != null;
      this.lunar$hoverPendingFirstWidth = true;
      return var1.get(var2);
   }

   @Redirect(
      method = {"getChatComponent$v1_7", "getChatComponent$v1_8"},
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/FontRenderer;getStringWidth(Ljava/lang/String;)I")
   )
   private int lunar$chatHeadsHoverWidth(FontRenderer var1, String var2) {
      int var3 = var1.getStringWidth(var2);
      if (this.lunar$hoverPendingFirstWidth) {
         this.lunar$hoverPendingFirstWidth = false;
         if (this.lunar$hoveredLineHasHead) {
            var3 += 12;
         }
      }

      return var3;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "getChatComponent$v1_8", at = @At("HEAD"))
   private void lunar$resetLastHovered$v1_8(int var1, int var2, CallbackInfoReturnable<ITextComponent> var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCRHOICIRORRHOOOCIHHHHCHCICHOH(
         -1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "getChatComponent$v1_7", at = @At("HEAD"))
   private void lunar$resetLastHovered$v1_7(int var1, int var2, CallbackInfoReturnable<IChatComponent> var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCRHOICIRORRHOOOCIHHHHCHCICHOH(
         -1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "getChatComponent$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/ChatLine;getChatComponent$v1_8()Lnet/minecraft/util/text/ITextComponent;")
   )
   private void lunar$getLastChatLineHovered$v1_8(int var1, int var2, CallbackInfoReturnable<ITextComponent> var3, @Local ChatLine var4) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCRHOICIRORRHOOOCIHHHHCHCICHOH(
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var4)
            .bridge$getLunarID()
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "getChatComponent$v1_7",
      at = @At(value = "INVOKE", target = "net/minecraft/client/gui/ChatLine.getChatComponent()Lnet/minecraft/util/IChatComponent;")
   )
   private void lunar$getLastChatLineHovered$v1_7(int var1, int var2, CallbackInfoReturnable<IChatComponent> var3, @Local ChatLine var4) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCRHOICIRORRHOOOCIHHHHCHCICHOH(
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC)var4)
            .bridge$getLunarID()
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "clearChatMessages$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$preventChatClear(boolean var1, CallbackInfo var2) {
      if (var1
         && (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .HCCOCCORORORICHCRIOOCROOCHHRCC()
            .get()) {
         var2.cancel();
      }
   }

   @Inject(method = "getChatOpen", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindIsChatFocused(CallbackInfoReturnable<Boolean> var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var0 -> ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var0.COICHIOIHHOHRHRHCIOICORCRORIIR()
                  .get())
               .COORRCRIHCCCCRHIRCCCCOOOCHIRCH()
         )) {
         var1.setReturnValue(true);
      }
   }

   @Inject(method = "getChatOpen", at = @At("HEAD"), cancellable = true)
   private void lunar$chatPeekGetChatOpen(CallbackInfoReturnable<Boolean> var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
         .HIHOOHORIIIOCRRROCIRCHCORRROIC()) {
         var1.setReturnValue(true);
      }
   }

   @ModifyVariable(method = {"getChatComponent$v1_7", "getChatComponent$v1_8"}, at = @At("HEAD"), ordinal = 0, argsOnly = true)
   private int lunar$getRewindMouseX(int var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var2 != null) {
         CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var3 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH();
         return ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var2.COICHIOIHHOHRHRHCIOICORCRORIIR()
                  .get())
               .HHOHIHRCICOIICIIOHHHRHROHCHICI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH(), var3.getScaledWidth()
               )
            * var3.IOCIOIHIOOCRHHORHHCOOHIIHICOCH();
      } else {
         return var1;
      }
   }

   @ModifyVariable(method = {"getChatComponent$v1_7", "getChatComponent$v1_8"}, at = @At("HEAD"), ordinal = 1, argsOnly = true)
   private int lunar$getRewindMouseY(int var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var2 != null) {
         CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var3 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH();
         return (
               var3.getScaledHeight()
                  - ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var2.COICHIOIHHOHRHRHCIOICORCRORIIR()
                        .get())
                     .HHOHIHRCICOIICIIOHHHRHROHCHICI()
                     .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH(),
                        var3.getScaledHeight()
                     )
            )
            * var3.IOCIOIHIOOCRHHORHHCOOHIIHICOCH();
      } else {
         return var1;
      }
   }
}
