# Custom Server Utilities & Weapons

A lightweight Minecraft plugin designed for Spigot/Paper servers. It provides essential player utilities and introduces unique, overpowered (OP) custom weapons and tools to enhance the survival or PvP experience.


##  Features

* Help Command
* Easy access to the server spawn point.
* **OP Custom Gear:** Grants players powerful custom items like the Laser Pickaxe and status-inflicting weapons.

## Commands & Usage

Players can use the following commands in-game. 

| Command | Description | Base Item / Effect |
| :--- | :--- | :--- |
| `/help` | Displays the server welcome message and command list. | In-game information menu |
| `/spawn` | Teleports the player instantly to the server spawn. | Teleportation utility |
| `/laserpickaxe` | Gives the player an overpowered, high-efficiency Pickaxe. | Overpowered Tool |
| `/poisonblade` | Gives a custom sword that inflicts the **Poison** effect on hit enemies. | Combat / PvP Weapon |
| `/magicsword` | Gives the player a highly powerful, enchanted Magic Sword. | Overpowered Weapon |


##  Installation

To install this plugin on your Minecraft server:

1. Download the `.jar` file of the plugin.
2. Navigate to your server's root directory and open the `plugins/` folder.
3. Drop the `.jar` file into the folder.
4. Restart or reload your server (`/reload confirm`).

##  Code Overview (Help Command Example)

The in-game help menu uses standard chat formatting colors to stay neat and readable:

```java
sender.sendMessage("Hello Player.");
sender.sendMessage("You are on this awesome server of mine. I hope u have fun");
sender.sendMessage("§6===Commands=======");
sender.sendMessage("§e/help §7 - Shows this info");
sender.sendMessage("§e/spawn §7 - Takes u to the spawn");
sender.sendMessage("§e/laserpickaxe - gives u an op Pickaxe");
sender.sendMessage("§e/poisonblade - gives u a sword that gives the oponent poison");
sender.sendMessage("§e/magicsword - gives u an op Sword");
