package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterWitherSkull extends ModelAdapter {
   public ModelAdapterWitherSkull() {
      super(xd.class, "wither_skull", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bbz();
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
      biu renderManager = ave.A().af();
      bkk render = new bkk(renderManager);
      if (!Reflector.RenderWitherSkull_model.exists()) {
         Config.warn("Field not found: RenderWitherSkull_model");
         return null;
      } else {
         Reflector.setFieldValue(render, Reflector.RenderWitherSkull_model, modelBase);
         render.c = shadowSize;
         return render;
      }
   }
}
