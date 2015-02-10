# Adapted from linux-imx.inc, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

DESCRIPTION = "Linux kernel for Blue Chip Technology RM3/RE3 boards (collectively known as Rx3)"

SRC_URI = "git://github.com/bluechiptechnology/Rx3_linux_3.0.35_4.0.0.git \
           file://defconfig"

LOCALVERSION = "-4.0.0+yocto"
SRCREV = "bd5e87b78431166c6b9bba26aed2f3ff51f89f05"

COMPATIBLE_MACHINE = "(mx6)"

