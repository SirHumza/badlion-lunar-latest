package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterHeadHumanoid extends ModelAdapter {
   public ModelAdapterHeadHumanoid() {
      super(alo.class, "head_humanoid", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bbi();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbi)) {
         return null;
      } else {
         bbi modelHumanoidHead = (bbi)model;
         if (modelPart.equals("head")) {
            return modelHumanoidHead.a;
         } else if (modelPart.equals("head2")) {
            return !Reflector.ModelHumanoidHead_head.exists() ? null : (bct)Reflector.getFieldValue(modelHumanoidHead, Reflector.ModelHumanoidHead_head);
         } else {
            return null;
         }
      }
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
