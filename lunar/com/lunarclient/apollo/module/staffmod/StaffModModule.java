package com.lunarclient.apollo.module.staffmod;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "staff_mod", name = "Staff Mod")
@ApiStatus.NonExtendable
public abstract class StaffModModule extends ApolloModule {
   public abstract void enableStaffMods(Recipients var1, List<StaffMod> var2);

   public abstract void enableStaffMods(Recipients var1, List<StaffMod> var2, boolean var3);

   public abstract void disableStaffMods(Recipients var1, List<StaffMod> var2);

   public abstract void enableAllStaffMods(Recipients var1);

   public abstract void enableAllStaffMods(Recipients var1, boolean var2);

   public abstract void disableAllStaffMods(Recipients var1);
}
