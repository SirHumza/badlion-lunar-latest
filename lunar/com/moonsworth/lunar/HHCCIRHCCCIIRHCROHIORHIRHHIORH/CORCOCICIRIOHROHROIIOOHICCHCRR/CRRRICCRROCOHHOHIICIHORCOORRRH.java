package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import org.joml.Math;
import org.joml.Vector3d;
import org.joml.Vector3ic;

@com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
   OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
         @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            version = 0,
            RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               "net/minecraft/entity/Entity"
            )
         ),
         @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            version = 6,
            RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               "net/minecraft/world/entity/Entity"
            )
         )
   }
)
public interface CRRRICCRROCOHHOHIICIHORCOORRRH
   extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "isSneaking()Z"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "isShiftKeyDown()Z"
               )
            )
      }
   )
   boolean bridge$isSneaking();

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "isRiding()Z"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "isPassenger()Z"
               )
            )
      }
   )
   boolean bridge$isRiding();

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "ticksExisted"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "tickCount"
               )
            )
      }
   )
   int CCHHCROIOCRIIRICHRRIIHCHCOHHOI();

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "ticksExisted"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "tickCount"
               )
            )
      }
   )
   void RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(int var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "worldObj"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 5,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "world"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "level"
               )
            )
      }
   )
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH bridge$getWorld();

   void bridge$lerpTo(double var1, double var3, double var5, float var7, float var8);

   void bridge$setOnGround(boolean var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "posX"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  {"position", "x"}
               )
            )
      }
   )
   @Override
   double bridge$getPosX();

   void bridge$setPosX(double var1);

   void bridge$setChunkX(int var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "posY"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  {"position", "y"}
               )
            )
      }
   )
   @Override
   double bridge$getPosY();

   void bridge$setPosY(double var1);

   void bridge$setChunkY(int var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "posZ"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  {"position", "z"}
               )
            )
      }
   )
   @Override
   double bridge$getPosZ();

   void bridge$setPosZ(double var1);

   void bridge$setChunkZ(int var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "prevPosX"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "xo"
               )
            )
      }
   )
   double RHRCCCOORROCRICCICHHCCCCIICIHH();

   void bridge$setPreviousPosX(double var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "prevPosY"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "yo"
               )
            )
      }
   )
   double IICIIHIHHRCIIRHCRROHIHHOICROIR();

   void bridge$setPreviousPosY(double var1);

   @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OROORIICIOOOOIHIRHRHOIOCIHRRIO = {
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 0,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "prevPosZ"
               )
            ),
            @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               version = 6,
               RIOOCHOIIRROHCORCROHCHCHIIIIOO = @com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  "zo"
               )
            )
      }
   )
   double RHOROIIHICOCIICIICRHHOOOROIIOO();

   void bridge$setPreviousPosZ(double var1);

   default void bridge$setOldPos(double var1, double var3, double var5) {
   }

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getBlockPos();

   @Override
   double bridge$getMotionX();

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1);

   @Override
   double bridge$getMotionY();

   void bridge$setMotionY(double var1);

   @Override
   double bridge$getMotionZ();

   void IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var1);

   double bridge$getRotationYaw();

   double bridge$getRotationPitch();

   void bridge$setRotationYaw(double var1);

   void bridge$setRotationPitch(double var1);

   double bridge$getPreviousRotationYaw();

   void bridge$setPreviousRotationYaw(double var1);

   double bridge$getPreviousRotationPitch();

   void bridge$setPreviousRotationPitch(double var1);

   UUID bridge$getUniqueID();

   void bridge$setUniqueID(UUID var1);

   @Override
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBox();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBox(float var1);

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBoxForCulling();

   default double CIOHHCORHRCCRICCCORIHCRHCCCRRR(float var1) {
      return this.RHRCCCOORROCRICCICHHCCCCIICIHH() + (this.bridge$getPosX() - this.RHRCCCOORROCRICCICHHCCCCIICIHH()) * var1;
   }

   default double IHHCHHHCRIHOOCOIOOCRIIICIOROIR(float var1) {
      return this.IICIIHIHHRCIIRHCRROHIHHOICROIR() + (this.bridge$getPosY() - this.IICIIHIHHRCIIRHCRROHIHHOICROIR()) * var1;
   }

   default double IIRHCHHOICHRICOOCRORCCIOOIHOIR(float var1) {
      return this.RHOROIIHICOCIICIICRHHOOOROIIOO() + (this.bridge$getPosZ() - this.RHOROIIHICOCIICIICRHHOOOROIIOO()) * var1;
   }

   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHHRIOHROOIHOROCIRHCHORIHRRRRI(
      float var1
   ) {
      return this.bridge$getBoundingBox()
         .bridge$offset(
            this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1) - this.bridge$getPosX(),
            this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1) - this.bridge$getPosY(),
            this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1) - this.bridge$getPosZ()
         );
   }

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCIIORHORHHCHHCRCIRCHOCOCIIHRO();

   boolean bridge$isOnGround();

   boolean bridge$isInvisibleTo(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   );

   default double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      double var2 = this.bridge$getPosX() - var1.bridge$getPosX();
      double var4 = this.bridge$getPosY() - var1.bridge$getPosY();
      double var6 = this.bridge$getPosZ() - var1.bridge$getPosZ();
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   default double IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return Math.sqrt(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1));
   }

   default double OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double var1, double var3, double var5) {
      double var7 = this.bridge$getPosX() - var1;
      double var9 = this.bridge$getPosY() - var3;
      double var11 = this.bridge$getPosZ() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   default double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
   }

   default double IRCIIHHICIHRCOCRROCOICRIHHCCHH(Vector3ic var1) {
      return this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1.x(), var1.y(), var1.z());
   }

   default double CORCOCICIRIOHROHROIIOOHICCHCRR(double var1, double var3, double var5) {
      return Math.sqrt(this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1, var3, var5));
   }

   default CRHROHHHCIHHCOHCOORCRIHHIICROR RCRCIHCOCOOORIRCOHHOIOHROOOHOC() {
      return this.bridge$getViewVector(1.0F);
   }

   CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getViewVector(float var1);

   int bridge$getDimension();

   void bridge$setDimension(int var1);

   default String bridge$getDimensionName() {
      return "";
   }

   default CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getEyePosition() {
      return this.bridge$getEyePosition(0.0F);
   }

   CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getEyePosition(float var1);

   CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getRidingEntity();

   double bridge$getFallDistance();

   void bridge$resetFallDistance();

   boolean bridge$hitByEntity(CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   double bridge$lastTickX();

   void bridge$setLastTickX(double var1);

   double bridge$lastTickY();

   void bridge$setLastTickY(double var1);

   double bridge$lastTickZ();

   void bridge$setLastTickZ(double var1);

   IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getDataWatcher();

   boolean bridge$isRidingBoat();

   boolean bridge$isCollidedHorizontally();

   boolean bridge$isRemoved();

   default double COORRHHRIRHRHIHHICCHIORCHOOCOI() {
      double var1 = this.bridge$getPosX() - this.RHRCCCOORROCRICCICHHCCCCIICIHH();
      double var3 = this.bridge$getPosY() - this.IICIIHIHHRCIIRHCRROHIHHOICROIR();
      double var5 = this.bridge$getPosZ() - this.RHOROIIHICOCIICIICRHHOOOROIIOO();
      return var1 * var1 + var3 * var3 + var5 * var5;
   }

   @Override
   Component bridge$getTypeName();

   String bridge$getEntityString();

   IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getPickResult();

   void bridge$setCustomName(Component var1);

   void bridge$setCustomNameVisible(boolean var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   boolean bridge$shouldShowName();

   int bridge$getSpawnEggColor(int var1);

   String bridge$getType();

   boolean bridge$isGlowing();

   void bridge$setGlowing(boolean var1);

   void bridge$turn(float var1, float var2);

   void bridge$setGlowingColor(int var1);

   int bridge$getGlowingColor();

   default void bridge$decreaseEntityIdCounter() {
   }

   void bridge$setId(int var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   default void bridge$setNoPhysics(boolean var1) {
   }

   boolean bridge$shouldRenderAtSqrDistance(double var1);

   void bridge$sendPairingData(Consumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> var1);

   boolean bridge$isInWater();

   float bridge$maxUpStep();

   int bridge$getMaxFallDistance();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
   @OverridingMethodsMustInvokeSuper
   default int bridge$canTurbo() {
      if (this.bridge$isGlowing()) {
         return 1180;
      } else {
         return this.bridge$isOnFire() ? 100 : -1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
   default void bridge$stopTurbo(@Nullable CRHROHHHCIHHCOHCOORCRIHHIICROR var1) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   boolean bridge$isAlive();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getNbtAsComponent() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   boolean bridge$getNoCulling();

   boolean bridge$isInWaterOrBubble();

   boolean bridge$canBeCollidedWith();

   @Override
   default float bridge$ageInTicks() {
      return this.CCHHCROIOCRIIRICHRRIIHCHCOHHOI();
   }

   boolean bridge$isItemFrame();

   boolean bridge$isFirework();

   boolean bridge$isWitherSkull();

   boolean bridge$isSnowball();

   boolean bridge$isFireball();

   boolean bridge$isMonster();

   boolean bridge$isMob();

   boolean bridge$isLeashed();

   @Nullable
   CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getLeashedToEntity();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   @Nullable
   CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getVehicle();

   Optional<String> bridge$getTeamName();

   Optional<String> bridge$getBoatType();

   boolean bridge$isBoat();

   boolean bridge$isMinecart();

   default boolean bridge$isTextDisplay() {
      return false;
   }

   default Vector3d bridge$getPosition() {
      return new Vector3d(this.bridge$getPosX(), this.bridge$getPosY(), this.bridge$getPosZ());
   }

   default RORCHCIIICOHIRROOORHOCCCCIOCCI bridge$pick$v1_16(float var1, float var2, boolean var3) {
      return null;
   }

   Vector3d bridge$getLookAngle();

   boolean bridge$shouldRender(double var1, double var3, double var5);

   List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getPassengers();
}
