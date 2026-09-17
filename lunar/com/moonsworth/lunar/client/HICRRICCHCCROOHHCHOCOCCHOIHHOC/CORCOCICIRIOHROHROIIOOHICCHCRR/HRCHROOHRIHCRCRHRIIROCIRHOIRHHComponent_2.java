package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Objects;
import lombok.Generated;
import org.apache.commons.io.FilenameUtils;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final String OCHCCHOIOIIIIIHICRICOOROIRRRRI;
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO IHHCRIRCCRORCICCHCRCICCIRHCCRO;
   private String name;
   private final String ORIRRIOORRRIORRCIOHOROCHRICOIR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2, String var3) {
      this.OCHCCHOIOIIIIIHICRICOOROIRRRRI = var1;
      this.IHHCRIRCCRORCICCHCRCICCIRHCCRO = var2;
      this.name = var3;
      this.ORIRRIOORRRIORRCIOHOROCHRICOIR = FilenameUtils.getBaseName(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
         return Objects.equals(this.ORIRRIOORRRIORRCIOHOROCHRICOIR, var2.getHash());
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.ORIRRIOORRRIORRCIOHOROCHRICOIR);
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("url", this.OCHCCHOIOIIIIIHICRICOOROIRRRRI);
      var1.addProperty("skinType", this.IHHCRIRCCRORCICCHCRCICCIRHCCRO.getName());
      var1.addProperty("name", this.name);
      var1.addProperty("hash", this.ORIRRIOORRRIORRCIOHOROCHRICOIR);
      var1.addProperty(
         "favoriteIndex",
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROOIRICIRHIHHIIIRCIOHHHIOHIC().HHRCCCHRCHIROHHOCCCOCIRROHIIOC().indexOf(this)
      );
      return var1;
   }

   @Generated
   public String getUrl() {
      return this.OCHCCHOIOIIIIIHICRICOOROIRRRRI;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO IRIIRHOOOCCHRORRIRIHIHHOORRCOC() {
      return this.IHHCRIRCCRORCICCHCRCICCIRHCCRO;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String getHash() {
      return this.ORIRRIOORRRIORRCIOHOROCHRICOIR;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.IHHCRIRCCRORCICCHCRCICCIRHCCRO = var1;
   }

   @Generated
   public void setName(String var1) {
      this.name = var1;
   }
}
