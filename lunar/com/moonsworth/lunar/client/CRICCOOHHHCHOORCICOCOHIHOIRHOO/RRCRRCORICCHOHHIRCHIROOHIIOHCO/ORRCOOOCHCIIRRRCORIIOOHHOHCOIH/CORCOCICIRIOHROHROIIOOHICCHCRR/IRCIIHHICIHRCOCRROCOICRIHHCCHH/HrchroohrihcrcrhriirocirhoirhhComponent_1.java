package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @SerializedName("collection")
   private final HashMap<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> COIOHRCROIRHICOHICCOCCIRRCRIOI = new HashMap<>();
   private transient boolean dirty;
   private transient List<TextComponent> IHIHOCRHCIROHRRHOICHHHHHCROIOI;

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2, boolean var3) {
      this.COIOHRCROIRHICOHICCOCCIRRCRIOI
         .put(
            var1,
            new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var2, var3
            )
         );
      this.IHIHOCRHCIROHRRHOICHHHHHCROIOI = null;
      this.dirty = true;
   }

   public List<TextComponent> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Style var1, Style var2, int var3, int var4) {
      if (this.IHIHOCRHCIROHRRHOICHHHHHCROIOI == null) {
         this.IHIHOCRHCIROHRRHOICHHHHHCROIOI = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         if (this.CCHHCIRHICHHHHRRIHIORCCORCCIHR(var3, var4)) {
            this.IHIHOCRHCIROHRRHOICHHHHHCROIOI.add(Component.text("Please scroll through all pages.", NamedTextColor.RED));
         }
      }

      return this.IHIHOCRHCIROHRRHOICHHHHHCROIOI;
   }

   public List<TextComponent> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Style var1, Style var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var20 : this.COIOHRCROIRHICOHICCOCCIRRCRIOI
         .values()) {
         int var21 = var20.HICROROCCIROIRRRCOCHHIIROOHRRC() ? 1 : 0;
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var22 = var20.HHCIIOCCHCCIIRRHRRRHHCRCHHOHRC();
         if (var22 != null) {
            switch (var22) {
               case COMMON:
                  var5 += var21;
                  var6++;
                  break;
               case UNCOMMON:
                  var7 += var21;
                  var8++;
                  break;
               case RARE:
                  var9 += var21;
                  var10++;
                  break;
               case EPIC:
                  var11 += var21;
                  var12++;
                  break;
               case LEGENDARY:
                  var13 += var21;
                  var14++;
                  break;
               case MYTHIC:
                  var15 += var21;
                  var16++;
                  break;
               case DIVINE:
                  var17 += var21;
                  var18++;
                  break;
               default:
                  continue;
            }

            var3 += var21;
            var4++;
         }
      }

      ArrayList var23 = new ArrayList();
      TextComponent var24 = Component.text("/", NamedTextColor.GRAY);
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)((TextComponent)Component.empty().append(Component.text("Rabbit Collection: ", var1)))
                  .append(Component.text(var3, var2)))
               .append(var24))
            .append(Component.text(var4, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Common Rabbits: ", NamedTextColor.WHITE).append(Component.text(var5, var2)))
               .append(var24))
            .append(Component.text(var6, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Uncommon Rabbits: ", NamedTextColor.GREEN).append(Component.text(var7, var2)))
               .append(var24))
            .append(Component.text(var8, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Rare Rabbits: ", NamedTextColor.BLUE).append(Component.text(var9, var2))).append(var24))
            .append(Component.text(var10, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Epic Rabbits: ", NamedTextColor.DARK_PURPLE).append(Component.text(var11, var2)))
               .append(var24))
            .append(Component.text(var12, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Legendary Rabbits: ", NamedTextColor.GOLD).append(Component.text(var13, var2)))
               .append(var24))
            .append(Component.text(var14, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Mythic Rabbits: ", NamedTextColor.LIGHT_PURPLE).append(Component.text(var15, var2)))
               .append(var24))
            .append(Component.text(var16, var2))
      );
      var23.add(
         (TextComponent)((TextComponent)((TextComponent)Component.text("Divine Rabbits: ", NamedTextColor.AQUA).append(Component.text(var17, var2)))
               .append(var24))
            .append(Component.text(var18, var2))
      );
      return var23;
   }

   private boolean CCHHCIRHICHHHHRRIHIORCCORCCIHR(int var1, int var2) {
      long var3 = this.COIOHRCROIRHICOHICCOCCIRRCRIOI
         .values()
         .stream()
         .filter(var0 -> var0.HHCIIOCCHCCIIRRHRRRHHCRCHHOHRC() != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.NONE)
         .count();
      if (var2 > var3) {
         return true;
      }

      int var5 = 0;

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : this.COIOHRCROIRHICOHICCOCCIRRCRIOI
         .values()) {
         if (var7.HICROROCCIROIRRRCOCHHIIROOHRRC()) {
            var5++;
         }
      }

      return var1 > var5;
   }

   @Generated
   public HashMap<String, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> COOHIHIIHOROHIOOIRIOIRHIRIIHHI() {
      return this.COIOHRCROIRHICOHICCOCCIRRCRIOI;
   }

   @Generated
   public boolean CIIHIROOCOCCHORHHOICCCIIORHOOH() {
      return this.dirty;
   }

   @Generated
   public List<TextComponent> CHCHCICOHORHIRHOHICRHCHCCCOCRO() {
      return this.IHIHOCRHCIROHRRHOICHHHHHCROIOI;
   }

   @Generated
   public void CCHCOROOHHCIHOHOCHIHRHOHOCROII(boolean var1) {
      this.dirty = var1;
   }
}
