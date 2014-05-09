# Adapted from linux-imx.inc, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

DESCRIPTION = "Linux kernel for Blue Chip Technology RM3/RE3 boards (collectively known as Rx3)"

SRC_URI = "git://github.com/bluechiptechnology/Rx3_linux_3.0.35_4.0.0.git \
           file://defconfig"

LOCALVERSION = "-4.0.0+yocto"
SRCREV = "v4.0.0.4"


# GPU support patches
SRC_URI += "file://drm-vivante-Add-00-sufix-in-returned-bus-Id.patch \
            file://0001-ARM-7668-1-fix-memset-related-crashes-caused-by-rece.patch \
            file://0002-ARM-7670-1-fix-the-memset-fix.patch \
"

COMPATIBLE_MACHINE = "(mx6)"

