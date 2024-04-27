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

        for (int i = 0; i < taxists.length; i++) {
            Bukkit.getPlayer(taxists[i]).sendMessage("Вас хочет " + sender.getName() + " на Х " + senderX + "Y "
                    + senderY + "Z " + senderZ + "\n Принять заказ: /taxi accept" + sender.getName());
        }
    }
}

// кжл кайфует и почти нихуя не пишет (лох не знает джаву) (я тоже) (я тоже) (я
// тоже) (ne) (ano)