package com.enderdevelopment.plugin.abilities;

import org.bukkit.entity.Player;

public class CatAbilities {

    public static void activateAbility(Player player, int abilityNumber) {
        switch (abilityNumber) {
            case 1:
                // Ability 1 logic
                player.sendMessage("Activating ability 1...");
                break;
            case 2:
                // Ability 2 logic
                player.sendMessage("Activating ability 2...");
                break;
            default:
                player.sendMessage("Invalid ability number.");
        }
    }
}