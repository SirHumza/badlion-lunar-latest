package net.optifine.entity.model;

public class ModelAdapterVillager extends ModelAdapter {
   public ModelAdapterVillager() {
      super(wi.class, "villager", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bci(0.0F);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bci)) {
         return null;
      } else {
         bci modelVillager = (bci)model;
         if (modelPart.equals("head")) {
            return modelVillager.a;
         } else if (modelPart.equals("body")) {
            return modelVillager.b;
         } else if (modelPart.equals("arms")) {
            return modelVillager.c;
         } else if (modelPart.equals("left_leg")) {
            return modelVillager.e;
         } else if (modelPart.equals("right_leg")) {
            return modelVillager.d;
         } else {
            return modelPart.equals("nose") ? modelVillager.f : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "body", "arms", "right_leg", "left_leg", "nose"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bkh render = new bkh(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
