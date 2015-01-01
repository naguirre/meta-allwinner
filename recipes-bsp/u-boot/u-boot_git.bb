require u-boot.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(mele|meleg|olinuxino-a13|olinuxino-a10s|olinuxino-a10|olinuxino-a20|olinuxino-a20som|olinuxino-a20lime|olinuxino-a20lime2|cubieboard|cubieboard2|cubietruck)"

DEFAULT_PREFERENCE_mele= "1"
DEFAULT_PREFERENCE_meleg= "1"
DEFAULT_PREFERENCE_olinuxino-a13= "1"
DEFAULT_PREFERENCE_olinuxino-a10s= "1"
DEFAULT_PREFERENCE_olinuxino-a10= "1"
DEFAULT_PREFERENCE_olinuxino-a20= "1"
DEFAULT_PREFERENCE_olinuxino-a20som= "1"
DEFAULT_PREFERENCE_olinuxino-a20lime= "1"
DEFAULT_PREFERENCE_olinuxino-a20lime2= "1"
DEFAULT_PREFERENCE_cubieboard="1"
DEFAULT_PREFERENCE_cubieboard2="1"
DEFAULT_PREFERENCE_cubietruck="1"

SRC_URI = "git://git.denx.de/u-boot.git;branch=master"

PE = "1"
PV = "v2015.01+git${SRCPV}"

# Corresponds to tag v2015.01-rc3
SRCREV = "32fdf0e4d82bdca5d64d86330e461e59685f9959"


S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SPL_BINARY="u-boot-sunxi-with-spl.bin"

