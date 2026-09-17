import java.util.Arrays;

public enum v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ {
   BatModClient(
      "keystrokes", oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns.class
   ),
   Button(
      "potion", kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO.class
   ),
   CustomSpinner(
      "spotify", ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq.class
   ),
   ButtonAction(
      "resource_pack", xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i.class
   ),
   Spinner("fps"),
   Checkbox("sprinting_status"),
   ProgressBar(
      "armor", TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ.class
   ),
   BatModProgressBar("ping"),
   ColorChooser("online_players"),
   IntegerSpinner("cps"),
   TextField(
      "coordinates", BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb.class
   ),
   ColorTextPane("time"),
   BatModInstallerMain("date"),
   aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("direction"),
   LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN("biome"),
   G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr("server_address"),
   iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF("memory_usage"),
   bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ("chunk_count");

   private String RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
   private Class Downloader;
   private boolean InstallationLogger;

   public static boolean BatModClient(String var0) {
      return Arrays.stream(values())
         .anyMatch(var1 -> var1.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.equalsIgnoreCase(var0));
   }

   v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ(String var3) {
      this(var3, null);
   }

   v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ(String var3, Class var4) {
      this(var3, var4, false);
   }

   v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ(String var3, Class var4, boolean var5) {
      this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = var3;
      this.Downloader = var4;
      this.InstallationLogger = var5;
   }

   public String BatModClient() {
      return this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
   }

   public Class Button() {
      return this.Downloader;
   }

   public boolean CustomSpinner() {
      return this.InstallationLogger;
   }
}
