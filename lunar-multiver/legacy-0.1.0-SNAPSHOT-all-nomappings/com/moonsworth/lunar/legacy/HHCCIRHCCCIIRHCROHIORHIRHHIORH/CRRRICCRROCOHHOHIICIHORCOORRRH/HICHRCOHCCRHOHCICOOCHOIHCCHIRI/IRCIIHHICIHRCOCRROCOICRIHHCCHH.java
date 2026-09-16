package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.KeyBinding_v1_7;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(KeyBinding_v1_7.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public int keyCode;
   @Shadow
   public boolean pressed;
   @Final
   @Shadow
   public String keyDescription;
   @Final
   @Shadow
   public String keyCategory;
   @Unique
   private Set<IHIRRIIORRHORHRORIHOROIRCORCOO> lunar$clashesWith = new HashSet<>();
   @Unique
   private String lunar$siblingName = "";

   @Shadow
   public abstract boolean getIsKeyPressed();

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getKey() {
      return com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCRORCHHCCCORRHCHOOHOOCRHCRCI(this.keyCode);
   }

   public void bridge$setKey(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.keyCode = com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1);
   }

   public boolean bridge$isKeyDown() {
      return this.getIsKeyPressed();
   }

   public String bridge$getKeyName() {
      if (this.keyCode < 0) {
         return I18n.format("key.mouseButton", new Object[]{this.keyCode + 101});
      }

      try {
         return Keyboard.getKeyName(this.keyCode);
      } catch (ArrayIndexOutOfBoundsException var2) {
         return "UNK";
      }
   }

   public String bridge$getKeyDescription() {
      return I18n.format(this.keyDescription, new Object[0]);
   }

   public String bridge$getUntranslatedKeyDescription() {
      return this.keyDescription;
   }

   public void bridge$setKeyBindState(boolean var1) {
      KeyBinding_v1_7.setKeyBindState(this.keyCode, var1);
   }

   public void bridge$setKeyBindPressed(boolean var1) {
      this.pressed = var1;
   }

   public Set<IHIRRIIORRHORHRORIHOROIRCORCOO> bridge$getClashesWith() {
      return this.lunar$clashesWith.size() <= 1 ? Collections.emptySet() : this.lunar$clashesWith;
   }

   public void bridge$setSiblingName(String var1) {
      this.lunar$siblingName = var1;
   }

   public void bridge$setClashesWith(Set<IHIRRIIORRHORHRORIHOROIRCORCOO> var1) {
      this.lunar$clashesWith = new HashSet<>(var1);
      this.lunar$clashesWith.removeIf(var1x -> var1x.id().equals(this.keyDescription) || var1x.id().equals(this.lunar$siblingName));
   }

   public String bridge$getCategory() {
      return this.keyCategory;
   }

   @Inject(method = "setKeyCode", at = @At("TAIL"))
   private void impl$onSetKeyCode(int var1, CallbackInfo var2) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3 = (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RIOCOIRRIORHRHHICHOIIOORICOHRI.inverse().get(this);
      if (var3 != null) {
         var3.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.valueOf(
               com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRCRORCHHCCCORRHCHOOHOOCRHCRCI(var1)
                  .name()
                  .toUpperCase()
            )
         );
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.OIOORROOHCRRCOCOHICICRCIOCIIOH(this);
   }
}
