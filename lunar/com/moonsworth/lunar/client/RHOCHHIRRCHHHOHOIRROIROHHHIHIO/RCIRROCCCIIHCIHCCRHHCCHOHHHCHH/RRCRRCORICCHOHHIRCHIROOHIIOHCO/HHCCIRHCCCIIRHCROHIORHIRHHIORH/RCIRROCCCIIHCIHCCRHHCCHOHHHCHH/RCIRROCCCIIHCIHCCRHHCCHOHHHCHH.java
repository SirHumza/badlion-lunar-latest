package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.List;
import org.joml.Vector3f;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.snapshot.BoneSnapshot;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IBone {
   public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IOHORIRHHROHCHIIOHRHRROCICIHHR = new ArrayList<>();
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOCHRCRIHOIHCIIOHRRORICICORIOO = new ArrayList<>();
   public String name;
   private BoneSnapshot CHOIRIIIHHCRIOCHOHCIRIRRRCIORR;
   public Double HHCHIIRORHOROICCICRRIRIROCCOIO;
   public boolean isHidden;
   private final Vector3f CICCCHORORCRCRHOOHIRCHRIRCIHCR = new Vector3f(1.0F, 1.0F, 1.0F);
   private final Vector3f RORHHRICRIOOCCCRHHOIORHORIROHO = new Vector3f();
   private final Vector3f IHHOHORHOHCICCIHCRCOOOROCHRHCC = new Vector3f();
   private final Vector3f OCHCHHCRRHHOHCIRCCIIRCORRICIHO = new Vector3f();
   public String RROCHCRHRHHORRHHHCHRIOOIOOIICO;
   public String HRRIHHHCOCRCCCIHRIIIHOICIIROOH;
   public String COIROIOIIOIIOIIHRIOROIHHCHRORH;
   public String IRCOOROOIHHOOHRHOHRHCOIRRRCHOH;
   public String CCIIHIHROCCHHCHORRRIRRRHOOCROO;
   public String HHOROCRCCHICHRCCHORICIROIHRHHR;
   public String COHHCHIORIROCOOHIHCCCCOHRRRCOH;
   public String IHIHIHHOHRHRHCROICHHHIIOIOORIR;
   public String HCRHOCRCRHHHRIRCIOHIRRORROROOH;

   public void setModelRendererName(String var1) {
      this.name = var1;
      this.RROCHCRHRHHORRHHHCHRIOOIOOIICO = "bone_" + this.name + "_pos_x";
      this.HRRIHHHCOCRCCCIHRIIIHOICIIROOH = "bone_" + this.name + "_pos_y";
      this.COIROIOIIOIIOIIHRIOROIHHCHRORH = "bone_" + this.name + "_pos_z";
      this.IRCOOROOIHHOOHRHOHRHCOIRRRCHOH = "bone_" + this.name + "_rot_x";
      this.CCIIHIHROCCHHCHORRRIRRRHOOCROO = "bone_" + this.name + "_rot_y";
      this.HHOROCRCCHICHRCCHORICIROIHRHHR = "bone_" + this.name + "_rot_z";
      this.COHHCHIORIROCOOHIHCCCCOHRRRCOH = "bone_" + this.name + "_scale_x";
      this.IHIHIHHOHRHRHCROICHHHIIOIOORIR = "bone_" + this.name + "_scale_y";
      this.HCRHOCRCRHHHRIRCIOHIRRORROROOH = "bone_" + this.name + "_scale_z";
   }

   public void saveInitialSnapshot() {
      if (this.CHOIRIIIHHCRIOCHOHCIRIRRRCIORR == null) {
         this.CHOIRIIIHHCRIOCHOHCIRIRRRCIORR = new BoneSnapshot(this, true);
      }
   }

   public BoneSnapshot getInitialSnapshot() {
      return this.CHOIRIIIHHCRIOCHOHCIRIRRRCIORR;
   }

   public String getName() {
      return this.name;
   }

   public float getRotationX() {
      return this.OCHCHHCRRHHOHCIRCCIIRCORRICIHO.x();
   }

   public float getRotationY() {
      return this.OCHCHHCRRHHOHCIRCCIIRCORRICIHO.y();
   }

   public float getRotationZ() {
      return this.OCHCHHCRRHHOHCIRCCIIRCORRICIHO.z();
   }

   public float getPositionX() {
      return this.RORHHRICRIOOCCCRHHOIORHORIROHO.x();
   }

   public float getPositionY() {
      return this.RORHHRICRIOOCCCRHHOIORHORIROHO.y();
   }

   public float getPositionZ() {
      return this.RORHHRICRIOOCCCRHHOIORHORIROHO.z();
   }

   public float getScaleX() {
      return this.CICCCHORORCRCRHOOHIRCHRIRCIHCR.x();
   }

   public float getScaleY() {
      return this.CICCCHORORCRCRHOOHIRCHRIRCIHCR.y();
   }

   public float getScaleZ() {
      return this.CICCCHORORCRCRHOOHIRCHRIRCIHCR.z();
   }

   public void setRotationX(float var1) {
      this.OCHCHHCRRHHOHCIRCCIIRCORRICIHO.x = var1;
   }

   public void setRotationY(float var1) {
      this.OCHCHHCRRHHOHCIRCCIIRCORRICIHO.y = var1;
   }

   public void setRotationZ(float var1) {
      this.OCHCHHCRRHHOHCIRCCIIRCORRICIHO.z = var1;
   }

   public void setPositionX(float var1) {
      this.RORHHRICRIOOCCCRHHOIORHORIROHO.x = var1;
   }

   public void setPositionY(float var1) {
      this.RORHHRICRIOOCCCRHHOIORHORIROHO.y = var1;
   }

   public void setPositionZ(float var1) {
      this.RORHHRICRIOOCCCRHHOIORHORIROHO.z = var1;
   }

   public void setScaleX(float var1) {
      this.CICCCHORORCRCRHOOHIRCHRIRCIHCR.x = var1;
   }

   public void setScaleY(float var1) {
      this.CICCCHORORCRCRHOOHIRCHRIRCIHCR.y = var1;
   }

   public void setScaleZ(float var1) {
      this.CICCCHORORCRCRHOOHIRCHRIRCIHCR.z = var1;
   }

   public boolean isHidden() {
      return this.isHidden;
   }

   public void setHidden(boolean var1) {
      this.isHidden = var1;
   }

   public void setPivotX(float var1) {
      this.IHHOHORHOHCICCIHCRCOOOROCHRHCC.x = var1;
   }

   public void setPivotY(float var1) {
      this.IHHOHORHOHCICCIHCRCOOOROCHRHCC.y = var1;
   }

   public void setPivotZ(float var1) {
      this.IHHOHORHOHCICCIHCRCOOOROCHRHCC.z = var1;
   }

   public float getPivotX() {
      return this.IHHOHORHOHCICCIHCRCOOOROCHRHCC.x;
   }

   public float getPivotY() {
      return this.IHHOHORHOHCICCIHCRCOOOROCHRHCC.y;
   }

   public float getPivotZ() {
      return this.IHHOHORHOHCICCIHCRCOOOROCHRHCC.z;
   }
}
