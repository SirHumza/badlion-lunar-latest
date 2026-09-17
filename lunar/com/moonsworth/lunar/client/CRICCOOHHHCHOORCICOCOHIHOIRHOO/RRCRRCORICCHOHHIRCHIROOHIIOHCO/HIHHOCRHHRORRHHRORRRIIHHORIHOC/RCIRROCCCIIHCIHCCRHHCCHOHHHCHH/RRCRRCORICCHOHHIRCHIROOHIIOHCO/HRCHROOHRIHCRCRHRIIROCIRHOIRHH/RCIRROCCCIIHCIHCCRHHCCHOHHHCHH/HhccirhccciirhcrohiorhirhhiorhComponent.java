package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.apache.commons.io.FileUtils;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final String HOOCHRIRHOICROOOIICOIOOCIICIOO = "https://rewind.lunarclientcdn.com/music/";
   private boolean OIHRHHIIROCRCOOICHCIIRHOIIHHRI = false;
   private final File ROIRROOOHORHOHRCCORCCIIOCICIHR = IIRHCHHOICHRICOOCRORCCIOOIHOIR.CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO
      .resolve("rewind")
      .resolve("music")
      .toFile();
   private final List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCHCCHROCRHOHCCIHCIOIOHIIROOOR = List.of(
      new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Constellation Convos @omarcameup.opus", "ae1c86c5", "sparkling"),
      new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Cutesy Bossanova @omarcameup.opus", "6472f72e", "palm-tree"),
      new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Speed @omarcameup.opus", "3568e4a8", "sunglasses"),
      new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Triumph @omarcameup.opus", "cfdc273f", "sword"),
      new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Wowie Zowie! @omarcameup.opus", "cd1ae311", "tada")
   );
   private final Set<String> RHIRIHORROICOROHOCRIHHRHRIICIR = this.RCHCCHROCRHOHCCIHCIOIOHIIROOOR
      .stream()
      .map(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::name)
      .collect(Collectors.toSet());

   public void CCCOHCHHOCROOHORRHHRRHCCRHICOR() {
      if (!this.OIHRHHIIROCRCOOICHCIIRHOIIHHRI) {
         this.OIHRHHIIROCRCOOICHCIIRHOIIHHRI = true;

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.RCHCCHROCRHOHCCIHCIOIOHIIROOOR) {
            File var3 = new File(this.ROIRROOOHORHOHRCCORCCIIOCICIHR, var2.name());
            if (var3.exists()) {
               String var4 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
                  var3.toPath()
               );
               if (var4.equals(var2.OCCIHHOCHIROIORRHOOHOOOROHHRHO())) {
                  continue;
               }
            }

            ORCOCORROHIROCCIORORRRRCHIOOCH.RHOHHCCOOIHIIRCORRRIORCRIIOHHI()
               .execute(
                  () -> {
                     try {
                        FileUtils.copyURLToFile(new URL("https://rewind.lunarclientcdn.com/music/" + var2.name()), var3, 10000, 10000);
                     } catch (IOException var3x) {
                        HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x, "Rewind Music");
                     }

                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIHIIRRIORCHRRHHCCHICOOCIIRHHI();
                  }
               );
         }
      }
   }

   public boolean IRIHHHOROHICICOCIOOIHHRRRCOHIO() {
      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.RCHCCHROCRHOHCCIHCIOIOHIIROOOR) {
         File var3 = new File(this.ROIRROOOHORHOHRCCORCCIIOCICIHR, var2.name());
         if (!var3.exists()
            || !com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
                  var3.toPath()
               )
               .equals(var2.OCCIHHOCHIROIORRHOOHOOOROHHRHO())) {
            return false;
         }
      }

      return true;
   }

   @Generated
   public File IICHCHRCOCCCICCIIHIHRROOOOOIRH() {
      return this.ROIRROOOHORHOHRCCORCCIIOCICIHR;
   }

   @Generated
   public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OIROCRCCRRRIHIROOROHHRCIOHRCCR() {
      return this.RCHCCHROCRHOHCCIHCIOIOHIIROOOR;
   }

   @Generated
   public Set<String> CIHRIRCOIROOCHCCRHOIHHIICRIRRC() {
      return this.RHIRIHORROICOROHOCRIHHRHRIICIR;
   }
}
