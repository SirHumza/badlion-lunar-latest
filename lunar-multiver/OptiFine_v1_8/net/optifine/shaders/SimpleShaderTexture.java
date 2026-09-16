package net.optifine.shaders;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.commons.io.IOUtils;

public class SimpleShaderTexture extends bly {
   private String texturePath;
   private static final bny METADATA_SERIALIZER = makeMetadataSerializer();

   public SimpleShaderTexture(String texturePath) {
      this.texturePath = texturePath;
   }

   public void a(bni resourceManager) throws IOException {
      this.c();
      InputStream inputStream = Shaders.getShaderPackResourceStream(this.texturePath);
      if (inputStream == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.texturePath);
      }

      try {
         BufferedImage bufferedimage = bml.a(inputStream);
         bon tms = loadTextureMetadataSection(this.texturePath, new bon(false, false, new ArrayList()));
         bml.a(this.b(), bufferedimage, tms.a(), tms.b());
      } finally {
         IOUtils.closeQuietly(inputStream);
      }
   }

   public static bon loadTextureMetadataSection(String texturePath, bon def) {
      String pathMeta = texturePath + ".mcmeta";
      String sectionName = "texture";
      InputStream inMeta = Shaders.getShaderPackResourceStream(pathMeta);
      if (inMeta != null) {
         bny ms = METADATA_SERIALIZER;
         BufferedReader brMeta = new BufferedReader(new InputStreamReader(inMeta));

         try {
            JsonObject jsonMeta = new JsonParser().parse(brMeta).getAsJsonObject();
            bon meta = (bon)ms.a(sectionName, jsonMeta);
            if (meta != null) {
               return meta;
            }
         } catch (RuntimeException re) {
            SMCLog.warning("Error reading metadata: " + pathMeta);
            SMCLog.warning("" + re.getClass().getName() + ": " + re.getMessage());
         } finally {
            IOUtils.closeQuietly(brMeta);
            IOUtils.closeQuietly(inMeta);
         }
      }

      return def;
   }

   private static bny makeMetadataSerializer() {
      bny ms = new bny();
      ms.a(new boo(), bon.class);
      ms.a(new boe(), bod.class);
      ms.a(new bob(), boa.class);
      ms.a(new bok(), boj.class);
      ms.a(new boh(), bog.class);
      return ms;
   }
}
