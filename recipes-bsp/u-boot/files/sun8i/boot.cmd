setenv machid 1029
setenv bootargs console=ttyS0,115200 root=/dev/mmcblk0p2 rootwait panic=10
load mmc 0:1 0x43000000 script.bin
load mmc 0:1 0x40008000 uImage
bootm 0x40008000
