package io.siuolplex.wood_you_dye.block.sign;

import net.minecraft.block.WallSignBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

// Code is based on Terraform
// Original found here: https://github.com/TerraformersMC/Terraform/blob/1.19.4/terraform-wood-api-v1/src/main/java/com/terraformersmc/terraform/sign/block/TerraformSignBlock.java
public class WoodYouDyeWallSignBlock extends WallSignBlock implements WoodYouDyeSign {
    private final Identifier texture;

    public WoodYouDyeWallSignBlock(Settings settings, SignType type) {
        super(settings.nonOpaque().noCollision(), type);
        this.texture = new Identifier("wood_you_dye", "entity/signs/" + type.getName());;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}