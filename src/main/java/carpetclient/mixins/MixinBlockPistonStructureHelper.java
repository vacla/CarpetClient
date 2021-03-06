package carpetclient.mixins;

import carpetclient.Config;
import net.minecraft.block.state.BlockPistonStructureHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BlockPistonStructureHelper.class)
public class MixinBlockPistonStructureHelper {

    /*
    Edits the push limit of pistons to allow visually better
     */
    @ModifyConstant(method = "addBlockLine", constant = @Constant(intValue = 12), expect = 3)
    private static int pushLimit(int orig) {
        return Config.pushLimit;
    }
}
