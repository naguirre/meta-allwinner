inherit kernel
require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://github.com/ssvb/linux-sunxi.git;branch=20151207-embedded-lima-memtester-h3;protocol=http;nocheckout=1;name=machine"

LINUX_VERSION ?= "3.4.39"
LINUX_VERSION_EXTENSION_append = "-lichee"

SRCREV_machine = "589da2af30717333bf9a287dcb467a07e18c1472"

PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "sun8i"

# work around issue with binary objects in source tree
do_compile_prepend() {
  rm -rf ${B}/drivers/media/video/sunxi-vfe/lib
  mkdir -p ${B}/drivers/media/video/sunxi-vfe/lib
  ln -s ${S}/drivers/media/video/sunxi-vfe/lib/lib* ${B}/drivers/media/video/sunxi-vfe/lib/
}

KMACHINE ?= "${MACHINE}"
