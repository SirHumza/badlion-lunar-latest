package net.optifine.entity.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.optifine.entity.model.anim.ModelResolver;
import net.optifine.entity.model.anim.ModelUpdater;

public class CustomEntityModels {
   private static boolean active = false;
   private static Map<Class, biv> originalEntityRenderMap = null;
   private static Map<Class, bhd> originalTileEntityRenderMap = null;

   public static void update() {
      Map<Class, biv> entityRenderMap = getEntityRenderMap();
      Map<Class, bhd> tileEntityRenderMap = getTileEntityRenderMap();
      if (entityRenderMap == null) {
         Config.warn("Entity render map not found, custom entity models are DISABLED.");
      } else if (tileEntityRenderMap == null) {
         Config.warn("Tile entity render map not found, custom entity models are DISABLED.");
      } else {
         active = false;
         entityRenderMap.clear();
         tileEntityRenderMap.clear();
         entityRenderMap.putAll(originalEntityRenderMap);
         tileEntityRenderMap.putAll(originalTileEntityRenderMap);
         if (Config.isCustomEntityModels()) {
            jy[] locs = getModelLocations();

            for (int i = 0; i < locs.length; i++) {
               jy loc = locs[i];
               Config.dbg("CustomEntityModel: " + loc.a());
               IEntityRenderer rc = parseEntityRender(loc);
               if (rc != null) {
                  Class entityClass = rc.getEntityClass();
                  if (entityClass != null) {
                     if (rc instanceof biv) {
                        entityRenderMap.put(entityClass, (biv)rc);
                     } else if (rc instanceof bhd) {
                        tileEntityRenderMap.put(entityClass, (bhd)rc);
                     } else {
                        Config.warn("Unknown renderer type: " + rc.getClass().getName());
                     }

                     active = true;
                  }
               }
            }
         }
      }
   }

   private static Map<Class, biv> getEntityRenderMap() {
      biu rm = ave.A().af();
      Map<Class, biv> entityRenderMap = rm.getEntityRenderMap();
      if (entityRenderMap == null) {
         return null;
      }

      if (originalEntityRenderMap == null) {
         originalEntityRenderMap = new HashMap<>(entityRenderMap);
      }

      return entityRenderMap;
   }

   private static Map<Class, bhd> getTileEntityRenderMap() {
      Map<Class, bhd> tileEntityRenderMap = bhc.a.m;
      if (originalTileEntityRenderMap == null) {
         originalTileEntityRenderMap = new HashMap<>(tileEntityRenderMap);
      }

      return tileEntityRenderMap;
   }

   private static jy[] getModelLocations() {
      String prefix = "optifine/cem/";
      String suffix = ".jem";
      List<jy> resourceLocations = new ArrayList<>();
      String[] names = CustomModelRegistry.getModelNames();

      for (int i = 0; i < names.length; i++) {
         String name = names[i];
         String path = prefix + name + suffix;
         jy loc = new jy(path);
         if (Config.hasResource(loc)) {
            resourceLocations.add(loc);
         }
      }

      return resourceLocations.toArray(new jy[resourceLocations.size()]);
   }

   private static IEntityRenderer parseEntityRender(jy location) {
      try {
         JsonObject jo = CustomEntityModelParser.loadJson(location);
         return parseEntityRender(jo, location.a());
      } catch (IOException e) {
         Config.error("" + e.getClass().getName() + ": " + e.getMessage());
         return null;
      } catch (JsonParseException e) {
         Config.error("" + e.getClass().getName() + ": " + e.getMessage());
         return null;
      } catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }

   private static IEntityRenderer parseEntityRender(JsonObject obj, String path) {
      CustomEntityRenderer cer = CustomEntityModelParser.parseEntityRender(obj, path);
      String name = cer.getName();
      ModelAdapter modelAdapter = CustomModelRegistry.getModelAdapter(name);
      checkNull(modelAdapter, "Entity not found: " + name);
      Class entityClass = modelAdapter.getEntityClass();
      checkNull(entityClass, "Entity class not found: " + name);
      IEntityRenderer render = makeEntityRender(modelAdapter, cer);
      if (render == null) {
         return null;
      }

      render.setEntityClass(entityClass);
      return render;
   }

   private static IEntityRenderer makeEntityRender(ModelAdapter modelAdapter, CustomEntityRenderer cer) {
      jy textureLocation = cer.getTextureLocation();
      CustomModelRenderer[] modelRenderers = cer.getCustomModelRenderers();
      float shadowSize = cer.getShadowSize();
      if (shadowSize < 0.0F) {
         shadowSize = modelAdapter.getShadowSize();
      }

      bbo model = modelAdapter.makeModel();
      if (model == null) {
         return null;
      }

      ModelResolver mr = new ModelResolver(modelAdapter, model, modelRenderers);
      if (!modifyModel(modelAdapter, model, modelRenderers, mr)) {
         return null;
      }

      IEntityRenderer r = modelAdapter.makeEntityRender(model, shadowSize);
      if (r == null) {
         throw new JsonParseException("Entity renderer is null, model: " + modelAdapter.getName() + ", adapter: " + modelAdapter.getClass().getName());
      }

      if (textureLocation != null) {
         r.setLocationTextureCustom(textureLocation);
      }

      return r;
   }

   private static boolean modifyModel(ModelAdapter modelAdapter, bbo model, CustomModelRenderer[] modelRenderers, ModelResolver mr) {
      for (int i = 0; i < modelRenderers.length; i++) {
         CustomModelRenderer cmr = modelRenderers[i];
         if (!modifyModel(modelAdapter, model, cmr, mr)) {
            return false;
         }
      }

      return true;
   }

   private static boolean modifyModel(ModelAdapter modelAdapter, bbo model, CustomModelRenderer customModelRenderer, ModelResolver modelResolver) {
      String modelPart = customModelRenderer.getModelPart();
      bct parent = modelAdapter.getModelRenderer(model, modelPart);
      if (parent == null) {
         Config.warn("Model part not found: " + modelPart + ", model: " + model);
         return false;
      }

      if (!customModelRenderer.isAttach()) {
         if (parent.l != null) {
            parent.l.clear();
         }

         if (parent.spriteList != null) {
            parent.spriteList.clear();
         }

         if (parent.m != null) {
            bct[] mrs = modelAdapter.getModelRenderers(model);
            Set<bct> setMrs = Collections.newSetFromMap(new IdentityHashMap<>());
            setMrs.addAll(Arrays.asList(mrs));
            List<bct> childModels = parent.m;
            Iterator it = childModels.iterator();

            while (it.hasNext()) {
               bct mr = (bct)it.next();
               if (!setMrs.contains(mr)) {
                  it.remove();
               }
            }
         }
      }

      parent.a(customModelRenderer.getModelRenderer());
      ModelUpdater mu = customModelRenderer.getModelUpdater();
      if (mu != null) {
         modelResolver.setThisModelRenderer(customModelRenderer.getModelRenderer());
         modelResolver.setPartModelRenderer(parent);
         if (!mu.initialize(modelResolver)) {
            return false;
         }

         customModelRenderer.getModelRenderer().setModelUpdater(mu);
      }

      return true;
   }

   private static void checkNull(Object obj, String msg) {
      if (obj == null) {
         throw new JsonParseException(msg);
      }
   }

   public static boolean isActive() {
      return active;
   }
}
