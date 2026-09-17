import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nzxNUl5fIZNnOGAQQfTu6s8WQmtIQTpjoTqq6Q6VSS75dM355jQpELlaiotDEsI2S54J0DUiXf5qpkaJEHkptZdt0hkTHiGEE0M {
   private static final Set Button = Sets.newHashSet(
      new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD[]{
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/water_flow"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/water_still"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/lava_flow"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/lava_still"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_0"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_1"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_2"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_3"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_4"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_5"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_6"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_7"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_8"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("blocks/destroy_stage_9"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_helmet"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_chestplate"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_leggings"),
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("items/empty_armor_slot_boots")
      }
   );
   private static final Logger CustomSpinner = LogManager.getLogger();
   protected static final dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI BatModClient = new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(
      "builtin/missing", "missing"
   );
   private static final Map ButtonAction = Maps.newHashMap();
   private static final Joiner Spinner = Joiner.on(" -> ");
   private final nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 Checkbox;
   private final Map ProgressBar = Maps.newHashMap();
   private final Map BatModProgressBar = Maps.newLinkedHashMap();
   private final Map ColorChooser = Maps.newLinkedHashMap();
   private final seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs IntegerSpinner;
   private final net.minecraft.client.renderer.ColorChooser TextField;
   private final rUj2pIufbwUN7G0b1guaQ9NFaOBlO2vI9BkgLMPtzKEF8H0OTLCvddOEHlWxRhto93PUjvgR1IN7iryQGQXgnc6nndMxjzYy0nEJ ColorTextPane = new rUj2pIufbwUN7G0b1guaQ9NFaOBlO2vI9BkgLMPtzKEF8H0OTLCvddOEHlWxRhto93PUjvgR1IN7iryQGQXgnc6nndMxjzYy0nEJ();
   private final LQyxdTfpxsy50G5YZRcbFZXUOP4CtFST3Jj0kedQtLCgeGPnOwlQYDXMz468iXU68yglK0h219WdznbpBbwNzDWWmCRawQLqcKtw BatModInstallerMain = new LQyxdTfpxsy50G5YZRcbFZXUOP4CtFST3Jj0kedQtLCgeGPnOwlQYDXMz468iXU68yglK0h219WdznbpBbwNzDWWmCRawQLqcKtw();
   private kIEmAXkGWrKa6WgAaD9RdUxNmBgFErVhqQxlhumSQcw69apmdFXdlXgb4cDsQ09Z872QbEqnhZQ8kH3N4EizIv89IiQWvxa1HJm3 aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = new kIEmAXkGWrKa6WgAaD9RdUxNmBgFErVhqQxlhumSQcw69apmdFXdlXgb4cDsQ09Z872QbEqnhZQ8kH3N4EizIv89IiQWvxa1HJm3();
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.BatModClient(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.BatModClient(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.BatModClient(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private static final arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.BatModClient(
      "{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}"
   );
   private Map RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = Maps.newLinkedHashMap();
   private final Map Downloader = Maps.newHashMap();
   private Map InstallationLogger = Maps.newIdentityHashMap();

   public nzxNUl5fIZNnOGAQQfTu6s8WQmtIQTpjoTqq6Q6VSS75dM355jQpELlaiotDEsI2S54J0DUiXf5qpkaJEHkptZdt0hkTHiGEE0M(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var1,
      seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs var2,
      net.minecraft.client.renderer.ColorChooser var3
   ) {
      this.Checkbox = var1;
      this.IntegerSpinner = var2;
      this.TextField = var3;
   }

   public MIhWEF0Lmu8kDXveHvHNGS6xXNmLbQ5tjSM7NVwSiEnKHSAiP2xxi3lLXjXjqCrcMwicGQBy2oEg2vFgNCvcmVnOAd8JCgS95Gj BatModClient() {
      this.Button();
      this.BatModProgressBar();
      this.IntegerSpinner();
      this.ColorTextPane();
      this.Checkbox();
      return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   }

   private void Button() {
      this.BatModClient(
         this.TextField
            .BatModClient()
            .BatModClient()
            .values()
      );
      this.ColorChooser
         .put(
            BatModClient,
            new L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2(
               BatModClient.BatModClient(),
               Lists.newArrayList(
                  new lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA[]{
                     new lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA(
                        new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                           BatModClient.Button()
                        ),
                        AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi.BatModClient,
                        false,
                        1
                     )
                  }
               )
            )
         );
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "item_frame"
      );
      NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var2 = this.BatModClient(
         var1
      );
      this.BatModClient(
         var2, new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(var1, "normal")
      );
      this.BatModClient(
         var2, new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(var1, "map")
      );
      this.CustomSpinner();
      this.ButtonAction();
   }

   private void BatModClient(Collection var1) {
      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var3 : var1) {
         try {
            NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var4 = this.BatModClient(
               var3
            );

            try {
               this.BatModClient(var4, var3);
            } catch (Exception var6) {
               CustomSpinner.warn(
                  "Unable to load variant: "
                     + var3.BatModClient()
                     + " from "
                     + var3
               );
            }
         } catch (Exception var7) {
            CustomSpinner.warn("Unable to load definition " + var3, var7);
         }
      }
   }

   private void BatModClient(
      NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var1,
      dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var2
   ) {
      this.ColorChooser
         .put(
            var2,
            var1.BatModClient(
               var2.BatModClient()
            )
         );
   }

   private NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 BatModClient(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 = this.Button(
         var1
      );
      NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var3 = (NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0)this.Downloader
         .get(var2);
      if (var3 == null) {
         ArrayList var4 = Lists.newArrayList();

         try {
            for (DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m var6 : this.Checkbox
               .Button(var2)) {
               InputStream var7 = null;

               try {
                  var7 = var6.Button();
                  NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 var8 = NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0.BatModClient(
                     new InputStreamReader(var7, Charsets.UTF_8)
                  );
                  var4.add(var8);
               } catch (Exception var13) {
                  throw new RuntimeException(
                     "Encountered an exception when loading model definition of '"
                        + var1
                        + "' from: '"
                        + var6.BatModClient()
                        + "' in resourcepack: '"
                        + var6.ButtonAction()
                        + "'",
                     var13
                  );
               } finally {
                  IOUtils.closeQuietly(var7);
               }
            }
         } catch (IOException var15) {
            throw new RuntimeException("Encountered an exception when loading model definition of model " + var2.toString(), var15);
         }

         var3 = new NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0(var4);
         this.Downloader.put(var2, var3);
      }

      return var3;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD Button(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var1.CustomSpinner(),
         "blockstates/" + var1.Button() + ".json"
      );
   }

   private void CustomSpinner() {
      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var2 : this.ColorChooser
         .keySet()) {
         for (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var4 : ((L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)this.ColorChooser
               .get(var2))
            .BatModClient()) {
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = var4.BatModClient();
            if (this.BatModProgressBar.get(var5) == null) {
               try {
                  arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var6 = this.CustomSpinner(
                     var5
                  );
                  this.BatModProgressBar.put(var5, var6);
               } catch (Exception var7) {
                  CustomSpinner.warn(
                     "Unable to load block model: '" + var5 + "' for variant: '" + var2 + "'", var7
                  );
               }
            }
         }
      }
   }

   private arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir CustomSpinner(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      String var2 = var1.Button();
      if ("builtin/generated".equals(var2)) {
         return LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
      }

      if ("builtin/compass".equals(var2)) {
         return G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
      }

      if ("builtin/clock".equals(var2)) {
         return iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
      }

      if ("builtin/entity".equals(var2)) {
         return bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
      }

      Reader var3;
      if (var2.startsWith("builtin/")) {
         String var4 = var2.substring("builtin/".length());
         String var5 = (String)ButtonAction.get(var4);
         if (var5 == null) {
            throw new FileNotFoundException(var1.toString());
         }

         var3 = new StringReader(var5);
      } else {
         DSvwIKwrrGZ1BkBmKtrbfLE5EhjZsDw2g3BdecJEn9Ycnl7Em5YdmiYZ9kKzSqppkDW8RicbwBMVSDYtXdf0ODWZzkJjJivCWz7m var9 = this.Checkbox
            .BatModClient(
               this.ButtonAction(var1)
            );
         var3 = new InputStreamReader(
            var9.Button(), Charsets.UTF_8
         );
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var10;
      try {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var11 = arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.BatModClient(
            var3
         );
         var11.Button = var1.toString();
         var10 = var11;
      } finally {
         var3.close();
      }

      return var10;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD ButtonAction(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var1.CustomSpinner(),
         "models/" + var1.Button() + ".json"
      );
   }

   private void ButtonAction() {
      this.Spinner();

      for (q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 var2 : q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient) {
         for (String var4 : this.BatModClient(var2)) {
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = this.BatModClient(
               var4
            );
            this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.put(var4, var5);
            if (this.BatModProgressBar.get(var5) == null) {
               try {
                  arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var6 = this.CustomSpinner(
                     var5
                  );
                  this.BatModProgressBar.put(var5, var6);
               } catch (Exception var7) {
                  CustomSpinner.warn(
                     "Unable to load item model: '"
                        + var5
                        + "' for item: '"
                        + q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient
                           .Button(var2)
                        + "'",
                     var7
                  );
               }
            }
         }
      }
   }

   private void Spinner() {
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Button
            ),
            Lists.newArrayList(new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ButtonAction
            ),
            Lists.newArrayList(new String[]{"dirt", "coarse_dirt", "podzol"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Checkbox
            ),
            Lists.newArrayList(new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ProgressBar
            ),
            Lists.newArrayList(new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModInstallerMain
            ),
            Lists.newArrayList(new String[]{"sand", "red_sand"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            ),
            Lists.newArrayList(new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Downloader
            ),
            Lists.newArrayList(new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
            ),
            Lists.newArrayList(new String[]{"sponge", "sponge_wet"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            ),
            Lists.newArrayList(new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.rh7QDOSFg05fyydW5Gz5bwQnsrzM4KKmWUYAblghq24rfoLdGbX36bDfT2c90YOYYsaUm5iZJUPvplKrZ9BWqLfVdpJy4eWDaPHB
            ),
            Lists.newArrayList(new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
            ),
            Lists.newArrayList(new String[]{"dead_bush", "tall_grass", "fern"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
            ),
            Lists.newArrayList(new String[]{"dead_bush"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
            ),
            Lists.newArrayList(
               new String[]{
                  "black_wool",
                  "red_wool",
                  "green_wool",
                  "brown_wool",
                  "blue_wool",
                  "purple_wool",
                  "cyan_wool",
                  "silver_wool",
                  "gray_wool",
                  "pink_wool",
                  "lime_wool",
                  "yellow_wool",
                  "light_blue_wool",
                  "magenta_wool",
                  "orange_wool",
                  "white_wool"
               }
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
            ),
            Lists.newArrayList(new String[]{"dandelion"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
            ),
            Lists.newArrayList(
               new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"}
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.GsonTypeAdapter
            ),
            Lists.newArrayList(
               new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"}
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.DaGs7jfRV6yB84LcCwIMMaZ5ZL0gmDAndQH71Jj593tqqmFJ2w0ynJ5BPu3ziTWmZC19w2LyhcJLwS5nlpmF10gXEuKOVhyZWB2
            ),
            Lists.newArrayList(new String[]{"red_sandstone_slab"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.MykRe6qTpuK4jON2utrfM6s84uSojw5EnqRTkG0BoUd3ijtw5q6TCFcB51VRt26zQNVEf2GBgaQ67gOT7WMdbTbTLkZsLZpyfudM
            ),
            Lists.newArrayList(
               new String[]{
                  "black_stained_glass",
                  "red_stained_glass",
                  "green_stained_glass",
                  "brown_stained_glass",
                  "blue_stained_glass",
                  "purple_stained_glass",
                  "cyan_stained_glass",
                  "silver_stained_glass",
                  "gray_stained_glass",
                  "pink_stained_glass",
                  "lime_stained_glass",
                  "yellow_stained_glass",
                  "light_blue_stained_glass",
                  "magenta_stained_glass",
                  "orange_stained_glass",
                  "white_stained_glass"
               }
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP
            ),
            Lists.newArrayList(
               new String[]{
                  "stone_monster_egg",
                  "cobblestone_monster_egg",
                  "stone_brick_monster_egg",
                  "mossy_brick_monster_egg",
                  "cracked_brick_monster_egg",
                  "chiseled_brick_monster_egg"
               }
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG
            ),
            Lists.newArrayList(new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj
            ),
            Lists.newArrayList(new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv
            ),
            Lists.newArrayList(new String[]{"cobblestone_wall", "mossy_cobblestone_wall"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv
            ),
            Lists.newArrayList(new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd
            ),
            Lists.newArrayList(new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh
            ),
            Lists.newArrayList(
               new String[]{
                  "black_stained_hardened_clay",
                  "red_stained_hardened_clay",
                  "green_stained_hardened_clay",
                  "brown_stained_hardened_clay",
                  "blue_stained_hardened_clay",
                  "purple_stained_hardened_clay",
                  "cyan_stained_hardened_clay",
                  "silver_stained_hardened_clay",
                  "gray_stained_hardened_clay",
                  "pink_stained_hardened_clay",
                  "lime_stained_hardened_clay",
                  "yellow_stained_hardened_clay",
                  "light_blue_stained_hardened_clay",
                  "magenta_stained_hardened_clay",
                  "orange_stained_hardened_clay",
                  "white_stained_hardened_clay"
               }
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.lnzPjQSErJQ4iahgz4RPvwCjSQw60dL384yvifbAEFLyFvKk2HAFMhMT3ZEmtWJQTHJIhG5hUr59C5xnyML45Iuozv3fvU0ZCxIZ
            ),
            Lists.newArrayList(
               new String[]{
                  "black_stained_glass_pane",
                  "red_stained_glass_pane",
                  "green_stained_glass_pane",
                  "brown_stained_glass_pane",
                  "blue_stained_glass_pane",
                  "purple_stained_glass_pane",
                  "cyan_stained_glass_pane",
                  "silver_stained_glass_pane",
                  "gray_stained_glass_pane",
                  "pink_stained_glass_pane",
                  "lime_stained_glass_pane",
                  "yellow_stained_glass_pane",
                  "light_blue_stained_glass_pane",
                  "magenta_stained_glass_pane",
                  "orange_stained_glass_pane",
                  "white_stained_glass_pane"
               }
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.InstallationLogger
            ),
            Lists.newArrayList(new String[]{"acacia_leaves", "dark_oak_leaves"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
            ),
            Lists.newArrayList(new String[]{"acacia_log", "dark_oak_log"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.b4KmEzzl9MbF4jUAb2Z6l6JN0EIRbzQEPFWtSCAK3QmiDn7JtHvMDeGyGrqfrfZvyiYdmDdusyY6zPQh7jyEAD0dE169gAbeU5FT
            ),
            Lists.newArrayList(new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ
            ),
            Lists.newArrayList(
               new String[]{
                  "black_carpet",
                  "red_carpet",
                  "green_carpet",
                  "brown_carpet",
                  "blue_carpet",
                  "purple_carpet",
                  "cyan_carpet",
                  "silver_carpet",
                  "gray_carpet",
                  "pink_carpet",
                  "lime_carpet",
                  "yellow_carpet",
                  "light_blue_carpet",
                  "magenta_carpet",
                  "orange_carpet",
                  "white_carpet"
               }
            )
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ZBg3eOo6s8AWIxitZfOJ3Z1qMA6la1qc6Ei6eXBO1d4aTj3nMc13WCzbjLNMZp0Pr4wsuCTUY8VIfNLvAvDaGAvn5TlwSAotOF13
            ),
            Lists.newArrayList(new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.Checkbox,
            Lists.newArrayList(new String[]{"bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.BatModProgressBar,
            Lists.newArrayList(new String[]{"coal", "charcoal"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.JavaVersion,
            Lists.newArrayList(new String[]{"fishing_rod", "fishing_rod_cast"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68,
            Lists.newArrayList(new String[]{"cod", "salmon", "clownfish", "pufferfish"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae,
            Lists.newArrayList(new String[]{"cooked_cod", "cooked_salmon"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX,
            Lists.newArrayList(
               new String[]{
                  "dye_black",
                  "dye_red",
                  "dye_green",
                  "dye_brown",
                  "dye_blue",
                  "dye_purple",
                  "dye_cyan",
                  "dye_silver",
                  "dye_gray",
                  "dye_pink",
                  "dye_lime",
                  "dye_yellow",
                  "dye_light_blue",
                  "dye_magenta",
                  "dye_orange",
                  "dye_white"
               }
            )
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO,
            Lists.newArrayList(new String[]{"bottle_drinkable", "bottle_splash"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.Y2eSY64r61E45dd0u1KEApLKH5W0lfB2BwtaVU9ZonTT3MG9EtFGOEc3PfdOwYRxX6ZefazMMcbCcmxhovFzfRUIyMDbN7xU1Z,
            Lists.newArrayList(new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7
            ),
            Lists.newArrayList(new String[]{"oak_fence_gate"})
         );
      this.InstallationLogger
         .put(
            q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5
            ),
            Lists.newArrayList(new String[]{"oak_fence"})
         );
      this.InstallationLogger
         .put(
            PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I,
            Lists.newArrayList(new String[]{"oak_door"})
         );
   }

   private List BatModClient(
      q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 var1
   ) {
      List var2 = (List)this.InstallationLogger.get(var1);
      if (var2 == null) {
         var2 = Collections.singletonList(
            ((p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient
                  .Button(var1))
               .toString()
         );
      }

      return var2;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient(
      String var1
   ) {
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var1
      );
      return new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         var2.CustomSpinner(),
         "item/" + var2.Button()
      );
   }

   private void Checkbox() {
      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var2 : this.ColorChooser
         .keySet()) {
         oMAThCBReleWgnSq98Gc5IaGhSfLUGHE2wXPR2FqLhhJNE5mDIQFpUeCFZxdKoNRChSVpeCQWDo9ittbkWvlyQwOWVFUKZy7aM3V var3 = new oMAThCBReleWgnSq98Gc5IaGhSfLUGHE2wXPR2FqLhhJNE5mDIQFpUeCFZxdKoNRChSVpeCQWDo9ittbkWvlyQwOWVFUKZy7aM3V();
         int var4 = 0;

         for (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var6 : ((L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)this.ColorChooser
               .get(var2))
            .BatModClient()) {
            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var7 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.BatModProgressBar
               .get(var6.BatModClient());
            if (var7 != null && var7.ButtonAction()) {
               var4++;
               var3.BatModClient(
                  this.BatModClient(
                     var7,
                     var6.Button(),
                     var6.CustomSpinner()
                  ),
                  var6.ButtonAction()
               );
            } else {
               CustomSpinner.warn("Missing model for: " + var2);
            }
         }

         if (var4 == 0) {
            CustomSpinner.warn("No weighted models for: " + var2);
         } else if (var4 == 1) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  var2, var3.Button()
               );
         } else {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  var2, var3.BatModClient()
               );
         }
      }

      for (Entry var9 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.entrySet()) {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var10 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var9.getValue();
         dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var11 = new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI(
            (String)var9.getKey(), "inventory"
         );
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var12 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.BatModProgressBar
            .get(var10);
         if (var12 == null || !var12.ButtonAction()) {
            CustomSpinner.warn("Missing model for: " + var10);
         } else if (this.CustomSpinner(var12)) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  var11,
                  new Cocf3krpTwowJzCApOnPBlaMM5RS5PhQs10CQcGqZH9vGUFDvVtOIfRShT2LR9vnnwK4mMaQ5kxRfubmLMUK8myLFNj5AlN8vPBP(
                     var12.ProgressBar()
                  )
               );
         } else {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  var11,
                  this.BatModClient(
                     var12,
                     AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi.BatModClient,
                     false
                  )
               );
         }
      }
   }

   private Set ProgressBar() {
      HashSet var1 = Sets.newHashSet();
      ArrayList var2 = Lists.newArrayList(this.ColorChooser.keySet());
      Collections.sort(var2, new UkzrFgmhB6R9lxxikJmV6kePIJvvr4f570r3n0JNf0dLmM9SxDHyTltR2RwXtwr6ezu8SJtHeEaoz7iPFZNTnnRqYmvSwAFh8LK1(this));

      for (dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI var4 : var2) {
         L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2 var5 = (L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2)this.ColorChooser
            .get(var4);

         for (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var7 : var5.BatModClient()) {
            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var8 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.BatModProgressBar
               .get(var7.BatModClient());
            if (var8 == null) {
               CustomSpinner.warn("Missing model for: " + var4);
            } else {
               var1.addAll(this.BatModClient(var8));
            }
         }
      }

      var1.addAll(Button);
      return var1;
   }

   private jvIJM9vM80hBbNUlysk0Wp04jlfKkYwMZ0GeUi2djv2tvIrUEMMzWpOzBzGHTUa8NB1SsXXVQL4Uzk5XcUVMYFxH4zRLJmtPMAjv BatModClient(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1,
      AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi var2,
      boolean var3
   ) {
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var4 = (NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD)this.ProgressBar
         .get(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
               var1.CustomSpinner("particle")
            )
         );
      HTP6SoUdyppZR22lgFUKo9QPBxAZMMdVhK8iZjUZIxhNyi6YA6yQF3a6mrQJZZxmvNmb7JRkjDkDi4tdXiy4p52MwOVf4cly1oBm var5 = new HTP6SoUdyppZR22lgFUKo9QPBxAZMMdVhK8iZjUZIxhNyi6YA6yQF3a6mrQJZZxmvNmb7JRkjDkDi4tdXiy4p52MwOVf4cly1oBm(
            var1
         )
         .BatModClient(var4);

      for (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var7 : var1.BatModClient()) {
         for (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var9 : var7.CustomSpinner
            .keySet()) {
            q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var10 = (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3)var7.CustomSpinner
               .get(var9);
            NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var11 = (NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD)this.ProgressBar
               .get(
                  new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                     var1.CustomSpinner(
                        var10.ButtonAction
                     )
                  )
               );
            if (var10.Button == null) {
               var5.BatModClient(
                  this.BatModClient(
                     var7, var10, var11, var9, var2, var3
                  )
               );
            } else {
               var5.BatModClient(
                  var2.BatModClient(
                     var10.Button
                  ),
                  this.BatModClient(
                     var7, var10, var11, var9, var2, var3
                  )
               );
            }
         }
      }

      return var5.BatModClient();
   }

   private AyN6yj2ttkv5bCiwav1cDlfG2l1QAUn5cKfRDW5YGccZDGWSMZGld5i4NDzMSCGvNHOn7IwIbkQ9ybWbfHV4VIzrOh6oQy2as5Rk BatModClient(
      aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var1,
      q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var2,
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var3,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var4,
      AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi var5,
      boolean var6
   ) {
      return this.ColorTextPane
         .BatModClient(
            var1.BatModClient,
            var1.Button,
            var2,
            var3,
            var4,
            var5,
            var1.ButtonAction,
            var6,
            var1.Spinner
         );
   }

   private void BatModProgressBar() {
      this.ColorChooser();

      for (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var2 : this.BatModProgressBar
         .values()) {
         var2.BatModClient(
            this.BatModProgressBar
         );
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir.Button(
         this.BatModProgressBar
      );
   }

   private void ColorChooser() {
      ArrayDeque var1 = Queues.newArrayDeque();
      HashSet var2 = Sets.newHashSet();

      for (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var4 : this.BatModProgressBar
         .keySet()) {
         var2.add(var4);
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = ((arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.BatModProgressBar
               .get(var4))
            .Spinner();
         if (var5 != null) {
            var1.add(var5);
         }
      }

      while (!var1.isEmpty()) {
         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var7 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var1.pop();

         try {
            if (this.BatModProgressBar.get(var7) != null) {
               continue;
            }

            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var8 = this.CustomSpinner(
               var7
            );
            this.BatModProgressBar.put(var7, var8);
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var9 = var8.Spinner();
            if (var9 != null && !var2.contains(var9)) {
               var1.add(var9);
            }
         } catch (Exception var6) {
            CustomSpinner.warn(
               "In parent chain: "
                  + Spinner.join(
                     this.Spinner(var7)
                  )
                  + "; unable to load model: '"
                  + var7
                  + "'",
               var6
            );
         }

         var2.add(var7);
      }
   }

   private List Spinner(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      ArrayList var2 = Lists.newArrayList(new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD[]{var1});
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var3 = var1;

      while ((var3 = this.Checkbox(var3)) != null) {
         var2.add(0, var3);
      }

      return var2;
   }

   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD Checkbox(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1
   ) {
      for (Entry var3 : this.BatModProgressBar.entrySet()) {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var4 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)var3.getValue();
         if (var4 != null && var1.equals(var4.Spinner())) {
            return (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)var3.getKey();
         }
      }

      return null;
   }

   private Set BatModClient(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      HashSet var2 = Sets.newHashSet();

      for (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var4 : var1.BatModClient()) {
         for (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var6 : var4.CustomSpinner
            .values()) {
            p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var7 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
               var1.CustomSpinner(
                  var6.ButtonAction
               )
            );
            var2.add(var7);
         }
      }

      var2.add(
         new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
            var1.CustomSpinner("particle")
         )
      );
      return var2;
   }

   private void IntegerSpinner() {
      Set var1 = this.ProgressBar();
      var1.addAll(this.TextField());
      var1.remove(
         seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.BatModClient
      );
      PagMBzfJAjvktuSRL9gc0ico2hJio6BOuzKeoYtPKyTMENv7Hpl31s8hEYNnUx7BWkd8Vumub7miAFNpQKE1QwqVFQIxXRwpAdsg var2 = new PagMBzfJAjvktuSRL9gc0ico2hJio6BOuzKeoYtPKyTMENv7Hpl31s8hEYNnUx7BWkd8Vumub7miAFNpQKE1QwqVFQIxXRwpAdsg(
         this, var1
      );
      this.IntegerSpinner
         .BatModClient(
            this.Checkbox, var2
         );
      this.ProgressBar
         .put(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("missingno"),
            this.IntegerSpinner
               .ProgressBar()
         );
   }

   private Set TextField() {
      HashSet var1 = Sets.newHashSet();

      for (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var3 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         .values()) {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var4 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.BatModProgressBar
            .get(var3);
         if (var4 != null) {
            var1.add(
               new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                  var4.CustomSpinner("particle")
               )
            );
            if (this.Button(var4)) {
               for (String var11 : LQyxdTfpxsy50G5YZRcbFZXUOP4CtFST3Jj0kedQtLCgeGPnOwlQYDXMz468iXU68yglK0h219WdznbpBbwNzDWWmCRawQLqcKtw.BatModClient) {
                  p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var12 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                     var4.CustomSpinner(var11)
                  );
                  if (var4.Checkbox()
                        == G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     && !seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.BatModClient
                        .equals(var12)) {
                     NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD.Button(
                        var12.toString()
                     );
                  } else if (var4.Checkbox()
                        == iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
                     && !seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.BatModClient
                        .equals(var12)) {
                     NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD.BatModClient(
                        var12.toString()
                     );
                  }

                  var1.add(var12);
               }
            } else if (!this.CustomSpinner(var4)) {
               for (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM var6 : var4.BatModClient()) {
                  for (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3 var8 : var6.CustomSpinner
                     .values()) {
                     p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var9 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                        var4.CustomSpinner(
                           var8.ButtonAction
                        )
                     );
                     var1.add(var9);
                  }
               }
            }
         }
      }

      return var1;
   }

   private boolean Button(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      if (var1 == null) {
         return false;
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var2 = var1.Checkbox();
      return var2 == LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         || var2 == G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         || var2 == iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
   }

   private boolean CustomSpinner(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      if (var1 == null) {
         return false;
      }

      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var2 = var1.Checkbox();
      return var2 == bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
   }

   private void ColorTextPane() {
      for (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var2 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         .values()) {
         arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var3 = (arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir)this.BatModProgressBar
            .get(var2);
         if (this.Button(var3)) {
            arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var4 = this.ButtonAction(
               var3
            );
            if (var4 != null) {
               var4.Button = var2.toString();
            }

            this.BatModProgressBar.put(var2, var4);
         } else if (this.CustomSpinner(var3)) {
            this.BatModProgressBar.put(var2, var3);
         }
      }

      for (NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var6 : this.ProgressBar
         .values()) {
         if (!var6.BatModInstallerMain()) {
            var6.ColorTextPane();
         }
      }
   }

   private arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir ButtonAction(
      arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir var1
   ) {
      return this.BatModInstallerMain
         .BatModClient(
            this.IntegerSpinner, var1
         );
   }

   static {
      ButtonAction.put(
         "missing",
         "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}"
      );
      LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN.Button = "generation marker";
      G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr.Button = "compass generation marker";
      iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.Button = "class generation marker";
      bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.Button = "block entity marker";
   }
}
