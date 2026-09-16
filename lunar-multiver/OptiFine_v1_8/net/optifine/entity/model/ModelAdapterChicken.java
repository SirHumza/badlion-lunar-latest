package net.optifine.entity.model;

public class ModelAdapterChicken extends ModelAdapter {
   public ModelAdapterChicken() {
      super(tn.class, "chicken", 0.3F);
   }

   @Override
   public bbo makeModel() {
      return new bba();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bba)) {
         return null;
      } else {
         bba modelChicken = (bba)model;
         if (modelPart.equals("head")) {
            return modelChicken.a;
         } else if (modelPart.equals("body")) {
            return modelChicken.b;
         } else if (modelPart.equals("right_leg")) {
            return modelChicken.c;
         } else if (modelPart.equals("left_leg")) {
            return modelChicken.d;
         } else if (modelPart.equals("right_wing")) {
            return modelChicken.e;
         } else if (modelPart.equals("left_wing")) {
            return modelChicken.f;
         } else if (modelPart.equals("bill")) {
            return modelChicken.g;
         } else {
            return modelPart.equals("chin") ? modelChicken.h : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bim(renderManager, modelBase, shadowSize);
   }
}
