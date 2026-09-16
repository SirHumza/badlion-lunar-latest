package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterEnderCrystal extends ModelAdapter {
   public ModelAdapterEnderCrystal() {
      this("end_crystal");
   }

   protected ModelAdapterEnderCrystal(String name) {
      super(uf.class, name, 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bcp(0.0F, true);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bcp)) {
         return null;
      } else {
         bcp modelEnderCrystal = (bcp)model;
         if (modelPart.equals("cube")) {
            return (bct)Reflector.getFieldValue(modelEnderCrystal, Reflector.ModelEnderCrystal_ModelRenderers, 0);
         } else if (modelPart.equals("glass")) {
            return (bct)Reflector.getFieldValue(modelEnderCrystal, Reflector.ModelEnderCrystal_ModelRenderers, 1);
         } else {
            return modelPart.equals("base") ? (bct)Reflector.getFieldValue(modelEnderCrystal, Reflector.ModelEnderCrystal_ModelRenderers, 2) : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"cube", "glass", "base"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      biv renderObj = (biv)renderManager.getEntityRenderMap().get(uf.class);
      if (!(renderObj instanceof biq)) {
         Config.warn("Not an instance of RenderEnderCrystal: " + renderObj);
         return null;
      } else {
         biq render = (biq)renderObj;
         if (!Reflector.RenderEnderCrystal_modelEnderCrystal.exists()) {
            Config.warn("Field not found: RenderEnderCrystal.modelEnderCrystal");
            return null;
         } else {
            Reflector.setFieldValue(render, Reflector.RenderEnderCrystal_modelEnderCrystal, modelBase);
            render.c = shadowSize;
            return render;
         }
      }
   }
}
