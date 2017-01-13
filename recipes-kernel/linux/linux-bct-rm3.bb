# Adapted from linux-imx.inc, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DESCRIPTION = "Linux kernel for Blue Chip Technology RE3 boards"

SRC_URI = "git://github.com/bluechiptechnology/linux-4.1.15-bctre3.git;protocol=https file://defconfig"

SRCREV = "${AUTOREV}"

COMPATIBLE_MACHINE = "(mx6)"
