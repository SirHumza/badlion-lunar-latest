package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterWitch extends ModelAdapter {
   public ModelAdapterWitch() {
      super(wd.class, "witch", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bck(0.0F);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bck)) {
         return null;
      } else {
         bck modelWitch = (bck)model;
         if (modelPart.equals("mole")) {
            return (bct)Reflector.getFieldValue(modelWitch, Reflector.ModelWitch_mole);
         } else if (modelPart.equals("hat")) {
            return (bct)Reflector.getFieldValue(modelWitch, Reflector.ModelWitch_hat);
         } else if (modelPart.equals("head")) {
            return modelWitch.a;
         } else if (modelPart.equals("body")) {
            return modelWitch.b;
         } else if (modelPart.equals("arms")) {
            return modelWitch.c;
         } else if (modelPart.equals("left_leg")) {
            return modelWitch.e;
         } else if (modelPart.equals("right_leg")) {
            return modelWitch.d;
         } else {
            return modelPart.equals("nose") ? modelWitch.f : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"mole", "head", "body", "arms", "right_leg", "left_leg", "nose"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bki render = new bki(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
