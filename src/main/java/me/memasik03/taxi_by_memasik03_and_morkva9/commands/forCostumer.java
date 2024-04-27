package me.memasik03.taxi_by_memasik03_and_morkva9.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class forCostumer implements CommandExecutor {

    private String[] taxists = new String[] {
            "MorKva9",
            "BORODACH_"
    };

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sendToTaxists("Pitaras", sender);

        return false;
    }

    public void sendToTaxists(String message, CommandSender sender) {

        double senderX = Math.round(Bukkit.getPlayer(sender.getName()).getLocation().getX());
        double senderY = Math.round(Bukkit.getPlayer(sender.getName()).getLocation().getY());
        double senderZ = Math.round(Bukkit.getPlayer(sender.getName()).getLocation().getZ());
        double destinationX = 129;
        double destinationY = 72;
        double destinationZ = -369;
        double distanceX = 0;
        double distanceY = 0;
        double distanceZ = 0;
        double distanceAll = 0; 

        if (senderX > destinationX) {
            distanceX = senderX - destinationX;
        } else {
            distanceX = senderX + destinationX;
        };

        if (senderY > destinationY) {
            distanceY = senderY - destinationY;
        } else {
            distanceY = senderY + destinationY;
        };

        if (senderZ > destinationZ) {
            distanceZ = senderZ - destinationZ;
        } else {
            distanceZ = senderZ + destinationZ;
        };

        distanceAll = distanceX + distanceY + distanceZ;


        for (int i = 0; i < taxists.length; i++) {
            Bukkit.getPlayer(taxists[i]).sendMessage("Новый заказ от " + sender.getName() + "! Точка отправления: Х " + senderX + " Y "
                    + senderY + " Z " + senderZ + "Точка назначения: X " + destinationX + " Y " + destinationY + " Z " + distanceAll + "\n Принять заказ: /taxi accept" + sender.getName());
        }
    }
}

// кжл кайфует и почти нихуя не пишет (лох не знает джаву) (я тоже) (я тоже) (я
// тоже) (ne) (ano) (ja jsem krava-femboy mooo moo)