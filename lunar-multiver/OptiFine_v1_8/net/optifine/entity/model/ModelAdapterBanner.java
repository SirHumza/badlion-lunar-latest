package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterBanner extends ModelAdapter {
   public ModelAdapterBanner() {
      super(aku.class, "banner", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bau();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bau)) {
         return null;
      } else {
         bau modelBanner = (bau)model;
         if (modelPart.equals("slate")) {
            return modelBanner.a;
         } else if (modelPart.equals("stand")) {
            return modelBanner.b;
         } else {
            return modelPart.equals("top") ? modelBanner.c : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"slate", "stand", "top"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      bhc dispatcher = bhc.a;
      bhd renderer = dispatcher.a(aku.class);
      if (!(renderer instanceof bha)) {
         return null;
      }

      if (renderer.getEntityClass() == null) {
         renderer = new bha();
         renderer.a(dispatcher);
      }

      if (!Reflector.TileEntityBannerRenderer_bannerModel.exists()) {
         Config.warn("Field not found: TileEntityBannerRenderer.bannerModel");
         return null;
      } else {
         Reflector.setFieldValue(renderer, Reflector.TileEntityBannerRenderer_bannerModel, modelBase);
         return renderer;
      }
   }
}
