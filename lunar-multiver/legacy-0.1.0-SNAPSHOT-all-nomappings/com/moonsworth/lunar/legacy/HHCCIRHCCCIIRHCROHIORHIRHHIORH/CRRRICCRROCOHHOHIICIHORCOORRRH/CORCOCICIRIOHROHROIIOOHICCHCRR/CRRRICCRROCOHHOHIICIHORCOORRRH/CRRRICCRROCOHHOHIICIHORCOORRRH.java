package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TextureManager.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   @Shadow
   public Map<ResourceLocation, ITextureObject> mapTextureObjects;
   @Shadow
   public List<ITickable> listTickables;

   @Shadow
   public abstract boolean loadTexture(ResourceLocation var1, ITextureObject var2);

   @Shadow
   public abstract void bindTexture(ResourceLocation var1);

   @Shadow
   public abstract ResourceLocation getDynamicTextureLocation(String var1, DynamicTexture var2);

   @Shadow
   public abstract ITextureObject getTexture(ResourceLocation var1);

   public boolean bridge$loadTexture(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, IRRCCOICORICIHCHRHIHIHROIRHOCR var2) {
      return this.loadTexture((ResourceLocation)var1, (ITextureObject)var2);
   }

   public void bridge$bindTexture(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      this.bindTexture((ResourceLocation)var1);
   }

   public void bridge$deleteTexture(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      ITextureObject var2 = this.mapTextureObjects.remove((ResourceLocation)var1);
      if (var2 instanceof AbstractTexture) {
         ((AbstractTexture)var2).deleteGlTexture();
         this.listTickables.remove(var2);
      }
   }

   @NotNull
   public IRRCCOICORICIHCHRHIHIHROIRHOCR bridge$getTexture(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      ITextureObject var2 = this.getTexture((ResourceLocation)var1);
      if (var2 == null) {
         SimpleTexture var3 = new SimpleTexture((ResourceLocation)var1);
         this.loadTexture((ResourceLocation)var1, var3);
         return (IRRCCOICORICIHCHRHIHIHROIRHOCR)var3;
      } else {
         return (IRRCCOICORICIHCHRHIHIHROIRHOCR)var2;
      }
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getDynamicTextureLocation(String var1, CORCOCICIRIOHROHROIIOOHICCHCRR var2) {
      return (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.getDynamicTextureLocation(var1, (DynamicTexture)var2);
   }

   public Map<RCIROOOOICRHCCRRCIORHHIRCOIIIC, IRRCCOICORICIHCHRHIHIHROIRHOCR> bridge$getTextureMap() {
      return this.mapTextureObjects;
   }
}
