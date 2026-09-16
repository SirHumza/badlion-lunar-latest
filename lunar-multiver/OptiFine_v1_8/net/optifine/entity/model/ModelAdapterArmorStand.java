package net.optifine.entity.model;

public class ModelAdapterArmorStand extends ModelAdapterBiped {
   public ModelAdapterArmorStand() {
      super(um.class, "armor_stand", 0.0F);
   }

   @Override
   public bbo makeModel() {
      return new bat();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bat)) {
         return null;
      } else {
         bat modelArmorStand = (bat)model;
         if (modelPart.equals("right")) {
            return modelArmorStand.a;
         } else if (modelPart.equals("left")) {
            return modelArmorStand.b;
         } else if (modelPart.equals("waist")) {
            return modelArmorStand.c;
         } else {
            return modelPart.equals("base") ? modelArmorStand.d : super.getModelRenderer(modelArmorStand, modelPart);
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      String[] names = super.getModelRendererNames();
      return (String[])Config.addObjectsToArray(names, new String[]{"right", "left", "waist", "base"});
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      big render = new big(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
