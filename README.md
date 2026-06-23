# My first Minecraft Plugin

This is my first minecraft plugin it got a lot of features and custom items 


##  Features

* custom Commands
* **OP Custom Gear:** Gives Player really Op Custom Armour

## Commands & Usage

Players can use the following commands in-game. 


| `/help` | Displays the server welcome message and command list. | In-game information menu |
| `/spawn` | Teleports the player instantly to the server spawn. | Teleportation utility |
| `/laserpickaxe` | Gives the player an overpowered, high-efficiency Pickaxe. | Overpowered Tool |
| `/poisonblade` | Gives a custom sword that inflicts the **Poison** effect on hit enemies. | Combat / PvP Weapon |
| `/magicsword` | Gives the player a highly powerful, enchanted Magic Sword. | Overpowered Weapon |


##  Installation

To install this plugin on your Minecraft server:

1. Download the latest `.jar` file from the [Releases](https://github.com/YourUsername/YourRepo/releases) page.
2. Navigate to your server's root directory and open the `plugins/` folder.
3. Drop the `.jar` file into the folder.
4. Restart or reload your server (`/reload confirm`).


```java
sender.sendMessage("Hello Player.");
sender.sendMessage("You are on this awesome server of mine. I hope u have fun");
sender.sendMessage("§6===Commands=======");
sender.sendMessage("§e/help §7 - Shows this info");
sender.sendMessage("§e/spawn §7 - Takes u to the spawn");
sender.sendMessage("§e/laserpickaxe - gives u an op Pickaxe");
sender.sendMessage("§e/poisonblade - gives u a sword that gives the oponent poison");
sender.sendMessage("§e/magicsword - gives u an op Sword");
