package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterBat extends ModelAdapter {
   public ModelAdapterBat() {
      super(tk.class, "bat", 0.25F);
   }

   @Override
   public bbo makeModel() {
      return new bav();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bav)) {
         return null;
      } else {
         bav modelBat = (bav)model;
         if (modelPart.equals("head")) {
            return (bct)Reflector.getFieldValue(modelBat, Reflector.ModelBat_ModelRenderers, 0);
         } else if (modelPart.equals("body")) {
            return (bct)Reflector.getFieldValue(modelBat, Reflector.ModelBat_ModelRenderers, 1);
         } else if (modelPart.equals("right_wing")) {
            return (bct)Reflector.getFieldValue(modelBat, Reflector.ModelBat_ModelRenderers, 2);
         } else if (modelPart.equals("left_wing")) {
            return (bct)Reflector.getFieldValue(modelBat, Reflector.ModelBat_ModelRenderers, 3);
         } else if (modelPart.equals("outer_right_wing")) {
            return (bct)Reflector.getFieldValue(modelBat, Reflector.ModelBat_ModelRenderers, 4);
         } else {
            return modelPart.equals("outer_left_wing") ? (bct)Reflector.getFieldValue(modelBat, Reflector.ModelBat_ModelRenderers, 5) : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bii render = new bii(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
