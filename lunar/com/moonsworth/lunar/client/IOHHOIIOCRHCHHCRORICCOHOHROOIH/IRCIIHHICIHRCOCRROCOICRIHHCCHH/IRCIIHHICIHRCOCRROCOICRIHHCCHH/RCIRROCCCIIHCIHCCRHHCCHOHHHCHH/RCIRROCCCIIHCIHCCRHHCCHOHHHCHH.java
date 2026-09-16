package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableSet;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.webosr.input.Keyboard;
import com.moonsworth.webosr.input.Modifiers;
import com.moonsworth.webosr.input.Mouse;
import com.moonsworth.webosr.wrappers.Browser;
import java.util.OptionalInt;
import java.util.Set;
import lombok.Generated;
import org.apache.commons.lang3.mutable.MutableDouble;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   private static final Set<Byte> HHOOHROIHOHHHHRICIHHRRIRORHOIC = ImmutableSet.of((byte)0, (byte)15);
   protected Browser RHCICHIIRIIHOICHCOHCCOCOHRORHR;
   protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHIORIHCRRIRICCCRIIIHHOIRRHCCH;
   private OptionalInt RHCRIIIOCCRRCOIIOOCORCOIIRRCOC;
   private CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH HOCOOHIRHHRIHIIHRCHROCCRIIRROO;
   protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OIORIRCHRIIIICHOHOHRHIOHHOICRO;
   private boolean RCRHHOOCOHOCIOCICHOICHHRCOIIHC;

   public void RRRHRIRCHOIHCORHIIOCICCCRHCHHO(boolean var1) {
      this.RCRHHOOCOHOCIOCICHOICHHRCOIIHC = var1;
   }

   public void CIRHHICCRROIHIOHCCCCRHOCOOIHHH() {
      this.RRRHRIRCHOIHCORHIIOCICCCRHCHHO(true);
   }

   public boolean hasFocus() {
      return this.RCRHHOOCOHOCIOCICHOICHHRCOIIHC;
   }

   private int OIOROIIOROCRCRHROCOHOOIHCIIHOI(int var1) {
      int var2 = this.ICRIROCRHORHCHHOHRIORRIROCOOIR(var1);
      if ((var1 & 8) != 0) {
         var2 |= Modifiers.SUPER.getMask();
      }

      if ((var1 & 16) != 0) {
         var2 |= Modifiers.CAPS_LOCK.getMask();
      }

      if ((var1 & 32) != 0) {
         var2 |= Modifiers.NUM_LOCK.getMask();
      }

      return var2;
   }

   private int OICRCOIIRHIOHIOCOCOOIHRCORHOIO(int var1) {
      int var2 = this.ICRIROCRHORHCHHOHRIORRIROCOOIR(var1);
      if (this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.isPresent()) {
         int var3 = this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.getAsInt();
         if (var3 == Mouse.Button.LEFT.getValue()) {
            var2 |= Modifiers.LEFT_MOUSE_BUTTON.getMask();
         }

         if (var3 == Mouse.Button.RIGHT.getValue()) {
            var2 |= Modifiers.RIGHT_MOUSE_BUTTON.getMask();
         }

         if (var3 == Mouse.Button.MIDDLE.getValue()) {
            var2 |= Modifiers.MIDDLE_MOUSE_BUTTON.getMask();
         }
      }

      return var2;
   }

   private int ICRIROCRHORHCHHOHRIORRIROCOOIR(int var1) {
      int var2 = 0;
      if ((var1 & 1) != 0) {
         var2 |= Modifiers.SHIFT.getMask();
      }

      if ((var1 & 2) != 0) {
         var2 |= Modifiers.CONTROL.getMask();
      }

      if ((var1 & 4) != 0) {
         var2 |= Modifiers.ALT.getMask();
      }

      return var2;
   }

   public void HROHRRRHCORIRCCRRIRHOCHIICIHHC() {
      if (this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.isPresent()) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.getAsInt(), 0, 0, this.HOCOOHIRHHRIHIIHRCHROCCRIIRROO);
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      this.IHIORIHCRRIRICCCRIIIHHOIRRHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.x, this.y, var2);
      super.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
   }

   @Override
   public <K extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>> void COOCCHICCCIIICRHIOCOCIOOORCOCC(
      int var1, int var2
   ) {
      this.IHIORIHCRRIRICCCRIIIHHOIRRHCCH = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this
      );
      super.COOCCHICCCIIICRHIOCOCIOOORCOCC(var1, var2);
   }

   public static com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?, ?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      MutableDouble var1 = new MutableDouble();
      MutableDouble var2 = new MutableDouble();
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(),
            var0,
            null
         )
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(OptionalInt.empty())
         .CRCCHRRRHCCCIHORHHICRROIHCOROC(true)
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var0x, var1x) -> {
            if (var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR != null) {
               var0x.HOCOOHIRHHRIHIIHRCHROCCRIIRROO = var1x;
               int var2x = var0x.OICRCOIIRHIOHIOCOCOOIHRCORHOIO(0);
               Mouse.Button var3 = Mouse.Button.NONE;
               if (var0x.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.isPresent()) {
                  if ((var0x.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.getAsInt() & Modifiers.LEFT_MOUSE_BUTTON.getMask()) != 0) {
                     var3 = Mouse.Button.LEFT;
                  } else if ((var0x.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.getAsInt() & Modifiers.RIGHT_MOUSE_BUTTON.getMask()) != 0) {
                     var3 = Mouse.Button.RIGHT;
                  } else if ((var0x.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC.getAsInt() & Modifiers.MIDDLE_MOUSE_BUTTON.getMask()) != 0) {
                     var3 = Mouse.Button.MIDDLE;
                  }
               }

               var1x = (CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1x.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var0x.getX(), var0x.getY());
               var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR.triggerMouseEvent(var3, Mouse.Action.MOVED, var1x.xi(), var1x.RORROCOIOHHOCCHRCHIIOHIHCRIIOO(), var2x);
            }
         })
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (var2x, var3, var5) -> {
               if (!RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()) {
                  if (var2x.RHCICHIIRIIHOICHCOHCCOCOHRORHR != null) {
                     int var7 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                        .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                        .COHCCCRHOCRROHHRCORCRHOICCRRIH()
                        .get();
                     int var8 = var2x.OICRCOIIRHIOHIOCOCOOIHRCORHOIO(0);
                     CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var9 = (CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var2x.HOCOOHIRHHRIHIIHRCHROCCRIIRROO
                        .HICRRICCHCCROOHHCHOCOCCHOIHHOC(var2x.getX(), var2x.getY());
                     var1.add(var3 * var7);
                     var2.add(var5 * var7);
                     int var10 = var1.getValue().intValue();
                     int var11 = var2.getValue().intValue();
                     var1.subtract(var10);
                     var2.subtract(var11);
                     if (var10 != 0 || var11 != 0) {
                        var2x.RHCICHIIRIIHOICHCOHCCOCOHRORHR.triggerScrollEvent(var10, var11, var9.xi(), var9.RORROCOIOHHOCCHRCHIIOHIHCRIIOO(), var8);
                        var2x.RHCICHIIRIIHOICHCOHCCOCOHRORHR
                           .triggerMouseEvent(Mouse.Button.NONE, Mouse.Action.MOVED, var9.xi(), var9.RORROCOIOHHOCCHRCHIIOHIHCRIIOO(), var8);
                     }
                  }
               }
            }
         )
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var0x, var1x, var2x, var3, var4) -> {
            if (var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR != null) {
               Mouse.Action var5 = var2x == 0 ? Mouse.Action.UP : Mouse.Action.DOWN;

               Mouse.Button var6 = switch (var1x) {
                  case 0 -> Mouse.Button.LEFT;
                  case 1 -> Mouse.Button.RIGHT;
                  case 2 -> Mouse.Button.MIDDLE;
                  default -> null;
               };
               if (var6 != null) {
                  if (var5 == Mouse.Action.DOWN) {
                     var0x.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC = OptionalInt.of(var1x);
                  } else {
                     var0x.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC = OptionalInt.empty();
                  }

                  int var7 = var0x.OICRCOIIRHIOHIOCOCOOIHRCORHOIO(var3);
                  var4 = (CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var0x.getX(), var0x.getY());
                  var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR.triggerMouseEvent(var6, var5, var4.xi(), var4.RORROCOIOHHOCCHRCHIIOHIHCRIIOO(), var7);
               }
            }
         })
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (var0x, var1x, var2x, var3, var4, var5) -> {
               if (var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR != null) {
                  if (var1x != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_NONE) {
                     Keyboard.Action var6 = switch (var4) {
                        case 0 -> Keyboard.Action.UP;
                        case 1, 2 -> Keyboard.Action.RAW_DOWN;
                        default -> null;
                     };
                     var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR.triggerKeyEvent(null, var3, null, var1x.getVk(), var6, var0x.OIOROIIOROCRCRHROCOHOOIHCIIHOI(var5));
                     if (var6 == Keyboard.Action.RAW_DOWN
                        && (
                           var1x
                                 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RETURN
                              || var1x
                                 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_TAB
                        )) {
                        int var7 = var1x
                              == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RETURN
                           ? 13
                           : 9;
                        var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR.triggerKeyEvent(Character.toString((char)var7), 0, Character.toString((char)var7), 0, var6, 0);
                     }
                  }
               }
            }
         )
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var0x, var1x) -> {
            if (var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR != null) {
               Keyboard.Action var2x = Keyboard.Action.CHAR;
               char[] var3 = Character.toChars(var1x);
               if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH()) {
                  int var4 = Character.getType(var3[0]);
                  if (HHOOHROIHOHHHHRICIHHRRIRORHOIC.contains((byte)var4)) {
                     return;
                  }
               }

               var0x.RHCICHIIRIIHOICHCOHCCOCOHRORHR.triggerKeyEvent(Character.toString(var3[0]), var1x, Character.toString(var3[0]), var1x, var2x, 0);
            }
         });
   }

   @Override
   public void ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(int var1, int var2) {
      super.ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(var1, var2);
   }

   public Browser HHIICHIOCCIICOCROHHHOCIRCOHROO() {
      return this.RHCICHIIRIIHOICHCOHCCOCOHRORHR;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Browser var1) {
      this.RHCICHIIRIIHOICHCOHCCOCOHRORHR = var1;
   }

   @Generated
   private static CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH OOHRIRCCRCORICCHCOIICIICOHRICR() {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(0.0, 0.0);
   }

   @Generated
   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?, ?> var1
   ) {
      super(var1);
      this.RHCICHIIRIIHOICHCOHCCOCOHRORHR = var1.RHCICHIIRIIHOICHCOHCCOCOHRORHR;
      this.IHIORIHCRRIRICCCRIIIHHOIRRHCCH = var1.IHIORIHCRRIRICCCRIIIHHOIRRHCCH;
      this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC = var1.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC;
      if (var1.ROOCOOCCRHHRCOHCICOIOOHCHIRRRR) {
         this.HOCOOHIRHHRIHIIHRCHROCCRIIRROO = var1.OIRIHIHOOROOCIOHCOORCRIOIOIHCC;
      } else {
         this.HOCOOHIRHHRIHIIHRCHROCCRIIRROO = OOHRIRCCRCORICCHCOIICIICOHRICR();
      }

      this.OIORIRCHRIIIICHOHOHRHIOHHOICRO = var1.OIORIRCHRIIIICHOHOHRHIOHHOICRO;
      this.RCRHHOOCOHOCIOCICHOICHHRCOIIHC = var1.RCRHHOOCOHOCIOCICHOICHHRCOIIHC;
   }

   @Generated
   @Override
   public String toString() {
      return "LBrowser()";
   }

   @Generated
   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
      @Generated
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HIIIHIOIHCCOHIIIOOCHRRRIHHCHOR() {
         return this;
      }

      @Generated
      @Override
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHRCCROOHCICRIHIHIOORIOHCIOCHI() {
         return new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this
         );
      }
   }

   @Generated
   public abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, B extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C, B>>
      extends com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, C, B> {
      @Generated
      private Browser RHCICHIIRIIHOICHCOHCCOCOHRORHR;
      @Generated
      private com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHIORIHCRRIRICCCRIIIHHOIRRHCCH;
      @Generated
      private OptionalInt RHCRIIIOCCRRCOIIOOCORCOIIRRCOC;
      @Generated
      private boolean ROOCOOCCRHHRCOHCICOIOOHCHIRRRR;
      @Generated
      private CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH OIRIHIHOOROOCIOHCOORCRIOIOIHCC;
      @Generated
      private com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OIORIRCHRIIIICHOHOHRHIOHHOICRO;
      @Generated
      private boolean RCRHHOOCOHOCIOCICHOICHHRCOIIHC;

      @Generated
      public B IRCIIHHICIHRCOCRROCOICRIHHCCHH(Browser var1) {
         this.RHCICHIIRIIHOICHCOHCCOCOHRORHR = var1;
         return this.IHRRCCHCCOROHOOOCRIROOHRROHIIO();
      }

      @Generated
      public B RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         this.IHIORIHCRRIRICCCRIIIHHOIRRHCCH = var1;
         return this.IHRRCCHCCOROHOOOCRIROOHRROHIIO();
      }

      @Generated
      public B IRCIIHHICIHRCOCRROCOICRIHHCCHH(OptionalInt var1) {
         this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC = var1;
         return this.IHRRCCHCCOROHOOOCRIROOHRROHIIO();
      }

      @Generated
      public B IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
         this.OIRIHIHOOROOCIOHCOORCRIOIOIHCC = var1;
         this.ROOCOOCCRHHRCOHCICOIOOHCHIRRRR = true;
         return this.IHRRCCHCCOROHOOOCRIROOHRROHIIO();
      }

      @Generated
      public B RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         this.OIORIRCHRIIIICHOHOHRHIOHHOICRO = var1;
         return this.IHRRCCHCCOROHOOOCRIROOHRROHIIO();
      }

      @Generated
      public B CRCCHRRRHCCCIHORHHICRROIHCOROC(boolean var1) {
         this.RCRHHOOCOHOCIOCICHOICHHRCOIIHC = var1;
         return this.IHRRCCHCCOROHOOOCRIROOHRROHIIO();
      }

      @Generated
      protected abstract B IHRRCCHCCOROHOOOCRIROOHRROHIIO();

      @Generated
      public abstract C RHRCCROOHCICRIHIHIOORIOHCIOCHI();

      @Generated
      @Override
      public String toString() {
         return "LBrowser.LBrowserBuilder(super="
            + super.toString()
            + ", browser="
            + this.RHCICHIIRIIHOICHCOHCCOCOHRORHR
            + ", painter="
            + this.IHIORIHCRRIRICCCRIIIHHOIRRHCCH
            + ", optMouseButtonHeld="
            + this.RHCRIIIOCCRRCOIIOOCORCOIIRRCOC
            + ", mouse$value="
            + this.OIRIHIHOOROOCIOHCOORCRIOIOIHCC
            + ", gameUI="
            + this.OIORIRCHRIIIICHOHOHRHIOHHOICRO
            + ", hasFocus="
            + this.RCRHHOOCOHOCIOCICHOICHHRCOIIHC
            + ")";
      }
   }
}
