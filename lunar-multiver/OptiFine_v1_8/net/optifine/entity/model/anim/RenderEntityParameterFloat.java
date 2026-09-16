package net.optifine.entity.model.anim;

import net.optifine.expr.ExpressionType;
import net.optifine.expr.IExpressionFloat;

public enum RenderEntityParameterFloat implements IExpressionFloat {
   LIMB_SWING("limb_swing"),
   LIMB_SWING_SPEED("limb_speed"),
   AGE("age"),
   HEAD_YAW("head_yaw"),
   HEAD_PITCH("head_pitch"),
   SCALE("scale"),
   HEALTH("health"),
   HURT_TIME("hurt_time"),
   IDLE_TIME("idle_time"),
   MAX_HEALTH("max_health"),
   MOVE_FORWARD("move_forward"),
   MOVE_STRAFING("move_strafing"),
   PARTIAL_TICKS("partial_ticks"),
   POS_X("pos_x"),
   POS_Y("pos_y"),
   POS_Z("pos_z"),
   REVENGE_TIME("revenge_time"),
   SWING_PROGRESS("swing_progress");

   private String name;
   private biu renderManager;
   private static final RenderEntityParameterFloat[] VALUES = values();

   RenderEntityParameterFloat(String name) {
      this.name = name;
      this.renderManager = ave.A().af();
   }

   public String getName() {
      return this.name;
   }

   @Override
   public ExpressionType getExpressionType() {
      return ExpressionType.FLOAT;
   }

   @Override
   public float eval() {
      biv render = this.renderManager.renderRender;
      if (render == null) {
         return 0.0F;
      }

      if (render instanceof bjl) {
         bjl rlb = (bjl)render;
         switch (this) {
            case LIMB_SWING:
               return rlb.renderLimbSwing;
            case LIMB_SWING_SPEED:
               return rlb.renderLimbSwingAmount;
            case AGE:
               return rlb.renderAgeInTicks;
            case HEAD_YAW:
               return rlb.renderHeadYaw;
            case HEAD_PITCH:
               return rlb.renderHeadPitch;
            case SCALE:
               return rlb.renderScaleFactor;
            default:
               pr entity = rlb.renderEntity;
               if (entity == null) {
                  return 0.0F;
               }

               switch (this) {
                  case HEALTH:
                     return entity.bn();
                  case HURT_TIME:
                     return entity.au;
                  case IDLE_TIME:
                     return entity.bh();
                  case MAX_HEALTH:
                     return entity.bu();
                  case MOVE_FORWARD:
                     return entity.ba;
                  case MOVE_STRAFING:
                     return entity.aZ;
                  case POS_X:
                     return (float)entity.s;
                  case POS_Y:
                     return (float)entity.t;
                  case POS_Z:
                     return (float)entity.u;
                  case REVENGE_TIME:
                     return entity.be();
                  case SWING_PROGRESS:
                     return entity.l(rlb.renderPartialTicks);
               }
         }
      }

      return 0.0F;
   }

   public static RenderEntityParameterFloat parse(String str) {
      if (str == null) {
         return null;
      }

      for (int i = 0; i < VALUES.length; i++) {
         RenderEntityParameterFloat type = VALUES[i];
         if (type.getName().equals(str)) {
            return type;
         }
      }

      return null;
   }
}
