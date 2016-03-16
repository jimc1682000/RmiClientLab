# RmiClientLab
This is a Java RMI Client Lab.
A RMI Client need to integrate to the RMI Server,therefore you might want to get Java RMI Server Lab as well.
Get RmiServerLab Here:
https://github.com/jimc1682000/RmiServerLab
Also notice that when you want to use my project in Eclipse, you need to create a new "Run Configurations", and setting VM arguments as

"-Djava.security.policy=file:${workspace_loc}/RMIClientLab/security.policy -Djava.rmi.server.codebase=file:${workspace_loc}/RMIServerLab/bin/tw/jimmy/lab/"
(without "")

in the Arguments tab.