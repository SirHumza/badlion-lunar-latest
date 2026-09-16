package net.optifine.entity.model.anim;

import net.optifine.expr.ExpressionType;
import net.optifine.expr.IExpressionBool;

public enum RenderEntityParameterBool implements IExpressionBool {
   IS_ALIVE("is_alive"),
   IS_BURNING("is_burning"),
   IS_CHILD("is_child"),
   IS_GLOWING("is_glowing"),
   IS_HURT("is_hurt"),
   IS_IN_LAVA("is_in_lava"),
   IS_IN_WATER("is_in_water"),
   IS_INVISIBLE("is_invisible"),
   IS_ON_GROUND("is_on_ground"),
   IS_RIDDEN("is_ridden"),
   IS_RIDING("is_riding"),
   IS_SNEAKING("is_sneaking"),
   IS_SPRINTING("is_sprinting"),
   IS_WET("is_wet");

   private String name;
   private biu renderManager;
   private static final RenderEntityParameterBool[] VALUES = values();

   RenderEntityParameterBool(String name) {
      this.name = name;
      this.renderManager = ave.A().af();
   }

   public String getName() {
      return this.name;
   }

   @Override
   public ExpressionType getExpressionType() {
      return ExpressionType.BOOL;
   }

   @Override
   public boolean eval() {
      biv render = this.renderManager.renderRender;
      if (render == null) {
         return false;
      }

      if (render instanceof bjl) {
         bjl rlb = (bjl)render;
         pr entity = rlb.renderEntity;
         if (entity == null) {
            return false;
         }

         switch (this) {
            case IS_ALIVE:
               return entity.ai();
            case IS_BURNING:
               return entity.at();
            case IS_CHILD:
               return entity.j_();
            case IS_HURT:
               return entity.au > 0;
            case IS_IN_LAVA:
               return entity.ab();
            case IS_IN_WATER:
               return entity.V();
            case IS_INVISIBLE:
               return entity.ax();
            case IS_ON_GROUND:
               return entity.C;
            case IS_RIDDEN:
               return entity.l != null;
            case IS_RIDING:
               return entity.au();
            case IS_SNEAKING:
               return entity.av();
            case IS_SPRINTING:
               return entity.aw();
            case IS_WET:
               return entity.U();
         }
      }

      return false;
   }

   public static RenderEntityParameterBool parse(String str) {
      if (str == null) {
         return null;
      }

      for (int i = 0; i < VALUES.length; i++) {
         RenderEntityParameterBool type = VALUES[i];
         if (type.getName().equals(str)) {
            return type;
         }
      }

      return null;
   }
}
