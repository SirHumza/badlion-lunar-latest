package net.optifine.entity.model;

public class ModelAdapterSnowman extends ModelAdapter {
   public ModelAdapterSnowman() {
      super(tw.class, "snow_golem", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bcd();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bcd)) {
         return null;
      } else {
         bcd modelSnowman = (bcd)model;
         if (modelPart.equals("body")) {
            return modelSnowman.a;
         } else if (modelPart.equals("body_bottom")) {
            return modelSnowman.b;
         } else if (modelPart.equals("head")) {
            return modelSnowman.c;
         } else if (modelPart.equals("left_hand")) {
            return modelSnowman.e;
         } else {
            return modelPart.equals("right_hand") ? modelSnowman.d : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjz render = new bjz(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
