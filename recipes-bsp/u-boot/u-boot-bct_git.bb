require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b"
COMPATIBLE_MACHINE = "(bct-re3|bct-rm3)"

PROVIDES = "u-boot"

PV = "v2009.08+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/bluechiptechnology/Rx3_u-boot_2009.08_4.0.0.git"

S = "${WORKDIR}/git"

UBOOT_MAKE_TARGET = "u-boot.bin"

#Prevents problems trying to "strip" host tools
EXTRA_OEMAKE += 'HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx6)"
