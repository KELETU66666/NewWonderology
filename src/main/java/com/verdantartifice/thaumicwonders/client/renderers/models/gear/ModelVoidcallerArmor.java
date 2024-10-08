package com.verdantartifice.thaumicwonders.client.renderers.models.gear;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import thaumcraft.client.renderers.models.gear.ModelCustomArmor;

public class ModelVoidcallerArmor extends ModelCustomArmor {
    ModelRenderer Helmet;
    ModelRenderer CollarF;
    ModelRenderer CollarB;
    ModelRenderer CollarR;
    ModelRenderer CollarL;
    ModelRenderer BeltR;
    ModelRenderer Mbelt;
    ModelRenderer MbeltL;
    ModelRenderer MbeltR;
    ModelRenderer BeltL;
    ModelRenderer CloakTL;
    ModelRenderer Cloak3;
    ModelRenderer CloakTR;
    ModelRenderer Cloak1;
    ModelRenderer Cloak2;
    ModelRenderer Chestplate;
    ModelRenderer ChestOrnament;
    ModelRenderer ChestClothL;
    ModelRenderer ChestClothR;
    ModelRenderer Backplate;
    ModelRenderer GauntletstrapR1;
    ModelRenderer GauntletstrapR2;
    ModelRenderer ShoulderR;
    ModelRenderer ShoulderR1;
    ModelRenderer ShoulderR2;
    ModelRenderer ShoulderR5;
    ModelRenderer ShoulderR3;
    ModelRenderer ShoulderR4;
    ModelRenderer GauntletR2;
    ModelRenderer GauntletR;
    ModelRenderer GauntletL2;
    ModelRenderer GauntletstrapL1;
    ModelRenderer GauntletstrapL2;
    ModelRenderer ShoulderL;
    ModelRenderer ShoulderL1;
    ModelRenderer ShoulderL2;
    ModelRenderer ShoulderL3;
    ModelRenderer ShoulderL5;
    ModelRenderer ShoulderL4;
    ModelRenderer GauntletL;
    ModelRenderer LegClothR;
    ModelRenderer BackpanelR2;
    ModelRenderer BackpanelR3;
    ModelRenderer BackpanelR4;
    ModelRenderer LegClothL;
    ModelRenderer BackpanelL4;
    ModelRenderer BackpanelL2;
    ModelRenderer BackpanelL3;
    ModelRenderer BackpanelL1;
    ModelRenderer BackpanelR1;

    public ModelVoidcallerArmor(float f) {
        super(f, 0, 128, 64);
        textureWidth = 128;
        textureHeight = 64;
        Helmet = new ModelRenderer(this, 41, 8).addBox(-4.5f, -9.0f, -4.5f, 9, 9, 9);
        Helmet.setTextureSize(128, 64);
        setRotation(Helmet, 0.0f, 0.0f, 0.0f);
        CollarF = new ModelRenderer(this, 17, 31).addBox(-4.5f, -1.5f, -3.0f, 9, 4, 1);
        CollarF.setRotationPoint(0.0f, 0.0f, -2.5f);
        setRotation(CollarF, 0.2268928f, 0.0f, 0.0f);
        CollarB = new ModelRenderer(this, 17, 26).addBox(-4.5f, -1.5f, 7.0f, 9, 4, 1);
        CollarB.setRotationPoint(0.0f, 0.0f, -2.5f);
        setRotation(CollarB, 0.2268928f, 0.0f, 0.0f);
        CollarR = new ModelRenderer(this, 17, 11).addBox(-5.5f, -1.5f, -3.0f, 1, 4, 11);
        CollarR.setRotationPoint(0.0f, 0.0f, -2.5f);
        setRotation(CollarR, 0.2268928f, 0.0f, 0.0f);
        CollarL = new ModelRenderer(this, 17, 11).addBox(4.5f, -1.5f, -3.0f, 1, 4, 11);
        CollarL.setRotationPoint(0.0f, 0.0f, -2.5f);
        setRotation(CollarL, 0.2268928f, 0.0f, 0.0f);
        BeltR = new ModelRenderer(this, 76, 44).addBox(-5.0f, 4.0f, -3.0f, 1, 3, 6);
        Mbelt = new ModelRenderer(this, 56, 55).addBox(-4.0f, 8.0f, -3.0f, 8, 4, 1);
        MbeltL = new ModelRenderer(this, 76, 44).addBox(4.0f, 8.0f, -3.0f, 1, 3, 6);
        MbeltR = new ModelRenderer(this, 76, 44).addBox(-5.0f, 8.0f, -3.0f, 1, 3, 6);
        BeltL = new ModelRenderer(this, 76, 44).addBox(4.0f, 4.0f, -3.0f, 1, 3, 6);
        CloakTL = new ModelRenderer(this, 0, 43).addBox(2.5f, 1.0f, -1.0f, 2, 1, 3);
        CloakTL.setRotationPoint(0.0f, 0.0f, 3.0f);
        setRotation(CloakTL, 0.1396263f, 0.0f, 0.0f);
        Cloak3 = new ModelRenderer(this, 0, 59).addBox(-4.5f, 17.0f, -3.7f, 9, 4, 1);
        Cloak3.setRotationPoint(0.0f, 0.0f, 3.0f);
        setRotation(Cloak3, 0.4465716f, 0.0f, 0.0f);
        CloakTR = new ModelRenderer(this, 0, 43).addBox(-4.5f, 1.0f, -1.0f, 2, 1, 3);
        CloakTR.setRotationPoint(0.0f, 0.0f, 3.0f);
        setRotation(CloakTR, 0.1396263f, 0.0f, 0.0f);
        Cloak1 = new ModelRenderer(this, 0, 47).addBox(-4.5f, 2.0f, 1.0f, 9, 12, 1);
        Cloak1.setRotationPoint(0.0f, 0.0f, 3.0f);
        setRotation(Cloak1, 0.1396263f, 0.0f, 0.0f);
        Cloak2 = new ModelRenderer(this, 0, 59).addBox(-4.5f, 14.0f, -1.3f, 9, 4, 1);
        Cloak2.setRotationPoint(0.0f, 0.0f, 3.0f);
        setRotation(Cloak2, 0.3069452f, 0.0f, 0.0f);
        Chestplate = new ModelRenderer(this, 56, 45).addBox(-4.0f, 1.0f, -3.8f, 8, 7, 2);
        ChestOrnament = new ModelRenderer(this, 76, 53).addBox(-2.5f, 3.0f, -4.8f, 5, 5, 1);
        ChestClothL = new ModelRenderer(this, 20, 47);
        ChestClothL.mirror = true;
        ChestClothL.addBox(1.5f, 1.2f, -4.5f, 3, 9, 1);
        setRotation(ChestClothL, 0.0663225f, 0.0f, 0.0f);
        ChestClothR = new ModelRenderer(this, 20, 47).addBox(-4.5f, 1.2f, -4.5f, 3, 9, 1);
        setRotation(ChestClothR, 0.0663225f, 0.0f, 0.0f);
        Backplate = new ModelRenderer(this, 36, 45).addBox(-4.0f, 1.0f, 2.0f, 8, 11, 2);
        GauntletR = new ModelRenderer(this, 100, 26).addBox(-3.5f, 3.5f, -2.5f, 2, 6, 5);
        GauntletL = new ModelRenderer(this, 114, 26).addBox(1.5f, 3.5f, -2.5f, 2, 6, 5);
        GauntletstrapL1 = new ModelRenderer(this, 84, 31);
        GauntletstrapL1.mirror = true;
        GauntletstrapL1.addBox(-1.5f, 3.5f, -2.5f, 3, 1, 5);
        GauntletstrapL2 = new ModelRenderer(this, 84, 31);
        GauntletstrapL2.mirror = true;
        GauntletstrapL2.addBox(-1.5f, 6.5f, -2.5f, 3, 1, 5);
        GauntletstrapR1 = new ModelRenderer(this, 84, 31).addBox(-1.5f, 3.5f, -2.5f, 3, 1, 5);
        GauntletstrapR2 = new ModelRenderer(this, 84, 31).addBox(-1.5f, 6.5f, -2.5f, 3, 1, 5);
        GauntletR2 = new ModelRenderer(this, 102, 37).addBox(-5.0f, 3.5f, -2.0f, 1, 5, 4);
        setRotation(GauntletR2, 0.0f, 0.0f, -0.1675516f);
        GauntletL2 = new ModelRenderer(this, 102, 37).addBox(4.0f, 3.5f, -2.0f, 1, 5, 4);
        setRotation(GauntletL2, 0.0f, 0.0f, 0.1675516f);
        ShoulderR = new ModelRenderer(this, 56, 35).addBox(-3.5f, -2.5f, -2.5f, 5, 5, 5);
        ShoulderR1 = new ModelRenderer(this, 0, 0).addBox(-4.3f, -1.5f, -3.0f, 3, 5, 6);
        setRotation(ShoulderR1, 0.0f, 0.0f, 0.7853982f);
        ShoulderR2 = new ModelRenderer(this, 0, 19).addBox(-3.3f, 3.5f, -2.5f, 1, 1, 5);
        setRotation(ShoulderR2, 0.0f, 0.0f, 0.7853982f);
        ShoulderR5 = new ModelRenderer(this, 18, 4).addBox(-2.3f, -1.5f, 3.0f, 1, 6, 1);
        setRotation(ShoulderR5, 0.0f, 0.0f, 0.7853982f);
        ShoulderR3 = new ModelRenderer(this, 0, 11).addBox(-2.3f, 3.5f, -3.0f, 1, 2, 6);
        setRotation(ShoulderR3, 0.0f, 0.0f, 0.7853982f);
        ShoulderR4 = new ModelRenderer(this, 18, 4).addBox(-2.3f, -1.5f, -4.0f, 1, 6, 1);
        setRotation(ShoulderR4, 0.0f, 0.0f, 0.7853982f);
        ShoulderL = new ModelRenderer(this, 56, 35).addBox(-1.5f, -2.5f, -2.5f, 5, 5, 5);
        ShoulderL1 = new ModelRenderer(this, 0, 0).addBox(1.3f, -1.5f, -3.0f, 3, 5, 6);
        setRotation(ShoulderL1, 0.0f, 0.0f, -0.7853982f);
        ShoulderL2 = new ModelRenderer(this, 0, 19);
        ShoulderL2.mirror = true;
        ShoulderL2.addBox(2.3f, 3.5f, -2.5f, 1, 1, 5);
        setRotation(ShoulderL2, 0.0f, 0.0f, -0.7853982f);
        ShoulderL3 = new ModelRenderer(this, 0, 11).addBox(1.3f, 3.5f, -3.0f, 1, 2, 6);
        setRotation(ShoulderL3, 0.0f, 0.0f, -0.7853982f);
        ShoulderL5 = new ModelRenderer(this, 18, 4).addBox(1.3f, -1.5f, 3.0f, 1, 6, 1);
        ShoulderL5.setTextureSize(128, 64);
        setRotation(ShoulderL5, 0.0f, 0.0f, -0.7853982f);
        ShoulderL4 = new ModelRenderer(this, 18, 4).addBox(1.3f, -1.5f, -4.0f, 1, 6, 1);
        setRotation(ShoulderL4, 0.0f, 0.0f, -0.7853982f);
        LegClothR = new ModelRenderer(this, 20, 55).addBox(0.0f, 0.0f, 0.0f, 3, 8, 1);
        LegClothR.setRotationPoint(-4.5f, 10.4f, -3.9f);
        setRotation(LegClothR, -0.0349066f, 0.0f, 0.0f);
        LegClothL = new ModelRenderer(this, 20, 55);
        LegClothL.mirror = true;
        LegClothL.addBox(0.0f, 0.0f, 0.0f, 3, 8, 1);
        LegClothL.setRotationPoint(1.5f, 10.4f, -3.9f);
        setRotation(LegClothL, -0.0349066f, 0.0f, 0.0f);
        BackpanelR1 = new ModelRenderer(this, 0, 25).addBox(-3.0f, -0.5f, 2.5f, 5, 7, 1);
        setRotation(BackpanelR1, 0.0698132f, 0.0f, 0.0f);
        BackpanelR2 = new ModelRenderer(this, 96, 14).addBox(-3.0f, -0.5f, -2.5f, 5, 3, 5);
        setRotation(BackpanelR2, 0.0f, 0.0f, 0.1396263f);
        BackpanelR3 = new ModelRenderer(this, 116, 13).addBox(-3.0f, 2.5f, -2.5f, 1, 4, 5);
        setRotation(BackpanelR3, 0.0f, 0.0f, 0.1396263f);
        BackpanelR4 = new ModelRenderer(this, 0, 25);
        BackpanelR4.mirror = true;
        BackpanelR4.addBox(-3.0f, -0.5f, -3.5f, 5, 7, 1);
        setRotation(BackpanelR4, -0.0349066f, 0.0f, 0.0f);
        BackpanelL1 = new ModelRenderer(this, 0, 25).addBox(-2.0f, -0.5f, 2.5f, 5, 7, 1);
        setRotation(BackpanelL1, 0.0698132f, 0.0f, 0.0f);
        BackpanelL4 = new ModelRenderer(this, 0, 25).addBox(-2.0f, -0.5f, -3.5f, 5, 7, 1);
        setRotation(BackpanelL4, -0.0349066f, 0.0f, 0.0f);
        BackpanelL2 = new ModelRenderer(this, 96, 14).addBox(-2.0f, -0.5f, -2.5f, 5, 3, 5);
        setRotation(BackpanelL2, 0.0f, 0.0f, -0.1396263f);
        BackpanelL3 = new ModelRenderer(this, 116, 13).addBox(2.0f, 2.5f, -2.5f, 1, 4, 5);
        setRotation(BackpanelL3, 0.0f, 0.0f, -0.1396263f);
        bipedHeadwear.cubeList.clear();
        bipedHead.cubeList.clear();
        bipedHead.addChild(Helmet);
        bipedBody.cubeList.clear();
        bipedRightLeg.cubeList.clear();
        bipedLeftLeg.cubeList.clear();
        bipedBody.addChild(Mbelt);
        bipedBody.addChild(MbeltL);
        bipedBody.addChild(MbeltR);

        if (f >= 1.0f) {
            bipedBody.addChild(BeltL);
            bipedBody.addChild(BeltR);
            bipedBody.addChild(Chestplate);
            bipedBody.addChild(ChestOrnament);
            bipedBody.addChild(ChestClothR);
            bipedBody.addChild(ChestClothL);
            bipedBody.addChild(LegClothR);
            bipedBody.addChild(LegClothL);
            bipedBody.addChild(Backplate);
            bipedBody.addChild(CollarB);
            bipedBody.addChild(CollarR);
            bipedBody.addChild(CollarL);
            bipedBody.addChild(CollarF);
            bipedBody.addChild(Cloak1);
            bipedBody.addChild(Cloak2);
            bipedBody.addChild(Cloak3);
            bipedBody.addChild(CloakTL);
            bipedBody.addChild(CloakTR);
        }

        bipedRightArm.cubeList.clear();
        bipedRightArm.addChild(ShoulderR);
        bipedRightArm.addChild(ShoulderR1);
        bipedRightArm.addChild(ShoulderR2);
        bipedRightArm.addChild(ShoulderR3);
        bipedRightArm.addChild(ShoulderR4);
        bipedRightArm.addChild(ShoulderR5);
        bipedRightArm.addChild(GauntletR);
        bipedRightArm.addChild(GauntletR2);
        bipedRightArm.addChild(GauntletstrapR1);
        bipedRightArm.addChild(GauntletstrapR2);
        bipedLeftArm.cubeList.clear();
        bipedLeftArm.addChild(ShoulderL);
        bipedLeftArm.addChild(ShoulderL1);
        bipedLeftArm.addChild(ShoulderL2);
        bipedLeftArm.addChild(ShoulderL3);
        bipedLeftArm.addChild(ShoulderL4);
        bipedLeftArm.addChild(ShoulderL5);
        bipedLeftArm.addChild(GauntletL);
        bipedLeftArm.addChild(GauntletL2);
        bipedLeftArm.addChild(GauntletstrapL1);
        bipedLeftArm.addChild(GauntletstrapL2);
        bipedRightLeg.addChild(BackpanelR1);
        bipedRightLeg.addChild(BackpanelR2);
        bipedRightLeg.addChild(BackpanelR3);
        bipedRightLeg.addChild(BackpanelR4);
        bipedLeftLeg.addChild(BackpanelL1);
        bipedLeftLeg.addChild(BackpanelL2);
        bipedLeftLeg.addChild(BackpanelL3);
        bipedLeftLeg.addChild(BackpanelL4);
    }

    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        GlStateManager.pushMatrix();

        float a = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        float b = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        float c = Math.min(a, b);

        LegClothR.rotateAngleX = a - 0.1047198f;
        LegClothL.rotateAngleX = b - 0.1047198f;
        Cloak1.rotateAngleX = -c / 2.0f + 0.1396263f;
        Cloak2.rotateAngleX = -c / 2.0f + 0.3069452f;
        Cloak3.rotateAngleX = -c / 2.0f + 0.4465716f;

        if (isChild) {
            GlStateManager.scale(0.75F, 0.75F, 0.75F);
            GlStateManager.translate(0.0F, 16.0F * scale, 0.0F);
            bipedHead.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            bipedBody.render(scale);
            bipedRightArm.render(scale);
            bipedLeftArm.render(scale);
            bipedRightLeg.render(scale);
            bipedLeftLeg.render(scale);
            bipedHeadwear.render(scale);
        } else {
            GlStateManager.scale(1.01F, 1.01F, 1.01F);

            if (entity.isSneaking()) {
                GlStateManager.translate(0.0F, 0.2F, 0.0F);
            }

            bipedHead.render(scale);
            bipedBody.render(scale);
            bipedRightArm.render(scale);
            bipedLeftArm.render(scale);
            bipedRightLeg.render(scale);
            bipedLeftLeg.render(scale);
            bipedHeadwear.render(scale);
        }

        GlStateManager.popMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

