package net.optifine.entity.model;

public class ModelAdapterIronGolem extends ModelAdapter {
   public ModelAdapterIronGolem() {
      super(ty.class, "iron_golem", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bch();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bch)) {
         return null;
      } else {
         bch modelIronGolem = (bch)model;
         if (modelPart.equals("head")) {
            return modelIronGolem.a;
         } else if (modelPart.equals("body")) {
            return modelIronGolem.b;
         } else if (modelPart.equals("left_arm")) {
            return modelIronGolem.d;
         } else if (modelPart.equals("right_arm")) {
            return modelIronGolem.c;
         } else if (modelPart.equals("left_leg")) {
            return modelIronGolem.e;
         } else {
            return modelPart.equals("right_leg") ? modelIronGolem.f : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bkg render = new bkg(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
