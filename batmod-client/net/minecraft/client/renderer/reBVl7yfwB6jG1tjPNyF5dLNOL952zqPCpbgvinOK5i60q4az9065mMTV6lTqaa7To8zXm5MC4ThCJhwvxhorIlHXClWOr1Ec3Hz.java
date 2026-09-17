package net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz {
   public static boolean BatModClient;
   public static boolean Button;
   public static int CustomSpinner;
   public static int ButtonAction;
   public static int Spinner;
   public static int Checkbox;
   public static int ProgressBar;
   public static int BatModProgressBar;
   public static int ColorChooser;
   public static int IntegerSpinner;
   public static int TextField;
   private static int mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv;
   public static boolean ColorTextPane;
   private static boolean xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02;
   private static boolean kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc;
   public static int BatModInstallerMain;
   public static int aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   public static int LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
   public static int G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
   private static boolean zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3;
   public static int iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
   public static int bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
   public static int RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
   private static boolean TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ;
   public static int Downloader;
   public static int InstallationLogger;
   public static int RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
   public static int K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY;
   public static int ExitCode;
   public static int BatModJson;
   public static int z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP;
   public static int LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
   public static int xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
   public static int o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
   public static int K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL;
   public static int sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr;
   public static int GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj;
   public static int OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF;
   public static int f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb;
   public static int fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee;
   public static int z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m;
   public static int N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl;
   public static int EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj;
   private static boolean kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP;
   public static boolean KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ;
   public static boolean WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o;
   public static boolean OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt;
   private static String FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = "";
   private static String sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf;
   public static boolean vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP;
   public static boolean ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu;
   private static boolean SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj;
   public static int ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV;
   public static int fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i;
   private static final String amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY = "CL_00001179";
   public static float dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = 0.0F;
   public static float GsonTypeAdapter = 0.0F;

   public static void BatModClient() {
      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner();
      ContextCapabilities var0 = GLContext.getCapabilities();
      zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 = var0.GL_ARB_multitexture && !var0.OpenGL13;
      TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ = var0.GL_ARB_texture_env_combine && !var0.OpenGL13;
      if (zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3) {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "Using ARB_multitexture.\n";
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = 33984;
         bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = 33985;
         RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = 33986;
      } else {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "Using GL 1.3 multitexturing.\n";
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = 33984;
         bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = 33985;
         RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = 33986;
      }

      if (TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ) {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "Using ARB_texture_env_combine.\n";
         Downloader = 34160;
         InstallationLogger = 34165;
         RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = 34167;
         K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = 34166;
         ExitCode = 34168;
         BatModJson = 34161;
         z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = 34176;
         LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = 34177;
         xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = 34178;
         o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = 34192;
         K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = 34193;
         sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = 34194;
         GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = 34162;
         OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = 34184;
         f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = 34185;
         fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = 34186;
         z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = 34200;
         N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = 34201;
         EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = 34202;
      } else {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "Using GL 1.3 texture combiners.\n";
         Downloader = 34160;
         InstallationLogger = 34165;
         RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = 34167;
         K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = 34166;
         ExitCode = 34168;
         BatModJson = 34161;
         z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = 34176;
         LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = 34177;
         xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = 34178;
         o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = 34192;
         K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = 34193;
         sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = 34194;
         GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = 34162;
         OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = 34184;
         f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = 34185;
         fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = 34186;
         z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = 34200;
         N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = 34201;
         EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = 34202;
      }

      KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = var0.GL_EXT_blend_func_separate && !var0.OpenGL14;
      kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP = var0.OpenGL14 || var0.GL_EXT_blend_func_separate;
      ColorTextPane = kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP
         && (var0.GL_ARB_framebuffer_object || var0.GL_EXT_framebuffer_object || var0.OpenGL30);
      if (ColorTextPane) {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "Using framebuffer objects because ";
         if (var0.OpenGL30) {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "OpenGL 3.0 is supported and separate blending is supported.\n";
            mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = 0;
            CustomSpinner = 36160;
            ButtonAction = 36161;
            Spinner = 36064;
            Checkbox = 36096;
            ProgressBar = 36053;
            BatModProgressBar = 36054;
            ColorChooser = 36055;
            IntegerSpinner = 36059;
            TextField = 36060;
         } else if (var0.GL_ARB_framebuffer_object) {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "ARB_framebuffer_object is supported and separate blending is supported.\n";
            mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = 1;
            CustomSpinner = 36160;
            ButtonAction = 36161;
            Spinner = 36064;
            Checkbox = 36096;
            ProgressBar = 36053;
            ColorChooser = 36055;
            BatModProgressBar = 36054;
            IntegerSpinner = 36059;
            TextField = 36060;
         } else if (var0.GL_EXT_framebuffer_object) {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "EXT_framebuffer_object is supported.\n";
            mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = 2;
            CustomSpinner = 36160;
            ButtonAction = 36161;
            Spinner = 36064;
            Checkbox = 36096;
            ProgressBar = 36053;
            ColorChooser = 36055;
            BatModProgressBar = 36054;
            IntegerSpinner = 36059;
            TextField = 36060;
         }
      } else {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "Not using framebuffer objects because ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "OpenGL 1.4 is "
            + (var0.OpenGL14 ? "" : "not ")
            + "supported, ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "EXT_blend_func_separate is "
            + (var0.GL_EXT_blend_func_separate ? "" : "not ")
            + "supported, ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "OpenGL 3.0 is "
            + (var0.OpenGL30 ? "" : "not ")
            + "supported, ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "ARB_framebuffer_object is "
            + (var0.GL_ARB_framebuffer_object ? "" : "not ")
            + "supported, and ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "EXT_framebuffer_object is "
            + (var0.GL_EXT_framebuffer_object ? "" : "not ")
            + "supported.\n";
      }

      WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = var0.OpenGL21;
      xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 = WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
         || var0.GL_ARB_vertex_shader && var0.GL_ARB_fragment_shader && var0.GL_ARB_shader_objects;
      FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
         + "Shaders are "
         + (xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 ? "" : "not ")
         + "available because ";
      if (xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02) {
         if (var0.OpenGL21) {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "OpenGL 2.1 is supported.\n";
            kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc = false;
            BatModInstallerMain = 35714;
            aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = 35713;
            LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = 35633;
            G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = 35632;
         } else {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
            kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc = true;
            BatModInstallerMain = 35714;
            aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = 35713;
            LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = 35633;
            G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = 35632;
         }
      } else {
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "OpenGL 2.1 is "
            + (var0.OpenGL21 ? "" : "not ")
            + "supported, ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "ARB_shader_objects is "
            + (var0.GL_ARB_shader_objects ? "" : "not ")
            + "supported, ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "ARB_vertex_shader is "
            + (var0.GL_ARB_vertex_shader ? "" : "not ")
            + "supported, and ";
         FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
            + "ARB_fragment_shader is "
            + (var0.GL_ARB_fragment_shader ? "" : "not ")
            + "supported.\n";
      }

      OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = ColorTextPane
         && xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02;
      String var1 = GL11.glGetString(7936).toLowerCase();
      BatModClient = var1.contains("nvidia");
      SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj = !var0.OpenGL15 && var0.GL_ARB_vertex_buffer_object;
      vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = var0.OpenGL15
         || SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj;
      FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
         + "VBOs are "
         + (vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP ? "" : "not ")
         + "available because ";
      if (vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP) {
         if (SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj) {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "ARB_vertex_buffer_object is supported.\n";
            fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = 35044;
            ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV = 34962;
         } else {
            FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               + "OpenGL 1.5 is supported.\n";
            fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = 35044;
            ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV = 34962;
         }
      }

      Button = var1.contains("ati");
      if (Button) {
         if (vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP) {
            ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = true;
         } else {
            kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Checkbox
               .BatModClient(16.0F);
         }
      }

      try {
         Processor[] var2 = new SystemInfo().getHardware().getProcessors();
         sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf = String.format("%dx %s", var2.length, var2[0])
            .replaceAll("\\s+", " ");
      } catch (Throwable var3) {
      }
   }

   public static boolean Button() {
      return OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt;
   }

   public static String CustomSpinner() {
      return FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV;
   }

   public static int BatModClient(int var0, int var1) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glGetObjectParameteriARB(var0, var1)
         : GL20.glGetProgrami(var0, var1);
   }

   public static void Button(int var0, int var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glAttachObjectARB(var0, var1);
      } else {
         GL20.glAttachShader(var0, var1);
      }
   }

   public static void BatModClient(int var0) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glDeleteObjectARB(var0);
      } else {
         GL20.glDeleteShader(var0);
      }
   }

   public static int Button(int var0) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glCreateShaderObjectARB(var0)
         : GL20.glCreateShader(var0);
   }

   public static void BatModClient(int var0, ByteBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glShaderSourceARB(var0, var1);
      } else {
         GL20.glShaderSource(var0, var1);
      }
   }

   public static void CustomSpinner(int var0) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glCompileShaderARB(var0);
      } else {
         GL20.glCompileShader(var0);
      }
   }

   public static int CustomSpinner(int var0, int var1) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glGetObjectParameteriARB(var0, var1)
         : GL20.glGetShaderi(var0, var1);
   }

   public static String ButtonAction(int var0, int var1) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glGetInfoLogARB(var0, var1)
         : GL20.glGetShaderInfoLog(var0, var1);
   }

   public static String Spinner(int var0, int var1) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glGetInfoLogARB(var0, var1)
         : GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void ButtonAction(int var0) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUseProgramObjectARB(var0);
      } else {
         GL20.glUseProgram(var0);
      }
   }

   public static int ButtonAction() {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glCreateProgramObjectARB()
         : GL20.glCreateProgram();
   }

   public static void Spinner(int var0) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glDeleteObjectARB(var0);
      } else {
         GL20.glDeleteProgram(var0);
      }
   }

   public static void Checkbox(int var0) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glLinkProgramARB(var0);
      } else {
         GL20.glLinkProgram(var0);
      }
   }

   public static int BatModClient(int var0, CharSequence var1) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBShaderObjects.glGetUniformLocationARB(var0, var1)
         : GL20.glGetUniformLocation(var0, var1);
   }

   public static void BatModClient(int var0, IntBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform1ARB(var0, var1);
      } else {
         GL20.glUniform1(var0, var1);
      }
   }

   public static void Checkbox(int var0, int var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform1iARB(var0, var1);
      } else {
         GL20.glUniform1i(var0, var1);
      }
   }

   public static void BatModClient(int var0, FloatBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform1ARB(var0, var1);
      } else {
         GL20.glUniform1(var0, var1);
      }
   }

   public static void Button(int var0, IntBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform2ARB(var0, var1);
      } else {
         GL20.glUniform2(var0, var1);
      }
   }

   public static void Button(int var0, FloatBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform2ARB(var0, var1);
      } else {
         GL20.glUniform2(var0, var1);
      }
   }

   public static void CustomSpinner(int var0, IntBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform3ARB(var0, var1);
      } else {
         GL20.glUniform3(var0, var1);
      }
   }

   public static void CustomSpinner(int var0, FloatBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform3ARB(var0, var1);
      } else {
         GL20.glUniform3(var0, var1);
      }
   }

   public static void ButtonAction(int var0, IntBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform4ARB(var0, var1);
      } else {
         GL20.glUniform4(var0, var1);
      }
   }

   public static void ButtonAction(int var0, FloatBuffer var1) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniform4ARB(var0, var1);
      } else {
         GL20.glUniform4(var0, var1);
      }
   }

   public static void BatModClient(
      int var0, boolean var1, FloatBuffer var2
   ) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniformMatrix2ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix2(var0, var1, var2);
      }
   }

   public static void Button(
      int var0, boolean var1, FloatBuffer var2
   ) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniformMatrix3ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix3(var0, var1, var2);
      }
   }

   public static void CustomSpinner(
      int var0, boolean var1, FloatBuffer var2
   ) {
      if (kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc) {
         ARBShaderObjects.glUniformMatrix4ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix4(var0, var1, var2);
      }
   }

   public static int Button(int var0, CharSequence var1) {
      return kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? ARBVertexShader.glGetAttribLocationARB(var0, var1)
         : GL20.glGetAttribLocation(var0, var1);
   }

   public static int Spinner() {
      return SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj
         ? ARBVertexBufferObject.glGenBuffersARB()
         : GL15.glGenBuffers();
   }

   public static void ProgressBar(int var0, int var1) {
      if (SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj) {
         ARBVertexBufferObject.glBindBufferARB(var0, var1);
      } else {
         GL15.glBindBuffer(var0, var1);
      }
   }

   public static void BatModClient(int var0, ByteBuffer var1, int var2) {
      if (SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj) {
         ARBVertexBufferObject.glBufferDataARB(var0, var1, var2);
      } else {
         GL15.glBufferData(var0, var1, var2);
      }
   }

   public static void ProgressBar(int var0) {
      if (SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj) {
         ARBVertexBufferObject.glDeleteBuffersARB(var0);
      } else {
         GL15.glDeleteBuffers(var0);
      }
   }

   public static boolean Checkbox() {
      return xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n()
         ? false
         : vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP
            && AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .InstallationLogger
               .InstallationLogger;
   }

   public static void BatModProgressBar(int var0, int var1) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glBindFramebuffer(var0, var1);
               break;
            case 1:
               ARBFramebufferObject.glBindFramebuffer(var0, var1);
               break;
            case 2:
               EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
         }
      }
   }

   public static void ColorChooser(int var0, int var1) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glBindRenderbuffer(var0, var1);
               break;
            case 1:
               ARBFramebufferObject.glBindRenderbuffer(var0, var1);
               break;
            case 2:
               EXTFramebufferObject.glBindRenderbufferEXT(var0, var1);
         }
      }
   }

   public static void BatModProgressBar(int var0) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glDeleteRenderbuffers(var0);
               break;
            case 1:
               ARBFramebufferObject.glDeleteRenderbuffers(var0);
               break;
            case 2:
               EXTFramebufferObject.glDeleteRenderbuffersEXT(var0);
         }
      }
   }

   public static void ColorChooser(int var0) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glDeleteFramebuffers(var0);
               break;
            case 1:
               ARBFramebufferObject.glDeleteFramebuffers(var0);
               break;
            case 2:
               EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
         }
      }
   }

   public static int ProgressBar() {
      if (!ColorTextPane) {
         return -1;
      }

      switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
         case 0:
            return GL30.glGenFramebuffers();
         case 1:
            return ARBFramebufferObject.glGenFramebuffers();
         case 2:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
      }
   }

   public static int BatModProgressBar() {
      if (!ColorTextPane) {
         return -1;
      }

      switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
         case 0:
            return GL30.glGenRenderbuffers();
         case 1:
            return ARBFramebufferObject.glGenRenderbuffers();
         case 2:
            return EXTFramebufferObject.glGenRenderbuffersEXT();
         default:
            return -1;
      }
   }

   public static void BatModClient(
      int var0, int var1, int var2, int var3
   ) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glRenderbufferStorage(var0, var1, var2, var3);
               break;
            case 1:
               ARBFramebufferObject.glRenderbufferStorage(var0, var1, var2, var3);
               break;
            case 2:
               EXTFramebufferObject.glRenderbufferStorageEXT(var0, var1, var2, var3);
         }
      }
   }

   public static void Button(
      int var0, int var1, int var2, int var3
   ) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glFramebufferRenderbuffer(var0, var1, var2, var3);
               break;
            case 1:
               ARBFramebufferObject.glFramebufferRenderbuffer(var0, var1, var2, var3);
               break;
            case 2:
               EXTFramebufferObject.glFramebufferRenderbufferEXT(var0, var1, var2, var3);
         }
      }
   }

   public static int IntegerSpinner(int var0) {
      if (!ColorTextPane) {
         return -1;
      }

      switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
         case 0:
            return GL30.glCheckFramebufferStatus(var0);
         case 1:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case 2:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
      }
   }

   public static void BatModClient(
      int var0, int var1, int var2, int var3, int var4
   ) {
      if (ColorTextPane) {
         switch (mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv) {
            case 0:
               GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
               break;
            case 1:
               ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
               break;
            case 2:
               EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
         }
      }
   }

   public static void TextField(int var0) {
      if (zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3) {
         ARBMultitexture.glActiveTextureARB(var0);
      } else {
         GL13.glActiveTexture(var0);
      }
   }

   public static void ColorTextPane(int var0) {
      if (zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3) {
         ARBMultitexture.glClientActiveTextureARB(var0);
      } else {
         GL13.glClientActiveTexture(var0);
      }
   }

   public static void BatModClient(int var0, float var1, float var2) {
      if (zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3) {
         ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
      } else {
         GL13.glMultiTexCoord2f(var0, var1, var2);
      }

      if (var0 == bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ) {
         dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = var1;
         GsonTypeAdapter = var2;
      }
   }

   public static void CustomSpinner(
      int var0, int var1, int var2, int var3
   ) {
      if (kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP) {
         if (KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ) {
            EXTBlendFuncSeparate.glBlendFuncSeparateEXT(var0, var1, var2, var3);
         } else {
            GL14.glBlendFuncSeparate(var0, var1, var2, var3);
         }
      } else {
         GL11.glBlendFunc(var0, var1);
      }
   }

   public static boolean ColorChooser() {
      return xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu()
         ? false
         : (
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2()
               ? false
               : ColorTextPane
                  && AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                     .InstallationLogger
                     .Checkbox
         );
   }

   public static String IntegerSpinner() {
      return sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf == null
         ? "<unknown>"
         : sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf;
   }
}
