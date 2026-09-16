package net.optifine;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import net.optifine.config.ConnectedParser;
import net.optifine.config.MatchBlock;
import net.optifine.shaders.BlockAliases;
import net.optifine.util.PropertiesOrdered;
import net.optifine.util.ResUtils;

public class CustomBlockLayers {
   private static adf[] renderLayers = null;
   public static boolean active = false;

   public static adf getRenderLayer(alz blockState) {
      if (renderLayers == null) {
         return null;
      }

      if (blockState.c().c()) {
         return null;
      }

      if (!(blockState instanceof aly)) {
         return null;
      }

      aly bsb = (aly)blockState;
      int id = bsb.getBlockId();
      return id > 0 && id < renderLayers.length ? renderLayers[id] : null;
   }

   public static void update() {
      renderLayers = null;
      active = false;
      List<adf> list = new ArrayList<>();
      String pathProps = "optifine/block.properties";
      Properties props = ResUtils.readProperties(pathProps, "CustomBlockLayers");
      if (props != null) {
         readLayers(pathProps, props, list);
      }

      if (Config.isShaders()) {
         PropertiesOrdered propsShaders = BlockAliases.getBlockLayerPropertes();
         if (propsShaders != null) {
            String pathPropsShaders = "shaders/block.properties";
            readLayers(pathPropsShaders, propsShaders, list);
         }
      }

      if (!list.isEmpty()) {
         renderLayers = list.toArray(new adf[list.size()]);
         active = true;
      }
   }

   private static void readLayers(String pathProps, Properties props, List<adf> list) {
      Config.dbg("CustomBlockLayers: " + pathProps);
      readLayer("solid", adf.a, props, list);
      readLayer("cutout", adf.c, props, list);
      readLayer("cutout_mipped", adf.b, props, list);
      readLayer("translucent", adf.d, props, list);
   }

   private static void readLayer(String name, adf layer, Properties props, List<adf> listLayers) {
      String key = "layer." + name;
      String val = props.getProperty(key);
      if (val != null) {
         ConnectedParser cp = new ConnectedParser("CustomBlockLayers");
         MatchBlock[] mbs = cp.parseMatchBlocks(val);
         if (mbs != null) {
            for (int i = 0; i < mbs.length; i++) {
               MatchBlock mb = mbs[i];
               int blockId = mb.getBlockId();
               if (blockId > 0) {
                  while (listLayers.size() < blockId + 1) {
                     listLayers.add(null);
                  }

                  if (listLayers.get(blockId) != null) {
                     Config.warn("CustomBlockLayers: Block layer is already set, block: " + blockId + ", layer: " + name);
                  }

                  listLayers.set(blockId, layer);
               }
            }
         }
      }
   }

   public static boolean isActive() {
      return active;
   }
}
