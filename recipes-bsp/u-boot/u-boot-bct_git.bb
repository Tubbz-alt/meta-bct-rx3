require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=C7383A594871C03DA76B3707929D2919"
COMPATIBLE_MACHINE = "(bct-re3|bct-rm3)"

PROVIDES = "u-boot"

PV = "v2015.04+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/bluechiptechnology/u-boot-4.1.15-bctrx3.git"

S = "${WORKDIR}/git"

UBOOT_MAKE_TARGET = "u-boot.img SPL"

#Prevents problems trying to "strip" host tools
EXTRA_OEMAKE += 'HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"
