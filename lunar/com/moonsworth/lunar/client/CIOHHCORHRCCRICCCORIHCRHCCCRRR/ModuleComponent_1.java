package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.cadixdev.lorenz.MappingSet;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   extends com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   static final String RHOCOHCIICRCCIHOOHCIRORIRCOHIO = "com/moonsworth/";
   private static final String HCOIOORHHOHHIIIIHCHRCICRIHOIHH = Type.getInternalName(IICCOOCHCHROORHHIIHROHCCRHRCOR.class);
   private static final String IRHCOCCOIIICIRHRRCHCIHIICCICRC = "hasModule";
   private static final String ICICCICHHIOCIRRHOCCCCIOCRIROHO = "MC_VERSION";
   private final com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CROHCIOOCROIHCOHHRIIIIOCRHOOHC;
   private final String OICCHOORHIHHICHIOOROHHIRHICIRO;
   private final List<String> HOHOICRHCHRRIRIROCIRHRRIOROCRH;

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      @Nullable MappingSet var2,
      @Nullable MappingSet var3,
      @Nullable String var4,
      List<String> var5
   ) {
      super(var2, var3, var1.getOrdinal());
      this.CROHCIOOCROIHCOHHRIIIIOCRHOOHC = var1;
      this.OICCHOORHIHHICHIOOROHHIRHICIRO = Objects.requireNonNullElse(var4, "com/moonsworth/");
      this.HOHOICRHCHRRIRIROCIRHRRIOROCRH = var5;
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OMNIMIXIN_PROCESSING
      };
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this.HIIHICICHRHRCOOCRRCIOIHIIOIIOH(var1.className());
   }

   public boolean HIIHICICHRHRCOOCRRCIOIHIIOIIOH(String var1) {
      if (var1.startsWith("com/moonsworth/lunar/client")) {
         return false;
      }

      for (String var3 : this.HOHOICRHCHRRIRIROCIRHRRIOROCRH) {
         if (var1.startsWith(var3)) {
            return false;
         }
      }

      return this.OICCHOORHIHHICHIOOROHHIRHICIRO == null || var1.startsWith(this.OICCHOORHIHHICHIOOROHHIRHICIRO);
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(AnnotationNode var1) {
      return com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, this.CROHCIOOCROIHCOHHRIIIIOCRHOOHC
      );
   }

   protected boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FieldInsnNode var1) {
      return var1.getOpcode() == 178 && var1.owner.equals(HCOIOORHHOHHIIIIHCHRCICRIHOIHH) && var1.name.equals("MC_VERSION");
   }

   protected boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(MethodInsnNode var1) {
      return var1.getOpcode() == 184
         && var1.owner.equals(HCOIOORHHOHHIIIIHCHRCICRIHOIHH)
         && var1.name.equals("hasModule")
         && var1.desc.equals("(Ljava/lang/String;)Z");
   }
}
