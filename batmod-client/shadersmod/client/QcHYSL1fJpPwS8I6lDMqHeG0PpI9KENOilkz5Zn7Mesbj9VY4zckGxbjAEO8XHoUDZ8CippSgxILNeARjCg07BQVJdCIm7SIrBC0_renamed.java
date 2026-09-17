package shadersmod.client;

public enum Checkbox {
   BatModClient(
      "of.options.shaders.ANTIALIASING", "antialiasingLevel", "0"
   ),
   Button(
      "of.options.shaders.NORMAL_MAP", "normalMapEnabled", "true"
   ),
   CustomSpinner(
      "of.options.shaders.SPECULAR_MAP", "specularMapEnabled", "true"
   ),
   ButtonAction(
      "of.options.shaders.RENDER_RES_MUL", "renderResMul", "1.0"
   ),
   Spinner(
      "of.options.shaders.SHADOW_RES_MUL", "shadowResMul", "1.0"
   ),
   Checkbox(
      "of.options.shaders.HAND_DEPTH_MUL", "handDepthMul", "0.125"
   ),
   ProgressBar(
      "of.options.shaders.CLOUD_SHADOW", "cloudShadow", "true"
   ),
   BatModProgressBar(
      "of.options.shaders.OLD_HAND_LIGHT", "oldHandLight", "default"
   ),
   ColorChooser(
      "of.options.shaders.OLD_LIGHTING", "oldLighting", "default"
   ),
   IntegerSpinner("of.options.shaders.SHADER_PACK", "shaderPack", ""),
   TextField(
      "of.options.shaders.TWEAK_BLOCK_DAMAGE", "tweakBlockDamage", "false"
   ),
   ColorTextPane(
      "of.options.shaders.SHADOW_CLIP_FRUSTRUM", "shadowClipFrustrum", "true"
   ),
   BatModInstallerMain("of.options.shaders.TEX_MIN_FIL_B", "TexMinFilB", "0"),
   aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("of.options.shaders.TEX_MIN_FIL_N", "TexMinFilN", "0"),
   LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN("of.options.shaders.TEX_MIN_FIL_S", "TexMinFilS", "0"),
   G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr("of.options.shaders.TEX_MAG_FIL_B", "TexMagFilB", "0"),
   iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF("of.options.shaders.TEX_MAG_FIL_N", "TexMagFilN", "0"),
   bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ("of.options.shaders.TEX_MAG_FIL_S", "TexMagFilS", "0");

   private String RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = null;
   private String Downloader = null;
   private String InstallationLogger = null;

   Checkbox(String var3, String var4, String var5) {
      this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = var3;
      this.Downloader = var4;
      this.InstallationLogger = var5;
   }

   public String BatModClient() {
      return this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
   }

   public String Button() {
      return this.Downloader;
   }

   public String CustomSpinner() {
      return this.InstallationLogger;
   }
}
