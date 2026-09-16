package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterHeadSkeleton extends ModelAdapter {
   public ModelAdapterHeadSkeleton() {
      super(alo.class, "head_skeleton", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bbz(0, 0, 64, 32);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbz)) {
         return null;
      }

      bbz modelSkeletonHead = (bbz)model;
      return modelPart.equals("head") ? modelSkeletonHead.a : null;
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      bhc dispatcher = bhc.a;
      bhd renderer = dispatcher.a(alo.class);
      if (!(renderer instanceof bhk)) {
         return null;
      }

      if (renderer.getEntityClass() == null) {
         renderer = new bhk();
         renderer.a(dispatcher);
      }

      if (!Reflector.TileEntitySkullRenderer_humanoidHead.exists()) {
         Config.warn("Field not found: TileEntitySkullRenderer.humanoidHead");
         return null;
      } else {
         Reflector.setFieldValue(renderer, Reflector.TileEntitySkullRenderer_humanoidHead, modelBase);
         return renderer;
      }
   }
}
