import com.google.common.collect.Maps;
import java.util.Map;

public enum chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj {
   BatModClient("master", 0),
   Button("music", 1),
   CustomSpinner("record", 2),
   ButtonAction("weather", 3),
   Spinner("block", 4),
   Checkbox("hostile", 5),
   ProgressBar("neutral", 6),
   BatModProgressBar("player", 7),
   ColorChooser("ambient", 8);

   private static final Map IntegerSpinner = Maps.newHashMap();
   private static final Map TextField = Maps.newHashMap();
   private final String ColorTextPane;
   private final int BatModInstallerMain;

   chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj(String var3, int var4) {
      this.ColorTextPane = var3;
      this.BatModInstallerMain = var4;
   }

   public String BatModClient() {
      return this.ColorTextPane;
   }

   public int Button() {
      return this.BatModInstallerMain;
   }

   public static chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj BatModClient(
      String var0
   ) {
      return (chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj)IntegerSpinner.get(
         var0
      );
   }

   static {
      for (chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj var3 : values()) {
         if (IntegerSpinner.containsKey(
               var3.BatModClient()
            )
            || TextField.containsKey(
               var3.Button()
            )) {
            throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + var3);
         }

         IntegerSpinner.put(
            var3.BatModClient(), var3
         );
         TextField.put(
            var3.Button(), var3
         );
      }
   }
}
