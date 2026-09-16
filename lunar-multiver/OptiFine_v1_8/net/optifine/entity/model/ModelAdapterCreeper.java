package net.optifine.entity.model;

public class ModelAdapterCreeper extends ModelAdapter {
   public ModelAdapterCreeper() {
      super(vn.class, "creeper", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bbc();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbc)) {
         return null;
      } else {
         bbc modelCreeper = (bbc)model;
         if (modelPart.equals("head")) {
            return modelCreeper.a;
         } else if (modelPart.equals("armor")) {
            return modelCreeper.b;
         } else if (modelPart.equals("body")) {
            return modelCreeper.c;
         } else if (modelPart.equals("leg1")) {
            return modelCreeper.d;
         } else if (modelPart.equals("leg2")) {
            return modelCreeper.e;
         } else if (modelPart.equals("leg3")) {
            return modelCreeper.f;
         } else {
            return modelPart.equals("leg4") ? modelCreeper.g : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bio render = new bio(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
